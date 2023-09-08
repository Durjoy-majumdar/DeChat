package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49266ed0;
import te3.C49410fd0;

/* renamed from: ys2.j */
public class C39156j extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f105385d;

    /* renamed from: e */
    public C11385n f105386e;

    /* renamed from: f */
    public String f105387f;

    public C39156j(String str) {
        this.f105387f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49266ed0();
        bVar.f127067b = new C49410fd0();
        bVar.f127068c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_favofficialitem";
        bVar.f127069d = 2874;
        C47350c a = bVar.mo72403a();
        this.f105385d = a;
        ((C49266ed0) a.f127055a.f127080a).f132871d = str;
        Log.m105925i("MicroMsg.NetSceneFavOfficialItem", "Req: item_buff[%s]", str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        this.f105386e = nVar;
        int dispatch = dispatch(gVar, this.f105385d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        return 2874;
    }

    /* renamed from: j1 */
    public String mo61961j1() {
        SnsMethodCalculate.markStartTimeMs("getItemBuff", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        String str = this.f105387f;
        if (str == null) {
            str = "";
        }
        SnsMethodCalculate.markEndTimeMs("getItemBuff", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        return str;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
        Log.m105924i("MicroMsg.NetSceneFavOfficialItem", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        C49410fd0 fd02 = (C49410fd0) ((C47350c) uVar).f127056b.f127083a;
        this.f105386e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneFavOfficialItem");
    }
}
