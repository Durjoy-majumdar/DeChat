package ul2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: ul2.k */
public final class C111208k implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f333031d;

    /* renamed from: e */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333032e;

    public C111208k(C32224a<C13598b0> aVar, ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f333031d = aVar;
        this.f333032e = scanCodeProductMergeMaskView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f333031d.invoke();
        this.f333032e.f316040f1 = false;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
