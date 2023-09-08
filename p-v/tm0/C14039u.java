package tm0;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: tm0.u */
public class C14039u extends C82268c {
    public static final int CTRL_INDEX = 535;
    public static final String NAME = "getVolume";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiGetVolume", "invoke JsApiGetVolume!");
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiGetVolume", "component is null");
            return;
        }
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiGetVolume", "fail:context is null");
            fVar.mo109647a(i, mo115109j("fail:context is null"));
        } else if (!(context instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiGetVolume", "fail:context is not Activity");
            fVar.mo109647a(i, mo115109j("fail:context is not Activity"));
        } else {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                Log.m105920e("MicroMsg.JsApiGetVolume", "fail:manager is null");
                fVar.mo109647a(i, mo115109j("fail:manager is null"));
                return;
            }
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Log.m105925i("MicroMsg.JsApiGetVolume", "JsApiGetVolume %d/%d", Integer.valueOf(streamVolume), Integer.valueOf(streamMaxVolume));
            HashMap hashMap = new HashMap();
            hashMap.put("currentVolume", Integer.valueOf(streamVolume));
            hashMap.put("maxVolume", Integer.valueOf(streamMaxVolume));
            fVar.mo109647a(i, mo115112m("ok", hashMap));
        }
    }
}
