package dj1;

import cl1.C54991o;
import cl1.C55001u;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46523h2;
import nk1.C61780j;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C49335eu3;
import te3.C49530g82;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51897wz0;
import te3.C64224a61;
import te3.C64308d82;
import te3.C64424hi3;
import te3.C64790vz0;
import te3.C64795w51;
import zc1.C66785b;

/* renamed from: dj1.k1 */
public final class C58282k1 extends C58286q<C51897wz0> {

    /* renamed from: t */
    public final C64795w51 f166888t;

    /* renamed from: u */
    public final String f166889u = "Finder.CgiUpdateRedPacketCoverInfo";

    /* renamed from: v */
    public C64790vz0 f166890v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58282k1(C45795b bVar, C64795w51 w512) {
        super((C49712hj1) null, 1, (C8480h) null);
        Class cls = C55001u.class;
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(w512, "coverInfo");
        String str = null;
        this.f166888t = w512;
        C64790vz0 vz02 = new C64790vz0();
        this.f166890v = vz02;
        vz02.f186018d = C46523h2.f125330a.mo71859a(8259);
        this.f166890v.f186019e = ((C54991o) bVar.mo71262a(C54991o.class)).f154345o;
        String O5 = C66785b.f191882e.mo90662O5();
        if (O5 != null) {
            str = (O5.length() == 0) ^ true ? O5 : str;
            if (str != null) {
                this.f166890v.f186020f = str;
            }
        }
        this.f166890v.f186021g = new C89349b(((C55001u) bVar.mo71262a(cls)).f154417n);
        this.f166890v.f186022h = ((C55001u) bVar.mo71262a(cls)).f154416j;
        this.f166890v.f186023i = ((C55001u) bVar.mo71262a(cls)).f154420q.f182392d;
        C64790vz0 vz03 = this.f166890v;
        LinkedList<C64308d82> linkedList = new LinkedList<>();
        C64308d82 d822 = new C64308d82();
        d822.f182655d = 1;
        d822.f182656e = new C89349b(w512.toByteArray());
        linkedList.add(d822);
        vz03.f186024j = linkedList;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f166890v;
        C51897wz0 wz02 = new C51897wz0();
        wz02.setBaseResponse(new C49966ja());
        wz02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = wz02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetextrainfo";
        bVar2.f127069d = 8259;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiUpdateRedPacketCoverInfo", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        String str2;
        C51897wz0 wz02 = (C51897wz0) eu32;
        C87412m.m108594g(wz02, "resp");
        String str3 = this.f166889u;
        Log.m105924i(str3, "[onCgiBack] scene:" + this.f166890v.f186023i + ",errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            LinkedList<C49530g82> linkedList = wz02.f144363d;
            C87412m.m108593f(linkedList, "resp.get_resp_list");
            C49530g82 g822 = (C49530g82) C110818d0.m150916N(linkedList);
            if (g822 != null) {
                C64224a61 a612 = new C64224a61();
                C89349b bVar = g822.f133926f;
                byte[] f = bVar != null ? bVar.mo123703f() : null;
                if (f != null) {
                    try {
                        a612.parseFrom(f);
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                    }
                }
                String str4 = this.f166889u;
                Log.m105924i(str4, "status = " + C61937h.m72703b(a612));
                LinkedList<C64424hi3> linkedList2 = this.f166888t.f186059d;
                C87412m.m108593f(linkedList2, "coverInfo.infos");
                C64424hi3 hi32 = (C64424hi3) C110818d0.m150916N(linkedList2);
                if (hi32 != null && (str2 = hi32.f183501f) != null) {
                    C61780j.f175629a.getClass();
                    String str5 = C61780j.f175630b;
                    Log.m105924i(str5, "[saveStatus] status:" + C61937h.m72709h(a612) + ", url:" + str2);
                    C61780j.f175631c.put(str2, a612);
                }
            }
        }
    }
}
