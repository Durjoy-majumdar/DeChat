package fg2;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.p091ui.RadarStateView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: fg2.r */
public final class C45778r extends C87413o implements C32224a<Animation> {

    /* renamed from: d */
    public final /* synthetic */ RadarStateView f123674d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45778r(RadarStateView radarStateView) {
        super(0);
        this.f123674d = radarStateView;
    }

    public Object invoke() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f123674d.getContext(), C0966R.C0968anim.f2476e0);
        loadAnimation.setAnimationListener(new C45777q(this.f123674d));
        return loadAnimation;
    }
}
