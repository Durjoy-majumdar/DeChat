package com.tencent.mapsdk.internal;

import java.io.Serializable;

/* renamed from: com.tencent.mapsdk.internal.cp */
public final class C80338cp implements Serializable {

    /* renamed from: a */
    public static final int f235159a = 29;

    /* renamed from: b */
    public static final int f235160b = 1;

    /* renamed from: c */
    public static final int f235161c = 8;

    /* renamed from: d */
    public static final C80338cp f235162d = new C80338cp("REQ_CONFIG");

    /* renamed from: e */
    public static final /* synthetic */ boolean f235163e = true;

    /* renamed from: f */
    private static C80338cp[] f235164f = new C80338cp[28];

    /* renamed from: g */
    private int f235165g = 29;

    /* renamed from: h */
    private String f235166h;

    static {
        Class<C80338cp> cls = C80338cp.class;
    }

    private C80338cp(String str) {
        new String();
        this.f235166h = str;
        f235164f[26] = this;
    }

    /* renamed from: a */
    private static C80338cp m97815a(int i) {
        int i2 = 0;
        while (true) {
            C80338cp[] cpVarArr = f235164f;
            if (i2 < cpVarArr.length) {
                C80338cp cpVar = cpVarArr[i2];
                if (cpVar.f235165g == i) {
                    return cpVar;
                }
                i2++;
            } else if (f235163e) {
                return null;
            } else {
                throw new AssertionError();
            }
        }
    }

    public final String toString() {
        return this.f235166h;
    }

    /* renamed from: a */
    private static C80338cp m97816a(String str) {
        int i = 0;
        while (true) {
            C80338cp[] cpVarArr = f235164f;
            if (i < cpVarArr.length) {
                if (cpVarArr[i].toString().equals(str)) {
                    return f235164f[i];
                }
                i++;
            } else if (f235163e) {
                return null;
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    private int m97814a() {
        return this.f235165g;
    }
}
