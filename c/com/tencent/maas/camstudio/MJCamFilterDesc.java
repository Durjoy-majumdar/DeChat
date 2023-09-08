package com.tencent.maas.camstudio;

public class MJCamFilterDesc {
    private String filterID;
    private float intensity;
    private boolean isFilterEnabled;
    private String lutImageFilePath;

    public MJCamFilterDesc() {
        this.isFilterEnabled = false;
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

    public MJCamFilterDesc(String str, float f) {
        this.isFilterEnabled = true;
        this.filterID = str;
        this.intensity = f;
    }

    public MJCamFilterDesc(String str, float f, boolean z) {
        this.filterID = str;
        this.intensity = f;
        this.isFilterEnabled = z;
    }

    public MJCamFilterDesc(String str, String str2, float f, boolean z) {
        this.filterID = str;
        this.lutImageFilePath = str2;
        this.intensity = f;
        this.isFilterEnabled = z;
    }
}
