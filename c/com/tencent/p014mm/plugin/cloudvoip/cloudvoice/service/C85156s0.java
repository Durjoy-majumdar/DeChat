package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import n11.C88873b;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s0 */
public class C85156s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88873b f248116d;

    /* renamed from: e */
    public final /* synthetic */ C85147b f248117e;

    /* renamed from: f */
    public final /* synthetic */ C85147b f248118f;

    /* renamed from: g */
    public final /* synthetic */ C85147b f248119g;

    /* renamed from: h */
    public final /* synthetic */ C85147b f248120h;

    /* renamed from: i */
    public final /* synthetic */ C85147b f248121i;

    /* renamed from: j */
    public final /* synthetic */ C85147b f248122j;

    /* renamed from: n */
    public final /* synthetic */ C105181w f248123n;

    public C85156s0(C105181w wVar, C88873b bVar, C85147b bVar2, C85147b bVar3, C85147b bVar4, C85147b bVar5, C85147b bVar6, C85147b bVar7) {
        this.f248123n = wVar;
        this.f248116d = bVar;
        this.f248117e = bVar2;
        this.f248118f = bVar3;
        this.f248119g = bVar4;
        this.f248120h = bVar5;
        this.f248121i = bVar6;
        this.f248122j = bVar7;
    }

    public void run() {
        C105181w wVar = this.f248123n;
        wVar.f312351N = true;
        C88873b bVar = this.f248116d;
        bVar.f256338i = 480;
        bVar.f256339j = 640;
        C105181w.m141242a(wVar, bVar, this.f248117e, this.f248118f, this.f248119g, this.f248120h, this.f248121i, this.f248122j);
    }
}
