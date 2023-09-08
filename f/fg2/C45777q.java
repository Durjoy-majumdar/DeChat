package fg2;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.radar.p091ui.RadarStateView;
import gy3.C87412m;

/* renamed from: fg2.q */
public final class C45777q implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ RadarStateView f123673a;

    public C45777q(RadarStateView radarStateView) {
        this.f123673a = radarStateView;
    }

    public void onAnimationEnd(Animation animation) {
        C87412m.m108594g(animation, "animation");
        RadarStateView radarStateView = this.f123673a;
        int i = RadarStateView.f115873j;
        radarStateView.getClass();
        this.f123673a.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }
}
