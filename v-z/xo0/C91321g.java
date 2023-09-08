package xo0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81274j2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.launching.C83496u2;
import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import lp3.C88629c;
import nr3.C89059e;
import nr3.C89060f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import rp0.C90077a;
import te3.C49335eu3;
import te3.C90422jy;
import te3.C90444vm2;
import te3.C90446wm2;
import te3.p45;
import te3.u55;

/* renamed from: xo0.g */
public final class C91321g extends C89132b<C90446wm2> {

    /* renamed from: i */
    public final String f261941i;

    /* renamed from: j */
    public final String f261942j;

    /* renamed from: xo0.g$a */
    public static final class C91322a<_Ret> implements C88629c.C88630a {

        /* renamed from: a */
        public final /* synthetic */ C91321g f261943a;

        public C91322a(C91321g gVar) {
            this.f261943a = gVar;
        }

        public Object call() {
            return C89132b.C89134c.m111401a(3, -2, "EMPTY USERNAME", new C90446wm2(), (C117747y) null, this.f261943a);
        }
    }

    public C91321g(String str, String str2) {
        this.f261941i = str;
        this.f261942j = str2;
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C90446wm2 wm22 = (C90446wm2) eu32;
        Log.m105924i("MicroMsg.AppBrand.CgiPrefetchLaunchWxaApp", "onCgiBack, instance[" + hashCode() + "] errType[" + i + "] errCode[" + i2 + "] errMsg[" + str + "], accHasReady[" + C86709a0.m107522a() + ']');
        if (C86709a0.m107522a()) {
            String str2 = wm22 != null ? wm22.f259928j : null;
            if (!(str2 == null || str2.length() == 0) && C90077a.m112678a(i, i2, wm22)) {
                C81161g2.requireAccountInitializedOnDemand();
                C83496u2 u2Var = C81161g2.f238475n;
                C87412m.m108591d(wm22);
                String str3 = wm22.f259928j;
                C87412m.m108591d(str3);
                u2Var.mo115787Lo(str3, wm22);
            }
        }
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C90446wm2>> mo9225i() {
        String str = this.f261941i;
        if (str == null || str.length() == 0) {
            return C89060f.m111325d(new C91322a(this));
        }
        Log.m105924i("MicroMsg.AppBrand.CgiPrefetchLaunchWxaApp", "run() with username[" + this.f261941i + "] enterPath[" + this.f261942j + "] instance[" + hashCode() + ']');
        C47350c.C47352b bVar = new C47350c.C47352b();
        C90444vm2 vm22 = new C90444vm2();
        vm22.f259890q = this.f261941i;
        p45 p45 = new p45();
        p45.f259734g = this.f261942j;
        vm22.f259881e = p45;
        vm22.f259891r = true;
        vm22.f259892s = true;
        u55 u55 = new u55();
        ICommLibReader a = C81274j2.m99632a();
        u55.f259849d = a != null ? a.mo113371a() : -1;
        vm22.f259884h = u55;
        C90422jy jyVar = new C90422jy();
        jyVar.f259641f = 1;
        vm22.f259896w = jyVar;
        bVar.f127066a = vm22;
        bVar.f127069d = 1122;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        bVar.f127067b = new C90446wm2();
        C47350c a2 = bVar.mo72403a();
        C47465a aVar = a2.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        CgiLaunchWxaApp.m102253w((C90444vm2) aVar);
        C47465a aVar2 = a2.f127055a.f127080a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        CgiLaunchWxaApp.m102252v((C90444vm2) aVar2);
        mo123453j(a2);
        C89059e<C89132b.C89134c<C90446wm2>> i = super.mo9225i();
        C87412m.m108593f(i, "{\n            Log.i(TAG,…    super.run()\n        }");
        return i;
    }
}
