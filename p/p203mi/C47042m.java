package p203mi;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ng3.C76856a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import pg3.C47504d;
import pg3.C77084b;
import sf0.C48374j0;
import te3.C49762hw2;
import te3.C49908iw2;
import te3.C52046y00;
import te3.C52193z00;

/* renamed from: mi.m */
public class C47042m extends C117747y implements C1311n, C76856a {

    /* renamed from: d */
    public C11385n f126405d;

    /* renamed from: e */
    public final C47350c f126406e;

    /* renamed from: f */
    public final List<String> f126407f;

    /* renamed from: g */
    public final List<String> f126408g;

    /* renamed from: h */
    public final List<String> f126409h;

    /* renamed from: i */
    public List<String> f126410i;

    /* renamed from: j */
    public List<String> f126411j;

    /* renamed from: n */
    public String f126412n;

    /* renamed from: o */
    public int f126413o = 0;

    public C47042m(String str, List<String> list, String str2, String str3) {
        String str4 = (list == null || list.size() <= 0) ? "" : list.get(0);
        Log.m105918d("MicroMsg.NetSceneCreateChatRoom", "topic : " + str + " size : " + list.size() + " username : " + str4);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52046y00();
        bVar.f127067b = new C52193z00();
        bVar.f127068c = "/cgi-bin/micromsg-bin/createchatroom";
        bVar.f127069d = 119;
        bVar.f127070e = 37;
        bVar.f127071f = 1000000037;
        C47350c a = bVar.mo72403a();
        this.f126406e = a;
        C52046y00 y002 = (C52046y00) a.f127055a.f127080a;
        y002.f145055d = C48374j0.m53720i(str);
        LinkedList<C49762hw2> linkedList = new LinkedList<>();
        for (String i : list) {
            C49762hw2 hw22 = new C49762hw2();
            hw22.f134913d = C48374j0.m53720i(i);
            linkedList.add(hw22);
        }
        y002.f145057f = linkedList;
        y002.f145056e = linkedList.size();
        y002.f145061j = str2;
        y002.f145060i = str3;
        this.f126407f = new LinkedList();
        this.f126408g = new LinkedList();
        this.f126409h = new LinkedList();
        this.f126410i = new LinkedList();
        this.f126411j = new LinkedList();
        this.f126412n = "";
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126405d = nVar;
        return dispatch(gVar, this.f126406e, this);
    }

    /* renamed from: e0 */
    public C77084b mo71848e0(C77084b bVar) {
        if (!(bVar instanceof C47504d)) {
            return bVar;
        }
        C47504d dVar = (C47504d) bVar;
        dVar.f127466h = this.f126412n;
        dVar.f127460b = this.f126407f;
        dVar.f127465g = this.f126413o;
        List<String> list = this.f126411j;
        dVar.f127469k = list;
        dVar.f127459a = list;
        dVar.f127461c = this.f126408g;
        dVar.f127462d = this.f126409h;
        dVar.f127464f = new LinkedList();
        dVar.f127463e = this.f126410i;
        return dVar;
    }

    public int getType() {
        return 119;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneCreateChatRoom", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        C52193z00 z002 = (C52193z00) this.f126406e.f127056b.f127083a;
        this.f126412n = C48374j0.m53718g(z002.f145607i);
        int retCode = this.f126406e.f127056b.getRetCode();
        this.f126413o = z002.f145605g;
        LinkedList<C49908iw2> linkedList = z002.f145606h;
        for (int i4 = 0; i4 < linkedList.size(); i4++) {
            int i5 = linkedList.get(i4).f135709e;
            if (i5 == 0) {
                ((LinkedList) this.f126411j).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 3) {
                Log.m105918d("MicroMsg.NetSceneCreateChatRoom", " blacklist : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126408g).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 1) {
                Log.m105918d("MicroMsg.NetSceneCreateChatRoom", " not user : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126409h).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 2) {
                Log.m105918d("MicroMsg.NetSceneCreateChatRoom", " invalid username : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126407f).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (i5 == 4) {
                Log.m105918d("MicroMsg.NetSceneCreateChatRoom", " verify user : " + linkedList.get(i4).f135708d);
                ((LinkedList) this.f126410i).add(C48374j0.m53718g(linkedList.get(i4).f135708d));
            } else if (!(i5 == 5 || i5 == 6)) {
                Log.m105928w("MicroMsg.NetSceneCreateChatRoom", "unknown member status : status = " + i5);
            }
        }
        if (!Util.isNullOrNil(this.f126412n) && retCode == 0) {
            if (!C48374j0.m53718g(z002.f145607i).toLowerCase().endsWith("@chatroom") || z002.f145605g == 0) {
                Log.m105920e("MicroMsg.NetSceneCreateChatRoom", "CreateChatroom: room:[" + z002.f145607i + "] listCnt:" + z002.f145605g);
            } else {
                C72996z1 z1Var = new C72996z1();
                z1Var.mo62878U2(C48374j0.m53718g(z002.f145602d));
                z1Var.mo62882W2(C48374j0.m53718g(z002.f145603e));
                z1Var.mo62884X2(C48374j0.m53718g(z002.f145604f));
                z1Var.setUsername(C48374j0.m53718g(z002.f145607i));
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                if (!Ni.mo69709k3(z1Var.getUsername())) {
                    Ni.mo69667P3(z1Var);
                }
                C68097n nVar = new C68097n();
                nVar.f195728a = z1Var.getUsername();
                nVar.f195732e = z002.f145609n;
                nVar.f195731d = z002.f145610o;
                nVar.f195729b = 3;
                nVar.f195733f = 0;
                nVar.f195736i = -1;
                ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < z002.f145606h.size(); i6++) {
                    if (z002.f145606h.get(i6).f135709e == 0) {
                        C72996z1 z1Var2 = Ni.get(C48374j0.m53718g(z002.f145606h.get(i6).f135708d));
                        if (((int) z1Var2.f108320R1) != 0) {
                            z1Var2.setType(z1Var2.getType() | 4);
                            Ni.mo69719p3(z1Var2.getUsername(), z1Var2);
                        } else {
                            C45612m0.m50678E(z1Var2, z002.f145606h.get(i6));
                            Ni.mo69667P3(z1Var2);
                        }
                        arrayList.add(z1Var2.getUsername());
                    }
                }
                if (!arrayList.contains(C75592q0.m90789s())) {
                    arrayList.add(C75592q0.m90789s());
                    Log.m105918d("MicroMsg.NetSceneCreateChatRoom", "respon has not self add one " + arrayList.contains(C75592q0.m90789s()));
                }
                C45612m0.m50702s(z1Var.getUsername(), arrayList, C75592q0.m90789s());
            }
        }
        this.f126405d.onSceneEnd(i2, i3, str, this);
    }
}
