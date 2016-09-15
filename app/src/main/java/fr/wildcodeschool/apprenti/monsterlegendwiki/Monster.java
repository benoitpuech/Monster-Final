package fr.wildcodeschool.apprenti.monsterlegendwiki;

import java.io.Serializable;

/**
 * Created by apprenti on 11/09/16.
 */
@SuppressWarnings("serial")
public class Monster implements Serializable {

    private String element;
    private String name;
    private String life;private String power;private String speed;private String stamina;
    private int drawableEgg;private int drawableForm;private int drawableElement;


    public String getName() {   return name;   }

    public String getLife() {    return life;   }

    public String getPower() {    return power;   }

    public String getSpeed() {     return speed;  }

    public String getStamina() {   return stamina;   }

    public int getDrawableEgg() { return drawableEgg;   }

    public int getDrawableForm() {    return drawableForm;
    }
    public String getElement() { return element;   }

    public int getDrawableElement() {return drawableElement;}





    public Monster(String pElement,String pNname,String pLife,String pPower,String pSpeed,String pStamina,int egg,int form,int drawableElement){


        this.element=pElement;this.name= pNname;this.life=pLife;this.power=pPower;this.speed=pSpeed;this.stamina=pStamina;
        this.drawableEgg= egg;this.drawableForm=form;this.drawableElement=drawableElement;



    }

}
