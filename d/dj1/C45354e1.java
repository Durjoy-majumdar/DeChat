package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kt1.C46744d;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import tc2.C118418g;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51220sb1;
import te3.C51372tb1;
import zc1.C66785b;

/* renamed from: dj1.e1 */
public final class C45354e1 extends C58286q<C51372tb1> {

    /* renamed from: t */
    public final String f122842t = "Finder.CgiFinderManualCloseLive";

    /* renamed from: u */
    public C45355a f122843u;

    /* renamed from: v */
    public C51220sb1 f122844v;

    /* renamed from: w */
    public final JSONObject f122845w;

    /* renamed from: x */
    public final JSONObject f122846x;

    /* renamed from: dj1.e1$a */
    public interface C45355a {
        /* renamed from: a */
        void mo62571a(int i, int i2, String str, C51372tb1 tb12);
    }

    public C45354e1(long j, long j2, String str, C45355a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        this.f122843u = aVar;
        this.f122844v = new C51220sb1();
        JSONObject jSONObject = new JSONObject();
        this.f122845w = jSONObject;
        this.f122846x = new JSONObject();
        C51220sb1 sb12 = this.f122844v;
        sb12.f141420d = j;
        sb12.f141421e = C66785b.f191882e.mo90662O5();
        C51220sb1 sb13 = this.f122844v;
        sb13.f141422f = j2;
        sb13.f141423g = str;
        jSONObject.put("liveId", j);
        jSONObject.put("username", this.f122844v.f141421e);
        jSONObject.put("object_id", j2);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122844v;
        C51372tb1 tb12 = new C51372tb1();
        tb12.setBaseResponse(new C49966ja());
        tb12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = tb12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findermanualcloselive";
        bVar.f127069d = 5857;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderManualCloseLive", "CgiFinderManualCloseLive init liveId:" + this.f122844v.f141420d + ", objectId:" + this.f122844v.f141422f + ", nonceId:" + this.f122844v.f141423g + ", finderUsername:" + this.f122844v.f141421e);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122846x;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122845w;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51372tb1 tb12 = (C51372tb1) eu32;
        C87412m.m108594g(tb12, "resp");
        String str2 = this.f122842t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str3 = this.f122842t;
            Log.m105924i(str3, "close live result:" + C61937h.m72709h(tb12));
        }
        C118418g.INSTANCE.mo175823j6(this.f122844v.f141420d);
        C45355a aVar = this.f122843u;
        if (aVar != null) {
            aVar.mo62571a(i, i2, str, tb12);
        }
    }
}
