package xm1;

import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xm1.s */
public final class C15848s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f42676d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15848s(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback) {
        super(0);
        this.f42676d = liveEntranceFragmentViewCallback;
    }

    public Object invoke() {
        this.f42676d.mo3624d(false, "scroll-load-more", false);
        return C13598b0.f38549a;
    }
}
