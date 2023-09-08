package jh2;

import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64738tt2;
import te3.C64758ut2;

/* renamed from: jh2.f */
public final class C60860f extends C89132b<C64758ut2> {
    public C60860f(LinkedList linkedList, float f, float f2, long j, long j2, int i, int i2, int i3, C8480h hVar) {
        j = (i3 & 8) != 0 ? 0 : j;
        j2 = (i3 & 16) != 0 ? 0 : j2;
        i = (i3 & 32) != 0 ? 0 : i;
        i2 = (i3 & 64) != 0 ? 10 : i2;
        C87412m.m108594g(linkedList, "imageData");
        C64738tt2 tt22 = new C64738tt2();
        C64758ut2 ut22 = new C64758ut2();
        ut22.setBaseResponse(new C49966ja());
        ut22.getBaseResponse().f135956e = new C51163rv3();
        tt22.f185675g = linkedList;
        tt22.f185672d = i2;
        tt22.f185673e = f;
        tt22.f185674f = f2;
        tt22.f185676h = j;
        tt22.f185678j = j2;
        tt22.f185677i = (long) i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = tt22;
        bVar.f127067b = ut22;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getrecommendedmusiclist";
        bVar.f127069d = 341;
        mo123453j(bVar.mo72403a());
    }
}
