package jk0;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jk0.g */
public abstract class C87983g<CONTEXT extends C82381f> extends C82268c<CONTEXT> {
    /* renamed from: A */
    public Boolean mo115317A(JSONObject jSONObject) {
        return null;
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        throw new JSONException("viewId do not exist, override the method getViewId(data).");
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: w */
    public void mo115322w(C82381f fVar, JSONObject jSONObject) {
    }

    /* renamed from: x */
    public final View mo122432x(C82381f fVar, JSONObject jSONObject) {
        try {
            int B = mo22376B(jSONObject);
            boolean optBoolean = jSONObject.optBoolean("independent", false);
            C82520h y = mo122433y(fVar, jSONObject);
            if (y != null) {
                View p = ((C83873p2) y.mo109649c(optBoolean)).mo116438p(B);
                if (p != null) {
                    return p;
                }
                Log.m105929w("MicroMsg.BaseViewOperateJsApi", "get view by viewId(%s) return null.", Integer.valueOf(B));
                throw new IllegalArgumentException("got 'null' when get view by the given viewId");
            }
            throw new IllegalArgumentException("ComponentView is null.");
        } catch (JSONException unused) {
            throw new IllegalArgumentException("view id do not exist");
        }
    }

    /* renamed from: y */
    public final C82520h mo122433y(C82381f fVar, JSONObject jSONObject) {
        C87985i iVar = (C87985i) fVar.mo109668l(C87985i.class);
        if (iVar != null) {
            return iVar.mo116941pG(fVar, jSONObject);
        }
        Log.m105920e("MicroMsg.BaseViewOperateJsApi", "getComponentView NULL IComponentConverter");
        return null;
    }

    /* renamed from: z */
    public float[] mo122434z(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("position"));
            float i = C88020k.m109558i(jSONObject2, "left", 0.0f);
            float i2 = C88020k.m109558i(jSONObject2, "top", 0.0f);
            float i3 = C88020k.m109558i(jSONObject2, "width", 0.0f);
            float i4 = C88020k.m109558i(jSONObject2, "height", 0.0f);
            float f = Float.NaN;
            if (!TextUtils.isEmpty("zIndex")) {
                double optDouble = jSONObject.optDouble("zIndex", (double) Float.NaN);
                if (!Double.isNaN(optDouble)) {
                    f = (float) optDouble;
                }
            }
            return new float[]{i, i2, i3, i4, f};
        } catch (Exception unused) {
            return null;
        }
    }
}
