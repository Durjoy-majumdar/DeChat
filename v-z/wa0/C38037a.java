package wa0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p175j0.C108504h;
import p415q0.C110261c;
import p543h0.C107939e0;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: wa0.a */
public final class C38037a {

    /* renamed from: a */
    public static C32228q<List<C111791f>, C108504h, Integer, C13598b0> f100558a = C110261c.m149879c(-1618364986, false, C38038a.f100560d);

    /* renamed from: b */
    public static C32227p<C108504h, Integer, C13598b0> f100559b = C110261c.m149879c(-314337778, false, C38039b.f100561d);

    /* renamed from: wa0.a$a */
    public static final class C38038a extends C87413o implements C32228q<List<? extends C111791f>, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C38038a f100560d = new C38038a();

        public C38038a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C108504h hVar = (C108504h) obj2;
            ((Number) obj3).intValue();
            C87412m.m108594g((List) obj, "tabPositions");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wa0.a$b */
    public static final class C38039b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C38039b f100561d = new C38039b();

        public C38039b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C107939e0.f323209a.mo158354a((C65503j) null, 0.0f, 0, hVar, 4096, 7);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }
}
