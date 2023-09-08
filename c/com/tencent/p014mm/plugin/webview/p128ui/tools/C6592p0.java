package com.tencent.p014mm.plugin.webview.p128ui.tools;

import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.p0 */
public final class C6592p0 {

    /* renamed from: a */
    public boolean f23835a;

    /* renamed from: b */
    public boolean f23836b;

    /* renamed from: c */
    public boolean f23837c;

    /* renamed from: d */
    public boolean f23838d;

    public C6592p0() {
        this(false, false, false, false, 15, (C8480h) null);
    }

    public C6592p0(boolean z, boolean z2, boolean z3, boolean z4, int i, C8480h hVar) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        this.f23835a = z;
        this.f23836b = z2;
        this.f23837c = z3;
        this.f23838d = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6592p0)) {
            return false;
        }
        C6592p0 p0Var = (C6592p0) obj;
        return this.f23835a == p0Var.f23835a && this.f23836b == p0Var.f23836b && this.f23837c == p0Var.f23837c && this.f23838d == p0Var.f23838d;
    }

    public int hashCode() {
        boolean z = this.f23835a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f23836b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f23837c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f23838d;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "UrlParams(immersiveStyle=" + this.f23835a + ", immersiveBgDark=" + this.f23836b + ", immersiveVideoStyle=" + this.f23837c + ", hideWebViewTitle=" + this.f23838d + ')';
    }
}
