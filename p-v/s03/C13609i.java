package s03;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51889wx;
import te3.C52032xx;
import te3.C52179yx;

/* renamed from: s03.i */
public class C13609i extends C117747y implements C1311n {

    /* renamed from: d */
    public long f38562d;

    /* renamed from: e */
    public C11385n f38563e;

    /* renamed from: f */
    public C47350c f38564f;

    /* renamed from: g */
    public List<String> f38565g;

    /* renamed from: h */
    public List<Integer> f38566h;

    /* renamed from: i */
    public int f38567i = 0;

    public C13609i(C13609i iVar) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "copy NetSceneTopStorySetBlockList", Integer.valueOf(iVar.f38565g.size()), Integer.valueOf(iVar.f38566h.size()));
        this.f38567i = iVar.f38567i;
        mo13003j1(iVar.f38565g, iVar.f38566h);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f38563e = nVar;
        return dispatch(gVar, this.f38564f, this);
    }

    public int getType() {
        return 2859;
    }

    /* renamed from: j1 */
    public final void mo13003j1(List<String> list, List<Integer> list2) {
        this.f38562d = System.currentTimeMillis();
        this.f38565g = list;
        this.f38566h = list2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2859;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/colikeblock";
        bVar.f127066a = new C51889wx();
        bVar.f127067b = new C52179yx();
        C47350c a = bVar.mo72403a();
        this.f38564f = a;
        C51889wx wxVar = (C51889wx) a.f127055a.f127080a;
        for (int i = 0; i < list.size(); i++) {
            C52032xx xxVar = new C52032xx();
            xxVar.f145009d = list2.get(i).intValue();
            xxVar.f145010e = list.get(i);
            wxVar.f144330d.add(xxVar);
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f38562d));
        this.f38563e.onSceneEnd(i2, i3, str, this);
    }

    public C13609i(List<String> list, List<Integer> list2) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "create NetSceneTopStorySetBlockList, users size:%s, type size:%s", Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
        mo13003j1(list, list2);
    }
}
