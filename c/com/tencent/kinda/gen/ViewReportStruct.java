package com.tencent.kinda.gen;

public final class ViewReportStruct {
    public int mBgColor;
    public boolean mCheckBtnNoResponse;
    public boolean mCheckColor;
    public boolean mCheckViewExposure;
    public String mCustomKey;
    public ReportEvent mEvent;
    public String mViewId;

    public ViewReportStruct() {
    }

    public ViewReportStruct(String str, boolean z, boolean z2, boolean z3, int i, ReportEvent reportEvent, String str2) {
        this.mViewId = str;
        this.mCheckViewExposure = z;
        this.mCheckBtnNoResponse = z2;
        this.mCheckColor = z3;
        this.mBgColor = i;
        this.mEvent = reportEvent;
        this.mCustomKey = str2;
    }

    public int getBgColor() {
        return this.mBgColor;
    }

    public boolean getCheckBtnNoResponse() {
        return this.mCheckBtnNoResponse;
    }

    public boolean getCheckColor() {
        return this.mCheckColor;
    }

    public boolean getCheckViewExposure() {
        return this.mCheckViewExposure;
    }

    public String getCustomKey() {
        return this.mCustomKey;
    }

    public ReportEvent getEvent() {
        return this.mEvent;
    }

    public String getViewId() {
        return this.mViewId;
    }

    public String toString() {
        return "ViewReportStruct{mViewId=" + this.mViewId + ",mCheckViewExposure=" + this.mCheckViewExposure + ",mCheckBtnNoResponse=" + this.mCheckBtnNoResponse + ",mCheckColor=" + this.mCheckColor + ",mBgColor=" + this.mBgColor + ",mEvent=" + this.mEvent + ",mCustomKey=" + this.mCustomKey + "}";
    }
}
