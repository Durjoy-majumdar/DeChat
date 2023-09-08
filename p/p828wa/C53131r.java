package p828wa;

import org.json.JSONObject;
import p822sa.C48314k;
import p828wa.C53096b;
import p829xa.C53314b;
import p829xa.C53315c;

/* renamed from: wa.r */
public class C53131r implements C53315c {

    /* renamed from: a */
    public final /* synthetic */ C53096b f148238a;

    /* renamed from: b */
    public final /* synthetic */ C48314k f148239b;

    public C53131r(C53127q qVar, C53096b bVar, C48314k kVar) {
        this.f148238a = bVar;
        this.f148239b = kVar;
    }

    /* renamed from: a */
    public void mo73817a(C53314b bVar) {
        if (bVar == C53314b.PASS) {
            C53096b bVar2 = this.f148238a;
            C48314k kVar = this.f148239b;
            C53096b.C53097a aVar = new C53096b.C53097a(bVar2);
            aVar.f148189a = bVar2.f148188d;
            aVar.f148190b = kVar;
            bVar2.mo6949a(aVar);
            return;
        }
        this.f148239b.mo73012a("system:access_denied", (JSONObject) null);
    }
}
