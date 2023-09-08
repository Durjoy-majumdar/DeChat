package fg2;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.p091ui.RadarTipsView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: fg2.y */
public final class C75764y extends C87413o implements C32224a<Animation> {

    /* renamed from: d */
    public final /* synthetic */ RadarTipsView f222366d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75764y(RadarTipsView radarTipsView) {
        super(0);
        this.f222366d = radarTipsView;
    }

    public Object invoke() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f222366d.getContext(), C0966R.C0968anim.f2479e3);
        loadAnimation.setAnimationListener(new C75763x(this.f222366d));
        return loadAnimation;
    }
}
