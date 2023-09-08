package com.tencent.xweb;

public interface IProfilerController {
    void forceEnableFrameCostProfile(boolean z);

    void forceFlushCategory(String str);

    void initProfile();

    void setAllKindsFpsProfileEnable(boolean z);

    void setProfileConfig(String str, int i, int i2, boolean z);

    boolean setProfileResultCallback(String str, IProfileResultCallback iProfileResultCallback);
}
