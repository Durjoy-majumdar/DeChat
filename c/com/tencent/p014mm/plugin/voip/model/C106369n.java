package com.tencent.p014mm.plugin.voip.model;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.voip.model.n */
public final class C106369n {

    /* renamed from: a */
    public final long f317434a;

    /* renamed from: b */
    public final long f317435b;

    /* renamed from: c */
    public final int f317436c;

    /* renamed from: d */
    public final String f317437d;

    /* renamed from: e */
    public final boolean f317438e;

    /* renamed from: f */
    public final boolean f317439f;

    public C106369n(long j, long j2, int i, String str, boolean z, boolean z2) {
        this.f317434a = j;
        this.f317435b = j2;
        this.f317436c = i;
        this.f317437d = str;
        this.f317438e = z;
        this.f317439f = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C106369n)) {
            return false;
        }
        C106369n nVar = (C106369n) obj;
        return this.f317434a == nVar.f317434a && this.f317435b == nVar.f317435b && this.f317436c == nVar.f317436c && C87412m.m108589b(this.f317437d, nVar.f317437d) && this.f317438e == nVar.f317438e && this.f317439f == nVar.f317439f;
    }

    public int hashCode() {
        long j = this.f317434a;
        long j2 = this.f317435b;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f317436c) * 31;
        String str = this.f317437d;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f317438e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f317439f;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "VoIPInfo(roomId=" + this.f317434a + ", roomKey=" + this.f317435b + ", inviteId=" + this.f317436c + ", talkerName=" + this.f317437d + ", videoRoom=" + this.f317438e + ", outCall=" + this.f317439f + ')';
    }
}
