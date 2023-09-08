package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.b25;
import te3.c25;

/* renamed from: s03.a */
public class C48214a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129198d;

    /* renamed from: e */
    public C47350c f129199e;

    /* renamed from: f */
    public long f129200f = System.currentTimeMillis();

    /* renamed from: g */
    public String f129201g;

    public C48214a(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2582;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchwebcomm";
        bVar.f127066a = new b25();
        bVar.f127067b = new c25();
        C47350c a = bVar.mo72403a();
        this.f129199e = a;
        b25 b25 = (b25) a.f127055a.f127080a;
        b25.f130917d = str2;
        b25.f130918e = str;
        this.f129201g = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129198d = nVar;
        return dispatch(gVar, this.f129199e, this);
    }

    public int getType() {
        return 2582;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneSearchWebComm", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f129200f));
        this.f129198d.onSceneEnd(i2, i3, str, this);
    }
}
