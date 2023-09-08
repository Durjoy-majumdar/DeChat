package com.tencent.p014mm.p136ui.conversation;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.g0 */
public final class C44987g0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ FolderHelper f122039d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup.LayoutParams f122040e;

    /* renamed from: f */
    public final /* synthetic */ C74720p.C74733m f122041f;

    public C44987g0(float f, FolderHelper folderHelper, ViewGroup.LayoutParams layoutParams, C74720p.C74733m mVar) {
        this.f122039d = folderHelper;
        this.f122040e = layoutParams;
        this.f122041f = mVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this.f122040e.height = (int) (0.0f + ((((float) this.f122039d.f219412n) - 0.0f) * floatValue));
        View view = this.f122041f.f219763r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(floatValue));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f122041f.f219762q.setLayoutParams(this.f122040e);
        C74720p.C74733m mVar = this.f122041f;
        mVar.f219760o = this.f122040e.height;
        mVar.f219762q.requestLayout();
    }
}
