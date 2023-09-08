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
import te3.C51931x61;
import te3.C52074y61;

/* renamed from: dj1.d1 */
public final class C45349d1 extends C58286q<C52074y61> {

    /* renamed from: t */
    public final String f122832t = "Finder.CgiFinderLuckyMoneyRewardNotify";

    /* renamed from: u */
    public C51931x61 f122833u;

    public C45349d1(long j, long j2, String str, byte[] bArr, String str2) {
        super((C49712hj1) null, 1, (C8480h) null);
        C51931x61 x612 = new C51931x61();
        this.f122833u = x612;
        x612.f144483d = C46523h2.f125330a.mo71859a(6671);
        C51931x61 x613 = this.f122833u;
        x613.f144487h = j;
        x613.f144486g = j2;
        x613.f144488i = str;
        x613.f144484e = C89349b.m111674a(bArr);
        C51931x61 x614 = this.f122833u;
        x614.f144485f = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = x614;
        C52074y61 y612 = new C52074y61();
        y612.setBaseResponse(new C49966ja());
        bVar.f127067b = y612;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveredpacketrewardnotify";
        bVar.f127069d = 6671;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLuckyMoneyRewardNotify", "CgiFinderLuckyMoneyRewardNotify init liveId:" + this.f122833u.f144487h + " sendId:" + this.f122833u.f144485f);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52074y61) eu32, "resp");
        String str2 = this.f122832t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
