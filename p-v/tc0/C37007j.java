package tc0;

import g62.C75880o;
import java.util.LinkedList;
import java.util.List;
import te3.C64753ul2;
import te3.C64778vl2;

@Deprecated
/* renamed from: tc0.j */
public class C37007j extends C75880o {

    /* renamed from: k */
    public C64778vl2 f98120k;

    public C37007j(List<C37008a> list) {
        super(36);
        LinkedList<C64753ul2> linkedList = new LinkedList<>();
        for (C37008a aVar : list) {
            linkedList.add(aVar.f98121a);
        }
        C64778vl2 vl22 = new C64778vl2();
        this.f98120k = vl22;
        vl22.f185956d = list.size();
        C64778vl2 vl23 = this.f98120k;
        vl23.f185957e = linkedList;
        this.f222536j = vl23;
    }

    /* renamed from: tc0.j$a */
    public static class C37008a {

        /* renamed from: a */
        public C64753ul2 f98121a;

        public C37008a() {
            C64753ul2 ul22 = new C64753ul2();
            this.f98121a = ul22;
            ul22.f185759d = 0;
            ul22.f185760e = "";
        }

        public C37008a(int i, String str) {
            C64753ul2 ul22 = new C64753ul2();
            this.f98121a = ul22;
            ul22.f185759d = i;
            ul22.f185760e = str;
        }
    }
}
