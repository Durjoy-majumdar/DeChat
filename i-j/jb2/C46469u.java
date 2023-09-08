package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50343m23;
import te3.C50485n23;
import te3.C64482k23;
import te3.C64488kb1;

/* renamed from: jb2.u */
public final class C46469u extends C46455a {

    /* renamed from: i */
    public C11385n f125193i;

    /* renamed from: j */
    public final C47350c f125194j;

    /* renamed from: n */
    public C50485n23 f125195n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46469u(C64482k23 k232, C64488kb1 kb12, int i) {
        super(i);
        C87412m.m108594g(k232, "msg");
        C87412m.m108594g(kb12, "songInfo");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6672;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivepostlivemsg";
        bVar.f127066a = new C50343m23();
        bVar.f127067b = new C50485n23();
        C47350c a = bVar.mo72403a();
        this.f125194j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLivePostLiveMsgReq");
        C50343m23 m232 = (C50343m23) aVar;
        m232.f137774d = k232;
        m232.f137775e = kb12;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125193i = nVar;
        return dispatch(gVar, this.f125194j, this);
    }

    public int getType() {
        return 6672;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvPostLiveMsg", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125194j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLivePostLiveMsgResp");
            this.f125195n = (C50485n23) aVar;
            C11385n nVar = this.f125193i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125193i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
