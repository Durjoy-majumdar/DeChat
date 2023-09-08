package po3;

import android.animation.Animator;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;

/* renamed from: po3.k */
public final class C110241k implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ CropLayout f329767d;

    public C110241k(CropLayout cropLayout) {
        this.f329767d = cropLayout;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        CropLayout.C106804b onChangeListener = this.f329767d.getOnChangeListener();
        CropLayout.C106805c cVar = onChangeListener instanceof CropLayout.C106805c ? (CropLayout.C106805c) onChangeListener : null;
        if (cVar != null) {
            cVar.mo154489a();
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
