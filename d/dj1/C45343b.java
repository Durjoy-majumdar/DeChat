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
import te3.C51163rv3;
import te3.C51383te0;
import te3.C51532ue0;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.b */
public final class C45343b extends C58286q<C51532ue0> {

    /* renamed from: t */
    public final C45344a f122819t;

    /* renamed from: u */
    public final String f122820u = "Finder.CgiFinderAcceptLiveMicPk";

    /* renamed from: v */
    public final JSONObject f122821v = new JSONObject();

    /* renamed from: w */
    public final JSONObject f122822w;

    /* renamed from: x */
    public C51383te0 f122823x;

    /* renamed from: dj1.b$a */
    public interface C45344a {
        /* renamed from: a */
        void mo70885a(int i, int i2, String str, C51532ue0 ue02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45343b(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02, C45344a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(xs02, "msg");
        this.f122819t = aVar;
        JSONObject jSONObject = new JSONObject();
        this.f122822w = jSONObject;
        C51383te0 te02 = new C51383te0();
        this.f122823x = te02;
        te02.f142151g = j;
        te02.f142148d = C46523h2.f125330a.mo71859a(3936);
        C51383te0 te03 = this.f122823x;
        te03.f142152h = j2;
        te03.f142153i = str;
        te03.f142149e = C89349b.m111674a(bArr);
        this.f122823x.f142155n = C66785b.f191882e.mo90662O5();
        C51383te0 te04 = this.f122823x;
        te04.f142154j = i;
        te04.f142150f = xs02;
        jSONObject.put("liveId", j);
        jSONObject.put("objectId", j2);
        jSONObject.put("username", this.f122823x.f142155n);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122823x;
        C51532ue0 ue02 = new C51532ue0();
        ue02.setBaseResponse(new C49966ja());
        ue02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ue02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderacceptlivemic";
        bVar.f127069d = 3936;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122822w;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122821v;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51532ue0 ue02 = (C51532ue0) eu32;
        C87412m.m108594g(ue02, "resp");
        String str2 = this.f122820u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45344a aVar = this.f122819t;
        if (aVar != null) {
            aVar.mo70885a(i, i2, str, ue02);
        }
    }
}
