package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C51821we0;
import te3.C51961xe0;

/* renamed from: je1.h */
public final class C46521h extends C89132b<C51961xe0> {

    /* renamed from: i */
    public final String f125327i;

    public C46521h(String str, C89349b bVar) {
        C87412m.m108594g(str, "finderUsername");
        String str2 = "Cgi.FinderAccountRecommend#" + str;
        this.f125327i = str2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C51821we0 we02 = new C51821we0();
        we02.f143980d = C46523h2.f125330a.mo71859a(10027);
        we02.f143981e = str;
        we02.f143983g = bVar;
        bVar2.f127066a = we02;
        bVar2.f127067b = new C51961xe0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderacctrecommend";
        bVar2.f127069d = 10027;
        mo123453j(bVar2.mo72403a());
        Log.m105924i(str2, "[CgiFinderAccountRecommend] created...");
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51961xe0) eu32, "resp");
        String str2 = this.f125327i;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C51961xe0>> mo9225i() {
        Log.m105924i(this.f125327i, "[run]...");
        C89059e<C89132b.C89134c<C51961xe0>> i = super.mo9225i();
        C87412m.m108593f(i, "super.run()");
        return i;
    }
}
