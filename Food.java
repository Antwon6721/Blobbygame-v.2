package blobbygame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author 641580
 */
public class Food {
    private int height, width, x, y;
    private Rectangle bounds;
    private Color color;
    
    //Constructor
    public Food() {
        this.x = randX();
        this.y = randY();
        this.width = 6;
        this.height = 6;
        this.color = Color.YELLOW;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    public void update(){
         this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    
    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
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
    
    //Methods
    public void die() {
        x = randX();
        y = randY();
        width = 6;
        height = 6;
    }
    
    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        g.fillOval(x, y, 10, 10);
    }
    
    public int randX() {
        int rand = (int) (Math.random() * 590);
        return rand;
    }

    public int randY() {
        int rand = (int) (Math.random() * 790);
        return rand;
    }
}
