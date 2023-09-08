package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50501n61;
import te3.C50639o61;
import te3.C51163rv3;

/* renamed from: qg1.x */
public final class C47836x extends C60625c<C50639o61> {

    /* renamed from: s */
    public final C47837a f128413s;

    /* renamed from: t */
    public final String f128414t = "Finder.CgiFinderLiveRandomMic";

    /* renamed from: u */
    public C50501n61 f128415u;

    /* renamed from: qg1.x$a */
    public interface C47837a {
        /* renamed from: a */
        void mo72580a(int i, int i2, String str, C50639o61 o612);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47836x(byte[] bArr, long j, long j2, String str, String str2, int i, C47837a aVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(str2, "finderUserName");
        this.f128413s = aVar;
        C50501n61 n612 = new C50501n61();
        this.f128415u = n612;
        n612.f138434e = C89349b.m111674a(bArr);
        C50501n61 n613 = this.f128415u;
        n613.f138435f = j;
        n613.f138436g = j2;
        n613.f138437h = str;
        n613.f138438i = str2;
        n613.f138433d = C46523h2.f125330a.mo71859a(4136);
        C50501n61 n614 = this.f128415u;
        n614.f138439j = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = n614;
        C50639o61 o612 = new C50639o61();
        o612.setBaseResponse(new C49966ja());
        o612.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = o612;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliverandommic";
        bVar.f127069d = 4136;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveRandomMic", "init: liveId:" + this.f128415u.f138435f + ", objectId:" + this.f128415u.f138436g + ", objectNonceId:" + this.f128415u.f138437h + ", finderUserName:" + this.f128415u.f138438i + ", opCode:" + this.f128415u.f138439j);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50639o61 o612 = (C50639o61) eu32;
        C87412m.m108594g(o612, "resp");
        String str2 = this.f128414t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C47837a aVar = this.f128413s;
        if (aVar != null) {
            aVar.mo72580a(i, i2, str, o612);
        }
    }
}
