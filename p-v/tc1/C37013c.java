package tc1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51491u4;
import te3.C51642v4;

/* renamed from: tc1.c */
public class C37013c extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f98131d;

    /* renamed from: e */
    public C11385n f98132e;

    public C37013c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51491u4();
        bVar.f127067b = new C51642v4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/androidfcmreg";
        bVar.f127069d = 216;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f98131d = a;
        C51491u4 u4Var = (C51491u4) a.f127055a.f127080a;
        u4Var.f142583d = str;
        u4Var.f142584e = 1;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f98132e = nVar;
        return dispatch(gVar, this.f98131d, this);
    }

    public int getType() {
        return 216;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.FCM.NetSceneFcmReg", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        this.f98132e.onSceneEnd(i2, i3, str, this);
    }
}
