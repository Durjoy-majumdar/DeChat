package qg1;

import di3.C86301e;
import dj1.C58279g0;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import ls3.C61398h;
import ob0.C89132b;
import te3.C48742ao0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50317lw0;
import te3.C51897wz0;
import te3.C64308d82;
import te3.C64414h71;
import te3.C64840xw0;

@C86522b
/* renamed from: qg1.e0 */
public final class C62613e0 extends C86301e implements C61398h {
    /* renamed from: jS */
    public C89132b<C48742ao0> mo86339jS(C49842ig0 ig02, String str, byte[] bArr, long j, long j2, String str2, int i, boolean z, int i2, C64840xw0 xw02, int i3, C49712hj1 hj12, String str3, C61398h.C61400b bVar, String str4, C50317lw0 lw02, C64414h71 h712, boolean z2) {
        C49712hj1 hj13 = hj12;
        C87412m.m108594g(str2, "nonceId");
        C87412m.m108594g(hj13, "contextObj");
        C87412m.m108594g(bVar, "callback");
        return new C62612c(ig02 == null ? C46523h2.f125330a.mo71860b(3976, hj13) : ig02, str, bArr, j, j2, str2, i, z, i2, xw02, i3, hj12, str3, bVar, str4, lw02, h712, z2);
    }

    public C89132b<C51897wz0> xk0(String str, byte[] bArr, long j, long j2, LinkedList<C64308d82> linkedList) {
        C87412m.m108594g(str, "anchorUsername");
        LinkedList<C64308d82> linkedList2 = linkedList;
        C87412m.m108594g(linkedList2, "reqList");
        return new C58279g0(str, bArr, j, j2, linkedList2);
    }
}
