package w12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49725hm2;
import te3.C49869im2;

/* renamed from: w12.e */
public class C53070e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f148129d;

    /* renamed from: e */
    public final C47350c f148130e;

    public C53070e(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49725hm2 hm22 = new C49725hm2();
        C49869im2 im22 = new C49869im2();
        bVar.f127066a = hm22;
        bVar.f127067b = im22;
        bVar.f127068c = "/cgi-bin/micromsg-bin/kidswatchloginconfirmget";
        bVar.f127069d = 5218;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f148130e = bVar.mo72403a();
        hm22.f134730d = str;
        hm22.f134731e = str2;
        Log.m105919d("MicroMsg.NetSceneKidsWatchLoginConfirmGet", "[NetSceneKidsWatchLoginConfirmGet]loginUrl:%s, deviceName:%s", str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148129d = nVar;
        return dispatch(gVar, this.f148130e, this);
    }

    public int getType() {
        return 5218;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneKidsWatchLoginConfirmGet", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + " errMsg:" + str);
        this.f148129d.onSceneEnd(i2, i3, str, this);
    }
}
