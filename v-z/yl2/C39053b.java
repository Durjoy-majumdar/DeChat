package yl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import ny3.C25235d;
import org.json.JSONObject;
import qy3.C25943l;
import zl2.C39380c;

/* renamed from: yl2.b */
public final class C39053b {

    /* renamed from: f */
    public static final C39054a f105139f = new C39054a((C8480h) null);

    /* renamed from: a */
    public final String f105140a;

    /* renamed from: b */
    public final int f105141b;

    /* renamed from: c */
    public final C39380c f105142c;

    /* renamed from: d */
    public long f105143d;

    /* renamed from: e */
    public final boolean f105144e;

    /* renamed from: yl2.b$a */
    public static final class C39054a {
        public C39054a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C39053b mo61895a(JSONObject jSONObject, C39380c cVar) {
            C87412m.m108594g(jSONObject, "json");
            String string = jSONObject.getString("id");
            int i = jSONObject.getInt("i");
            String string2 = jSONObject.getString("cb");
            long j = jSONObject.getLong("t");
            boolean z = jSONObject.getBoolean("o");
            if (cVar != null) {
                try {
                    C87412m.m108593f(string, "sessionId");
                    return new C39053b(string, i, cVar, j, z);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MTimer", e, "getKV error", new Object[0]);
                }
            } else if (!z) {
                Log.m105925i("MicroMsg.MTimer", "%s, newTask not offline type", jSONObject.toString());
                return null;
            } else {
                Object newInstance = Class.forName(string2).newInstance();
                if (newInstance != null && (newInstance instanceof C39380c)) {
                    C87412m.m108593f(string, "sessionId");
                    return new C39053b(string, i, (C39380c) newInstance, j, z);
                }
                return null;
            }
        }
    }

    public C39053b(String str, int i, C39380c cVar, long j, boolean z) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(cVar, "callback");
        this.f105140a = str;
        this.f105141b = i;
        this.f105142c = cVar;
        this.f105143d = j;
        this.f105144e = z;
    }

    /* renamed from: a */
    public final JSONObject mo61891a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f105140a);
        jSONObject.put("i", this.f105141b);
        C25235d a = C24560g0.m30725a(this.f105142c.getClass());
        C87412m.m108594g(a, "<this>");
        jSONObject.put("cb", ((C25943l) a).f72307e.getName());
        jSONObject.put("t", this.f105143d);
        jSONObject.put("o", this.f105144e);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39053b)) {
            return false;
        }
        C39053b bVar = (C39053b) obj;
        return C87412m.m108589b(this.f105140a, bVar.f105140a) && this.f105141b == bVar.f105141b && C87412m.m108589b(this.f105142c, bVar.f105142c) && this.f105143d == bVar.f105143d && this.f105144e == bVar.f105144e;
    }

    public int hashCode() {
        long j = this.f105143d;
        int hashCode = ((((((this.f105140a.hashCode() * 31) + this.f105141b) * 31) + this.f105142c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f105144e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "MTimerTask(sessionId=" + this.f105140a + ", interval=" + this.f105141b + ", callback=" + this.f105142c + ", time=" + this.f105143d + ", offline=" + this.f105144e + ')';
    }
}
