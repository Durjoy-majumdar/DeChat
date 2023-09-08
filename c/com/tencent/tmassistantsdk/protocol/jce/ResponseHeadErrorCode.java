package com.tencent.tmassistantsdk.protocol.jce;

import java.io.Serializable;

public final class ResponseHeadErrorCode implements Serializable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ResponseHeadErrorCode EC_BUSINESS_ERROR = new ResponseHeadErrorCode(1, -11, "EC_BUSINESS_ERROR");
    public static final ResponseHeadErrorCode EC_SERVER_INTERNAL_ERROR = new ResponseHeadErrorCode(0, -10, "EC_SERVER_INTERNAL_ERROR");
    public static final int _EC_BUSINESS_ERROR = -11;
    public static final int _EC_SERVER_INTERNAL_ERROR = -10;
    private static ResponseHeadErrorCode[] __values = new ResponseHeadErrorCode[2];
    private String __T;
    private int __value;

    static {
        Class<ResponseHeadErrorCode> cls = ResponseHeadErrorCode.class;
    }

    private ResponseHeadErrorCode(int i, int i2, String str) {
        new String();
        this.__T = str;
        this.__value = i2;
        __values[i] = this;
    }

    public static ResponseHeadErrorCode convert(int i) {
        int i2 = 0;
        while (true) {
            ResponseHeadErrorCode[] responseHeadErrorCodeArr = __values;
            if (i2 >= responseHeadErrorCodeArr.length) {
                return null;
            }
            if (responseHeadErrorCodeArr[i2].value() == i) {
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

    public static ResponseHeadErrorCode convert(String str) {
        int i = 0;
        while (true) {
            ResponseHeadErrorCode[] responseHeadErrorCodeArr = __values;
            if (i >= responseHeadErrorCodeArr.length) {
                return null;
            }
            if (responseHeadErrorCodeArr[i].toString().equals(str)) {
                return __values[i];
            }
            i++;
        }
    }
}
