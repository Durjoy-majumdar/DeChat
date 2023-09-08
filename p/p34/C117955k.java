package p34;

import l34.C117447c;
import l34.C117456i;
import l34.C117459k;
import p34.C117956l;
import v34.C118649d;

/* renamed from: p34.k */
public class C117955k implements C117447c.C117450c {

    /* renamed from: d */
    public final /* synthetic */ C117956l.C117962f f352541d;

    /* renamed from: e */
    public final /* synthetic */ C117956l.C117957a f352542e;

    public C117955k(C117956l.C117957a aVar, C117956l.C117962f fVar) {
        this.f352542e = aVar;
        this.f352541d = fVar;
    }

    public void call(Object obj) {
        C117459k kVar;
        C117447c.C117451d dVar = (C117447c.C117451d) obj;
        dVar.mo182152b(this.f352541d);
        C117956l.C117962f fVar = this.f352541d;
        C117456i.C117457a aVar = this.f352542e.f352547a;
        int i = C117956l.C117962f.f352555d;
        C117459k kVar2 = (C117459k) fVar.get();
        C117459k kVar3 = C117956l.f352543h;
        if (kVar2 != C118649d.f355040a && kVar2 == (kVar = C117956l.f352543h)) {
            C117459k a = fVar.mo182718a(aVar);
            if (!fVar.compareAndSet(kVar, a)) {
                a.mo182165d();
            }
        }
        dVar.mo182151a();
    }
}
