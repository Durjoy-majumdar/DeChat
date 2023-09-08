package com.tencent.p014mm.plugin.appbrand.p026ui;

import ai0.C79550b;
import ai0.C79556h;
import ai0.C79557i;
import ai0.C79560j;
import ai0.C79570o;
import ai0.C79575q;
import ai0.C79580u;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83291b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import cr0.C86127t;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.d */
public class C84518d extends FrameLayout implements C84560k4, C84563l4, C84567n4, C84565m4, C83291b1 {

    /* renamed from: d */
    public AppBrandRuntimeWC f246656d;

    /* renamed from: e */
    public C84560k4 f246657e;

    /* renamed from: f */
    public C79557i f246658f;

    /* renamed from: g */
    public C79580u f246659g;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.d$a */
    public class C84519a implements Runnable {
        public C84519a() {
        }

        public void run() {
            if (C84518d.this.getParent() instanceof ViewGroup) {
                Log.m105924i("MicroMsg.AppBrandAdLoadingSplash", "remove AdLoadingSplash");
                C84518d.this.setVisibility(8);
                ((ViewGroup) C84518d.this.getParent()).removeView(C84518d.this);
                C84518d.this.f246656d.f238154s = null;
            }
        }
    }

    public C84518d(Context context, AppBrandRuntime appBrandRuntime, C84560k4 k4Var, C79580u uVar) {
        super(context);
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) appBrandRuntime;
        this.f246656d = appBrandRuntimeWC;
        this.f246657e = k4Var;
        this.f246659g = uVar;
        Log.m105925i("MicroMsg.AppBrandAdLoadingSplash", "initRuntimeAdViewContainer, runtime:%s", appBrandRuntimeWC);
        C79557i iVar = new C79557i(context, appBrandRuntimeWC);
        this.f246658f = iVar;
        iVar.mo109631b();
        C79550b bVar = this.f246658f.f233298g;
        if (bVar != null) {
            bVar.mo109614d(true);
        }
        this.f246658f.setForegroundStyle(false);
        this.f246658f.setCloseButtonClickListener(new C84479a(this));
        this.f246658f.setOnHideListener(new C84483b(this));
        this.f246658f.setOptionButtonClickListener(new C40548c(this));
        C84560k4 k4Var2 = this.f246657e;
        if (k4Var2 != null) {
            addView(k4Var2.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        C79557i iVar2 = this.f246658f;
        if (iVar2 != null) {
            addView(iVar2, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* renamed from: A */
    public boolean mo117193A() {
        C79557i iVar = this.f246658f;
        return iVar != null && indexOfChild(iVar) >= 0 && this.f246658f.getVisibility() == 0 && C79570o.m96621a(this.f246656d).f233267a;
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        C84560k4 k4Var = this.f246657e;
        if (k4Var != null) {
            k4Var.mo1911D(aVar);
        }
    }

    /* renamed from: F */
    public void mo117194F(C32224a<C13598b0> aVar) {
        C84560k4 k4Var = this.f246657e;
        if (k4Var instanceof C84565m4) {
            ((C84565m4) k4Var).mo117194F(aVar);
        }
    }

    /* renamed from: K */
    public void mo113179K(int i) {
        C84560k4 k4Var = this.f246657e;
        if (k4Var instanceof C83291b1) {
            ((C83291b1) k4Var).mo113179K(i);
        }
    }

    /* renamed from: a */
    public final void mo117195a(Configuration configuration) {
        if (this.f246656d.mo113054f0() instanceof C86127t) {
            Activity w = ((C86127t) this.f246656d.mo113054f0()).mo120548w();
            boolean z = configuration.orientation == 2;
            if ((!z || w == null || Build.VERSION.SDK_INT < 24 || !w.isInMultiWindowMode() || w.getRequestedOrientation() != 1) && w != null) {
                Window window = w.getWindow();
                View decorView = window.getDecorView();
                if (z) {
                    window.addFlags(1024);
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4 | 256);
                } else if (!this.f246656d.mo121254q1()) {
                    C84545i3.m104130g(window, false, false);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo117196d() {
        C79557i iVar = this.f246658f;
        if (iVar == null) {
            return;
        }
        if (MMHandlerThread.isMainThread()) {
            iVar.setVisibility(8);
        } else {
            MMHandlerThread.postToMainThread(new C79560j(iVar));
        }
    }

    /* renamed from: e */
    public void mo117197e(C32224a<C13598b0> aVar) {
        C79580u uVar = this.f246659g;
        if (uVar != null) {
            C79575q qVar = (C79575q) uVar;
            Log.m105925i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "hideLoadingSplashFromRuntime, isSplashAdFinished:%s, canLoadingSplashFinish:%s", Boolean.valueOf(qVar.f233339j), Boolean.valueOf(qVar.f233340k));
            qVar.f233340k = true;
            if (!C79575q.m96625h(qVar.f233331b)) {
                qVar.mo109688f((C32224a<C13598b0>) null);
            } else if (qVar.f233334e == 1) {
                qVar.mo109688f((C32224a<C13598b0>) null);
            }
            qVar.mo109683a();
        }
    }

    public C84560k4 getInternalLoadingSplash() {
        return this.f246657e;
    }

    public int getProgress() {
        C84560k4 k4Var = this.f246657e;
        if (k4Var instanceof C84690v2) {
            return ((C84690v2) k4Var).getProgress();
        }
        return -2;
    }

    public C79557i getRuntimeAdViewContainer() {
        return this.f246658f;
    }

    public View getView() {
        return this;
    }

    /* renamed from: k */
    public void mo117201k(boolean z, String str) {
        C79557i iVar = this.f246658f;
        if (iVar == null) {
            return;
        }
        if (MMHandlerThread.isMainThread()) {
            iVar.mo109630a(z, str);
        } else {
            MMHandlerThread.postToMainThread(new C79556h(iVar, z, str));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (C79575q.m96625h(this.f246656d)) {
                C79557i iVar = this.f246658f;
                iVar.getClass();
                if (MMHandlerThread.isMainThread()) {
                    iVar.setVisibility(8);
                } else {
                    MMHandlerThread.postToMainThread(new C79560j(iVar));
                }
            }
            mo117195a(getContext().getResources().getConfiguration());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandAdLoadingSplash", "onAttachedToWindow exception", e);
        }
    }

    /* renamed from: q */
    public void mo1912q(String str, String str2) {
        C84560k4 k4Var = this.f246657e;
        if (k4Var != null) {
            k4Var.mo1912q(str, str2);
        }
    }

    /* renamed from: r */
    public void mo1913r(int i) {
        C84560k4 k4Var = this.f246657e;
        if (k4Var != null) {
            k4Var.mo1913r(i);
        }
    }

    public void setCanShowHideAnimation(boolean z) {
        C84560k4 k4Var = this.f246657e;
        if (k4Var instanceof C84567n4) {
            ((C84567n4) k4Var).setCanShowHideAnimation(z);
        }
    }

    public void setProgress(int i) {
        C84560k4 k4Var = this.f246657e;
        if (k4Var != null) {
            k4Var.setProgress(i);
        }
    }

    /* renamed from: w */
    public void mo117204w() {
        this.f246656d.mo113024P0(new C84519a());
    }
}
