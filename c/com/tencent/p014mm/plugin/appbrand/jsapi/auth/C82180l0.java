package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82166i;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import lp3.C88631d;
import mp3.C88819d;
import org.json.JSONObject;
import pe3.C89349b;
import te3.C90423kk2;
import te3.C90426lk2;
import te3.w55;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.l0 */
public final class C82180l0 extends C82197q implements C82166i {
    @Deprecated
    public static final int CTRL_INDEX = 79;
    @Deprecated
    public static final String NAME = "operateWXData";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.l0$a */
    public static final class C82181a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C81879g f241024a;

        /* renamed from: b */
        public final /* synthetic */ C82180l0 f241025b;

        /* renamed from: c */
        public final /* synthetic */ int f241026c;

        /* renamed from: d */
        public final /* synthetic */ String f241027d;

        public C82181a(C81879g gVar, C82180l0 l0Var, int i, String str) {
            this.f241024a = gVar;
            this.f241025b = l0Var;
            this.f241026c = i;
            this.f241027d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r6.f259669d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r10) {
            /*
                r9 = this;
                r6 = r10
                te3.lk2 r6 = (te3.C90426lk2) r6
                r10 = 0
                if (r6 == 0) goto L_0x0011
                te3.hj2 r0 = r6.f259669d
                if (r0 == 0) goto L_0x0011
                int r0 = r0.f134688d
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x0012
            L_0x0011:
                r0 = r10
            L_0x0012:
                r1 = -12000(0xffffffffffffd120, float:NaN)
                if (r0 != 0) goto L_0x0017
                goto L_0x0037
            L_0x0017:
                int r0 = r0.intValue()
                if (r0 != r1) goto L_0x0037
                lp3.b r2 = lp3.C88643g.m110545c()
                zt3.t r7 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.appbrand.jsapi.auth.k0 r8 = new com.tencent.mm.plugin.appbrand.jsapi.auth.k0
                com.tencent.mm.plugin.appbrand.g r1 = r9.f241024a
                com.tencent.mm.plugin.appbrand.jsapi.auth.l0 r3 = r9.f241025b
                int r4 = r9.f241026c
                java.lang.String r5 = r9.f241027d
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                zt3.j r7 = (zt3.C119157j) r7
                r7.mo183895z(r8)
                r6 = r10
            L_0x0037:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82180l0.C82181a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.l0$b */
    public static final class C82182b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C81879g f241028a;

        /* renamed from: b */
        public final /* synthetic */ int f241029b;

        /* renamed from: c */
        public final /* synthetic */ C82180l0 f241030c;

        public C82182b(C81879g gVar, int i, C82180l0 l0Var) {
            this.f241028a = gVar;
            this.f241029b = i;
            this.f241030c = l0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r1 = r7.f259669d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r7) {
            /*
                r6 = this;
                te3.lk2 r7 = (te3.C90426lk2) r7
                r0 = 0
                if (r7 == 0) goto L_0x0010
                te3.hj2 r1 = r7.f259669d
                if (r1 == 0) goto L_0x0010
                int r1 = r1.f134688d
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0011
            L_0x0010:
                r1 = r0
            L_0x0011:
                java.lang.String r2 = "fail invalid response"
                if (r1 != 0) goto L_0x0016
                goto L_0x0079
            L_0x0016:
                int r3 = r1.intValue()
                if (r3 != 0) goto L_0x0079
                pe3.b r7 = r7.f259670e
                if (r7 == 0) goto L_0x0041
                java.lang.String r7 = r7.mo123705h()
                com.tencent.mm.plugin.appbrand.g r0 = r6.f241028a
                int r1 = r6.f241029b
                com.tencent.mm.plugin.appbrand.jsapi.auth.l0 r3 = r6.f241030c
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.lang.String r5 = "data"
                r4.put(r5, r7)
                rx3.b0 r7 = rx3.C13598b0.f38549a
                java.lang.String r7 = "ok"
                java.lang.String r7 = r3.mo115112m(r7, r4)
                r0.mo109647a(r1, r7)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x0041:
                if (r0 != 0) goto L_0x00b3
                com.tencent.mm.plugin.appbrand.g r7 = r6.f241028a
                int r0 = r6.f241029b
                com.tencent.mm.plugin.appbrand.jsapi.auth.l0 r1 = r6.f241030c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "response ok but data is NULL, appId["
                r3.append(r4)
                java.lang.String r4 = r7.getAppId()
                r3.append(r4)
                java.lang.String r4 = "], callbackId["
                r3.append(r4)
                r3.append(r0)
                r4 = 93
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "Luggage.WXA.JsApiOperateWXDataLU"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
                java.lang.String r1 = r1.mo115109j(r2)
                r7.mo109647a(r0, r1)
                goto L_0x00b3
            L_0x0079:
                if (r1 != 0) goto L_0x0089
                com.tencent.mm.plugin.appbrand.g r7 = r6.f241028a
                int r0 = r6.f241029b
                com.tencent.mm.plugin.appbrand.jsapi.auth.l0 r1 = r6.f241030c
                java.lang.String r1 = r1.mo115109j(r2)
                r7.mo109647a(r0, r1)
                goto L_0x00b3
            L_0x0089:
                com.tencent.mm.plugin.appbrand.g r0 = r6.f241028a
                int r2 = r6.f241029b
                com.tencent.mm.plugin.appbrand.jsapi.auth.l0 r3 = r6.f241030c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "fail response errcode="
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = " errmsg="
                r4.append(r1)
                te3.hj2 r7 = r7.f259669d
                java.lang.String r7 = r7.f134689e
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                java.lang.String r7 = r3.mo115109j(r7)
                r0.mo109647a(r2, r7)
            L_0x00b3:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82180l0.C82182b.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.l0$c */
    public static final class C82183c<T> implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ C82164h f241031a;

        public C82183c(C82164h hVar) {
            this.f241031a = hVar;
        }

        /* renamed from: a */
        public final void mo1772a(Object obj) {
            C82164h hVar = this.f241031a;
            if (hVar != null) {
                hVar.mo56741d();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.l0$d */
    public static final class C82184d<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C82164h f241032a;

        /* renamed from: b */
        public final /* synthetic */ C81879g f241033b;

        /* renamed from: c */
        public final /* synthetic */ int f241034c;

        /* renamed from: d */
        public final /* synthetic */ C82180l0 f241035d;

        public C82184d(C82164h hVar, C81879g gVar, int i, C82180l0 l0Var) {
            this.f241032a = hVar;
            this.f241033b = gVar;
            this.f241034c = i;
            this.f241035d = l0Var;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            C82164h hVar = this.f241032a;
            if (hVar != null) {
                hVar.mo56741d();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onInterrupt, appId[");
            sb.append(this.f241033b.getAppId());
            sb.append("], callbackId[");
            sb.append(this.f241034c);
            sb.append("], e[");
            sb.append(obj != null ? obj.toString() : null);
            sb.append(']');
            Log.m105924i("Luggage.WXA.JsApiOperateWXDataLU", sb.toString());
            if (!(obj instanceof C82166i.C82168b)) {
                if (obj instanceof C82166i.C82167a) {
                    C81879g gVar = this.f241033b;
                    int i = this.f241034c;
                    C82180l0 l0Var = this.f241035d;
                    gVar.mo109647a(i, l0Var.mo115109j("fail " + ((C82166i.C82167a) obj).getMessage()));
                } else if (obj instanceof Throwable) {
                    C81879g gVar2 = this.f241033b;
                    int i2 = this.f241034c;
                    C82180l0 l0Var2 = this.f241035d;
                    gVar2.mo109647a(i2, l0Var2.mo115109j("fail " + ((Throwable) obj).getMessage()));
                } else if (obj == null) {
                    this.f241033b.mo109647a(this.f241034c, this.f241035d.mo115109j("fail:internal error"));
                } else {
                    C81879g gVar3 = this.f241033b;
                    int i3 = this.f241034c;
                    C82180l0 l0Var3 = this.f241035d;
                    gVar3.mo109647a(i3, l0Var3.mo115109j("fail " + obj));
                }
            }
        }
    }

    /* renamed from: A */
    public static final C90423kk2 m100900A(C81879g gVar, C82180l0 l0Var, String str) {
        C90423kk2 kk22 = new C90423kk2();
        kk22.f259643d = gVar.getAppId();
        C87412m.m108593f(str, "cgiRequestData");
        l0Var.getClass();
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        kk22.f259644e = new C89349b(bytes, 0, bytes.length);
        kk22.f259647h = gVar.getRuntime().f238149o.f239365g;
        w55 w55 = new w55();
        C82166i.C82169c.m100887a(l0Var, w55, gVar);
        kk22.f259648i = w55;
        return kk22;
    }

    /* renamed from: w */
    public void mo114534w(C83125x6<C81879g> x6Var, C82164h hVar) {
        C87412m.m108594g(x6Var, "invokeContext");
        C81879g gVar = (C81879g) x6Var.f242916b;
        JSONObject jSONObject = x6Var.f242917c;
        int i = x6Var.f242919e;
        String optString = jSONObject.optString("data", (String) null);
        if (optString == null) {
            gVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            C82166i.C82169c.m100889c(this, gVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", m100900A(gVar, this, optString), C90426lk2.class).mo123064p(new C82181a(gVar, this, i, optString)).mo123062e(new C82182b(gVar, i, this)).mo114038a(new C82183c(hVar)).mo123066f(C88819d.f256219UI, new C82184d(hVar, gVar, i, this));
        }
    }
}
