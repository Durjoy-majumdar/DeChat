package com.tencent.mapsdk.rastercore;

import android.text.TextUtils;

public class LogHelper {
    private static Boolean DEBUG = Boolean.FALSE;
    private static final String DEFAULT_TAG = "tencentSdk";

    /* renamed from: d */
    public static void m160674d(String str, String str2) {
        log(str, str2, 'd');
    }

    /* renamed from: e */
    public static void m160676e(String str, String str2) {
        log(str, str2, 'e');
    }

    /* renamed from: i */
    public static void m160678i(String str, String str2) {
        log(str, str2, 'i');
    }

    public static void log(String str) {
        log((String) null, str, 'v');
    }

    public static void setDebugMode(boolean z) {
        DEBUG = Boolean.valueOf(z);
    }

    /* renamed from: v */
    public static void m160680v(String str, String str2) {
        log(str, str2, 'v');
    }

    /* renamed from: w */
    public static void m160682w(String str, String str2) {
        log(str, str2, 'w');
    }

    /* renamed from: d */
    public static void m160673d(String str) {
        log((String) null, str, 'd');
    }

    /* renamed from: e */
    public static void m160675e(String str) {
        log((String) null, str, 'e');
    }

    /* renamed from: i */
    public static void m160677i(String str) {
        log((String) null, str, 'i');
    }

    private static void log(String str, String str2, char c) {
        if (DEBUG.booleanValue()) {
            TextUtils.isEmpty(str);
        }
    }

    /* renamed from: v */
    public static void m160679v(String str) {
        log((String) null, str, 'v');
    }

    /* renamed from: w */
    public static void m160681w(String str) {
        log((String) null, str, 'w');
    }
}
