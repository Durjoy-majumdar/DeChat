package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C75061i;

/* renamed from: com.tencent.mm.vfs.i0 */
public final class C75063i0 implements C75061i {

    /* renamed from: a */
    public long f220841a;

    /* renamed from: b */
    public final boolean f220842b;

    /* renamed from: c */
    public long f220843c;

    /* renamed from: d */
    public long f220844d = C75061i.C75062a.m90020a(this, 7);

    public C75063i0(long j, boolean z) {
        this.f220841a = j;
        this.f220842b = z;
        this.f220843c = j * ((long) 2);
    }

    /* renamed from: a */
    public final C75059d mo104656a() {
        return this.f220842b ? new C75065l0(this.f220841a, this.f220843c, this.f220844d) : new C75064k0(this.f220841a, this.f220843c, this.f220844d);
    }
}
