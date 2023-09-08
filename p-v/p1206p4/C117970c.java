package p1206p4;

import androidx.lifecycle.C54219z;
import p1014o4.C117696p;
import p283z4.C119060c;

/* renamed from: p4.c */
public class C117970c implements C117696p {

    /* renamed from: c */
    public final C54219z<C117696p.C117698b> f352570c = new C54219z<>();

    /* renamed from: d */
    public final C119060c<C117696p.C117698b.C117701c> f352571d = new C119060c<>();

    public C117970c() {
        mo182721a(C117696p.f352025b);
    }

    /* renamed from: a */
    public void mo182721a(C117696p.C117698b bVar) {
        this.f352570c.postValue(bVar);
        if (bVar instanceof C117696p.C117698b.C117701c) {
            this.f352571d.mo183732i((C117696p.C117698b.C117701c) bVar);
        } else if (bVar instanceof C117696p.C117698b.C117699a) {
            this.f352571d.mo183733j(((C117696p.C117698b.C117699a) bVar).f352026a);
        }
    }
}
