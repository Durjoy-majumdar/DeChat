package k33;

import com.tencent.p014mm.modelsimple.C40371t;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C58541s3;
import eb0.C58542t3;
import f40.C86709a0;
import kd0.C60998j;
import kd0.C76545t;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$d;
import te3.C51018qv3;
import te3.nt4;
import te3.uq4;
import te3.vq4;

/* renamed from: k33.i */
public class C60967i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f173644d;

    /* renamed from: e */
    public String f173645e;

    /* renamed from: f */
    public int f173646f = 0;

    /* renamed from: g */
    public final C114799u f173647g;

    /* renamed from: h */
    public boolean f173648h = false;

    /* renamed from: i */
    public boolean f173649i = false;

    /* renamed from: j */
    public int f173650j = 0;

    /* renamed from: n */
    public int f173651n = 0;

    /* renamed from: o */
    public String f173652o = "";

    /* renamed from: k33.i$a */
    public class C60968a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f173653d;

        /* renamed from: k33.i$a$a */
        public class C60969a implements C11385n {
            public C60969a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105919d("MicroMsg.NetSceneRsaVertifyVoicePrint", "summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 && i2 == 0) {
                    C60967i iVar = C60967i.this;
                    iVar.doScene(iVar.dispatcher(), C60967i.this.f173644d);
                    return;
                }
                C60967i iVar2 = C60967i.this;
                iVar2.f173644d.onSceneEnd(i, i2, "", iVar2);
            }
        }

        public C60968a(int i) {
            this.f173653d = i;
        }

        public void run() {
            new C40371t(this.f173653d).doScene(C60967i.this.dispatcher(), new C60969a());
        }
    }

    public C60967i(String str, int i, int i2, String str2) {
        Log.m105919d("MicroMsg.NetSceneRsaVertifyVoicePrint", "resid %d vertifyTicket %s", Integer.valueOf(i), Util.nullAs(str2, ""));
        C60965d dVar = new C60965d();
        this.f173647g = dVar;
        this.f173645e = str;
        this.f173646f = 0;
        uq4 uq4 = ((C58541s3) dVar.getReqObj()).f167581a;
        uq4.f185788f = i;
        uq4.f185789g = str2;
        this.f173650j = i2;
        uq4.f185787e = i2;
        Log.m105925i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voiceRegist %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f173648h = true;
        mo85941j1();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173644d = nVar;
        return dispatch(gVar, this.f173647g, this);
    }

    public int getType() {
        return 617;
    }

    /* renamed from: j1 */
    public final int mo85941j1() {
        C58541s3 s3Var = (C58541s3) this.f173647g.getReqObj();
        nt4 nt4 = new nt4();
        s3Var.f167581a.f185786d = nt4;
        C76545t tVar = new C76545t(C33823m.m40152a(this.f173645e, false));
        int l = (int) C86013q1.m106451l(C33823m.m40152a(this.f173645e, false));
        int i = this.f173646f;
        C60998j d = l - i >= 6000 ? tVar.mo106771d(i, 6000) : tVar.mo106771d(i, l - i);
        Log.m105919d("MicroMsg.NetSceneRsaVertifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", Integer.valueOf(this.f173646f), Integer.valueOf(d.f173722d), Integer.valueOf(d.f173720b), Integer.valueOf(l), Boolean.valueOf(this.f173648h));
        if (d.f173720b == 0) {
            return -2;
        }
        int i2 = d.f173722d;
        if (i2 < 0) {
            Log.m105929w("MicroMsg.NetSceneRsaVertifyVoicePrint", "readerror %d", Integer.valueOf(i2));
            return -1;
        }
        int i3 = this.f173646f;
        if (i3 >= 469000) {
            Log.m105925i("MicroMsg.NetSceneRsaVertifyVoicePrint", "moffset > maxfile %d", Integer.valueOf(i3));
            return -1;
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(d.f173719a);
        nt4.f184556g = qv32;
        nt4.f184553d = this.f173646f;
        nt4.f184554e = d.f173720b;
        nt4.f184555f = 0;
        s3Var.f167581a.f185787e = this.f173650j;
        if (this.f173648h && d.f173721c >= ((int) C86013q1.m106451l(C33823m.m40152a(this.f173645e, false)))) {
            nt4.f184555f = 1;
            this.f173649i = true;
            Log.m105925i("MicroMsg.NetSceneRsaVertifyVoicePrint", "the last one pack for uploading totallen %d", Integer.valueOf(l));
        }
        this.f173646f = d.f173721c;
        s3Var.f167581a.f185786d = nt4;
        return 0;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRsaVertifyVoicePrint", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C58542t3 t3Var = (C58542t3) uVar.getRespObj();
        if (i2 == 4 && i3 == -102) {
            int i4 = uVar.getReqObj().getRsaInfo().f296014c;
            Log.m105919d("MicroMsg.NetSceneRsaVertifyVoicePrint", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", Integer.valueOf(i4));
            C86709a0.m107525e().postToWorker(new C60968a(i4));
        } else if (i2 == 0 || i3 == 0) {
            vq4 vq4 = t3Var.f167582a;
            int i5 = vq4.f185980f;
            this.f173650j = i5;
            this.f173651n = vq4.f185979e;
            this.f173652o = vq4.f185981g;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(i5);
            objArr[1] = Integer.valueOf(this.f173651n);
            objArr[2] = Boolean.valueOf(Util.isNullOrNil(this.f173652o));
            objArr[3] = Integer.valueOf(Util.isNullOrNil(this.f173652o) ? 0 : this.f173652o.length());
            Log.m105925i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voice VoiceTicket %d mResult %d mAuthPwd is null: %b, mAuthPwd.len: %d", objArr);
            if (this.f173649i) {
                this.f173644d.onSceneEnd(i2, i3, str, this);
                return;
            }
            Log.m105925i("MicroMsg.NetSceneRsaVertifyVoicePrint", "tryDoScene ret %d", Integer.valueOf(mo85941j1()));
            doScene(dispatcher(), this.f173644d);
            Log.m105924i("MicroMsg.NetSceneRsaVertifyVoicePrint", "loop doscene");
        } else {
            this.f173644d.onSceneEnd(i2, i3, str, this);
        }
    }

    public int securityLimitCount() {
        return 240;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
