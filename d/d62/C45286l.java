package d62;

import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76706g;
import p567iu.C46287c;
import p586km.C46733b;
import sf0.C48374j0;
import te3.C50324lx3;
import te3.C51163rv3;
import te3.C77917dy3;
import te3.C77961kx3;
import te3.C77967mx3;

/* renamed from: d62.l */
public class C45286l extends C117747y implements C1311n, C46287c {

    /* renamed from: d */
    public C11385n f122662d;

    /* renamed from: e */
    public final C47350c f122663e;

    /* renamed from: f */
    public final boolean f122664f;

    public C45286l(String str, int i) {
        this(str, 1, i, false);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f122662d = nVar;
        return dispatch(gVar, this.f122663e, this);
    }

    public int getType() {
        return 106;
    }

    /* renamed from: l0 */
    public C77967mx3 mo70811l0() {
        C77967mx3 mx32 = (C77967mx3) this.f122663e.f127056b.f127083a;
        if (mx32 != null) {
            Iterator<C77961kx3> it = mx32.f227846E.iterator();
            while (it.hasNext()) {
                C77961kx3 next = it.next();
                ((C46733b) C86312j.m106911c(C46733b.class)).zi0(next.f227763d.f141175d, 0, next.f227761F);
            }
        }
        return mx32;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Class cls = C76706g.class;
        C77967mx3 mx32 = (C77967mx3) this.f122663e.f127056b.f127083a;
        if (mx32 != null && mx32.f227845D > 0) {
            Iterator<C77961kx3> it = mx32.f227846E.iterator();
            while (it.hasNext()) {
                C77961kx3 next = it.next();
                Log.m105919d("MicroMsg.NetSceneSearchContact", "search RES username [%s]", next.f227763d);
                C68097n nVar = new C68097n();
                nVar.f195728a = C48374j0.m53718g(next.f227763d);
                nVar.f195732e = next.f227759D;
                nVar.f195731d = next.f227760E;
                nVar.f195736i = -1;
                Log.m105919d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", nVar.mo93598g(), nVar.mo93594c(), nVar.mo93597f());
                nVar.f195729b = 3;
                nVar.f195733f = 1;
                ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93608Yt(nVar);
            }
        } else if (mx32 != null && !Util.isNullOrNil(C48374j0.m53718g(mx32.f227857d))) {
            String g = C48374j0.m53718g(mx32.f227857d);
            C68097n nVar2 = new C68097n();
            nVar2.f195728a = g;
            nVar2.f195732e = mx32.f227847F;
            nVar2.f195731d = mx32.f227848G;
            nVar2.f195736i = -1;
            Log.m105919d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", nVar2.mo93598g(), nVar2.mo93594c(), nVar2.mo93597f());
            nVar2.f195729b = 3;
            nVar2.f195733f = 1;
            ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93608Yt(nVar2);
        }
        if (mx32 != null) {
            Iterator<C77917dy3> it4 = mx32.f227855N.iterator();
            while (it4.hasNext()) {
                C77917dy3 next2 = it4.next();
                C68097n nVar3 = new C68097n();
                nVar3.f195728a = next2.f227190d;
                nVar3.f195732e = next2.f227195i;
                nVar3.f195731d = next2.f227196j;
                nVar3.f195736i = -1;
                Log.m105919d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", nVar3.mo93598g(), nVar3.mo93594c(), nVar3.mo93597f());
                nVar3.f195729b = 3;
                nVar3.f195733f = 1;
                ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93608Yt(nVar3);
            }
        }
        this.f122662d.onSceneEnd(i2, i3, str, this);
    }

    /* renamed from: u0 */
    public boolean mo70812u0() {
        return this.f122664f;
    }

    public C45286l(String str, int i, int i2, boolean z) {
        this.f122664f = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50324lx3();
        bVar.f127067b = new C77967mx3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchcontact";
        bVar.f127069d = 106;
        bVar.f127070e = 34;
        bVar.f127071f = 1000000034;
        C47350c a = bVar.mo72403a();
        this.f122663e = a;
        Log.m105919d("MicroMsg.NetSceneSearchContact", "search username [%s], scene [%s]", str, Integer.valueOf(i2));
        C50324lx3 lx32 = (C50324lx3) a.f127055a.f127080a;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        lx32.f137693d = rv32;
        lx32.f137696g = i;
        lx32.f137697h = i2;
    }
}
