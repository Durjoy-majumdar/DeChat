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
import te3.C50788p61;
import te3.C50920q61;
import te3.C51163rv3;

/* renamed from: je1.z0 */
public final class C46553z0 extends C60625c<C50920q61> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46553z0(String str, String str2, byte[] bArr, long j, long j2, String str3, int i, boolean z, int i2, C8480h hVar) {
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
        C50788p61 p612 = new C50788p61();
        p612.f139599d = C46523h2.f125330a.mo71859a(11745);
        p612.f139600e = str4;
        p612.f139602g = j4;
        p612.f139603h = C89349b.m111674a(bArr2);
        p612.f139601f = j3;
        p612.f139604i = str5;
        p612.f139605j = i;
        p612.f139606n = str6;
        p612.f139607o = z2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = p612;
        C50920q61 q612 = new C50920q61();
        q612.setBaseResponse(new C49966ja());
        q612.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = q612;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivereceiveconcertticket";
        bVar.f127069d = 11745;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50920q61) eu32, "resp");
    }
}
