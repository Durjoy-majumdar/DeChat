package p822sa;

import android.webkit.ValueCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* renamed from: sa.k */
public class C48314k {

    /* renamed from: a */
    public C48309f f129366a;

    /* renamed from: b */
    public String f129367b;

    /* renamed from: c */
    public JSONObject f129368c;

    /* renamed from: d */
    public boolean f129369d;

    /* renamed from: e */
    public int f129370e;

    /* renamed from: f */
    public String f129371f;

    /* renamed from: g */
    public JSONObject f129372g;

    public C48314k(C48309f fVar, C48316m mVar, boolean z) {
        this.f129366a = fVar;
        JSONObject jSONObject = mVar.f129356b;
        this.f129367b = jSONObject.getString(FirebaseAnalytics.C113379b.METHOD);
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        this.f129368c = optJSONObject;
        if (optJSONObject == null) {
            this.f129368c = new JSONObject("{}");
        }
        this.f129369d = z;
        this.f129370e = jSONObject.optInt("callbackId", 0);
        this.f129372g = new JSONObject();
    }

    /* renamed from: a */
    public void mo73012a(String str, JSONObject jSONObject) {
        if (str == null) {
            str = "";
        }
        this.f129371f = str;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f129372g = jSONObject;
        int i = this.f129370e;
        if (i != 0) {
            C48309f fVar = this.f129366a;
            C48306c cVar = new C48306c(i, this.f129371f, jSONObject, false);
            synchronized (fVar) {
                if (fVar.f129362c) {
                    fVar.f129360a.evaluateJavascript(String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", new Object[]{cVar.toString()}), (ValueCallback<String>) null);
                } else {
                    fVar.f129361b.add(cVar);
                }
            }
        }
    }
}
