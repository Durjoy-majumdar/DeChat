package yg1;

import ah1.C54032c;
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
import te3.C64674r41;
import yg1.C39014a;

/* renamed from: yg1.h */
public abstract class C66640h extends C66639f {

    /* renamed from: a */
    public final C45795b f191616a;

    /* renamed from: b */
    public final C13601g f191617b = C36568h.m40985a(new C66641a(this));

    /* renamed from: yg1.h$a */
    public static final class C66641a extends C87413o implements C32224a<int[]> {

        /* renamed from: d */
        public final /* synthetic */ C66640h f191618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66641a(C66640h hVar) {
            super(0);
            this.f191618d = hVar;
        }

        public Object invoke() {
            return this.f191618d.mo74694f();
        }
    }

    public C66640h(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f191616a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        ArrayList arrayList;
        LinkedList<C64674r41> linkedList;
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        ArrayList arrayList2 = null;
        if (ao02 == null || (linkedList = ao02.f130677e) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (T next : linkedList) {
                C64674r41 r412 = (C64674r41) next;
                if (C110823p.m151008x((int[]) ((C36570n) this.f191617b).getValue(), r412.f185127g) && mo74695e(r412)) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList == null) {
            return false;
        }
        if ((arrayList.isEmpty() ^ true) || (this instanceof C54032c)) {
            arrayList2 = arrayList;
        }
        if (arrayList2 == null) {
            return false;
        }
        mo74693d(new LinkedList(arrayList2));
        return true;
    }

    /* renamed from: d */
    public abstract void mo74693d(LinkedList<C64674r41> linkedList);

    /* renamed from: e */
    public boolean mo74695e(C64674r41 r412) {
        C87412m.m108594g(r412, "appMsg");
        return true;
    }

    /* renamed from: f */
    public abstract int[] mo74694f();
}
