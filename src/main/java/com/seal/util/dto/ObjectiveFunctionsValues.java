package com.seal.util.dto;

/**
 * Created by seal on 4/4/2017.
 */
public class ObjectiveFunctionsValues {
    public final long keyPress;
    public final long handAlternation;
    public final double distance;
    public final double bigStepDistance;
    public final long hitDirection;

    private ObjectiveFunctionsValues(long keyPress, long handAlternation, double distance,
                                     double bigStepDistance, long hitDirection) {
        this.keyPress = keyPress;
        this.handAlternation = handAlternation;
        this.distance = distance;
        this.bigStepDistance = bigStepDistance;
        this.hitDirection = hitDirection;
    }

    //--------------- toString---------------//

    @Override
    public String toString() {
        return "ObjectiveFunctionsValues{" +
                "keyPress=" + keyPress +
                ", handAlternation=" + handAlternation +
                ", distance=" + distance +
                ", bigStepDistance=" + bigStepDistance +
                ", hitDirection=" + hitDirection +
                '}';
    }

    //--------------- Builder ---------------//

    public static class Builder {
        long keyPress;
        long handAlternation;
        double distance;
        double bigStepDistance;
        long hitDirection;

        public Builder setKeyPress(long keyPress) {
            this.keyPress = keyPress;
            return this;
        }

        public Builder setHandAlternation(long handAlternation) {
            this.handAlternation = handAlternation;
            return this;
        }

        public Builder setDistance(double distance) {
            this.distance = distance;
            return this;
        }

        public Builder setBigStepDistance(double bigStepDistance) {
            this.bigStepDistance = bigStepDistance;
            return this;
        }

        public Builder setHitDirection(long hitDirection) {
            this.hitDirection = hitDirection;
            return this;
        }

        public ObjectiveFunctionsValues build() {
            return new ObjectiveFunctionsValues(keyPress, handAlternation, distance, bigStepDistance, hitDirection);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}