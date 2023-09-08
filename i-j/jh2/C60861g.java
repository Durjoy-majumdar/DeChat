package jh2;

import com.google.android.gms.actions.SearchIntents;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64626pc;
import te3.C64653qc;

/* renamed from: jh2.g */
public final class C60861g extends C89132b<C64653qc> {
    public C60861g(long j, String str, int i, long j2, int i2, int i3, int i4, C8480h hVar) {
        j2 = (i4 & 8) != 0 ? 0 : j2;
        i2 = (i4 & 16) != 0 ? 10 : i2;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C64626pc pcVar = new C64626pc();
        C64653qc qcVar = new C64653qc();
        qcVar.setBaseResponse(new C49966ja());
        qcVar.getBaseResponse().f135956e = new C51163rv3();
        pcVar.f184809e = j;
        pcVar.f184810f = str;
        pcVar.f184811g = i;
        pcVar.f184812h = i2;
        pcVar.f184813i = j2;
        pcVar.f184814j = (long) i3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = pcVar;
        bVar.f127067b = qcVar;
        bVar.f127068c = "/cgi-bin/micromsg-bin/sprbgmsearch";
        bVar.f127069d = 3645;
        mo123453j(bVar.mo72403a());
    }
}
