package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gt0.C87327c0;
import gt0.C87375o0;
import gy3.C87412m;
import h81.C32735h;
import hp3.C87581a;
import lp3.C88631d;
import nr3.C89059e;
import nr3.C89060f;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.g1 */
public final class C82717g1 extends C82268c<C82381f> {
    @Deprecated
    public static final int CTRL_INDEX = 36;
    @Deprecated
    public static final String NAME = "chooseVideo";

    /* renamed from: g */
    public JsApiChooseVideo f242028g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.g1$b */
    public static final class C1733b<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f11433a;

        /* renamed from: b */
        public final /* synthetic */ int f11434b;

        /* renamed from: c */
        public final /* synthetic */ C82717g1 f11435c;

        public C1733b(C82381f fVar, int i, C82717g1 g1Var) {
            this.f11433a = fVar;
            this.f11434b = i;
            this.f11435c = g1Var;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            if (obj instanceof Exception) {
                String message = ((Exception) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                C82381f fVar = this.f11433a;
                int i = this.f11434b;
                C82717g1 g1Var = this.f11435c;
                if (!C112551y.m153819s(message, "fail", false)) {
                    message = "fail " + message;
                }
                fVar.mo109647a(i, g1Var.mo115109j(message));
                return;
            }
            Log.m105920e("MicroMsg.AppBrand.JsApiChooseVideoNew", "choose pipeline onInterrupt(" + obj + ')');
            this.f11433a.mo109647a(this.f11434b, this.f11435c.mo115109j("fail:internal error"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.g1$a */
    public static final class C82718a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f242029a;

        /* renamed from: b */
        public final /* synthetic */ int f242030b;

        /* renamed from: c */
        public final /* synthetic */ C82717g1 f242031c;

        /* renamed from: d */
        public final /* synthetic */ boolean f242032d;

        public C82718a(C82381f fVar, int i, C82717g1 g1Var, boolean z) {
            this.f242029a = fVar;
            this.f242030b = i;
            this.f242031c = g1Var;
            this.f242032d = z;
        }

        public Object call(Object obj) {
            C87327c0 c0Var;
            C82739n nVar = (C82739n) obj;
            if (nVar instanceof C82739n.C82741b) {
                C82381f fVar = this.f242029a;
                int i = this.f242030b;
                C82717g1 g1Var = this.f242031c;
                StringBuilder sb = new StringBuilder();
                sb.append("fail ");
                String str = ((C82739n.C82741b) nVar).f242061a;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                fVar.mo109647a(i, g1Var.mo115109j(sb.toString()));
            } else if (nVar instanceof C82739n.C82742c) {
                if (this.f242029a.isRunning()) {
                    if (this.f242032d) {
                        c0Var = new C87327c0(this.f242029a.getContext());
                        C82381f fVar2 = this.f242029a;
                        c0Var.setMessage(fVar2.getContext().getString(C0966R.string.f7637m9));
                        c0Var.setCanceledOnTouchOutside(false);
                        C87375o0 dialogContainer = fVar2.getDialogContainer();
                        if (dialogContainer != null) {
                            dialogContainer.mo121778b(c0Var);
                        }
                    } else {
                        c0Var = null;
                    }
                    C89059e b = C89060f.m111323b(((C82739n.C82742c) nVar).f242062a.get(0));
                    b.mo123419C(new C82701c1(this.f242029a, this.f242032d));
                    b.mo123420E(new C82704d1(this.f242029a, nVar, this.f242030b, this.f242031c));
                    b.mo123062e(new C82708e1(c0Var)).mo123065b(new C82711f1(c0Var));
                }
            } else if (C87412m.m108589b(nVar, C82739n.C82740a.f242060a)) {
                this.f242029a.mo109647a(this.f242030b, this.f242031c.mo115109j("fail user canceled"));
            }
            return C13598b0.f38549a;
        }
    }

    public C82717g1() {
        if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_choosevideo_new, 1) <= 0 ? false : true)) {
            this.f242028g = new JsApiChooseVideo();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C87412m.m108591d(fVar);
        C87412m.m108591d(jSONObject);
        JsApiChooseVideo jsApiChooseVideo = this.f242028g;
        if (jsApiChooseVideo != null) {
            C87412m.m108591d(jsApiChooseVideo);
            jsApiChooseVideo.mo1505u(fVar2, jSONObject2, i2);
            return;
        }
        boolean optBoolean = jSONObject2.optBoolean("compressed", true);
        int i3 = C82693a2.f241978k0;
        StringBuilder sb = new StringBuilder();
        String lowerCase = "ALBUM".toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        sb.append(", ");
        String lowerCase2 = "CAMERA".toLowerCase();
        C87412m.m108593f(lowerCase2, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase2);
        String sb4 = sb.toString();
        C82693a2[] a2VarArr = (C82693a2[]) C82698b2.values();
        C87412m.m108594g(sb4, "default");
        C87412m.m108594g(a2VarArr, "enums");
        String optString = jSONObject2.optString("sourceType", sb4);
        int i4 = 0;
        for (C82693a2 a2Var : a2VarArr) {
            C87412m.m108593f(optString, "value");
            String lowerCase3 = a2Var.getName().toLowerCase();
            C87412m.m108593f(lowerCase3, "this as java.lang.String).toLowerCase()");
            if (C112550d0.m153801u(optString, lowerCase3, false)) {
                i4 |= a2Var.getFlag();
            }
        }
        int i5 = C82693a2.f241978k0;
        String lowerCase4 = "BACK".toLowerCase();
        C87412m.m108593f(lowerCase4, "this as java.lang.String).toLowerCase()");
        C82693a2[] a2VarArr2 = (C82693a2[]) C82784z1.values();
        C87412m.m108594g(a2VarArr2, "enums");
        String optString2 = jSONObject2.optString("camera", lowerCase4);
        int i6 = 0;
        for (C82693a2 a2Var2 : a2VarArr2) {
            C87412m.m108593f(optString2, "value");
            String lowerCase5 = a2Var2.getName().toLowerCase();
            C87412m.m108593f(lowerCase5, "this as java.lang.String).toLowerCase()");
            if (C112550d0.m153801u(optString2, lowerCase5, false)) {
                i6 |= a2Var2.getFlag();
            }
        }
        int optInt = jSONObject2.optInt("maxDuration", 60);
        if (optInt <= 0) {
            fVar2.mo109647a(i2, mo115109j("fail invalid maxDuration"));
            return;
        }
        C89059e<_Ret> B = C89060f.m111322a().mo123062e(new C82703d0(new C82777y(fVar, i4, i6, 2, !optBoolean, optInt, 1)));
        C87412m.m108593f(B, "fun startChoose(): WxPip…D\n                }\n    }");
        B.mo123420E(new C82718a(fVar2, i2, this, optBoolean));
        B.mo123065b(new C1733b(fVar2, i2, this));
    }
}
