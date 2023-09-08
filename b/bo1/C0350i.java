package bo1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import java.util.LinkedList;
import je1.C9335m;
import p1028re.C89931d;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import zt3.C119157j;

/* renamed from: bo1.i */
public final class C0350i {

    /* renamed from: a */
    public static final C13601g<C0350i> f938a = C36568h.m40985a(C0351a.f939d);

    /* renamed from: bo1.i$a */
    public static final class C0351a extends C87413o implements C32224a<C0350i> {

        /* renamed from: d */
        public static final C0351a f939d = new C0351a();

        public C0351a() {
            super(0);
        }

        public Object invoke() {
            C0350i iVar = new C0350i();
            C89931d.f258426c.mo124252b(new C0352j(iVar));
            return iVar;
        }
    }

    /* renamed from: a */
    public static final void m295a(C0350i iVar, LinkedList linkedList, int i, int i2) {
        iVar.getClass();
        C85801v1 i3 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_SEARCH_PREFETCH_TIME_LONG_SYNC;
        long G = i3.mo119673G(aVar, 0);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_search_h5_preload_interval, 2000);
        long a = C31543z5.m39451a();
        Log.m105924i("FinderSearchRelPreLoader", "last " + G + " interval " + Qe + " cur " + a + " objectSize " + linkedList.size());
        long j = G + ((long) Qe);
        if (j > a) {
            ((C119157j) C119157j.f356862d).mo183879j(new C0353k(iVar, linkedList, i, i2), j - a, "FinderSearchRelPreLoader");
            return;
        }
        Log.m105925i("FinderSearchRelPreLoader", "doTask %d", Long.valueOf(a));
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(a));
        C49712hj1 hj12 = new C49712hj1();
        hj12.f134675i = i;
        new C9335m(linkedList, hj12, i2).mo9225i().mo123419C(new C0355m(i));
    }
}
