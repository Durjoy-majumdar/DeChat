package k33;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import kd0.C60998j;
import kd0.C76545t;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C51018qv3;
import te3.C64562mq3;
import te3.C64590nq3;
import te3.nt4;

/* renamed from: k33.g */
public class C60966g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f173635d;

    /* renamed from: e */
    public final C47350c f173636e;

    /* renamed from: f */
    public String f173637f;

    /* renamed from: g */
    public int f173638g = 0;

    /* renamed from: h */
    public boolean f173639h = false;

    /* renamed from: i */
    public boolean f173640i = false;

    /* renamed from: j */
    public int f173641j = 0;

    /* renamed from: n */
    public int f173642n = 0;

    /* renamed from: o */
    public int f173643o = 0;

    public C60966g(String str, int i, int i2, int i3) {
        Log.m105919d("MicroMsg.NetSceneRegisterVoicePrint", "step %d resid %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f173642n = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64562mq3();
        bVar.f127067b = new C64590nq3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/registervoiceprint";
        bVar.f127069d = 612;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f173636e = a;
        C64562mq3 mq32 = (C64562mq3) a.f127055a.f127080a;
        this.f173637f = str;
        this.f173638g = 0;
        mq32.f184379g = i2;
        mq32.f184376d = i;
        this.f173641j = i3;
        mq32.f184377e = i3;
        Log.m105925i("MicroMsg.NetSceneRegisterVoicePrint", "voiceRegist %d %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f173639h = true;
        mo85940j1();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173635d = nVar;
        return dispatch(gVar, this.f173636e, this);
    }

    public int getType() {
        return 612;
    }

    /* renamed from: j1 */
    public final int mo85940j1() {
        C64562mq3 mq32 = (C64562mq3) this.f173636e.f127055a.f127080a;
        nt4 nt4 = new nt4();
        mq32.f184378f = nt4;
        C76545t tVar = new C76545t(C33823m.m40152a(this.f173637f, false));
        int l = (int) C86013q1.m106451l(C33823m.m40152a(this.f173637f, false));
        int i = this.f173638g;
        C60998j d = l - i >= 6000 ? tVar.mo106771d(i, 6000) : tVar.mo106771d(i, l - i);
        Log.m105919d("MicroMsg.NetSceneRegisterVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", Integer.valueOf(this.f173638g), Integer.valueOf(d.f173722d), Integer.valueOf(d.f173720b), Integer.valueOf(l), Boolean.valueOf(this.f173639h));
        if (d.f173720b == 0) {
            return -2;
        }
        int i2 = d.f173722d;
        if (i2 < 0) {
            Log.m105929w("MicroMsg.NetSceneRegisterVoicePrint", "readerror %d", Integer.valueOf(i2));
            return -1;
        }
        int i3 = this.f173638g;
        if (i3 >= 469000) {
            Log.m105925i("MicroMsg.NetSceneRegisterVoicePrint", "moffset > maxfile %d", Integer.valueOf(i3));
            return -1;
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(d.f173719a);
        nt4.f184556g = qv32;
        nt4.f184553d = this.f173638g;
        nt4.f184554e = d.f173720b;
        nt4.f184555f = 0;
        mq32.f184377e = this.f173641j;
        if (this.f173639h && d.f173721c >= ((int) C86013q1.m106451l(C33823m.m40152a(this.f173637f, false)))) {
            nt4.f184555f = 1;
            this.f173640i = true;
            Log.m105925i("MicroMsg.NetSceneRegisterVoicePrint", "the last one pack for uploading totallen %d", Integer.valueOf(l));
        }
        this.f173638g = d.f173721c;
        mq32.f184378f = nt4;
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRegisterVoicePrint", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C64590nq3 nq32 = (C64590nq3) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 || i3 == 0) {
            Log.m105925i("MicroMsg.NetSceneRegisterVoicePrint", "voice ticket %d ret %d nextstep %d %d ", Integer.valueOf(nq32.f184540g), Integer.valueOf(nq32.f184537d), Integer.valueOf(nq32.f184538e), Integer.valueOf(nq32.f184537d));
            this.f173641j = nq32.f184540g;
            this.f173643o = nq32.f184537d;
            if (this.f173640i) {
                this.f173635d.onSceneEnd(i2, i3, str, this);
                return;
            }
            Log.m105925i("MicroMsg.NetSceneRegisterVoicePrint", "tryDoScene ret %d", Integer.valueOf(mo85940j1()));
            doScene(dispatcher(), this.f173635d);
            Log.m105924i("MicroMsg.NetSceneRegisterVoicePrint", "loop doscene");
            return;
        }
        this.f173635d.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 240;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
