package p203mi;

import a11.C39479c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C45612m0;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C50204l20;
import te3.C50340m20;
import te3.C51632v20;
import te3.C51772w20;

/* renamed from: mi.n */
public class C47043n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126414d;

    /* renamed from: e */
    public C47350c f126415e;

    /* renamed from: f */
    public List<String> f126416f;

    public C47043n(String str, List<String> list, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50204l20();
        bVar.f127067b = new C50340m20();
        bVar.f127068c = "/cgi-bin/micromsg-bin/delchatroommember";
        bVar.f127069d = WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126415e = a;
        C50204l20 l202 = (C50204l20) a.f127055a.f127080a;
        l202.f137133f = str;
        LinkedList<C51632v20> linkedList = new LinkedList<>();
        for (String i2 : list) {
            C51632v20 v202 = new C51632v20();
            v202.f143255d = C48374j0.m53720i(i2);
            linkedList.add(v202);
        }
        l202.f137132e = linkedList;
        l202.f137131d = linkedList.size();
        l202.f137134g = i;
        this.f126416f = list;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126414d = nVar;
        return dispatch(gVar, this.f126415e, this);
    }

    public int getType() {
        return WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        Log.m105918d("MicroMsg.NetSceneDelChatRoomMember", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        C47350c cVar = this.f126415e;
        C50204l20 l202 = (C50204l20) cVar.f127055a.f127080a;
        C47350c.C47354d dVar = cVar.f127056b;
        C50340m20 m202 = (C50340m20) dVar.f127083a;
        if (dVar.getRetCode() != 0) {
            this.f126414d.onSceneEnd(i2, i3, str, this);
            return;
        }
        String str2 = l202.f137133f;
        if (!C45612m0.m50709z(str2) || m202.f137761d == 0) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "DelChatroomMember: room:[" + str2 + "] listCnt:" + m202.f137761d);
        } else {
            C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
            C44661m1 Lo = n1Var.mo69799Lo(str2);
            List<String> G2 = C44661m1.m49271G2(Lo.field_memberlist);
            StringBuilder sb = new StringBuilder();
            sb.append("DelChatroomMember before ");
            LinkedList linkedList = (LinkedList) G2;
            sb.append(linkedList.size());
            Log.m105918d("MicroMsg.ChatroomMembersLogic", sb.toString());
            Iterator<C51772w20> it = m202.f137762e.iterator();
            while (it.hasNext()) {
                linkedList.remove(C48374j0.m53718g(it.next().f143823d));
            }
            Log.m105918d("MicroMsg.ChatroomMembersLogic", "DelChatroomMember after " + linkedList.size());
            Lo.mo69780C2(G2);
            Lo.field_displayname = C45612m0.m50693j(G2, str2);
            Lo.field_memberCount = linkedList.size();
            boolean replace = n1Var.replace(Lo);
            Log.m105918d("MicroMsg.ChatroomMembersLogic", "delChatroomMember " + replace);
        }
        this.f126414d.onSceneEnd(i2, i3, str, this);
    }
}
