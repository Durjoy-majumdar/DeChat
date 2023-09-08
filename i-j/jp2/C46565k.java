package jp2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87200o;
import qe3.C89625d;
import te3.C50481n2;
import te3.C50624o2;
import te3.C51125rl2;
import te3.C51263sl2;

/* renamed from: jp2.k */
public class C46565k extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f125457d;

    /* renamed from: e */
    public C11385n f125458e;

    /* renamed from: f */
    public List<C51263sl2> f125459f;

    public C46565k(List<C51263sl2> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        this.f125459f = list;
        bVar.f127066a = new C50481n2();
        bVar.f127067b = new C50624o2();
        bVar.f127068c = "/cgi-bin/mmux-bin/adlog";
        bVar.f127069d = 1802;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125457d = a;
        C50481n2 n2Var = (C50481n2) a.f127055a.f127080a;
        C51125rl2 rl22 = new C51125rl2();
        rl22.f141006d = C89625d.f257837c;
        rl22.f141007e = C89625d.f257836b;
        rl22.f141008f = C89625d.f257839e;
        rl22.f141009g = C87200o.f252873f;
        rl22.f141010h = LocaleUtil.getApplicationLanguage();
        rl22.f141011i = (int) (System.currentTimeMillis() / 1000);
        n2Var.f138335d = rl22;
        for (int i = 0; i < list.size(); i++) {
            n2Var.f138336e.add(list.get(i));
        }
        Log.m105924i("MicroMsg.NetSceneAdLog", "report count: " + n2Var.f138336e.size());
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        this.f125458e = nVar;
        int dispatch = dispatch(gVar, this.f125457d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        return 1802;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
        Log.m105918d("MicroMsg.NetSceneAdLog", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            int i4 = ((C50624o2) ((C47350c) uVar).f127056b.f127083a).f138910d;
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.BUSINESS_SNS_ADLOG_FREQUENCY_INT, Integer.valueOf(i4));
        }
        this.f125458e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdLog");
    }
}
