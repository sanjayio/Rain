/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.rain.graphics;

/**
 *
 * @author sanjay kumar
 */
public class Sprite {
    
    public final int SIZE;
    private int x, y;
    public int[] pixels;
    private Spritesheet sheet;
    
    public static Sprite grass= new Sprite(16, 0, 0, Spritesheet.tiles1);
    public static Sprite voidSprite = new Sprite(16, 0);
    
    public static Sprite player_forward = new Sprite(32, 0, 5, Spritesheet.tiles1);
    public static Sprite player_back = new Sprite(32, 2, 5, Spritesheet.tiles1);
    public static Sprite player_side = new Sprite(32, 3, 5, Spritesheet.tiles1);
    
    public static Sprite player_forward_1 = new Sprite(32, 0, 6, Spritesheet.tiles1);
    public static Sprite player_forward_2 = new Sprite(32, 0, 7, Spritesheet.tiles1);
    
    public static Sprite player_side_1 = new Sprite(32, 3, 6, Spritesheet.tiles1);
    public static Sprite player_side_2 = new Sprite(32, 3, 7, Spritesheet.tiles1);
    
    public static Sprite player_back_1 = new Sprite(32, 2, 6, Spritesheet.tiles1);
    public static Sprite player_back_2 = new Sprite(32, 2, 7, Spritesheet.tiles1);
    
    public Sprite(int size, int x, int y, Spritesheet sheet) {
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        this.x = x * size;
        this.y = y * size;
        this.sheet = sheet;  
        load();
    }
    
    public Sprite(int size, int colour) {
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        setColour(colour);
    }
    
    private void load() {
        for(int y = 0; y < SIZE; y++) {
            for(int x = 0; x < SIZE; x++) {
                pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
            }
        }
    }

    private void setColour(int colour) {
        for(int i = 0; i < SIZE * SIZE; i++) {
            pixels[i] = colour;
        }
    }
}
