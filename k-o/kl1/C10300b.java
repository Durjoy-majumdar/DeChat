package kl1;

import ak1.C0073g0;
import ak1.C54108o;
import c30.C104289g;
import cj1.C0581o5;
import di3.C7335d;
import di3.C86312j;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Iterator;
import java.util.LinkedList;
import ok1.C62042e;
import rx3.C13604l;
import te3.C48770aw0;
import te3.C49765hx0;

/* renamed from: kl1.b */
public final class C10300b {

    /* renamed from: a */
    public static final C10300b f31392a = new C10300b();

    /* renamed from: b */
    public static final int f31393b = C32444a.f86184p2.mo60266n().intValue();

    static {
        C32444a aVar = C32444a.f86121a;
    }

    /* renamed from: a */
    public final LinkedList<C48770aw0> mo10607a(C0581o5 o5Var) {
        C87412m.m108594g(o5Var, "liveMsg");
        int i = f31393b;
        if (i != -1) {
            LinkedList<C48770aw0> linkedList = new LinkedList<>();
            if (i == -2) {
                C48770aw0 aw02 = new C48770aw0();
                aw02.f130789d = 8;
                aw02.f130793h = "隐身";
                linkedList.add(aw02);
                return linkedList;
            } else if (i == -3) {
                C48770aw0 aw03 = new C48770aw0();
                aw03.f130789d = 8;
                aw03.f130793h = "隐身";
                linkedList.add(aw03);
                C48770aw0 aw04 = new C48770aw0();
                aw04.f130791f = i;
                aw04.f130789d = 2;
                linkedList.add(aw04);
                return linkedList;
            } else {
                C48770aw0 aw05 = new C48770aw0();
                aw05.f130791f = i;
                aw05.f130789d = 2;
                linkedList.add(aw05);
                return linkedList;
            }
        } else {
            C49765hx0 i2 = o5Var.mo579i();
            LinkedList<C48770aw0> linkedList2 = i2 != null ? i2.f134930r : null;
            return linkedList2 == null ? new LinkedList<>() : linkedList2;
        }
    }

    /* renamed from: b */
    public final C13604l<Boolean, Integer> mo10608b(C0581o5 o5Var) {
        boolean z;
        T t;
        boolean z2;
        C87412m.m108594g(o5Var, "liveMsg");
        if (o5Var.getType() != 10005) {
            return new C13604l<>(Boolean.FALSE, -1);
        }
        LinkedList<C48770aw0> a = mo10607a(o5Var);
        Iterator<T> it = a.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C48770aw0) t).f130789d == 8) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (t == null) {
            z = false;
        }
        if (z) {
            return new C13604l<>(Boolean.FALSE, -1);
        }
        return new C13604l<>(Boolean.TRUE, Integer.valueOf(C62042e.f176370a.mo87066b0(a)));
    }

    /* renamed from: c */
    public final void mo10609c(int i, boolean z) {
        if (C62042e.f176370a.mo87027N0()) {
            C104289g gVar = new C104289g();
            gVar.mo145953n("type", i);
            gVar.mo145953n("notice_type", z ? 2 : 1);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.ANCHOR_BULLET_MSG, gVar.toString(), (String) null, 4, (Object) null);
        }
    }
}
