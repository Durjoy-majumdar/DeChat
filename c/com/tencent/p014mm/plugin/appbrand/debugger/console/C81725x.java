package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.view.View;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.x */
public final class C81725x {

    /* renamed from: a */
    public static boolean f239845a;

    /* renamed from: b */
    public static final C55463j f239846b;

    /* renamed from: c */
    public static final C81717t f239847c;

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.x$a */
    public static final class C81726a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C81726a f239848d = new C81726a();

        public C81726a() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.AppBrand.FloatConsolePrinter", "onClick#controlFloatWindow");
            if (C81725x.f239845a) {
                C81717t tVar = C81725x.f239847c;
                tVar.getClass();
                Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "show, isShown: " + tVar.f239831g);
                if (!tVar.f239831g) {
                    try {
                        WindowManager windowManager = (WindowManager) ((C36570n) tVar.f239827c).getValue();
                        if (windowManager != null) {
                            windowManager.addView((View) ((C36570n) tVar.f239829e).getValue(), (WindowManager.LayoutParams) ((C36570n) tVar.f239830f).getValue());
                            C13598b0 b0Var = C13598b0.f38549a;
                            ((C81707l) ((C36570n) tVar.f239828d).getValue()).mo114068b();
                            tVar.f239831g = true;
                        }
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "show, addView fail since " + e);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.x$b */
    public static final class C81727b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C81727b f239849d = new C81727b();

        public C81727b() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.AppBrand.FloatConsolePrinter", "onShown#printFloatWindow");
            C81725x.f239846b.mo76979c();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.x$c */
    public static final class C81728c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C81728c f239850d = new C81728c();

        public C81728c() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.AppBrand.FloatConsolePrinter", "onHidden#printFloatWindow");
            C81725x.f239847c.mo114083b();
            if (C81725x.f239845a) {
                C81725x.f239846b.mo76980d();
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C55463j jVar = new C55463j((C32224a) null, 1, (C8480h) null);
        f239846b = jVar;
        C81717t tVar = new C81717t((C32224a) null, (C32224a) null, 3, (C8480h) null);
        f239847c = tVar;
        jVar.f158036a = C81726a.f239848d;
        tVar.f239825a = C81727b.f239849d;
        tVar.f239826b = C81728c.f239850d;
    }
}
