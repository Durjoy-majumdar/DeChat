package jh2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49842ig0;
import te3.C50984qn0;
import te3.C51129rn0;

/* renamed from: jh2.l */
public final class C9436l extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f29462d;

    /* renamed from: e */
    public C11385n f29463e;

    /* renamed from: f */
    public final String f29464f = "Finder.NetSceneAudioPanelGetFinderLikedList";

    public C9436l(C89349b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3965;
        C50984qn0 qn02 = new C50984qn0();
        qn02.f140400d = 0;
        qn02.f140402f = bVar;
        qn02.f140401e = C75592q0.m90778h();
        qn02.f140404h = "";
        qn02.f140405i = 0;
        C49842ig0 ig02 = new C49842ig0();
        ig02.f135313e = 101;
        qn02.f140403g = ig02;
        bVar2.f127066a = qn02;
        bVar2.f127069d = 3965;
        bVar2.f127067b = new C51129rn0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        this.f29462d = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneAudioPanelGetFinderLikedList", " init:NetSceneAudioPanelGetFinderLikedList " + qn02.f140401e);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29463e = nVar;
        return dispatch(gVar, this.f29462d, this);
    }

    public int getType() {
        return 3965;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f29464f, "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f29463e;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
