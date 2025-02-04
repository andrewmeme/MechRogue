package deco2800.thomas.cutscenes;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;


/**
 * the fragments of cutScene: getting orbs
 * @Author Martin Gao
 */
public class OrbFragment extends Actor {
    // for displaying the fragment
    private TextureRegion drawRegion;

    public OrbFragment(TextureRegion drawRegion){
        super();
        this.drawRegion = drawRegion;
        // set both with and height of this fragment as same as the size of draw region
        setSize(this.drawRegion.getRegionWidth(), this.drawRegion.getRegionHeight());

    }

    /**
     * set new size of draw region
     * @param newDrawRegion a new size of TextureRegion is provided
     */
    public void setDrawRegion(TextureRegion newDrawRegion){

        this.drawRegion = newDrawRegion;
        // reset the width and height
        setSize(this.drawRegion.getRegionWidth(), this.drawRegion.getRegionHeight());
    }

    /**
     * get the current draw region
     * @return current draw region size
     */
    public TextureRegion getDrawRegion(){
        return drawRegion;
    }

    /**
     * set the render time step
     * @param timeStep a time interval from the last frame to the next
     */
    public void act(float timeStep){
        super.act(timeStep);
    }

    /**
     *
     * @param batch sprite batch
     * @param parentTransparency the transparency of parent node
     */
    public void draw(Batch batch, float parentTransparency){

        super.draw(batch,parentTransparency);

        if (drawRegion == null||!this.isVisible()){
            return ;
        }else {
            /**
             * draw the texture region, the position (X and Y), the zoom and rotation
             * fulcrum，width and height, zoom proportion (ScaleX and ScaleY), and the
             * rotation angle
             */
            batch.draw(this.drawRegion,
                    getX(), getY(),
                    getOriginX(), getOriginY(),
                    getWidth(), getHeight(),
                    getScaleX(), getScaleY(),
                    getRotation()
            );
        }

    }

}
