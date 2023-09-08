package com.tencent.kinda.gen;

public final class BindCardContext {
    public String mBindCardUuid;
    public String mDeviceName;
    public String mDeviceType;

    public BindCardContext() {
    }

    public BindCardContext(String str, String str2, String str3) {
        this.mBindCardUuid = str;
        this.mDeviceName = str2;
        this.mDeviceType = str3;
    }

    public String getBindCardUuid() {
        return this.mBindCardUuid;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public String toString() {
        return "BindCardContext{mBindCardUuid=" + this.mBindCardUuid + ",mDeviceName=" + this.mDeviceName + ",mDeviceType=" + this.mDeviceType + "}";
    }
}
