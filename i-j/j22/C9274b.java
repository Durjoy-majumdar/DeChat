package j22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import kr0.C10403n0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: j22.b */
public class C9274b extends C4770c {
    /* renamed from: q */
    public static List<String> m8912q(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return new LinkedList();
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < jSONArray.length(); i++) {
            linkedList.add(jSONArray.optString(i));
        }
        return linkedList;
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiPreloadMiniProgramContacts", "Invoke preloadMiniProgramContacts");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        List<String> list = null;
        if (jSONObject.has("userNames")) {
            Object opt = jSONObject.opt("userNames");
            if (opt instanceof String) {
                try {
                    list = m8912q(new JSONArray((String) opt));
                } catch (Exception unused) {
                    this.f19815f.mo5689a("fail: params error");
                    return;
                }
            } else if (opt instanceof JSONArray) {
                list = m8912q((JSONArray) opt);
            }
        }
        if (!Util.isNullOrNil((List) list)) {
            ((C10403n0) C86312j.m106911c(C10403n0.class)).a30(list);
            this.f19815f.mo5690b();
            return;
        }
        this.f19815f.mo5689a("fail: params error");
    }
}
