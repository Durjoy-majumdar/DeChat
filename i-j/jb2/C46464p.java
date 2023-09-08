package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import qc0.C101106m;
import te3.C51330t13;
import te3.C51480u13;
import te3.C51630v13;

/* renamed from: jb2.p */
public final class C46464p extends C46455a {

    /* renamed from: i */
    public C11385n f125174i;

    /* renamed from: j */
    public final C47350c f125175j;

    /* renamed from: n */
    public C51330t13 f125176n;

    /* renamed from: o */
    public C51630v13 f125177o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46464p(C101106m mVar, int i) {
        super(i);
        C87412m.m108594g(mVar, "wrapper");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6448;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivegetjoinmembershipinfo";
        bVar.f127066a = new C51330t13();
        bVar.f127067b = new C51630v13();
        C47350c a = bVar.mo72403a();
        this.f125175j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetJoinMembershipInfoReq");
        this.f125176n = (C51330t13) aVar;
        C51480u13 u132 = new C51480u13();
        u132.f142552d = mVar.f295972t;
        u132.f142553e = mVar.f295954P;
        C51330t13 t132 = this.f125176n;
        if (t132 != null) {
            t132.f141902d = u132;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125174i = nVar;
        return dispatch(gVar, this.f125175j, this);
    }

    public int getType() {
        return 6448;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvGetJoinMemberShip", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125175j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetJoinMembershipInfoResp");
            this.f125177o = (C51630v13) aVar;
            C11385n nVar = this.f125174i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125174i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
