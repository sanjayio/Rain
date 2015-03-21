/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.rain.entity.mob;

import com.sanjay.rain.entity.Entity;
import com.sanjay.rain.graphics.Sprite;

/**
 *
 * @author sanjay kumar
 */
public abstract class Mob extends Entity{
    
    protected Sprite sprite;
    protected int dir = 0; //0 north 1 east 2 south 3 west
    protected boolean moving = false;
    
    public void move(int xa, int ya) {
        if(xa > 0) dir = 1;
        if(xa < 0) dir = 3;
        if(ya > 0) dir = 2;
        if(ya < 0) dir = 0;
        
        if(!collision()) {
            x += xa;
            y += ya;
        }

    }
    
    @Override
    public void update() {
        
    }
    
    public void render() {
        
    }
    
    private boolean collision() {
        return false;
    }
}
