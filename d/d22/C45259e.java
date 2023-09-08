package d22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51179rz2;
import te3.C51318sz2;
import te3.ap4;

/* renamed from: d22.e */
public class C45259e extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f122607d;

    /* renamed from: e */
    public C11385n f122608e;

    /* renamed from: f */
    public LinkedList<ap4> f122609f = new LinkedList<>();

    public C45259e(LinkedList<ap4> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51179rz2();
        bVar.f127067b = new C51318sz2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/modifycontactlabellist";
        bVar.f127069d = 638;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f122607d = bVar.mo72403a();
        this.f122609f = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[doScene].");
        this.f122608e = nVar;
        C51179rz2 rz22 = (C51179rz2) this.f122607d.f127055a.f127080a;
        LinkedList<ap4> linkedList = this.f122609f;
        rz22.f141235e = linkedList;
        rz22.f141234d = linkedList.size();
        return dispatch(gVar, this.f122607d, this);
    }

    public int getType() {
        return 638;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.Label.NetSceneModifyContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f122608e.onSceneEnd(i2, i3, str, this);
    }
}
