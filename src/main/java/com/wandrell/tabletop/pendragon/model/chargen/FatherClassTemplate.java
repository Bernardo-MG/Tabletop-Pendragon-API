package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Collection;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface FatherClassTemplate extends NewInstantiable {

    @Override
    public FatherClassTemplate createNewInstance();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getDirectedTraitsBase();

    public Dice getMoney();

    public String getName();

    public Integer getNonCombatSkillBonus();

    public Collection<SkillBox> getSkillsGroup();

    public Integer getSkillsGroupBonusPoints();

    public Integer getSkillsGroupDividePoints();

    public Integer getSkillsPoints();

    public Collection<SkillBox> getSpecialtySkills();

}
