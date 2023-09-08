package com.tencent.kinda.framework.app;

public class TestMeasure {
    public static final String TAG = "TestMeasure";
    public long valLayout = 0;
    public long valMeasure = 0;

    public void reset() {
        this.valMeasure = 0;
        this.valLayout = 0;
    }

    public String result() {
        return String.format("result valMeasure:%s valLayout:%s total:%s", new Object[]{Long.valueOf(this.valMeasure), Long.valueOf(this.valLayout), Long.valueOf(this.valLayout + this.valMeasure)});
    }
}
