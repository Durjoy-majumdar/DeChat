package rb3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rb3.e */
public class C77503e extends C75790l {

    /* renamed from: d */
    public List<C77509l> f225986d;

    /* renamed from: e */
    public String f225987e;

    /* renamed from: f */
    public int f225988f;

    public C77503e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("bind_serialno", str);
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 59;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            try {
                this.f225987e = jSONObject.getString("session_key");
                this.f225988f = jSONObject.optInt("answer_times_left", -1);
                JSONArray jSONArray = jSONObject.getJSONArray("Array");
                if (jSONArray != null && jSONArray.length() > 0) {
                    HashMap hashMap = new HashMap();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        C77509l lVar = new C77509l();
                        lVar.f226006b = jSONObject2.getString("qt_id");
                        lVar.f226008d = jSONObject2.getString("parent_id");
                        jSONObject2.getString("qt_type");
                        lVar.f226009e = jSONObject2.getString("qt_cont");
                        jSONObject2.getInt("ans_len");
                        lVar.f226010f = jSONObject2.getString("wording");
                        lVar.f226011g = jSONObject2.getInt(FirebaseAnalytics.C113379b.LEVEL);
                        if (!hashMap.containsKey(lVar.f226008d) || "0".equals(lVar.f226008d)) {
                            hashMap.put(lVar.f226006b, lVar);
                        } else {
                            ((C77509l) hashMap.get(lVar.f226008d)).f226012h = lVar;
                        }
                    }
                    this.f225986d = new ArrayList(hashMap.values());
                    hashMap.clear();
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e, "", new Object[0]);
            }
        }
    }
}
