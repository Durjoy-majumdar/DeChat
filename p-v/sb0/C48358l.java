package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48994cf;
import te3.C49136df;

/* renamed from: sb0.l */
public class C48358l extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129460d;

    /* renamed from: e */
    public C47350c f129461e;

    /* renamed from: f */
    public Object f129462f;

    public C48358l(String str, String str2, int i, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48994cf();
        bVar.f127067b = new C49136df();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/bizchatsearchcontact";
        bVar.f127069d = 1364;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129461e = a;
        C48994cf cfVar = (C48994cf) a.f127055a.f127080a;
        cfVar.f131685d = str;
        cfVar.f131686e = str2;
        cfVar.f131687f = i;
        this.f129462f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129460d = nVar;
        Log.m105924i("MicroMsg.NetSceneBizChatSearchContact", "do scene");
        return dispatch(gVar, this.f129461e, this);
    }

    public int getType() {
        return 1364;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneBizChatSearchContact", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129460d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
