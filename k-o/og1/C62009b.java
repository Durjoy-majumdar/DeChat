package og1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import d60.C58124b;
import gy3.C87412m;
import qj1.C62660c;
import te3.C49712hj1;

/* renamed from: og1.b */
public abstract class C62009b extends C62660c {

    /* renamed from: p */
    public final C58124b f176278p;

    /* renamed from: q */
    public final FrameBubbleContentLayout f176279q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62009b(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f176278p = bVar;
        ViewParent parent = viewGroup.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout");
        this.f176279q = (FrameBubbleContentLayout) parent;
    }

    /* renamed from: Z0 */
    public final View mo86896Z0() {
        return this.f176279q.getChildAt(0);
    }
}
