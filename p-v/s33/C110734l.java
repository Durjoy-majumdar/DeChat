package s33;

import com.tencent.mapsdk.internal.C0947jz;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51163rv3;
import te3.xv4;
import te3.yv4;
import te3.zv4;
import z33.C112597j;

/* renamed from: s33.l */
public class C110734l extends C63696n<yv4, zv4> {

    /* renamed from: s33.l$a */
    public class C110735a implements C11385n {
        public C110735a(C110734l lVar) {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C112597j.m153936a("MicroMsg.NetSceneVoipStatReport", "onSceneEnd type:" + yVar.getType() + " errType:" + i + " errCode:" + i2);
        }
    }

    public C110734l(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new yv4();
        bVar.f127067b = new zv4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipstatreport";
        bVar.f127069d = C0947jz.f2205e;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f180556d = a;
        C47465a aVar = a.f127055a.f127080a;
        yv4 yv4 = (yv4) aVar;
        yv4 yv42 = (yv4) aVar;
        xv4 xv4 = new xv4();
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(str2);
        xv4.f144999d = rv32;
        xv4 xv42 = new xv4();
        C51163rv3 rv33 = new C51163rv3();
        rv33.mo73357f(str3);
        xv42.f144999d = rv33;
        xv4 xv43 = new xv4();
        C51163rv3 rv34 = new C51163rv3();
        rv34.mo73357f(str4);
        xv43.f144999d = rv34;
        xv4 xv44 = new xv4();
        C51163rv3 rv35 = new C51163rv3();
        rv35.mo73357f(str5);
        xv44.f144999d = rv35;
        xv4 xv45 = new xv4();
        C51163rv3 rv36 = new C51163rv3();
        rv36.mo73357f(str6);
        xv45.f144999d = rv36;
        yv42.f332367d = xv4;
        yv42.f332369f = xv42;
        yv42.f332368e = xv43;
        yv42.f332370g = xv44;
        yv42.f332372i = xv45;
        C112597j.m153936a("MicroMsg.NetSceneVoipStatReport", "natReportList length:" + strArr.length);
        LinkedList<C51163rv3> linkedList = new LinkedList<>();
        for (String str7 : strArr) {
            C51163rv3 rv37 = new C51163rv3();
            rv37.f141175d = str7;
            rv37.f141176e = true;
            linkedList.add(rv37);
        }
        yv42.f332373j = linkedList.size();
        yv42.f332374n = linkedList;
        LinkedList<C51163rv3> linkedList2 = new LinkedList<>();
        for (String str8 : strArr2) {
            C51163rv3 rv38 = new C51163rv3();
            rv38.f141175d = str8;
            rv38.f141176e = true;
            linkedList2.add(rv38);
        }
        yv42.f332375o = linkedList2.size();
        yv42.f332376p = linkedList2;
        LinkedList<C51163rv3> linkedList3 = new LinkedList<>();
        for (String str9 : strArr3) {
            C51163rv3 rv39 = new C51163rv3();
            rv39.f141175d = str9;
            rv39.f141176e = true;
            linkedList3.add(rv39);
        }
        yv42.f332377q = linkedList3.size();
        yv42.f332378r = linkedList3;
        LinkedList<C51163rv3> linkedList4 = new LinkedList<>();
        for (String str10 : strArr4) {
            C51163rv3 rv310 = new C51163rv3();
            rv310.f141175d = str10;
            rv310.f141176e = true;
            linkedList4.add(rv310);
        }
        yv42.f332379s = linkedList4.size();
        yv42.f332380t = linkedList4;
    }

    public int getType() {
        return C0947jz.f2205e;
    }

    /* renamed from: l1 */
    public C11385n mo72979l1() {
        return new C110735a(this);
    }
}
