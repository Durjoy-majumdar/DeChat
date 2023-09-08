package x82;

import java.util.HashSet;
import nj3.C11182m0;
import nj3.C76874e0;
import x82.C112095g;

/* renamed from: x82.s */
public final class C112122s implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C112114r f335692d;

    public C112122s(C112114r rVar) {
        this.f335692d = rVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        HashSet<C112095g.C38462a> hashSet;
        C112095g gVar = this.f335692d.f335674c;
        if (gVar != null && (hashSet = gVar.f335603b) != null) {
            for (C112095g.C38462a aVar : hashSet) {
                e0Var.mo107140d(aVar.f101450b, -1, aVar.f101449a);
            }
        }
    }
}
