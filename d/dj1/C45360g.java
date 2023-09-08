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
import te3.C49060cx0;
import te3.C49199dx0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.g */
public final class C45360g extends C58286q<C49199dx0> {

    /* renamed from: t */
    public final C45361a f122854t;

    /* renamed from: u */
    public final String f122855u = "Finder.CgiFinderCloseLiveMic";

    /* renamed from: v */
    public final JSONObject f122856v = new JSONObject();

    /* renamed from: w */
    public final JSONObject f122857w;

    /* renamed from: x */
    public C49060cx0 f122858x;

    /* renamed from: dj1.g$a */
    public interface C45361a {
        /* renamed from: a */
        void mo62564a(int i, int i2, String str, C49199dx0 dx02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45360g(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02, C45361a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(xs02, "msg");
        this.f122854t = aVar;
        JSONObject jSONObject = new JSONObject();
        this.f122857w = jSONObject;
        C49060cx0 cx02 = new C49060cx0();
        this.f122858x = cx02;
        cx02.f132004g = j;
        cx02.f132001d = C46523h2.f125330a.mo71859a(4142);
        C49060cx0 cx03 = this.f122858x;
        cx03.f132005h = j2;
        cx03.f132006i = str;
        cx03.f132008n = C66785b.f191882e.mo90662O5();
        C49060cx0 cx04 = this.f122858x;
        cx04.f132007j = i;
        cx04.f132002e = C89349b.m111674a(bArr);
        this.f122858x.f132003f = xs02;
        jSONObject.put("liveId", j);
        jSONObject.put("objectId", j2);
        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f122858x.f132007j);
        jSONObject.put("username", this.f122858x.f132008n);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122858x;
        C49199dx0 dx02 = new C49199dx0();
        dx02.setBaseResponse(new C49966ja());
        dx02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = dx02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveclosemicwithaudience";
        bVar.f127069d = 4142;
        C47350c a = bVar.mo72403a();
        Log.m105924i("Finder.CgiFinderCloseLiveMic", "liveId:" + this.f122858x.f132004g + " objectId:" + this.f122858x.f132005h + " objectNonceId:" + this.f122858x.f132006i + " scene:" + this.f122858x.f132007j);
        mo123453j(a);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122857w;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122856v;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49199dx0 dx02 = (C49199dx0) eu32;
        C87412m.m108594g(dx02, "resp");
        String str2 = this.f122855u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45361a aVar = this.f122854t;
        if (aVar != null) {
            aVar.mo62564a(i, i2, str, dx02);
        }
    }
}
