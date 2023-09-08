package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.content.Intent;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.h */
public final class C82147h implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82139c f240955a;

    public C82147h(C82139c cVar) {
        this.f240955a = cVar;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        C82139c cVar = this.f240955a;
        if (cVar.f240940g != i) {
            return false;
        }
        C82139c.m100864a(cVar, intent);
        return true;
    }
}
