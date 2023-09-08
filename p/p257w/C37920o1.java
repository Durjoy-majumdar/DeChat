package p257w;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import my3.C61594j;
import my3.C61595o;
import sx3.C36904l0;
import sx3.C36907w;

/* renamed from: w.o1 */
public final class C37920o1 implements C37923q {

    /* renamed from: a */
    public final List<C37898e0> f100336a;

    public C37920o1(C37919o oVar, float f, float f2) {
        C61594j i = C61595o.m72301i(0, oVar.mo61402b());
        ArrayList arrayList = new ArrayList(C36907w.m41090l(i, 10));
        Iterator it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(new C37898e0(f, f2, oVar.mo61401a(((C36904l0) it).mo59695a())));
        }
        this.f100336a = arrayList;
    }

    public C37894c0 get(int i) {
        return (C37898e0) ((ArrayList) this.f100336a).get(i);
    }
}
