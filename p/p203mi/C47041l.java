package p203mi;

import a11.C39479c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C45612m0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48846be2;
import te3.C49062cy;
import te3.C49201dy;
import te3.C51866wq2;

/* renamed from: mi.l */
public class C47041l extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126402d;

    /* renamed from: e */
    public final C47350c f126403e;

    /* renamed from: f */
    public LinkedList<C48846be2> f126404f;

    public C47041l(LinkedList<C48846be2> linkedList) {
        this.f126404f = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49062cy();
        bVar.f127067b = new C49201dy();
        bVar.f127068c = "/cgi-bin/micromsg-bin/collectchatroom";
        bVar.f127069d = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126403e = a;
        C49062cy cyVar = (C49062cy) a.f127055a.f127080a;
        cyVar.f132018e = linkedList;
        cyVar.f132017d = linkedList.size();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126402d = nVar;
        return dispatch(gVar, this.f126403e, this);
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        Log.m105918d("MicroMsg.NetSceneCollectChatRoom", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        C49201dy dyVar = (C49201dy) ((C47350c) uVar).f127056b.f127083a;
        if (uVar.getRespObj().getRetCode() != 0) {
            this.f126402d.onSceneEnd(i2, i3, str, this);
            return;
        }
        LinkedList<C48846be2> linkedList = this.f126404f;
        if (linkedList != null) {
            Iterator<C48846be2> it = linkedList.iterator();
            while (it.hasNext()) {
                C48846be2 next = it.next();
                Log.m105918d("MicroMsg.NetSceneCollectChatRoom", "del groupcard Name :" + next.f131068d);
                String str2 = next.f131068d;
                C51866wq2 wq22 = C45612m0.f123381a;
                if (!str2.toLowerCase().endsWith("@groupcard")) {
                    Log.m105920e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard: room:[" + str2 + "]");
                } else {
                    C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                    if (Ni.mo69709k3(str2)) {
                        Ni.mo69688c(str2);
                    } else {
                        Log.m105920e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard RoomName not exist:[" + str2 + "]");
                    }
                    ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69807jo(str2);
                }
            }
        }
        this.f126402d.onSceneEnd(i2, i3, str, this);
    }
}
