package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.C52059y24;
import te3.C52207z24;

/* renamed from: com.tencent.mm.modelsimple.g0 */
public class C1306g0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f10425d;

    /* renamed from: e */
    public final C47350c f10426e;

    public C1306g0(String str, String str2, int i, C51018qv3 qv32) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52059y24();
        bVar.f127067b = new C52207z24();
        bVar.f127068c = "/cgi-bin/micromsg-bin/newsetpasswd";
        bVar.f127069d = 383;
        bVar.f127070e = 180;
        bVar.f127071f = 1000000180;
        C47350c a = bVar.mo72403a();
        this.f10426e = a;
        C52059y24 y242 = (C52059y24) a.f127055a.f127080a;
        y242.f145088d = Util.getCutPasswordMD5(str);
        y242.f145089e = str2;
        y242.f145091g = i;
        y242.f145090f = qv32;
        Log.m105919d("MicroMsg.NetSceneSetPwd", "summersetpwd md5:%s ticket:%s, type:%d, authkey:%s", str, str2, Integer.valueOf(i), Util.dumpHex(C48374j0.m53715d(qv32)));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f10425d = nVar;
        return dispatch(gVar, this.f10426e, this);
    }

    public int getType() {
        return 383;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneSetPwd", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        this.f10425d.onSceneEnd(i2, i3, str, this);
    }
}
