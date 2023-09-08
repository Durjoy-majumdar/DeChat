package vo1;

import android.os.Bundle;
import d60.C58124b;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13604l;

/* renamed from: vo1.s0 */
public interface C65818s0 {

    /* renamed from: vo1.s0$a */
    public static final class C65819a {
        /* renamed from: a */
        public static /* synthetic */ void m77533a(C65818s0 s0Var, C58124b.C58125b bVar, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                s0Var.statusChange(bVar, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
    }

    /* renamed from: a */
    boolean mo89823a(JSONObject jSONObject, boolean z, C13604l<Integer, Integer> lVar);

    /* renamed from: b */
    void mo89824b(boolean z);

    /* renamed from: c */
    void mo89825c(JSONObject jSONObject);

    /* renamed from: d */
    void mo89826d();

    /* renamed from: e */
    void mo89827e(boolean z);

    /* renamed from: f */
    void mo89828f();

    /* renamed from: g */
    void mo89829g();

    /* renamed from: h */
    void mo89830h();

    /* renamed from: i */
    void mo89831i(boolean z, boolean z2);

    /* renamed from: j */
    void mo89832j(JSONArray jSONArray);

    /* renamed from: k */
    void mo89833k();

    /* renamed from: l */
    void mo89834l(boolean z, C13604l<Integer, Integer> lVar);

    /* renamed from: m */
    void mo89835m(String str);

    /* renamed from: n */
    void mo89836n();

    void statusChange(C58124b.C58125b bVar, Bundle bundle);
}
