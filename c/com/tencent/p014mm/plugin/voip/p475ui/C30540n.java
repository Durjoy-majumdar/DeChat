package com.tencent.p014mm.plugin.voip.p475ui;

import jq3.C9493c;

/* renamed from: com.tencent.mm.plugin.voip.ui.n */
public final class C30540n implements C9493c {

    /* renamed from: d */
    public int f82273d;

    /* renamed from: e */
    public int f82274e;

    /* renamed from: f */
    public int f82275f;

    /* renamed from: g */
    public int f82276g;

    /* renamed from: h */
    public int f82277h;

    /* renamed from: i */
    public int f82278i;

    /* renamed from: j */
    public int f82279j;

    public C30540n(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f82273d = i;
        this.f82274e = i2;
        this.f82275f = i3;
        this.f82276g = i4;
        this.f82277h = i5;
        this.f82278i = i6;
        this.f82279j = i7;
    }

    /* renamed from: a */
    public final byte[] mo57468a() {
        int i = this.f82279j;
        return new byte[]{0, 0, (byte) this.f82273d, (byte) this.f82274e, (byte) this.f82275f, (byte) this.f82276g, (byte) this.f82277h, (byte) this.f82278i, (byte) (i & 65535), (byte) ((i >> 8) & 65535), (byte) ((i >> 16) & 65535), (byte) ((i >> 24) & 65535)};
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30540n)) {
            return false;
        }
        C30540n nVar = (C30540n) obj;
        return this.f82273d == nVar.f82273d && this.f82274e == nVar.f82274e && this.f82275f == nVar.f82275f && this.f82276g == nVar.f82276g && this.f82277h == nVar.f82277h && this.f82278i == nVar.f82278i && this.f82279j == nVar.f82279j;
    }

    public long getItemId() {
        return 0;
    }

    public int hashCode() {
        return (((((((((((this.f82273d * 31) + this.f82274e) * 31) + this.f82275f) * 31) + this.f82276g) * 31) + this.f82277h) * 31) + this.f82278i) * 31) + this.f82279j;
    }

    public String toString() {
        return "QosParams(codec=" + this.f82273d + ", codecSize=" + this.f82274e + ", fps=" + this.f82275f + ", iPeriod=" + this.f82276g + ", interval=" + this.f82277h + ", rsLevel=" + this.f82278i + ", bitrate=" + this.f82279j + ')';
    }
}
