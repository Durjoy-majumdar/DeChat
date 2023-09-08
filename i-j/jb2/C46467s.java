package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49221e23;
import te3.C49368f23;

/* renamed from: jb2.s */
public final class C46467s extends C46455a {

    /* renamed from: i */
    public C11385n f125187i;

    /* renamed from: j */
    public final C47350c f125188j;

    /* renamed from: n */
    public C49368f23 f125189n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46467s(String str, C89349b bVar, boolean z, int i) {
        super(i);
        C87412m.m108594g(str, "songId");
        C87412m.m108594g(bVar, "cookie");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6820;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/musicliveheartbeat";
        bVar2.f127066a = new C49221e23();
        bVar2.f127067b = new C49368f23();
        C47350c a = bVar2.mo72403a();
        this.f125188j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveHeartbeatReq");
        C49221e23 e232 = (C49221e23) aVar;
        e232.f132646d = str;
        e232.f132647e = bVar;
        e232.f132648f = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125187i = nVar;
        return dispatch(gVar, this.f125188j, this);
    }

    public int getType() {
        return 6820;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvHeartbeat", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125188j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveHeartbeatResp");
            this.f125189n = (C49368f23) aVar;
            C11385n nVar = this.f125187i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125187i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
