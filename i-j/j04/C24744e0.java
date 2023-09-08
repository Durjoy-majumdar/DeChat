package j04;

import gy3.C87412m;
import qz3.C26044j;
import qz3.C26093x;
import wy3.C26436b;
import wy3.C26491r;
import wy3.C26505s;

/* renamed from: j04.e0 */
public final class C24744e0 {

    /* renamed from: j04.e0$a */
    public /* synthetic */ class C24745a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70593a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f70594b;

        static {
            int[] iArr = new int[C26044j.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f70593a = iArr;
            int[] iArr2 = new int[C26436b.C26437a.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
            int[] iArr3 = new int[C26093x.values().length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            iArr3[4] = 3;
            iArr3[2] = 4;
            iArr3[3] = 5;
            iArr3[5] = 6;
            f70594b = iArr3;
        }
    }

    /* renamed from: a */
    public static final C26505s m31132a(C24740d0 d0Var, C26093x xVar) {
        C87412m.m108594g(d0Var, "<this>");
        switch (xVar == null ? -1 : C24745a.f70594b[xVar.ordinal()]) {
            case 1:
                C26505s sVar = C26491r.f73781d;
                C87412m.m108593f(sVar, "INTERNAL");
                return sVar;
            case 2:
                C26505s sVar2 = C26491r.f73778a;
                C87412m.m108593f(sVar2, "PRIVATE");
                return sVar2;
            case 3:
                C26505s sVar3 = C26491r.f73779b;
                C87412m.m108593f(sVar3, "PRIVATE_TO_THIS");
                return sVar3;
            case 4:
                C26505s sVar4 = C26491r.f73780c;
                C87412m.m108593f(sVar4, "PROTECTED");
                return sVar4;
            case 5:
                C26505s sVar5 = C26491r.f73782e;
                C87412m.m108593f(sVar5, "PUBLIC");
                return sVar5;
            case 6:
                C26505s sVar6 = C26491r.f73783f;
                C87412m.m108593f(sVar6, "LOCAL");
                return sVar6;
            default:
                C26505s sVar7 = C26491r.f73778a;
                C87412m.m108593f(sVar7, "PRIVATE");
                return sVar7;
        }
    }

    /* renamed from: b */
    public static final C26436b.C26437a m31133b(C24740d0 d0Var, C26044j jVar) {
        C26436b.C26437a aVar = C26436b.C26437a.DECLARATION;
        C87412m.m108594g(d0Var, "<this>");
        int i = jVar == null ? -1 : C24745a.f70593a[jVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? aVar : C26436b.C26437a.SYNTHESIZED : C26436b.C26437a.DELEGATION : C26436b.C26437a.FAKE_OVERRIDE : aVar;
    }
}
