package je1;

import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50613nz0;
import te3.C50756oz0;
import te3.C51163rv3;

/* renamed from: je1.b0 */
public final class C9296b0 extends C60625c<C50756oz0> {

    /* renamed from: s */
    public C50613nz0 f29069s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9296b0(String str, String str2, byte[] bArr, long j, long j2, String str3, int i, boolean z, int i2, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        String str4 = str;
        int i3 = i2;
        String str5 = "";
        String str6 = (i3 & 2) != 0 ? str5 : str2;
        byte[] bArr2 = (i3 & 4) != 0 ? null : bArr;
        long j3 = 0;
        long j4 = (i3 & 8) != 0 ? 0 : j;
        j3 = (i3 & 16) == 0 ? j2 : j3;
        str5 = (i3 & 32) == 0 ? str3 : str5;
        boolean z2 = (i3 & 128) != 0 ? true : z;
        C87412m.m108594g(str, "activityId");
        C87412m.m108594g(str6, "finderUsername");
        C87412m.m108594g(str5, "noticeId");
        C50613nz0 nz02 = new C50613nz0();
        this.f29069s = nz02;
        nz02.f138847d = C46523h2.f125330a.mo71859a(10635);
        C50613nz0 nz03 = this.f29069s;
        nz03.f138848e = str4;
        nz03.f138850g = j4;
        nz03.f138851h = C89349b.m111674a(bArr2);
        C50613nz0 nz04 = this.f29069s;
        nz04.f138849f = j3;
        nz04.f138852i = str5;
        nz04.f138853j = i;
        nz04.f138854n = str6;
        nz04.f138855o = z2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = nz04;
        C50756oz0 oz02 = new C50756oz0();
        oz02.setBaseResponse(new C49966ja());
        oz02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = oz02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetconcertticket";
        bVar.f127069d = 10635;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50756oz0) eu32, "resp");
    }
}
