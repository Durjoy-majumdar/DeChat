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
import te3.C51881wv1;
import te3.C52027xv1;
import te3.C52103ye;

/* renamed from: sb0.p */
public class C48361p extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129469d;

    /* renamed from: e */
    public C47350c f129470e;

    /* renamed from: f */
    public Map<String, String> f129471f = new HashMap();

    public C48361p(LinkedList<C52103ye> linkedList) {
        Iterator<C52103ye> it = linkedList.iterator();
        while (it.hasNext()) {
            C52103ye next = it.next();
            String str = next.f145242e;
            String str2 = next.f145241d;
            if (!(str2 == null || str == null)) {
                this.f129471f.put(str, str2);
            }
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51881wv1();
        bVar.f127067b = new C52027xv1();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getbizchatinfolist";
        bVar.f127069d = 1365;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129470e = a;
        ((C51881wv1) a.f127055a.f127080a).f144307d = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129469d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "do scene");
        return dispatch(gVar, this.f129470e, this);
    }

    public int getType() {
        return 1365;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129469d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
