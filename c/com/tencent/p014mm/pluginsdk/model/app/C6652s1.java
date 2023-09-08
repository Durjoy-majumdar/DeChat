package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.pluginsdk.model.app.C6650r1;

/* renamed from: com.tencent.mm.pluginsdk.model.app.s1 */
public class C6652s1 implements C6650r1 {

    /* renamed from: a */
    public volatile boolean f23964a;

    /* renamed from: b */
    public volatile boolean f23965b;

    /* renamed from: c */
    public volatile boolean f23966c;

    /* renamed from: d */
    public volatile boolean f23967d;

    /* renamed from: e */
    public C6650r1.C6651a f23968e;

    public C6652s1(C6650r1.C6651a aVar) {
        this.f23968e = aVar;
    }

    /* renamed from: a */
    public void mo1579a(boolean z, boolean z2) {
        C6650r1.C6651a aVar;
        this.f23966c = true;
        this.f23965b = z;
        if (this.f23967d && (aVar = this.f23968e) != null) {
            aVar.mo2088a(this.f23964a, z);
        }
    }

    /* renamed from: b */
    public void mo7576b(boolean z) {
        C6650r1.C6651a aVar;
        this.f23964a = z;
        this.f23967d = true;
        if (this.f23966c && (aVar = this.f23968e) != null) {
            aVar.mo2088a(z, this.f23965b);
        }
    }
}
