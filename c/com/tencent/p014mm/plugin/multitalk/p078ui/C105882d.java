package com.tencent.p014mm.plugin.multitalk.p078ui;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.d */
public final class C105882d {

    /* renamed from: a */
    public final int f314926a;

    /* renamed from: b */
    public final String f314927b;

    /* renamed from: c */
    public final boolean f314928c;

    /* renamed from: d */
    public final boolean f314929d;

    /* renamed from: e */
    public final boolean f314930e;

    /* renamed from: f */
    public final boolean f314931f;

    /* renamed from: g */
    public final boolean f314932g;

    /* renamed from: h */
    public final int f314933h;

    public C105882d(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        C87412m.m108594g(str, "userName");
        this.f314926a = i;
        this.f314927b = str;
        this.f314928c = z;
        this.f314929d = z2;
        this.f314930e = z3;
        this.f314931f = z4;
        this.f314932g = z5;
        this.f314933h = i2;
    }

    /* renamed from: a */
    public final boolean mo150900a() {
        int i = this.f314933h;
        return i == 101 || i == 102;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C105882d)) {
            return false;
        }
        C105882d dVar = (C105882d) obj;
        return this.f314926a == dVar.f314926a && C87412m.m108589b(this.f314927b, dVar.f314927b) && this.f314928c == dVar.f314928c && this.f314929d == dVar.f314929d && this.f314930e == dVar.f314930e && this.f314931f == dVar.f314931f && this.f314932g == dVar.f314932g && this.f314933h == dVar.f314933h;
    }

    public int hashCode() {
        int hashCode = ((this.f314926a * 31) + this.f314927b.hashCode()) * 31;
        boolean z = this.f314928c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f314929d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f314930e;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f314931f;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f314932g;
        if (!z6) {
            z2 = z6;
        }
        return ((i4 + (z2 ? 1 : 0)) * 31) + this.f314933h;
    }

    public String toString() {
        return "MultiTalkMemberInfo(memberId=" + this.f314926a + ", userName=" + this.f314927b + ", waiting=" + this.f314928c + ", isVideoOn=" + this.f314929d + ", isTalking=" + this.f314930e + ", isNetworkWeak=" + this.f314931f + ", isMicOff=" + this.f314932g + ", screenCastingState=" + this.f314933h + ')';
    }
}
