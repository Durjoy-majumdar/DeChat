package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.List;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C36907w;
import te3.C49173do1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50828ph0;
import te3.C50960qh0;
import te3.C51163rv3;

/* renamed from: je1.f */
public final class C46518f extends C60625c<C50960qh0> {

    /* renamed from: s */
    public final List<C49173do1> f125319s;

    /* renamed from: t */
    public final C50828ph0 f125320t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46518f(List<? extends C49173do1> list, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(list, "unreadList");
        this.f125319s = list;
        C50828ph0 ph02 = new C50828ph0();
        this.f125320t = ph02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C46523h2 h2Var = C46523h2.f125330a;
        ph02.f139764d = h2Var.mo71860b(3980, hj12);
        ph02.f139765e.addAll(list);
        bVar.f127066a = ph02;
        C49842ig0 ig02 = ph02.f139764d;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C49173do1 do12 : list) {
            arrayList.add(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134675i : 0), Long.valueOf(do12.f132446d)));
        }
        h2Var.mo71865g(ig02, arrayList, (C49712hj1) null);
        C50960qh0 qh02 = new C50960qh0();
        qh02.setBaseResponse(new C49966ja());
        qh02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = qh02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findercollectunread";
        bVar.f127069d = 3980;
        mo123453j(bVar.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("unreadList=");
        List<C49173do1> list2 = this.f125319s;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
        for (C49173do1 do13 : list2) {
            arrayList2.add(C61926c.m72691p(do13.f132446d));
        }
        sb.append(arrayList2);
        Log.m105924i("Finder.CgiCollectUnreadItem", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50960qh0) eu32, "resp");
        Log.m105924i("Finder.CgiCollectUnreadItem", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
