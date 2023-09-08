package com.tencent.kinda.gen;

import java.util.ArrayList;

public final class TestRecorder {
    public ArrayList<TouchEvent> mValues;

    /* renamed from: mX */
    public float f2133mX;

    public TestRecorder() {
    }

    public TestRecorder(float f, ArrayList<TouchEvent> arrayList) {
        this.f2133mX = f;
        this.mValues = arrayList;
    }

    public ArrayList<TouchEvent> getValues() {
        return this.mValues;
    }

    public float getX() {
        return this.f2133mX;
    }

    public String toString() {
        return "TestRecorder{mX=" + this.f2133mX + ",mValues=" + this.mValues + "}";
    }
}
