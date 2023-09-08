package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49845ih0;
import te3.C49966ja;
import te3.C49991jh0;
import te3.C51163rv3;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.h */
public final class C45364h extends C58286q<C49991jh0> {

    /* renamed from: t */
    public final C45365a f122861t;

    /* renamed from: u */
    public final String f122862u = "Finder.CgiFinderCloseLiveMicPk";

    /* renamed from: v */
    public final JSONObject f122863v = new JSONObject();

    /* renamed from: w */
    public final JSONObject f122864w;

    /* renamed from: x */
    public C49845ih0 f122865x;

    /* renamed from: dj1.h$a */
    public interface C45365a {
        /* renamed from: a */
        void mo70890a(int i, int i2, String str, C49991jh0 jh02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45364h(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02, C45365a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(xs02, "msg");
        this.f122861t = aVar;
        JSONObject jSONObject = new JSONObject();
        this.f122864w = jSONObject;
        C49845ih0 ih02 = new C49845ih0();
        this.f122865x = ih02;
        ih02.f135339g = j;
        ih02.f135336d = C46523h2.f125330a.mo71859a(3582);
        C49845ih0 ih03 = this.f122865x;
        ih03.f135340h = j2;
        ih03.f135341i = str;
        ih03.f135343n = C66785b.f191882e.mo90662O5();
        C49845ih0 ih04 = this.f122865x;
        ih04.f135342j = i;
        ih04.f135337e = C89349b.m111674a(bArr);
        this.f122865x.f135338f = xs02;
        jSONObject.put("liveId", j);
        jSONObject.put("objectId", j2);
        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f122865x.f135342j);
        jSONObject.put("username", this.f122865x.f135343n);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122865x;
        C49991jh0 jh02 = new C49991jh0();
        jh02.setBaseResponse(new C49966ja());
        jh02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = jh02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercloselivemic";
        bVar.f127069d = 3582;
        C47350c a = bVar.mo72403a();
        Log.m105924i("Finder.CgiFinderCloseLiveMicPk", "liveId:" + this.f122865x.f135339g + " objectId:" + this.f122865x.f135340h + " objectNonceId:" + this.f122865x.f135341i + " scene:" + this.f122865x.f135342j);
        mo123453j(a);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122864w;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122863v;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49991jh0 jh02 = (C49991jh0) eu32;
        C87412m.m108594g(jh02, "resp");
        String str2 = this.f122862u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45365a aVar = this.f122861t;
        if (aVar != null) {
            aVar.mo70890a(i, i2, str, jh02);
        }
    }
}
