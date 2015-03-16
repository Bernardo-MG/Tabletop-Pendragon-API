package com.wandrell.tabletop.pendragon.model.manor;

import com.wandrell.pattern.prototype.NewInstantiable;
import com.wandrell.tabletop.pendragon.model.inventory.Money;

public interface AnimalYearResult extends NewInstantiable {

    @Override
    public AnimalYearResult createNewInstance();

    public String getDescription();

    public Money getMoney();

    public String getPuppy();

    public Boolean isDying();

    public Boolean isHavingPuppies();

    public Boolean isProducingMoney();

}
