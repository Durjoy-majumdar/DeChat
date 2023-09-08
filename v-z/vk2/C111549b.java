package vk2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vk2.b */
public final class C111549b implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ BaseBoxDialogView f333970d;

    public C111549b(BaseBoxDialogView baseBoxDialogView) {
        this.f333970d = baseBoxDialogView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        BaseBoxDialogView baseBoxDialogView = this.f333970d;
        baseBoxDialogView.f315755Y0 = 1;
        C111554i iVar = baseBoxDialogView.f315772u;
        baseBoxDialogView.f315774w = iVar != null ? iVar.getBackgroundTransY() : 0.0f;
        Object[] objArr = new Object[2];
        C111554i iVar2 = this.f333970d.f315772u;
        Float f = null;
        objArr[0] = iVar2 != null ? Float.valueOf(iVar2.getBackgroundTransY()) : null;
        C111554i iVar3 = this.f333970d.f315772u;
        if (iVar3 != null) {
            f = Float.valueOf(iVar3.getMarkViewTransY());
        }
        objArr[1] = f;
        Log.m105919d("MicroMsg.BaseBoxDialogView", "alvinluo animateShowBackground onAnimationEnd bgTranslationY: %s, markViewTranslationY: %s", objArr);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
