package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.FromMMProxyUI */
public class FromMMProxyUI extends ContextWrapper implements C83429p {

    /* renamed from: h */
    public static final /* synthetic */ int f243753h = 0;

    /* renamed from: d */
    public final IListener<AppBrandUIEnterAnimationCompleteEvent> f243754d = new IListener<AppBrandUIEnterAnimationCompleteEvent>(C40008f.f107254d) {
        {
            this.__eventId = 551436157;
        }

        public boolean callback(IEvent iEvent) {
            AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent = (AppBrandUIEnterAnimationCompleteEvent) iEvent;
            FromMMProxyUI fromMMProxyUI = FromMMProxyUI.this;
            int i = FromMMProxyUI.f243753h;
            fromMMProxyUI.mo115698a("AppBrand_onEnterAnimationComplete");
            return false;
        }
    };

    /* renamed from: e */
    public int f243755e = 0;

    /* renamed from: f */
    public String f243756f;

    /* renamed from: g */
    public C83426n f243757g;

    public FromMMProxyUI(AppBrandLaunchProxyUI appBrandLaunchProxyUI) {
        super(appBrandLaunchProxyUI);
    }

    /* renamed from: a */
    public final void mo115698a(String str) {
        C83426n nVar = this.f243757g;
        if (nVar == null || nVar.f243761e) {
            Log.m105925i("MicroMsg.FromMMProxyUI", "reason[%s] process[%s] isFinished, just finish activity", str, this.f243756f);
            getBaseContext().finish();
        }
    }

    /* renamed from: b */
    public void mo115699b(Intent intent, Bundle bundle) {
        C85864g1.m106129d(getBaseContext().getWindow());
        C85864g1.m106127b(getBaseContext().getWindow(), true);
        String stringExtra = intent.getStringExtra("extra_entry_token");
        C83426n j = C83426n.m102381j(stringExtra);
        if (j == null) {
            getBaseContext().finish();
            return;
        }
        getBaseContext().overridePendingTransition(0, 0);
        j.setBaseContext(getBaseContext());
        this.f243756f = stringExtra;
        this.f243757g = j;
        this.f243754d.alive();
    }

    /* renamed from: c */
    public boolean mo115700c() {
        return true;
    }

    /* renamed from: d */
    public AppBrandLaunchProxyUI getBaseContext() {
        return (AppBrandLaunchProxyUI) super.getBaseContext();
    }

    public void onDestroy() {
        this.f243754d.dead();
        C83426n nVar = this.f243757g;
        if (nVar != null) {
            nVar.mo115708d();
        }
    }

    public void onPause() {
    }

    public void onResume() {
        int i = this.f243755e + 1;
        this.f243755e = i;
        Log.m105925i("MicroMsg.FromMMProxyUI", "onResume, resume count:%d", Integer.valueOf(i));
        if (this.f243755e > 1) {
            mo115698a("NotFirstResume");
        }
    }
}
