package fh1;

import android.widget.FrameLayout;
import gy3.C8477a0;
import kotlin.Result;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import wx3.C15601d;

/* renamed from: fh1.d1 */
public final class C59009d1 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C58999c1 f168833d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f168834e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Boolean> f168835f;

    public C59009d1(C58999c1 c1Var, C8477a0 a0Var, C15601d<? super Boolean> dVar) {
        this.f168833d = c1Var;
        this.f168834e = a0Var;
        this.f168835f = dVar;
    }

    public void onAnimationCancel(PAGView pAGView) {
        FrameLayout frameLayout = this.f168833d.f168802s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        PAGView pAGView2 = this.f168833d.f168803t;
        if (pAGView2 != null) {
            pAGView2.removeListener(this);
        }
        C8477a0 a0Var = this.f168834e;
        C15601d<Boolean> dVar = this.f168835f;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
    }

    public void onAnimationEnd(PAGView pAGView) {
        FrameLayout frameLayout = this.f168833d.f168802s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        PAGView pAGView2 = this.f168833d.f168803t;
        if (pAGView2 != null) {
            pAGView2.removeListener(this);
        }
        C8477a0 a0Var = this.f168834e;
        C15601d<Boolean> dVar = this.f168835f;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
        FrameLayout frameLayout = this.f168833d.f168802s;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
