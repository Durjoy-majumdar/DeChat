package s03;

import android.os.Build;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49768hy;
import te3.p25;
import te3.q25;
import te3.uh4;
import te3.xh4;
import u73.C101987v0;

/* renamed from: s03.h */
public class C22290h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f63192d;

    /* renamed from: e */
    public C47350c f63193e;

    /* renamed from: f */
    public xh4 f63194f;

    public C22290h(uh4 uh4, int i, int i2, xh4 xh4, long j) {
        uh4 uh42 = uh4;
        xh4 xh42 = xh4;
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryRelevantVideo", "Create NetSceneTopStoryVideo %s %s %s", uh42.f64648r, uh42.f64643j, Long.valueOf(j));
        this.f63194f = xh42;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1943;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/mmwebrecommend";
        bVar.f127066a = new p25();
        bVar.f127067b = new q25();
        C47350c a = bVar.mo72403a();
        this.f63193e = a;
        p25 p25 = (p25) a.f127055a.f127080a;
        p25.f64379d = uh42.f64649s;
        p25.f64380e = C43471q.m46977a(1);
        p25.f64382g = uh42.f64644n;
        p25.f64383h = C101987v0.m134273g();
        p25.f64384i = uh42.f64642i;
        p25.f64385j = uh42.f64643j;
        p25.f64388p.addAll(uh42.f64647q);
        Iterator<C49768hy> it = p25.f64388p.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C49768hy next = it.next();
            if (next.f134951d.equals("relevant_vid")) {
                next.f134953f = xh42.f64729h;
                break;
            }
        }
        C49768hy hyVar = new C49768hy();
        hyVar.f134951d = "relevant_vid";
        hyVar.f134953f = xh42.f64729h;
        p25.f64388p.add(hyVar);
        p25.f64391s = (int) uh42.f64641h;
        p25.f64395w = i;
        p25.f64396x = i2;
        C49768hy hyVar2 = new C49768hy();
        hyVar2.f134951d = "client_system_version";
        hyVar2.f134952e = (long) Build.VERSION.SDK_INT;
        p25.f64388p.add(hyVar2);
        C49768hy hyVar3 = new C49768hy();
        hyVar3.f134951d = DownloadInfo.NETTYPE;
        hyVar3.f134953f = C43471q.m46979c();
        p25.f64388p.add(hyVar3);
        C49768hy hyVar4 = new C49768hy();
        hyVar4.f134951d = "client_request_time";
        hyVar4.f134953f = String.valueOf(System.currentTimeMillis());
        p25.f64388p.add(hyVar4);
        C49768hy hyVar5 = new C49768hy();
        hyVar5.f134951d = "relevant_play_time";
        hyVar5.f134953f = String.valueOf(j);
        hyVar5.f134952e = j;
        p25.f64388p.add(hyVar5);
        Iterator<C49768hy> it4 = p25.f64388p.iterator();
        while (it4.hasNext()) {
            C49768hy next2 = it4.next();
            Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryRelevantVideo", "key: %s unit_value %s text_value %s", next2.f134951d, Long.valueOf(next2.f134952e), next2.f134953f);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f63192d = nVar;
        return dispatch(gVar, this.f63193e, this);
    }

    public int getType() {
        return 1943;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStoryRelevantVideo", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f63192d.onSceneEnd(i2, i3, str, this);
    }
}
