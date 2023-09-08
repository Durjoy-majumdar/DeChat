package je1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60628i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kt1.C46744d;
import o40.C61926c;
import ob0.C11385n;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64197v;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C49715hk0;
import te3.C49842ig0;
import te3.C49859ik0;
import te3.C49966ja;
import te3.C51822we1;
import zc1.C66785b;

/* renamed from: je1.r2 */
public final class C46534r2 extends C60628i {

    /* renamed from: g */
    public final String f125376g;

    /* renamed from: h */
    public C47350c f125377h;

    /* renamed from: i */
    public C11385n f125378i;

    /* renamed from: j */
    public C49715hk0 f125379j;

    /* renamed from: n */
    public C46744d f125380n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C46534r2(C49712hj1 hj12, int i, C48978cb0 cb02, String str) {
        this(hj12, i, (List<? extends C48978cb0>) C64197v.m75534c(cb02), str);
        C87412m.m108594g(cb02, "extStats");
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return this.f125380n;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125378i = nVar;
        String str = this.f125376g;
        StringBuilder sb = new StringBuilder();
        sb.append("doExtStatsReport actionType=");
        sb.append(this.f125379j.f134695e);
        sb.append(", scene=");
        C49842ig0 ig02 = this.f125379j.f134697g;
        sb.append(ig02 != null ? Integer.valueOf(ig02.f135313e) : null);
        sb.append(" extList=");
        LinkedList<C48978cb0> linkedList = this.f125379j.f134696f;
        C87412m.m108593f(linkedList, "request.extStats");
        StringBuffer stringBuffer = new StringBuffer();
        for (C48978cb0 cb02 : linkedList) {
            stringBuffer.append("[feedActionValue=" + cb02.f131610g + " objectId=" + C61926c.m72691p(cb02.f131607d) + "];");
        }
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "buffer.toString()");
        sb.append(stringBuffer2);
        Log.m105924i(str, sb.toString());
        return dispatch(gVar, this.f125377h, this);
    }

    public int getType() {
        return 6681;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = this.f125376g;
        Log.m105924i(str2, "onGYNetEnd " + i + ' ' + i2 + ' ' + i3 + ' ' + str + ' ');
        if (i2 >= 4) {
            this.f125380n = C46744d.Default;
        }
        C11385n nVar = this.f125378i;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46534r2(C49712hj1 hj12, int i, List<? extends C48978cb0> list, String str) {
        super(hj12);
        int i2;
        C49842ig0 ig02;
        LinkedList<C51822we1> linkedList;
        C87412m.m108594g(list, "extStats");
        this.f125376g = "Finder.NetSceneExtStatsReport";
        this.f125380n = C46744d.Disable;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6681;
        C49715hk0 hk02 = new C49715hk0();
        hk02.f134694d = C66785b.f191882e.mo90662O5();
        hk02.f134695e = i;
        hk02.f134696f.addAll(list);
        C46523h2 h2Var = C46523h2.f125330a;
        C49842ig0 b = h2Var.mo71860b(6681, hj12);
        hk02.f134697g = b;
        this.f125379j = hk02;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            C48978cb0 cb02 = (C48978cb0) it.next();
            if (hj12 != null) {
                i2 = hj12.f134675i;
            }
            arrayList.add(new C13604l(Integer.valueOf(i2), Long.valueOf(cb02.f131607d)));
        }
        h2Var.mo71865g(b, arrayList, hj12);
        if (!(((str == null || str.length() == 0) ? 1 : i2) != 0 || (ig02 = this.f125379j.f134697g) == null || (linkedList = ig02.f135319n) == null)) {
            for (C51822we1 we12 : linkedList) {
                we12.f143985e = str;
            }
        }
        bVar.f127066a = this.f125379j;
        C49859ik0 ik02 = new C49859ik0();
        ik02.setBaseResponse(new C49966ja());
        bVar.f127067b = ik02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        this.f125377h = bVar.mo72403a();
    }
}
