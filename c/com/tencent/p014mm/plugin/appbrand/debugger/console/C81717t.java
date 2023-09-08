package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.view.View;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.t */
public final class C81717t {

    /* renamed from: a */
    public C32224a<C13598b0> f239825a;

    /* renamed from: b */
    public C32224a<C13598b0> f239826b;

    /* renamed from: c */
    public final C13601g f239827c;

    /* renamed from: d */
    public final C13601g f239828d;

    /* renamed from: e */
    public final C13601g f239829e;

    /* renamed from: f */
    public final C13601g f239830f;

    /* renamed from: g */
    public boolean f239831g;

    /* renamed from: h */
    public final C13601g f239832h;

    public C81717t(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, int i, C8480h hVar) {
        aVar = (i & 1) != 0 ? null : aVar;
        aVar2 = (i & 2) != 0 ? null : aVar2;
        this.f239825a = aVar;
        this.f239826b = aVar2;
        this.f239827c = C36568h.m40985a(C1527s.f10897d);
        this.f239828d = C36568h.m40985a(new C81713n(this));
        this.f239829e = C36568h.m40985a(new C81716r(this));
        this.f239830f = C36568h.m40985a(C55464m.f158043d);
        this.f239832h = C36568h.m40985a(new C81714o(this));
    }

    /* renamed from: a */
    public final C81718u mo114082a() {
        return (C81718u) ((C36570n) this.f239832h).getValue();
    }

    /* renamed from: b */
    public final void mo114083b() {
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "hide, isShown: " + this.f239831g);
        if (this.f239831g) {
            try {
                WindowManager windowManager = (WindowManager) ((C36570n) this.f239827c).getValue();
                if (windowManager != null) {
                    windowManager.removeView((View) ((C36570n) this.f239829e).getValue());
                    C13598b0 b0Var = C13598b0.f38549a;
                    this.f239831g = false;
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "hide, removeView fail since " + e);
            }
        }
    }
}
