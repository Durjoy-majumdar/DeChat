package p165hr;

import di3.C86301e;
import dj1.C45381p0;
import ei3.C86522b;
import gy3.C87412m;
import ob0.C89132b;
import p565ir.C60602j;
import pe3.C89349b;
import te3.C49377f41;
import te3.C50401mh0;
import te3.C51088rc1;
import te3.C51778w31;

@C86522b
/* renamed from: hr.a */
public final class C46099a extends C86301e implements C60602j {
    /* renamed from: NM */
    public C50401mh0 mo71541NM(String str, boolean z) {
        C87412m.m108594g(str, "finderUsername");
        C45381p0.C45382a aVar = C45381p0.f122894u;
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = 4;
        C51088rc1 rc12 = new C51088rc1();
        rc12.f140814d = str;
        rc12.f140815e = z ? 2 : 1;
        mh02.f138029e = C89349b.m111674a(rc12.toByteArray());
        return mh02;
    }

    public C89132b<C51778w31> p80(long j, long j2, int i, C50401mh0 mh02) {
        C87412m.m108594g(mh02, "cmdItem");
        return new C45381p0(j, j2, i, mh02);
    }

    public C50401mh0 zh0(boolean z, String str) {
        C87412m.m108594g(str, "finderName");
        C45381p0.C45382a aVar = C45381p0.f122894u;
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = 8;
        C49377f41 f412 = new C49377f41();
        f412.f133280d = str;
        int i = 1;
        f412.f133281e = 1;
        if (!z) {
            i = 2;
        }
        f412.f133282f = i;
        mh02.f138029e = C89349b.m111674a(f412.toByteArray());
        return mh02;
    }
}
