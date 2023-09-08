package com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50147kl3;
import te3.C50597nv;
import te3.C50736ov;
import te3.it4;
import te3.rt4;
import te3.yn4;

/* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.a */
public class C43182a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f116835d;

    /* renamed from: e */
    public C11385n f116836e;

    /* renamed from: f */
    public String f116837f;

    /* renamed from: g */
    public int f116838g;

    /* renamed from: h */
    public it4 f116839h;

    /* renamed from: i */
    public long f116840i;

    /* renamed from: j */
    public int f116841j;

    /* renamed from: n */
    public String f116842n;

    /* renamed from: o */
    public String f116843o;

    /* renamed from: p */
    public rt4 f116844p;

    /* renamed from: q */
    public int f116845q = -1;

    /* renamed from: r */
    public yn4 f116846r;

    /* renamed from: s */
    public C50147kl3 f116847s;

    /* renamed from: t */
    public int f116848t;

    public C43182a(String str, int i, String str2) {
        mo67409j1(str, i, -1, -1, str2, 0, "", "");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116836e = nVar;
        C47350c cVar = this.f116835d;
        C50597nv nvVar = (C50597nv) cVar.f127055a.f127080a;
        nvVar.f138787d = this.f116837f;
        nvVar.f138788e = this.f116838g;
        nvVar.f138790g = this.f116839h;
        nvVar.f138791h = this.f116840i;
        nvVar.f138792i = this.f116841j;
        nvVar.f138793j = this.f116842n;
        nvVar.f138794n = this.f116843o;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 546;
    }

    /* renamed from: j1 */
    public final void mo67409j1(String str, int i, int i2, long j, String str2, int i3, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50597nv();
        bVar.f127067b = new C50736ov();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkvoicetrans";
        bVar.f127069d = 546;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f116835d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneCheckVoiceTrans", "voiceId:%s, totalLen:%d, encodeType: %d, svrMsgId: %s", str, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j));
        if (i2 >= 0) {
            this.f116839h = C43185d.m46749a(i2, str2);
        }
        if (j > 0) {
            this.f116840i = j;
        }
        this.f116837f = str;
        this.f116838g = i;
        this.f116841j = i3;
        this.f116842n = str3;
        this.f116843o = str4;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C50736ov ovVar = (C50736ov) this.f116835d.f127056b.f127083a;
            if (ovVar != null) {
                this.f116844p = ovVar.f139380e;
                this.f116845q = ovVar.f139379d;
                this.f116846r = ovVar.f139381f;
                this.f116847s = ovVar.f139382g;
                this.f116848t = ovVar.f139383h;
            } else {
                return;
            }
        } else {
            Log.m105925i("MicroMsg.NetSceneCheckVoiceTrans", "end checkVoiceTrans, & errType:%d, errCode:%d, voiceId: %s ", Integer.valueOf(i2), Integer.valueOf(i3), this.f116837f);
        }
        this.f116836e.onSceneEnd(i2, i3, str, this);
    }

    public C43182a(String str, int i, int i2, long j, String str2) {
        mo67409j1(str, i, i2, j, str2, 0, "", "");
    }

    public C43182a(String str, int i, String str2, int i2, String str3, String str4) {
        mo67409j1(str, i, -1, -1, str2, i2, str3, str4);
    }

    public C43182a(String str, int i, int i2, long j, String str2, int i3, String str3, String str4) {
        mo67409j1(str, i, i2, j, str2, i3, str3, str4);
    }
}
