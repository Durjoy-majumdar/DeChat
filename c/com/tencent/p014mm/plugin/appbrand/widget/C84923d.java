package com.tencent.p014mm.plugin.appbrand.widget;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.d */
public final class C84923d {

    /* renamed from: a */
    public final AppBrandRuntimeWC f247525a;

    /* renamed from: b */
    public boolean f247526b;

    /* renamed from: c */
    public final C32224a<C13598b0> f247527c = new C84924a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.d$a */
    public static final class C84924a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C84923d f247528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84924a(C84923d dVar) {
            super(0);
            this.f247528d = dVar;
        }

        public Object invoke() {
            this.f247528d.mo117748a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.d$b */
    public static final class C84925b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a f247529d;

        public C84925b(C32224a aVar) {
            this.f247529d = aVar;
        }

        public final /* synthetic */ void onGlobalLayout() {
            this.f247529d.invoke();
        }
    }

    public C84923d(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        this.f247525a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public final void mo117748a() {
        this.f247525a.getClass();
        View p = this.f247525a.f238125T0.mo116438p(1);
        View p2 = this.f247525a.f238125T0.mo116438p(2);
        if (p != null && p2 != null && p2.getTop() != p.getMeasuredHeight()) {
            p2.setY((float) p.getMeasuredHeight());
            Log.m105924i("MicroMsg.AppBrandExternalCoverWidgetManager", "set widgetContainer setY[" + p2.getTop() + ']');
        }
    }

    /* renamed from: b */
    public final void mo117749b(AppBrandInitConfigWC appBrandInitConfigWC) {
        Activity R = this.f247525a.mo113026R();
        if (R != null) {
            try {
                if (!TextUtils.isEmpty(appBrandInitConfigWC.f239395z1)) {
                    C84943i iVar = (C84943i) Class.forName(appBrandInitConfigWC.f239395z1).newInstance();
                    String str = appBrandInitConfigWC.f239371A1;
                    C87412m.m108593f(str, "initConfigWC.coverWidgetBuildData");
                    View a = iVar.mo3391a(R, str);
                    a.setLayoutParams(iVar.mo3393c());
                    this.f247525a.f238125T0.mo116409A();
                    this.f247525a.f238125T0.mo116412z(a, iVar.mo3392b());
                    mo117748a();
                    mo117752e();
                    return;
                }
                this.f247525a.f238125T0.mo116409A();
                mo117751d();
            } catch (ClassNotFoundException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandExternalCoverWidgetManager", e, "", "");
            } catch (IllegalAccessException e2) {
                Log.printErrStackTrace("MicroMsg.AppBrandExternalCoverWidgetManager", e2, "", "");
            } catch (InstantiationException e3) {
                Log.printErrStackTrace("MicroMsg.AppBrandExternalCoverWidgetManager", e3, "", "");
            }
        }
    }

    /* renamed from: c */
    public void mo117750c(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "initConfig");
        mo117749b(appBrandInitConfigWC);
    }

    /* renamed from: d */
    public final void mo117751d() {
        if (this.f247526b) {
            this.f247525a.f238125T0.mo116438p(1).getViewTreeObserver().removeOnGlobalLayoutListener(new C84925b(this.f247527c));
            this.f247526b = false;
        }
    }

    /* renamed from: e */
    public final void mo117752e() {
        if (!this.f247526b) {
            this.f247525a.f238125T0.mo116438p(1).getViewTreeObserver().addOnGlobalLayoutListener(new C84925b(this.f247527c));
            this.f247526b = true;
        }
    }
}
