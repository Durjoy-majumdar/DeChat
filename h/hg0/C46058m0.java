package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50211l33;
import te3.C50349m33;
import te3.C50776p33;

/* renamed from: hg0.m0 */
public class C46058m0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124182d;

    /* renamed from: e */
    public C11385n f124183e;

    public C46058m0(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50211l33();
        bVar.f127067b = new C50349m33();
        bVar.f127068c = "/cgi-bin/micromsg-bin/newgetinvitefriend";
        bVar.f127069d = 135;
        bVar.f127070e = 23;
        bVar.f127071f = 1000000023;
        C47350c a = bVar.mo72403a();
        this.f124182d = a;
        ((C50211l33) a.f127055a.f127080a).f137153d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124183e = nVar;
        return dispatch(gVar, this.f124182d, this);
    }

    public int getType() {
        return 135;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C50349m33 m332 = (C50349m33) this.f124182d.f127056b.f127083a;
        Log.m105918d("MicroMsg.NetSceneGetInviteFriend", "friend:" + m332.f137819e.size() + " group:" + m332.f137821g.size());
        HashSet hashSet = new HashSet();
        LinkedList<C50776p33> linkedList = new LinkedList<>();
        for (int i4 = 0; i4 < m332.f137818d; i4++) {
            if (!hashSet.contains(m332.f137819e.get(i4).f139552h)) {
                linkedList.add(m332.f137819e.get(i4));
                hashSet.add(m332.f137819e.get(i4).f139552h);
            }
        }
        m332.f137819e = linkedList;
        m332.f137818d = linkedList.size();
        this.f124183e.onSceneEnd(i2, i3, str, this);
    }
}
