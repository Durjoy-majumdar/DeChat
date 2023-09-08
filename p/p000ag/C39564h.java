package p000ag;

import android.widget.FrameLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ag.h */
public final class C39564h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C79538i f106211d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39564h(C79538i iVar) {
        super(0);
        this.f106211d = iVar;
    }

    public Object invoke() {
        FrameLayout frameLayout = this.f106211d.f233193b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            return C13598b0.f38549a;
        }
        C87412m.m108603p("playableContainerView");
        throw null;
    }
}
