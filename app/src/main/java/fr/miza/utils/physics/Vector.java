package fr.miza.utils.physics;

public class Vector {

    private float x;
    private float y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        this(0.0f, 0.0f);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void addX(float x) {
        this.x += x;
    }

    public void substractX(float x) {
        this.x -= x;
    }

    public void addY(float y) {
        this.x += y;
    }

    public void substractY(float y) {
        this.x -= y;
    }

    public void addVector(Vector v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void substractVector(Vector v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public double getNorme() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
