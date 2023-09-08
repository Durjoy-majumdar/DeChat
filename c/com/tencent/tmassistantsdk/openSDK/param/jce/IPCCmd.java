package com.tencent.tmassistantsdk.openSDK.param.jce;

import java.io.Serializable;

public final class IPCCmd implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final IPCCmd BatchDownloadAction = new IPCCmd(9, 9, "BatchDownloadAction");
    public static final IPCCmd Empty = new IPCCmd(0, 0, "Empty");
    public static final IPCCmd GetDownloadProgress = new IPCCmd(3, 3, "GetDownloadProgress");
    public static final IPCCmd GetDownloadState = new IPCCmd(2, 2, "GetDownloadState");
    public static final IPCCmd OperateDownloadTask = new IPCCmd(1, 1, "OperateDownloadTask");
    public static final IPCCmd QueryDownloadTask = new IPCCmd(4, 4, "QueryDownloadTask");
    public static final IPCCmd QueryLoginInfo = new IPCCmd(6, 6, "QueryLoginInfo");
    public static final IPCCmd QueryLoginState = new IPCCmd(7, 7, "QueryLoginState");
    public static final IPCCmd ServiceFreeAction = new IPCCmd(8, 8, "ServiceFreeAction");
    public static final IPCCmd URIAction = new IPCCmd(5, 5, "URIAction");
    public static final int _BatchDownloadAction = 9;
    public static final int _Empty = 0;
    public static final int _GetDownloadProgress = 3;
    public static final int _GetDownloadState = 2;
    public static final int _OperateDownloadTask = 1;
    public static final int _QueryDownloadTask = 4;
    public static final int _QueryLoginInfo = 6;
    public static final int _QueryLoginState = 7;
    public static final int _ServiceFreeAction = 8;
    public static final int _URIAction = 5;
    private static IPCCmd[] __values = new IPCCmd[10];
    private String __T;
    private int __value;

    static {
        Class<IPCCmd> cls = IPCCmd.class;
    }

    private IPCCmd(int i, int i2, String str) {
        new String();
        this.__T = str;
        this.__value = i2;
        __values[i] = this;
    }

    public static IPCCmd convert(int i) {
        int i2 = 0;
        while (true) {
            IPCCmd[] iPCCmdArr = __values;
            if (i2 >= iPCCmdArr.length) {
                return null;
            }
            if (iPCCmdArr[i2].value() == i) {
                return __values[i2];
            }
            i2++;
        }
    }

    public String toString() {
        return this.__T;
    }

    public int value() {
        return this.__value;
    }

    public static IPCCmd convert(String str) {
        int i = 0;
        while (true) {
            IPCCmd[] iPCCmdArr = __values;
            if (i >= iPCCmdArr.length) {
                return null;
            }
            if (iPCCmdArr[i].toString().equals(str)) {
                return __values[i];
            }
            i++;
        }
    }
}
