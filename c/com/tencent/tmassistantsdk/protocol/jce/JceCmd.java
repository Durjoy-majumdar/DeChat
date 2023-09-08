package com.tencent.tmassistantsdk.protocol.jce;

import java.io.Serializable;

public final class JceCmd implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final JceCmd Empty = new JceCmd(0, 0, "Empty");
    public static final JceCmd GetAppSimpleDetail = new JceCmd(5, 5, "GetAppSimpleDetail");
    public static final JceCmd GetAppUpdate = new JceCmd(3, 3, "GetAppUpdate");
    public static final JceCmd GetSettings = new JceCmd(2, 2, "GetSettings");
    public static final JceCmd ReportApkFileInfo = new JceCmd(4, 4, "ReportApkFileInfo");
    public static final JceCmd ReportLog = new JceCmd(1, 1, "ReportLog");
    public static final int _Empty = 0;
    public static final int _GetAppSimpleDetail = 5;
    public static final int _GetAppUpdate = 3;
    public static final int _GetSettings = 2;
    public static final int _ReportApkFileInfo = 4;
    public static final int _ReportLog = 1;
    private static JceCmd[] __values = new JceCmd[6];
    private String __T;
    private int __value;

    static {
        Class<JceCmd> cls = JceCmd.class;
    }

    private JceCmd(int i, int i2, String str) {
        new String();
        this.__T = str;
        this.__value = i2;
        __values[i] = this;
    }

    public static JceCmd convert(int i) {
        int i2 = 0;
        while (true) {
            JceCmd[] jceCmdArr = __values;
            if (i2 >= jceCmdArr.length) {
                return null;
            }
            if (jceCmdArr[i2].value() == i) {
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

    public static JceCmd convert(String str) {
        int i = 0;
        while (true) {
            JceCmd[] jceCmdArr = __values;
            if (i >= jceCmdArr.length) {
                return null;
            }
            if (jceCmdArr[i].toString().equals(str)) {
                return __values[i];
            }
            i++;
        }
    }
}
