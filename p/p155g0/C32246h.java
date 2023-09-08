package p155g0;

import gy3.C8480h;
import gy3.C87412m;
import p191l2.C34165o;
import p560i2.C33177j;
import p560i2.C33179k;
import p560i2.C33180l;
import p560i2.C33183o;
import rx3.C13603j;

/* renamed from: g0.h */
public final class C32246h implements C34165o {

    /* renamed from: a */
    public final C32247i f85664a;

    /* renamed from: b */
    public final long f85665b;

    public C32246h(C32247i iVar, long j, C8480h hVar) {
        this.f85664a = iVar;
        this.f85665b = j;
    }

    /* renamed from: a */
    public long mo58546a(C33180l lVar, long j, C33183o oVar, long j2) {
        C87412m.m108594g(lVar, "anchorBounds");
        C87412m.m108594g(oVar, "layoutDirection");
        int ordinal = this.f85664a.ordinal();
        if (ordinal == 0) {
            int i = lVar.f90053a;
            long j3 = this.f85665b;
            int i2 = C33177j.f90051c;
            return C33179k.m39964a(i + ((int) (j3 >> 32)), lVar.f90054b + C33177j.m39962a(j3));
        } else if (ordinal == 1) {
            int i3 = lVar.f90053a;
            long j4 = this.f85665b;
            int i4 = C33177j.f90051c;
            return C33179k.m39964a((i3 + ((int) (j4 >> 32))) - ((int) (j2 >> 32)), lVar.f90054b + C33177j.m39962a(j4));
        } else if (ordinal == 2) {
            int i5 = lVar.f90053a;
            long j5 = this.f85665b;
            int i6 = C33177j.f90051c;
            return C33179k.m39964a((i5 + ((int) (j5 >> 32))) - (((int) (j2 >> 32)) / 2), lVar.f90054b + C33177j.m39962a(j5));
        } else {
            throw new C13603j();
        }
    }
}
