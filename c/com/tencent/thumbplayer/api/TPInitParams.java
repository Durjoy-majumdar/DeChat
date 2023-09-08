package com.tencent.thumbplayer.api;

public class TPInitParams {
    /* access modifiers changed from: private */
    public String mDeviceName;
    /* access modifiers changed from: private */
    public String mGuid;
    /* access modifiers changed from: private */
    public int mPlatform;

    public static class Builder {
        private String mDeviceName = "";
        private String mGuid = "";
        private int mPlatform = 0;

        public TPInitParams build() {
            TPInitParams tPInitParams = new TPInitParams();
            int unused = tPInitParams.mPlatform = this.mPlatform;
            String unused2 = tPInitParams.mGuid = this.mGuid;
            String unused3 = tPInitParams.mDeviceName = this.mDeviceName;
            return tPInitParams;
        }

        public Builder setDeviceName(String str) {
            this.mDeviceName = str;
            return this;
        }

        public Builder setGuid(String str) {
            this.mGuid = str;
            return this;
        }

        public Builder setPlatform(int i) {
            this.mPlatform = i;
            return this;
        }
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public String getGuid() {
        return this.mGuid;
    }

    public int getPlatform() {
        return this.mPlatform;
    }

    private TPInitParams() {
        this.mGuid = "";
        this.mPlatform = 0;
        this.mDeviceName = "";
    }
}
