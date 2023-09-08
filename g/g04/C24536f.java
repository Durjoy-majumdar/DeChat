package g04;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;
import wy3.C26436b;
import wy3.C26469k;
import zz3.C26800l;
import zz3.C26802n;

/* renamed from: g04.f */
public final class C24536f extends C26800l {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<C26469k> f70119a;

    /* renamed from: b */
    public final /* synthetic */ C24534e f70120b;

    public C24536f(ArrayList<C26469k> arrayList, C24534e eVar) {
        this.f70119a = arrayList;
        this.f70120b = eVar;
    }

    /* renamed from: a */
    public void mo51218a(C26436b bVar) {
        C87412m.m108594g(bVar, "fakeOverride");
        C26802n.m35263r(bVar, (C32226l<C26436b, C13598b0>) null);
        this.f70119a.add(bVar);
    }

    /* renamed from: e */
    public void mo51219e(C26436b bVar, C26436b bVar2) {
        C87412m.m108594g(bVar, "fromSuper");
        C87412m.m108594g(bVar2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f70120b.f70116b + ": " + bVar + " vs " + bVar2).toString());
    }
}
