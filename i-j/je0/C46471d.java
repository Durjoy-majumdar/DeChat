package je0;

import a11.C39478b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ng3.C76856a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pg3.C47504d;
import pg3.C77084b;
import qe0.C47804e;
import te3.C50628o3;
import te3.C50773p3;
import te3.C51932x63;
import te3.C52076y63;
import yl0.C91494l;

/* renamed from: je0.d */
public class C46471d extends C117747y implements C1311n, C76856a {

    /* renamed from: d */
    public C11385n f125197d;

    /* renamed from: e */
    public final C47350c f125198e;

    /* renamed from: f */
    public String f125199f;

    public C46471d(String str, LinkedList<C51932x63> linkedList, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50628o3();
        bVar.f127067b = new C50773p3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addopenimchatroommember";
        bVar.f127069d = C91494l.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f125198e = a;
        this.f125199f = str;
        C50628o3 o3Var = (C50628o3) a.f127055a.f127080a;
        o3Var.f138919d = str;
        o3Var.f138920e = linkedList;
        o3Var.f138921f = str2;
        Log.m105925i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "roomname: %s, size:%s, desc:%s", str, Integer.valueOf(linkedList.size()), str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125197d = nVar;
        return dispatch(gVar, this.f125198e, this);
    }

    /* renamed from: e0 */
    public C77084b mo71848e0(C77084b bVar) {
        C50773p3 p3Var;
        if (bVar == null || !(bVar instanceof C47504d) || (p3Var = (C50773p3) this.f125198e.f127056b.f127083a) == null) {
            return bVar;
        }
        C47804e eVar = new C47804e();
        eVar.mo72572a(p3Var.f139539d);
        C47504d dVar = (C47504d) bVar;
        dVar.f127466h = this.f125199f;
        dVar.f127465g = ((ArrayList) eVar.f128358a).size();
        List<String> list = eVar.f128358a;
        dVar.f127469k = list;
        dVar.f127459a = list;
        dVar.f127460b = eVar.f128359b;
        dVar.f127461c = eVar.f128360c;
        dVar.f127462d = eVar.f128361d;
        dVar.f127464f = eVar.f128363f;
        dVar.f127463e = eVar.f128362e;
        dVar.f127467i = p3Var.f139540e;
        return dVar;
    }

    public int getType() {
        return C91494l.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125199f);
        if (uVar.getRespObj().getRetCode() == 0) {
            C50773p3 p3Var = (C50773p3) ((C47350c) uVar).f127056b.f127083a;
            String str2 = this.f125199f;
            if (!str2.toLowerCase().endsWith("@im.chatroom") || p3Var.f139539d.isEmpty()) {
                Log.m105920e("MicroMsg.Openim.NetSceneAddOpenIMChatRoomMember", "AddChatroomMember: bad room:[" + str2 + "] listCnt:" + p3Var.f139539d.size());
            } else {
                ArrayList arrayList = new ArrayList();
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                Iterator<C52076y63> it = p3Var.f139539d.iterator();
                while (it.hasNext()) {
                    C52076y63 next = it.next();
                    if (next.f145144e == 0) {
                        C72996z1 z1Var = Ni.get(next.f145143d);
                        if (((int) z1Var.f108320R1) != 0) {
                            z1Var.setType(z1Var.getType() | 4);
                            Ni.mo69719p3(z1Var.getUsername(), z1Var);
                        } else {
                            z1Var.setUsername(next.f145143d);
                            z1Var.mo62878U2(next.f145145f);
                            Ni.mo69667P3(z1Var);
                        }
                        arrayList.add(z1Var.getUsername());
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((C39478b) C86312j.m106911c(C39478b.class)).mo62078aB(str2, arrayList, (String) null);
                }
            }
        }
        C11385n nVar = this.f125197d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
