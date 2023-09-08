package tm0;

import android.os.Vibrator;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import li0.C88508b;
import org.json.JSONObject;

/* renamed from: tm0.c0 */
public class C78043c0 extends C82268c {
    public static final int CTRL_INDEX = 231;
    public static final String NAME = "vibrateLong";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiVibrateLong", "JsApiVibrateLong!");
        if (fVar.getAppState() != C88508b.FOREGROUND) {
            fVar.mo109647a(i, mo115109j("fail:not allowed in background"));
            return;
        }
        Vibrator vibrator = (Vibrator) fVar.getContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(400);
        }
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
