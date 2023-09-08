package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51045r13;
import te3.C51190s13;

/* renamed from: jb2.g */
public final class C46459g extends C46455a {

    /* renamed from: i */
    public C11385n f125151i;

    /* renamed from: j */
    public final C47350c f125152j;

    /* renamed from: n */
    public final String f125153n = ("MicroMsg.NetSceneMusicInterAction@" + hashCode());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46459g(String str, String str2, int i) {
        super(i);
        C87412m.m108594g(str, "app_name");
        C87412m.m108594g(str2, "entity_id");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 8967;
        bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivegetinteractioninfo";
        bVar.f127066a = new C51045r13();
        bVar.f127067b = new C51190s13();
        C47350c a = bVar.mo72403a();
        this.f125152j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetInteractionInfoReq");
        C51045r13 r132 = (C51045r13) aVar;
        r132.f140661d = str;
        r132.f140662e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125151i = nVar;
        return dispatch(gVar, this.f125152j, this);
    }

    public int getType() {
        return 8967;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C11385n nVar = this.f125151i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        Log.m105925i(this.f125153n, "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
    }
}
