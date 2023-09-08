package r83;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r83.f */
public class C89906f {
    /* renamed from: a */
    public static String m112428a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(j < 3600000 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* renamed from: b */
    public static float m112429b(Context context) {
        float f = ((Activity) context).getWindow().getAttributes().screenBrightness;
        if (f >= 0.0f) {
            return f;
        }
        try {
            return ((float) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) / 255.0f;
        } catch (Settings.SettingNotFoundException e) {
            Log.m105921e("MicroMsg.FTS.FtsVideoPlayerUtils", "ex %s", e.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: c */
    public static String m112430c(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return "";
        }
        try {
            return optJSONArray.getString(0);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.FTS.FtsVideoPlayerUtils", "ex %s", e.getMessage());
            return "";
        }
    }

    /* renamed from: d */
    public static float[] m112431d(JSONObject jSONObject, Context context) {
        float[] fArr = new float[5];
        if (jSONObject.has("x")) {
            fArr[0] = (float) C76577a.m92151b(context, jSONObject.optInt("x"));
        } else {
            fArr[0] = Float.MAX_VALUE;
        }
        if (jSONObject.has("y")) {
            fArr[1] = (float) C76577a.m92151b(context, jSONObject.optInt("y"));
        } else {
            fArr[1] = Float.MAX_VALUE;
        }
        if (jSONObject.has("width")) {
            fArr[2] = (float) C76577a.m92151b(context, jSONObject.optInt("width"));
        } else {
            fArr[2] = Float.MAX_VALUE;
        }
        if (jSONObject.has("height")) {
            fArr[3] = (float) C76577a.m92151b(context, jSONObject.optInt("height"));
        } else {
            fArr[3] = Float.MAX_VALUE;
        }
        fArr[4] = 0.0f;
        return fArr;
    }
}
