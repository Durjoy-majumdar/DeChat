package ap0;

import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import lp3.C88629c;
import nr3.C89059e;
import nr3.C89060f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C90444vm2;
import te3.C90446wm2;
import te3.u55;
import wo0.C91041a;
import za0.C91626a;
import zp0.C39425a;
import zp0.C91823b;

/* renamed from: ap0.d */
public final class C79621d extends C91823b<C90446wm2> {

    /* renamed from: p */
    public final C90444vm2 f233473p;

    /* renamed from: q */
    public final boolean f233474q;

    /* renamed from: r */
    public final C47350c f233475r;

    /* renamed from: ap0.d$a */
    public static final class C79622a<_Ret> implements C88629c.C88630a {

        /* renamed from: a */
        public final /* synthetic */ C79621d f233476a;

        public C79622a(C79621d dVar) {
            this.f233476a = dVar;
        }

        public Object call() {
            return C89132b.C89134c.m111401a(4, -2, "", null, (C117747y) null, this.f233476a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79621d(C90444vm2 vm22, boolean z) {
        super(vm22.f259880d, vm22.f259890q);
        C87412m.m108594g(vm22, "req");
        this.f233473p = vm22;
        this.f233474q = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1122;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        bVar.f127066a = vm22;
        bVar.f127067b = new C90446wm2();
        C47350c a = bVar.mo72403a();
        this.f233475r = a;
        mo123453j(a);
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C90446wm2 wm22 = (C90446wm2) eu32;
        C87412m.m108594g(wm22, "resp");
        super.mo10094h(i, i2, str, wm22, yVar);
        Log.m105924i("MicroMsg.AppBrand.CgiLaunchWxaAppForPreFetch", "onCgiBack response:" + C91626a.m114982b(wm22));
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C90446wm2>> mo9225i() {
        C91041a aVar = new C91041a();
        C47465a aVar2 = this.f233475r.f127055a.f127080a;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        C89059e<C89132b.C89134c<C90446wm2>> a = aVar.mo125107a((C90444vm2) aVar2, this.f233474q, this);
        C47465a aVar3 = this.f233475r.f127055a.f127080a;
        C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        CgiLaunchWxaApp.m102253w((C90444vm2) aVar3);
        C47465a aVar4 = this.f233475r.f127055a.f127080a;
        C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        CgiLaunchWxaApp.m102252v((C90444vm2) aVar4);
        StringBuilder sb = new StringBuilder();
        sb.append("run() with request ");
        C47465a aVar5 = this.f233475r.f127055a.f127080a;
        C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        C90444vm2 vm22 = (C90444vm2) aVar5;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("LaunchWxaAppRequest{");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("username[");
        sb5.append(vm22.f259890q);
        sb5.append("], appId[");
        sb5.append(vm22.f259880d);
        sb5.append("], sync[");
        boolean z = true;
        int i = 0;
        if (vm22.f259882f != 1) {
            z = false;
        }
        sb5.append(z);
        sb5.append("], instanceId[");
        sb5.append(vm22.f259889p);
        sb5.append("], libVersion[");
        u55 u55 = vm22.f259884h;
        if (u55 != null) {
            i = u55.f259849d;
        }
        sb5.append(i);
        sb5.append("], ");
        sb5.append(C91626a.m114981a(vm22.f259896w));
        sb4.append(sb5.toString());
        sb.append(sb4.toString());
        Log.m105924i("MicroMsg.AppBrand.CgiLaunchWxaAppForPreFetch", sb.toString());
        return a == null ? super.mo9225i() : a;
    }

    /* renamed from: q */
    public C89059e<C89132b.C89134c<C90446wm2>> mo109760q() {
        C90444vm2 vm22 = this.f233473p;
        if (!C39425a.m42111a(vm22.f259880d, vm22.f259890q)) {
            return C89060f.m111325d(new C79622a(this));
        }
        return null;
    }
}
