package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import kt1.C46744d;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import ol0.C117840v;
import org.json.JSONObject;
import tc2.C118418g;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50130kh0;
import te3.C50262lh0;
import te3.C51163rv3;

/* renamed from: dj1.f */
public final class C45356f extends C58286q<C50262lh0> {

    /* renamed from: t */
    public final String f122847t = "Finder.CgiFinderCloseLive";

    /* renamed from: u */
    public C45357a f122848u;

    /* renamed from: v */
    public C50130kh0 f122849v;

    /* renamed from: w */
    public final JSONObject f122850w;

    /* renamed from: x */
    public final JSONObject f122851x;

    /* renamed from: dj1.f$a */
    public interface C45357a {
        /* renamed from: a */
        void mo62569a(int i, int i2, String str, C50262lh0 lh02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45356f(long j, String str, long j2, String str2, int i, C45357a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "nonceId");
        C87412m.m108594g(aVar, "callback");
        this.f122848u = aVar;
        this.f122849v = new C50130kh0();
        JSONObject jSONObject = new JSONObject();
        this.f122850w = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.f122851x = jSONObject2;
        C50130kh0 kh02 = this.f122849v;
        kh02.f136785d = j;
        kh02.f136786e = str;
        kh02.f136787f = j2;
        kh02.f136788g = str2;
        kh02.f136789h = i;
        jSONObject2.put("liveId", j);
        jSONObject2.put("objectId", j2);
        jSONObject.put("username", this.f122849v.f136786e);
        jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122849v;
        C50262lh0 lh02 = new C50262lh0();
        lh02.setBaseResponse(new C49966ja());
        lh02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = lh02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercloselive";
        bVar.f127069d = C117840v.CTRL_INDEX;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderCloseLive", "CgiFinderCloseLive init liveId:" + this.f122849v.f136785d + ", username:" + this.f122849v.f136786e + ",objectId:" + this.f122849v.f136787f + ",nonceId:" + this.f122849v.f136788g + ",scene:" + this.f122849v.f136789h);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122851x;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122850w;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50262lh0 lh02 = (C50262lh0) eu32;
        C87412m.m108594g(lh02, "resp");
        String str2 = this.f122847t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str3 = this.f122847t;
            Log.m105924i(str3, "close live result:" + C61937h.m72709h(lh02));
        }
        C118418g.INSTANCE.mo175823j6(this.f122849v.f136785d);
        this.f122848u.mo62569a(i, i2, str, lh02);
    }
}
