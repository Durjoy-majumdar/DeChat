package v53;

import android.net.Uri;
import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64592nu;
import te3.C77966mu;

/* renamed from: v53.d */
public class C78339d extends C75123k0 {

    /* renamed from: d */
    public C11385n f229546d;

    /* renamed from: e */
    public C47350c f229547e;

    public C78339d(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77966mu();
        bVar.f127067b = new C64592nu();
        bVar.f127068c = "/cgi-bin/mmpay-bin/checkpayjsapi";
        bVar.f127069d = 580;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f229547e = a;
        C77966mu muVar = (C77966mu) a.f127055a.f127080a;
        muVar.f227827d = str;
        muVar.f227829f = str2;
        muVar.f227828e = str3;
        muVar.f227830g = str4;
        muVar.f227832i = str5;
        muVar.f227831h = str6;
        muVar.f227833j = str7;
        muVar.f227834n = i;
        muVar.f227835o = C113146l.m154805c();
        if (C75133p0.f221064a) {
            muVar.f227836p = C75133p0.f221066c;
        }
        muVar.f227839s = 1;
        muVar.f227841u = str8;
        muVar.f227840t = i2;
        Log.m105925i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, url: %s, jsapiScene: %s", str, str7, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f229546d = nVar;
        return dispatch(gVar, this.f229547e, this);
    }

    public int getType() {
        return 580;
    }

    /* renamed from: j1 */
    public String mo108331j1() {
        return ((C64592nu) this.f229547e.f127056b.f127083a).f184561h;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        StringBuilder sb = new StringBuilder();
        sb.append("errType:");
        sb.append(i4);
        sb.append(",errCode:");
        sb.append(i5);
        sb.append(",errMsg");
        String str3 = str;
        sb.append(str3);
        Log.m105918d("MicroMsg.NetSceneCheckPayJsapi", sb.toString());
        if (i4 == 0 && i5 == 0) {
            C47350c cVar = (C47350c) uVar;
            C64592nu nuVar = (C64592nu) cVar.f127056b.f127083a;
            Log.m105924i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + nuVar.f184557d + " resp.ErrMsg is " + nuVar.f184558e);
            C77966mu muVar = (C77966mu) cVar.f127055a.f127080a;
            String str4 = muVar.f227833j;
            if (str4 != null) {
                String queryParameter = Uri.parse(str4).getQueryParameter("appid");
                if (queryParameter != muVar.f227827d) {
                    C115669n.INSTANCE.mo160131h(14954, nuVar.f184561h, "", Integer.valueOf(muVar.f227834n), muVar.f227841u, muVar.f227827d, Integer.valueOf(muVar.f227839s), Integer.valueOf(muVar.f227840t), muVar.f227833j, queryParameter);
                } else {
                    C115669n.INSTANCE.mo160131h(14954, nuVar.f184561h, "", Integer.valueOf(muVar.f227834n), muVar.f227841u, muVar.f227827d, Integer.valueOf(muVar.f227839s), Integer.valueOf(muVar.f227840t), muVar.f227833j);
                }
            } else if (!(muVar.f227837q == null || muVar.f227838r == null)) {
                C115669n.INSTANCE.mo160131h(14954, nuVar.f184561h, "", Integer.valueOf(muVar.f227834n), muVar.f227841u, muVar.f227827d, Integer.valueOf(muVar.f227839s), Integer.valueOf(muVar.f227840t), muVar.f227838r, muVar.f227837q);
            }
            Log.m105924i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + nuVar.f184557d + " resp.ErrMsg is " + nuVar.f184558e);
            str2 = nuVar.f184558e;
        } else {
            str2 = str3;
        }
        this.f229546d.onSceneEnd(i4, i5, str2, this);
    }

    public C78339d(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77966mu();
        bVar.f127067b = new C64592nu();
        bVar.f127068c = "/cgi-bin/mmpay-bin/checkpayjsapi";
        bVar.f127069d = 580;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f229547e = a;
        C77966mu muVar = (C77966mu) a.f127055a.f127080a;
        muVar.f227827d = str;
        muVar.f227829f = str2;
        muVar.f227828e = str3;
        muVar.f227830g = str4;
        muVar.f227832i = str5;
        muVar.f227831h = str6;
        muVar.f227834n = i;
        muVar.f227837q = str7;
        muVar.f227838r = str8;
        muVar.f227839s = 2;
        muVar.f227841u = str9;
        muVar.f227840t = i2;
        muVar.f227835o = C113146l.m154805c();
        if (C75133p0.f221064a) {
            muVar.f227836p = C75133p0.f221066c;
        }
        Log.m105925i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, UserName: %s, path: %s", str, str7, str8);
    }
}
