package p1068zc;

import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.math.BigDecimal;
import ml0.C88781x;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zc.a */
public class C91660a {
    /* renamed from: a */
    public static Bundle m115195a(JSONObject jSONObject) {
        Bundle a = C88781x.m110845a(jSONObject);
        try {
            if (jSONObject.has("referrer")) {
                a.putString("referrer", jSONObject.getString("referrer"));
            }
        } catch (JSONException e) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "referrer", e.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY)) {
                a.putBoolean(V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY, jSONObject.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY));
            }
        } catch (JSONException e2) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY, e2.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(V2TXJSAdapterConstants.IS_VOIP)) {
                a.putBoolean(V2TXJSAdapterConstants.IS_VOIP, jSONObject.getBoolean(V2TXJSAdapterConstants.IS_VOIP));
            }
        } catch (JSONException e3) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.IS_VOIP, e3.getLocalizedMessage());
        }
        return a;
    }

    /* renamed from: b */
    public static Bundle m115196b(JSONObject jSONObject) {
        Bundle b = C88781x.m110846b(jSONObject);
        try {
            if (jSONObject.has("customEffect")) {
                b.putBoolean("customEffect", jSONObject.getBoolean("customEffect"));
            }
        } catch (JSONException e) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "customEffect", e.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("skinWhiteness")) {
                b.putFloat("skinWhiteness", BigDecimal.valueOf(jSONObject.getDouble("skinWhiteness")).floatValue());
            }
        } catch (JSONException e2) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "skinWhiteness", e2.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("skinSmoothness")) {
                b.putFloat("skinSmoothness", BigDecimal.valueOf(jSONObject.getDouble("skinSmoothness")).floatValue());
            }
        } catch (JSONException e3) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "skinSmoothness", e3.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("faceThinness")) {
                b.putFloat("faceThinness", BigDecimal.valueOf(jSONObject.getDouble("faceThinness")).floatValue());
            }
        } catch (JSONException e4) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "faceThinness", e4.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("eyeBigness")) {
                b.putFloat("eyeBigness", BigDecimal.valueOf(jSONObject.getDouble("eyeBigness")).floatValue());
            }
        } catch (JSONException e5) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "eyeBigness", e5.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(V2TXJSAdapterConstants.IS_VOIP)) {
                b.putBoolean(V2TXJSAdapterConstants.IS_VOIP, jSONObject.getBoolean(V2TXJSAdapterConstants.IS_VOIP));
            }
        } catch (JSONException e6) {
            Log.m105925i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.IS_VOIP, e6.getLocalizedMessage());
        }
        return b;
    }
}
