package jb2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import hb2.C32798c;
import hb2.C32799i;
import hb2.C8505d;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49867im0;
import te3.C50008jm0;
import tf0.C64916p1;

/* renamed from: jb2.n */
public final class C46463n extends C46455a {

    /* renamed from: i */
    public final long f125167i;

    /* renamed from: j */
    public final String f125168j;

    /* renamed from: n */
    public final int f125169n;

    /* renamed from: o */
    public final String f125170o;

    /* renamed from: p */
    public C11385n f125171p;

    /* renamed from: q */
    public final C47350c f125172q;

    /* renamed from: r */
    public C50008jm0 f125173r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46463n(long j, String str, int i, int i2) {
        super(i2);
        C87412m.m108594g(str, "nonceId");
        this.f125167i = j;
        this.f125168j = str;
        this.f125169n = i;
        String str2 = "MicroMsg.NetSceneMusicMvGetFinderFeedDetail@" + hashCode();
        this.f125170o = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3763;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetcommentdetail";
        bVar.f127066a = new C49867im0();
        bVar.f127067b = new C50008jm0();
        C47350c a = bVar.mo72403a();
        this.f125172q = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentDetailRequest");
        C49867im0 im02 = (C49867im0) aVar;
        im02.f135478d = j;
        im02.f135488q = str;
        im02.f135480f = 1;
        im02.f135497z = ((C64916p1) C86312j.m106911c(C64916p1.class)).Na0();
        Log.m105925i(str2, "FinderGetCommentDetail feedId:%s, nonceId:%s", Long.valueOf(j), str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f125171p = nVar;
        return dispatch(gVar, this.f125172q, this);
    }

    public int getType() {
        return 3763;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
        Log.m105925i(this.f125170o, "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f125172q.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentDetailResponse");
            this.f125173r = (C50008jm0) aVar;
            C50008jm0 jm02 = new C50008jm0();
            C50008jm0 jm03 = this.f125173r;
            jm02.parseFrom(jm03 != null ? jm03.toByteArray() : null);
            C32799i iVar = C32799i.f89226a;
            long j = this.f125167i;
            String str2 = this.f125168j;
            iVar.getClass();
            C87412m.m108594g(str2, "nonceId");
            if (C32799i.f89227b) {
                long currentTicks = Util.currentTicks();
                Log.m105924i("MicroMsg.Mv.MusicMvCgiRetCache", "putFinderFeedDetail, feedId:" + j + ", nonceId:" + str2 + ", response:" + jm02.hashCode() + ",timestamp:" + currentTicks);
                C32799i.f89228c.put(new C8505d(j, str2), new C32798c(jm02, currentTicks));
                iVar.mo58806a(currentTicks);
            }
            C11385n nVar = this.f125171p;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        C11385n nVar2 = this.f125171p;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
