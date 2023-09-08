package f00;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import sw1.C101706u;
import z83.C16123a;

/* renamed from: f00.l */
public class C7962l implements C101706u {
    /* renamed from: E4 */
    public void mo9068E4(String str, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("postId", str);
            jSONObject.put("percent", (double) f);
            Bundle bundle = new Bundle();
            bundle.putString("name", "onPublishHaowanProgress");
            bundle.putString("data", jSONObject.toString());
            ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(bundle, C16123a.class, (C1256g) null);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: k2 */
    public void mo9069k2(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("postId", str);
            jSONObject.put("result", i);
            Bundle bundle = new Bundle();
            bundle.putString("name", "onPublishHaowanEnd");
            bundle.putString("data", jSONObject.toString());
            ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(bundle, C16123a.class, (C1256g) null);
        } catch (JSONException unused) {
        }
    }
}
