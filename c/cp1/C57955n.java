package cp1;

import org.json.JSONObject;

/* renamed from: cp1.n */
public interface C57955n extends C57958p {

    /* renamed from: cp1.n$a */
    public static final class C57956a {
        /* renamed from: a */
        public static /* synthetic */ void m67055a(C57955n nVar, int i, JSONObject jSONObject, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    jSONObject = null;
                }
                if ((i2 & 4) != 0) {
                    z = true;
                }
                nVar.mo82737b(i, jSONObject, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMiniWindow");
        }
    }

    /* renamed from: b */
    void mo82737b(int i, JSONObject jSONObject, boolean z);
}
