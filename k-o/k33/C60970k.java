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
import te3.nt4;
import te3.sq4;
import te3.tq4;

/* renamed from: k33.k */
public class C60970k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f173656d;

    /* renamed from: e */
    public final C47350c f173657e;

    /* renamed from: f */
    public String f173658f;

    /* renamed from: g */
    public int f173659g = 0;

    /* renamed from: h */
    public boolean f173660h = false;

    /* renamed from: i */
    public boolean f173661i = false;

    /* renamed from: j */
    public int f173662j = 0;

    /* renamed from: n */
    public int f173663n = 0;

    public C60970k(String str, int i, int i2) {
        Log.m105919d("MicroMsg.NetSceneVerifyVoicePrint", "resid %d", Integer.valueOf(i));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new sq4();
        bVar.f127067b = new tq4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/verifyvoiceprint";
        bVar.f127069d = 613;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f173657e = a;
        sq4 sq4 = (sq4) a.f127055a.f127080a;
        this.f173658f = str;
        this.f173659g = 0;
        sq4.f185440f = i;
        this.f173662j = i2;
        sq4.f185439e = i2;
        Log.m105925i("MicroMsg.NetSceneVerifyVoicePrint", "voiceRegist %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f173660h = true;
        mo85943j1();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173656d = nVar;
        return dispatch(gVar, this.f173657e, this);
    }

    public int getType() {
        return 613;
    }

    /* renamed from: j1 */
    public final int mo85943j1() {
        sq4 sq4 = (sq4) this.f173657e.f127055a.f127080a;
        nt4 nt4 = new nt4();
        sq4.f185438d = nt4;
        C76545t tVar = new C76545t(C33823m.m40152a(this.f173658f, false));
        int l = (int) C86013q1.m106451l(C33823m.m40152a(this.f173658f, false));
        int i = this.f173659g;
        C60998j d = l - i >= 6000 ? tVar.mo106771d(i, 6000) : tVar.mo106771d(i, l - i);
        Log.m105919d("MicroMsg.NetSceneVerifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", Integer.valueOf(this.f173659g), Integer.valueOf(d.f173722d), Integer.valueOf(d.f173720b), Integer.valueOf(l), Boolean.valueOf(this.f173660h));
        if (d.f173720b == 0) {
            return -2;
        }
        int i2 = d.f173722d;
        if (i2 < 0) {
            Log.m105929w("MicroMsg.NetSceneVerifyVoicePrint", "readerror %d", Integer.valueOf(i2));
            return -1;
        }
        int i3 = this.f173659g;
        if (i3 >= 469000) {
            Log.m105925i("MicroMsg.NetSceneVerifyVoicePrint", "moffset > maxfile %d", Integer.valueOf(i3));
            return -1;
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(d.f173719a);
        nt4.f184556g = qv32;
        nt4.f184553d = this.f173659g;
        nt4.f184554e = d.f173720b;
        nt4.f184555f = 0;
        sq4.f185439e = this.f173662j;
        if (this.f173660h && d.f173721c >= ((int) C86013q1.m106451l(C33823m.m40152a(this.f173658f, false)))) {
            nt4.f184555f = 1;
            this.f173661i = true;
            Log.m105925i("MicroMsg.NetSceneVerifyVoicePrint", "the last one pack for uploading totallen %d", Integer.valueOf(l));
        }
        this.f173659g = d.f173721c;
        sq4.f185438d = nt4;
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneVerifyVoicePrint", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        tq4 tq4 = (tq4) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 || i3 == 0) {
            int i4 = tq4.f185662f;
            this.f173662j = i4;
            this.f173663n = tq4.f185661e;
            Log.m105925i("MicroMsg.NetSceneVerifyVoicePrint", "voice VoiceTicket %d mResult %d", Integer.valueOf(i4), Integer.valueOf(this.f173663n));
            if (this.f173661i) {
                this.f173656d.onSceneEnd(i2, i3, str, this);
                return;
            }
            Log.m105925i("MicroMsg.NetSceneVerifyVoicePrint", "tryDoScene ret %d", Integer.valueOf(mo85943j1()));
            doScene(dispatcher(), this.f173656d);
            Log.m105924i("MicroMsg.NetSceneVerifyVoicePrint", "loop doscene");
            return;
        }
        this.f173656d.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 240;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
