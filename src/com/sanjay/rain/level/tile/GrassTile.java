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
public class GrassTile extends Tile{

    public GrassTile(Sprite sprite) {
        super(sprite);
    }
    
    @Override
    public void render(int x, int y, Screen screen) {
        //do render stuff here.
        screen.renderTile(x << 4, y << 4, this);
    }
    
}
