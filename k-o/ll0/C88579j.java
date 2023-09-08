package ll0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85005z;
import java.util.Map;
import js0.C88024r;
import org.json.JSONObject;

/* renamed from: ll0.j */
public final class C88579j extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 77;
    private static final String NAME = "setKeyboardValue";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 == null || !l0.isRunning()) {
            i2Var.mo109647a(i, mo115109j("fail current page not available"));
            return;
        }
        try {
            String string = jSONObject.getString("value");
            Integer num = null;
            try {
                num = Integer.valueOf(jSONObject.getInt("cursor"));
            } catch (Exception unused) {
            }
            Map<String, Integer> map = C84947c0.f247596d;
            C88024r.m109572b(new C85005z(l0, string, num));
            i2Var.mo109647a(i, mo115109j("ok"));
        } catch (Exception unused2) {
            i2Var.mo109647a(i, mo115109j("fail:invalid data"));
        }
    }
}
