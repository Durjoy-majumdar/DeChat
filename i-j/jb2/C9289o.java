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
import te3.C50984qn0;
import te3.C51129rn0;

/* renamed from: jb2.o */
public final class C9289o extends C46455a {

    /* renamed from: i */
    public C11385n f29050i;

    /* renamed from: j */
    public final C47350c f29051j;

    /* renamed from: n */
    public C51129rn0 f29052n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9289o(String str, C89349b bVar) {
        super(0, 1, (C8480h) null);
        C87412m.m108594g(str, "finderUserName");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3965;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        bVar2.f127066a = new C50984qn0();
        bVar2.f127067b = new C51129rn0();
        C47350c a = bVar2.mo72403a();
        this.f29051j = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListRequest");
        C50984qn0 qn02 = (C50984qn0) aVar;
        qn02.f140400d = 0;
        qn02.f140401e = str;
        qn02.f140402f = bVar;
        qn02.f140404h = "";
        qn02.f140405i = 0;
        C49842ig0 ig02 = new C49842ig0();
        ig02.f135313e = 93;
        qn02.f140403g = ig02;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f29050i = nVar;
        return dispatch(gVar, this.f29051j, this);
    }

    public int getType() {
        return 3965;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvGetFinderLikeFeed", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f29051j.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
            this.f29052n = (C51129rn0) aVar;
            C11385n nVar = this.f29050i;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f29050i;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
