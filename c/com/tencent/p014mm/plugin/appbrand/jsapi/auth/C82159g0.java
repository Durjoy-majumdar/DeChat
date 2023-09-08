package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82166i;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.HashMap;
import lp3.C88631d;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13605o;
import te3.C49713hj2;
import te3.C90418ik2;
import te3.C90421jk2;
import te3.w55;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.g0 */
public final class C82159g0 extends C82197q implements C82166i {
    @Deprecated
    public static final int CTRL_INDEX = 52;
    @Deprecated
    public static final String NAME = "login";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.g0$a */
    public static final class C82160a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C81879g f240983a;

        /* renamed from: b */
        public final /* synthetic */ int f240984b;

        /* renamed from: c */
        public final /* synthetic */ C82159g0 f240985c;

        public C82160a(C81879g gVar, int i, C82159g0 g0Var) {
            this.f240983a = gVar;
            this.f240984b = i;
            this.f240985c = g0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r4.f259628d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r9) {
            /*
                r8 = this;
                r4 = r9
                te3.jk2 r4 = (te3.C90421jk2) r4
                r9 = 0
                if (r4 == 0) goto L_0x0011
                te3.hj2 r0 = r4.f259628d
                if (r0 == 0) goto L_0x0011
                int r0 = r0.f134688d
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x0012
            L_0x0011:
                r0 = r9
            L_0x0012:
                r1 = -12000(0xffffffffffffd120, float:NaN)
                if (r0 != 0) goto L_0x0017
                goto L_0x0055
            L_0x0017:
                int r0 = r0.intValue()
                if (r0 != r1) goto L_0x0055
                lp3.b r2 = lp3.C88643g.m110545c()
                java.util.LinkedList<te3.rw3> r0 = r4.f259630f
                if (r0 == 0) goto L_0x002e
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x002c
                goto L_0x002e
            L_0x002c:
                r0 = 0
                goto L_0x002f
            L_0x002e:
                r0 = 1
            L_0x002f:
                if (r0 == 0) goto L_0x0041
                com.tencent.mm.plugin.appbrand.g r0 = r8.f240983a
                int r1 = r8.f240984b
                com.tencent.mm.plugin.appbrand.jsapi.auth.g0 r2 = r8.f240985c
                java.lang.String r3 = "fail:internal error scope empty"
                java.lang.String r2 = r2.mo115109j(r3)
                r0.mo109647a(r1, r2)
                goto L_0x0067
            L_0x0041:
                zt3.t r6 = zt3.C119157j.f356862d
                com.tencent.mm.plugin.appbrand.jsapi.auth.f0 r7 = new com.tencent.mm.plugin.appbrand.jsapi.auth.f0
                com.tencent.mm.plugin.appbrand.g r1 = r8.f240983a
                com.tencent.mm.plugin.appbrand.jsapi.auth.g0 r3 = r8.f240985c
                int r5 = r8.f240984b
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                zt3.j r6 = (zt3.C119157j) r6
                r6.mo183895z(r7)
                goto L_0x0067
            L_0x0055:
                rx3.o r0 = new rx3.o
                if (r4 == 0) goto L_0x005c
                te3.hj2 r1 = r4.f259628d
                goto L_0x005d
            L_0x005c:
                r1 = r9
            L_0x005d:
                if (r4 == 0) goto L_0x0061
                java.lang.String r9 = r4.f259629e
            L_0x0061:
                java.lang.String r2 = "/cgi-bin/mmbiz-bin/js-login"
                r0.<init>(r1, r9, r2)
                r9 = r0
            L_0x0067:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82159g0.C82160a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.g0$b */
    public static final class C82161b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C81879g f240986a;

        /* renamed from: b */
        public final /* synthetic */ int f240987b;

        /* renamed from: c */
        public final /* synthetic */ C82159g0 f240988c;

        public C82161b(C81879g gVar, int i, C82159g0 g0Var) {
            this.f240986a = gVar;
            this.f240987b = i;
            this.f240988c = g0Var;
        }

        public Object call(Object obj) {
            C13605o oVar = (C13605o) obj;
            C49713hj2 hj22 = (C49713hj2) oVar.f38557d;
            String str = (String) oVar.f38558e;
            String str2 = (String) oVar.f38559f;
            Integer valueOf = hj22 != null ? Integer.valueOf(hj22.f134688d) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                C81879g gVar = this.f240986a;
                int i = this.f240987b;
                C82159g0 g0Var = this.f240988c;
                HashMap hashMap = new HashMap();
                hashMap.put("code", str);
                C13598b0 b0Var = C13598b0.f38549a;
                gVar.mo109647a(i, g0Var.mo115112m("ok", hashMap));
            } else if (valueOf == null) {
                C81879g gVar2 = this.f240986a;
                int i2 = this.f240987b;
                C82159g0 g0Var2 = this.f240988c;
                StringBuilder sb = new StringBuilder();
                sb.append("fail invalid ");
                this.f240988c.getClass();
                if (C87412m.m108589b(str2, "/cgi-bin/mmbiz-bin/js-login")) {
                    str2 = "js-login";
                } else if (C87412m.m108589b(str2, "/cgi-bin/mmbiz-bin/js-login-confirm")) {
                    str2 = "js-login-confirm";
                }
                sb.append(str2);
                sb.append(" response");
                gVar2.mo109647a(i2, g0Var2.mo115109j(sb.toString()));
            } else {
                C81879g gVar3 = this.f240986a;
                int i3 = this.f240987b;
                C82159g0 g0Var3 = this.f240988c;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("fail ");
                this.f240988c.getClass();
                if (C87412m.m108589b(str2, "/cgi-bin/mmbiz-bin/js-login")) {
                    str2 = "js-login";
                } else if (C87412m.m108589b(str2, "/cgi-bin/mmbiz-bin/js-login-confirm")) {
                    str2 = "js-login-confirm";
                }
                sb4.append(str2);
                sb4.append(" response errcode=");
                sb4.append(valueOf);
                sb4.append(" errmsg=");
                sb4.append(hj22.f134689e);
                gVar3.mo109647a(i3, g0Var3.mo115109j(sb4.toString()));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.g0$c */
    public static final class C82162c<T> implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ C82164h f240989a;

        public C82162c(C82164h hVar) {
            this.f240989a = hVar;
        }

        /* renamed from: a */
        public final void mo1772a(Object obj) {
            C82164h hVar = this.f240989a;
            if (hVar != null) {
                hVar.mo56741d();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.g0$d */
    public static final class C82163d<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C82164h f240990a;

        /* renamed from: b */
        public final /* synthetic */ C81879g f240991b;

        /* renamed from: c */
        public final /* synthetic */ int f240992c;

        /* renamed from: d */
        public final /* synthetic */ C82159g0 f240993d;

        public C82163d(C82164h hVar, C81879g gVar, int i, C82159g0 g0Var) {
            this.f240990a = hVar;
            this.f240991b = gVar;
            this.f240992c = i;
            this.f240993d = g0Var;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            C82164h hVar = this.f240990a;
            if (hVar != null) {
                hVar.mo56741d();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onInterrupt, appId[");
            sb.append(this.f240991b.getAppId());
            sb.append("], callbackId[");
            sb.append(this.f240992c);
            sb.append("], e[");
            sb.append(obj != null ? obj.toString() : null);
            sb.append(']');
            Log.m105924i("Luggage.WXA.JsApiLoginLU", sb.toString());
            if (!(obj instanceof C82166i.C82168b)) {
                if (obj instanceof C82166i.C82167a) {
                    C81879g gVar = this.f240991b;
                    int i = this.f240992c;
                    C82159g0 g0Var = this.f240993d;
                    gVar.mo109647a(i, g0Var.mo115109j("fail " + ((C82166i.C82167a) obj).getMessage()));
                } else if (obj instanceof Throwable) {
                    C81879g gVar2 = this.f240991b;
                    int i2 = this.f240992c;
                    C82159g0 g0Var2 = this.f240993d;
                    gVar2.mo109647a(i2, g0Var2.mo115109j("fail " + ((Throwable) obj).getMessage()));
                } else if (obj == null) {
                    this.f240991b.mo109647a(this.f240992c, this.f240993d.mo115109j("fail:internal error"));
                } else {
                    C81879g gVar3 = this.f240991b;
                    int i3 = this.f240992c;
                    C82159g0 g0Var3 = this.f240993d;
                    gVar3.mo109647a(i3, g0Var3.mo115109j("fail " + obj));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo114544c(C83125x6<C81879g> x6Var) {
        C87412m.m108594g(x6Var, "invokeContext");
        JSONObject jSONObject = x6Var.f242917c;
        try {
            if (!jSONObject.has("requestInQueue")) {
                jSONObject.put("requestInQueue", false);
            }
        } catch (JSONException e) {
            Log.m105920e("Luggage.WXA.JsApiLoginLU", "invoke put KEY_IN_QUEUE e=" + e.getMessage());
        }
        super.mo114544c(x6Var);
    }

    /* renamed from: w */
    public void mo114534w(C83125x6<C81879g> x6Var, C82164h hVar) {
        C87412m.m108594g(x6Var, "invokeContext");
        C81879g gVar = (C81879g) x6Var.f242916b;
        int i = x6Var.f242919e;
        C90418ik2 ik22 = new C90418ik2();
        ik22.f259576d = gVar.getAppId();
        ik22.f259581i = gVar.getRuntime().f238149o.f239365g;
        w55 w55 = new w55();
        C82166i.C82169c.m100887a(this, w55, gVar);
        ik22.f259582j = w55;
        C13598b0 b0Var = C13598b0.f38549a;
        C82166i.C82169c.m100889c(this, gVar, "/cgi-bin/mmbiz-bin/js-login", ik22, C90421jk2.class).mo123064p(new C82160a(gVar, i, this)).mo123062e(new C82161b(gVar, i, this)).mo114038a(new C82162c(hVar)).mo123065b(new C82163d(hVar, gVar, i, this));
    }
}
