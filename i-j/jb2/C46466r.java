package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C48944c23;
import te3.C49085d23;
import te3.C64488kb1;

/* renamed from: jb2.r */
public final class C46466r extends C46455a {

    /* renamed from: i */
    public final String f125183i = "MicroMsg.Mv.NetSceneMusicMvGetSongStatus";

    /* renamed from: j */
    public C11385n f125184j;

    /* renamed from: n */
    public C47350c f125185n;

    /* renamed from: o */
    public C49085d23 f125186o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46466r(C64488kb1 kb12, int i) {
        super(i);
        C87412m.m108594g(kb12, "songInfo");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5292;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivegetsongstatus";
        bVar.f127066a = new C48944c23();
        bVar.f127067b = new C49085d23();
        C47350c a = bVar.mo72403a();
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetSongStatusReq");
        C48944c23 c232 = (C48944c23) aVar;
        c232.f131466d = kb12.f183909i;
        c232.f131467e = kb12.f183907g;
        c232.f131468f = kb12.f183908h;
        c232.f131469g = kb12;
        this.f125185n = a;
        Log.m105924i("MicroMsg.Mv.NetSceneMusicMvGetSongStatus", "create NetSceneMusicMvGetSongStatus " + kb12.f183909i + ' ' + kb12.f183904d + ' ' + kb12.f183905e);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125184j = nVar;
        return dispatch(gVar, this.f125185n, this);
    }

    public int getType() {
        return 5292;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i(this.f125183i, "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47350c cVar = this.f125185n;
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetSongStatusResp");
            this.f125186o = (C49085d23) aVar;
            C11385n nVar = this.f125184j;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125184j;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
