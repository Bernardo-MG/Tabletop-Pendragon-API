package com.wandrell.tabletop.business.model.pendragon.inventory;

import com.wandrell.pattern.prototype.NewInstantiable;

public interface Money extends NewInstantiable {

    @Override
    public Money createNewInstance();

    public Integer getDenarii();

    public Integer getLibra();

    public void setDenarii(final Integer denarii);

    public void setLibra(final Integer libra);

}
