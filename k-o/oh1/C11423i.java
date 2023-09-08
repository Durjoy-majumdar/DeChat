package oh1;

import cl1.C54991o;
import cl1.C55001u;
import di0.C86295k;
import fj1.C45795b;
import o40.C61926c;
import org.json.JSONObject;

/* renamed from: oh1.i */
public final class C11423i implements C86295k {

    /* renamed from: d */
    public final /* synthetic */ C45795b f33605d;

    public C11423i(C45795b bVar) {
        this.f33605d = bVar;
    }

    /* renamed from: a */
    public final String mo3693a() {
        Class cls = C55001u.class;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finderUsername", ((C54991o) this.f33605d.mo71262a(C54991o.class)).f154345o);
        jSONObject.put("liveID", C61926c.m72691p(((C55001u) this.f33605d.mo71262a(cls)).f154420q.f182392d));
        jSONObject.put("objectID", C61926c.m72691p(((C55001u) this.f33605d.mo71262a(cls)).f154416j));
        return jSONObject.toString();
    }
}
