package dp1;

import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58378j1;
import ef1.C7637b;
import ef1.C7645n;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rs1.C13426s1;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.db4;
import up1.C37521f;

/* renamed from: dp1.c0 */
public final class C7422c0 extends C58368h1 {

    /* renamed from: H */
    public static final C7423a f25598H = new C7423a((C8480h) null);

    /* renamed from: I */
    public static LinkedList<db4> f25599I = new LinkedList<>();

    /* renamed from: E */
    public final C13601g f25600E;

    /* renamed from: F */
    public final C13601g f25601F;

    /* renamed from: G */
    public final boolean f25602G;

    /* renamed from: dp1.c0$a */
    public static final class C7423a {
        public C7423a(C8480h hVar) {
        }

        /* renamed from: a */
        public final LinkedList<db4> mo8560a(int i) {
            if (i != 4) {
                return null;
            }
            LinkedList<db4> linkedList = C7422c0.f25599I;
            C7422c0.f25599I = new LinkedList<>();
            Log.m105924i("Finder.ImportantFeedFlowReporter", "streamCgiStats returnList " + linkedList.size());
            if (!BuildInfo.DEBUG) {
                return linkedList;
            }
            for (db4 c : linkedList) {
                C58378j1.C58379a aVar = C58378j1.f167214j0;
                C7423a aVar2 = C7422c0.f25598H;
                aVar.mo83213c(c, "Finder.ImportantFeedFlowReporter");
            }
            return linkedList;
        }
    }

    /* renamed from: dp1.c0$b */
    public static final class C7424b extends C87413o implements C32224a<FinderHomeTabFragment> {

        /* renamed from: d */
        public final /* synthetic */ MMFragmentActivity f25603d;

        /* renamed from: e */
        public final /* synthetic */ C7422c0 f25604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7424b(MMFragmentActivity mMFragmentActivity, C7422c0 c0Var) {
            super(0);
            this.f25603d = mMFragmentActivity;
            this.f25604e = c0Var;
        }

        public Object invoke() {
            return ((FinderHomeUIC) C39818r.f106831a.mo62444c(this.f25603d).mo75002a(FinderHomeUIC.class)).mo5129e3(((Number) ((C36570n) this.f25604e.f25600E).getValue()).intValue());
        }
    }

    /* renamed from: dp1.c0$d */
    public static final class C7425d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7422c0 f25605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7425d(C7422c0 c0Var) {
            super(0);
            this.f25605d = c0Var;
        }

        public Object invoke() {
            LinkedList<db4> M1 = this.f25605d.mo8558M1();
            synchronized (C7422c0.f25599I) {
                C7422c0.f25599I.addAll(M1);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dp1.c0$e */
    public static final class C7426e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C49712hj1 f25606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7426e(C49712hj1 hj12) {
            super(0);
            this.f25606d = hj12;
        }

        public Object invoke() {
            return Integer.valueOf(((C58417y0) C86312j.m106911c(C58417y0.class)).Xy0(this.f25606d.f134675i));
        }
    }

    /* renamed from: dp1.c0$c */
    public static final class C7427c extends C87413o implements C32224a<C13604l<? extends FinderItem, ? extends db4>> {

        /* renamed from: d */
        public final /* synthetic */ C58378j1 f25607d;

        /* renamed from: e */
        public final /* synthetic */ C7422c0 f25608e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7427c(C58378j1 j1Var, C7422c0 c0Var) {
            super(0);
            this.f25607d = j1Var;
            this.f25608e = c0Var;
        }

        public Object invoke() {
            C58378j1 a = this.f25607d.mo83169a();
            a.mo83151H(this.f25608e.f167331o);
            return new C13604l(a.f167245c, C58378j1.f167214j0.mo83214d(a, this.f25608e.f167327h));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7422c0(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12) {
        super(mMFragmentActivity, hj12);
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        this.f25600E = C36568h.m40985a(new C7426e(hj12));
        this.f25601F = C36568h.m40985a(new C7424b(mMFragmentActivity, this));
        C37521f.f99374d.getClass();
        this.f25602G = C37521f.f99284S5.mo60266n().intValue() != 1 ? false : true;
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C13426s1 c2;
        C87412m.m108594g(bVar, "event");
        StringBuilder sb = new StringBuilder();
        sb.append("[onEventHappen] centerFeed=");
        C58378j1 j1Var = this.f167171x;
        sb.append(C61926c.m72691p(j1Var != null ? j1Var.f167241a : 0));
        sb.append(' ');
        Log.m105924i("Finder.ImportantFeedFlowReporter", sb.toString());
        C58378j1 j1Var2 = this.f167172y;
        if (!(j1Var2 == null || (c2 = mo8559c2()) == null)) {
            c2.mo12822i3(((Number) ((C36570n) this.f25600E).getValue()).intValue(), bVar, this.f167327h, new C7427c(j1Var2, this));
        }
        super.mo2331B1(bVar);
        if (bVar instanceof C7645n) {
            C7645n nVar = (C7645n) bVar;
            if (nVar.f25964l != nVar.f25958i) {
                C13442s8.f38060Q0.getClass();
                C61926c.m72661F(C13442s8.f38061R0, new C7425d(this));
            }
        }
    }

    /* renamed from: M1 */
    public LinkedList<db4> mo8558M1() {
        LinkedList<db4> M1 = super.mo8558M1();
        C13426s1 c2 = mo8559c2();
        if (c2 != null) {
            c2.mo12820f3(M1);
        }
        return M1;
    }

    /* renamed from: c2 */
    public final C13426s1 mo8559c2() {
        FinderHomeTabFragment finderHomeTabFragment;
        if (!this.f25602G || (finderHomeTabFragment = (FinderHomeTabFragment) ((C36570n) this.f25601F).getValue()) == null) {
            return null;
        }
        return (C13426s1) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo62449e(C13426s1.class);
    }
}
