/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blobbygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author 641580
 */
public class Ajax {
     private int height, width, x, y, vx, vy, hp;
    private Rectangle bounds;
    private Color color;
    private final int SPEED = 7;
    private boolean alive;

public Ajax(int cWidth, int cHeight) {
        this.alive = true;
        this.x = randX();
        this.y = randY();
        this.vx = (int) (Math.random() * 5 + 1);
        this.vy = (int) (Math.random() * 5 + 1);
        this.width = (int) (Math.random() * 100);
        this.height = this.width;
        this.hp = 30;
        this.color = Color.RED;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
        
        
}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
 public void die() {
        this.alive = false;
        vx = 0;
        vy = 0;
        x = randX();
        y = randY();
    }
    
    public void move(String direction) {        
        if (direction.equals("right"))
            vx = SPEED;
        else if (direction.equals("left"))
            vx = -SPEED;
        else if (direction.equals("up"))
            vy = -SPEED;
        else if (direction.equals("down"))
            vy = SPEED;
    }
    
    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        g.fillOval(x, y, width, height);
    }
    
    public void attack() {
        
    }
    
    public void collect() {
        
    }
    
    public void update() {
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
     public int randX() {
        int rand = (int) (Math.random() * 590);
        return rand;
    }

    public int randY() {
        int rand = (int) (Math.random() * 790);
        return rand;
    }

    public void stop() {
        this.vx = 0;
        this.vy = 0;
    }
}
