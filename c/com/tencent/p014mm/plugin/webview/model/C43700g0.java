package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.webview.model.C6054r;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87200o;
import qe3.C89625d;
import te3.C48732al2;
import te3.C48874bl2;
import te3.C50549ni2;
import te3.C51125rl2;
import te3.C51263sl2;

/* renamed from: com.tencent.mm.plugin.webview.model.g0 */
public class C43700g0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f118104d;

    /* renamed from: e */
    public final C47350c f118105e;

    public C43700g0(List<C51263sl2> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48732al2();
        bVar.f127067b = new C48874bl2();
        bVar.f127068c = "/cgi-bin/mmux-bin/jslog";
        bVar.f127069d = 1803;
        C47350c a = bVar.mo72403a();
        this.f118105e = a;
        C48732al2 al22 = (C48732al2) a.f127055a.f127080a;
        C51125rl2 rl22 = new C51125rl2();
        rl22.f141006d = C89625d.f257837c;
        rl22.f141007e = C89625d.f257836b;
        rl22.f141008f = C89625d.f257839e;
        rl22.f141009g = C87200o.f252873f;
        rl22.f141010h = LocaleUtil.getApplicationLanguage();
        rl22.f141011i = (int) (System.currentTimeMillis() / 1000);
        al22.f130618d = rl22;
        al22.f130619e.addAll(list);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f118104d = nVar;
        Log.m105918d("MicroMsg.NetSceneJsLog", "doScene");
        return dispatch(gVar, this.f118105e, this);
    }

    public int getType() {
        return 1803;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneJsLog", "onGYNetEnd, netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            C48874bl2 bl22 = (C48874bl2) ((C47350c) uVar).f127056b.f127083a;
            Log.m105924i("MicroMsg.NetSceneJsLog", "received InvalidLogList: ");
            StringBuilder sb = new StringBuilder("{ ");
            if (Util.isNullOrNil((List) bl22.f131185d)) {
                sb.append("{  }");
            } else {
                Iterator<C50549ni2> it = bl22.f131185d.iterator();
                while (it.hasNext()) {
                    C50549ni2 next = it.next();
                    sb.append(String.format(" { logId(%d), interval(%d) },", new Object[]{Integer.valueOf(next.f138615d), Integer.valueOf(next.f138616e)}));
                }
            }
            sb.append(" }");
            Log.m105924i("MicroMsg.NetSceneJsLog", sb.toString());
            C6054r rVar = C6054r.C6056b.f22352a;
            LinkedList<C50549ni2> linkedList = bl22.f131185d;
            rVar.getClass();
            if (!Util.isNullOrNil((List) linkedList)) {
                for (C50549ni2 next2 : linkedList) {
                    C6080m.yx0().f82406e.set(Integer.valueOf(next2.f138615d), Long.valueOf(Util.nowSecond() + ((long) next2.f138616e)));
                }
                C6080m.yx0().f82406e.appendAll(true);
            }
        }
        this.f118104d.onSceneEnd(i2, i3, str, this);
    }
}
