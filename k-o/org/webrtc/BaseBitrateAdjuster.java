package org.webrtc;

class BaseBitrateAdjuster implements BitrateAdjuster {
    public int targetBitrateBps;
    public double targetFramerateFps;

    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    public void reportEncodedFrame(int i) {
    }

    public void setTargets(int i, double d) {
        this.targetBitrateBps = i;
        this.targetFramerateFps = d;
    }
}
