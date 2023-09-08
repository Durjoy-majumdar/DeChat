package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48925by1;
import te3.C49064cy1;

/* renamed from: s03.c */
public class C48215c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129202d;

    /* renamed from: e */
    public C47350c f129203e;

    /* renamed from: f */
    public long f129204f = System.currentTimeMillis();

    public C48215c(int i, long j, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2748;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/getcolikeblocklist";
        bVar.f127066a = new C48925by1();
        bVar.f127067b = new C49064cy1();
        C47350c a = bVar.mo72403a();
        this.f129203e = a;
        C48925by1 by12 = (C48925by1) a.f127055a.f127080a;
        by12.f131385d = i;
        by12.f131387f = j;
        by12.f131386e = i2;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryGetBlockList", "request NetSceneTopStoryGetBlockList: %d %d %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129202d = nVar;
        return dispatch(gVar, this.f129203e, this);
    }

    public int getType() {
        return 2748;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryGetBlockList", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f129204f));
        this.f129202d.onSceneEnd(i2, i3, str, this);
    }
}
