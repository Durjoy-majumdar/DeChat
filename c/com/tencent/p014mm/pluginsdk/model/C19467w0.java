package com.tencent.p014mm.pluginsdk.model;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.pluginsdk.model.w0 */
public final class C19467w0 {

    /* renamed from: a */
    public final int f55001a;

    /* renamed from: b */
    public final boolean f55002b;

    /* renamed from: c */
    public final String f55003c;

    /* renamed from: d */
    public final boolean f55004d;

    /* renamed from: e */
    public final String f55005e;

    public C19467w0() {
        this(0, false, (String) null, false, (String) null, 31, (C8480h) null);
    }

    public C19467w0(int i, boolean z, String str, boolean z2, String str2) {
        this.f55001a = i;
        this.f55002b = z;
        this.f55003c = str;
        this.f55004d = z2;
        this.f55005e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19467w0)) {
            return false;
        }
        C19467w0 w0Var = (C19467w0) obj;
        return this.f55001a == w0Var.f55001a && this.f55002b == w0Var.f55002b && C87412m.m108589b(this.f55003c, w0Var.f55003c) && this.f55004d == w0Var.f55004d && C87412m.m108589b(this.f55005e, w0Var.f55005e);
    }

    public int hashCode() {
        int i = this.f55001a * 31;
        boolean z = this.f55002b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        String str = this.f55003c;
        int i3 = 0;
        int hashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f55004d;
        if (!z3) {
            z2 = z3;
        }
        int i4 = (hashCode + (z2 ? 1 : 0)) * 31;
        String str2 = this.f55005e;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        return "InsertRecCardExtData(maxWeight=" + this.f55001a + ", isInTimeLineResort=" + this.f55002b + ", rankSessionId=" + this.f55003c + ", resortSuccess=" + this.f55004d + ", recommendReason=" + this.f55005e + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C19467w0(int r4, boolean r5, java.lang.String r6, boolean r7, java.lang.String r8, int r9, gy3.C8480h r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            r4 = 255(0xff, float:3.57E-43)
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000d
            r5 = 0
            r10 = 0
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            r0 = 0
            if (r5 == 0) goto L_0x0015
            r1 = r0
            goto L_0x0016
        L_0x0015:
            r1 = r6
        L_0x0016:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001d
            r7 = 1
            r2 = 1
            goto L_0x001e
        L_0x001d:
            r2 = r7
        L_0x001e:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r0 = r8
        L_0x0024:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C19467w0.<init>(int, boolean, java.lang.String, boolean, java.lang.String, int, gy3.h):void");
    }
}
