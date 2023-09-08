package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import org.json.JSONObject;
import rq0.C90088g;

/* renamed from: fm0.g0 */
public class C86940g0 extends C86975r<C81879g, C90088g> {
    public static final int CTRL_INDEX = 454;
    public static final String NAME = "setBackgroundTextStyle";

    public C86940g0() {
        super(C90088g.class);
    }

    /* renamed from: w */
    public void mo121371w(C81879g gVar, JSONObject jSONObject, int i, Object obj) {
        ((C90088g) obj).mo116504c(jSONObject.optString("textStyle", "IGNORE".toLowerCase()));
        gVar.mo109647a(i, mo115109j("ok"));
    }
}
