package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50281ll2;
import te3.C50420ml2;

/* renamed from: rb0.s0 */
public class C48005s0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128761d;

    /* renamed from: e */
    public C47350c f128762e;

    /* renamed from: f */
    public String f128763f;

    /* renamed from: g */
    public String f128764g;

    public C48005s0(String str, LinkedList<String> linkedList, LinkedList<Integer> linkedList2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50281ll2();
        bVar.f127067b = new C50420ml2();
        bVar.f127068c = "/cgi-bin/mmkf-bin/kfgetinfolist";
        bVar.f127069d = 675;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128762e = a;
        C50281ll2 ll22 = (C50281ll2) a.f127055a.f127080a;
        ll22.f137503d = str;
        ll22.f137504e = linkedList;
        ll22.f137505f = linkedList2;
        this.f128763f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128761d = nVar;
        Log.m105924i("MicroMsg.NetSceneKFGetInfoList", "do scene");
        return dispatch(gVar, this.f128762e, this);
    }

    public int getType() {
        return 675;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneKFGetInfoList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f128761d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
