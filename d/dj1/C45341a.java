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
import te3.C51867wr0;
import te3.C52009xr0;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.a */
public final class C45341a extends C58286q<C52009xr0> {

    /* renamed from: t */
    public final C45342a f122814t;

    /* renamed from: u */
    public final String f122815u = "Finder.CgiFinderAcceptLiveMic";

    /* renamed from: v */
    public C51867wr0 f122816v = new C51867wr0();

    /* renamed from: w */
    public final JSONObject f122817w = new JSONObject();

    /* renamed from: x */
    public final JSONObject f122818x;

    /* renamed from: dj1.a$a */
    public interface C45342a {
        /* renamed from: a */
        void mo70884a(int i, int i2, String str, C52009xr0 xr02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45341a(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02, C45342a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(xs02, "msg");
        this.f122814t = aVar;
        JSONObject jSONObject = new JSONObject();
        this.f122818x = jSONObject;
        C51867wr0 wr02 = this.f122816v;
        wr02.f144232g = j;
        wr02.f144229d = C46523h2.f125330a.mo71859a(6852);
        C51867wr0 wr03 = this.f122816v;
        wr03.f144233h = j2;
        wr03.f144234i = str;
        wr03.f144230e = C89349b.m111674a(bArr);
        this.f122816v.f144236n = C66785b.f191882e.mo90662O5();
        C51867wr0 wr04 = this.f122816v;
        wr04.f144235j = i;
        wr04.f144231f = xs02;
        jSONObject.put("liveId", j);
        jSONObject.put("objectId", j2);
        jSONObject.put("username", this.f122816v.f144236n);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f122816v;
        C52009xr0 xr02 = new C52009xr0();
        xr02.setBaseResponse(new C49966ja());
        xr02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = xr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveacceptmicwithaudience";
        bVar.f127069d = 6852;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122818x;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f122817w;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C52009xr0 xr02 = (C52009xr0) eu32;
        C87412m.m108594g(xr02, "resp");
        String str2 = this.f122815u;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45342a aVar = this.f122814t;
        if (aVar != null) {
            aVar.mo70884a(i, i2, str, xr02);
        }
    }
}
