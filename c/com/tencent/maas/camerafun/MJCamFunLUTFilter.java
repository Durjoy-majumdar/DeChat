package com.tencent.maas.camerafun;

@Deprecated
public class MJCamFunLUTFilter {
    private String filterID;
    private float intensity;
    private boolean isFilterEnabled;
    private String lutImageFilePath;

    public MJCamFunLUTFilter() {
    }

    public String getFilterID() {
        return this.filterID;
    }

    public float getIntensity() {
        return this.intensity;
    }

    public String getLutImageFilePath() {
        return this.lutImageFilePath;
    }

    public boolean isFilterEnabled() {
        return this.isFilterEnabled;
    }

    public void setFilterEnabled(boolean z) {
        this.isFilterEnabled = z;
    }

    public void setFilterID(String str) {
        this.filterID = str;
    }

    public void setIntensity(float f) {
        this.intensity = f;
    }

    public void setLutImageFilePath(String str) {
        this.lutImageFilePath = str;
    }

    public MJCamFunLUTFilter(String str, String str2, float f, boolean z) {
        this.filterID = str;
        this.lutImageFilePath = str2;
        this.intensity = f;
        this.isFilterEnabled = z;
    }
}
