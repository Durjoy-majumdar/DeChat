package aa1;

import android.text.TextUtils;
import ba1.C113150a;
import ca1.C113264b;
import com.tencent.p014mm.autogen.events.HellBizIdEvent;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import op3.C117877b;
import op3.C117882j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C101777fg2;
import te3.C118427eg2;

/* renamed from: aa1.a */
public final class C112763a {
    /* renamed from: a */
    public static void m154256a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        C117877b bVar = null;
        try {
            jSONObject.put("businessId", str3);
            jSONObject.put("dataPath", str);
            jSONObject.put("value", str2);
        } catch (JSONException e) {
            Log.printErrStackTrace("HABBYGE-MALI.AsyncBizCollector", e, "AsyncBizCollector, generateParamJSONOBject, %s", e.getMessage());
            jSONObject = null;
        }
        if (jSONObject != null) {
            Log.m105925i("HABBYGE-MALI.AsyncBizCollector", "_collectBizData: %s, %s, %s", str, str2, str3);
            String a = C113150a.m154814a();
            if (a == null || a.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                C113150a.m154815b(System.currentTimeMillis() + "@" + jSONArray.toString());
            } else if ("-1".equals(a)) {
                Log.m105920e("HABBYGE-MALI.AsyncBizDao", " AsyncBizDao putBiz NOT LOGIN");
            } else if (a.split("@").length <= 1) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject);
                C113150a.m154815b(a + "@" + jSONArray2.toString());
            } else {
                if (!a.isEmpty()) {
                    String[] split = a.split("@");
                    if (split.length > 0) {
                        bVar = split.length == 1 ? C117882j.m166284c(split[0], null) : C117882j.m166284c(split[0], split[1]);
                    }
                }
                if (bVar == null) {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject);
                    C113150a.m154815b(System.currentTimeMillis() + "@" + jSONArray3.toString());
                } else if (!TextUtils.isEmpty((CharSequence) bVar.mo182596a(1)) || TextUtils.isEmpty((CharSequence) bVar.mo182596a(0))) {
                    try {
                        JSONArray jSONArray4 = new JSONArray((String) bVar.mo182596a(1));
                        jSONArray4.put(jSONObject);
                        C113150a.m154815b(((String) bVar.mo182596a(0)) + "@" + jSONArray4.toString());
                    } catch (JSONException e2) {
                        Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e2, "AsyncBizDao.putBiz crash: %s", e2.getMessage());
                    }
                } else {
                    JSONArray jSONArray5 = new JSONArray();
                    jSONArray5.put(jSONObject);
                    C113150a.m154815b(((String) bVar.mo182596a(0)) + "@" + jSONArray5.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public static void m154257b(String str) {
        String str2;
        C117877b<C118427eg2, Integer> a = C16453b.m15287a();
        if (a == null) {
            Log.m105920e("HABBYGE-MALI.AsyncBizCollector", "getBizId, tuple2 is NULL");
            str2 = null;
        } else {
            C118427eg2 eg22 = (C118427eg2) a.mo182596a(0);
            int intValue = ((Integer) a.mo182596a(1)).intValue();
            int size = eg22.f353973h.size() + 1;
            int size2 = eg22.f353975j.size() + 1;
            C115411b.C115412a aVar = C115411b.f345922a;
            int i = size >= size2 ? size + 1 : size2 + 1;
            C101777fg2 fg22 = new C101777fg2();
            fg22.f298259f = C115411b.m162221d(eg22.f353970e, i);
            eg22.f353973h.add(fg22);
            eg22.f353975j.add(fg22);
            C113264b.m155063i(eg22, intValue);
            Log.m105925i("HABBYGE-MALI.AsyncBizCollector", "getBizId, addBizIdCurPageFlowItem: %s", fg22.f298259f);
            str2 = fg22.f298259f;
        }
        Log.m105925i("HABBYGE-MALI.AsyncBizCollector", "AsyncBizCollector, _collectBizId: %s", str2);
        C91980d.vx0().getClass();
        Log.m105925i("MicroMsg.HellBizService", "HABBYGE-MALI, notifyGetBizId: requestId:%s, bizId:%s", str, str2);
        HellBizIdEvent hellBizIdEvent = new HellBizIdEvent();
        HellBizIdEvent.C92529a aVar2 = hellBizIdEvent.f264903d;
        aVar2.f264904a = str;
        aVar2.f264905b = str2;
        hellBizIdEvent.publish();
    }
}
