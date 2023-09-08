package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49842ig0;
import te3.C51565um0;
import te3.C51710vm0;

/* renamed from: jb2.m */
public final class C9288m extends C46455a {

    /* renamed from: i */
    public C11385n f29047i;

    /* renamed from: j */
    public final C47350c f29048j;

    /* renamed from: n */
    public C51710vm0 f29049n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9288m(String str, C89349b bVar) {
        super(0, 1, (C8480h) null);
        C87412m.m108594g(str, "finderUserName");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3966;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfavlist";
        bVar2.f127066a = new C51565um0();
        bVar2.f127067b = new C51710vm0();
        C47350c a = bVar2.mo72403a();
        this.f29048j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest");
        C51565um0 um02 = (C51565um0) aVar;
        um02.f142935e = str;
        um02.f142936f = bVar;
        um02.f142937g = 0;
        C49842ig0 ig02 = new C49842ig0();
        ig02.f135313e = 93;
        um02.f142934d = ig02;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f29047i = nVar;
        return dispatch(gVar, this.f29048j, this);
    }

    public int getType() {
        return 3966;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvGetFinderFavFeed", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29048j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            this.f29049n = (C51710vm0) aVar;
            C11385n nVar = this.f29047i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f29047i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
