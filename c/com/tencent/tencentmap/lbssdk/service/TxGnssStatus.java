package com.tencent.tencentmap.lbssdk.service;

public class TxGnssStatus {
    public float[] mAzimuths;
    public float[] mCarrierFrequencies;
    public float[] mCn0DbHzs;
    public int[] mConstellationType;
    public float[] mElevations;
    public int mSvCount;
    public int[] mSvid;

    public float[] getmAzimuths() {
        return this.mAzimuths;
    }

    public float[] getmCarrierFrequencies() {
        return this.mCarrierFrequencies;
    }

    public float[] getmCn0DbHzs() {
        return this.mCn0DbHzs;
    }

    public int[] getmConstellationType() {
        return this.mConstellationType;
    }

    public float[] getmElevations() {
        return this.mElevations;
    }

    public int getmSvCount() {
        return this.mSvCount;
    }

    public int[] getmSvid() {
        return this.mSvid;
    }

    public void setmAzimuths(float[] fArr) {
        this.mAzimuths = fArr;
    }

    public void setmCarrierFrequencies(float[] fArr) {
        this.mCarrierFrequencies = fArr;
    }

    public void setmCn0DbHzs(float[] fArr) {
        this.mCn0DbHzs = fArr;
    }

    public void setmConstellationType(int[] iArr) {
        this.mConstellationType = iArr;
    }

    public void setmElevations(float[] fArr) {
        this.mElevations = fArr;
    }

    public void setmSvCount(int i) {
        this.mSvCount = i;
    }

    public void setmSvid(int[] iArr) {
        this.mSvid = iArr;
    }
}
