package com.tencent.p014mm.plugin.appbrand.p025ad.p945ui;

import ai0.C79557i;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81116f;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81118g;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI */
public class AppBrandAdUI extends MMBaseActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f238401j = 0;

    /* renamed from: e */
    public AppBrandRuntimeWC f238402e;

    /* renamed from: f */
    public FrameLayout f238403f;

    /* renamed from: g */
    public C81132e f238404g;

    /* renamed from: h */
    public C79557i f238405h;

    /* renamed from: i */
    public IListener<AppBrandCloseAppBrandAdUIEvent> f238406i = new IListener<AppBrandCloseAppBrandAdUIEvent>(C40008f.f107254d) {
        {
            this.__eventId = -838435681;
        }

        public boolean callback(IEvent iEvent) {
            AppBrandCloseAppBrandAdUIEvent appBrandCloseAppBrandAdUIEvent = (AppBrandCloseAppBrandAdUIEvent) iEvent;
            AppBrandRuntimeWC appBrandRuntimeWC = AppBrandAdUI.this.f238402e;
            if (appBrandRuntimeWC == null || Util.isNullOrNil(appBrandRuntimeWC.f238147j) || !AppBrandAdUI.this.f238402e.f238147j.equalsIgnoreCase(appBrandCloseAppBrandAdUIEvent.f238417d.f238418a)) {
                return false;
            }
            Log.m105924i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "receive close splash ad event, finish");
            AppBrandAdUI.this.finish();
            AppBrandAdUI.this.overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
            return true;
        }
    };

    /* renamed from: E7 */
    public final void mo113285E7() {
        AppBrandRuntimeWC appBrandRuntimeWC;
        View decorView = getWindow().getDecorView();
        decorView.requestApplyInsets();
        int i = 0;
        if (getResources().getConfiguration().orientation == 2) {
            C84545i3.m104129f(this, true);
            C79557i iVar = this.f238405h;
            if (iVar != null) {
                iVar.setBarTopMargin(0);
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            decorView.setSystemUiVisibility(1296);
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        C79557i iVar2 = this.f238405h;
        if (iVar2 != null && (appBrandRuntimeWC = this.f238402e) != null) {
            if (appBrandRuntimeWC.mo113054f0().getStatusBar() != null) {
                i = this.f238402e.mo113054f0().getStatusBar().f233795a;
            }
            iVar2.setBarTopMargin(i);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (isFinishing()) {
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo113285E7();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        r5 = (kr0.C88267e) r4.f238402e.f238150p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.view.Window r5 = r4.getWindow()
            in3.C87773e.m109211d(r5)
            android.view.Window r5 = r4.getWindow()
            r0 = 1
            com.tencent.p014mm.p136ui.C85864g1.m106127b(r5, r0)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r4)
            r4.f238403f = r5
            r1 = 0
            r5.setBackgroundColor(r1)
            android.widget.FrameLayout r5 = r4.f238403f
            r4.setContentView(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r2 = "appId"
            java.lang.String r5 = r5.getStringExtra(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r3 = "MicroMsg.AppBrandAdUI[AppBrandSplashAd]"
            if (r2 == 0) goto L_0x003d
            java.lang.String r5 = "onCreate, appId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
            r4.finish()
            return
        L_0x003d:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r5)
            r4.f238402e = r5
            if (r5 == 0) goto L_0x0148
            boolean r5 = r5.mo113064k0()
            if (r5 == 0) goto L_0x004d
            goto L_0x0148
        L_0x004d:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r4.f238402e
            com.tencent.mm.plugin.appbrand.i2 r5 = r5.f238150p
            kr0.e r5 = (kr0.C88267e) r5
            if (r5 == 0) goto L_0x0065
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r4.f238402e
            com.tencent.mm.plugin.appbrand.i2 r5 = r5.f238150p
            kr0.e r5 = (kr0.C88267e) r5
            ai0.l r2 = r5.f255133S
            if (r2 == 0) goto L_0x0065
            r2.mo109674u()
            r2 = 0
            r5.f255133S = r2
        L_0x0065:
            ai0.i r5 = new ai0.i
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r4.f238402e
            r5.<init>(r4, r2)
            r4.f238405h = r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r4.f238402e
            r2.f238158w = r5
            r5.mo109631b()
            ai0.i r5 = r4.f238405h
            r5.setActionBarFullscreenMode(r0)
            ai0.i r5 = r4.f238405h
            ai0.b r5 = r5.f233298g
            if (r5 == 0) goto L_0x0085
            bt0.b r5 = r5.f233265d
            r5.mo109949q(r0)
        L_0x0085:
            ai0.i r5 = r4.f238405h
            ai0.b r5 = r5.f233298g
            if (r5 == 0) goto L_0x008e
            r5.mo109614d(r0)
        L_0x008e:
            ai0.i r5 = r4.f238405h
            ai0.b r5 = r5.f233298g
            if (r5 == 0) goto L_0x0097
            r5.mo109613a(r0)
        L_0x0097:
            ai0.i r5 = r4.f238405h
            android.content.res.Resources r2 = r4.getResources()
            r3 = 2131820976(0x7f1101b0, float:1.9274682E38)
            java.lang.String r2 = r2.getString(r3)
            r5.setTitle(r2)
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r2 = -1
            if (r5 == 0) goto L_0x00bb
            ai0.i r5 = r4.f238405h
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r0)
            ai0.i r5 = r4.f238405h
            r5.setForegroundStyle(r1)
            goto L_0x00c5
        L_0x00bb:
            ai0.i r5 = r4.f238405h
            r5.setBackgroundColor(r2)
            ai0.i r5 = r4.f238405h
            r5.setForegroundStyle(r0)
        L_0x00c5:
            ai0.i r5 = r4.f238405h
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$c r0 = new com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$c
            r0.<init>(r4)
            r5.setBackButtonClickListener(r0)
            ai0.i r5 = r4.f238405h
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$d r0 = new com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$d
            r0.<init>(r4)
            r5.setCloseButtonClickListener(r0)
            ai0.i r5 = r4.f238405h
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$e r0 = new com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$e
            r0.<init>(r4)
            r5.setOptionButtonClickListener(r0)
            ai0.i r5 = r4.f238405h
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$f r0 = new com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$f
            r0.<init>(r4)
            r5.setOnHideListener(r0)
            ai0.i r5 = r4.f238405h
            r5.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()
            if (r0 == 0) goto L_0x00ff
            r5.setVisibility(r1)
            r5.bringToFront()
            goto L_0x0107
        L_0x00ff:
            ai0.g r0 = new ai0.g
            r0.<init>(r5)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x0107:
            ai0.i r5 = r4.f238405h
            if (r5 == 0) goto L_0x0120
            android.view.ViewGroup r5 = r5.getContentContainer()
            if (r5 != 0) goto L_0x0112
            goto L_0x0120
        L_0x0112:
            ai0.i r5 = r4.f238405h
            android.view.ViewGroup r5 = r5.getContentContainer()
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$a r0 = new com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$a
            r0.<init>(r4)
            r5.addOnLayoutChangeListener(r0)
        L_0x0120:
            android.widget.FrameLayout r5 = r4.f238403f
            ai0.i r0 = r4.f238405h
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r2, r2)
            r5.addView(r0, r1)
            r4.mo113285E7()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.ad.ui.AppBrandCloseAppBrandAdUIEvent> r5 = r4.f238406i
            r5.alive()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r4.f238402e
            com.tencent.mm.plugin.appbrand.b r5 = r5.f238295w1
            com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$g r0 = new com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI$$g
            r0.<init>(r4)
            r5.mo113817f(r0)
            int r5 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318644a
            int r0 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318645b
            r4.overridePendingTransition(r5, r0)
            return
        L_0x0148:
            java.lang.String r5 = "onCreate, runtime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r0 = (kr0.C88267e) r5.f238402e.f238150p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r5 = this;
            super.onDestroy()
            java.lang.String r0 = "MicroMsg.AppBrandAdUI[AppBrandSplashAd]"
            java.lang.String r1 = "onDestroy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.ad.ui.AppBrandCloseAppBrandAdUIEvent> r0 = r5.f238406i
            r1 = 0
            if (r0 == 0) goto L_0x0014
            r0.dead()
            r5.f238406i = r1
        L_0x0014:
            com.tencent.mm.plugin.appbrand.ad.ui.e r0 = r5.f238404g
            r2 = 0
            if (r0 == 0) goto L_0x002c
            r3 = 1
            qo3.n r0 = r0.f238425b     // Catch:{ Exception -> 0x0020 }
            r0.mo107572p()     // Catch:{ Exception -> 0x0020 }
            goto L_0x002c
        L_0x0020:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = "MicroMsg.AppBrandAdActionSheet"
            java.lang.String r4 = "hide exception = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r3)
        L_0x002c:
            ai0.i r0 = r5.f238405h
            if (r0 == 0) goto L_0x005d
            java.lang.String r3 = "menu"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()
            if (r4 == 0) goto L_0x003c
            r0.mo109630a(r2, r3)
            goto L_0x0044
        L_0x003c:
            ai0.h r4 = new ai0.h
            r4.<init>(r0, r2, r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r4)
        L_0x0044:
            ai0.i r0 = r5.f238405h
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x005b
            ai0.i r0 = r5.f238405h
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            ai0.i r2 = r5.f238405h
            r0.removeView(r2)
        L_0x005b:
            r5.f238405h = r1
        L_0x005d:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r5.f238402e
            if (r0 == 0) goto L_0x0078
            r0.f238158w = r1
            com.tencent.mm.plugin.appbrand.i2 r0 = r0.f238150p
            kr0.e r0 = (kr0.C88267e) r0
            if (r0 == 0) goto L_0x0078
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r5.f238402e
            com.tencent.mm.plugin.appbrand.i2 r0 = r0.f238150p
            kr0.e r0 = (kr0.C88267e) r0
            ai0.l r2 = r0.f255133S
            if (r2 == 0) goto L_0x0078
            r2.mo109674u()
            r0.f255133S = r1
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI.onDestroy():void");
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onPause");
        C81132e eVar = this.f238404g;
        if (eVar != null) {
            try {
                eVar.f238425b.mo107572p();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandAdActionSheet", "hide exception = %s", e);
            }
        }
        if (this.f238402e != null) {
            C81116f fVar = new C81116f();
            fVar.f238391i = "menu";
            fVar.mo113281s((C88267e) this.f238402e.f238150p);
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.AppBrandAdUI[AppBrandSplashAd]", "onResume");
        if (this.f238402e != null) {
            C81118g gVar = new C81118g();
            gVar.f238395i = "menu";
            gVar.mo113282s((C88267e) this.f238402e.f238150p);
        }
    }
}
