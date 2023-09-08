package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82166i;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr0.C86127t;
import gt0.C87347g;
import gt0.C87375o0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import lb0.C88394b;
import lp3.C46888b;
import p224ra.C89909e;
import p974hc.C87471a;
import sx3.C110818d0;
import te3.C90423kk2;
import te3.C90426lk2;
import te3.mo4;
import te3.no4;
import yq0.C91566l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.k0 */
public final class C82175k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f241007d;

    /* renamed from: e */
    public final /* synthetic */ C46888b f241008e;

    /* renamed from: f */
    public final /* synthetic */ C82180l0 f241009f;

    /* renamed from: g */
    public final /* synthetic */ int f241010g;

    /* renamed from: h */
    public final /* synthetic */ String f241011h;

    /* renamed from: i */
    public final /* synthetic */ C90426lk2 f241012i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.k0$a */
    public static final class C82176a implements C87471a.C87475b {

        /* renamed from: a */
        public final /* synthetic */ C82180l0 f241013a;

        /* renamed from: b */
        public final /* synthetic */ C81879g f241014b;

        /* renamed from: c */
        public final /* synthetic */ C87471a f241015c;

        /* renamed from: d */
        public final /* synthetic */ C87347g f241016d;

        public C82176a(C82180l0 l0Var, C81879g gVar, C87471a aVar, C87347g gVar2) {
            this.f241013a = l0Var;
            this.f241014b = gVar;
            this.f241015c = aVar;
            this.f241016d = gVar2;
        }

        /* renamed from: a */
        public final void mo114592a(Bitmap bitmap) {
            C82180l0 l0Var = this.f241013a;
            C81879g gVar = this.f241014b;
            l0Var.getClass();
            Context b = C82166i.C82169c.m100888b(l0Var, gVar);
            String Yu0 = this.f241015c.Yu0();
            C87347g gVar2 = this.f241016d;
            l0Var.getClass();
            C82166i.C82169c.m100890d(l0Var, b, bitmap, Yu0, "scope.userInfo", gVar2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.k0$b */
    public static final class C82177b implements C87471a {

        /* renamed from: d */
        public final /* synthetic */ C90426lk2 f241017d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.k0$b$a */
        public static final class C82178a implements C88394b.C88411m {

            /* renamed from: d */
            public final /* synthetic */ C87471a.C87475b f241018d;

            public C82178a(C87471a.C87475b bVar) {
                this.f241018d = bVar;
            }

            /* renamed from: b */
            public void mo1907b() {
            }

            /* renamed from: d */
            public void mo1908d() {
            }

            public String key() {
                return "JsApiOperateWXData";
            }

            public void onBitmapLoaded(Bitmap bitmap) {
                C87471a.C87475b bVar = this.f241018d;
                if (bVar != null) {
                    bVar.mo114592a(bitmap);
                }
            }
        }

        public C82177b(C90426lk2 lk22) {
            this.f241017d = lk22;
        }

        /* renamed from: Y5 */
        public Drawable mo113356Y5() {
            return null;
        }

        public String Yu0() {
            LinkedList<no4> linkedList;
            no4 peekFirst;
            mo4 mo4 = this.f241017d.f259679q;
            if (mo4 == null || (linkedList = mo4.f259692d) == null || (peekFirst = linkedList.peekFirst()) == null) {
                return null;
            }
            return peekFirst.f259707e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = (r0 = r0.f259692d).peekFirst();
         */
        /* renamed from: kg */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo113358kg(p974hc.C87471a.C87475b r5) {
            /*
                r4 = this;
                java.lang.String r0 = "callback"
                gy3.C87412m.m108594g(r5, r0)
                te3.lk2 r0 = r4.f241017d
                te3.mo4 r0 = r0.f259679q
                r1 = 0
                if (r0 == 0) goto L_0x001b
                java.util.LinkedList<te3.no4> r0 = r0.f259692d
                if (r0 == 0) goto L_0x001b
                java.lang.Object r0 = r0.peekFirst()
                te3.no4 r0 = (te3.no4) r0
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = r0.f259708f
                goto L_0x001c
            L_0x001b:
                r0 = r1
            L_0x001c:
                if (r0 == 0) goto L_0x0027
                int r2 = r0.length()
                if (r2 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r2 = 0
                goto L_0x0028
            L_0x0027:
                r2 = 1
            L_0x0028:
                if (r2 != 0) goto L_0x0037
                java.lang.String r2 = lb0.C88394b.f255384g
                lb0.b r2 = lb0.C88394b.C88418q.f255427a
                com.tencent.mm.plugin.appbrand.jsapi.auth.k0$b$a r3 = new com.tencent.mm.plugin.appbrand.jsapi.auth.k0$b$a
                r3.<init>(r5)
                r2.mo122796o(r3, r0, r1)
                goto L_0x003a
            L_0x0037:
                r5.mo114592a(r1)
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82175k0.C82177b.mo113358kg(hc.a$b):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.k0$c */
    public static final class C82179c implements C91566l.C91570c {

        /* renamed from: a */
        public final /* synthetic */ int f241019a;

        /* renamed from: b */
        public final /* synthetic */ C46888b f241020b;

        /* renamed from: c */
        public final /* synthetic */ C81879g f241021c;

        /* renamed from: d */
        public final /* synthetic */ C82180l0 f241022d;

        /* renamed from: e */
        public final /* synthetic */ String f241023e;

        public C82179c(int i, C46888b bVar, C81879g gVar, C82180l0 l0Var, String str) {
            this.f241019a = i;
            this.f241020b = bVar;
            this.f241021c = gVar;
            this.f241022d = l0Var;
            this.f241023e = str;
        }

        /* renamed from: a */
        public void mo114536a(int i, ArrayList<String> arrayList, int i2, boolean z) {
            Class<C90426lk2> cls = C90426lk2.class;
            C87412m.m108594g(arrayList, "resultData");
            Log.m105924i("Luggage.WXA.JsApiOperateWXDataLU", "dialog onMsg, resultCode[" + i + "], callbackId[" + this.f241019a + ']');
            if (i == 1) {
                C90423kk2 A = C82180l0.m100900A(this.f241021c, this.f241022d, this.f241023e);
                C82180l0 l0Var = this.f241022d;
                C46888b bVar = this.f241020b;
                C81879g gVar = this.f241021c;
                A.f259646g = 1;
                A.f259645f = (String) C110818d0.m150916N(arrayList);
                C87412m.m108593f(bVar, "m");
                l0Var.getClass();
                C82166i.C82169c.m100889c(l0Var, gVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", A, cls).mo114038a(new C82172j(bVar)).mo123065b(new C82174k(bVar));
            } else if (i != 2) {
                this.f241020b.mo72091a(new C82166i.C82167a("fail:auth canceled"));
            } else {
                this.f241020b.mo72091a(new C82166i.C82167a("fail:auth denied"));
                C90423kk2 A2 = C82180l0.m100900A(this.f241021c, this.f241022d, this.f241023e);
                C82180l0 l0Var2 = this.f241022d;
                C81879g gVar2 = this.f241021c;
                A2.f259646g = 2;
                l0Var2.getClass();
                C82166i.C82169c.m100889c(l0Var2, gVar2, "/cgi-bin/mmbiz-bin/js-operatewxdata", A2, cls);
            }
        }
    }

    public C82175k0(C81879g gVar, C46888b bVar, C82180l0 l0Var, int i, String str, C90426lk2 lk22) {
        this.f241007d = gVar;
        this.f241008e = bVar;
        this.f241009f = l0Var;
        this.f241010g = i;
        this.f241011h = str;
        this.f241012i = lk22;
    }

    public final void run() {
        C79774c cVar;
        if (!this.f241007d.isRunning()) {
            this.f241008e.mo72091a(C82166i.C82168b.f240996d);
            return;
        }
        C82179c cVar2 = new C82179c(this.f241010g, this.f241008e, this.f241007d, this.f241009f, this.f241011h);
        C82180l0 l0Var = this.f241009f;
        C81879g gVar = this.f241007d;
        l0Var.getClass();
        Context b = C82166i.C82169c.m100888b(l0Var, gVar);
        AppBrandRuntime runtime = this.f241007d.getRuntime();
        if (runtime == null || (cVar = runtime.mo113054f0()) == null) {
            cVar = new C86127t();
        }
        C87347g gVar2 = new C87347g(b, cVar, cVar2);
        C90426lk2 lk22 = this.f241012i;
        C81879g gVar3 = this.f241007d;
        C82180l0 l0Var2 = this.f241009f;
        gVar2.setAppBrandName(lk22.f259672g);
        gVar2.setRequestDesc(lk22.f259671f.f259823e);
        gVar2.setApplyWording(lk22.f259678p);
        gVar2.setNegativeButtonText(lk22.f259676n);
        gVar2.setPositiveButtonText(lk22.f259677o);
        gVar2.setIconUrl(lk22.f259673h);
        gVar2.setFunctionButtonText("");
        C79774c f0 = gVar3.mo114271f0();
        boolean z = false;
        if (f0 != null && f0.isLargeScreenWindow()) {
            z = true;
        }
        if (z) {
            gVar2.mo121757e(1);
        }
        if (C87412m.m108589b("scope.userInfo", lk22.f259671f.f259822d)) {
            C87471a aVar = (C87471a) C89909e.m112436a(C87471a.class);
            if (aVar == null) {
                aVar = new C82177b(lk22);
            }
            l0Var2.getClass();
            C82166i.C82169c.m100890d(l0Var2, C82166i.C82169c.m100888b(l0Var2, gVar3), (Bitmap) null, aVar.Yu0(), "scope.userInfo", gVar2);
            aVar.mo113358kg(new C82176a(l0Var2, gVar3, aVar, gVar2));
        } else {
            String str = lk22.f259671f.f259822d;
            C87412m.m108593f(str, "response.Scope.Scope");
            gVar2.f253162z = str;
        }
        C87375o0 dialogContainer = gVar3.getDialogContainer();
        C87412m.m108591d(dialogContainer);
        dialogContainer.mo121778b(gVar2);
    }
}
