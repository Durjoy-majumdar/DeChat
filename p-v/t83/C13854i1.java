package t83;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p823sg.C48379o;
import qe3.C25549c;
import u24.C90595a;

/* renamed from: t83.i1 */
public class C13854i1 {
    /* renamed from: a */
    public static C13851h1 m13148a(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MsgWrapperHelper", "fromString fail, src is null");
            return null;
        }
        C13851h1 h1Var = new C13851h1();
        try {
            JSONObject jSONObject = new JSONObject(str);
            h1Var.f38989b = jSONObject.optString("__msg_type", "");
            h1Var.f38990c = jSONObject.optString("__callback_id", "-1");
            h1Var.f38996i = jSONObject.getString("func");
            h1Var.f38983a = new HashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (TextUtils.isEmpty(h1Var.f38996i) || !C90595a.m113498b(C25549c.f72240b, h1Var.f38996i)) {
                h1Var.f38991d = null;
            } else {
                h1Var.f38991d = jSONObject2;
            }
            if (jSONObject2 != null) {
                m13151d(jSONObject2, h1Var.f38983a);
            }
            return h1Var;
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.MsgWrapperHelper", "fromString fail, exception = " + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static List<C13851h1> m13149b(String str, boolean z, String str2) {
        JSONArray jSONArray;
        String str3 = str;
        if (str3 == null || str.length() == 0) {
            Log.m105920e("MicroMsg.MsgWrapperHelper", "getMsgList fail, src is null");
            return null;
        }
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                jSONArray = jSONObject.getJSONArray("__json_message");
                String string = jSONObject.getString("__sha_key");
                String b = C48379o.m53725b(jSONArray.toString().replaceAll("\\\\/", "/") + str2);
                if (!string.equals(b)) {
                    Log.m105921e("MicroMsg.MsgWrapperHelper", "fromString SHA1 verification failed, sha1Str = %s, calSha1Str = %s, jsonList = %s", string, b, jSONArray.toString().replaceAll("\\\\/", "/"));
                    C115669n.INSTANCE.idkeyStat(894, 6, 1, false);
                    return null;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MsgWrapperHelper", "dealMsgQueue fail, exception = " + e.getMessage());
                return null;
            }
        } else {
            jSONArray = new JSONArray(str3);
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < jSONArray.length(); i++) {
            linkedList.add(m13148a(jSONArray.getString(i)));
        }
        return linkedList;
    }

    /* renamed from: c */
    public static C13851h1 m13150c(String str, String str2, String str3) {
        C13851h1 h1Var = new C13851h1();
        h1Var.f38989b = "call";
        h1Var.f38996i = str;
        h1Var.f38983a = new HashMap();
        h1Var.f38990c = str3;
        JSONObject jSONObject = new JSONObject(str2);
        if (TextUtils.isEmpty(h1Var.f38996i) || !C90595a.m113498b(C25549c.f72240b, h1Var.f38996i)) {
            h1Var.f38991d = null;
        } else {
            h1Var.f38991d = jSONObject;
        }
        m13151d(jSONObject, h1Var.f38983a);
        return h1Var;
    }

    /* renamed from: d */
    public static void m13151d(JSONObject jSONObject, Map<String, Object> map) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = jSONObject.getString(next);
            if (string == null) {
                string = "";
            }
            if ("urls".equalsIgnoreCase(next)) {
                Log.m105927v("MicroMsg.MsgWrapperHelper", "key is JSONArray, %s", next);
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    int length = jSONArray.length();
                    String[] strArr = new String[length];
                    for (int i = 0; i < length; i++) {
                        strArr[i] = jSONArray.getString(i);
                    }
                    map.put(next, strArr);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MsgWrapperHelper", "parse JSONArray fail, ex = %s", e.getMessage());
                }
            } else {
                map.put(next, string);
            }
        }
    }
}
