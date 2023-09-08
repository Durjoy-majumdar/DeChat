package com.tencent.p014mm.plugin.sight.base;

import p206nj.C88957l;
import p823sg.C48380r;

/* renamed from: com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate */
public class AdaptiveAdjustBitrate {

    /* renamed from: s */
    public static volatile boolean f273424s;

    /* renamed from: a */
    public int f273425a;

    /* renamed from: b */
    public int f273426b;

    /* renamed from: c */
    public int f273427c;

    /* renamed from: d */
    public int f273428d;

    /* renamed from: e */
    public int f273429e;

    /* renamed from: f */
    public int f273430f;

    /* renamed from: g */
    public int f273431g;

    /* renamed from: h */
    public int f273432h;

    /* renamed from: i */
    public float f273433i;

    /* renamed from: j */
    public float f273434j;

    /* renamed from: k */
    public int f273435k;

    /* renamed from: l */
    public int f273436l;

    /* renamed from: m */
    public int f273437m;

    /* renamed from: n */
    public int f273438n;

    /* renamed from: o */
    public int f273439o;

    /* renamed from: p */
    public int f273440p;

    /* renamed from: q */
    public int f273441q;

    /* renamed from: r */
    public int f273442r;

    private static native float GetAuQaLevel(String str, float f, float f2, int i, boolean z, boolean z2);

    private static native ABAPrams GetBitrate(String str, int i, int i2, int i3, int i4, float f, float f2, int i5, float f3, float f4, int i6, int i7, int i8, int i9, int i15, boolean z);

    /* renamed from: a */
    public static float m119556a(String str, float f, float f2, int i, boolean z, boolean z2) {
        m119561g();
        return GetAuQaLevel(C48380r.m53726a(str, false), f, f2, i, z, z2);
    }

    /* renamed from: b */
    public static ABAPrams m119557b(String str, int i, int i2, int i3, int i4, float f, float f2, int i5, float f3, float f4, int i6, int i7, int i8, int i9, int i15, boolean z) {
        m119561g();
        return GetBitrate(C48380r.m53726a(str, false), i, i2, i3, i4, f, f2, i5, f3, f4, i6, i7, i8, i9, i15, z);
    }

    /* renamed from: d */
    public static int m119558d(int i, int i2, int i3, int i4, float f) {
        m119561g();
        return getOrignalImageQuality(i, i2, i3, i4, f);
    }

    /* renamed from: e */
    public static int m119559e(int i, int i2, int i3, int i4, float f) {
        m119561g();
        return getVideoImageQuality(i, i2, i3, i4, f);
    }

    /* renamed from: f */
    public static ABAPrams m119560f(String str, int i, int i2, int i3, int i4, float f, float f2, int i5, float f3, float f4, int i6, int i7) {
        m119561g();
        String str2 = str;
        return getVideoQuality(C48380r.m53726a(str, false), i, i2, i3, i4, f, f2, i5, f3, f4, i6, i7);
    }

    /* renamed from: g */
    public static void m119561g() {
        if (!f273424s) {
            C85458f.m105455a();
            C88957l.m111079o("adaptivebrres", AdaptiveAdjustBitrate.class.getClassLoader());
            f273424s = true;
        }
    }

    private static native int getOrignalImageQuality(int i, int i2, int i3, int i4, float f);

    private static native int getVideoImageQuality(int i, int i2, int i3, int i4, float f);

    private static native ABAPrams getVideoQuality(String str, int i, int i2, int i3, int i4, float f, float f2, int i5, float f3, float f4, int i6, int i7);

    /* renamed from: h */
    public static int m119562h(String str, float f, float f2, float f3, float f4, float f5) {
        m119561g();
        return useAlgorithmCheckNonBlackFrameTimeStamp(C48380r.m53726a(str, false), f, f2, f3, f4, f5);
    }

    private static native int useAlgorithmCheckNonBlackFrameTimeStamp(String str, float f, float f2, float f3, float f4, float f5);

    /* renamed from: c */
    public void mo130038c() {
        this.f273431g = 0;
        this.f273432h = 0;
        this.f273433i = 0.0f;
        this.f273434j = 0.0f;
        this.f273435k = 0;
        this.f273436l = 0;
        this.f273437m = 0;
        this.f273438n = 0;
        this.f273439o = 0;
        this.f273440p = 0;
        this.f273441q = 0;
        this.f273442r = 0;
        this.f273430f = 0;
    }

    public String toString() {
        return "[ sourceVideoPath " + null + " targetHeight " + this.f273425a + " targetWidth " + this.f273426b + " targetvideoBitrate " + this.f273427c + " reMuxStartTimeMs " + this.f273428d + " reMuxEndTimeMs " + this.f273429e + " remuxScene " + this.f273430f + " abaSwitch " + this.f273431g + " qpSwitch " + this.f273432h + " swHEVCRatio " + this.f273433i + " hwHEVCRatio " + this.f273434j + " ceilingVideoBR " + this.f273435k + " flooringVideoBR " + this.f273436l + " isEnableHEVC " + this.f273437m + " isEnable1080p " + this.f273438n + " minQP " + this.f273440p + " maxQP " + this.f273441q + " takePhotosVideoBR " + this.f273442r + " remuxScene " + this.f273430f + "]";
    }
}
