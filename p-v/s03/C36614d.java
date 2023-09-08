package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p167hz.C60234g;
import te3.C50106kb2;
import te3.C50239lb2;

/* renamed from: s03.d */
public class C36614d extends C117747y implements C1311n, C60234g {

    /* renamed from: d */
    public C11385n f97344d;

    /* renamed from: e */
    public C47350c f97345e;

    public C36614d(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2830;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/getuserattrbyopenid";
        bVar.f127066a = new C50106kb2();
        bVar.f127067b = new C50239lb2();
        C47350c a = bVar.mo72403a();
        this.f97345e = a;
        ((C50106kb2) a.f127055a.f127080a).f136646d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f97344d = nVar;
        return dispatch(gVar, this.f97345e, this);
    }

    public C50239lb2 getResponse() {
        return (C50239lb2) this.f97345e.f127056b.f127083a;
    }

    public int getType() {
        return 2830;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryGetUsername", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f97344d.onSceneEnd(i2, i3, str, this);
    }
}
