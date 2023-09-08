package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49142dg0;
import te3.C49281eg0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: qg1.h */
public final class C47828h extends C60625c<C49281eg0> {

    /* renamed from: s */
    public final String f128397s = "Finder.CgiFinderLiveBanComment";

    /* renamed from: t */
    public C47829a f128398t;

    /* renamed from: u */
    public C49142dg0 f128399u;

    /* renamed from: qg1.h$a */
    public interface C47829a {
        /* renamed from: a */
        void mo608a(boolean z);

        /* renamed from: b */
        void mo609b(int i, int i2, String str, boolean z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47828h(long j, long j2, String str, int i, boolean z, C47829a aVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "audienceUsername");
        C87412m.m108594g(aVar, "callback");
        this.f128398t = aVar;
        C49142dg0 dg02 = new C49142dg0();
        this.f128399u = dg02;
        dg02.f132303e = j;
        dg02.f132304f = j2;
        dg02.f132305g = str;
        dg02.f132306h = i;
        dg02.f132307i = z;
        dg02.f132302d = C46523h2.f125330a.mo71859a(6656);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f128399u;
        C49281eg0 eg02 = new C49281eg0();
        eg02.setBaseResponse(new C49966ja());
        eg02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = eg02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderbanlivecomment";
        bVar.f127069d = 6656;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveBanComment", "CgiFinderLiveBanComment init " + this.f128399u.f132303e + ',' + this.f128399u.f132305g);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49281eg0) eu32, "resp");
        String str2 = this.f128397s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            this.f128398t.mo608a(this.f128399u.f132307i);
        } else {
            this.f128398t.mo609b(i, i2, str, this.f128399u.f132307i);
        }
    }
}
