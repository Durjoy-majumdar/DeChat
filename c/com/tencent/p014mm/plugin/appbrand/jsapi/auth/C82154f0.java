package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82166i;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87340f;
import gt0.C87375o0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import lp3.C46888b;
import lp3.C88629c;
import rx3.C13605o;
import sx3.C64186f0;
import te3.C49713hj2;
import te3.C49717hk2;
import te3.C90412gk2;
import te3.C90421jk2;
import te3.w55;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f0 */
public final class C82154f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f240966d;

    /* renamed from: e */
    public final /* synthetic */ C46888b f240967e;

    /* renamed from: f */
    public final /* synthetic */ C82159g0 f240968f;

    /* renamed from: g */
    public final /* synthetic */ C90421jk2 f240969g;

    /* renamed from: h */
    public final /* synthetic */ int f240970h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f0$a */
    public static final class C82155a implements C87340f.C87341a {

        /* renamed from: a */
        public final /* synthetic */ int f240971a;

        /* renamed from: b */
        public final /* synthetic */ C82159g0 f240972b;

        /* renamed from: c */
        public final /* synthetic */ C46888b f240973c;

        /* renamed from: d */
        public final /* synthetic */ C81879g f240974d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.f0$a$a */
        public static final class C82156a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public static final C82156a<_Ret, _Var> f240975a = new C82156a<>();

            public Object call(Object obj) {
                C49717hk2 hk22 = (C49717hk2) obj;
                String str = null;
                C49713hj2 hj22 = hk22 != null ? hk22.f134699d : null;
                if (hk22 != null) {
                    str = hk22.f134700e;
                }
                return new C13605o(hj22, str, "/cgi-bin/mmbiz-bin/js-login-confirm");
            }
        }

        public C82155a(int i, C82159g0 g0Var, C46888b bVar, C81879g gVar) {
            this.f240971a = i;
            this.f240972b = g0Var;
            this.f240973c = bVar;
            this.f240974d = gVar;
        }

        /* renamed from: b */
        public static final C90412gk2 m100878b(C81879g gVar, ArrayList<String> arrayList, int i, C82159g0 g0Var) {
            C90412gk2 gk22 = new C90412gk2();
            gk22.f259525d = gVar.getAppId();
            LinkedList<String> linkedList = gk22.f259526e;
            List list = arrayList;
            if (arrayList == null) {
                list = C64186f0.f181907d;
            }
            linkedList.addAll(list);
            gk22.f259529h = i;
            gk22.f259530i = gVar.getRuntime().f238149o.f239365g;
            w55 w55 = new w55();
            g0Var.getClass();
            C82166i.C82169c.m100887a(g0Var, w55, gVar);
            gk22.f259531j = w55;
            return gk22;
        }

        /* renamed from: a */
        public void mo114547a(int i, ArrayList<String> arrayList) {
            Class<C49717hk2> cls = C49717hk2.class;
            Log.m105924i("Luggage.WXA.JsApiLoginLU", "dialog onRecvMsg, resultCode[" + i + "], callbackId[" + this.f240971a + ']');
            if (i == 1) {
                C82159g0 g0Var = this.f240972b;
                C46888b bVar = this.f240973c;
                C87412m.m108593f(bVar, "m");
                C82159g0 g0Var2 = this.f240972b;
                C81879g gVar = this.f240974d;
                C88629c<_Ret> p = C82166i.C82169c.m100889c(g0Var2, gVar, "/cgi-bin/mmbiz-bin/js-login-confirm", m100878b(gVar, arrayList, i, g0Var2), cls).mo123064p(C82156a.f240975a);
                C87412m.m108593f(p, "service.runCgi(CONFIRM_U…                        }");
                g0Var.getClass();
                p.mo114038a(new C82172j(bVar)).mo123065b(new C82174k(bVar));
            } else if (i != 2) {
                this.f240973c.mo72091a(new C82166i.C82167a("fail:auth canceled"));
            } else {
                this.f240973c.mo72091a(new C82166i.C82167a("fail:auth denied"));
                C82159g0 g0Var3 = this.f240972b;
                C81879g gVar2 = this.f240974d;
                C82166i.C82169c.m100889c(g0Var3, gVar2, "/cgi-bin/mmbiz-bin/js-login-confirm", m100878b(gVar2, arrayList, i, g0Var3), cls);
            }
        }
    }

    public C82154f0(C81879g gVar, C46888b bVar, C82159g0 g0Var, C90421jk2 jk22, int i) {
        this.f240966d = gVar;
        this.f240967e = bVar;
        this.f240968f = g0Var;
        this.f240969g = jk22;
        this.f240970h = i;
    }

    public final void run() {
        if (!this.f240966d.isRunning()) {
            this.f240967e.mo72091a(C82166i.C82168b.f240996d);
            return;
        }
        int i = this.f240970h;
        C82159g0 g0Var = this.f240968f;
        C46888b bVar = this.f240967e;
        C81879g gVar = this.f240966d;
        C82155a aVar = new C82155a(i, g0Var, bVar, gVar);
        C87375o0 dialogContainer = gVar.getDialogContainer();
        C87412m.m108591d(dialogContainer);
        C82159g0 g0Var2 = this.f240968f;
        C81879g gVar2 = this.f240966d;
        g0Var2.getClass();
        Context b = C82166i.C82169c.m100888b(g0Var2, gVar2);
        LinkedList<C87340f.C87345c> z = C82197q.m100917z(this.f240969g.f259630f);
        C90421jk2 jk22 = this.f240969g;
        dialogContainer.mo121778b(new C87340f(b, z, jk22.f259631g, jk22.f259632h, aVar));
    }
}
