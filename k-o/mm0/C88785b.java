package mm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONException;
import org.json.JSONObject;
import vq0.C90860a;

/* renamed from: mm0.b */
public final class C88785b extends C82268c<C83780d1> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "saveInitialRenderingCache";

    /* renamed from: t */
    public boolean mo1769t() {
        return false;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        C90860a aVar = d1Var != null ? (C90860a) d1Var.mo109668l(C90860a.class) : null;
        if (aVar == null) {
            if (d1Var != null) {
                d1Var.mo109647a(i, mo115109j("fail:not supported"));
            }
        } else if (jSONObject == null) {
            d1Var.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            try {
                aVar.Y30(jSONObject.optString("path", d1Var.mo116162Q0()), jSONObject.getString("content"), jSONObject.optString("webviewData", (String) null), jSONObject.optString("appserviceData", (String) null));
                d1Var.mo109647a(i, mo115109j("ok"));
            } catch (JSONException unused) {
                d1Var.mo109647a(i, mo115109j("fail:invalid data"));
            }
        }
    }
}
