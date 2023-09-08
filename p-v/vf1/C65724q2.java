package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vf1.q2 */
public final class C65724q2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f189081d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65724q2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(0);
        this.f189081d = finderLiveDelManagerUI;
    }

    public Object invoke() {
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget = this.f189081d.f158990h;
        if (finderLiveMemebrProfileWidget != null) {
            finderLiveMemebrProfileWidget.mo9763a();
        }
        return C13598b0.f38549a;
    }
}
