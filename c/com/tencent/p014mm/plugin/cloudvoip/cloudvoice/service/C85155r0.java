package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import n11.C88873b;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r0 */
public class C85155r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88873b f248108d;

    /* renamed from: e */
    public final /* synthetic */ C85147b f248109e;

    /* renamed from: f */
    public final /* synthetic */ C85147b f248110f;

    /* renamed from: g */
    public final /* synthetic */ C85147b f248111g;

    /* renamed from: h */
    public final /* synthetic */ C85147b f248112h;

    /* renamed from: i */
    public final /* synthetic */ C85147b f248113i;

    /* renamed from: j */
    public final /* synthetic */ C85147b f248114j;

    /* renamed from: n */
    public final /* synthetic */ C105181w f248115n;

    public C85155r0(C105181w wVar, C88873b bVar, C85147b bVar2, C85147b bVar3, C85147b bVar4, C85147b bVar5, C85147b bVar6, C85147b bVar7) {
        this.f248115n = wVar;
        this.f248108d = bVar;
        this.f248109e = bVar2;
        this.f248110f = bVar3;
        this.f248111g = bVar4;
        this.f248112h = bVar5;
        this.f248113i = bVar6;
        this.f248114j = bVar7;
    }

    public void run() {
        C105181w wVar = this.f248115n;
        wVar.f312351N = false;
        C105181w.m141242a(wVar, this.f248108d, this.f248109e, this.f248110f, this.f248111g, this.f248112h, this.f248113i, this.f248114j);
    }
}
