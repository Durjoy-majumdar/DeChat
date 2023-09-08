package sp1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopHotSellView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import kotlin.Result;
import ok1.C62042e;
import org.libpag.PAGView;
import wx3.C15601d;

/* renamed from: sp1.f */
public final class C64087f implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveShopHotSellView f181708d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f181709e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Boolean> f181710f;

    public C64087f(FinderLiveShopHotSellView finderLiveShopHotSellView, C8477a0 a0Var, C15601d<? super Boolean> dVar) {
        this.f181708d = finderLiveShopHotSellView;
        this.f181709e = a0Var;
        this.f181710f = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        C8477a0 a0Var = this.f181709e;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            C15601d<Boolean> dVar = this.f181710f;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
    }

    public void onAnimationEnd(Animator animator) {
        C62042e eVar = C62042e.f176370a;
        StringBuilder sb = new StringBuilder();
        sb.append("sellAnim alpha:");
        PAGView pAGView = this.f181708d.f160941i;
        Float f = null;
        sb.append(pAGView != null ? Float.valueOf(pAGView.getAlpha()) : null);
        sb.append(",scaleX:");
        PAGView pAGView2 = this.f181708d.f160941i;
        sb.append(pAGView2 != null ? Float.valueOf(pAGView2.getScaleX()) : null);
        sb.append(",scaleY:");
        PAGView pAGView3 = this.f181708d.f160941i;
        if (pAGView3 != null) {
            f = Float.valueOf(pAGView3.getScaleY());
        }
        sb.append(f);
        eVar.mo86998D1("FinderLiveShopHotSellView", sb.toString());
        C8477a0 a0Var = this.f181709e;
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            C15601d<Boolean> dVar = this.f181710f;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        } else {
            Log.m105920e("FinderLiveShopHotSellView", "bgEnterAnimSet onAnimationEnd again!");
        }
        ObjectAnimator d = this.f181708d.getBgEnterAlphaAnimator();
        if (d != null) {
            d.removeAllListeners();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
