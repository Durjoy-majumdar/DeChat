package com.tencent.p014mm.plugin.appbrand.jsapi.system;

import android.app.Activity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import li0.C88508b;
import org.json.JSONObject;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$1 */
public final class JsApiSetScreenBrightness2$invoke$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l<String, C13598b0> f242750d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f242751e;

    /* renamed from: f */
    public final /* synthetic */ C82381f f242752f;

    /* renamed from: g */
    public final /* synthetic */ JsApiSetScreenBrightness2 f242753g;

    /* renamed from: h */
    public final /* synthetic */ int f242754h;

    public JsApiSetScreenBrightness2$invoke$1(C32226l<? super String, C13598b0> lVar, JSONObject jSONObject, C82381f fVar, JsApiSetScreenBrightness2 jsApiSetScreenBrightness2, int i) {
        this.f242750d = lVar;
        this.f242751e = jSONObject;
        this.f242752f = fVar;
        this.f242753g = jsApiSetScreenBrightness2;
        this.f242754h = i;
    }

    public final void run() {
        C32226l<String, C13598b0> lVar = this.f242750d;
        lVar.invoke("data:" + this.f242751e + ", appState:" + this.f242752f.getAppState());
        this.f242753g.f242748g = (float) this.f242751e.optDouble("value", Double.NaN);
        if (!Float.isNaN(this.f242753g.f242748g)) {
            float f = this.f242753g.f242748g;
            if (f <= 1.0f && (f >= 0.0f || Float.compare(-1.0f, f) == 0)) {
                if (C88508b.FOREGROUND == this.f242752f.getAppState()) {
                    JsApiSetScreenBrightness2.Companion companion = JsApiSetScreenBrightness2.f242747i;
                    C82381f fVar = this.f242752f;
                    companion.getClass();
                    Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(fVar.getContext());
                    if (castActivityOrNull != null) {
                        JsApiSetScreenBrightness2.Companion.m101843a(companion, castActivityOrNull, this.f242753g.f242748g);
                    }
                }
                if (this.f242753g.f242749h == null && this.f242752f.getLifecycleOwner() != null) {
                    final JsApiSetScreenBrightness2 jsApiSetScreenBrightness2 = this.f242753g;
                    final C32226l<String, C13598b0> lVar2 = this.f242750d;
                    final C82381f fVar2 = this.f242752f;
                    C830321 r1 = new C0124r() {
                        @C112974b0(C39623j.C39625b.ON_PAUSE)
                        public final void onPaused() {
                            lVar2.invoke("onPaused, restore to BRIGHTNESS_OVERRIDE_NONE");
                            JsApiSetScreenBrightness2.Companion companion = JsApiSetScreenBrightness2.f242747i;
                            C82381f fVar = fVar2;
                            companion.getClass();
                            Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(fVar.getContext());
                            if (castActivityOrNull != null) {
                                JsApiSetScreenBrightness2.Companion.m101843a(companion, castActivityOrNull, -1.0f);
                            }
                        }

                        @C112974b0(C39623j.C39625b.ON_RESUME)
                        public final void onResumed() {
                            if (!Float.isNaN(jsApiSetScreenBrightness2.f242748g)) {
                                C32226l<String, C13598b0> lVar = lVar2;
                                lVar.invoke("onResumed, restore to " + jsApiSetScreenBrightness2.f242748g);
                                JsApiSetScreenBrightness2.Companion companion = JsApiSetScreenBrightness2.f242747i;
                                C82381f fVar = fVar2;
                                companion.getClass();
                                Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(fVar.getContext());
                                if (castActivityOrNull != null) {
                                    JsApiSetScreenBrightness2.Companion.m101843a(companion, castActivityOrNull, jsApiSetScreenBrightness2.f242748g);
                                }
                            }
                        }
                    };
                    C0125s lifecycleOwner = this.f242752f.getLifecycleOwner();
                    C87412m.m108591d(lifecycleOwner);
                    lifecycleOwner.getLifecycle().addObserver(r1);
                    jsApiSetScreenBrightness2.f242749h = r1;
                }
                C82381f fVar3 = this.f242752f;
                int i = this.f242754h;
                JsApiSetScreenBrightness2 jsApiSetScreenBrightness22 = this.f242753g;
                jsApiSetScreenBrightness22.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar3.mo109647a(i, jsApiSetScreenBrightness22.mo115115p("ok", jSONObject));
                return;
            }
        }
        this.f242752f.mo109647a(this.f242754h, this.f242753g.mo115109j("fail: value invalid"));
    }
}
