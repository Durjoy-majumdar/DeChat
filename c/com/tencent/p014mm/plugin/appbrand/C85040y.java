package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.appbrand.page.C83810g4;
import com.tencent.p014mm.plugin.appbrand.page.C83854n;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.appbrand.pip.C84059t;
import com.tencent.p014mm.plugin.appbrand.pip.C84064u;
import com.tencent.p014mm.plugin.appbrand.pip.C84065v;
import com.tencent.p014mm.plugin.appbrand.utils.C84726c2;
import com.tencent.p014mm.plugin.appbrand.utils.C84734e0;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import p170ic.C87690d;
import p170ic.C87692f;
import qq0.C89794b;
import qq0.C89795c;
import qq0.C89796d;
import qq0.C89797e;
import qq0.C89803h;
import qq0.C89814s;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.y */
public class C85040y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f247816d;

    public C85040y(AppBrandRuntime appBrandRuntime) {
        this.f247816d = appBrandRuntime;
    }

    public void run() {
        if (!this.f247816d.mo113064k0()) {
            AppBrandRuntime appBrandRuntime = this.f247816d;
            boolean z = false;
            appBrandRuntime.mo113052e("initRuntimeImpl", new Object[0]);
            appBrandRuntime.f238162y0 = Util.currentTicks();
            appBrandRuntime.mo113062j0(false);
            appBrandRuntime.mo113085v0();
            if (!appBrandRuntime.f238117P && !appBrandRuntime.mo113064k0()) {
                appBrandRuntime.f238150p = appBrandRuntime.mo113080t();
                appBrandRuntime.f238150p.mo114096z0(appBrandRuntime);
                appBrandRuntime.f238115M = appBrandRuntime.mo113074q();
                AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView = new AppBrandGlobalNativeWidgetContainerView(appBrandRuntime.f238141d);
                appBrandRuntime.f238123S0 = appBrandGlobalNativeWidgetContainerView;
                appBrandRuntime.f238125T0 = new C83854n(appBrandGlobalNativeWidgetContainerView);
                C81932i4.GlobalNativeWidgetContainerView.mo114355a(appBrandRuntime, appBrandRuntime.f238123S0);
                C89797e n = appBrandRuntime.mo113068n();
                appBrandRuntime.f238159x = n;
                C83810g4 S = n.f258186a.mo113028S();
                if (S == null) {
                    S = new C83810g4.C83811a();
                }
                Context context = n.f258186a.f238141d;
                C87412m.m108593f(context, "runtime.appContext");
                View a = S.mo116271a(context, C89796d.class);
                C87412m.m108593f(a, "widgetFactory.onCreateWi…eBarImplView::class.java)");
                C89796d dVar = (C89796d) a;
                n.f258188c = dVar;
                AppBrandRuntime appBrandRuntime2 = n.f258186a;
                AppBrandOptionButton optionBtn = dVar.getOptionBtn();
                C87412m.m108593f(optionBtn, "capsuleBarView.optionBtn");
                C89814s sVar = new C89814s(optionBtn);
                n.f258191f = sVar;
                AppBrandRuntime appBrandRuntime3 = n.f258186a;
                C89803h hVar = new C89803h(n);
                C87412m.m108594g(appBrandRuntime3, "<this>");
                C87692f fVar = new C87692f();
                hVar.invoke(fVar);
                appBrandRuntime3.f238113K.mo122978a(fVar);
                C13598b0 b0Var = C13598b0.f38549a;
                n.f258192g = new C89794b(appBrandRuntime2, sVar);
                View a2 = S.mo116271a(context, C89795c.class);
                C87412m.m108593f(a2, "widgetFactory.onCreateWi…tainerLayout::class.java)");
                n.f258187b = (C89795c) a2;
                C89795c b = n.mo124089b();
                C89796d dVar2 = n.f258188c;
                if (dVar2 != null) {
                    b.addView(dVar2);
                    C83854n nVar = n.f258186a.f238125T0;
                    C89795c b2 = n.mo124089b();
                    ViewGroup o = nVar.mo116437o(0, false, false);
                    Objects.requireNonNull(o);
                    o.addView(b2, -1, -2);
                    nVar.mo116430h(new C83873p2.C83880g(b2, 1, 0, 1000, true, false, false));
                    boolean X0 = appBrandRuntime.mo113039X0();
                    appBrandRuntime.mo113052e("initRuntimeImpl, initServiceBeforePage:%b", Boolean.valueOf(X0));
                    if (X0) {
                        C87690d.m109091b(appBrandRuntime.f238147j + ":performInitService", new C81106a0(appBrandRuntime));
                        C87690d.m109091b(appBrandRuntime.f238147j + ":performInitPageContainer", new C85045z(appBrandRuntime));
                    } else {
                        C87690d.m109091b(appBrandRuntime.f238147j + ":performInitPageContainer", new C85045z(appBrandRuntime));
                        C87690d.m109091b(appBrandRuntime.f238147j + ":performInitService", new C81106a0(appBrandRuntime));
                    }
                    C84059t tVar = new C84059t(appBrandRuntime.f238141d, appBrandRuntime);
                    appBrandRuntime.f238119Q0 = tVar;
                    if (tVar.f245419e == null) {
                        AppBrandPipContainerView appBrandPipContainerView = new AppBrandPipContainerView(tVar.f245416b, (AttributeSet) null);
                        tVar.f245419e = appBrandPipContainerView;
                        appBrandPipContainerView.setVisibility(4);
                        tVar.f245419e.setOnCloseButtonClickListener(new C84064u(tVar));
                        tVar.f245419e.setOnClickListener(new C84065v(tVar));
                        tVar.mo116710g();
                    }
                    AppBrandPipContainerView appBrandPipContainerView2 = tVar.f245419e;
                    appBrandRuntime.f238121R0 = appBrandPipContainerView2;
                    C81932i4.PipContainer.mo114355a(appBrandRuntime, appBrandPipContainerView2);
                    ViewGroup.LayoutParams layoutParams = appBrandRuntime.f238121R0.getLayoutParams();
                    layoutParams.width = AppBrandPipContainerView.f247454J;
                    layoutParams.height = AppBrandPipContainerView.f247455K;
                    appBrandRuntime.f238121R0.setLayoutParams(layoutParams);
                    C81932i4.LegacyDialogContainer.mo114355a(appBrandRuntime, appBrandRuntime.f238156u);
                    appBrandRuntime.f238156u.setShouldBringSelfToFrontWhenDialogShown(false);
                    C81932i4.AuthorizeDialogContainer.mo114355a(appBrandRuntime, appBrandRuntime.f238157v);
                    appBrandRuntime.f238157v.setShouldBringSelfToFrontWhenDialogShown(false);
                    C84734e0 e0Var = appBrandRuntime.f238112J;
                    e0Var.f247134b = appBrandRuntime.f238150p;
                    Log.m105924i("MicroMsg.AppBrandUserCaptureScreenMonitor", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                    try {
                        ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), e0Var.f247133a);
                    } catch (SecurityException e) {
                        Log.printErrStackTrace("MicroMsg.AppBrandUserCaptureScreenMonitor", e, "[NOT CRASH] init set callback", new Object[0]);
                    }
                    appBrandRuntime.f238140c1 = new C84726c2(appBrandRuntime);
                    appBrandRuntime.mo113019M0();
                    appBrandRuntime.mo113052e("initRuntimeImpl end", new Object[0]);
                    appBrandRuntime.mo113092z0();
                    z = true;
                } else {
                    C87412m.m108603p("capsuleBarView");
                    throw null;
                }
            }
            if (z) {
                this.f247816d.f238116N = true;
                AppBrandRuntime appBrandRuntime4 = this.f247816d;
                while (!appBrandRuntime4.f238138a1.isEmpty()) {
                    appBrandRuntime4.mo113024P0((Runnable) ((LinkedBlockingDeque) appBrandRuntime4.f238138a1).removeFirst());
                }
            }
            this.f247816d.f238137Z0.stopTimer();
        }
    }
}
