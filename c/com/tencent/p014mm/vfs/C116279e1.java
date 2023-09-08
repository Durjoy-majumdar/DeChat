package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116274d0;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import qp3.C118196a;
import qp3.C118201e;
import qp3.C118204f;
import sx3.C110821n;

/* renamed from: com.tencent.mm.vfs.e1 */
public final class C116279e1 implements C118196a.C89789a<C86001b0, C97318g1> {

    /* renamed from: a */
    public final int f348944a;

    /* renamed from: b */
    public final String f348945b;

    /* renamed from: c */
    public final C32227p<C86001b0, Integer, Integer> f348946c;

    /* renamed from: d */
    public final C116273c1 f348947d;

    /* renamed from: e */
    public final C97318g1[] f348948e;

    /* renamed from: f */
    public final List<C97318g1> f348949f;

    public C116279e1(int i, String str, C32227p<? super C86001b0, ? super Integer, Integer> pVar, C116273c1 c1Var) {
        C87412m.m108594g(str, "basePath");
        C87412m.m108594g(c1Var, "context");
        this.f348944a = i;
        this.f348945b = str;
        this.f348946c = pVar;
        this.f348947d = c1Var;
        C97318g1[] g1VarArr = {C116274d0.f348934n};
        this.f348948e = g1VarArr;
        this.f348949f = C110821n.m150958e(g1VarArr);
    }

    /* renamed from: a */
    public Iterable mo119949a(Object obj) {
        C118201e eVar;
        Iterable<C97318g1> iterable;
        C86001b0 b0Var = (C86001b0) obj;
        if (b0Var == null) {
            return null;
        }
        if (!b0Var.f250476f) {
            return mo177787b(this.f348944a, (String) null, b0Var);
        }
        String str = this.f348945b + XVFSFile.SEPARATOR_CHAR + b0Var.f250472b;
        String str2 = this.f348947d.f348915b.get(str);
        if (str2 != null) {
            C116302i1 remove = this.f348947d.f348914a.remove(str2);
            if (remove == null) {
                return mo177787b(this.f348944a, (String) null, b0Var);
            }
            int i = this.f348944a | remove.f349015a;
            C116300h1 h1Var = this.f348947d.f348920g;
            if (C87412m.m108589b(h1Var != null ? Boolean.valueOf(h1Var.mo137953c(i, remove.f349016b, b0Var)) : null, Boolean.FALSE)) {
                return null;
            }
            C116300h1 h1Var2 = this.f348947d.f348920g;
            C116277d1 d1Var = h1Var2 != null ? new C116277d1(h1Var2, i, remove) : null;
            Iterable<C86001b0> p = C116299g2.m163860p(remove.f349017c, "", this.f348947d.f348919f, d1Var != null ? new C116274d0.C116276h(d1Var) : null);
            if (p == null) {
                return mo177787b(i, (String) null, b0Var);
            }
            String str3 = remove.f349016b;
            C118204f fVar = new C118204f(p, new C116290f1(i, str3, this.f348947d.f348918e.get(str3)));
            C86001b0 q = remove.f349017c.mo119945q("");
            if (q == null || (iterable = mo177787b(1073741824 | i, remove.f349016b, q)) == null) {
                iterable = mo177787b(i, (String) null, b0Var);
            }
            eVar = this.f348947d.f348919f ? new C118201e(fVar, iterable) : new C118201e(iterable, fVar);
        } else {
            Integer num = this.f348947d.f348916c.get(str);
            int intValue = num != null ? num.intValue() : 0;
            if ((Integer.MIN_VALUE & intValue) != 0) {
                return null;
            }
            int i2 = (intValue & 268435455) | this.f348944a;
            Iterable<C97318g1> b = mo177787b(i2, (String) null, b0Var);
            C116300h1 h1Var3 = this.f348947d.f348920g;
            if (C87412m.m108589b(h1Var3 != null ? Boolean.valueOf(h1Var3.mo137953c(i2, (String) null, b0Var)) : null, Boolean.FALSE)) {
                return null;
            }
            Iterable<C86001b0> d = b0Var.mo119957d();
            if (d == null) {
                return b;
            }
            C118196a aVar = new C118196a(d, new C116279e1(i2, str, this.f348947d.f348917d.get(str), this.f348947d));
            eVar = this.f348947d.f348919f ? new C118201e(aVar, b) : new C118201e(b, aVar);
        }
        return eVar;
    }

    /* renamed from: b */
    public final Iterable<C97318g1> mo177787b(int i, String str, C86001b0 b0Var) {
        C32227p<C86001b0, Integer, Integer> pVar = this.f348946c;
        if (pVar != null) {
            i = pVar.invoke(b0Var, Integer.valueOf(i)).intValue();
        }
        this.f348948e[0] = new C97318g1(i, str, b0Var);
        return this.f348949f;
    }
}
