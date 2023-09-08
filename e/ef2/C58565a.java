package ef2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50218l52;
import te3.C64484k52;
import te3.C64644q0;

/* renamed from: ef2.a */
public class C58565a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f167639d;

    /* renamed from: e */
    public final C47350c f167640e;

    /* renamed from: f */
    public C50218l52 f167641f;

    /* renamed from: g */
    public String f167642g;

    public C58565a(String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.NetSceneGetOpenUrl", "NetSceneGetOpenUrl username:%s ticket:%s climsgid:%s content:%s ", str, str2, str3, Util.secPrint(str4));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenurl";
        bVar.f127069d = 913;
        bVar.f127066a = new C64484k52();
        bVar.f127067b = new C50218l52();
        C47350c a = bVar.mo72403a();
        this.f167640e = a;
        C64484k52 k522 = (C64484k52) a.f127055a.f127080a;
        k522.f183893d = 1;
        C64644q0 q0Var = new C64644q0();
        q0Var.f184930d = str;
        q0Var.f184931e = str2;
        q0Var.f184932f = str3;
        q0Var.f184933g = str4;
        k522.f183894e = q0Var;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f167639d = nVar;
        return dispatch(gVar, this.f167640e, this);
    }

    public int getType() {
        return 913;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetOpenUrl", "onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f167639d.onSceneEnd(i2, i3, str, this);
        this.f167642g = str;
    }
}
