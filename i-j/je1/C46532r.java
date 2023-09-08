package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50410mj0;
import te3.C50552nj0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.r */
public final class C46532r extends C60625c<C50552nj0> {

    /* renamed from: s */
    public final String f125372s = "Finder.CgiFinderDelDraft";

    /* renamed from: t */
    public C50410mj0 f125373t;

    public C46532r(long j) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C50410mj0 mj02 = new C50410mj0();
        this.f125373t = mj02;
        mj02.f138066d = j;
        mj02.f138068f = C46523h2.f125330a.mo71860b(6662, this.f172731j);
        this.f125373t.f138067e = C66785b.f191882e.mo90662O5();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f125373t;
        C50552nj0 nj02 = new C50552nj0();
        nj02.setBaseResponse(new C49966ja());
        nj02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = nj02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderdeldraft";
        bVar.f127069d = 6662;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderDelDraft", "init id:" + j);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50552nj0) eu32, "resp");
        String str2 = this.f125372s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
