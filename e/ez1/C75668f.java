package ez1;

import di3.C86312j;
import p196ln.C76705f;
import vd3.C78394f;
import vd3.C78407r;

/* renamed from: ez1.f */
public class C75668f implements C78407r.C78412e {

    /* renamed from: d */
    public final String[] f222266d = {"@gamelife", "@gamelifesess"};

    /* renamed from: e */
    public C97771e f222267e;

    public C78407r.C78409b get(String str) {
        for (String endsWith : this.f222266d) {
            if (str.endsWith(endsWith)) {
                if (this.f222267e == null) {
                    C78407r.C78409b VT = ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT();
                    if (VT instanceof C78394f) {
                        this.f222267e = new C97771e(VT);
                    }
                }
                return this.f222267e;
            }
        }
        return null;
    }
}
