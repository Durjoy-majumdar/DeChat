package com.tencent.p014mm.modelimage;

import pc0.C100760a0;

/* renamed from: com.tencent.mm.modelimage.w */
public class C68136w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C92836k f195807d;

    /* renamed from: e */
    public final /* synthetic */ int f195808e;

    public C68136w(C68129u uVar, C92836k kVar, int i) {
        this.f195807d = kVar;
        this.f195808e = i;
    }

    public void run() {
        C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
        b.f295207u = (int) this.f195807d.f267374a;
        b.f295197k = this.f195808e;
        b.f295198l = null;
        b.f295194h = 3;
        b.mo140195a().mo123694a();
    }
}
