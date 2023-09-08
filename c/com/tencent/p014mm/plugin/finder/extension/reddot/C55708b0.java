package com.tencent.p014mm.plugin.finder.extension.reddot;

import dp1.C58413v0;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.b0 */
public final class C55708b0 {

    /* renamed from: a */
    public static final C55708b0 f158567a = new C55708b0();

    /* renamed from: b */
    public static void m63389b(C55708b0 b0Var, C51978xi1 xi12, boolean z, int i, Object obj) {
        LinkedList<C64586nn1> linkedList;
        LinkedList<C64586nn1> linkedList2;
        LinkedList<C64586nn1> linkedList3;
        if ((i & 2) != 0) {
            z = true;
        }
        b0Var.getClass();
        T t = null;
        if (!(xi12 == null || (linkedList3 = xi12.f144672g) == null)) {
            Iterator<T> it = linkedList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C87412m.m108589b(((C64586nn1) next).f184507i, "FinderEntrance")) {
                    t = next;
                    break;
                }
            }
            t = (C64586nn1) t;
        }
        if (t != null) {
            C58413v0 v0Var = C58413v0.f167346a;
            C58413v0 v0Var2 = v0Var;
            T t2 = t;
            C58413v0.m67784m(v0Var2, xi12, t2, 14, (String) null, 0, 24, (Object) null);
            C58784w3 w3Var = C58784w3.f168295a;
            C58739j4 j4Var = C58739j4.f168176a;
            C55718s0 s0Var = new C55718s0();
            s0Var.mo77305l2(xi12, 0);
            C58413v0.m67782j(v0Var2, s0Var, t2, 5, 2, (String) null, (String) null, 48, (Object) null);
            if (C87412m.m108589b("Discovery", t.f184508j)) {
                C55718s0 s0Var2 = new C55718s0();
                s0Var2.mo77305l2(xi12, 0);
                v0Var.mo83273n(5, 1, s0Var2, t, "");
            }
        }
        if (!(xi12 == null || (linkedList2 = xi12.f144672g) == null)) {
            C61926c.m72675T(linkedList2, C2494z.f13013d);
        }
        if (z && xi12 != null && (linkedList = xi12.f144672g) != null) {
            C61926c.m72675T(linkedList, C2459a0.f12913d);
        }
    }

    /* renamed from: a */
    public final boolean mo77293a(C51978xi1 xi12, String str) {
        LinkedList<C64586nn1> linkedList;
        C87412m.m108594g(str, "path");
        T t = null;
        if (!(xi12 == null || (linkedList = xi12.f144672g) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C87412m.m108589b(((C64586nn1) next).f184507i, str)) {
                    t = next;
                    break;
                }
            }
            t = (C64586nn1) t;
        }
        return t != null;
    }
}
