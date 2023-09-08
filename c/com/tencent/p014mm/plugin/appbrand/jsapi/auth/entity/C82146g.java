package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.g */
public final class C82146g implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C82139c f240954d;

    public C82146g(C82139c cVar) {
        this.f240954d = cVar;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        C82139c cVar = this.f240954d;
        if (cVar.f240940g == i) {
            C82139c.m100864a(cVar, intent);
        }
    }
}
