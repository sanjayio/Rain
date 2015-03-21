/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.rain.level;
import java.util.Random;

/**
 *
 * @author sanjay kumar
 */
public class RandomLevel extends Level{
    
    private static final Random random = new Random();

    public RandomLevel(int width, int height) {
        super(width, height);
        generateLevel();
    }
    
    @Override
    protected void generateLevel() {
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                tiles[x + y * width] = random.nextInt(4);
            }
        }
    }
}
