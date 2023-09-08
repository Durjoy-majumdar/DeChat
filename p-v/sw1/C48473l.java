package sw1;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: sw1.l */
public class C48473l {

    /* renamed from: a */
    public HashMap<String, C48475b> f129681a = new HashMap<>();

    /* renamed from: sw1.l$b */
    public interface C48475b {
        /* renamed from: a */
        void mo65760a(JSONObject jSONObject);

        /* renamed from: b */
        void mo65761b(C48472k kVar);
    }

    /* renamed from: sw1.l$c */
    public static class C48476c {

        /* renamed from: a */
        public static final C48473l f129682a = new C48473l((C48474a) null);
    }

    public C48473l(C48474a aVar) {
    }

    /* renamed from: a */
    public void mo73119a(String str, JSONObject jSONObject) {
        C48475b bVar = this.f129681a.get(str);
        if (bVar != null) {
            bVar.mo65760a(jSONObject);
        }
    }
}
