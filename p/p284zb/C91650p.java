package p284zb;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: zb.p */
public final class C91650p implements C91646m {

    /* renamed from: a */
    public final C81925i2 f262625a;

    /* renamed from: b */
    public final C83185u f262626b;

    /* renamed from: c */
    public volatile Object f262627c;

    /* renamed from: zb.p$a */
    public static final class C91651a<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C91650p f262628a;

        /* renamed from: b */
        public final /* synthetic */ C40480g f262629b;

        /* renamed from: zb.p$a$a */
        public static final class C91652a implements C83174m.C83175a {

            /* renamed from: d */
            public final /* synthetic */ C91650p f262630d;

            /* renamed from: e */
            public final /* synthetic */ C40480g f262631e;

            /* renamed from: f */
            public final /* synthetic */ Object f262632f;

            public C91652a(C91650p pVar, C40480g gVar, Object obj) {
                this.f262630d = pVar;
                this.f262631e = gVar;
                this.f262632f = obj;
            }

            public final void onDestroy() {
                this.f262630d.f262627c = null;
                this.f262631e.mo63258L0(this.f262632f);
            }
        }

        public C91651a(C91650p pVar, C40480g gVar) {
            this.f262628a = pVar;
            this.f262629b = gVar;
        }

        public final void onReceiveValue(Object obj) {
            this.f262628a.f262627c = obj;
            if (obj == null) {
                Log.m105920e("MicroMsg.AppBrand.JSContextInterfaceSharer", "onJSContextInterfaceInjected, value is null");
                return;
            }
            C83165i jsRuntime = this.f262628a.f262625a.getJsRuntime();
            C83174m mVar = jsRuntime != null ? (C83174m) jsRuntime.mo63321n0(C83174m.class) : null;
            if (mVar == null) {
                Log.m105920e("MicroMsg.AppBrand.JSContextInterfaceSharer", "onJSContextInterfaceInjected, addOn is null");
            } else {
                mVar.mo115384z0(new C91652a(this.f262628a, this.f262629b, obj));
            }
        }
    }

    public C91650p(C81925i2 i2Var, C83185u uVar) {
        C87412m.m108594g(i2Var, "env");
        C87412m.m108594g(uVar, "contextManager");
        this.f262625a = i2Var;
        this.f262626b = uVar;
    }

    /* renamed from: a */
    public void mo125538a(C40480g gVar) {
        C87412m.m108594g(gVar, "context");
        Object obj = this.f262627c;
        if (obj == null) {
            Log.m105920e("MicroMsg.AppBrand.JSContextInterfaceSharer", "shareTo, sharedObject is null");
        } else {
            gVar.mo63261k0("WeixinJSContext", obj);
        }
    }

    /* renamed from: b */
    public void mo125539b() {
        C40480g z = this.f262626b.mo115383z();
        z.mo63257K("WeixinJSContext", new C91651a(this, z));
    }
}
