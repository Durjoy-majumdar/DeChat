package zg0;

import bh0.C113174b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C118470tm3;
import te3.C51163rv3;
import te3.C64235an3;
import te3.C64261bn3;
import xg0.C78803b;

/* renamed from: zg0.j */
public class C119112j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f356678d;

    /* renamed from: e */
    public C47350c f356679e;

    public C119112j(C113174b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C64235an3();
        bVar2.f127067b = new C64261bn3();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/rcptinfoupdate";
        bVar2.f127069d = 418;
        bVar2.f127070e = 203;
        bVar2.f127071f = 1000000203;
        C47350c a = bVar2.mo72403a();
        this.f356679e = a;
        C64235an3 an32 = (C64235an3) a.f127055a.f127080a;
        C118470tm3 tm32 = new C118470tm3();
        an32.f182100d = tm32;
        tm32.f354462d = bVar.f338614d;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = Util.nullAs(bVar.f338617g, "");
        rv32.f141176e = true;
        tm32.f354465g = rv32;
        C118470tm3 tm33 = an32.f182100d;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = Util.nullAs(bVar.f338615e, "");
        rv33.f141176e = true;
        tm33.f354463e = rv33;
        C118470tm3 tm34 = an32.f182100d;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = Util.nullAs(bVar.f338620j, "");
        rv34.f141176e = true;
        tm34.f354468j = rv34;
        C118470tm3 tm35 = an32.f182100d;
        C51163rv3 rv35 = new C51163rv3();
        rv35.f141175d = Util.nullAs(bVar.f338618h, "");
        rv35.f141176e = true;
        tm35.f354466h = rv35;
        C118470tm3 tm36 = an32.f182100d;
        C51163rv3 rv36 = new C51163rv3();
        rv36.f141175d = Util.nullAs(bVar.f338624q, "");
        rv36.f141176e = true;
        tm36.f354472q = rv36;
        C118470tm3 tm37 = an32.f182100d;
        C51163rv3 rv37 = new C51163rv3();
        rv37.f141175d = Util.nullAs(bVar.f338621n, "");
        rv37.f141176e = true;
        tm37.f354469n = rv37;
        C118470tm3 tm38 = an32.f182100d;
        C51163rv3 rv38 = new C51163rv3();
        rv38.f141175d = Util.nullAs(bVar.f338622o, "");
        rv38.f141176e = true;
        tm38.f354470o = rv38;
        C118470tm3 tm39 = an32.f182100d;
        C51163rv3 rv39 = new C51163rv3();
        rv39.f141175d = Util.nullAs(bVar.f338616f, "");
        rv39.f141176e = true;
        tm39.f354464f = rv39;
        C118470tm3 tm310 = an32.f182100d;
        C51163rv3 rv310 = new C51163rv3();
        rv310.f141175d = Util.nullAs(bVar.f338619i, "");
        rv310.f141176e = true;
        tm310.f354467i = rv310;
        C118470tm3 tm311 = an32.f182100d;
        C51163rv3 rv311 = new C51163rv3();
        rv311.f141175d = Util.nullAs(bVar.f338623p, "");
        rv311.f141176e = true;
        tm311.f354471p = rv311;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f356678d = nVar;
        return dispatch(gVar, this.f356679e, this);
    }

    public int getType() {
        return 418;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRcptInfoUpdate", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C64261bn3 bn32 = (C64261bn3) ((C47350c) uVar).f127056b.f127083a;
            if (bn32.f182290d.f185431e != null) {
                Log.m105918d("MicroMsg.NetSceneRcptInfoUpdate", "resp.rImpl.rcptinfolist.rcptinfolist " + bn32.f182290d.f185431e.size());
                C78803b.vx0();
                C78803b.xx0().mo183785j(bn32.f182290d.f185431e);
                C78803b.vx0();
                C78803b.xx0().mo183784i();
            }
        }
        this.f356678d.onSceneEnd(i2, i3, str, this);
    }
}
