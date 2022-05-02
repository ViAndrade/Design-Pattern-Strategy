package com.company;

public class MediaGeometrica implements ICalcMedia{
    @Override
    public float Media(float P1, float P2) {
        return (float) Math.sqrt(P1 * P2);
    }
}
