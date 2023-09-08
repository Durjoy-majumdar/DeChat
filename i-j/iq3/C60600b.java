package iq3;

import android.view.View;
import com.tencent.p014mm.view.ratio.RatioLayout;
import gy3.C87412m;

/* renamed from: iq3.b */
public abstract class C60600b<T> {

    /* renamed from: a */
    public RatioLayout f172707a;

    /* renamed from: a */
    public abstract int mo85553a();

    /* renamed from: b */
    public abstract T mo85554b(int i);

    /* renamed from: c */
    public abstract View mo85555c(int i, T t);

    /* renamed from: d */
    public final RatioLayout mo85556d() {
        RatioLayout ratioLayout = this.f172707a;
        if (ratioLayout != null) {
            return ratioLayout;
        }
        C87412m.m108603p("layout");
        throw null;
    }

    /* renamed from: e */
    public abstract RatioLayout.C57914a mo85557e(int i);

    /* renamed from: f */
    public final boolean mo85558f() {
        return this.f172707a != null;
    }

    /* renamed from: g */
    public final void mo85559g() {
        if (this.f172707a != null) {
            mo85556d().getLayoutManager().mo85562b();
        }
    }

    /* renamed from: h */
    public void mo85560h(int i, View view) {
        C87412m.m108594g(view, "view");
    }
}
