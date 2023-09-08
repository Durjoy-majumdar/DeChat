package ve1;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ve1.n1 */
public final class C14575n1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f40377d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<View> f40378e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14575n1(BaseFinderFeed baseFinderFeed, C8479f0<View> f0Var) {
        super(0);
        this.f40377d = baseFinderFeed;
        this.f40378e = f0Var;
    }

    public Object invoke() {
        this.f40377d.mo3495c0(true);
        ((View) this.f40378e.f27484d).animate().translationX(0.0f).setInterpolator(new DecelerateInterpolator()).setStartDelay(100).setDuration(300).start();
        return C13598b0.f38549a;
    }
}
