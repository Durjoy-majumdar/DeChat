package com.tencent.p014mm.plugin.wallet_core.utils;

import f40.C86709a0;
import lp3.C46888b;
import lp3.C88643g;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.f */
public class C72498f implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C46888b f210899d;

    /* renamed from: e */
    public final /* synthetic */ C72500g f210900e;

    public C72498f(C72500g gVar, C46888b bVar) {
        this.f210900e = gVar;
        this.f210899d = bVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1650, this);
        this.f210900e.f210901a.f210842d = null;
        C88643g.m110553k(this.f210899d, new Object[0]);
    }
}
