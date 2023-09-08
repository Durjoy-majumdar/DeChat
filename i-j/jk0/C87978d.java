package jk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import xk0.C112159h;
import xk0.C91271i;

/* renamed from: jk0.d */
public abstract class C87978d<CONTEXT extends C82520h> extends C87983g<C82381f> {
    /* renamed from: C */
    public boolean mo121671C() {
        return this instanceof C112159h;
    }

    /* renamed from: D */
    public boolean mo121672D() {
        return this instanceof C112159h;
    }

    /* renamed from: E */
    public View mo22377E(CONTEXT context, JSONObject jSONObject) {
        throw new IllegalStateException("inflateView must be inflated." + this);
    }

    /* renamed from: F */
    public View mo110320F(CONTEXT context, JSONObject jSONObject, int i) {
        return mo22377E(context, jSONObject);
    }

    /* renamed from: G */
    public boolean mo114664G() {
        return this instanceof C91271i;
    }

    /* renamed from: H */
    public void mo22378H(CONTEXT context, int i, View view, JSONObject jSONObject) {
    }

    /* renamed from: I */
    public void mo114665I(CONTEXT context, int i, View view, JSONObject jSONObject, C87987k kVar) {
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* renamed from: v */
    public void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        C82520h y = mo122433y(fVar, jSONObject);
        if (y == null) {
            Log.m105929w("MicroMsg.BaseInsertViewJsApi", "invoke JsApi(%s) failed, component view is null", mo114779e());
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:ComponentView is null.");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("fail:ComponentView is null.", jSONObject2));
            return;
        }
        C87987k kVar = new C87987k(fVar, i);
        mo115322w(y, jSONObject);
        y.mo109673t(new C87976b(this, y, oVar, kVar, jSONObject));
    }
}
