package fg2;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.radar.p091ui.RadarStateChooseView;
import gy3.C87412m;

/* renamed from: fg2.m */
public final class C45773m implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ RadarStateChooseView f123670a;

    public C45773m(RadarStateChooseView radarStateChooseView) {
        this.f123670a = radarStateChooseView;
    }

    public void onAnimationEnd(Animation animation) {
        C87412m.m108594g(animation, "animation");
        RadarStateChooseView radarStateChooseView = this.f123670a;
        int i = RadarStateChooseView.f115868h;
        radarStateChooseView.getClass();
        this.f123670a.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }
}
