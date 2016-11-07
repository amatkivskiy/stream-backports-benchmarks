package com.amatkivskiy.streams.test;

public class SamplePoJo {
    public final String stringValue;
    public final int intValue;
    public final boolean booleanValue;

    public SamplePoJo(boolean booleanValue, String stringValue, int intValue) {
        this.booleanValue = booleanValue;
        this.stringValue = stringValue;
        this.intValue = intValue;
    }
}
