package tm0;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p331dj.C107043a;

/* renamed from: tm0.b0 */
public class C14016b0 extends C82268c {
    public static final int CTRL_INDEX = 534;
    public static final String NAME = "setVolume";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiSetVolume", "invoke JsApiSetVolume!");
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiSetVolume", "fail:component is null");
            return;
        }
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiSetVolume", "fail:context is null");
            fVar.mo109647a(i, mo115109j("fail:context is null"));
        } else if (!(context instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiSetVolume", "fail:context is not Activity");
            fVar.mo109647a(i, mo115109j("fail:context is not Activity"));
        } else {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                Log.m105920e("MicroMsg.JsApiSetVolume", "fail:manager is null");
                fVar.mo109647a(i, mo115109j("fail:manager is null"));
                return;
            }
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int optInt = jSONObject.optInt("value", streamVolume);
            Log.m105925i("MicroMsg.JsApiSetVolume", "JsApiSetVolume value:%d, current:%d, max:%d", Integer.valueOf(optInt), Integer.valueOf(streamVolume), Integer.valueOf(streamMaxVolume));
            if (optInt < 0) {
                streamMaxVolume = 0;
            } else if (optInt <= streamMaxVolume) {
                streamMaxVolume = optInt;
            }
            if (streamMaxVolume != streamVolume) {
                C107043a.m144905c(audioManager, 3, streamMaxVolume, 0);
                fVar.mo109647a(i, mo115109j("ok"));
                return;
            }
            fVar.mo109647a(i, mo115109j("fail:volume does not change"));
        }
    }
}
