package p203mi;

import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45612m0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ng3.C76856a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pg3.C47504d;
import pg3.C77084b;
import sf0.C48374j0;
import te3.C48657a3;
import te3.C49762hw2;
import te3.C49908iw2;
import te3.C50260lg2;
import te3.C52202z2;

/* renamed from: mi.k */
public class C47040k extends C117747y implements C1311n, C76856a {

    /* renamed from: d */
    public final C47350c f126390d;

    /* renamed from: e */
    public C11385n f126391e = null;

    /* renamed from: f */
    public final List<String> f126392f;

    /* renamed from: g */
    public final List<String> f126393g;

    /* renamed from: h */
    public final List<String> f126394h;

    /* renamed from: i */
    public final List<String> f126395i;

    /* renamed from: j */
    public final List<String> f126396j;

    /* renamed from: n */
    public final List<String> f126397n;

    /* renamed from: o */
    public int f126398o = 0;

    /* renamed from: p */
    public String f126399p = null;

    /* renamed from: q */
    public String f126400q = "";

    /* renamed from: r */
    public final List<String> f126401r;

    public C47040k(String str, List<String> list, String str2, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52202z2();
        bVar.f127067b = new C48657a3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addchatroommember";
        bVar.f127069d = 120;
        bVar.f127070e = 36;
        bVar.f127071f = 1000000036;
        C47350c a = bVar.mo72403a();
        this.f126390d = a;
        C52202z2 z2Var = (C52202z2) a.f127055a.f127080a;
        z2Var.f145636f = C48374j0.m53720i(str);
        this.f126399p = str;
        LinkedList<C49762hw2> linkedList = new LinkedList<>();
        for (String i : list) {
            C49762hw2 hw22 = new C49762hw2();
            hw22.f134913d = C48374j0.m53720i(i);
            linkedList.add(hw22);
        }
        z2Var.f145635e = linkedList;
        z2Var.f145634d = linkedList.size();
        this.f126392f = new ArrayList();
        this.f126393g = new LinkedList();
        this.f126394h = new LinkedList();
        this.f126395i = new LinkedList();
        this.f126396j = new LinkedList();
        this.f126397n = new ArrayList();
        this.f126401r = list;
        z2Var.f145638h = str2;
        if (obj instanceof ChatroomInfoUI.LocalHistoryInfo) {
            Log.m105925i("MicroMsg.NetSceneAddChatRoomMember", "localHistoryInfo:%s", obj.toString());
            C50260lg2 lg22 = new C50260lg2();
            z2Var.f145639i = lg22;
            ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = (ChatroomInfoUI.LocalHistoryInfo) obj;
            lg22.f137403d = localHistoryInfo.f108055d;
            lg22.f137404e = localHistoryInfo.f108056e;
            lg22.f137405f = localHistoryInfo.f108057f;
            lg22.f137406g = localHistoryInfo.f108058g;
            lg22.f137407h = localHistoryInfo.f108059h;
            lg22.f137408i = localHistoryInfo.f108060i;
            lg22.f137409j = localHistoryInfo.f108061j;
            lg22.f137410n = localHistoryInfo.f108062n;
            lg22.f137411o = localHistoryInfo.f108063o;
            lg22.f137412p = localHistoryInfo.f108064p;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126391e = nVar;
        return dispatch(gVar, this.f126390d, this);
    }

    /* renamed from: e0 */
    public C77084b mo71848e0(C77084b bVar) {
        if (!(bVar instanceof C47504d)) {
            return bVar;
        }
        C47504d dVar = (C47504d) bVar;
        dVar.f127466h = this.f126399p;
        dVar.f127460b = this.f126393g;
        dVar.f127465g = this.f126398o;
        dVar.f127469k = this.f126401r;
        dVar.f127461c = this.f126394h;
        dVar.f127459a = this.f126392f;
        dVar.f127462d = this.f126395i;
        dVar.f127464f = this.f126397n;
        dVar.f127463e = this.f126396j;
        dVar.f127468j = this.f126400q;
        return dVar;
    }

    public int getType() {
        return 120;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneAddChatRoomMember", "onSceneEnd: errType = " + i2 + " errCode = " + i3 + " errMsg = " + str);
        updateDispatchId(i);
        C47350c cVar = this.f126390d;
        C52202z2 z2Var = (C52202z2) cVar.f127055a.f127080a;
        C48657a3 a3Var = (C48657a3) cVar.f127056b.f127083a;
        this.f126398o = a3Var.f130262d;
        this.f126400q = a3Var.f130264f;
        LinkedList<C49908iw2> linkedList = a3Var.f130263e;
        for (int i4 = 0; i4 < linkedList.size(); i4++) {
            int i5 = linkedList.get(i4).f135709e;
            if (i5 == 0) {
                ((ArrayList) this.f126392f).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 3) {
                Log.m105918d("MicroMsg.NetSceneAddChatRoomMember", " blacklist : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126394h).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 1) {
                Log.m105918d("MicroMsg.NetSceneAddChatRoomMember", " not user : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126395i).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 2) {
                Log.m105918d("MicroMsg.NetSceneAddChatRoomMember", " invalid username : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126393g).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 4) {
                Log.m105918d("MicroMsg.NetSceneAddChatRoomMember", " verify user : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126396j).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 != 5) {
                if (i5 == 6) {
                    ((ArrayList) this.f126397n).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
                } else {
                    Log.m105928w("MicroMsg.NetSceneAddChatRoomMember", "unknown member status : status = " + i5);
                }
            }
        }
        this.f126391e.onSceneEnd(i2, i3, str, this);
        if (i2 == 0 && i3 == 0) {
            String g = C48374j0.m53718g(z2Var.f145636f);
            if (!C45612m0.m50709z(g) || a3Var.f130262d == 0) {
                Log.m105920e("MicroMsg.ChatroomMembersLogic", "AddChatroomMember: room:[" + g + "] listCnt:" + a3Var.f130262d);
                return;
            }
            ArrayList arrayList = new ArrayList();
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            for (int i6 = 0; i6 < a3Var.f130262d; i6++) {
                String g2 = C48374j0.m53718g(a3Var.f130263e.get(i6).f135708d);
                if (a3Var.f130263e.get(i6).f135709e == 0) {
                    if (Util.isNullOrNil(g2)) {
                        Log.m105921e("MicroMsg.ChatroomMembersLogic", "this member name is null! chatRoomName : %s", g);
                    } else {
                        C72996z1 z1Var = Ni.get(g2);
                        if (((int) z1Var.f108320R1) != 0) {
                            z1Var.setType(z1Var.getType() | 4);
                            Ni.mo69719p3(z1Var.getUsername(), z1Var);
                        } else {
                            C45612m0.m50678E(z1Var, a3Var.f130263e.get(i6));
                            Ni.mo69667P3(z1Var);
                        }
                        arrayList.add(z1Var.getUsername());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C45612m0.m50702s(g, arrayList, (String) null);
            }
        }
    }
}
