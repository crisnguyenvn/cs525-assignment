package edu.mum.cs.cs525.labs.skeleton.decorator;

import edu.mum.cs.cs525.labs.skeleton.strategy.InterestStrategy;

public class LoyaltyPromotionInterestDecorator extends PromotionInterestDecorator {
    private static final double ADD_ON_INTEREST_RATE = 0.03;

    public LoyaltyPromotionInterestDecorator(InterestStrategy baseInterestStrategy) {
        super(baseInterestStrategy);
    }

    @Override
    public double calculateInterest(double balance) {
        return getBaseInterestStrategy().calculateInterest(balance) * ADD_ON_INTEREST_RATE;
    }

    @Override
    public String getDescription() {
        return STR."""
        \{super.getDescription()}
        then decorated: LoyaltyPromotionInterest""";
    }
}
