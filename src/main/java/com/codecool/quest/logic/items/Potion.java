package com.codecool.quest.logic.items;

import com.codecool.quest.logic.Cell;
import com.codecool.quest.logic.actors.Player;

public class Potion extends Item {
    private String tileName;
    private int healthForTakingPotion = 50;
    public Potion(Cell cell, String tileName, String description) {
        super(cell, tileName, description);
        this.tileName = tileName;
    }

    @Override
    public boolean useItem(Player player) {
        player.setHealth(player.getHealth() + healthForTakingPotion);
        return true;
    }

    @Override
    public String getTileName() {
        return tileName;
    }
}
