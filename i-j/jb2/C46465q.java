package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import gy3.C87412m;
import hb2.C32799i;
import hb2.C32800k;
import hb2.C8506l;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C48656a23;
import te3.C48799b23;
import te3.C49842ig0;
import te3.C64488kb1;
import te3.C64793w23;

/* renamed from: jb2.q */
public final class C46465q extends C46455a {

    /* renamed from: i */
    public final String f125178i;

    /* renamed from: j */
    public C11385n f125179j;

    /* renamed from: n */
    public final C47350c f125180n;

    /* renamed from: o */
    public C48656a23 f125181o;

    /* renamed from: p */
    public C48799b23 f125182p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46465q(C64793w23 w232, C64488kb1 kb12, String str, int i, boolean z) {
        super(i);
        C87412m.m108594g(kb12, "songInfo");
        C87412m.m108594g(str, "songInfoBase64");
        this.f125178i = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6860;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivegetrelatedlist";
        bVar.f127066a = new C48656a23();
        bVar.f127067b = new C48799b23();
        C47350c a = bVar.mo72403a();
        this.f125180n = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListReq");
        C48656a23 a232 = (C48656a23) aVar;
        this.f125181o = a232;
        if (z) {
            a232.f130249o = 102;
        } else {
            a232.f130249o = 103;
        }
        C49842ig0 ig02 = new C49842ig0();
        if (w232 != null) {
            ig02.f135313e = w232.f186035f;
        }
        ig02.f135317i = C31543z5.m39453c();
        a232.f130241d = ig02;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("songid", kb12.f183909i);
        jSONObject.put("mvquery", jSONObject2);
        jSONObject.put("songinfobufferbase64", str);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "songId:%s", kb12.f183909i);
        C48656a23 a233 = this.f125181o;
        if (a233 != null) {
            a233.f130250p = jSONObject.toString();
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125179j = nVar;
        return dispatch(gVar, this.f125180n, this);
    }

    public int getType() {
        return 6860;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125180n.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListResp");
            this.f125182p = (C48799b23) aVar;
            C48799b23 b232 = new C48799b23();
            C48799b23 b233 = this.f125182p;
            b232.parseFrom(b233 != null ? b233.toByteArray() : null);
            C32799i iVar = C32799i.f89226a;
            String str2 = this.f125178i;
            iVar.getClass();
            C87412m.m108594g(str2, "songInfoBase64");
            if (C32799i.f89227b) {
                long currentTicks = Util.currentTicks();
                Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "putMvRecommendList, songInfoBase64:" + str2.hashCode() + ", response:" + b232.hashCode() + ", timestamp:" + currentTicks);
                C32799i.f89229d.put(new C8506l(str2), new C32800k(b232, currentTicks));
                iVar.mo58806a(currentTicks);
            }
            C11385n nVar = this.f125179j;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125179j;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
