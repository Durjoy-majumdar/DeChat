package kr0;

import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83172l;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p248ug.C90659e0;
import p284zb.C91627a;
import p284zb.C91635f;
import p284zb.C91640i;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: kr0.m1 */
public final class C88279m1 implements C88269e1 {

    /* renamed from: a */
    public final C81925i2 f255186a;

    /* renamed from: b */
    public final C13601g f255187b = C36568h.m40985a(new C88281b(this));

    /* renamed from: c */
    public final C13601g f255188c = C36568h.m40985a(new C88282c(this));

    /* renamed from: d */
    public final C13601g f255189d = C36568h.m40985a(new C88280a(this));

    /* renamed from: kr0.m1$a */
    public static final class C88280a extends C87413o implements C32224a<C88276j1> {

        /* renamed from: d */
        public final /* synthetic */ C88279m1 f255190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88280a(C88279m1 m1Var) {
            super(0);
            this.f255190d = m1Var;
        }

        public Object invoke() {
            if (this.f255190d.mo122660b() == null || this.f255190d.mo122661c() == null) {
                return null;
            }
            C90659e0 b = this.f255190d.mo122660b();
            C87412m.m108591d(b);
            AppBrandCommonBindingJni c = this.f255190d.mo122661c();
            C87412m.m108591d(c);
            return new C88276j1(b, c, new C88278l1(this.f255190d));
        }
    }

    /* renamed from: kr0.m1$b */
    public static final class C88281b extends C87413o implements C32224a<C90659e0> {
        public C88281b(C88279m1 m1Var) {
            super(0);
        }

        public Object invoke() {
            C90659e0 e0Var = (C90659e0) C86312j.m106911c(C90659e0.class);
            if (e0Var != null) {
                return e0Var;
            }
            Log.m105920e("MicroMsg.WxaServiceDevToolsLogicImpl", "devToolsService#get, devToolsService is null");
            return null;
        }
    }

    /* renamed from: kr0.m1$c */
    public static final class C88282c extends C87413o implements C32224a<AppBrandCommonBindingJni> {

        /* renamed from: d */
        public final /* synthetic */ C88279m1 f255191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88282c(C88279m1 m1Var) {
            super(0);
            this.f255191d = m1Var;
        }

        public Object invoke() {
            C91640i<? extends C91635f> iVar;
            C91627a h0;
            AppBrandCommonBindingJni appBrandCommonBindingJni;
            C81925i2 i2Var = this.f255191d.f255186a;
            C91635f fVar = i2Var instanceof C91635f ? (C91635f) i2Var : null;
            if (fVar != null && (iVar = fVar.f262593H) != null && (h0 = iVar.mo125522h0()) != null && (appBrandCommonBindingJni = h0.f262484a) != null) {
                return appBrandCommonBindingJni;
            }
            Log.m105920e("MicroMsg.WxaServiceDevToolsLogicImpl", "inspectorAccessible#get, inspectorAccessible is null");
            return null;
        }
    }

    /* renamed from: kr0.m1$d */
    public static final class C88283d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88279m1 f255192d;

        /* renamed from: e */
        public final /* synthetic */ C83172l f255193e;

        public C88283d(C88279m1 m1Var, C83172l lVar) {
            this.f255192d = m1Var;
            this.f255193e = lVar;
        }

        public final void run() {
            AppBrandCommonBindingJni c = this.f255192d.mo122661c();
            C87412m.m108591d(c);
            c.startInspectorOnJS();
            C83172l lVar = this.f255193e;
            if (lVar != null) {
                lVar.mo115412h();
            }
        }
    }

    public C88279m1(C81925i2 i2Var) {
        this.f255186a = i2Var;
    }

    /* renamed from: a */
    public final C88276j1 mo122659a() {
        return (C88276j1) ((C36570n) this.f255189d).getValue();
    }

    /* renamed from: b */
    public final C90659e0 mo122660b() {
        return (C90659e0) ((C36570n) this.f255187b).getValue();
    }

    /* renamed from: c */
    public final AppBrandCommonBindingJni mo122661c() {
        return (AppBrandCommonBindingJni) ((C36570n) this.f255188c).getValue();
    }

    /* renamed from: e */
    public void mo122655e(String str) {
        Log.m105926v("MicroMsg.WxaServiceDevToolsLogicImpl", "onInspectorMsg, msg: " + str);
        if (mo122660b() != null && mo122659a() != null) {
            C90659e0 b = mo122660b();
            C87412m.m108591d(b);
            b.mo124804t6(mo122659a(), str);
        }
    }

    /* renamed from: f */
    public void mo122656f(C83165i iVar) {
        C87412m.m108594g(iVar, "jsRuntime");
        Log.m105924i("MicroMsg.WxaServiceDevToolsLogicImpl", "onJsRuntimeCreate");
        if (mo122660b() != null && mo122659a() != null) {
            C90659e0 b = mo122660b();
            C87412m.m108591d(b);
            C88276j1 a = mo122659a();
            C87412m.m108591d(a);
            b.Ap0(a);
        }
    }

    /* renamed from: g */
    public void mo122657g() {
        Log.m105924i("MicroMsg.WxaServiceDevToolsLogicImpl", "postJsRuntimeCreate");
        if (mo122660b() != null && mo122661c() != null && mo122659a() != null) {
            C81925i2 i2Var = this.f255186a;
            C83165i jsRuntime = i2Var != null ? i2Var.getJsRuntime() : null;
            if (jsRuntime != null) {
                C80669j.f236038j = true;
                C83172l lVar = (C83172l) jsRuntime.mo63321n0(C83172l.class);
                if (lVar != null) {
                    lVar.mo115399T0("console");
                }
                if (C88284n1.f255195b) {
                    Log.m105924i("MicroMsg.WxaServiceDevToolsLogicImpl", "onJsRuntimeCreate, waitForDebugger");
                    C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
                    if (qVar != null) {
                        qVar.mo115423q0(new C88283d(this, lVar));
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void mo122658h() {
        Log.m105924i("MicroMsg.WxaServiceDevToolsLogicImpl", "beforeWxaServiceCleanup");
        if (mo122660b() != null && mo122659a() != null) {
            C90659e0 b = mo122660b();
            C87412m.m108591d(b);
            C88276j1 a = mo122659a();
            C87412m.m108591d(a);
            b.mo124802AE(a);
        }
    }
}
