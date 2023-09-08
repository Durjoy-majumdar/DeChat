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
import te3.C51565um0;
import te3.C51710vm0;

/* renamed from: jh2.k */
public final class C9435k extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f29459d;

    /* renamed from: e */
    public C11385n f29460e;

    /* renamed from: f */
    public final String f29461f = "Finder.NetSceneAudioPanelGetFinderFavList";

    public C9435k(C89349b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 3966;
        C51565um0 um02 = new C51565um0();
        um02.f142936f = bVar;
        um02.f142935e = C75592q0.m90778h();
        um02.f142937g = 0;
        C49842ig0 ig02 = new C49842ig0();
        ig02.f135313e = 101;
        um02.f142934d = ig02;
        bVar2.f127066a = um02;
        bVar2.f127069d = 3966;
        bVar2.f127067b = new C51710vm0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetfavlist";
        this.f29459d = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneAudioPanelGetFinderFavList", " init:NetSceneAudioPanelGetFinderFavList " + um02.f142935e);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29460e = nVar;
        return dispatch(gVar, this.f29459d, this);
    }

    public int getType() {
        return 3966;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f29461f, "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f29460e;
        if (nVar != null) {
            C87412m.m108591d(nVar);
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
