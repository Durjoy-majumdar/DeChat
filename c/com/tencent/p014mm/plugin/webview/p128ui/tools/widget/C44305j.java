package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Dialog;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.j */
public final class C44305j {

    /* renamed from: a */
    public float f120061a;

    /* renamed from: b */
    public String f120062b;

    /* renamed from: c */
    public boolean f120063c;

    /* renamed from: d */
    public int f120064d;

    /* renamed from: e */
    public boolean f120065e;

    /* renamed from: f */
    public Dialog f120066f;

    /* renamed from: g */
    public C44365w f120067g;

    public C44305j() {
        this(0.0f, (String) null, false, 0, false, (Dialog) null, (C44365w) null, 127, (C8480h) null);
    }

    public C44305j(float f, String str, boolean z, int i, boolean z2, Dialog dialog, C44365w wVar) {
        this.f120061a = f;
        this.f120062b = str;
        this.f120063c = z;
        this.f120064d = i;
        this.f120065e = z2;
        this.f120066f = dialog;
        this.f120067g = wVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44305j)) {
            return false;
        }
        C44305j jVar = (C44305j) obj;
        return C87412m.m108589b(Float.valueOf(this.f120061a), Float.valueOf(jVar.f120061a)) && C87412m.m108589b(this.f120062b, jVar.f120062b) && this.f120063c == jVar.f120063c && this.f120064d == jVar.f120064d && this.f120065e == jVar.f120065e && C87412m.m108589b(this.f120066f, jVar.f120066f) && C87412m.m108589b(this.f120067g, jVar.f120067g);
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f120061a) * 31;
        String str = this.f120062b;
        int i = 0;
        int hashCode = (floatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f120063c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f120064d) * 31;
        boolean z3 = this.f120065e;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Dialog dialog = this.f120066f;
        int hashCode2 = (i3 + (dialog == null ? 0 : dialog.hashCode())) * 31;
        C44365w wVar = this.f120067g;
        if (wVar != null) {
            i = wVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CommWebViewOption(heightPercent=" + this.f120061a + ", extData=" + this.f120062b + ", reuseWebView=" + this.f120063c + ", getA8KeyScene=" + this.f120064d + ", readMode=" + this.f120065e + ", uiDialog=" + this.f120066f + ", commWebViewDelegate=" + this.f120067g + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C44305j(float r6, java.lang.String r7, boolean r8, int r9, boolean r10, android.app.Dialog r11, com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44365w r12, int r13, gy3.C8480h r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            r6 = 1061158912(0x3f400000, float:0.75)
        L_0x0006:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L_0x000d
            r14 = r0
            goto L_0x000e
        L_0x000d:
            r14 = r7
        L_0x000e:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0015
            r8 = 1
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = r8
        L_0x0016:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = 80
            r2 = 80
            goto L_0x0020
        L_0x001f:
            r2 = r9
        L_0x0020:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = 0
            r3 = 0
            goto L_0x0028
        L_0x0027:
            r3 = r10
        L_0x0028:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002e
            r4 = r0
            goto L_0x002f
        L_0x002e:
            r4 = r11
        L_0x002f:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = r12
        L_0x0035:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44305j.<init>(float, java.lang.String, boolean, int, boolean, android.app.Dialog, com.tencent.mm.plugin.webview.ui.tools.widget.w, int, gy3.h):void");
    }
}
