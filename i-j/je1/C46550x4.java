package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60628i;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51449tu2;
import te3.C51521ub1;
import te3.C51674vb1;
import te3.C51822we1;

/* renamed from: je1.x4 */
public final class C46550x4 extends C60628i {

    /* renamed from: g */
    public LinkedList<C51449tu2> f125436g;

    /* renamed from: h */
    public final String f125437h = "Finder.NetSceneMarkRead";

    /* renamed from: i */
    public C47350c f125438i;

    /* renamed from: j */
    public C11385n f125439j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46550x4(LinkedList<C51449tu2> linkedList) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(linkedList, "sendMarkReadList");
        this.f125436g = linkedList;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3520;
        C51521ub1 ub12 = new C51521ub1();
        ub12.f142720e = this.f125436g;
        C49842ig0 a = C46523h2.f125330a.mo71859a(3520);
        for (C51449tu2 tu22 : this.f125436g) {
            LinkedList<C51822we1> linkedList2 = a.f135319n;
            if (linkedList2 != null) {
                C51822we1 we12 = new C51822we1();
                we12.f143985e = tu22.f142421h;
                we12.f143984d = tu22.f142417d;
                linkedList2.add(we12);
            }
        }
        ub12.f142719d = a;
        bVar.f127066a = ub12;
        C51674vb1 vb12 = new C51674vb1();
        vb12.setBaseResponse(new C49966ja());
        bVar.f127067b = vb12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findermarkread";
        this.f125438i = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125439j = nVar;
        return dispatch(gVar, this.f125438i, this);
    }

    public int getType() {
        return 3520;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125437h;
        Log.m105924i(str2, "onGYNetEnd " + i + ' ' + i2 + ' ' + i3 + ' ' + str + ' ' + this.f125436g.size());
        C11385n nVar = this.f125439j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
