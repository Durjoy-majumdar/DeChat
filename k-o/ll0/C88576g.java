package ll0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import java.lang.ref.WeakReference;
import js0.C88024r;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ll0.g */
public final class C88576g extends C82268c<C83780d1> {
    private static final int CTRL_INDEX = 119;
    private static final String NAME = "removeTextArea";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        try {
            C88024r.m109572b(new C88575f(this, new WeakReference(d1Var), jSONObject.getInt("inputId"), i));
        } catch (JSONException unused) {
            d1Var.mo109647a(i, mo115109j("fail:invalid data"));
        }
    }
}
