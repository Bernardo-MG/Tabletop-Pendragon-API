package com.wandrell.tabletop.pendragon.model.chargen;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.skill.NameAndDescriptor;

public interface HomelandTemplate {

    public Collection<NameAndDescriptor> getDirectedTraits();

    public String getName();

    public Collection<NameAndDescriptor> getPassions();

    public Map<NameAndDescriptor, Integer> getSkills();

    public Map<String, Integer> getSpecialtySkills();

    public Map<String, Integer> getTraits();

}
