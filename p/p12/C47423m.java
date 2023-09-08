package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48651a14;
import te3.C48795b14;
import te3.nx4;

/* renamed from: p12.m */
public class C47423m extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f127216d = null;

    /* renamed from: e */
    public C48651a14 f127217e = null;

    /* renamed from: f */
    public C11385n f127218f;

    public C47423m(int i, int i2, LinkedList<nx4> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48651a14();
        bVar.f127067b = new C48795b14();
        bVar.f127069d = 871;
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendwcofeedback";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f127216d = a;
        C48651a14 a142 = (C48651a14) a.f127055a.f127080a;
        this.f127217e = a142;
        a142.f130217d = i2;
        a142.f130219f = linkedList;
        a142.f130218e = linkedList.size();
        this.f127217e.f130220g = i;
        Log.m105925i("MicroMsg.NetSceneIPCallSendFeedback", "NetSceneIPCallSendFeedback roomid=%d, level=%d, feedbackCount=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(linkedList.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127218f = nVar;
        return dispatch(gVar, this.f127216d, this);
    }

    public int getType() {
        return 871;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallSendFeedback", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        C48795b14 b142 = (C48795b14) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f127218f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
