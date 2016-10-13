package com.libgdx.shooter.entities.bullets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.libgdx.shooter.gamestates.GameState;

/**
 * Created by Conal on 12/11/2015.
 */
public class Laser extends Bullet {

    public Laser() {
        super();
        damage = 100;
        maxSpeed = 700f;
    }

    @Override
    protected void setHitSound() {
        hitSound = GameState.assetManager.get("data/Sound/hitSoundLaser.wav");
    }

    @Override
    protected void setTexture() {
        texture = new Texture(Gdx.files.internal("data/laserRed.png"));
    }
}
