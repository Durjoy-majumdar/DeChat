package je0;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p239sv.C13784j;
import pe3.C47465a;
import pe3.C89349b;
import te3.C64307d73;
import te3.C64352ey3;
import te3.C64380fy3;
import te3.C77917dy3;
import xk0.C91263b;

/* renamed from: je0.u */
public class C60794u extends C117747y implements C1311n, C13784j {

    /* renamed from: d */
    public C11385n f173153d;

    /* renamed from: e */
    public final C47350c f173154e;

    /* renamed from: f */
    public String f173155f;

    /* renamed from: g */
    public C77917dy3 f173156g;

    /* renamed from: h */
    public String f173157h;

    /* renamed from: i */
    public C64380fy3 f173158i;

    public C60794u(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64352ey3();
        bVar.f127067b = new C64380fy3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        bVar.f127069d = C91263b.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f173154e = a;
        Log.m105925i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", this.f173155f);
        C64352ey3 ey32 = (C64352ey3) a.f127055a.f127080a;
        ey32.f183051d = "";
        ey32.f183052e = str;
        ey32.f183053f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173153d = nVar;
        return dispatch(gVar, this.f173154e, this);
    }

    public C114799u getReqResp() {
        return this.f173154e;
    }

    public int getType() {
        return C91263b.CTRL_INDEX;
    }

    /* renamed from: i0 */
    public C47350c mo13143i0() {
        return this.f173154e;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C47465a aVar = this.f173154e.f127056b.f127083a;
        if (aVar instanceof C64380fy3) {
            this.f173158i = (C64380fy3) aVar;
        }
        if (i2 == 0 && i3 == 0) {
            this.f173156g = ((C64380fy3) aVar).f183254d;
            C68097n nVar = new C68097n();
            C77917dy3 dy32 = this.f173156g;
            nVar.f195728a = dy32.f227190d;
            nVar.f195732e = dy32.f227195i;
            nVar.f195731d = dy32.f227196j;
            nVar.f195736i = -1;
            Log.m105919d("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd search setImageFlag %s b[%s] s[%s]", nVar.mo93598g(), nVar.mo93594c(), nVar.mo93597f());
            nVar.f195729b = 3;
            nVar.f195733f = 1;
            C68102u.zx0().mo93608Yt(nVar);
            this.f173153d.onSceneEnd(i2, i3, str, this);
            return;
        }
        if (i2 == 4 && i3 == -2034) {
            this.f173157h = ((C64380fy3) aVar).f183255e;
        }
        this.f173153d.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: t */
    public C77917dy3 mo13144t() {
        return this.f173156g;
    }

    /* renamed from: y0 */
    public String mo13145y0() {
        return this.f173157h;
    }

    public C60794u(String str, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64352ey3();
        bVar.f127067b = new C64380fy3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        bVar.f127069d = C91263b.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f173154e = a;
        Log.m105925i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", str);
        C64352ey3 ey32 = (C64352ey3) a.f127055a.f127080a;
        if (z) {
            ey32.f183054g = str;
            return;
        }
        this.f173155f = str;
        ey32.f183051d = str;
    }

    public C60794u(String str, boolean z, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64352ey3();
        bVar.f127067b = new C64380fy3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        bVar.f127069d = C91263b.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f173154e = a;
        Log.m105925i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", str);
        C64352ey3 ey32 = (C64352ey3) a.f127055a.f127080a;
        if (z) {
            ey32.f183054g = str;
            ey32.f183057j = i;
            return;
        }
        this.f173155f = str;
        ey32.f183051d = str;
        ey32.f183057j = i;
    }

    public C60794u(String str, boolean z, C64307d73 d732) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64352ey3();
        bVar.f127067b = new C64380fy3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        bVar.f127069d = C91263b.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f173154e = a;
        Log.m105925i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s] finderUserName=%s ,scene=%s", str, d732.f182645e, Integer.valueOf(d732.f182644d));
        C64352ey3 ey32 = (C64352ey3) a.f127055a.f127080a;
        ey32.f183055h = d732;
        if (z) {
            ey32.f183054g = str;
            return;
        }
        this.f173155f = str;
        ey32.f183051d = str;
    }

    public C60794u(String str, int i, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64352ey3();
        bVar.f127067b = new C64380fy3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        bVar.f127069d = C91263b.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f173154e = a;
        Log.m105924i("MicroMsg.NetSceneSearchOpenIMContact", "new with: url = [" + str + "], scene = [" + i + "], spamContext = [" + bArr + "]");
        C64352ey3 ey32 = (C64352ey3) a.f127055a.f127080a;
        ey32.f183056i = str;
        ey32.f183057j = i;
        if (bArr != null) {
            ey32.f183058n = C89349b.m111674a(bArr);
        }
    }

    public C60794u(C64352ey3 ey32) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ey32;
        bVar.f127067b = new C64380fy3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        bVar.f127069d = C91263b.CTRL_INDEX;
        this.f173154e = bVar.mo72403a();
    }
}
