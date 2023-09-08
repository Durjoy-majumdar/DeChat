package p155g0;

import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p415q0.C35747b;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109863q;
import p631o1.C109893x;
import p631o1.C109895y;
import p631o1.C109899z;
import p658q1.C110269a;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: g0.x */
public final class C107651x {

    /* renamed from: g0.x$a */
    public static final class C107652a implements C109895y {

        /* renamed from: a */
        public static final C107652a f322049a = new C107652a();

        /* renamed from: g0.x$a$a */
        public static final class C107653a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ List<C109854n0> f322050d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107653a(List<? extends C109854n0> list) {
                super(1);
                this.f322050d = list;
            }

            public Object invoke(Object obj) {
                C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
                C87412m.m108594g(aVar, "$this$layout");
                List<C109854n0> list = this.f322050d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C109854n0.C109855a.m149304c(aVar, list.get(i), 0, 0, 0.0f, 4, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public int mo142884a(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149387c(this, kVar, list, i);
        }

        /* renamed from: b */
        public int mo142885b(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149386b(this, kVar, list, i);
        }

        /* renamed from: c */
        public int mo142886c(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149385a(this, kVar, list, i);
        }

        /* renamed from: d */
        public final C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
            C87412m.m108594g(a0Var, "$this$Layout");
            C87412m.m108594g(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            Integer num = 0;
            for (int i = 0; i < size; i++) {
                arrayList.add(((C109893x) list.get(i)).mo161155K(j));
            }
            int size2 = arrayList.size();
            Integer num2 = num;
            for (int i2 = 0; i2 < size2; i2++) {
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((C109854n0) arrayList.get(i2)).f328779d));
            }
            int intValue = num2.intValue();
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                num = Integer.valueOf(Math.max(num.intValue(), ((C109854n0) arrayList.get(i3)).f328780e));
            }
            return C109827a0.C109828a.m149247b(a0Var, intValue, num.intValue(), (Map) null, new C107653a(arrayList), 4, (Object) null);
        }

        /* renamed from: e */
        public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149388d(this, kVar, list, i);
        }
    }

    /* renamed from: g0.x$b */
    public static final class C107654b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f322051d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f322052e;

        /* renamed from: f */
        public final /* synthetic */ int f322053f;

        /* renamed from: g */
        public final /* synthetic */ int f322054g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107654b(C65503j jVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i, int i2) {
            super(2);
            this.f322051d = jVar;
            this.f322052e = pVar;
            this.f322053f = i;
            this.f322054g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107651x.m145826a(this.f322051d, this.f322052e, (C108504h) obj, this.f322053f | 1, this.f322054g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m145826a(C65503j jVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i, int i2) {
        int i3;
        C87412m.m108594g(pVar, "content");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-2105228848);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (z.mo51619x(jVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= z.mo51619x(pVar) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !z.mo51575a()) {
            if (i4 != 0) {
                int i5 = C65503j.f188489K0;
                jVar = C65503j.C65504a.f188490d;
            }
            C107652a aVar = C107652a.f322049a;
            z.mo51557H(-1323940314);
            C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar2 = C110269a.f329831D0;
            aVar2.getClass();
            C32224a<C110269a> aVar3 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(jVar);
            int i6 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar3);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar2.getClass();
                C108508o2.m147049a(z, aVar, C110269a.C110270a.f329836e);
                aVar2.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar2.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar2.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a).invoke(new C33489x1(z), z, Integer.valueOf((i6 >> 3) & 112));
                z.mo51557H(2058660585);
                pVar.invoke(z, Integer.valueOf((i6 >> 9) & 14));
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107654b(jVar, pVar, i, i2));
        }
    }
}
