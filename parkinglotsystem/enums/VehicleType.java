package parkinglotsystem.enums;

import parkinglotsystem.strategies.PricingStrategy;
import parkinglotsystem.strategies.RatePricingStategy;

public enum  VehicleType {
    FOUR_WHEELER(new RatePricingStategy(30)),
    TWO_WHEELER(new RatePricingStategy(30)),
    HEAVY_VEHICLE(new RatePricingStategy(30)),
    OTHERS(new RatePricingStategy(30));

    PricingStrategy strategy;

    VehicleType(PricingStrategy strategy){
        this.strategy = strategy;
    }

    public PricingStrategy getPricingStrategy(){
        return this.strategy;
    }
}
