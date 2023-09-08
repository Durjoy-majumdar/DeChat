package ab1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51348t6;
import te3.C51497u6;
import te3.C51650v6;
import te3.C52222z6;

/* renamed from: ab1.b */
public class C39533b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106136d;

    /* renamed from: e */
    public C47350c f106137e;

    /* renamed from: f */
    public int f106138f;

    /* renamed from: g */
    public String f106139g;

    /* renamed from: h */
    public int f106140h;

    /* renamed from: i */
    public C89349b f106141i;

    /* renamed from: j */
    public int f106142j;

    /* renamed from: n */
    public int f106143n;

    /* renamed from: o */
    public int f106144o;

    /* renamed from: p */
    public String f106145p;

    /* renamed from: q */
    public C52222z6 f106146q;

    /* renamed from: r */
    public C51348t6 f106147r;

    /* renamed from: s */
    public int f106148s;

    /* renamed from: t */
    public long f106149t;

    public C39533b(int i, int i2, String str, int i3, int i4, String str2, C52222z6 z6Var, C51348t6 t6Var) {
        this.f106148s = 5000;
        this.f106149t = 0;
        this.f106138f = i;
        this.f106139g = str;
        this.f106140h = i2;
        this.f106144o = i3;
        this.f106143n = i4;
        this.f106146q = z6Var;
        this.f106147r = t6Var;
        this.f106145p = str2;
        Object[] objArr = new Object[7];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i4);
        objArr[4] = Integer.valueOf(i3);
        objArr[5] = Boolean.valueOf(z6Var != null);
        objArr[6] = Boolean.valueOf(t6Var != null ? true : z);
        Log.m105925i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, totalLen=%s, controlType=%s, %s, %s", objArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106136d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 985;
        bVar.f127068c = "/cgi-bin/micromsg-bin/appvoicecontrol";
        bVar.f127066a = new C51497u6();
        bVar.f127067b = new C51650v6();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106137e = a;
        C51497u6 u6Var = (C51497u6) a.f127055a.f127080a;
        u6Var.f142610d = this.f106138f;
        u6Var.f142611e = this.f106139g;
        u6Var.f142612f = this.f106140h;
        u6Var.f142613g = this.f106144o;
        u6Var.f142614h = this.f106146q;
        u6Var.f142615i = this.f106147r;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 985;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0 && uVar != null) {
            Log.m105925i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        } else {
            Log.m105921e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        }
        C11385n nVar = this.f106136d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        } else {
            Log.m105920e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] callback null");
        }
    }

    public C39533b(int i, int i2, String str, int i3, C52222z6 z6Var, C51348t6 t6Var, long j) {
        this.f106148s = 5000;
        this.f106138f = i;
        this.f106139g = str;
        this.f106140h = i2;
        this.f106144o = i3;
        this.f106146q = z6Var;
        this.f106147r = t6Var;
        this.f106149t = j;
        Object[] objArr = new Object[6];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = str;
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        objArr[4] = Boolean.valueOf(z6Var != null);
        objArr[5] = Boolean.valueOf(t6Var != null ? true : z);
        Log.m105925i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, controlType=%s, %s, %s", objArr);
    }
}
