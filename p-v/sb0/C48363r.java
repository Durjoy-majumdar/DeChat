package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49057cw1;
import te3.C49196dw1;
import te3.C49429fj;

/* renamed from: sb0.r */
public class C48363r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129475d;

    /* renamed from: e */
    public C47350c f129476e;

    /* renamed from: f */
    public Map<String, String> f129477f = new HashMap();

    /* renamed from: g */
    public Object f129478g;

    public C48363r(LinkedList<C49429fj> linkedList, Object obj) {
        Iterator<C49429fj> it = linkedList.iterator();
        while (it.hasNext()) {
            C49429fj next = it.next();
            LinkedList<String> linkedList2 = next.f133529e;
            String str = next.f133528d;
            if (!(str == null || linkedList2 == null || linkedList2.size() <= 0)) {
                Iterator<String> it4 = linkedList2.iterator();
                while (it4.hasNext()) {
                    this.f129477f.put(it4.next(), str);
                }
            }
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49057cw1();
        bVar.f127067b = new C49196dw1();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getbizchatuserinfolist";
        bVar.f127069d = 1353;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129476e = a;
        ((C49057cw1) a.f127055a.f127080a).f131994d = linkedList;
        this.f129478g = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129475d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "do scene");
        return dispatch(gVar, this.f129476e, this);
    }

    public int getType() {
        return 1353;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129475d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
