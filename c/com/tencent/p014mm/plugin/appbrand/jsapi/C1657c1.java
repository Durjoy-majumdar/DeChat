package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.utils.C2033c1;
import com.tencent.p014mm.plugin.appbrand.utils.C2046p2;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import o40.C61926c;
import org.json.JSONObject;
import x20.C15618a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c1 */
public final class C1657c1 extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 924;
    private static final String NAME = "addImageToFavorites";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c1$a */
    public static final class C1658a implements C2033c1 {

        /* renamed from: a */
        public final /* synthetic */ C82381f f11316a;

        /* renamed from: b */
        public final /* synthetic */ int f11317b;

        /* renamed from: c */
        public final /* synthetic */ C1657c1 f11318c;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c1$a$a */
        public static final class C1659a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C1657c1 f11319d;

            /* renamed from: e */
            public final /* synthetic */ Activity f11320e;

            /* renamed from: f */
            public final /* synthetic */ String f11321f;

            /* renamed from: g */
            public final /* synthetic */ C82381f f11322g;

            /* renamed from: h */
            public final /* synthetic */ int f11323h;

            public C1659a(C1657c1 c1Var, Activity activity, String str, C82381f fVar, int i) {
                this.f11319d = c1Var;
                this.f11320e = activity;
                this.f11321f = str;
                this.f11322g = fVar;
                this.f11323h = i;
            }

            public final void run() {
                C1657c1 c1Var = this.f11319d;
                Activity activity = this.f11320e;
                String str = this.f11321f;
                c1Var.getClass();
                IPCInteger iPCInteger = (IPCInteger) C15618a.m14628d(new IPCString(str), C1905x0.f11758a);
                Integer valueOf = iPCInteger != null ? Integer.valueOf(iPCInteger.f10313d) : null;
                Log.m105924i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "doFavoriteAnyProcess, result: " + valueOf);
                int intValue = valueOf != null ? valueOf.intValue() : Integer.MIN_VALUE;
                C61926c.m72668M(new C82210b1(intValue, activity));
                boolean z = intValue == 0;
                Log.m105924i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, success: " + z);
                this.f11322g.mo109647a(this.f11323h, this.f11319d.mo115109j(z ? "ok" : "fail"));
            }
        }

        public C1658a(C82381f fVar, int i, C1657c1 c1Var) {
            this.f11316a = fVar;
            this.f11317b = i;
            this.f11318c = c1Var;
        }

        /* renamed from: a */
        public void mo1683a(String str, boolean z) {
            if (str == null || str.length() == 0) {
                Log.m105928w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, url is illegal");
                this.f11316a.mo109647a(this.f11317b, this.f11318c.mo115109j("fail:url is illegal"));
            } else if (!ImgUtil.isImgFile(str)) {
                Log.m105928w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, " + str + " is not image");
                C86013q1.m106447h(str);
                this.f11316a.mo109647a(this.f11317b, this.f11318c.mo115109j("fail:url is illegal"));
            } else {
                Context context = this.f11316a.getContext();
                if (context instanceof Activity) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C1659a(this.f11318c, (Activity) context, str, this.f11316a, this.f11317b));
                    return;
                }
                Log.m105928w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, activity is null");
                this.f11316a.mo109647a(this.f11317b, this.f11318c.mo115109j("fail:activity is null"));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else {
            String optString = jSONObject.optString("url");
            if (optString == null || optString.length() == 0) {
                Log.m105928w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, url is empty");
                fVar.mo109647a(i, mo115109j("fail:url is empty"));
                return;
            }
            C87412m.m108593f(optString, "imagePath");
            C2046p2.m1997a(fVar, optString, (String) null, 7, new C1658a(fVar, i, this));
        }
    }
}
