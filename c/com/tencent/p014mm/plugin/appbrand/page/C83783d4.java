package com.tencent.p014mm.plugin.appbrand.page;

import android.util.SparseIntArray;
import java.util.Iterator;
import p225rc.C89915f;
import p225rc.C89925n;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d4 */
public class C83783d4 extends C83787e {

    /* renamed from: f */
    public final SparseIntArray f244619f = new SparseIntArray();

    public C83783d4(C83866o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: j */
    public void mo116237j(C83853m4 m4Var) {
        if (isEmpty()) {
            this.f244619f.put(m4Var.f244833c, 1);
        }
        super.mo116237j(m4Var);
    }

    /* renamed from: k */
    public boolean mo116238k(String str) {
        String a = C89925n.m112488a(str);
        Iterator<C83853m4> it = iterator();
        C83853m4 m4Var = null;
        while (true) {
            boolean z = true;
            if (!((C89915f) it).hasNext()) {
                break;
            }
            e$$b e__b = (e$$b) it;
            C83853m4 m4Var2 = (C83853m4) e__b.next();
            if (this.f244619f.get(m4Var2.f244833c, 0) != 1) {
                z = false;
            }
            if (C90599h.m113509b(a, m4Var2.f244832b) && z) {
                e__b.remove();
                m4Var = m4Var2;
            } else if (!z) {
                e__b.remove();
            }
        }
        if (m4Var == null) {
            return false;
        }
        this.f244626e.addLast(m4Var);
        return true;
    }

    /* renamed from: l */
    public boolean mo116239l(String str, int i, long j) {
        Iterator<C83853m4> it = iterator();
        while (((C89915f) it).hasNext()) {
            e$$b e__b = (e$$b) it;
            if (this.f244619f.get(((C83853m4) e__b.next()).f244833c, 0) != 1) {
                e__b.remove();
            }
        }
        C83853m4 m4Var = new C83853m4(C89925n.m112488a(str), i, j);
        mo116237j(m4Var);
        this.f244619f.put(m4Var.f244833c, 1);
        return true;
    }

    public int size() {
        Iterator<C83853m4> it = this.f244626e.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f244619f.get(it.next().f244833c, 0) != 1) {
                i++;
            }
        }
        return this.f244619f.size() > 0 ? i + 1 : i;
    }
}
