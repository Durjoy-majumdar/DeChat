package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import o40.C61926c;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50474n01;
import te3.C50617o01;
import te3.C51163rv3;

/* renamed from: dj1.i0 */
public final class C7339i0 extends C58286q<C50617o01> {

    /* renamed from: t */
    public C7340a f25455t;

    /* renamed from: u */
    public final String f25456u = "CgiFinderLiveGetLotteryRecord";

    /* renamed from: v */
    public C50474n01 f25457v;

    /* renamed from: w */
    public int f25458w;

    /* renamed from: dj1.i0$a */
    public interface C7340a {
        /* renamed from: a */
        void mo8508a(int i, int i2, String str, C50617o01 o012);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7339i0(int i, String str, long j, long j2, byte[] bArr, String str2, String str3, C89349b bVar, C7340a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "nonceId");
        C87412m.m108594g(str3, "lotteryId");
        this.f25455t = aVar;
        C50474n01 n012 = new C50474n01();
        this.f25457v = n012;
        n012.f138305e = str;
        n012.f138306f = j;
        n012.f138307g = j2;
        n012.f138308h = C61926c.m72671P(str2);
        C50474n01 n013 = this.f25457v;
        n013.f138309i = str3;
        n013.f138310j = bVar;
        n013.f138304d = C46523h2.f125330a.mo71859a(5258);
        C50474n01 n014 = this.f25457v;
        n014.f138311n = str2;
        n014.f138312o = C89349b.m111674a(bArr);
        C50474n01 n015 = this.f25457v;
        n015.f138313p = i;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = n015;
        C50617o01 o012 = new C50617o01();
        o012.setBaseResponse(new C49966ja());
        o012.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = o012;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetlotteryrecord";
        bVar2.f127069d = 5258;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("CgiFinderLiveGetLotteryRecord", "init scene:" + this.f25457v.f138313p + ",finderUsername:" + this.f25457v.f138305e + ",liveId:" + this.f25457v.f138306f + ",objectId:" + this.f25457v.f138307g + ",objectNonceId:" + this.f25457v.f138311n + ",lotteryId:" + this.f25457v.f138309i + ",lastBuffer:" + this.f25457v.f138310j + ",live_cookies:" + this.f25457v.f138312o);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50617o01 o012 = (C50617o01) eu32;
        C87412m.m108594g(o012, "resp");
        String str2 = this.f25456u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str3 = this.f25456u;
            Log.m105924i(str3, "result:" + C61937h.m72709h(o012));
        }
        C7340a aVar = this.f25455t;
        if (aVar != null) {
            aVar.mo8508a(i, i2, str, o012);
        }
    }
}
