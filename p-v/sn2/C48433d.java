package sn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82969i;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C50801p92;
import te3.C50932q92;

/* renamed from: sn2.d */
public class C48433d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129604d;

    /* renamed from: e */
    public C47350c f129605e;

    /* renamed from: f */
    public String f129606f;

    /* renamed from: g */
    public int f129607g;

    public C48433d(String str, int i) {
        this.f129606f = str;
        this.f129607g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129604d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50801p92();
        bVar.f127067b = new C50932q92();
        bVar.f127068c = "/cgi-bin/micromsg-bin/gettvinfo";
        bVar.f127069d = C82969i.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129605e = a;
        C50801p92 p922 = (C50801p92) a.f127055a.f127080a;
        p922.f139663d = this.f129606f;
        p922.f139664e = this.f129607g;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return C82969i.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.scanner.NetSceneGetTVInfo", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        this.f129604d.onSceneEnd(i2, i3, str, this);
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        String str;
        C50801p92 p922 = (C50801p92) ((C47350c) uVar).f127055a.f127080a;
        if (p922.f139664e >= 0 && (str = p922.f139663d) != null && str.length() > 0) {
            return y$$d.EOk;
        }
        Log.m105921e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", Integer.valueOf(p922.f139664e));
        return y$$d.EFailed;
    }
}
