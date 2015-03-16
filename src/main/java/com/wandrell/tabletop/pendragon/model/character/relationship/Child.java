package com.wandrell.tabletop.pendragon.model.character.relationship;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.character.Gender;

public interface Child extends NewInstantiable {

    @Override
    public Child createNewInstance();

    public Gender getGender();

    public String getName();

    public Integer getYearBorn();

    public Integer getYearDeath();

}
