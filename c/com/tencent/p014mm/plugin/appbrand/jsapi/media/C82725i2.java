package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82721h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.i2 */
public final class C82725i2 implements C82721h0 {

    /* renamed from: e */
    public static final C82726a f242039e = new C82726a((C8480h) null);

    /* renamed from: a */
    public final C82724i0.C29521a f242040a;

    /* renamed from: b */
    public final String f242041b = ("MicroMsg.AppBrand.WxaAudioFocusComponent#" + hashCode());

    /* renamed from: c */
    public final C13601g f242042c;

    /* renamed from: d */
    public volatile C82724i0.C29522b f242043d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.i2$a */
    public static final class C82726a implements C82721h0.C82722a {
        public C82726a(C8480h hVar) {
        }

        /* renamed from: a */
        public C82721h0 mo115004a(C32224a aVar, C82724i0.C29521a aVar2) {
            C87412m.m108594g(aVar, "hostProvider");
            return new C82725i2(new C1735h2(aVar), aVar2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.i2$b */
    public static final class C82727b extends C87413o implements C32224a<C82724i0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<AppBrandRuntime> f242044d;

        /* renamed from: e */
        public final /* synthetic */ C82725i2 f242045e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82727b(C32224a<? extends AppBrandRuntime> aVar, C82725i2 i2Var) {
            super(0);
            this.f242044d = aVar;
            this.f242045e = i2Var;
        }

        public Object invoke() {
            AppBrandRuntime invoke = this.f242044d.invoke();
            if (invoke != null) {
                return C82702d.f241996e.mo56770i2(invoke);
            }
            Log.m105920e(this.f242045e.f242041b, "service#get, runtime is null ");
            return null;
        }
    }

    public C82725i2(C32224a<? extends AppBrandRuntime> aVar, C82724i0.C29521a aVar2) {
        C87412m.m108594g(aVar, "runtimeProvider");
        this.f242040a = aVar2;
        this.f242042c = C36568h.m40985a(new C82727b(aVar, this));
    }

    /* renamed from: L */
    public boolean mo115002L() {
        if (((C82724i0) ((C36570n) this.f242042c).getValue()) == null) {
            Log.m105920e(this.f242041b, "abandonFocus, service is null");
            return false;
        }
        C82724i0.C29522b bVar = this.f242043d;
        if (bVar == null) {
            return false;
        }
        C82724i0 i0Var = (C82724i0) ((C36570n) this.f242042c).getValue();
        C87412m.m108591d(i0Var);
        boolean i = i0Var.mo56767i(bVar);
        String str = this.f242041b;
        Log.m105924i(str, "abandonFocus, abandoned: " + i);
        if (i) {
            this.f242043d = null;
        }
        return i;
    }

    public boolean requestFocus() {
        if (((C82724i0) ((C36570n) this.f242042c).getValue()) == null) {
            Log.m105920e(this.f242041b, "requestFocus, service is null");
            return false;
        }
        C82724i0 i0Var = (C82724i0) ((C36570n) this.f242042c).getValue();
        C87412m.m108591d(i0Var);
        C82724i0.C29522b v = i0Var.mo56768v(this.f242040a);
        boolean a = v.mo56769a();
        String str = this.f242041b;
        Log.m105924i(str, "requestFocus, gainFocus: " + a);
        if (a) {
            this.f242043d = v;
        }
        return a;
    }
}
