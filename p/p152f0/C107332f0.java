package p152f0;

import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.google.android.gms.common.internal.Constants;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
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
import p451b2.C104014i;
import p560i2.C108319b;
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
import p735w1.C111705z;
import p735w1.C37958a;
import p735w1.C37967m;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64186f0;

/* renamed from: f0.f0 */
public final class C107332f0 {

    /* renamed from: a */
    public static final C13604l<List<C37958a.C37961b<C37967m>>, List<C37958a.C37961b<C32228q<String, C108504h, Integer, C13598b0>>>> f321125a;

    /* renamed from: f0.f0$a */
    public static final class C107333a implements C109895y {

        /* renamed from: a */
        public static final C107333a f321126a = new C107333a();

        /* renamed from: f0.f0$a$a */
        public static final class C107334a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ List<C109854n0> f321127d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C107334a(List<? extends C109854n0> list) {
                super(1);
                this.f321127d = list;
            }

            public Object invoke(Object obj) {
                C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
                C87412m.m108594g(aVar, "$this$layout");
                List<C109854n0> list = this.f321127d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C109854n0.C109855a.m149306f(aVar, list.get(i), 0, 0, 0.0f, 4, (Object) null);
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
            C87412m.m108594g(list, "children");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C109893x) list.get(i)).mo161155K(j));
            }
            return C109827a0.C109828a.m149247b(a0Var, C108319b.m146697h(j), C108319b.m146696g(j), (Map) null, new C107334a(arrayList), 4, (Object) null);
        }

        /* renamed from: e */
        public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
            return C109895y.C109896a.m149388d(this, kVar, list, i);
        }
    }

    /* renamed from: f0.f0$b */
    public static final class C107335b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C37958a f321128d;

        /* renamed from: e */
        public final /* synthetic */ List<C37958a.C37961b<C32228q<String, C108504h, Integer, C13598b0>>> f321129e;

        /* renamed from: f */
        public final /* synthetic */ int f321130f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107335b(C37958a aVar, List<C37958a.C37961b<C32228q<String, C108504h, Integer, C13598b0>>> list, int i) {
            super(2);
            this.f321128d = aVar;
            this.f321129e = list;
            this.f321130f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107332f0.m145466a(this.f321128d, this.f321129e, (C108504h) obj, this.f321130f | 1);
            return C13598b0.f38549a;
        }
    }

    static {
        C64186f0 f0Var = C64186f0.f181907d;
        f321125a = new C13604l<>(f0Var, f0Var);
    }

    /* renamed from: a */
    public static final void m145466a(C37958a aVar, List<C37958a.C37961b<C32228q<String, C108504h, Integer, C13598b0>>> list, C108504h hVar, int i) {
        C37958a aVar2 = aVar;
        List<C37958a.C37961b<C32228q<String, C108504h, Integer, C13598b0>>> list2 = list;
        C87412m.m108594g(aVar2, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(list2, "inlineContents");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-110905764);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            C37958a.C37961b bVar = list2.get(i2);
            C32228q qVar2 = (C32228q) bVar.f100426a;
            int i3 = bVar.f100427b;
            int i4 = bVar.f100428c;
            C107333a aVar3 = C107333a.f321126a;
            z.mo51557H(-1323940314);
            int i5 = C65503j.f188489K0;
            C65503j.C65504a aVar4 = C65503j.C65504a.f188490d;
            C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar5 = C110269a.f329831D0;
            aVar5.getClass();
            C32224a<C110269a> aVar6 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a = C109863q.m149330a(aVar4);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar6);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar5.getClass();
                C108508o2.m147049a(z, aVar3, C110269a.C110270a.f329836e);
                aVar5.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar5.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar5.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-72427749);
                qVar2.invoke(aVar2.subSequence(i3, i4).f100413d, z, 0);
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                i2++;
            } else {
                C108501g.m147000a();
                throw null;
            }
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C107335b(aVar2, list2, i));
        }
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar3 = C24715p.f70494a;
    }

    /* renamed from: b */
    public static final C107347h1 m145467b(C107347h1 h1Var, C37958a aVar, C111705z zVar, C108322d dVar, C104014i.C104015a aVar2, boolean z, int i, int i2, List<C37958a.C37961b<C37967m>> list) {
        C107347h1 h1Var2 = h1Var;
        C37958a aVar3 = aVar;
        C111705z zVar2 = zVar;
        C108322d dVar2 = dVar;
        C104014i.C104015a aVar4 = aVar2;
        List<C37958a.C37961b<C37967m>> list2 = list;
        C87412m.m108594g(h1Var, "current");
        C87412m.m108594g(aVar, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(zVar, "style");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        C87412m.m108594g(aVar4, "fontFamilyResolver");
        C87412m.m108594g(list2, "placeholders");
        if (!C87412m.m108589b(h1Var2.f321168a, aVar) || !C87412m.m108589b(h1Var2.f321169b, zVar)) {
            boolean z2 = z;
        } else if (h1Var2.f321171d == z) {
            if (h1Var2.f321172e == i) {
                if (h1Var2.f321170c == i2 && C87412m.m108589b(h1Var2.f321173f, dVar) && C87412m.m108589b(h1Var2.f321175h, list2) && h1Var2.f321174g == aVar4) {
                    return h1Var2;
                }
                return new C107347h1(aVar, zVar, i2, z, i, dVar, aVar2, list, (C8480h) null);
            }
            int i3 = i2;
            return new C107347h1(aVar, zVar, i2, z, i, dVar, aVar2, list, (C8480h) null);
        }
        int i4 = i;
        int i35 = i2;
        return new C107347h1(aVar, zVar, i2, z, i, dVar, aVar2, list, (C8480h) null);
    }
}
