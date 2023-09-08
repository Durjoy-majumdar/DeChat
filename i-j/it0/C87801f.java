package it0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: it0.f */
public final class C87801f extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ HalfScreenManger f254175d;

    public C87801f(HalfScreenManger halfScreenManger) {
        this.f254175d = halfScreenManger;
    }

    public void onAnimationEnd(Animator animator) {
        ResultReceiver resultReceiver;
        super.onAnimationEnd(animator);
        WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = this.f254175d.mo117782e().f157953p;
        if (weAppHalfScreenStatusChangeListener != null && (resultReceiver = weAppHalfScreenStatusChangeListener.f239428e) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 2);
            bundle.putBoolean("isAnimationBegin", false);
            C13598b0 b0Var = C13598b0.f38549a;
            resultReceiver.send(0, bundle);
        }
    }

    public void onAnimationStart(Animator animator) {
        ResultReceiver resultReceiver;
        super.onAnimationStart(animator);
        HalfScreenManger halfScreenManger = this.f254175d;
        halfScreenManger.f247570c = true;
        ViewParent parent = halfScreenManger.f247568a.f238153r.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$onActivityEnterAnimationComplete$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$onActivityEnterAnimationComplete$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = this.f254175d.mo117782e().f157953p;
        if (weAppHalfScreenStatusChangeListener != null && (resultReceiver = weAppHalfScreenStatusChangeListener.f239428e) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 2);
            bundle.putBoolean("isAnimationBegin", true);
            C13598b0 b0Var = C13598b0.f38549a;
            resultReceiver.send(0, bundle);
        }
    }
}
