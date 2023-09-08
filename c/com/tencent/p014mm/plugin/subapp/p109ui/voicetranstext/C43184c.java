package com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import junit.framework.Assert;
import kd0.C60998j;
import kd0.C76537d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p492dn.C75415t;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.ao4;
import te3.it4;
import te3.yn4;
import te3.zn4;

/* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.c */
public class C43184c extends C117747y implements C1311n {

    /* renamed from: d */
    public String f116854d;

    /* renamed from: e */
    public it4 f116855e;

    /* renamed from: f */
    public yn4 f116856f;

    /* renamed from: g */
    public String f116857g;

    /* renamed from: h */
    public int f116858h;

    /* renamed from: i */
    public String f116859i;

    /* renamed from: j */
    public String f116860j;

    /* renamed from: n */
    public C47350c f116861n;

    /* renamed from: o */
    public C11385n f116862o;

    public C43184c(C43184c cVar) {
        this.f116854d = cVar.f116854d;
        this.f116855e = cVar.f116855e;
        this.f116856f = cVar.f116856f;
        this.f116857g = cVar.f116857g;
        this.f116858h = cVar.f116858h;
        this.f116859i = cVar.f116859i;
        this.f116860j = cVar.f116860j;
        Log.m105919d("MicroMsg.NetSceneUploadVoiceForTrans", "alvinluo voiceTrans constructor scene: %d, fromUser: %s, toUser: %s", Integer.valueOf(cVar.f116858h), cVar.f116859i, cVar.f116860j);
        mo67411j1();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C60998j d;
        this.f116862o = nVar;
        if (!(!Util.isNullOrNil(this.f116857g) && !Util.isNullOrNil(this.f116854d) && this.f116856f != null && this.f116855e != null)) {
            Log.m105920e("MicroMsg.NetSceneUploadVoiceForTrans", "doScene: Value not Valid, so, do nothing.");
            return -1;
        }
        zn4 zn4 = (zn4) this.f116861n.f127055a.f127080a;
        zn4.f146142d = this.f116854d;
        zn4.f146143e = this.f116855e;
        yn4 yn4 = this.f116856f;
        zn4.f146144f = yn4;
        String str = this.f116857g;
        int i = yn4.f145424e;
        int i2 = yn4.f145425f;
        C51018qv3 qv32 = new C51018qv3();
        C76537d w202 = ((C75415t) C86312j.m106911c(C75415t.class)).w20(str);
        if (!(w202 == null || (d = w202.mo106771d(i, i2)) == null)) {
            qv32 = C48374j0.m53712a(d.f173719a);
        }
        zn4.f146145g = qv32;
        zn4.f146146h = this.f116858h;
        zn4.f146147i = this.f116859i;
        zn4.f146148j = this.f116860j;
        return dispatch(gVar, this.f116861n, this);
    }

    public int getType() {
        return 547;
    }

    /* renamed from: j1 */
    public final void mo67411j1() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new zn4();
        bVar.f127067b = new ao4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadvoicefortrans";
        bVar.f127069d = 547;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f116861n = bVar.mo72403a();
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        yn4 yn4 = this.f116856f;
        if (yn4 != null) {
            int i4 = yn4.f145425f;
        }
        boolean z = true;
        if (i2 == 0 && i3 == 0) {
            this.f116856f = ((ao4) this.f116861n.f127056b.f127083a).f130700d;
        } else {
            Log.m105919d("MicroMsg.NetSceneUploadVoiceForTrans", "error upload: errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.f116862o.onSceneEnd(i2, i3, str, this);
        yn4 yn42 = this.f116856f;
        if (yn42 == null || yn42.f145425f <= 0) {
            Object[] objArr = new Object[1];
            if (yn42 == null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.NetSceneUploadVoiceForTrans", "succeeed finish: %B", objArr);
        }
    }

    public C43184c(String str, yn4 yn4, int i, String str2) {
        Assert.assertTrue(str2 != null);
        this.f116854d = str;
        this.f116856f = yn4;
        this.f116855e = C43185d.m46749a(i, str2);
        this.f116857g = str2;
        mo67411j1();
    }

    public C43184c(String str, yn4 yn4, int i, String str2, int i2, String str3, String str4) {
        Assert.assertTrue(str2 != null);
        Log.m105919d("MicroMsg.NetSceneUploadVoiceForTrans", "alvinluo voiceTrans scene: %d, fromUser: %s, toUser: %s", Integer.valueOf(i2), str3, str4);
        this.f116854d = str;
        this.f116856f = yn4;
        this.f116855e = C43185d.m46749a(i, str2);
        this.f116857g = str2;
        this.f116858h = i2;
        this.f116859i = str3;
        this.f116860j = str4;
        mo67411j1();
    }
}
