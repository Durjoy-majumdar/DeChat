package pl1;

import di3.C86312j;
import p196ln.C76705f;
import vd3.C78394f;
import vd3.C78407r;

/* renamed from: pl1.h */
public class C77108h implements C78407r.C78412e {

    /* renamed from: d */
    public final String[] f225218d = {"@findermsg", "@finder", "@findermsgstranger", "@findermsgalias"};

    /* renamed from: e */
    public C100807g f225219e;

    public C78407r.C78409b get(String str) {
        for (String endsWith : this.f225218d) {
            if (str.endsWith(endsWith)) {
                if (this.f225219e == null) {
                    C78407r.C78409b VT = ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT();
                    if (VT instanceof C78394f) {
                        this.f225219e = new C100807g(VT);
                    }
                }
                return this.f225219e;
            }
        }
        return null;
    }
}
