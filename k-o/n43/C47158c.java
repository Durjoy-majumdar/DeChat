package n43;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.fu4;
import te3.gu4;

/* renamed from: n43.c */
public class C47158c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126688d;

    /* renamed from: e */
    public C47350c f126689e;

    public C47158c(int i, String str, int i2, byte[] bArr, byte[] bArr2, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fu4();
        bVar.f127067b = new gu4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/csvoipinvite";
        bVar.f127069d = 823;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126689e = a;
        fu4 fu4 = (fu4) a.f127055a.f127080a;
        fu4.f133691d = i;
        fu4.f133692e = str;
        fu4.f133693f = i2;
        fu4.f133694g = C89349b.m111674a(bArr);
        fu4.f133695h = C89349b.m111674a(bArr2);
        fu4.f133696i = System.currentTimeMillis();
        if (str2 != null && !str2.equals("")) {
            fu4.f133697j = str2;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126688d = nVar;
        return dispatch(gVar, this.f126689e, this);
    }

    public int getType() {
        return 823;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneVoipCSInvite", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f126688d.onSceneEnd(i2, i3, str, this);
    }
}
