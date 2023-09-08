package fx0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50869ps2;
import te3.C51293ss2;
import te3.C51440ts2;

/* renamed from: fx0.w */
public class C32212w extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f85620d;

    /* renamed from: e */
    public C47350c f85621e;

    public C32212w(String str, LinkedList<C50869ps2> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51293ss2();
        bVar.f127067b = new C51440ts2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/setrecvtmpmsgoption";
        bVar.f127069d = 1030;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f85621e = a;
        C51293ss2 ss22 = (C51293ss2) a.f127055a.f127080a;
        ss22.f141723d = str;
        ss22.f141724e = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f85620d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "do scene");
        return dispatch(gVar, this.f85621e, this);
    }

    public int getType() {
        return 1030;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneSetRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f85620d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
