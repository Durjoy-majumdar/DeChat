package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49505g23;
import te3.C49647h23;
import te3.C64488kb1;

/* renamed from: jb2.t */
public final class C46468t extends C46455a {

    /* renamed from: i */
    public C11385n f125190i;

    /* renamed from: j */
    public final C47350c f125191j;

    /* renamed from: n */
    public C49647h23 f125192n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46468t(C64488kb1 kb12, int i) {
        super(i);
        C87412m.m108594g(kb12, "songInfo");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6893;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivejoin";
        bVar.f127066a = new C49505g23();
        bVar.f127067b = new C49647h23();
        C47350c a = bVar.mo72403a();
        this.f125191j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveJoinReq");
        ((C49505g23) aVar).f133808e = kb12;
        Log.m105924i("MicroMsg.Mv.NetSceneMusicMvJoin", "create NetSceneMusicMvJoin: " + kb12.f183909i + ' ' + kb12.f183904d);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125190i = nVar;
        return dispatch(gVar, this.f125191j, this);
    }

    public int getType() {
        return 6893;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvJoin", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125191j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveJoinResp");
            this.f125192n = (C49647h23) aVar;
            C11385n nVar = this.f125190i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125190i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
