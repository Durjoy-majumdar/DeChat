package fg2;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.p091ui.RadarStateChooseView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: fg2.p */
public final class C45776p extends C87413o implements C32224a<Animation> {

    /* renamed from: d */
    public final /* synthetic */ RadarStateChooseView f123672d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45776p(RadarStateChooseView radarStateChooseView) {
        super(0);
        this.f123672d = radarStateChooseView;
    }

    public Object invoke() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f123672d.getContext(), C0966R.C0968anim.f2475dz);
        loadAnimation.setAnimationListener(new C45775o());
        return loadAnimation;
    }
}
