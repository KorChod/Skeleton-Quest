package com.codecool.quest.logic.items;

import com.codecool.quest.logic.Cell;
import com.codecool.quest.logic.Drawable;
import com.codecool.quest.logic.actors.Player;

public abstract class Item implements Drawable {
    private Cell cell;
    private String description;
    private String tileName;

    public Item(Cell cell,String tileName, String description) {
        this.cell = cell;
        this.cell.setItem(this);
        this.description = description;
        this.tileName = tileName;
    }

    public Cell getCell() {
        return cell;
    }

    public int getX() {
        return cell.getX();
    }

    public int getY() {
        return cell.getY();
    }

    public String getDescription() {
        return description;
    }


    public  boolean useItem(Player player){
      return false;
    };
}
