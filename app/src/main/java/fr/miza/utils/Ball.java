package fr.miza.utils;

import fr.miza.utils.physics.Location;
import fr.miza.utils.physics.Structure;
import fr.miza.utils.physics.Vector;

public class Ball implements Structure {

    private float width;
    private float height;
    private Location location;
    private Vector vector;
    private GameColor color;

    public Ball(Location location, GameColor color) {
        this.width = 20.0f;
        this.height = 20.0f;
        this.location = location;
        this.vector = new Vector();
        this.color = color;
    }

    public Ball(float posX, float posY, GameColor color) {
        this(new Location(posX, posY), color);
    }

    public Ball() {
        this(0.0f, 0.0f, GameColor.RED);
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location loc) {
        this.location = loc;
    }

    @Override
    public GameColor getColor() {
        return color;
    }

    @Override
    public void setColor(GameColor color) {
        this.color = color;
    }

    @Override
    public Vector getVector() {
        return vector;
    }

    @Override
    public void setVector(Vector v) {
        this.vector = v;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
