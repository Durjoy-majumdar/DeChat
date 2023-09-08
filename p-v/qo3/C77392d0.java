package qo3;

import android.view.animation.Animation;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;

/* renamed from: qo3.d0 */
public class C77392d0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ MMFilterDialog f225671a;

    public C77392d0(MMFilterDialog mMFilterDialog) {
        this.f225671a = mMFilterDialog;
    }

    public void onAnimationEnd(Animation animation) {
        this.f225671a.f220568r.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
