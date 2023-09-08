package yg1;

import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import te3.C48742ao0;
import te3.C52013xs0;
import yg1.C39014a;
import zg1.C16169d;

/* renamed from: yg1.g */
public abstract class C16006g extends C66639f {

    /* renamed from: a */
    public final C45795b f43066a;

    /* renamed from: b */
    public final C13601g f43067b = C36568h.m40985a(new C16007a(this));

    /* renamed from: yg1.g$a */
    public static final class C16007a extends C87413o implements C32224a<int[]> {

        /* renamed from: d */
        public final /* synthetic */ C16006g f43068d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16007a(C16006g gVar) {
            super(0);
            this.f43068d = gVar;
        }

        public Object invoke() {
            return this.f43068d.mo14635g();
        }
    }

    public C16006g(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f43066a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        ArrayList arrayList;
        LinkedList<C52013xs0> linkedList;
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        ArrayList arrayList2 = null;
        if (ao02 == null || (linkedList = ao02.f130689t) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (T next : linkedList) {
                C52013xs0 xs02 = (C52013xs0) next;
                if (C110823p.m151008x((int[]) ((C36570n) this.f43067b).getValue(), xs02.f144903e) && mo14634f(xs02)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList == null) {
            return false;
        }
        if ((arrayList.isEmpty() ^ true) || mo14633e()) {
            arrayList2 = arrayList;
        }
        if (arrayList2 == null) {
            return false;
        }
        mo14632d(new LinkedList(arrayList2));
        return true;
    }

    /* renamed from: d */
    public abstract void mo14632d(LinkedList<C52013xs0> linkedList);

    /* renamed from: e */
    public boolean mo14633e() {
        return this instanceof C16169d;
    }

    /* renamed from: f */
    public boolean mo14634f(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "appMsg");
        return true;
    }

    /* renamed from: g */
    public abstract int[] mo14635g();
}
