package com.tencent.p014mm.plugin.appbrand.appusage;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.v1 */
public final class C29395v1 {

    /* renamed from: a */
    public final String f80191a;

    /* renamed from: b */
    public final String f80192b;

    /* renamed from: c */
    public final int f80193c;

    public C29395v1(String str, String str2, int i) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "appId");
        this.f80191a = str;
        this.f80192b = str2;
        this.f80193c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29395v1)) {
            return false;
        }
        C29395v1 v1Var = (C29395v1) obj;
        return C87412m.m108589b(this.f80191a, v1Var.f80191a) && C87412m.m108589b(this.f80192b, v1Var.f80192b) && this.f80193c == v1Var.f80193c;
    }

    public int hashCode() {
        return (((this.f80191a.hashCode() * 31) + this.f80192b.hashCode()) * 31) + this.f80193c;
    }

    public String toString() {
        return "WxaInfo(userName=" + this.f80191a + ", appId=" + this.f80192b + ", versionType=" + this.f80193c + ')';
    }
}
