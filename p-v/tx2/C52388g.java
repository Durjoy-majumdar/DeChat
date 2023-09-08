package tx2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.hf4;
import te3.if4;
import te3.jf4;
import xk0.C91264c;

/* renamed from: tx2.g */
public class C52388g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146443d;

    /* renamed from: e */
    public final C47350c f146444e;

    public C52388g(LinkedList<hf4> linkedList, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new if4();
        bVar.f127067b = new jf4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/talkstatreport";
        bVar.f127069d = C91264c.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f146444e = a;
        if4 if4 = (if4) a.f127055a.f127080a;
        if4.f135303d = linkedList.size();
        if4.f135304e = linkedList;
        if4.f135305f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneTalkStatReport", "doScene");
        this.f146443d = nVar;
        return dispatch(gVar, this.f146444e, this);
    }

    public int getType() {
        return C91264c.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneTalkStatReport", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            this.f146443d.onSceneEnd(i2, i3, str, this);
        } else {
            this.f146443d.onSceneEnd(i2, i3, str, this);
        }
    }
}
