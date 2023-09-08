package nm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;
import org.json.JSONObject;

/* renamed from: nm0.d */
public class C11221d extends C82268c<C82381f> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "kvReport";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.Finder.JsApiKvReport", NAME);
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            return;
        }
        int optInt = jSONObject.optInt("logId");
        String optString = jSONObject.optString("logStr");
        if (optInt <= 0 || Util.isNullOrNil(optString)) {
            fVar.mo109647a(i, mo115109j("fail:logId error or logStr null"));
            return;
        }
        Log.m105925i("MicroMsg.Finder.JsApiKvReport", "%s %s", Integer.valueOf(optInt), optString);
        C117407d.INSTANCE.kvStat(optInt, optString);
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
