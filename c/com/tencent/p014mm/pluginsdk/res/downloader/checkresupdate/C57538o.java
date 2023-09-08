package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import te3.C51297su;
import te3.C64297cu3;
import te3.C64690ru;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.o */
public class C57538o extends C115894p implements C57537n {
    public C57538o() {
    }

    public int getType() {
        return 721;
    }

    /* renamed from: j1 */
    public C114799u mo81281j1() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64690ru ruVar = new C64690ru();
        ruVar.f185293d.addAll(this.f347755e);
        if (NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext())) {
            ruVar.f185294e = 1;
        } else {
            ruVar.f185294e = 2;
        }
        bVar.f127066a = ruVar;
        bVar.f127067b = new C51297su();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkresupdate";
        bVar.f127069d = 721;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return bVar.mo72403a();
    }

    /* renamed from: k1 */
    public String mo81282k1() {
        return "MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate";
    }

    /* renamed from: l1 */
    public C51297su mo81283l1(C114799u uVar) {
        return (C51297su) ((C47350c) uVar).f127056b.f127083a;
    }

    public C57538o(int i) {
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%d", Integer.valueOf(i));
        C64297cu3 cu32 = new C64297cu3();
        cu32.f182568d = i;
        ((LinkedList) this.f347755e).clear();
        ((LinkedList) this.f347755e).add(cu32);
    }

    public C57538o(List<Integer> list) {
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%s", list.toString());
        ((LinkedList) this.f347755e).clear();
        for (Integer intValue : list) {
            C64297cu3 cu32 = new C64297cu3();
            cu32.f182568d = intValue.intValue();
            ((LinkedList) this.f347755e).add(cu32);
        }
    }
}
