package w93;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: w93.e */
public class C15057e {

    /* renamed from: w93.e$a */
    public static class C15058a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("report_data");
            String string2 = bundle.getString("page_key");
            if (!Util.isNullOrNil(string)) {
                try {
                    C15057e.m14228b(string2, C15057e.m14227a(new JSONObject(string)));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static Map<Integer, Object> m14227a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            int i = Util.getInt(next, -1);
            if (i == -1) {
                Log.m105924i("MicroMsg.GameWebReportUtil", "reportData key error");
            } else {
                hashMap.put(Integer.valueOf(i), jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static void m14228b(String str, Map<Integer, Object> map) {
        if (C44594n1.m49045a() || MMApplicationContext.isToolsProcess()) {
            Map<String, Map<Integer, Object>> map2 = C15055c.f41192a;
            if (!Util.isNullOrNil(str)) {
                HashMap hashMap = (HashMap) C15055c.f41192a;
                Map map3 = (Map) hashMap.get(str);
                if (map3 != null) {
                    map3.putAll(map);
                } else {
                    hashMap.put(str, map);
                }
            }
        } else {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                try {
                    for (Integer next : map.keySet()) {
                        jSONObject.put(String.valueOf(next), map.get(next));
                    }
                } catch (Exception unused) {
                }
            }
            bundle.putString("report_data", jSONObject.toString());
            bundle.putString("page_key", str);
            ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(bundle, C15058a.class, (C1256g) null);
        }
    }
}
