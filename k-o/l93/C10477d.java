package l93;

import android.os.Bundle;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l93.d */
public final class C10477d {

    /* renamed from: a */
    public static final /* synthetic */ int f31711a = 0;

    /* renamed from: l93.d$a */
    public static final class C10478a extends JSONObject {
        public C10478a(Object obj) {
            if (obj instanceof String) {
                put("type", 1);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof Integer) {
                put("type", 2);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof Long) {
                put("type", 3);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else if (obj instanceof Boolean) {
                put("type", 4);
                put(TPReportParams.JSON_KEY_VAL, obj);
            } else {
                Log.m105929w("MicroMsg.WebViewBagIntentLogic", "put not support type;class:%s", obj.getClass());
                put("type", 0);
                put(TPReportParams.JSON_KEY_VAL, obj);
            }
        }

        /* renamed from: a */
        public static void m10404a(Bundle bundle, String str, JSONObject jSONObject) {
            try {
                int i = jSONObject.getInt("type");
                Log.m105925i("MicroMsg.WebViewBagIntentLogic", "restoreToBundle key:%s type：%d", str, Integer.valueOf(i));
                if (i == 1) {
                    bundle.putString(str, jSONObject.getString(TPReportParams.JSON_KEY_VAL));
                } else if (i == 2) {
                    bundle.putInt(str, jSONObject.getInt(TPReportParams.JSON_KEY_VAL));
                } else if (i == 3) {
                    bundle.putLong(str, jSONObject.getLong(TPReportParams.JSON_KEY_VAL));
                } else if (i != 4) {
                    Log.m105928w("MicroMsg.WebViewBagIntentLogic", "not support type");
                } else {
                    bundle.putBoolean(str, jSONObject.getBoolean(TPReportParams.JSON_KEY_VAL));
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WebViewBagIntentLogic", "restoreToBundle e:%s", e);
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
    }
}
