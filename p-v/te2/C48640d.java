package te2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import gy3.C87412m;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49707hh3;
import te3.C49847ih3;
import te3.C50680oh;

/* renamed from: te2.d */
public final class C48640d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f130179d;

    /* renamed from: e */
    public final C47350c f130180e;

    public C48640d(List<? extends C50680oh> list) {
        C87412m.m108594g(list, "biz_reqs");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49707hh3();
        bVar.f127067b = new C49847ih3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/predownload_check";
        bVar.f127069d = 10910;
        C47350c a = bVar.mo72403a();
        this.f130180e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrevDownloadCheckRequest");
        C49707hh3 hh32 = (C49707hh3) aVar;
        if (NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext())) {
            hh32.f134659e = 1;
        }
        for (C50680oh add : list) {
            hh32.f134658d.add(add);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f130179d = nVar;
        return dispatch(gVar, this.f130180e, this);
    }

    public int getType() {
        return 10910;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetScenePredownloadCheck", "onGYNetEnd errType: %s, errCode: %s, errMsg: %s.", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f130179d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
