package p672r1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p1108f3.C107453d;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p246u1.C111065b;
import p246u1.C111067c;
import p246u1.C111075k;
import p246u1.C111076l;
import p246u1.C111087s;
import p246u1.C111092v;
import p246u1.C111096z;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;

/* renamed from: r1.a */
public final class C110481a {

    /* renamed from: r1.a$a */
    public static final class C110482a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C110482a f330378d = new C110482a();

        public C110482a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static final boolean m150380a(List<C111087s> list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = C64186f0.f181907d;
        } else {
            list2 = new ArrayList();
            C111087s sVar = list.get(0);
            int e = C64197v.m75536e(list);
            int i = 0;
            while (i < e) {
                i++;
                C111087s sVar2 = list.get(i);
                C111087s sVar3 = sVar2;
                C111087s sVar4 = sVar;
                list2.add(new C112539e(C112540f.m153745a(Math.abs(C112539e.m153738c(sVar4.mo162835d().mo164260a()) - C112539e.m153738c(sVar3.mo162835d().mo164260a())), Math.abs(C112539e.m153739d(sVar4.mo162835d().mo164260a()) - C112539e.m153739d(sVar3.mo162835d().mo164260a())))));
                sVar = sVar2;
            }
        }
        if (list2.size() == 1) {
            j = ((C112539e) C110818d0.m150914L(list2)).f336959a;
        } else if (!list2.isEmpty()) {
            Object L = C110818d0.m150914L(list2);
            int e2 = C64197v.m75536e(list2);
            if (1 <= e2) {
                int i2 = 1;
                while (true) {
                    L = new C112539e(C112539e.m153742g(((C112539e) L).f336959a, ((C112539e) list2.get(i2)).f336959a));
                    if (i2 == e2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((C112539e) L).f336959a;
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        return C112539e.m153739d(j) < C112539e.m153738c(j);
    }

    /* renamed from: b */
    public static final boolean m150381b(C111087s sVar) {
        C87412m.m108594g(sVar, "<this>");
        C111075k f = sVar.mo162837f();
        C111096z<List<String>> zVar = C111092v.f332646a;
        return (C111076l.m151465a(f, C111092v.f332651f) == null && C111076l.m151465a(sVar.mo162837f(), C111092v.f332650e) == null) ? false : true;
    }

    /* renamed from: c */
    public static final void m150382c(C111087s sVar, C107453d dVar) {
        C111087s sVar2 = sVar;
        C107453d dVar2 = dVar;
        C87412m.m108594g(sVar2, "node");
        C87412m.m108594g(dVar2, "info");
        if (((C111067c) C111076l.m151465a(sVar.mo162837f(), C111092v.f332652g)) != null) {
            C111075k f = sVar.mo162837f();
            C111096z<Boolean> zVar = C111092v.f332667v;
            C36243b bVar = C36243b.f96524d;
            f.getClass();
            C87412m.m108594g(zVar, "key");
            C87412m.m108594g(bVar, "defaultValue");
            Object obj = ((LinkedHashMap) f.f332624d).get(zVar);
            if (obj == null) {
                obj = bVar.invoke();
            }
            dVar2.mo157853m(C107453d.C107455b.m145563a(0, 0, 0, 0, false, ((Boolean) obj).booleanValue()));
        }
        C111087s g = sVar.mo162838g();
        if (g != null && C111076l.m151465a(g.mo162837f(), C111092v.f332650e) != null) {
            C111065b bVar2 = (C111065b) C111076l.m151465a(g.mo162837f(), C111092v.f332651f);
            if (bVar2 != null) {
                if (bVar2.f332592a < 0 || bVar2.f332593b < 0) {
                    return;
                }
            }
            if (sVar.mo162837f().mo162823i(C111092v.f332667v)) {
                ArrayList arrayList = new ArrayList();
                List<C111087s> h = g.mo162839h();
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    C111087s sVar3 = h.get(i);
                    if (sVar3.mo162837f().mo162823i(C111092v.f332667v)) {
                        arrayList.add(sVar3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a = m150380a(arrayList);
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C111087s sVar4 = (C111087s) arrayList.get(i2);
                        if (sVar4.f332641f == sVar2.f332641f) {
                            int i3 = a ? 0 : i2;
                            int i4 = a ? i2 : 0;
                            C111075k f2 = sVar4.mo162837f();
                            C111096z<Boolean> zVar2 = C111092v.f332667v;
                            C110482a aVar = C110482a.f330378d;
                            f2.getClass();
                            C87412m.m108594g(zVar2, "key");
                            C87412m.m108594g(aVar, "defaultValue");
                            Object obj2 = ((LinkedHashMap) f2.f332624d).get(zVar2);
                            if (obj2 == null) {
                                obj2 = aVar.invoke();
                            }
                            dVar2.mo157853m(C107453d.C107455b.m145563a(i3, 1, i4, 1, false, ((Boolean) obj2).booleanValue()));
                        }
                    }
                }
            }
        }
    }
}
