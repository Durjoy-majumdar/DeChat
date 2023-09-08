package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.List;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48721aj;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50054jz0;
import te3.C50195kz0;
import te3.C51163rv3;

/* renamed from: je1.x */
public final class C46545x extends C60625c<C50195kz0> {

    /* renamed from: s */
    public final List<C48721aj> f125416s;

    /* renamed from: t */
    public final String f125417t = "Finder.CgiFinderGetBoxMsgTips";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46545x(byte[] bArr, long j, long j2, List<? extends C48721aj> list, String str, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(list, "boxList");
        C87412m.m108594g(str, "anchorUserName");
        this.f125416s = list;
        C50054jz0 jz02 = new C50054jz0();
        jz02.f136468d = C46523h2.f125330a.mo71860b(11382, hj12);
        jz02.f136469e = C89349b.m111674a(bArr);
        jz02.f136470f = j;
        jz02.f136471g = j2;
        jz02.f136472h.addAll(list);
        jz02.f136473i = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = jz02;
        C50195kz0 kz02 = new C50195kz0();
        kz02.setBaseResponse(new C49966ja());
        kz02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = kz02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetboxmsgtips";
        bVar.f127069d = 11382;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderGetBoxMsgTips", "CgiFinderGetBoxMsgTips init ");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50195kz0) eu32, "resp");
        String str2 = this.f125417t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
