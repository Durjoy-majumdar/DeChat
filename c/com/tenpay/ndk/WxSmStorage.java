package com.tenpay.ndk;

public class WxSmStorage {
    private static volatile WxSmStorage instance;
    private FitScUtil fitScUtil;

    private WxSmStorage() {
        this.fitScUtil = null;
        this.fitScUtil = new FitScUtil();
    }

    public static void freeInstance() {
        if (instance != null) {
            instance.release();
            instance = null;
        }
    }

    public static WxSmStorage getInstance() {
        if (instance == null) {
            synchronized (WxSmStorage.class) {
                if (instance == null) {
                    instance = new WxSmStorage();
                }
            }
        }
        return instance;
    }

    private void release() {
        FitScUtil fitScUtil2 = this.fitScUtil;
        if (fitScUtil2 != null) {
            fitScUtil2.release();
            this.fitScUtil = null;
        }
    }

    public boolean clearAllValue() {
        return this.fitScUtil.clearAllValue();
    }

    public boolean clearValue(String str) {
        return this.fitScUtil.clearValue(str);
    }

    public int getLastError() {
        return this.fitScUtil.getLastError();
    }

    public byte[] getValue(String str) {
        return this.fitScUtil.getValue(str);
    }

    public String getVersion() {
        return this.fitScUtil.getVersion();
    }

    public boolean hasValue(String str) {
        return this.fitScUtil.hasValue(str);
    }

    public boolean init(String str, String str2, String str3, String str4) {
        boolean init;
        synchronized (FitScUtil.sm2Lock) {
            init = this.fitScUtil.init(str, str2, str3, str4);
        }
        return init;
    }

    public boolean setValue(String str, byte[] bArr) {
        return this.fitScUtil.setValue(str, bArr);
    }
}
