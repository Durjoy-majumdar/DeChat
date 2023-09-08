package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49777i00;
import te3.C51277so3;
import te3.C51425to3;
import te3.uh4;

/* renamed from: s03.e */
public class C48216e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129205d;

    /* renamed from: e */
    public C47350c f129206e;

    public C48216e(uh4 uh4, List<String> list) {
        Log.m105924i("MicroMsg.TopStory.NetSceneTopStoryGetVideoUrl", "Create NetSceneTopStoryGetVideoUrl Video");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2579;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/recommendgetvideourl";
        bVar.f127066a = new C51277so3();
        bVar.f127067b = new C51425to3();
        C47350c a = bVar.mo72403a();
        this.f129206e = a;
        C51277so3 so32 = (C51277so3) a.f127055a.f127080a;
        for (String str : list) {
            C49777i00 i002 = new C49777i00();
            i002.f134994d = str;
            so32.f141657d.add(i002);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129205d = nVar;
        return dispatch(gVar, this.f129206e, this);
    }

    public int getType() {
        return 2579;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryGetVideoUrl", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f129205d.onSceneEnd(i2, i3, str, this);
    }
}
