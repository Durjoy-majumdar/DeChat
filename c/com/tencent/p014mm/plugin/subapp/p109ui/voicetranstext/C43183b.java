package com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50147kl3;
import te3.C51085rb2;
import te3.C51221sb2;
import te3.rt4;

/* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.b */
public class C43183b extends C117747y implements C1311n {

    /* renamed from: d */
    public String f116849d;

    /* renamed from: e */
    public C47350c f116850e;

    /* renamed from: f */
    public C11385n f116851f;

    /* renamed from: g */
    public int f116852g = -1;

    /* renamed from: h */
    public rt4 f116853h;

    public C43183b(String str) {
        Assert.assertTrue(!Util.isNullOrNil(str));
        this.f116849d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51085rb2();
        bVar.f127067b = new C51221sb2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getvoicetransres";
        bVar.f127069d = 548;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f116850e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116851f = nVar;
        C47350c cVar = this.f116850e;
        ((C51085rb2) cVar.f127055a.f127080a).f140807d = this.f116849d;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 548;
    }

    /* renamed from: j1 */
    public boolean mo67410j1() {
        rt4 rt4 = this.f116853h;
        return rt4 != null && !Util.isNullOrNil(rt4.f141148f);
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C51221sb2 sb22 = (C51221sb2) this.f116850e.f127056b.f127083a;
            C50147kl3 kl32 = sb22.f141425e;
            if (kl32 != null) {
                this.f116852g = kl32.f136881d;
            }
            this.f116853h = sb22.f141424d;
        } else {
            Log.m105925i("MicroMsg.NetSceneGetVoiceTransRes", "error get: errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.f116851f.onSceneEnd(i2, i3, str, this);
    }
}
