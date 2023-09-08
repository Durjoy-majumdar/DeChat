package gv2;

import com.tencent.p014mm.p136ui.base.MMOverScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import sn0.C90259e;

/* renamed from: gv2.q */
public final class C98244q implements MMOverScrollView.C96996b {

    /* renamed from: a */
    public final MMOverScrollView.C96997c f288036a;

    /* renamed from: b */
    public final String f288037b = "MicroMsg.SnsOpenScroller";

    /* renamed from: c */
    public int f288038c = 800;

    /* renamed from: d */
    public boolean f288039d;

    /* renamed from: e */
    public int f288040e;

    /* renamed from: f */
    public C98245a f288041f;

    /* renamed from: g */
    public boolean f288042g;

    /* renamed from: h */
    public boolean f288043h;

    /* renamed from: i */
    public final C98230e f288044i;

    /* renamed from: j */
    public final MMOverScrollView.C96999d f288045j;

    /* renamed from: k */
    public MMOverScrollView.C96996b f288046k;

    /* renamed from: l */
    public final C32226l<Boolean, C13598b0> f288047l;

    /* renamed from: gv2.q$a */
    public interface C98245a {
        /* renamed from: a */
        void mo132974a(boolean z, int i, int i2);

        /* renamed from: b */
        void mo133830b(int i, boolean z);

        /* renamed from: c */
        void mo132975c(boolean z);

        /* renamed from: d */
        void mo132976d();

        /* renamed from: e */
        void mo137549e(boolean z);
    }

    /* renamed from: gv2.q$b */
    public static final class C98246b implements C98245a {

        /* renamed from: a */
        public final LinkedList<C98245a> f288048a = new LinkedList<>();

        /* renamed from: a */
        public void mo132974a(boolean z, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
            for (C98245a a : this.f288048a) {
                a.mo132974a(z, i, i2);
            }
            SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        }

        /* renamed from: b */
        public void mo133830b(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
            for (C98245a b : this.f288048a) {
                b.mo133830b(i, z);
            }
            SnsMethodCalculate.markEndTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        }

        /* renamed from: c */
        public void mo132975c(boolean z) {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
            for (C98245a c : this.f288048a) {
                c.mo132975c(z);
            }
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        }

        /* renamed from: d */
        public void mo132976d() {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
            for (C98245a d : this.f288048a) {
                d.mo132976d();
            }
            SnsMethodCalculate.markEndTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        }

        /* renamed from: e */
        public void mo137549e(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
            for (C98245a e : this.f288048a) {
                e.mo137549e(z);
            }
            SnsMethodCalculate.markEndTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        }

        /* renamed from: f */
        public final void mo137550f(C98245a aVar) {
            SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
            C87412m.m108594g(aVar, "callback");
            if (!this.f288048a.contains(aVar)) {
                this.f288048a.add(aVar);
            }
            SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$OnScrollCallbackList");
        }
    }

    /* renamed from: gv2.q$c */
    public static class C98247c implements C98245a {
        /* renamed from: a */
        public void mo132974a(boolean z, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
            SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        }

        /* renamed from: b */
        public void mo133830b(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
            SnsMethodCalculate.markEndTimeMs("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        }

        /* renamed from: c */
        public void mo132975c(boolean z) {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        }

        /* renamed from: d */
        public void mo132976d() {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
            SnsMethodCalculate.markEndTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        }

        /* renamed from: e */
        public void mo137549e(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
            SnsMethodCalculate.markEndTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$SimpleOnScrollCallback");
        }
    }

    /* renamed from: gv2.q$d */
    public static final class C98248d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98244q f288049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98248d(C98244q qVar) {
            super(1);
            this.f288049d = qVar;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
            if (booleanValue && this.f288049d.mo137547j() != 1 && this.f288049d.mo137547j() != 2) {
                C98244q qVar = this.f288049d;
                qVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                qVar.f288040e = 2;
                SnsMethodCalculate.markEndTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                C98244q qVar2 = this.f288049d;
                qVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                C98245a aVar = qVar2.f288041f;
                SnsMethodCalculate.markEndTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                if (aVar != null) {
                    aVar.mo133830b(this.f288049d.mo137547j(), true);
                }
            } else if (!(booleanValue || this.f288049d.mo137547j() == 0 || this.f288049d.mo137547j() == 3)) {
                C98244q qVar3 = this.f288049d;
                qVar3.getClass();
                SnsMethodCalculate.markStartTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                qVar3.f288040e = 3;
                SnsMethodCalculate.markEndTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                C98244q qVar4 = this.f288049d;
                qVar4.getClass();
                SnsMethodCalculate.markStartTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                C98245a aVar2 = qVar4.f288041f;
                SnsMethodCalculate.markEndTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                if (aVar2 != null) {
                    aVar2.mo133830b(this.f288049d.mo137547j(), true);
                }
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
            return b0Var;
        }
    }

    public C98244q(MMOverScrollView.C96997c cVar) {
        C87412m.m108594g(cVar, "provider");
        this.f288036a = cVar;
        C98230e eVar = new C98230e(cVar);
        this.f288044i = eVar;
        this.f288045j = new MMOverScrollView.C96999d(cVar);
        this.f288046k = eVar;
        C98248d dVar = new C98248d(this);
        this.f288047l = dVar;
        SnsMethodCalculate.markStartTimeMs("setOnOpenChanged", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        eVar.f288003c = dVar;
        SnsMethodCalculate.markEndTimeMs("setOnOpenChanged", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
    }

    /* renamed from: a */
    public void mo135679a() {
        SnsMethodCalculate.markStartTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        C98245a aVar = this.f288041f;
        if (aVar != null) {
            aVar.mo137549e(this.f288042g);
        }
        mo137544g(true);
        SnsMethodCalculate.markEndTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    /* renamed from: b */
    public boolean mo135680b(float f) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        C98245a aVar = this.f288041f;
        if (aVar != null) {
            aVar.mo132974a(this.f288042g, (int) f, this.f288036a.getScrollY());
        }
        boolean b = this.f288046k.mo135680b(f);
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return b;
    }

    /* renamed from: c */
    public void mo135681c(int i) {
        SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        C98245a aVar = this.f288041f;
        if (aVar != null) {
            aVar.mo132974a(this.f288042g, i, this.f288036a.getScrollY());
        }
        SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    /* renamed from: d */
    public boolean mo135682d() {
        SnsMethodCalculate.markStartTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        String str = this.f288037b;
        Log.m105924i(str, "onTouchStart: " + this.f288039d + ", " + mo137548k() + ", " + this.f288043h + ", " + this.f288046k);
        if ((this.f288039d || mo137548k()) && this.f288036a.mo135686b0()) {
            this.f288042g = false;
            this.f288046k = this.f288044i;
        } else {
            this.f288042g = true;
            this.f288046k = this.f288045j;
        }
        C98245a aVar = this.f288041f;
        if (aVar != null) {
            aVar.mo132976d();
        }
        boolean d = this.f288046k.mo135682d();
        SnsMethodCalculate.markEndTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return d;
    }

    /* renamed from: e */
    public boolean mo135683e(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean e = this.f288046k.mo135683e(z, z2);
        if (!e) {
            SnsMethodCalculate.markStartTimeMs("getStateSettle", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            int i = this.f288040e;
            boolean z3 = i == 1 || i == 0;
            SnsMethodCalculate.markEndTimeMs("getStateSettle", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (!z3) {
                SnsMethodCalculate.markStartTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                mo137546i(true);
                SnsMethodCalculate.markEndTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            }
        }
        this.f288043h = false;
        if (e) {
            SnsMethodCalculate.markStartTimeMs("checkState$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            mo137544g(false);
            SnsMethodCalculate.markEndTimeMs("checkState$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        }
        C98245a aVar = this.f288041f;
        if (aVar != null) {
            aVar.mo132975c(this.f288042g);
        }
        SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return e;
    }

    /* renamed from: f */
    public boolean mo135684f(float f) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean f2 = this.f288046k.mo135684f(f);
        this.f288043h = false;
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return f2;
    }

    /* renamed from: g */
    public final void mo137544g(boolean z) {
        C98245a aVar;
        SnsMethodCalculate.markStartTimeMs("checkState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        String str = this.f288037b;
        Log.m105924i(str, "checkState: " + z);
        int i = (this.f288036a.mo135685a().isFinished() ? this.f288036a.getScrollY() : this.f288036a.mo135685a().getFinalY()) < 0 ? z ? 1 : 2 : z ? 0 : 3;
        int i2 = this.f288040e;
        if (i2 != i) {
            if (i == 0 && i2 != 3) {
                C98245a aVar2 = this.f288041f;
                if (aVar2 != null) {
                    aVar2.mo133830b(3, false);
                }
            } else if (!(i != 1 || i2 == 2 || (aVar = this.f288041f) == null)) {
                aVar.mo133830b(2, false);
            }
            this.f288040e = i;
            C98245a aVar3 = this.f288041f;
            if (aVar3 != null) {
                aVar3.mo133830b(i, false);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    /* renamed from: h */
    public final void mo137545h() {
        SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        SnsMethodCalculate.markStartTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        mo137546i(true);
        SnsMethodCalculate.markEndTimeMs("close$default", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    /* renamed from: i */
    public final void mo137546i(boolean z) {
        SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        this.f288042g = false;
        if (z) {
            this.f288036a.mo135689r0(0, -1);
            mo137544g(false);
        } else {
            this.f288036a.mo135692t0(0);
            mo137544g(true);
        }
        this.f288043h = false;
        SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
    }

    /* renamed from: j */
    public final int mo137547j() {
        SnsMethodCalculate.markStartTimeMs("getOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        int i = this.f288040e;
        SnsMethodCalculate.markEndTimeMs("getOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return i;
    }

    /* renamed from: k */
    public final boolean mo137548k() {
        SnsMethodCalculate.markStartTimeMs("isOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        boolean z = this.f288036a.getScrollY() == (-this.f288038c) || this.f288043h;
        SnsMethodCalculate.markEndTimeMs("isOpen", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        return z;
    }
}
