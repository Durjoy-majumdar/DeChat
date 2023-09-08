package tm0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.view.WindowManager;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: tm0.o */
public class C90548o extends C82268c {
    public static final int CTRL_INDEX = 232;
    public static final String NAME = "getScreenBrightness";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness!");
        Context context = fVar.getContext();
        if (context == null) {
            fVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiGetScreenBrightness", "context is null, invoke fail!");
        } else if (!(context instanceof Activity)) {
            fVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiGetScreenBrightness", "context is not Activity, invoke fail!");
        } else {
            WindowManager.LayoutParams attributes = ((Activity) context).getWindow().getAttributes();
            float f = attributes.screenBrightness;
            if (f < 0.0f) {
                try {
                    f = ((float) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) / ((float) mo124682w());
                } catch (Settings.SettingNotFoundException e) {
                    Log.m105921e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", e.getMessage());
                    f = 0.0f;
                    Log.m105925i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", Float.valueOf(f), Float.valueOf(attributes.screenBrightness));
                    HashMap hashMap = new HashMap();
                    hashMap.put("value", Float.valueOf(f));
                    fVar.mo109647a(i, mo115112m("ok", hashMap));
                } catch (IllegalArgumentException e2) {
                    Log.m105921e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent IllegalArgumentException: %s", e2.getMessage());
                    f = 0.0f;
                    Log.m105925i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", Float.valueOf(f), Float.valueOf(attributes.screenBrightness));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("value", Float.valueOf(f));
                    fVar.mo109647a(i, mo115112m("ok", hashMap2));
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.JsApiGetScreenBrightness", "getSystemBrightnessPercent err %s", e3.getMessage());
                    f = 0.0f;
                    Log.m105925i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", Float.valueOf(f), Float.valueOf(attributes.screenBrightness));
                    HashMap hashMap22 = new HashMap();
                    hashMap22.put("value", Float.valueOf(f));
                    fVar.mo109647a(i, mo115112m("ok", hashMap22));
                }
            }
            Log.m105925i("MicroMsg.JsApiGetScreenBrightness", "JsApiGetScreenBrightness %f/%f", Float.valueOf(f), Float.valueOf(attributes.screenBrightness));
            HashMap hashMap222 = new HashMap();
            hashMap222.put("value", Float.valueOf(f));
            fVar.mo109647a(i, mo115112m("ok", hashMap222));
        }
    }

    /* renamed from: w */
    public final int mo124682w() {
        try {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", Platform.ANDROID);
            if (identifier != 0) {
                return system.getInteger(identifier);
            }
            return 255;
        } catch (Exception unused) {
            Log.m105924i("MicroMsg.JsApiGetScreenBrightness", "get max brightness fail, fallback to 255");
            return 255;
        }
    }
}
