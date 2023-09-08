package p871zj;

import p001ak.C54053a;
import p848dk.C58303g;
import p850ek.C58614e;
import p871zj.C66851m;

/* renamed from: zj.f */
public class C66841f implements C66851m.C66852a {

    /* renamed from: a */
    public final /* synthetic */ C66838e f192010a;

    public C66841f(C66838e eVar) {
        this.f192010a = eVar;
    }

    /* renamed from: a */
    public void mo90837a(C54053a aVar) {
        C66843h hVar = this.f192010a.f191990h;
        hVar.mo90840c();
        C58614e.m68067d("DanmakuDataSource", "addNow: danmaku = " + aVar);
        C58303g<C54053a> gVar = hVar.f192013b;
        if (aVar == null) {
            gVar.getClass();
        } else {
            C58303g.C58304a<T> aVar2 = gVar.f166941a.f166946b;
            while (aVar2 != gVar.f166941a && gVar.f166942b.compare(aVar2.f166945a, aVar) < 0) {
                aVar2 = aVar2.f166946b;
            }
            if (!aVar.equals(aVar2.f166945a)) {
                C58303g.C58304a<T> aVar3 = aVar2.f166947c;
                C58303g.C58304a<T> aVar4 = new C58303g.C58304a<>(aVar, aVar2, aVar3);
                aVar3.f166946b = aVar4;
                aVar2.f166947c = aVar4;
                gVar.f166944d++;
            }
        }
        hVar.mo90841d();
    }
}
