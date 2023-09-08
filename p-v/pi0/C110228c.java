package pi0;

import android.graphics.Canvas;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import qi0.C110402a;
import qi0.C110403a0;
import qi0.C110404b;
import qi0.C110405b0;
import qi0.C110406c;
import qi0.C110407c0;
import qi0.C110408d;
import qi0.C110409d0;
import qi0.C110410e;
import qi0.C110411e0;
import qi0.C110412f;
import qi0.C110415f0;
import qi0.C110416g;
import qi0.C110417g0;
import qi0.C110418h;
import qi0.C110419h0;
import qi0.C110420i;
import qi0.C110421i0;
import qi0.C110422j;
import qi0.C110423j0;
import qi0.C110424k;
import qi0.C110425k0;
import qi0.C110426l;
import qi0.C110427m;
import qi0.C110428n;
import qi0.C110429o;
import qi0.C110430p;
import qi0.C110431q;
import qi0.C110432r;
import qi0.C110433s;
import qi0.C110434t;
import qi0.C110435u;
import qi0.C110436v;
import qi0.C110437w;
import qi0.C110438x;
import qi0.C110439y;
import qi0.C110440z;

/* renamed from: pi0.c */
public class C110228c {

    /* renamed from: a */
    public Map<String, C110408d> f329743a = new HashMap();

    public C110228c() {
        mo161634a(new C110411e0());
        mo161634a(new C110431q());
        mo161634a(new C110415f0());
        mo161634a(new C110436v());
        mo161634a(new C110424k());
        mo161634a(new C110402a());
        mo161634a(new C110418h());
        mo161634a(new C110410e());
        mo161634a(new C110426l());
        mo161634a(new C110420i());
        mo161634a(new C110412f());
        mo161634a(new C110409d0());
        mo161634a(new C110422j());
        mo161634a(new C110416g());
        mo161634a(new C110406c());
        mo161634a(new C110404b());
        mo161634a(new C110417g0());
        mo161634a(new C110419h0());
        mo161634a(new C110438x());
        mo161634a(new C110403a0());
        mo161634a(new C110405b0());
        mo161634a(new C110407c0());
        mo161634a(new C110433s());
        mo161634a(new C110439y());
        mo161634a(new C110434t());
        mo161634a(new C110435u());
        mo161634a(new C110432r());
        mo161634a(new C110440z());
        mo161634a(new C110421i0());
        mo161634a(new C110437w());
        mo161634a(new C110430p());
        mo161634a(new C110428n());
        mo161634a(new C110425k0());
        mo161634a(new C110429o());
        mo161634a(new C110427m());
        mo161634a(new C110423j0());
    }

    /* renamed from: a */
    public final void mo161634a(C110408d dVar) {
        if (dVar != null) {
            this.f329743a.put(dVar.getMethod(), dVar);
        }
    }

    /* renamed from: b */
    public boolean mo161635b(C110229d dVar, Canvas canvas, JSONObject jSONObject) {
        String optString = jSONObject.optString(FirebaseAnalytics.C113379b.METHOD);
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        C110408d dVar2 = (C110408d) ((HashMap) this.f329743a).get(optString);
        if (dVar2 == null) {
            return false;
        }
        return dVar2.mo161915b(dVar, canvas, optJSONArray);
    }
}
