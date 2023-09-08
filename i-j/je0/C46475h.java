package je0;

import a11.C39478b;
import a11.C39479c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import di3.C86312j;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48658a30;
import te3.C48801b30;
import te3.C51932x63;
import te3.C52076y63;

/* renamed from: je0.h */
public class C46475h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125209d;

    /* renamed from: e */
    public final C47350c f125210e;

    /* renamed from: f */
    public String f125211f;

    public C46475h(String str, LinkedList<C51932x63> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48658a30();
        bVar.f127067b = new C48801b30();
        bVar.f127068c = "/cgi-bin/micromsg-bin/delopenimchatroommember";
        bVar.f127069d = 943;
        C47350c a = bVar.mo72403a();
        this.f125210e = a;
        this.f125211f = str;
        C48658a30 a302 = (C48658a30) a.f127055a.f127080a;
        a302.f130265d = str;
        a302.f130266e = linkedList;
        Log.m105925i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "roomname: %s, size:%d", str, Integer.valueOf(linkedList.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125209d = nVar;
        return dispatch(gVar, this.f125210e, this);
    }

    public int getType() {
        return 943;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname: %s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125211f);
        if (uVar.getRespObj().getRetCode() == 0) {
            C48801b30 b302 = (C48801b30) ((C47350c) uVar).f127056b.f127083a;
            String str2 = this.f125211f;
            if (!str2.toLowerCase().endsWith("@im.chatroom") || b302.f130921d.isEmpty()) {
                Log.m105920e("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "DelChatroomMember: room:[" + str2 + "] listCnt:" + b302.f130921d.size());
            } else {
                C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
                C44661m1 Lo = n1Var.mo69799Lo(str2);
                List<String> G2 = C44661m1.m49271G2(Lo.field_memberlist);
                StringBuilder sb = new StringBuilder();
                sb.append("DelChatroomMember before ");
                LinkedList linkedList = (LinkedList) G2;
                sb.append(linkedList.size());
                Log.m105918d("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", sb.toString());
                Iterator<C52076y63> it = b302.f130921d.iterator();
                while (it.hasNext()) {
                    linkedList.remove(it.next().f145143d);
                }
                Log.m105918d("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "DelChatroomMember after " + linkedList.size());
                String NH = ((C39478b) C86312j.m106911c(C39478b.class)).mo62075NH(G2, -1, str2);
                Lo.mo69780C2(G2);
                Lo.field_displayname = NH;
                boolean replace = n1Var.replace(Lo);
                Log.m105918d("MicroMsg.Openim.NetSceneDelOpenIMChatRoomMember", "delChatroomMember " + replace);
            }
        }
        C11385n nVar = this.f125209d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
