package je0;

import a11.C39478b;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
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
import te3.C49213e10;
import te3.C49360f10;
import te3.C51932x63;
import te3.C52076y63;

/* renamed from: je0.g */
public class C46474g extends C117747y implements C1311n, C76856a {

    /* renamed from: d */
    public C11385n f125207d;

    /* renamed from: e */
    public final C47350c f125208e;

    public C46474g(LinkedList<C51932x63> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49213e10();
        bVar.f127067b = new C49360f10();
        bVar.f127068c = "/cgi-bin/micromsg-bin/createopenimchatroom";
        bVar.f127069d = 371;
        C47350c a = bVar.mo72403a();
        this.f125208e = a;
        ((C49213e10) a.f127055a.f127080a).f132617d = linkedList;
        Log.m105925i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "create size:%d", Integer.valueOf(linkedList.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125207d = nVar;
        return dispatch(gVar, this.f125208e, this);
    }

    /* renamed from: e0 */
    public C77084b mo71848e0(C77084b bVar) {
        C49360f10 f102;
        if (bVar == null || !(bVar instanceof C47504d) || (f102 = (C49360f10) this.f125208e.f127056b.f127083a) == null) {
            return bVar;
        }
        C47804e eVar = new C47804e();
        eVar.mo72572a(f102.f133226e);
        C47504d dVar = (C47504d) bVar;
        dVar.f127466h = f102.f133225d;
        dVar.f127465g = ((ArrayList) eVar.f128358a).size();
        List<String> list = eVar.f128358a;
        dVar.f127469k = list;
        dVar.f127459a = list;
        dVar.f127460b = eVar.f128359b;
        dVar.f127461c = eVar.f128360c;
        dVar.f127462d = eVar.f128361d;
        dVar.f127464f = eVar.f128363f;
        dVar.f127463e = eVar.f128362e;
        return dVar;
    }

    public int getType() {
        return 371;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (uVar.getRespObj().getRetCode() == 0) {
            C49360f10 f102 = (C49360f10) ((C47350c) uVar).f127056b.f127083a;
            if (!Util.isNullOrNil(f102.f133225d)) {
                if (!f102.f133225d.toLowerCase().endsWith("@im.chatroom")) {
                    Log.m105920e("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "createChatroom: bad room:[" + f102.f133225d + "]");
                } else {
                    C72996z1 z1Var = new C72996z1();
                    z1Var.setUsername(f102.f133225d);
                    C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                    if (!Ni.mo69709k3(z1Var.getUsername())) {
                        Ni.mo69667P3(z1Var);
                    }
                    if (!Util.isNullOrNil(z1Var.getUsername()) && !Util.isNullOrNil(f102.f133228g)) {
                        C68097n nVar = new C68097n();
                        nVar.f195728a = z1Var.getUsername();
                        nVar.f195732e = f102.f133227f;
                        nVar.f195731d = f102.f133228g;
                        nVar.f195729b = 3;
                        nVar.f195733f = 0;
                        nVar.f195736i = -1;
                        C68102u.zx0().mo93608Yt(nVar);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<C52076y63> it = f102.f133226e.iterator();
                    while (it.hasNext()) {
                        C52076y63 next = it.next();
                        if (next.f145144e == 0) {
                            C72996z1 z1Var2 = Ni.get(next.f145143d);
                            if (((int) z1Var2.f108320R1) != 0) {
                                z1Var2.setType(z1Var2.getType() | 4);
                                Ni.mo69719p3(z1Var2.getUsername(), z1Var2);
                            } else {
                                z1Var2.setUsername(next.f145143d);
                                z1Var2.mo62878U2(next.f145145f);
                                Ni.mo69667P3(z1Var2);
                            }
                            arrayList.add(z1Var2.getUsername());
                        }
                    }
                    if (!arrayList.contains(C75592q0.m90789s())) {
                        arrayList.add(C75592q0.m90789s());
                        Log.m105918d("MicroMsg.Openim.NetSceneCreateOpenIMChatRoom", "respon has not self add one " + arrayList.contains(C75592q0.m90789s()));
                    }
                    ((C39478b) C86312j.m106911c(C39478b.class)).mo62078aB(z1Var.getUsername(), arrayList, C75592q0.m90789s());
                }
            }
        }
        C11385n nVar2 = this.f125207d;
        if (nVar2 != null) {
            nVar2.onSceneEnd(i2, i3, str, this);
        }
    }
}
