package p203mi;

import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import java.util.List;
import ng3.C76856a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pg3.C47503a;
import pg3.C77084b;
import sf0.C48374j0;
import te3.C49762hw2;
import te3.C50260lg2;
import te3.C50688oi2;
import te3.C50834pi2;

/* renamed from: mi.t */
public class C47050t extends C117747y implements C1311n, C76856a {

    /* renamed from: d */
    public C11385n f126448d;

    /* renamed from: e */
    public final C47350c f126449e;

    /* renamed from: f */
    public C72963f4 f126450f;

    /* renamed from: g */
    public int f126451g;

    public C47050t(String str, List<String> list, int i, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50688oi2();
        bVar.f127067b = new C50834pi2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/invitechatroommember";
        bVar.f127069d = 610;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126449e = a;
        C50688oi2 oi22 = (C50688oi2) a.f127055a.f127080a;
        LinkedList<C49762hw2> linkedList = new LinkedList<>();
        for (String i2 : list) {
            C49762hw2 hw22 = new C49762hw2();
            hw22.f134913d = C48374j0.m53720i(i2);
            linkedList.add(hw22);
        }
        oi22.f139200e = linkedList;
        oi22.f139199d = linkedList.size();
        oi22.f139201f = C48374j0.m53720i(str);
        oi22.f139202g = i;
        if (obj instanceof ChatroomInfoUI.LocalHistoryInfo) {
            Log.m105925i("MicroMsg.NetSceneInviteChatRoomMember", "localHistoryInfo:%s", obj.toString());
            C50260lg2 lg22 = new C50260lg2();
            oi22.f139204i = lg22;
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
        this.f126448d = nVar;
        return dispatch(gVar, this.f126449e, this);
    }

    /* renamed from: e0 */
    public C77084b mo71848e0(C77084b bVar) {
        if (bVar instanceof C47503a) {
            C47503a aVar = (C47503a) bVar;
            aVar.mo72506c(this.f126451g);
            aVar.mo72505b(this.f126450f);
        }
        return bVar;
    }

    public int getType() {
        return 610;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneInviteChatRoomMember", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        C50834pi2 pi22 = (C50834pi2) this.f126449e.f127056b.f127083a;
        this.f126448d.onSceneEnd(i2, i3, str, this);
    }

    public C47050t(String str, List<String> list, int i, String str2, C72963f4 f4Var) {
        this.f126450f = f4Var;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50688oi2();
        bVar.f127067b = new C50834pi2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/invitechatroommember";
        bVar.f127069d = 610;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126449e = a;
        C50688oi2 oi22 = (C50688oi2) a.f127055a.f127080a;
        LinkedList<C49762hw2> linkedList = new LinkedList<>();
        for (String i2 : list) {
            C49762hw2 hw22 = new C49762hw2();
            hw22.f134913d = C48374j0.m53720i(i2);
            linkedList.add(hw22);
        }
        this.f126451g = linkedList.size();
        oi22.f139200e = linkedList;
        oi22.f139199d = linkedList.size();
        oi22.f139201f = C48374j0.m53720i(str);
        oi22.f139202g = i;
        oi22.f139203h = str2;
    }
}
