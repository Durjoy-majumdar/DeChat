package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import js0.C88020k;
import org.json.JSONObject;
import rq0.C90088g;

/* renamed from: fm0.f0 */
public class C86937f0 extends C86975r<C81879g, C90088g> {
    public static final int CTRL_INDEX = 453;
    public static final String NAME = "setBackgroundColor";

    public C86937f0() {
        super(C90088g.class);
    }

    /* renamed from: w */
    public void mo121371w(C81879g gVar, JSONObject jSONObject, int i, Object obj) {
        try {
            ((C90088g) obj).mo116112e(C90088g.C90089a.IGNORE, C88020k.m109562m(jSONObject.optString("backgroundColor", "")));
            gVar.mo109647a(i, mo115109j("ok"));
        } catch (Exception unused) {
            gVar.mo109647a(i, mo115109j("fail:invalid color"));
        }
    }
}
