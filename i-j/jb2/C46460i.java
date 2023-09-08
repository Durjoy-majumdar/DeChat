package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50203l13;
import te3.C50338m13;
import te3.C64488kb1;

/* renamed from: jb2.i */
public final class C46460i extends C46455a {

    /* renamed from: i */
    public final String f125154i = "MicroMsg.Mv.NetSceneMusicMvCheckPermission";

    /* renamed from: j */
    public C11385n f125155j;

    /* renamed from: n */
    public C47350c f125156n;

    /* renamed from: o */
    public C50338m13 f125157o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46460i(C64488kb1 kb12, int i) {
        super(i);
        C87412m.m108594g(kb12, "songInfo");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5286;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivecheckpermission";
        bVar.f127066a = new C50203l13();
        bVar.f127067b = new C50338m13();
        C47350c a = bVar.mo72403a();
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveCheckPermissionReq");
        ((C50203l13) aVar).f137129e = kb12;
        this.f125156n = a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125155j = nVar;
        return dispatch(gVar, this.f125156n, this);
    }

    public int getType() {
        return 5286;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i(this.f125154i, "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47350c cVar = this.f125156n;
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveCheckPermissionResp");
            this.f125157o = (C50338m13) aVar;
            C11385n nVar = this.f125155j;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125155j;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
