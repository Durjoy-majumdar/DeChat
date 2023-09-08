package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C52013xs0;
import te3.C52177yw0;
import te3.C52316zw0;
import zc1.C66785b;

/* renamed from: dj1.y */
public final class C45401y extends C58286q<C52316zw0> {

    /* renamed from: t */
    public final String f122921t = "Finder.CgiFinderLiveCloseBattle";

    /* renamed from: u */
    public C52177yw0 f122922u;

    /* renamed from: dj1.y$a */
    public interface C45402a {
        /* renamed from: a */
        void mo70903a(int i, int i2, String str, C52316zw0 zw02);
    }

    public C45401y(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02) {
        super((C49712hj1) null, 1, (C8480h) null);
        C52177yw0 yw02 = new C52177yw0();
        this.f122922u = yw02;
        yw02.f145545g = j;
        yw02.f145542d = C46523h2.f125330a.mo71859a(4262);
        C52177yw0 yw03 = this.f122922u;
        yw03.f145546h = j2;
        yw03.f145547i = str;
        yw03.f145543e = C89349b.m111674a(bArr);
        this.f122922u.f145549n = C66785b.f191882e.mo90662O5();
        C52177yw0 yw04 = this.f122922u;
        yw04.f145548j = i;
        yw04.f145544f = xs02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = yw04;
        C52316zw0 zw02 = new C52316zw0();
        zw02.setBaseResponse(new C49966ja());
        zw02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = zw02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveclosebattle";
        bVar.f127069d = 4262;
        C47350c a = bVar.mo72403a();
        Log.m105924i("Finder.CgiFinderLiveCloseBattle", "liveId:" + this.f122922u.f145545g + " objectId:" + this.f122922u.f145546h + " nonceId:" + this.f122922u.f145547i + " username:" + this.f122922u.f145549n + " scene:" + this.f122922u.f145548j);
        mo123453j(a);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52316zw0) eu32, "resp");
        String str2 = this.f122921t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
