package cc2;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import p586km.C46733b;
import p680ru.C101464l;
import tc2.C118418g;
import te3.C51018qv3;
import te3.C64290cn2;
import te3.C64319dn2;
import te3.C78019ym2;
import te3.lx4;

/* renamed from: cc2.e */
public class C54713e extends C117747y implements C1311n, C67350b {

    /* renamed from: d */
    public C11385n f153349d;

    /* renamed from: e */
    public final C47350c f153350e;

    public C54713e(int i, float f, float f2, int i2, int i3, String str, String str2) {
        if (!(i == 1 || i == 2 || i == 3 || i == 4)) {
            Log.m105920e("MicroMsg.NetSceneLbsP", "OpCode Error :" + i);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64290cn2();
        bVar.f127067b = new C64319dn2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/lbsfind";
        bVar.f127069d = 148;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f153350e = a;
        C64290cn2 cn22 = (C64290cn2) a.f127055a.f127080a;
        cn22.f182530d = i;
        cn22.f182531e = f;
        cn22.f182532f = f2;
        cn22.f182533g = i2;
        cn22.f182534h = str;
        cn22.f182535i = str2;
        cn22.f182536j = i3;
        try {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(C118418g.INSTANCE.mo175821hd());
            lx4.f354117f = qv32;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(lx4.toByteArray());
            cn22.f182538o = qv33;
        } catch (Throwable unused) {
        }
        Log.m105918d("MicroMsg.NetSceneLbsP", "Req: opcode:" + i + " lon:" + f + " lat:" + f2 + " pre:" + i2 + " gpsSource:" + i3 + " mac" + str + " cell:" + str2);
        ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2001, f, f2, i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f153349d = nVar;
        return dispatch(gVar, this.f153350e, this);
    }

    /* renamed from: f */
    public int mo75607f() {
        return ((C64290cn2) this.f153350e.f127055a.f127080a).f182530d;
    }

    public int getType() {
        return 148;
    }

    /* renamed from: j0 */
    public List<C78019ym2> mo75608j0() {
        LinkedList<C78019ym2> linkedList = ((C64319dn2) this.f153350e.f127056b.f127083a).f182780e;
        if (linkedList != null) {
            C86709a0.m107523b().mo121108c();
            for (C78019ym2 next : linkedList) {
                ((C46733b) C86312j.m106911c(C46733b.class)).zi0(next.f228622d, 18, next.f228619C);
            }
        }
        return linkedList;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneLbsP", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C64319dn2 dn22 = (C64319dn2) ((C47350c) uVar).f127056b.f127083a;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < dn22.f182780e.size(); i4++) {
            C68097n nVar = new C68097n();
            nVar.f195728a = dn22.f182780e.get(i4).f228622d;
            nVar.f195729b = dn22.f182780e.get(i4).f228629n;
            nVar.f195732e = dn22.f182780e.get(i4).f228640y;
            nVar.f195731d = dn22.f182780e.get(i4).f228641z;
            nVar.f195733f = 1;
            arrayList.add(nVar);
        }
        ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93609jo(arrayList);
        if (mo75607f() == 1 || mo75607f() == 3 || mo75607f() == 4) {
            if (i2 == 0 || i3 != -2001) {
                C86709a0.m107535s().mo121142i().mo119676J(8210, Long.valueOf(System.currentTimeMillis() + ((long) (dn22.f182782g * 1000))));
            } else {
                C86709a0.m107535s().mo121142i().mo119676J(8210, 0L);
                this.f153349d.onSceneEnd(i2, i3, str, this);
                return;
            }
        } else if (mo75607f() == 2) {
            C86709a0.m107535s().mo121142i().mo119676J(8210, 0L);
        }
        this.f153349d.onSceneEnd(i2, i3, str, this);
    }
}
