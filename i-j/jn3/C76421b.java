package jn3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;

/* renamed from: jn3.b */
public final class C76421b extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ ChatTipsBarGroup f223740d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f223741e;

    public C76421b(ChatTipsBarGroup chatTipsBarGroup, ViewPropertyAnimator viewPropertyAnimator) {
        this.f223740d = chatTipsBarGroup;
        this.f223741e = viewPropertyAnimator;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f223740d.f219961o = false;
        this.f223741e.setListener((Animator.AnimatorListener) null);
    }
}
