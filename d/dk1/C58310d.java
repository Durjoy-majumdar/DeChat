package dk1;

import bl3.C39818r;
import dk1.C58312g;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: dk1.d */
public final class C58310d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ HashSet<Integer> f166957d;

    /* renamed from: e */
    public final /* synthetic */ C58312g.C58313a f166958e;

    /* renamed from: f */
    public final /* synthetic */ C58312g f166959f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C58307a> f166960g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58310d(HashSet<Integer> hashSet, C58312g.C58313a aVar, C58312g gVar, ArrayList<C58307a> arrayList) {
        super(0);
        this.f166957d = hashSet;
        this.f166958e = aVar;
        this.f166959f = gVar;
        this.f166960g = arrayList;
    }

    public Object invoke() {
        HashSet<Integer> hashSet = this.f166957d;
        C58312g.C58313a aVar = this.f166958e;
        C58312g gVar = this.f166959f;
        ArrayList<C58307a> arrayList = this.f166960g;
        for (Number intValue : hashSet) {
            int intValue2 = intValue.intValue();
            if (!aVar.f166980i.contains(Integer.valueOf(intValue2))) {
                ((C58312g) C39818r.f106831a.mo62443b(gVar.getContext()).mo75002a(C58312g.class)).f166971i.mo83066d(intValue2, (C58307a) C110818d0.m150917O(arrayList, intValue2), 2);
            }
        }
        this.f166958e.f166980i.clear();
        this.f166958e.f166980i.addAll(this.f166957d);
        return C13598b0.f38549a;
    }
}
