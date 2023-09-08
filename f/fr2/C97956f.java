package fr2;

import android.animation.Animator;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import sq2.C13774c;

/* renamed from: fr2.f */
public class C97956f extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ ShakeCoverView f287316d;

    public C97956f(ShakeCoverView shakeCoverView) {
        this.f287316d = shakeCoverView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$4");
        ShakeCoverView shakeCoverView = this.f287316d;
        int i = ShakeCoverView.f274472B;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        ViewGroup viewGroup = shakeCoverView.f274477g;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
        viewGroup.setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$4");
    }
}
