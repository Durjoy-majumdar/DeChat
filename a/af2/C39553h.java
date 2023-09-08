package af2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ol0.C117802e0;
import te3.C51564um;
import te3.C51709vm;
import te3.C52029xv3;

/* renamed from: af2.h */
public class C39553h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106178d;

    /* renamed from: e */
    public C47350c f106179e;

    public C39553h(LinkedList<C52029xv3> linkedList, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51564um();
        bVar.f127067b = new C51709vm();
        bVar.f127068c = "/cgi-bin/micromsg-bin/cancelpreorder";
        bVar.f127069d = C117802e0.CTRL_INDEX;
        int i = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106179e = a;
        C51564um umVar = (C51564um) a.f127055a.f127080a;
        umVar.f142932e = linkedList;
        umVar.f142931d = linkedList != null ? linkedList.size() : i;
        umVar.f142933f = str;
        Log.m105918d("MicroMsg.NetSceneMallCancelPreOrder", "lockId " + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106178d = nVar;
        return dispatch(gVar, this.f106179e, this);
    }

    public int getType() {
        return C117802e0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        C51709vm vmVar = (C51709vm) ((C47350c) uVar).f127056b.f127083a;
        if (i3 == 0 && (i4 = vmVar.f143554d) != 0) {
            str = vmVar.f143555e;
            i3 = i4;
        }
        Log.m105918d("MicroMsg.NetSceneMallCancelPreOrder", "errCode " + i3 + ", errMsg " + str);
        this.f106178d.onSceneEnd(i2, i3, str, this);
    }
}
