package ti0;

import android.graphics.Path;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ti0.e */
public class C110997e {

    /* renamed from: a */
    public Map<String, C110993a> f332435a = new HashMap();

    /* renamed from: ti0.e$a */
    public static class C110998a {

        /* renamed from: a */
        public static C110997e f332436a = new C110997e();
    }

    public C110997e() {
        mo162683a(new C111001h());
        mo162683a(new C110999f());
        mo162683a(new C111000g());
        mo162683a(new C111002i());
        mo162683a(new C110996d());
        mo162683a(new C110994b());
        mo162683a(new C110995c());
        mo162683a(new C111003j());
    }

    /* renamed from: a */
    public final void mo162683a(C110993a aVar) {
        if (aVar != null) {
            this.f332435a.put(aVar.getMethod(), aVar);
        }
    }

    /* renamed from: b */
    public Path mo162684b(PathActionArgWrapper pathActionArgWrapper) {
        Path path = new Path();
        List<BasePathActionArg> list = pathActionArgWrapper.f311155e;
        if (!(list == null || list.size() == 0)) {
            for (BasePathActionArg next : list) {
                if (next != null) {
                    C110993a aVar = (C110993a) ((HashMap) this.f332435a).get(next.f311050d);
                    if (aVar != null) {
                        aVar.mo162678a(path, next);
                    }
                }
            }
        }
        return path;
    }

    /* renamed from: c */
    public Path mo162685c(JSONArray jSONArray) {
        Path path = new Path();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(FirebaseAnalytics.C113379b.METHOD);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                    C110993a aVar = (C110993a) ((HashMap) this.f332435a).get(optString);
                    if (aVar != null) {
                        aVar.mo162679b(path, optJSONArray);
                    }
                }
            }
        }
        return path;
    }
}
