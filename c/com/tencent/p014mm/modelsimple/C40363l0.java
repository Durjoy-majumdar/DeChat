package com.tencent.p014mm.modelsimple;

import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import tc2.C118418g;
import te3.l85;
import te3.m85;

/* renamed from: com.tencent.mm.modelsimple.l0 */
public class C40363l0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f108468d;

    /* renamed from: e */
    public C11385n f108469e;

    /* renamed from: f */
    public int f108470f = 3;

    public C40363l0(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new l85();
        bVar.f127067b = new m85();
        bVar.f127068c = "/cgi-bin/micromsg-bin/yybgetpkgsig";
        bVar.f127069d = 729;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108468d = a;
        l85 l85 = (l85) a.f127055a.f127080a;
        l85.f137259d = LocaleUtil.getApplicationLanguage();
        l85.f137260e = C118418g.INSTANCE.mo175810Zb(0);
        l85.f137261f = str;
        l85.f137262g = i;
        Log.m105925i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig Language[%s], PkgName[%s], versionCode[%d], stack[%s]", l85.f137259d, str, Integer.valueOf(i), Util.getStack());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108469e = nVar;
        return dispatch(gVar, this.f108468d, this);
    }

    public int getType() {
        return 729;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C47350c cVar = this.f108468d;
        l85 l85 = (l85) cVar.f127055a.f127080a;
        m85 m85 = (m85) cVar.f127056b.f127083a;
        Log.m105925i("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s], ret[%d], sig[%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(m85.f137911d), m85.f137912e);
        if (i4 == 0 && i5 == 0) {
            int i6 = m85.f137911d;
            if (i6 == 2 || i6 == 3) {
                int i7 = this.f108470f - 1;
                this.f108470f = i7;
                if (i7 <= 0) {
                    Log.m105928w("MicroMsg.NetSceneYybGetPkgSig", "summertoken err and return with no try!");
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(322, 2, 1, false);
                    nVar.mo160131h(11098, 4002, String.format("%s,%d", new Object[]{l85.f137261f, Integer.valueOf(l85.f137262g)}));
                    this.f108469e.onSceneEnd(3, -1, "", this);
                    return;
                }
                Log.m105925i("MicroMsg.NetSceneYybGetPkgSig", "summertoken do scene again retryCount:%d", Integer.valueOf(i7));
                doScene(dispatcher(), this.f108469e);
            } else if (i6 == 1) {
                MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "yyb_pkg_sig_prefs", 4).edit().remove(l85.f137261f).commit();
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.idkeyStat(322, 5, 1, false);
                nVar2.mo160131h(11098, Integer.valueOf(WearableStatusCodes.ASSET_UNAVAILABLE), String.format("%s,%d", new Object[]{l85.f137261f, Integer.valueOf(l85.f137262g)}));
                Log.m105925i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no sig[%s] and remove", m85.f137912e);
            } else if (i6 == 4) {
                Log.m105928w("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret no need try and revise");
                C115669n nVar3 = C115669n.INSTANCE;
                nVar3.idkeyStat(322, 4, 1, false);
                nVar3.mo160131h(11098, Integer.valueOf(WearableStatusCodes.INVALID_TARGET_NODE), String.format("%s,%d", new Object[]{l85.f137261f, Integer.valueOf(l85.f137262g)}));
            } else {
                Log.m105925i("MicroMsg.NetSceneYybGetPkgSig", "summertoken ret sig[%s]", m85.f137912e);
                MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "yyb_pkg_sig_prefs", 4).edit().putString(l85.f137261f, m85.f137912e).commit();
                C115669n nVar4 = C115669n.INSTANCE;
                nVar4.idkeyStat(322, 3, 1, false);
                nVar4.mo160131h(11098, Integer.valueOf(WearableStatusCodes.DATA_ITEM_TOO_LARGE), String.format("%s,%d,%s", new Object[]{l85.f137261f, Integer.valueOf(l85.f137262g), m85.f137912e}));
            }
            this.f108469e.onSceneEnd(i4, i5, str2, this);
            return;
        }
        Log.m105928w("MicroMsg.NetSceneYybGetPkgSig", "summertoken YybGetPkgSig err and return!");
        C115669n nVar5 = C115669n.INSTANCE;
        nVar5.idkeyStat(322, 1, 1, false);
        nVar5.mo160131h(11098, 4001, String.format("%s,%d,%d,%d", new Object[]{l85.f137261f, Integer.valueOf(l85.f137262g), Integer.valueOf(i2), Integer.valueOf(i3)}));
        this.f108469e.onSceneEnd(i4, i5, str2, this);
    }
}
