package wy2;

import di3.C86312j;
import p196ln.C76705f;
import vd3.C78394f;
import vd3.C78407r;

/* renamed from: wy2.f */
public class C78738f implements C78407r.C78412e {

    /* renamed from: d */
    public final String[] f230440d = {"@statussquaremsg"};

    /* renamed from: e */
    public C102523e f230441e;

    public C78407r.C78409b get(String str) {
        for (String endsWith : this.f230440d) {
            if (str.endsWith(endsWith)) {
                if (this.f230441e == null) {
                    C78407r.C78409b VT = ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT();
                    if (VT instanceof C78394f) {
                        this.f230441e = new C102523e(VT);
                    }
                }
                return this.f230441e;
            }
        }
        return null;
    }
}
