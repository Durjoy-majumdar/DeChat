package om0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import wq0.C91062d;

/* renamed from: om0.a */
public class C89245a extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1003;
    public static final String NAME = "showSalesDrivingMenu";

    public C89245a() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 != null) {
            l0.mo116204x0(31, false);
        }
        Log.m105924i("MicroMsg.JsApiShowSalesDrivingMenu", "show sales menu");
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
