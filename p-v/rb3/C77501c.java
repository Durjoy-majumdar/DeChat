package rb3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fr3.C75790l;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: rb3.c */
public class C77501c extends C75790l {

    /* renamed from: d */
    public double f225984d = 0.0d;

    public C77501c(List<C77509l> list, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("session_key", str);
        int i = 0;
        for (C77509l next : list) {
            hashMap.put("qt_id_" + i, next.f226006b);
            hashMap.put("ans_cont_" + i, next.f226007c);
            hashMap.put("level_" + i, next.f226011g + "");
            hashMap.put("parent_id_" + i, next.f226008d);
            i++;
            if (next.f226012h != null && "Y".equals(next.f226007c)) {
                hashMap.put("qt_id_" + i, next.f226012h.f226006b);
                hashMap.put("ans_cont_" + i, next.f226012h.f226007c);
                hashMap.put("level_" + i, next.f226012h.f226011g + "");
                hashMap.put("parent_id_" + i, next.f226012h.f226008d);
                i++;
            }
        }
        hashMap.put("total_num", i + "");
        setRequestData(hashMap);
    }

    public int getTenpayCgicmd() {
        return 60;
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        Log.m105918d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            try {
                this.f225984d = ((double) jSONObject.getInt("credit_amount")) / 100.0d;
            } catch (Exception e) {
                Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e, "", new Object[0]);
            }
        }
    }
}
