package je1;

import com.google.android.gms.common.stats.LoggingConstants;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58378j1;
import dp1.C58417y0;
import eb0.C31543z5;
import gr1.C45946r0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jp3.C9487b;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87200o;
import p682rz.C36594q;
import qe3.C89625d;
import rx3.C13604l;
import sx3.C36907w;
import te3.C22489al0;
import te3.C49704hh0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50419ml1;
import te3.C50561nl1;
import te3.C51163rv3;
import te3.C64728tj0;
import te3.db4;
import zc1.C66785b;

/* renamed from: je1.m1 */
public class C46525m1 extends C60625c<C50561nl1> {

    /* renamed from: s */
    public C46744d f125335s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46525m1(List<? extends db4> list, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(list, LoggingConstants.LOG_FILE_PREFIX);
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50419ml1 ml12 = new C50419ml1();
        ArrayList<db4> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!(((db4) next).f182676d == 0 ? true : z)) {
                arrayList.add(next);
            }
        }
        for (db4 db4 : arrayList) {
            db4.f182686q = hj12 != null ? hj12.f134675i : 0;
            C58378j1.f167214j0.mo83213c(db4, "Finder.CgiFinderStatsReport");
        }
        bVar.f127066a = ml12;
        ml12.f138093d.addAll(list);
        ml12.f138094e = C66785b.f191882e.mo90662O5();
        C46523h2 h2Var = C46523h2.f125330a;
        ml12.f138095f = h2Var.mo71860b(3776, hj12);
        ml12.f138097h = C31543z5.m39453c();
        C49704hh0 hh02 = new C49704hh0();
        hh02.f134640j = C89625d.f257839e;
        hh02.f134641n = C87200o.f252873f;
        hh02.f134639i = C89625d.f257836b;
        hh02.f134638h = C89625d.f257837c;
        hh02.f134635e = NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
        hh02.f134634d = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83336jw();
        hh02.f134636f = CdnLogic.getRecentAverageSpeed(2);
        LinkedList<C64728tj0> linkedList = hh02.f134637g;
        CopyOnWriteArrayList<C64728tj0> copyOnWriteArrayList = C45946r0.f123947c;
        linkedList.addAll(copyOnWriteArrayList);
        Log.m105924i("Finder.CgiFinderStatsReport", "[buildStatsRequest] lastVideosDownloadInfo size=" + copyOnWriteArrayList.size());
        copyOnWriteArrayList.clear();
        hh02.f134642o.add("h264");
        if (((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(4)) {
            hh02.f134642o.add("h265");
        }
        hh02.f134643p = mo71872s();
        hh02.f134649v.addAll(C45946r0.f123948d);
        hh02.f134647t.addAll(C45946r0.f123950f);
        hh02.f134648u.addAll(C45946r0.f123951g);
        ml12.f138096g = hh02;
        C49842ig0 ig02 = ml12.f138095f;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        for (db4 db42 : list) {
            arrayList2.add(new C13604l(Integer.valueOf(db42.f182686q), Long.valueOf(db42.f182676d)));
        }
        h2Var.mo71865g(ig02, arrayList2, hj12);
        C50561nl1 nl12 = new C50561nl1();
        nl12.setBaseResponse(new C49966ja());
        nl12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = nl12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderstatsreport";
        bVar.f127069d = 3776;
        mo123453j(bVar.mo72403a());
        this.f125335s = C46744d.Disable;
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return this.f125335s;
    }

    /* renamed from: s */
    public synchronized LinkedList<C22489al0> mo71872s() {
        LinkedList<C22489al0> linkedList;
        linkedList = new LinkedList<>();
        linkedList.addAll(C20480e0.f57583a.mo32033f());
        return linkedList;
    }

    /* renamed from: t */
    public void mo332r(int i, int i2, String str, C50561nl1 nl12, C117747y yVar) {
        C87412m.m108594g(nl12, "resp");
        if (i >= 4) {
            this.f125335s = C46744d.Default;
        }
    }
}
