package im0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: im0.j */
public final class C9198j extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 105;
    private static final String NAME = "showToast";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 == null) {
            Log.m105928w("MicroMsg.JsApiShowToast", "invoke JsApi JsApiShowToast failed, current page view is null.");
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        boolean z = false;
        Log.m105925i("MicroMsg.JsApiShowToast", "showToast:%s, callbackId:%d", jSONObject, Integer.valueOf(i));
        int optInt = jSONObject.optInt("duration", 1500);
        String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString2 = jSONObject.optString("icon", "success");
        String optString3 = jSONObject.optString("image");
        boolean optBoolean = jSONObject.optBoolean("mask");
        if (Util.isNullOrNil(optString2) && Util.isNullOrNil(optString3)) {
            z = true;
        }
        l0.mo109673t(new C76362f(this, i2Var, z, l0, optInt, optString, i, optBoolean, optString2, optString3));
    }
}
