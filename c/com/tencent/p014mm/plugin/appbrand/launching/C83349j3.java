package com.tencent.p014mm.plugin.appbrand.launching;

import gy3.C87412m;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.j3 */
public final class C83349j3 {

    /* renamed from: a */
    public final C91291c f243563a;

    /* renamed from: b */
    public final String f243564b;

    /* renamed from: c */
    public final int f243565c;

    /* renamed from: d */
    public final String f243566d;

    public C83349j3(C91291c cVar, String str, int i, String str2) {
        C87412m.m108594g(cVar, "state");
        C87412m.m108594g(str, "pluginAppId");
        this.f243563a = cVar;
        this.f243564b = str;
        this.f243565c = i;
        this.f243566d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83349j3)) {
            return false;
        }
        C83349j3 j3Var = (C83349j3) obj;
        return this.f243563a == j3Var.f243563a && C87412m.m108589b(this.f243564b, j3Var.f243564b) && this.f243565c == j3Var.f243565c && C87412m.m108589b(this.f243566d, j3Var.f243566d);
    }

    public int hashCode() {
        int hashCode = ((((this.f243563a.hashCode() * 31) + this.f243564b.hashCode()) * 31) + this.f243565c) * 31;
        String str = this.f243566d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PendingPluginUpdateStatusChangeEvent(state=" + this.f243563a + ", pluginAppId=" + this.f243564b + ", pluginIntVersion=" + this.f243565c + ", pluginStringVersion=" + this.f243566d + ')';
    }
}
