package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import org.json.JSONObject;
import p828wa.C53096b;
import w93.C15055c;
import w93.C15057e;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.i1 */
public class C4483i1 extends C5954n2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.i1$a */
    public class C4484a implements Comparator<Integer> {
        public C4484a(C4483i1 i1Var) {
        }

        public int compare(Object obj, Object obj2) {
            return ((Integer) obj).compareTo((Integer) obj2);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "reportGameWeb";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
        TreeMap treeMap = new TreeMap(new C4484a(this));
        JSONObject jSONObject = aVar.f148190b.f129368c;
        String optString = jSONObject.optString("type");
        boolean equals = "1".equals(jSONObject.optString("isReportNow"));
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            Log.m105924i("MicroMsg.JsApiReportGameWeb", "data is null or not json");
            aVar.mo73778c("data_is_null", (JSONObject) null);
        } else if ("1".equals(optString)) {
            Log.m105925i("MicroMsg.JsApiReportGameWeb", "report web performance, url:%s", ((GameWebPage) aVar.f148189a).mo67941t());
            treeMap.put(1000, Boolean.valueOf(equals));
            HashMap hashMap = (HashMap) C15057e.m14227a(optJSONObject);
            for (Integer num : hashMap.keySet()) {
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, hashMap.get(num));
                }
            }
            C15057e.m14228b(((GameWebPage) aVar.f148189a).mo65796d0(), treeMap);
            aVar.mo73776a();
        } else if ("2".equals(optString)) {
            treeMap.putAll(((GameWebPage) aVar.f148189a).mo14075r1());
            HashMap hashMap2 = (HashMap) C15057e.m14227a(optJSONObject);
            for (Integer num2 : hashMap2.keySet()) {
                if (!treeMap.containsKey(num2)) {
                    treeMap.put(num2, hashMap2.get(num2));
                }
            }
            String a = C15055c.m14223a(treeMap);
            Log.m105925i("MicroMsg.JsApiReportGameWeb", "report web runtime. isReportNow:%b, reportData: [%s]", Boolean.valueOf(equals), a);
            C115669n.INSTANCE.mo160126c(16145, a, equals, false);
            aVar.mo73776a();
        } else {
            Log.m105925i("MicroMsg.JsApiReportGameWeb", "type is error. type:%s", optString);
            aVar.mo73778c("type_not_right", (JSONObject) null);
        }
    }
}
