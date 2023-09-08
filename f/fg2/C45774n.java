package fg2;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.p091ui.RadarStateChooseView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: fg2.n */
public final class C45774n extends C87413o implements C32224a<Animation> {

    /* renamed from: d */
    public final /* synthetic */ RadarStateChooseView f123671d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45774n(RadarStateChooseView radarStateChooseView) {
        super(0);
        this.f123671d = radarStateChooseView;
    }

    public Object invoke() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f123671d.getContext(), C0966R.C0968anim.f2474dy);
        loadAnimation.setAnimationListener(new C45773m(this.f123671d));
        return loadAnimation;
    }
}
