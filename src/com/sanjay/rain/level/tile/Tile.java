/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.rain.level.tile;

import com.sanjay.rain.graphics.Screen;
import com.sanjay.rain.graphics.Sprite;

/**
 *
 * @author sanjay kumar
 */
public class Tile {
    public int x, y;
    public Sprite sprite;
    
    public static Tile grass = new GrassTile(Sprite.grass);
    public static Tile voidTile = new voidTile(Sprite.voidSprite);
    
    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }
    
    public void render(int x, int y, Screen screen) {
        
    }
    
    public boolean solid() {
        return false;
    }
}
