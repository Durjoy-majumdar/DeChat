package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p749xh.C53334e0;
import te3.C48778ay;
import te3.C64786vx;
import te3.C64898zx;

/* renamed from: s03.g */
public class C63690g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f180545d;

    /* renamed from: e */
    public C47350c f180546e;

    /* renamed from: f */
    public long f180547f = System.currentTimeMillis();

    public C63690g(long j, String str, String str2, String str3, C53334e0 e0Var, String str4) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryPostHaokan", "Create NetSceneTopStoryPostVideo ts:%s, extInfo:%s, comment:%s, requestId:%s, appVersion:%s", Long.valueOf(j), str, str2, str3, str4);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2534;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/colikepost";
        bVar.f127066a = new C64898zx();
        bVar.f127067b = new C48778ay();
        C47350c a = bVar.mo72403a();
        this.f180546e = a;
        C64898zx zxVar = (C64898zx) a.f127055a.f127080a;
        zxVar.f186894d = j;
        zxVar.f186895e = str;
        zxVar.f186896f = str2;
        zxVar.f186897g = str3;
        C64786vx vxVar = new C64786vx();
        zxVar.f186898h = vxVar;
        vxVar.f185999e = e0Var.field_appName;
        vxVar.f185998d = e0Var.field_appId;
        vxVar.f186000f = str4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f180545d = nVar;
        return dispatch(gVar, this.f180546e, this);
    }

    public int getType() {
        return 2534;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryPostHaokan", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f180547f));
        this.f180545d.onSceneEnd(i2, i3, str, this);
    }
}
