package sb2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import fy3.C32224a;
import gy3.C87413o;
import m03.C61426c;
import rx3.C13598b0;

/* renamed from: sb2.p */
public final class C63838p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvMainUIC f180965d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63838p(MusicMvMainUIC musicMvMainUIC) {
        super(0);
        this.f180965d = musicMvMainUIC;
    }

    public Object invoke() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        C61426c cVar = this.f180965d.f163276p;
        View view = cVar instanceof View ? (View) cVar : null;
        if (!(view == null || (animate = view.animate()) == null || (alpha = animate.alpha(1.0f)) == null)) {
            alpha.start();
        }
        return C13598b0.f38549a;
    }
}
