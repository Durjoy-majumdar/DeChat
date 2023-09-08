package jb2;

import android.content.Context;
import android.util.Base64;
import bl3.C39818r;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import sb2.C63844s;
import te3.C48656a23;
import te3.C48799b23;
import te3.C49842ig0;
import te3.C64488kb1;
import z04.C119027c;

/* renamed from: jb2.l */
public final class C46462l extends C46455a {

    /* renamed from: i */
    public C11385n f125163i;

    /* renamed from: j */
    public final C47350c f125164j;

    /* renamed from: n */
    public C48656a23 f125165n;

    /* renamed from: o */
    public C48799b23 f125166o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46462l(Context context, C89349b bVar) {
        super(0, 1, (C8480h) null);
        C87412m.m108594g(context, "context");
        C49842ig0 ig02 = null;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6860;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/musiclivegetrelatedlist";
        bVar2.f127066a = new C48656a23();
        bVar2.f127067b = new C48799b23();
        C47350c a = bVar2.mo72403a();
        this.f125164j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListReq");
        C48656a23 a232 = (C48656a23) aVar;
        this.f125165n = a232;
        a232.f130249o = 101;
        C63844s sVar = (C63844s) C39818r.f106831a.mo62443b(context).mo75002a(C63844s.class);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bgmid", sVar.f180975e.f183909i);
        jSONObject.put("songname", sVar.f180975e.f183904d);
        jSONObject.put("singername", sVar.f180975e.f183905e);
        jSONObject.put("songdesc", "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", 1);
        jSONObject2.put("bgmquery", jSONObject);
        C64488kb1 kb12 = sVar.f180975e;
        C87412m.m108594g(kb12, "songInfo");
        byte[] encode = Base64.encode(kb12.toByteArray(), 2);
        C87412m.m108593f(encode, "encode(songInfo.toByteArray(), Base64.NO_WRAP)");
        jSONObject2.put("songinfobufferbase64", new String(encode, C119027c.f356488a));
        C48656a23 a233 = this.f125165n;
        if (a233 != null) {
            a233.f130250p = jSONObject2.toString();
        }
        Log.m105924i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "create NetSceneMusicMvGetFeedRecommendList songId:" + sVar.f180975e.f183909i);
        C48656a23 a234 = this.f125165n;
        if (a234 != null) {
            a234.f130241d = new C49842ig0();
        }
        C48656a23 a235 = this.f125165n;
        C49842ig0 ig03 = a235 != null ? a235.f130241d : null;
        if (ig03 != null) {
            ig03.f135313e = 93;
        }
        ig02 = a235 != null ? a235.f130241d : ig02;
        if (ig02 != null) {
            ig02.f135317i = C31543z5.m39453c();
        }
        C48656a23 a236 = this.f125165n;
        if (a236 != null) {
            a236.f130242e = bVar;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125163i = nVar;
        return dispatch(gVar, this.f125164j, this);
    }

    public int getType() {
        return 6860;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125164j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListResp");
            this.f125166o = (C48799b23) aVar;
            C11385n nVar = this.f125163i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125163i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
