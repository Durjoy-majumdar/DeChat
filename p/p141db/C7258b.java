package p141db;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import org.json.JSONObject;

/* renamed from: db.b */
public class C7258b extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 585;
    public static final String NAME = "hideSplashScreen";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.JsApiHideSplashScreen", "hideSplashScreen jsApi");
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_appbrand_game_splashscreen, false)) {
            i2Var.mo109647a(i, mo115109j("ok"));
            mo8431w();
        } else if (i2Var.getRuntime() != null) {
            i2Var.getRuntime().mo113058h0();
            mo8431w();
            i2Var.mo109647a(i, mo115109j("ok"));
        } else {
            i2Var.mo109647a(i, mo115109j("fail"));
        }
    }

    /* renamed from: w */
    public void mo8431w() {
        throw null;
    }
}
