package com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage;

import bs0.C79799q;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import jp3.C9486a;
import jp3.C9487b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver */
public final class AppBrandAuthorizeScopeModifyObserver implements C9486a {

    /* renamed from: d */
    public final C32226l<C79799q, C13598b0> f246781d;

    /* renamed from: e */
    public final AppBrandAuthorizeScopeModifyObserver$listener$1 f246782e;

    public AppBrandAuthorizeScopeModifyObserver(C9487b<C9486a> bVar, C32226l<? super C79799q, C13598b0> lVar) {
        C87412m.m108594g(bVar, "lifeCycleKeeper");
        C87412m.m108594g(lVar, "onAuthorizeScopeModify");
        this.f246781d = lVar;
        AppBrandAuthorizeScopeModifyObserver$listener$1 appBrandAuthorizeScopeModifyObserver$listener$1 = new AppBrandAuthorizeScopeModifyObserver$listener$1(this, C40008f.f107254d);
        this.f246782e = appBrandAuthorizeScopeModifyObserver$listener$1;
        bVar.keep(this);
        appBrandAuthorizeScopeModifyObserver$listener$1.alive();
    }

    public void dead() {
        Log.m105924i("MicroMsg.AppBrandAuthorizeScopeModifyObserver", "dead");
        this.f246782e.dead();
    }
}
