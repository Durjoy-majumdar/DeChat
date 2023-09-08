package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50902q13;
import te3.C64488kb1;
import te3.C64619p13;

/* renamed from: jb2.k */
public final class C60791k extends C46455a {

    /* renamed from: r */
    public static final C60792a f173145r = new C60792a((C8480h) null);

    /* renamed from: i */
    public final C64488kb1 f173146i;

    /* renamed from: j */
    public final int f173147j;

    /* renamed from: n */
    public final int f173148n;

    /* renamed from: o */
    public C11385n f173149o;

    /* renamed from: p */
    public final C47350c f173150p;

    /* renamed from: q */
    public C50902q13 f173151q;

    /* renamed from: jb2.k$a */
    public static final class C60792a {
        public C60792a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C47350c mo85723a(C64619p13 p132) {
            C87412m.m108594g(p132, "request");
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 5904;
            bVar.f127068c = "/cgi-bin/micromsg-bin/musiclivegetbeattrack";
            bVar.f127066a = p132;
            bVar.f127067b = new C50902q13();
            return bVar.mo72403a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60791k(C64488kb1 kb12, int i, int i2, int i3) {
        super(i3);
        C87412m.m108594g(kb12, "songInfo");
        this.f173146i = kb12;
        this.f173147j = i;
        this.f173148n = i2;
        C64619p13 p132 = new C64619p13();
        p132.f184728d = kb12.f183909i;
        p132.f184729e = kb12.f183904d;
        p132.f184730f = kb12.f183905e;
        p132.f184732h = kb12.f183906f;
        p132.f184731g = kb12.f183908h;
        p132.f184733i = i;
        p132.f184734j = kb12;
        this.f173150p = f173145r.mo85723a(p132);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f173149o = nVar;
        return dispatch(gVar, this.f173150p, this);
    }

    public int getType() {
        return 5904;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i("MicroMsg.Mv.NetSceneMusicMvGetBeatTrack", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f173150p.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetBeatTrackResp");
            this.f173151q = (C50902q13) aVar;
            C11385n nVar = this.f173149o;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f173149o;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
