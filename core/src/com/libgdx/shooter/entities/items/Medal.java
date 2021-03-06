package com.libgdx.shooter.entities.items;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.libgdx.shooter.entities.Player;
import com.libgdx.shooter.gamestates.GameState;

/**
 * Created by Conal on 08/11/2015.
 */
public class Medal extends com.libgdx.shooter.entities.items.Item {

    public Medal(){
        super();
    }


    @Override
    protected void setPickupSound(){
        pickupSound = GameState.assetManager.get("data/Sound/pickupMedal.wav");
    }


    @Override
    protected void setTexture(){
        texture = new Texture(Gdx.files.internal("data/pickupMedal.png"));
    }

    @Override
    public void use(Player p){
        p.addMedal();
    }
}
