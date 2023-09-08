package zg0;

import bh0.C113174b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C118470tm3;
import te3.C51163rv3;
import te3.C64612om3;
import te3.C64631pm3;
import xg0.C78803b;

/* renamed from: zg0.e */
public class C119111e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f356676d;

    /* renamed from: e */
    public C47350c f356677e;

    public C119111e(C113174b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C64612om3();
        bVar2.f127067b = new C64631pm3();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/rcptinfoadd";
        bVar2.f127069d = v2helper.EMethodOutputVolumeScaleEnable;
        bVar2.f127070e = 200;
        bVar2.f127071f = 1000000200;
        C47350c a = bVar2.mo72403a();
        this.f356677e = a;
        C64612om3 om32 = (C64612om3) a.f127055a.f127080a;
        C118470tm3 tm32 = new C118470tm3();
        om32.f184678d = tm32;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = Util.nullAs(bVar.f338617g, "");
        rv32.f141176e = true;
        tm32.f354465g = rv32;
        C118470tm3 tm33 = om32.f184678d;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = Util.nullAs(bVar.f338615e, "");
        rv33.f141176e = true;
        tm33.f354463e = rv33;
        C118470tm3 tm34 = om32.f184678d;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = Util.nullAs(bVar.f338620j, "");
        rv34.f141176e = true;
        tm34.f354468j = rv34;
        C118470tm3 tm35 = om32.f184678d;
        C51163rv3 rv35 = new C51163rv3();
        rv35.f141175d = Util.nullAs(bVar.f338618h, "");
        rv35.f141176e = true;
        tm35.f354466h = rv35;
        C118470tm3 tm36 = om32.f184678d;
        C51163rv3 rv36 = new C51163rv3();
        rv36.f141175d = Util.nullAs(bVar.f338624q, "");
        rv36.f141176e = true;
        tm36.f354472q = rv36;
        C118470tm3 tm37 = om32.f184678d;
        C51163rv3 rv37 = new C51163rv3();
        rv37.f141175d = Util.nullAs(bVar.f338621n, "");
        rv37.f141176e = true;
        tm37.f354469n = rv37;
        C118470tm3 tm38 = om32.f184678d;
        C51163rv3 rv38 = new C51163rv3();
        rv38.f141175d = Util.nullAs(bVar.f338622o, "");
        rv38.f141176e = true;
        tm38.f354470o = rv38;
        C118470tm3 tm39 = om32.f184678d;
        C51163rv3 rv39 = new C51163rv3();
        rv39.f141175d = Util.nullAs(bVar.f338616f, "");
        rv39.f141176e = true;
        tm39.f354464f = rv39;
        C118470tm3 tm310 = om32.f184678d;
        C51163rv3 rv310 = new C51163rv3();
        rv310.f141175d = Util.nullAs(bVar.f338619i, "");
        rv310.f141176e = true;
        tm310.f354467i = rv310;
        C118470tm3 tm311 = om32.f184678d;
        C51163rv3 rv311 = new C51163rv3();
        rv311.f141175d = Util.nullAs(bVar.f338623p, "");
        rv311.f141176e = true;
        tm311.f354471p = rv311;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f356676d = nVar;
        return dispatch(gVar, this.f356677e, this);
    }

    public int getType() {
        return v2helper.EMethodOutputVolumeScaleEnable;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRcptInfoAdd", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C64631pm3 pm32 = (C64631pm3) ((C47350c) uVar).f127056b.f127083a;
            if (pm32.f184863d.f185431e != null) {
                Log.m105918d("MicroMsg.NetSceneRcptInfoAdd", "resp.rImpl.rcptinfolist.rcptinfolist " + pm32.f184863d.f185431e.size());
                C78803b.vx0();
                C78803b.xx0().mo183785j(pm32.f184863d.f185431e);
                C78803b.vx0();
                C78803b.xx0().mo183784i();
            }
        }
        this.f356676d.onSceneEnd(i2, i3, str, this);
    }
}
