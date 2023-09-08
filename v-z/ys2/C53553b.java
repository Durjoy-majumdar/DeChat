package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52008xr;
import te3.C52157yr;

/* renamed from: ys2.b */
public class C53553b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150519d;

    /* renamed from: e */
    public C11385n f150520e;

    public C53553b(String str, String str2, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52008xr();
        bVar.f127067b = new C52157yr();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/channelpkginfo";
        bVar.f127069d = 1210;
        C47350c a = bVar.mo72403a();
        this.f150519d = a;
        C52008xr xrVar = (C52008xr) a.f127055a.f127080a;
        xrVar.f144886e = str2;
        xrVar.f144885d = str;
        xrVar.f144887f = ChannelUtil.isGPVersion();
        xrVar.f144888g = z ? 1 : 0;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        this.f150520e = nVar;
        int dispatch = dispatch(gVar, this.f150519d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        int i = this.f150519d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
        C11385n nVar = this.f150520e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdChannelPkgInfo");
    }
}
