package ul2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView;
import gy3.C87412m;

/* renamed from: ul2.f */
public final class C111201f extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeMaskView f333016d;

    public C111201f(ScanCodeMaskView scanCodeMaskView) {
        this.f333016d = scanCodeMaskView;
    }

    public void onAnimationEnd(Animator animator) {
        ImageView imageView = this.f333016d.f315999v;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            C87412m.m108603p("scanLineImageView");
            throw null;
        }
    }

    public void onAnimationStart(Animator animator) {
    }
}
