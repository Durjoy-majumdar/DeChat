package com.tencent.p014mm.plugin.vlog.model;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.vlog.model.t0 */
public final class C96556t0 {

    /* renamed from: a */
    public int f282600a;

    /* renamed from: b */
    public int f282601b;

    /* renamed from: c */
    public String f282602c;

    /* renamed from: d */
    public int f282603d;

    /* renamed from: e */
    public int f282604e;

    /* renamed from: f */
    public int f282605f;

    /* renamed from: g */
    public int f282606g;

    /* renamed from: h */
    public int f282607h;

    /* renamed from: i */
    public int f282608i;

    /* renamed from: j */
    public int f282609j;

    /* renamed from: k */
    public int f282610k;

    public C96556t0() {
        this(0, 0, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, 2047, (C8480h) null);
    }

    public C96556t0(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, C8480h hVar) {
        i = (i16 & 1) != 0 ? 0 : i;
        i2 = (i16 & 2) != 0 ? 0 : i2;
        str = (i16 & 4) != 0 ? "" : str;
        i3 = (i16 & 8) != 0 ? 0 : i3;
        i4 = (i16 & 16) != 0 ? 0 : i4;
        i5 = (i16 & 32) != 0 ? 0 : i5;
        i6 = (i16 & 64) != 0 ? 0 : i6;
        i7 = (i16 & 128) != 0 ? 0 : i7;
        i8 = (i16 & 256) != 0 ? 0 : i8;
        i9 = (i16 & 512) != 0 ? 0 : i9;
        i15 = (i16 & 1024) != 0 ? 1 : i15;
        C87412m.m108594g(str, "outputPath");
        this.f282600a = i;
        this.f282601b = i2;
        this.f282602c = str;
        this.f282603d = i3;
        this.f282604e = i4;
        this.f282605f = i5;
        this.f282606g = i6;
        this.f282607h = i7;
        this.f282608i = i8;
        this.f282609j = i9;
        this.f282610k = i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C96556t0)) {
            return false;
        }
        C96556t0 t0Var = (C96556t0) obj;
        return this.f282600a == t0Var.f282600a && this.f282601b == t0Var.f282601b && C87412m.m108589b(this.f282602c, t0Var.f282602c) && this.f282603d == t0Var.f282603d && this.f282604e == t0Var.f282604e && this.f282605f == t0Var.f282605f && this.f282606g == t0Var.f282606g && this.f282607h == t0Var.f282607h && this.f282608i == t0Var.f282608i && this.f282609j == t0Var.f282609j && this.f282610k == t0Var.f282610k;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f282600a * 31) + this.f282601b) * 31) + this.f282602c.hashCode()) * 31) + this.f282603d) * 31) + this.f282604e) * 31) + this.f282605f) * 31) + this.f282606g) * 31) + this.f282607h) * 31) + this.f282608i) * 31) + this.f282609j) * 31) + this.f282610k;
    }

    public String toString() {
        return "VLogGenerateModel(outputDurationMs=" + this.f282600a + ", outputAudioType=" + this.f282601b + ", outputPath=" + this.f282602c + ", targetWidth=" + this.f282603d + ", targetHeight=" + this.f282604e + ", videoBitrate=" + this.f282605f + ", audioBitrate=" + this.f282606g + ", frameRate=" + this.f282607h + ", videoRotate=" + this.f282608i + ", audioSampleRate=" + this.f282609j + ", audioChannelCount=" + this.f282610k + ')';
    }
}
