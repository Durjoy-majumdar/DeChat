package p828wa;

import android.webkit.ValueCallback;
import java.util.Map;
import org.json.JSONObject;
import p822sa.C48306c;
import p822sa.C48309f;
import p822sa.C48314k;
import p828wa.C53098c;

/* renamed from: wa.b */
public abstract class C53096b<CONTEXT extends C53098c> {

    /* renamed from: d */
    public CONTEXT f148188d;

    /* renamed from: wa.b$a */
    public class C53097a {

        /* renamed from: a */
        public CONTEXT f148189a;

        /* renamed from: b */
        public C48314k f148190b;

        public C53097a(C53096b bVar) {
        }

        /* renamed from: a */
        public void mo73776a() {
            mo73778c("", (JSONObject) null);
        }

        /* renamed from: b */
        public void mo73777b(String str, Map<String, Object> map) {
            C48314k kVar = this.f148190b;
            if (str == null) {
                str = "";
            }
            kVar.f129371f = str;
            JSONObject jSONObject = map != null ? new JSONObject(map) : null;
            kVar.f129372g = jSONObject;
            int i = kVar.f129370e;
            if (i != 0) {
                C48309f fVar = kVar.f129366a;
                C48306c cVar = new C48306c(i, kVar.f129371f, jSONObject, false);
                synchronized (fVar) {
                    if (fVar.f129362c) {
                        fVar.f129360a.evaluateJavascript(String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", new Object[]{cVar.toString()}), (ValueCallback<String>) null);
                    } else {
                        fVar.f129361b.add(cVar);
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo73778c(String str, JSONObject jSONObject) {
            this.f148190b.mo73012a(str, jSONObject);
        }

        /* renamed from: d */
        public void mo73779d(Map<String, Object> map) {
            mo73777b("", map);
        }

        /* renamed from: e */
        public void mo73780e(JSONObject jSONObject) {
            mo73778c("", jSONObject);
        }
    }

    /* renamed from: a */
    public abstract void mo6949a(C53096b<CONTEXT>.a aVar);

    /* renamed from: b */
    public abstract String mo5382b();
}
