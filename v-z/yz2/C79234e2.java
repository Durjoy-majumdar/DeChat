package yz2;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C81895h2;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import gy3.C87412m;
import kr0.C76628m0;

/* renamed from: yz2.e2 */
public final class C79234e2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232606d;

    /* renamed from: e */
    public final /* synthetic */ ObjectAnimator f232607e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f232608f;

    public C79234e2(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity, ObjectAnimator objectAnimator, C8477a0 a0Var) {
        this.f232606d = textStatusEditHalfScreenActivity;
        this.f232607e = objectAnimator;
        this.f232608f = a0Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = new Object[1];
        View view = this.f232606d.f207091Q;
        Float f = null;
        boolean z = false;
        objArr[0] = view != null ? Float.valueOf(view.getTranslationY()) : null;
        Log.m105919d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "showEmojiPanel:s layoutEditToolContainer?.translationY:%s", objArr);
        if (this.f232607e.getAnimatedFraction() == 0.0f) {
            z = true;
        }
        if (z) {
            View view2 = this.f232606d.f207091Q;
            if (view2 != null) {
                f = Float.valueOf(view2.getTranslationY());
            }
            if (C87412m.m108588a(f, 0.0f)) {
                this.f232608f.f27482d = true;
            }
        }
        if (this.f232608f.f27482d) {
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f232606d;
            C76628m0 m0Var = textStatusEditHalfScreenActivity.f207167t1;
            C87412m.m108591d(m0Var);
            View view3 = ((C81895h2) m0Var).getView();
            C87412m.m108591d(view3);
            textStatusEditHalfScreenActivity.mo1072i0(true, (int) (((float) view3.getHeight()) * valueAnimator.getAnimatedFraction()));
        }
    }
}
