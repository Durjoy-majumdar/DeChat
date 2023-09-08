package do1;

import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import do1.C58329a;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: do1.c */
public final class C58333c extends C80403e {

    /* renamed from: b */
    public final /* synthetic */ FinderStreamTabPreloadCore f167019b;

    /* renamed from: do1.c$a */
    public static final class C58334a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderStreamTabPreloadCore f167020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58334a(FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
            super(0);
            this.f167020d = finderStreamTabPreloadCore;
        }

        public Object invoke() {
            long j;
            for (C58341h hVar : this.f167020d.f160333e) {
                boolean m = hVar.mo83095m();
                if (m) {
                    hVar.f167031g.set(true);
                }
                if (hVar.f167030f.compareAndSet(true, false)) {
                    Log.m105924i(hVar.f167027c, "performForeground: tabType=" + hVar.f167025a + ", isEnableScene=" + hVar.f167031g + ", isInFinder=" + hVar.f167028d);
                    if (hVar.f167025a == 4 && !hVar.f167028d) {
                        hVar.mo83088d("performForeground");
                    }
                    if (hVar.f167031g.get() && !hVar.f167028d && hVar.f167025a == hVar.f167026b.mo78459i3()) {
                        long f = hVar.mo83090f();
                        if (hVar.f167035k && m) {
                            hVar.f167035k = false;
                            if (f < 2000) {
                                j = 2000;
                                Log.m105924i(hVar.f167027c, "performForeground: post preload delay=" + j);
                                hVar.f167029e.mo83079a(hVar.f167036l, j, "performForeground", (!hVar.f167032h.get() || !m) ? C58329a.C58330a.Normal : C58329a.C58330a.WxForeground);
                            }
                        }
                        j = f;
                        Log.m105924i(hVar.f167027c, "performForeground: post preload delay=" + j);
                        hVar.f167029e.mo83079a(hVar.f167036l, j, "performForeground", (!hVar.f167032h.get() || !m) ? C58329a.C58330a.Normal : C58329a.C58330a.WxForeground);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: do1.c$b */
    public static final class C58335b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderStreamTabPreloadCore f167021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58335b(FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
            super(0);
            this.f167021d = finderStreamTabPreloadCore;
        }

        public Object invoke() {
            for (C58341h hVar : this.f167021d.f160333e) {
                if (hVar.f167030f.compareAndSet(false, true)) {
                    String str = hVar.f167027c;
                    Log.m105924i(str, "performBackground: tabType=" + hVar.f167025a + ", isEnableScene=" + hVar.f167031g + ", isInFinder=" + hVar.f167028d);
                    if (hVar.f167031g.get() && !hVar.f167028d) {
                        hVar.f167029e.mo83080c("performBackground");
                    }
                    if (hVar.f167025a == 4) {
                        FinderPlayerPreloadCore.f160325a.mo78450a("performBackground");
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C58333c(FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        this.f167019b = finderStreamTabPreloadCore;
    }

    /* renamed from: a */
    public void mo56329a() {
        Log.m105924i("Finder.StreamTabPreloadCore", "onEnterForeground: ");
        C61926c.m72668M(new C58334a(this.f167019b));
    }

    /* renamed from: b */
    public void mo56330b() {
        Log.m105924i("Finder.StreamTabPreloadCore", "onExitForeground: ");
        C61926c.m72668M(new C58335b(this.f167019b));
    }
}
