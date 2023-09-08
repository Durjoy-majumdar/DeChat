package com.tencent.p014mm.plugin.appbrand;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.tencent.mm.plugin.appbrand.v3 */
public class C84806v3 implements C83243l3 {

    /* renamed from: a */
    public final ConcurrentSkipListSet<C83243l3> f247244a = new ConcurrentSkipListSet<>(new C84807a(this));

    /* renamed from: com.tencent.mm.plugin.appbrand.v3$a */
    public class C84807a implements Comparator<C83243l3> {
        public C84807a(C84806v3 v3Var) {
        }

        public int compare(Object obj, Object obj2) {
            C83243l3 l3Var = (C83243l3) obj;
            C83243l3 l3Var2 = (C83243l3) obj2;
            if (l3Var == l3Var2) {
                return 0;
            }
            return l3Var.hashCode() - l3Var2.hashCode();
        }
    }

    /* renamed from: a */
    public void mo114252a(C81820e3 e3Var) {
        Iterator it = new LinkedList(this.f247244a).iterator();
        while (it.hasNext()) {
            ((C83243l3) it.next()).mo114252a(e3Var);
        }
    }

    /* renamed from: b */
    public void mo114253b() {
        Iterator it = new LinkedList(this.f247244a).iterator();
        while (it.hasNext()) {
            ((C83243l3) it.next()).mo114253b();
        }
    }
}
