package ag2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: ag2.w */
public class C27901w extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f77072d;

    /* renamed from: e */
    public C47350c f77073e;

    /* renamed from: f */
    public ArrayList<Long> f77074f;

    public C27901w(ArrayList<Long> arrayList) {
        this.f77074f = arrayList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C39569c();
        bVar.f127067b = new C39571d();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkconversationfile";
        bVar.f127069d = 483;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f77073e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f77072d = nVar;
        C39569c cVar = (C39569c) this.f77073e.f127055a.f127080a;
        cVar.f106222d = this.f77074f.size();
        LinkedList<C39585i> linkedList = new LinkedList<>();
        Iterator<Long> it = this.f77074f.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            C39585i iVar = new C39585i();
            iVar.f106259e = longValue;
            linkedList.add(iVar);
            Log.m105925i("MicroMsg.NetSceneCheckConversationFile", "MsgId: %d", Long.valueOf(longValue));
        }
        cVar.f106223e = linkedList;
        Log.m105925i("MicroMsg.NetSceneCheckConversationFile", "Count = %d, MsgInfoList.size = %d", Integer.valueOf(cVar.f106222d), Integer.valueOf(cVar.f106223e.size()));
        return dispatch(gVar, this.f77073e, this);
    }

    public int getType() {
        return 483;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C11385n nVar;
        Log.m105925i("MicroMsg.NetSceneCheckConversationFile", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if ((i2 == 0 && i3 == 0) || (nVar = this.f77072d) == null) {
            C11385n nVar2 = this.f77072d;
            if (nVar2 != null) {
                nVar2.onSceneEnd(i2, i3, str, this);
                return;
            }
            return;
        }
        nVar.onSceneEnd(i2, i3, str, this);
    }
}
