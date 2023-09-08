package com.tencent.thumbplayer.core.richmedia;

public class TPNativeRichMediaFeature {
    private String[] mBinding = new String[0];
    private String mFeatureType;
    private boolean mIsSelected = false;

    public String[] getBinding() {
        return this.mBinding;
    }

    public String getFeatureType() {
        return this.mFeatureType;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public void setBinding(String[] strArr) {
        this.mBinding = strArr;
    }

    public void setFeatureType(String str) {
        this.mFeatureType = str;
    }

    public void setSelected(boolean z) {
        this.mIsSelected = z;
    }
}
