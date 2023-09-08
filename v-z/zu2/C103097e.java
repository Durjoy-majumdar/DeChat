package zu2;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: zu2.e */
public class C103097e implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C96148b f304204d;

    public C103097e(C96148b bVar) {
        this.f304204d = bVar;
    }

    public void onAnimationCancel(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
        View d = C96148b.m123231d(this.f304204d);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$8", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(d, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$8", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C96148b.m123231d(this.f304204d).setTranslationY(0.0f);
        SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
        View d = C96148b.m123231d(this.f304204d);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(d, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C96148b.m123231d(this.f304204d).setTranslationY(0.0f);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
    }

    public void onAnimationRepeat(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
        C96148b.m123230c(this.f304204d);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$8");
    }
}
