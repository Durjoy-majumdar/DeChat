package nq1;

import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import sq1.C64147b;
import sq1.C64151e;
import te3.C49335eu3;
import te3.C64236ao1;
import te3.C64887zn1;

/* renamed from: nq1.b */
public final class C61887b extends C89132b<C64236ao1> {

    /* renamed from: i */
    public String f175986i;

    /* renamed from: j */
    public String f175987j;

    /* renamed from: n */
    public long f175988n;

    /* renamed from: o */
    public C64151e f175989o;

    /* renamed from: p */
    public boolean f175990p;

    public C61887b(String str, String str2, long j, C64151e eVar, boolean z) {
        C87412m.m108594g(str, "app_name");
        C87412m.m108594g(str2, "entity_id");
        C87412m.m108594g(eVar, "rootComment");
        this.f175986i = str;
        this.f175987j = str2;
        this.f175988n = j;
        this.f175989o = eVar;
        this.f175990p = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64887zn1 zn12 = new C64887zn1();
        zn12.f186746e = this.f175986i;
        zn12.f186747f = this.f175987j;
        zn12.f186745d = C46523h2.f125330a.mo71859a(6953);
        zn12.f186749h = this.f175988n;
        zn12.f186755q = this.f175989o.f181868d.mo88876n2().lastBuffer;
        zn12.f186752n = this.f175990p ? 2 : 1;
        bVar.f127066a = zn12;
        bVar.f127067b = new C64236ao1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderunigetcomment";
        bVar.f127069d = 6953;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C64236ao1 ao12 = (C64236ao1) eu32;
        if (i == 0 && i2 == 0 && ao12 != null) {
            C64147b bVar = this.f175989o.f181868d;
            bVar.mo88876n2().lastBuffer = ao12.f182114h;
            bVar.mo88876n2().continueFlag = ao12.f182113g;
            bVar.mo88876n2().upContinueFlag = ao12.f182112f;
        }
    }
}
