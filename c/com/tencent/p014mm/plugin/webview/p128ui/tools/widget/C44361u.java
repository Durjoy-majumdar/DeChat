package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.u */
public final class C44361u {

    /* renamed from: a */
    public float f120216a;

    /* renamed from: b */
    public String f120217b;

    /* renamed from: c */
    public boolean f120218c;

    /* renamed from: d */
    public boolean f120219d;

    /* renamed from: e */
    public int f120220e;

    /* renamed from: f */
    public boolean f120221f;

    /* renamed from: g */
    public int f120222g;

    /* renamed from: h */
    public boolean f120223h;

    /* renamed from: i */
    public boolean f120224i;

    /* renamed from: j */
    public int f120225j;

    /* renamed from: k */
    public boolean f120226k;

    /* renamed from: l */
    public boolean f120227l;

    /* renamed from: m */
    public boolean f120228m;

    /* renamed from: n */
    public String f120229n;

    /* renamed from: o */
    public boolean f120230o;

    public C44361u() {
        this(0.0f, (String) null, false, false, 0, false, 0, false, false, 0, false, false, false, (String) null, false, 32767, (C8480h) null);
    }

    public C44361u(float f, String str, boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5, int i3, boolean z6, boolean z7, boolean z8, String str2, boolean z9, int i4, C8480h hVar) {
        int i5 = i4;
        float f2 = (i5 & 1) != 0 ? 0.75f : f;
        String str3 = (i5 & 2) != 0 ? null : str;
        boolean z15 = (i5 & 4) != 0 ? true : z;
        boolean z16 = (i5 & 8) != 0 ? true : z2;
        int i6 = (i5 & 16) != 0 ? 0 : i;
        boolean z17 = (i5 & 32) != 0 ? false : z3;
        int i7 = (i5 & 64) != 0 ? 0 : i2;
        boolean z18 = (i5 & 128) != 0 ? true : z4;
        boolean z19 = (i5 & 256) != 0 ? true : z5;
        int i8 = (i5 & 512) != 0 ? 80 : i3;
        boolean z25 = (i5 & 1024) != 0 ? false : z6;
        boolean z26 = (i5 & 2048) != 0 ? false : z7;
        boolean z27 = (i5 & 4096) != 0 ? true : z8;
        String str4 = (i5 & 8192) != 0 ? "" : str2;
        boolean z28 = (i5 & 16384) != 0 ? false : z9;
        this.f120216a = f2;
        this.f120217b = str3;
        this.f120218c = z15;
        this.f120219d = z16;
        this.f120220e = i6;
        this.f120221f = z17;
        this.f120222g = i7;
        this.f120223h = z18;
        this.f120224i = z19;
        this.f120225j = i8;
        this.f120226k = z25;
        this.f120227l = z26;
        this.f120228m = z27;
        this.f120229n = str4;
        this.f120230o = z28;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44361u)) {
            return false;
        }
        C44361u uVar = (C44361u) obj;
        return C87412m.m108589b(Float.valueOf(this.f120216a), Float.valueOf(uVar.f120216a)) && C87412m.m108589b(this.f120217b, uVar.f120217b) && this.f120218c == uVar.f120218c && this.f120219d == uVar.f120219d && this.f120220e == uVar.f120220e && this.f120221f == uVar.f120221f && this.f120222g == uVar.f120222g && this.f120223h == uVar.f120223h && this.f120224i == uVar.f120224i && this.f120225j == uVar.f120225j && this.f120226k == uVar.f120226k && this.f120227l == uVar.f120227l && this.f120228m == uVar.f120228m && C87412m.m108589b(this.f120229n, uVar.f120229n) && this.f120230o == uVar.f120230o;
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f120216a) * 31;
        String str = this.f120217b;
        int i = 0;
        int hashCode = (floatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f120218c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f120219d;
        if (z3) {
            z3 = true;
        }
        int i3 = (((i2 + (z3 ? 1 : 0)) * 31) + this.f120220e) * 31;
        boolean z4 = this.f120221f;
        if (z4) {
            z4 = true;
        }
        int i4 = (((i3 + (z4 ? 1 : 0)) * 31) + this.f120222g) * 31;
        boolean z5 = this.f120223h;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f120224i;
        if (z6) {
            z6 = true;
        }
        int i6 = (((i5 + (z6 ? 1 : 0)) * 31) + this.f120225j) * 31;
        boolean z7 = this.f120226k;
        if (z7) {
            z7 = true;
        }
        int i7 = (i6 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f120227l;
        if (z8) {
            z8 = true;
        }
        int i8 = (i7 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f120228m;
        if (z9) {
            z9 = true;
        }
        int i9 = (i8 + (z9 ? 1 : 0)) * 31;
        String str2 = this.f120229n;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i15 = (i9 + i) * 31;
        boolean z15 = this.f120230o;
        if (!z15) {
            z2 = z15;
        }
        return i15 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "HalfScreenWebViewOption(heightPercent=" + this.f120216a + ", extData=" + this.f120217b + ", reuseWebView=" + this.f120218c + ", showMenu=" + this.f120219d + ", backMode=" + this.f120220e + ", immersiveUIStyle=" + this.f120221f + ", openType=" + this.f120222g + ", showBgMask=" + this.f120223h + ", closeWhenClickEmptyArea=" + this.f120224i + ", getA8KeyScene=" + this.f120225j + ", readMode=" + this.f120226k + ", showRefreshIcon=" + this.f120227l + ", showTitle=" + this.f120228m + ", hexBackgroundColor=" + this.f120229n + ", forcePortrait=" + this.f120230o + ')';
    }
}
