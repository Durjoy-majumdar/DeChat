package p246u1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1166z0.C112541g;
import p631o1.C109861p;
import p658q1.C110301j;
import p658q1.C110311s;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64186f0;

/* renamed from: u1.s */
public final class C111087s {

    /* renamed from: a */
    public final C111078m f332636a;

    /* renamed from: b */
    public final boolean f332637b;

    /* renamed from: c */
    public boolean f332638c;

    /* renamed from: d */
    public C111087s f332639d;

    /* renamed from: e */
    public final C111075k f332640e;

    /* renamed from: f */
    public final int f332641f;

    /* renamed from: g */
    public final C110301j f332642g;

    /* renamed from: u1.s$a */
    public static final class C111088a extends C87413o implements C32226l<C110301j, Boolean> {

        /* renamed from: d */
        public static final C111088a f332643d = new C111088a();

        public C111088a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C111075k c;
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            C111078m d = C111090t.m151491d(jVar);
            boolean z = true;
            if (d == null || (c = d.mo162827c()) == null || !c.f332625e) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: u1.s$b */
    public static final class C111089b extends C87413o implements C32226l<C110301j, Boolean> {

        /* renamed from: d */
        public static final C111089b f332644d = new C111089b();

        public C111089b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C111090t.m151491d(jVar) != null);
        }
    }

    public C111087s(C111078m mVar, boolean z) {
        C87412m.m108594g(mVar, "outerSemanticsEntity");
        this.f332636a = mVar;
        this.f332637b = z;
        this.f332640e = mVar.mo162827c();
        this.f332641f = ((C111079n) mVar.f329962e).getId();
        this.f332642g = mVar.f329961d.f329972h;
    }

    /* renamed from: b */
    public static List m151477b(C111087s sVar, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        sVar.getClass();
        List<C111087s> k = sVar.mo162842k(z, false);
        int size = k.size();
        for (int i2 = 0; i2 < size; i2++) {
            C111087s sVar2 = k.get(i2);
            if (sVar2.mo162840i()) {
                list.add(sVar2);
            } else if (!sVar2.f332640e.f332626f) {
                m151477b(sVar2, list, false, 2, (Object) null);
            }
        }
        return list;
    }

    /* renamed from: a */
    public final C111087s mo162833a(C111072h hVar, C32226l<? super C111064a0, C13598b0> lVar) {
        int i;
        int i2;
        C110311s sVar = new C110301j(true).f329895I;
        if (hVar != null) {
            i = this.f332641f;
            i2 = 1000000000;
        } else {
            i = this.f332641f;
            i2 = 2000000000;
        }
        C111087s sVar2 = new C111087s(new C111078m(sVar, new C111080o(i + i2, false, false, lVar)), false);
        sVar2.f332638c = true;
        sVar2.f332639d = this;
        return sVar2;
    }

    /* renamed from: c */
    public final C110311s mo162834c() {
        if (!this.f332640e.f332625e) {
            return this.f332636a.f329961d;
        }
        C111078m c = C111090t.m151490c(this.f332642g);
        if (c == null) {
            c = this.f332636a;
        }
        return c.f329961d;
    }

    /* renamed from: d */
    public final C112541g mo162835d() {
        return !this.f332642g.mo161701A() ? C112541g.f336960e : C109861p.m149326b(mo162834c());
    }

    /* renamed from: e */
    public final List<C111087s> mo162836e(boolean z, boolean z2, boolean z3) {
        return (z2 || !this.f332640e.f332626f) ? mo162840i() ? m151477b(this, (List) null, z, 1, (Object) null) : mo162842k(z, z3) : C64186f0.f181907d;
    }

    /* renamed from: f */
    public final C111075k mo162837f() {
        if (!mo162840i()) {
            return this.f332640e;
        }
        C111075k kVar = this.f332640e;
        kVar.getClass();
        C111075k kVar2 = new C111075k();
        kVar2.f332625e = kVar.f332625e;
        kVar2.f332626f = kVar.f332626f;
        kVar2.f332624d.putAll(kVar.f332624d);
        mo162841j(kVar2);
        return kVar2;
    }

    /* renamed from: g */
    public final C111087s mo162838g() {
        C111087s sVar = this.f332639d;
        if (sVar != null) {
            return sVar;
        }
        C110301j a = this.f332637b ? C111090t.m151488a(this.f332642g, C111088a.f332643d) : null;
        if (a == null) {
            a = C111090t.m151488a(this.f332642g, C111089b.f332644d);
        }
        C111078m d = a != null ? C111090t.m151491d(a) : null;
        if (d == null) {
            return null;
        }
        return new C111087s(d, this.f332637b);
    }

    /* renamed from: h */
    public final List<C111087s> mo162839h() {
        return mo162836e(false, false, true);
    }

    /* renamed from: i */
    public final boolean mo162840i() {
        return this.f332637b && this.f332640e.f332625e;
    }

    /* renamed from: j */
    public final void mo162841j(C111075k kVar) {
        if (!this.f332640e.f332626f) {
            List<C111087s> k = mo162842k(false, false);
            int size = k.size();
            for (int i = 0; i < size; i++) {
                C111087s sVar = k.get(i);
                if (!sVar.mo162840i()) {
                    C111075k kVar2 = sVar.f332640e;
                    kVar.getClass();
                    C87412m.m108594g(kVar2, "child");
                    for (Map.Entry entry : ((LinkedHashMap) kVar2.f332624d).entrySet()) {
                        C111096z zVar = (C111096z) entry.getKey();
                        Object value = entry.getValue();
                        T invoke = zVar.f332685b.invoke(((LinkedHashMap) kVar.f332624d).get(zVar), value);
                        if (invoke != null) {
                            kVar.f332624d.put(zVar, invoke);
                        }
                    }
                    sVar.mo162841j(kVar);
                }
            }
        }
    }

    /* renamed from: k */
    public final List<C111087s> mo162842k(boolean z, boolean z2) {
        ArrayList arrayList;
        if (this.f332638c) {
            return C64186f0.f181907d;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            C110301j jVar = this.f332642g;
            arrayList = new ArrayList();
            C111066b0.m151459b(jVar, arrayList);
        } else {
            C110301j jVar2 = this.f332642g;
            arrayList = new ArrayList();
            C111090t.m151489b(jVar2, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new C111087s((C111078m) arrayList.get(i), this.f332637b));
        }
        if (z2) {
            C111072h hVar = (C111072h) C111076l.m151465a(this.f332640e, C111092v.f332661p);
            if (hVar != null && this.f332640e.f332625e && (!arrayList2.isEmpty())) {
                arrayList2.add(mo162833a(hVar, new C111085q(hVar)));
            }
            C111075k kVar = this.f332640e;
            C111096z zVar = C111092v.f332646a;
            if (kVar.mo162823i(zVar) && (!arrayList2.isEmpty())) {
                C111075k kVar2 = this.f332640e;
                if (kVar2.f332625e) {
                    List list = (List) C111076l.m151465a(kVar2, zVar);
                    String str = list != null ? (String) C110818d0.m150916N(list) : null;
                    if (str != null) {
                        arrayList2.add(0, mo162833a((C111072h) null, new C111086r(str)));
                    }
                }
            }
        }
        return arrayList2;
    }
}
