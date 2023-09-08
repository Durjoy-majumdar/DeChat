package com.tencent.mapsdk.internal;

import java.io.Serializable;

/* renamed from: com.tencent.mapsdk.internal.cr */
public final class C80340cr implements Serializable {

    /* renamed from: a */
    public static final int f235179a = 0;

    /* renamed from: b */
    public static final C80340cr f235180b = new C80340cr(0, 0, "RST_SUCC");

    /* renamed from: c */
    public static final int f235181c = 1;

    /* renamed from: d */
    public static final C80340cr f235182d = new C80340cr(1, 1, "RST_DECODE_FAIL");

    /* renamed from: e */
    public static final int f235183e = 2;

    /* renamed from: f */
    public static final C80340cr f235184f = new C80340cr(2, 2, "RST_SYS_ERR");

    /* renamed from: g */
    public static final int f235185g = 3;

    /* renamed from: h */
    public static final C80340cr f235186h = new C80340cr(3, 3, "RST_INVALID_USER");

    /* renamed from: i */
    public static final int f235187i = 4;

    /* renamed from: j */
    public static final C80340cr f235188j = new C80340cr(4, 4, "RST_USE_INVALID_KEY");

    /* renamed from: k */
    public static final int f235189k = 5;

    /* renamed from: l */
    public static final C80340cr f235190l = new C80340cr(5, 5, "RST_INVALID_UIN");

    /* renamed from: m */
    public static final int f235191m = 6;

    /* renamed from: n */
    public static final C80340cr f235192n = new C80340cr(6, 6, "RST_INVALID_CMD");

    /* renamed from: o */
    public static final int f235193o = 7;

    /* renamed from: p */
    public static final C80340cr f235194p = new C80340cr(7, 7, "RST_PACKAGE_ERR");

    /* renamed from: q */
    public static final /* synthetic */ boolean f235195q = true;

    /* renamed from: r */
    private static C80340cr[] f235196r = new C80340cr[8];

    /* renamed from: s */
    private int f235197s;

    /* renamed from: t */
    private String f235198t;

    static {
        Class<C80340cr> cls = C80340cr.class;
    }

    private C80340cr(int i, int i2, String str) {
        new String();
        this.f235198t = str;
        this.f235197s = i2;
        f235196r[i] = this;
    }

    /* renamed from: a */
    private static C80340cr m97821a(int i) {
        int i2 = 0;
        while (true) {
            C80340cr[] crVarArr = f235196r;
            if (i2 < crVarArr.length) {
                C80340cr crVar = crVarArr[i2];
                if (crVar.f235197s == i) {
                    return crVar;
                }
                i2++;
            } else if (f235195q) {
                return null;
            } else {
                throw new AssertionError();
            }
        }
    }

    public final String toString() {
        return this.f235198t;
    }

    /* renamed from: a */
    private static C80340cr m97822a(String str) {
        int i = 0;
        while (true) {
            C80340cr[] crVarArr = f235196r;
            if (i < crVarArr.length) {
                if (crVarArr[i].toString().equals(str)) {
                    return f235196r[i];
                }
                i++;
            } else if (f235195q) {
                return null;
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    private int m97820a() {
        return this.f235197s;
    }
}
