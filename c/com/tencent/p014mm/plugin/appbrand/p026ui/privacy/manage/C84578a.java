package com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage;

import bs0.C79795j;
import bs0.C79799q;
import com.tencent.p014mm.plugin.appbrand.p026ui.authrize.OnWxaAuthorizeScopeModifyEvent;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C51793w7;
import te3.y75;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.a */
public final class C84578a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeScopeModifyObserver f246788d;

    /* renamed from: e */
    public final /* synthetic */ OnWxaAuthorizeScopeModifyEvent f246789e;

    public C84578a(AppBrandAuthorizeScopeModifyObserver appBrandAuthorizeScopeModifyObserver, OnWxaAuthorizeScopeModifyEvent onWxaAuthorizeScopeModifyEvent) {
        this.f246788d = appBrandAuthorizeScopeModifyObserver;
        this.f246789e = onWxaAuthorizeScopeModifyEvent;
    }

    public final void run() {
        C32226l<C79799q, C13598b0> lVar = this.f246788d.f246781d;
        OnWxaAuthorizeScopeModifyEvent onWxaAuthorizeScopeModifyEvent = this.f246789e;
        String str = onWxaAuthorizeScopeModifyEvent.f246586d;
        List<C51793w7> list = onWxaAuthorizeScopeModifyEvent.f246587e;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C51793w7 w7Var : list) {
            y75 y75 = new y75();
            y75.f145164d = w7Var.f143896d;
            y75.f145165e = w7Var.f143897e;
            boolean z = true;
            if (1 != w7Var.f143898f) {
                z = false;
            }
            arrayList.add(new C79795j(y75, z));
        }
        lVar.invoke(new C79799q(str, arrayList));
    }
}
