package wz0;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pz0.C47722k;
import pz0.C47723l;

/* renamed from: wz0.s */
public class C53268s {
    /* renamed from: a */
    public static LinkedList<String> m59708a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons jsonContent is null");
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                Log.m105920e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardIcons itemListJson is null");
                return null;
            }
            LinkedList<String> linkedList = new LinkedList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedList.add(jSONArray.optString(i));
            }
            return linkedList;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static C47722k m59709b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData jsonContent is null");
            return null;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("list");
            if (optJSONObject == null) {
                Log.m105920e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutData resultJson is null");
                return null;
            }
            C47722k kVar = new C47722k();
            kVar.f128216c = optJSONObject.optString("local_city");
            kVar.f128214a = m59710c(optJSONObject.optString("local_city_list"));
            kVar.f128215b = m59710c(optJSONObject.optString("other_city_list"));
            kVar.f128217d = optJSONObject.optBoolean("local_end");
            kVar.f128218e = optJSONObject.optBoolean("other_end");
            kVar.f128219f = optJSONObject.optBoolean("show_red_dot");
            kVar.f128220g = optJSONObject.optBoolean("show_new");
            kVar.f128222i = optJSONObject.optString("tips");
            kVar.f128221h = m59708a(optJSONObject.optString("icons"));
            optJSONObject.optInt("newest_sharecard_time_second");
            Object[] objArr = new Object[5];
            int i = 1;
            objArr[0] = Integer.valueOf(kVar.f128217d ? 1 : 0);
            objArr[1] = Integer.valueOf(kVar.f128218e ? 1 : 0);
            objArr[2] = Integer.valueOf(kVar.f128219f ? 1 : 0);
            if (!kVar.f128220g) {
                i = 0;
            }
            objArr[3] = Integer.valueOf(i);
            objArr[4] = kVar.f128222i;
            Log.m105925i("MicroMsg.ShareCardLayoutDataParser", "localEnd:%d, otherEnd:%d, showRedDot:%d, showNew:%d, tips:%s", objArr);
            return kVar;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static LinkedList<C47723l> m59710c(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem jsonContent is null");
            return null;
        }
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray(FirebaseAnalytics.C113379b.ITEM_LIST);
            if (optJSONArray != null) {
                if (optJSONArray.length() != 0) {
                    LinkedList<C47723l> linkedList = new LinkedList<>();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        C47723l lVar = new C47723l();
                        lVar.f128223a = optJSONObject.optString("card_id");
                        lVar.f128224b = optJSONObject.optString("card_tp_id");
                        lVar.f128225c = optJSONObject.optString("announcement");
                        optJSONObject.optInt("end_time", 0);
                        optJSONObject.optInt("update_time", 0);
                        optJSONObject.optInt("item_type", 0);
                        lVar.f128226d = optJSONObject.optInt("top", 0);
                        Log.m105924i("MicroMsg.ShareCardLayoutDataParser", "ljd: card_tp_id:" + lVar.f128224b + " top:" + lVar.f128226d);
                        linkedList.add(lVar);
                    }
                    return linkedList;
                }
            }
            Log.m105920e("MicroMsg.ShareCardLayoutDataParser", "parseShareCardLayoutItem itemListJson is null");
            return null;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.ShareCardLayoutDataParser", e, "", new Object[0]);
            return null;
        }
    }
}
