package ul2;

import android.animation.Animator;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.BaseScrollTabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: ul2.b */
public final class C111193b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f333003d;

    /* renamed from: e */
    public final /* synthetic */ BaseScrollTabView f333004e;

    public C111193b(C32224a<C13598b0> aVar, BaseScrollTabView baseScrollTabView) {
        this.f333003d = aVar;
        this.f333004e = baseScrollTabView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f333003d.invoke();
        BaseScrollTabView baseScrollTabView = this.f333004e;
        baseScrollTabView.f315957j = -1;
        baseScrollTabView.f315958n = false;
        Object[] objArr = new Object[1];
        LinearLayout linearLayout = baseScrollTabView.f315951d;
        if (linearLayout != null) {
            objArr[0] = Float.valueOf(linearLayout.getTranslationX());
            Log.m105927v("MicroMsg.BaseScrollTabView", "alvinluo animateScrollX onAnimationEnd %f", objArr);
            this.f333004e.mo151697b(1);
            return;
        }
        C87412m.m108603p("container");
        throw null;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
