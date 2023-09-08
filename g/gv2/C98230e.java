package gv2;

import com.tencent.p014mm.p136ui.base.MMOverScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import sn0.C90259e;

/* renamed from: gv2.e */
public final class C98230e implements MMOverScrollView.C96996b {

    /* renamed from: a */
    public final MMOverScrollView.C96997c f288001a;

    /* renamed from: b */
    public int f288002b = 800;

    /* renamed from: c */
    public C32226l<? super Boolean, C13598b0> f288003c;

    public C98230e(MMOverScrollView.C96997c cVar) {
        C87412m.m108594g(cVar, "provider");
        this.f288001a = cVar;
    }

    /* renamed from: a */
    public void mo135679a() {
        SnsMethodCalculate.markStartTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        SnsMethodCalculate.markEndTimeMs("onScrollEnd", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
    }

    /* renamed from: b */
    public boolean mo135680b(float f) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        int i = (int) (f / ((float) 2));
        int scrollY = this.f288001a.getScrollY() + i;
        this.f288001a.getScrollY();
        if (scrollY <= 0 && scrollY >= (-this.f288002b)) {
            this.f288001a.mo135693u0(i);
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        } else if (this.f288001a.getScrollY() < 0) {
            int i2 = this.f288002b;
            if (scrollY < (-i2)) {
                this.f288001a.mo135692t0(-i2);
            } else {
                MMOverScrollView.C96997c cVar = this.f288001a;
                cVar.mo135693u0(Math.min(i, -cVar.getScrollY()));
            }
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return false;
        }
    }

    /* renamed from: c */
    public void mo135681c(int i) {
        SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
    }

    /* renamed from: d */
    public boolean mo135682d() {
        SnsMethodCalculate.markStartTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        SnsMethodCalculate.markEndTimeMs(C90259e.C90262c.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }

    /* renamed from: e */
    public boolean mo135683e(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        if (!z2) {
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return false;
        } else if (z) {
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        } else {
            int scrollY = this.f288001a.getScrollY();
            int i = this.f288002b;
            if (scrollY < (-i) / 2) {
                MMOverScrollView.C96997c cVar = this.f288001a;
                MMOverScrollView.C96997c.C96998a.m124677a(cVar, (-i) - cVar.getScrollY(), 0, 2, (Object) null);
                C32226l<? super Boolean, C13598b0> lVar = this.f288003c;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                }
            } else {
                MMOverScrollView.C96997c cVar2 = this.f288001a;
                MMOverScrollView.C96997c.C96998a.m124677a(cVar2, -cVar2.getScrollY(), 0, 2, (Object) null);
                C32226l<? super Boolean, C13598b0> lVar2 = this.f288003c;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.FALSE);
                }
            }
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo135684f(float f) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        this.f288001a.mo135685a().fling(0, this.f288001a.getScrollY(), 0, -((int) f), 0, 0, -this.f288002b, 0);
        int finalY = this.f288001a.mo135685a().getFinalY();
        int i = this.f288002b;
        if (finalY < (-i) / 2) {
            MMOverScrollView.C96997c cVar = this.f288001a;
            MMOverScrollView.C96997c.C96998a.m124677a(cVar, (-i) - cVar.getScrollY(), 0, 2, (Object) null);
            C32226l<? super Boolean, C13598b0> lVar = this.f288003c;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else {
            MMOverScrollView.C96997c cVar2 = this.f288001a;
            MMOverScrollView.C96997c.C96998a.m124677a(cVar2, -cVar2.getScrollY(), 0, 2, (Object) null);
            C32226l<? super Boolean, C13598b0> lVar2 = this.f288003c;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.FALSE);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
        return true;
    }
}
