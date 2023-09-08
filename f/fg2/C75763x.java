package fg2;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.radar.p091ui.RadarTipsView;
import gy3.C87412m;

/* renamed from: fg2.x */
public final class C75763x implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ RadarTipsView f222365a;

    public C75763x(RadarTipsView radarTipsView) {
        this.f222365a = radarTipsView;
    }

    public void onAnimationEnd(Animation animation) {
        C87412m.m108594g(animation, "animation");
        RadarTipsView radarTipsView = this.f222365a;
        if (!radarTipsView.f203341r) {
            radarTipsView.f203330d.sendEmptyMessage(0);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }
}
