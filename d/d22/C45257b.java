package d22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48836bc;
import te3.C48982cc;

/* renamed from: d22.b */
public class C45257b extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f122600d;

    /* renamed from: e */
    public C11385n f122601e;

    /* renamed from: f */
    public LinkedList<Integer> f122602f = new LinkedList<>();

    public C45257b(List<Integer> list) {
        new ArrayList();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48836bc();
        bVar.f127067b = new C48982cc();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchupdatecontactlabelwithseq";
        bVar.f127069d = 5882;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f122600d = bVar.mo72403a();
        this.f122602f.addAll(list);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f122601e = nVar;
        C48836bc bcVar = (C48836bc) this.f122600d.f127055a.f127080a;
        LinkedList<Integer> linkedList = this.f122602f;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.Label.NetSceneBatchUpdateContactLabelList", "[doScene] label id list is null.");
            nVar.onSceneEnd(3, -1, "[doScene]empty label is list.", this);
            return 0;
        }
        bcVar.f131041d = this.f122602f;
        return dispatch(gVar, this.f122600d, this);
    }

    public int getType() {
        return 5882;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.Label.NetSceneBatchUpdateContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f122601e.onSceneEnd(i2, i3, str, this);
    }
}
