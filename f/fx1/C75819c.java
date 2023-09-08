package fx1;

import di3.C86312j;
import gx1.C98272d;
import p196ln.C76705f;
import vd3.C78394f;
import vd3.C78407r;

/* renamed from: fx1.c */
public class C75819c implements C78407r.C78412e {

    /* renamed from: d */
    public C98272d f222432d;

    public C78407r.C78409b get(String str) {
        if (!str.endsWith("@gamelifechatroom")) {
            return null;
        }
        if (this.f222432d == null) {
            C78407r.C78409b VT = ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT();
            if (VT instanceof C78394f) {
                this.f222432d = new C98272d(((C78394f) VT).f229712d);
            }
        }
        return this.f222432d;
    }
}
