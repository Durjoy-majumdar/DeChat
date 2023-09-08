package com.tencent.kinda.gen;

public final class TouchEvent {
    public TouchAction mEvent;

    /* renamed from: mX */
    public float f339252mX;

    /* renamed from: mY */
    public float f339253mY;

    public TouchEvent() {
    }

    public TouchEvent(float f, float f2, TouchAction touchAction) {
        this.f339252mX = f;
        this.f339253mY = f2;
        this.mEvent = touchAction;
    }

    public TouchAction getEvent() {
        return this.mEvent;
    }

    public float getX() {
        return this.f339252mX;
    }

    public float getY() {
        return this.f339253mY;
    }

    public String toString() {
        return "TouchEvent{mX=" + this.f339252mX + ",mY=" + this.f339253mY + ",mEvent=" + this.mEvent + "}";
    }
}
