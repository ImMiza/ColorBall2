package fr.miza.utils.physics;

import fr.miza.utils.GameColor;

public interface Structure extends Gravity, Solid {

    public Location getLocation();

    public void setLocation(Location loc);

    public GameColor getColor();

    public void setColor(GameColor color);

}
