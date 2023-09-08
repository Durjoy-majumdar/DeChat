package com.tencent.p014mm.plugin.appbrand.jsapi.system;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.C0124r;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetScreenBrightness2;", "Lcom/tencent/mm/plugin/appbrand/jsapi/c;", "Lcom/tencent/mm/plugin/appbrand/jsapi/f;", "<init>", "()V", "Companion", "luggage-commons-jsapi-default-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2 */
public final class JsApiSetScreenBrightness2 extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 229;
    public static final String NAME = "setScreenBrightness";

    /* renamed from: i */
    public static final Companion f242747i = new Companion((C8480h) null);

    /* renamed from: g */
    public float f242748g = Float.NaN;

    /* renamed from: h */
    public C0124r f242749h;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/system/JsApiSetScreenBrightness2$Companion;", "", "", "CTRL_INDEX", "I", "", "MAGIC_OVERRIDE_NONE", "F", "", "NAME", "Ljava/lang/String;", "TAG", "<init>", "()V", "luggage-commons-jsapi-default-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        /* renamed from: a */
        public static final void m101843a(Companion companion, Activity activity, float f) {
            WindowManager.LayoutParams attributes;
            companion.getClass();
            Window window = activity.getWindow();
            if (window != null && (attributes = window.getAttributes()) != null) {
                if (Float.compare(-1.0f, f) == 0) {
                    attributes.screenBrightness = -1.0f;
                } else {
                    attributes.screenBrightness = Math.max(f, 0.01f);
                }
                activity.getWindow().setAttributes(attributes);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(jSONObject, "data");
        fVar.mo109673t(new JsApiSetScreenBrightness2$invoke$1(new JsApiSetScreenBrightness2$invoke$logI$1(fVar, i), jSONObject, fVar, this, i));
    }
}
