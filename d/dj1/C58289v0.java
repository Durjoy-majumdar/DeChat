package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48674a71;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64872z61;
import zc1.C66785b;

/* renamed from: dj1.v0 */
public final class C58289v0 extends C58286q<C48674a71> {

    /* renamed from: t */
    public final C58290a f166904t;

    /* renamed from: u */
    public final String f166905u = "Finder.CgiFinderLiveRefreshMic";

    /* renamed from: v */
    public C64872z61 f166906v;

    /* renamed from: dj1.v0$a */
    public interface C58290a {
        /* renamed from: a */
        void mo75795a(int i, int i2, String str, C48674a71 a712);
    }

    public C58289v0(long j, long j2, String str, byte[] bArr, int i, String str2, C58290a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        this.f166904t = aVar;
        C64872z61 z612 = new C64872z61();
        this.f166906v = z612;
        z612.f186632f = j;
        z612.f186630d = C46523h2.f125330a.mo71859a(4180);
        C64872z61 z613 = this.f166906v;
        z613.f186633g = j2;
        z613.f186634h = str;
        z613.f186636j = C66785b.f191882e.mo90662O5();
        C64872z61 z614 = this.f166906v;
        z614.f186635i = i;
        z614.f186631e = C89349b.m111674a(bArr);
        C64872z61 z615 = this.f166906v;
        z615.f186637n = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = z615;
        C48674a71 a712 = new C48674a71();
        a712.setBaseResponse(new C49966ja());
        a712.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = a712;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliverefreshmicwithaudience";
        bVar.f127069d = 4180;
        C47350c a = bVar.mo72403a();
        Log.m105924i("Finder.CgiFinderLiveRefreshMic", "liveId:" + this.f166906v.f186632f + " objectId:" + this.f166906v.f186633g + " objectNonceId:" + this.f166906v.f186634h + " scene:" + this.f166906v.f186635i + " mic_sdk_user_id:" + this.f166906v.f186637n);
        mo123453j(a);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C48674a71 a712 = (C48674a71) eu32;
        C87412m.m108594g(a712, "resp");
        String str2 = this.f166905u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C58290a aVar = this.f166904t;
        if (aVar != null) {
            aVar.mo75795a(i, i2, str, a712);
        }
    }
}
