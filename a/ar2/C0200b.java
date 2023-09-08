package ar2;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.widget.interactionlabel.SnsAdInteractionLabelView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import sq2.C13774c;

/* renamed from: ar2.b */
public class C0200b extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ View f674d;

    public C0200b(SnsAdInteractionLabelView snsAdInteractionLabelView, View view) {
        this.f674d = view;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$2");
        View view = this.f674d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/SnsAdInteractionLabelView$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/SnsAdInteractionLabelView$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$2");
    }
}
