package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
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
import te3.C49966ja;
import te3.C50454mv0;
import te3.C50598nv0;
import te3.C51163rv3;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.d */
public final class C45346d extends C58286q<C50598nv0> {

    /* renamed from: t */
    public final C45347a f122825t;

    /* renamed from: u */
    public final String f122826u = "Finder.CgiFinderApplyLiveMic";

    /* renamed from: v */
    public C50454mv0 f122827v = new C50454mv0();

    /* renamed from: w */
    public final JSONObject f122828w = new JSONObject();

    /* renamed from: x */
    public final JSONObject f122829x;

    /* renamed from: dj1.d$a */
    public interface C45347a {
        /* renamed from: a */
        void mo70886a(int i, int i2, String str, C50598nv0 nv02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45346d(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02, C45347a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(xs02, "msg");
        this.f122825t = aVar;
        JSONObject jSONObject = new JSONObject();
        this.f122829x = jSONObject;
        C50454mv0 mv02 = this.f122827v;
        mv02.f138224g = j;
        mv02.f138221d = C46523h2.f125330a.mo71859a(5227);
        C50454mv0 mv03 = this.f122827v;
        mv03.f138225h = j2;
        mv03.f138226i = str;
        mv03.f138228n = C66785b.f191882e.mo90662O5();
        C50454mv0 mv04 = this.f122827v;
        mv04.f138227j = i;
        mv04.f138222e = C89349b.m111674a(bArr);
        this.f122827v.f138223f = xs02;
        jSONObject.put("liveId", j);
        jSONObject.put("objectId", j2);
        jSONObject.put("username", this.f122827v.f138228n);
        Log.m105924i("Finder.CgiFinderApplyLiveMic", "apply live id:" + j + " objectId:" + j2 + " objectNonceId:" + str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122827v;
        C50598nv0 nv02 = new C50598nv0();
        nv02.setBaseResponse(new C49966ja());
        nv02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = nv02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveapplymicwithaudience";
        bVar.f127069d = 5227;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122829x;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122828w;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50598nv0 nv02 = (C50598nv0) eu32;
        C87412m.m108594g(nv02, "resp");
        String str2 = this.f122826u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45347a aVar = this.f122825t;
        if (aVar != null) {
            aVar.mo70886a(i, i2, str, nv02);
        }
    }
}
