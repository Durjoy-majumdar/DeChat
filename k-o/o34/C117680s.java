package o34;

import l34.C117453e;
import l34.C117458j;

/* renamed from: o34.s */
public final class C117680s<T> implements C117453e.C88377b<T, T> {

    /* renamed from: a */
    public final int f351990a;

    public C117680s(int i) {
        if (i >= 0) {
            this.f351990a = i;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i);
    }

    public Object call(Object obj) {
        C117458j jVar = (C117458j) obj;
        C117678r rVar = new C117678r(this, jVar);
        if (this.f351990a == 0) {
            jVar.mo122780a();
            rVar.mo182165d();
        }
        jVar.mo182166e(rVar);
        return rVar;
    }
}
