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
import te3.C50672of0;
import te3.C50820pf0;
import te3.C51163rv3;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.e */
public final class C45350e extends C58286q<C50820pf0> {

    /* renamed from: t */
    public final C45351a f122834t;

    /* renamed from: u */
    public final String f122835u = "Finder.CgiFinderApplyLiveMicPk";

    /* renamed from: v */
    public final JSONObject f122836v = new JSONObject();

    /* renamed from: w */
    public final JSONObject f122837w;

    /* renamed from: x */
    public C50672of0 f122838x;

    /* renamed from: dj1.e$a */
    public interface C45351a {
        /* renamed from: a */
        void mo70887a(int i, int i2, String str, C50820pf0 pf02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45350e(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02, C45351a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(xs02, "msg");
        this.f122834t = aVar;
        JSONObject jSONObject = new JSONObject();
        this.f122837w = jSONObject;
        C50672of0 of02 = new C50672of0();
        this.f122838x = of02;
        of02.f139131g = j;
        of02.f139128d = C46523h2.f125330a.mo71859a(3917);
        C50672of0 of03 = this.f122838x;
        of03.f139132h = j2;
        of03.f139133i = str;
        of03.f139135n = C66785b.f191882e.mo90662O5();
        C50672of0 of04 = this.f122838x;
        of04.f139134j = i;
        of04.f139129e = C89349b.m111674a(bArr);
        this.f122838x.f139130f = xs02;
        jSONObject.put("liveId", j);
        jSONObject.put("objectId", j2);
        jSONObject.put("username", this.f122838x.f139135n);
        Log.m105924i("Finder.CgiFinderApplyLiveMicPk", "apply live id:" + j + " objectId:" + j2 + " objectNonceId:" + str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122838x;
        C50820pf0 pf02 = new C50820pf0();
        pf02.setBaseResponse(new C49966ja());
        pf02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = pf02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderapplylivemic";
        bVar.f127069d = 3917;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122837w;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122836v;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50820pf0 pf02 = (C50820pf0) eu32;
        C87412m.m108594g(pf02, "resp");
        String str2 = this.f122835u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45351a aVar = this.f122834t;
        if (aVar != null) {
            aVar.mo70887a(i, i2, str, pf02);
        }
    }
}
