package ll0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88024r;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ll0.d */
public final class C88573d extends C82268c {
    public static final int CTRL_INDEX = 70;
    public static final String NAME = "hideKeyboard";

    /* renamed from: ll0.d$a */
    public class C88574a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f255818d;

        /* renamed from: e */
        public final /* synthetic */ Integer f255819e;

        /* renamed from: f */
        public final /* synthetic */ int f255820f;

        public C88574a(C82381f fVar, Integer num, int i) {
            this.f255818d = fVar;
            this.f255819e = num;
            this.f255820f = i;
        }

        public void run() {
            C83780d1 d1Var;
            if (this.f255818d.isRunning()) {
                C88573d dVar = C88573d.this;
                C82381f fVar = this.f255818d;
                dVar.getClass();
                if (fVar instanceof C83780d1) {
                    d1Var = (C83780d1) fVar;
                } else if (fVar instanceof C81925i2) {
                    d1Var = ((C81925i2) fVar).getRuntime().mo113042Z().getCurrentPage().getCurrentPageView();
                } else {
                    Log.m105920e("MicroMsg.JsApiHideKeyboard", "invalid component type while calling hide keyboard");
                    d1Var = null;
                }
                this.f255818d.mo109647a(this.f255820f, C88573d.this.mo115109j(C84947c0.m104715c(d1Var, this.f255819e) ? "ok" : "fail:input not exists"));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Integer num;
        try {
            num = Integer.valueOf(jSONObject.getInt("inputId"));
        } catch (JSONException unused) {
            num = null;
        }
        C88024r.m109572b(new C88574a(fVar, num, i));
    }
}
