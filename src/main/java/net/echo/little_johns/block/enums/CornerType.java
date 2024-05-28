package net.echo.little_johns.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum CornerType implements StringIdentifiable {
    NORT_WEST("north_west"),
    NORTH_EAST("north_east"),
    SOUTH_WEST("south_west"),
    SOUTH_EAST("south_east"),

    NORTH("north"),
    SOUTH("south"),
    WEST("west"),
    EAST("east"),

    NORTH_WEST_SOUTH_EAST("north_west_south_east"),
    NORTH_EAST_SOUTH_WEST("north_east_south_west"),

    FULL("full");

    private final String name;

    private CornerType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
