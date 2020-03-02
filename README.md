# Skeleton-Quest

This is a simple rougelike game where player has to defeat enemies and collect items to complete levels. It's main purpose was to practice Java, JavaFx and OOP paradigms.

# Screenshots

Level 1:

![tiles](github_resources/1.png)

Level 2:

![tiles](github_resources/2.png)

## Gameplay

Below are listed main features of the game

**PLAYER**

Expierence points, gained by killing enemies.

Health points, restored by potions and on level up.

Attack and defence points to calculate damage dealt and taken in fights.

Items, displayed in inventory.


**ENEMIES**

There are several types of enemies, each having different value of health, attack and defence points.

Every enemy moves in a random direction. 

Each type has it's own movement speed which was implemented using seperate threads for logic and GUI.


**ITEMS**

Keys: open doors.

Armor and weapon: currently do not increase player's stats (not yet implemented).

Potions: restore health when picked up.


**PORTALS**

Entrance to the next level.


**MAPS**

We have currently developed 2 levels:


## Opening the project

This is a Maven project, so you will need to open `pom.xml`.

The project is using JavaFX.  Use the `javafx` maven plugin to build and run the program.


## Specification
Java 11
JavaFX
Maven
Threads

![tiles](src/main/resources/tiles.png)
