package com.libgdx.shooter.entities.items;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.libgdx.shooter.entities.Player;

/**
 * Created by Conal on 08/11/2015.
 */
public class Medal extends com.libgdx.shooter.entities.items.Item {

    public Medal(){
        super();
    }

    @Override
    protected void setPickupSound(){
        pickupSound = Gdx.audio.newSound(Gdx.files.internal("data/Sound/pickupMedal.wav"));
    }

    @Override
    protected void setTexture(){
        texture = new Texture(Gdx.files.internal("data/medal.png"));
    }

    @Override
    public void attachToPlayer(Player player) {
        pickupSound.play();
        player.addPoints(1000);
        System.out.println("MEDAL PICKUP");
    }
}
