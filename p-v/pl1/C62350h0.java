package pl1;

import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import te3.C64689rq2;
import up1.C27696y;

@C86522b
/* renamed from: pl1.h0 */
public final class C62350h0 extends C86301e implements C62368t0 {
    public C100810g0 Rt0(String str, C27696y yVar) {
        C87412m.m108594g(str, "rawUrl");
        C87412m.m108594g(yVar, "urlFormat");
        return new C62345f(str, yVar);
    }

    /* renamed from: UE */
    public C100810g0 mo87412UE(String str, C27696y yVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(yVar, "mediaType");
        return new C11984n0(str, yVar);
    }

    /* renamed from: o7 */
    public C100810g0 mo87413o7(C64689rq2 rq22, C27696y yVar, String str, int i) {
        C87412m.m108594g(rq22, "mediaObj");
        C87412m.m108594g(yVar, "type");
        return i == 0 ? new C62367r0(rq22, yVar, str, 0, 0, (String) null, 56, (C8480h) null) : new C62367r0(rq22, yVar, str, i, 0, (String) null, 48, (C8480h) null);
    }

    /* renamed from: ti */
    public C100810g0 mo87414ti(C64689rq2 rq22, C27696y yVar, String str) {
        C87412m.m108594g(rq22, "mediaObj");
        C87412m.m108594g(yVar, "type");
        C87412m.m108594g(str, "username");
        return new C62372x(rq22, yVar, str);
    }
}
