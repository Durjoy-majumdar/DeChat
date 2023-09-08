package yz2;

import android.widget.RelativeLayout;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: yz2.b */
public final class C53665b extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ PAGView f150732d;

    /* renamed from: e */
    public final /* synthetic */ RelativeLayout f150733e;

    public C53665b(PAGView pAGView, RelativeLayout relativeLayout) {
        this.f150732d = pAGView;
        this.f150733e = relativeLayout;
    }

    public void onAnimationCancel(PAGView pAGView) {
        this.f150732d.removeListener(this);
        this.f150733e.removeView(this.f150732d);
    }

    public void onAnimationEnd(PAGView pAGView) {
        this.f150732d.removeListener(this);
        this.f150733e.removeView(this.f150732d);
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
    }
}
