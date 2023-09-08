package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51319sz3;
import te3.C51470tz3;

/* renamed from: xm2.s */
public class C53388s extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150226d;

    /* renamed from: e */
    public final C47350c f150227e;

    public C53388s(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51319sz3();
        bVar.f127067b = new C51470tz3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendfeedback";
        bVar.f127069d = 153;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150227e = a;
        C51319sz3 sz32 = (C51319sz3) a.f127055a.f127080a;
        sz32.f141851d = str;
        sz32.f141852e = str2;
        sz32.f141853f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150226d = nVar;
        return dispatch(gVar, this.f150227e, this);
    }

    public int getType() {
        return 153;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSendSceneFeedBack", "onGYNetEnd type:" + i2 + " code:" + i3);
        this.f150226d.onSceneEnd(i2, i3, str, this);
    }
}
