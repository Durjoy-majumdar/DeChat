package kb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51672vb;
import te3.C51808wb;
import te3.ce4;

/* renamed from: kb0.l */
public class C33868l extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f91516d;

    /* renamed from: e */
    public C11385n f91517e;

    public C33868l(LinkedList<ce4> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51672vb();
        bVar.f127067b = new C51808wb();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/batchswitchservicenotifyoption";
        bVar.f127069d = 1176;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f91516d = a;
        ((C51672vb) a.f127055a.f127080a).f143415d = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneBatchSwitchServiceNotifyOption", "doScene");
        this.f91517e = nVar;
        return dispatch(gVar, this.f91516d, this);
    }

    public int getType() {
        return 1176;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBatchSwitchServiceNotifyOption", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f91517e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
