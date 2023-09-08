package fg2;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.radar.p091ui.RadarTipsView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: fg2.w */
public final class C75762w extends C87413o implements C32224a<Animation> {

    /* renamed from: d */
    public final /* synthetic */ RadarTipsView f222364d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75762w(RadarTipsView radarTipsView) {
        super(0);
        this.f222364d = radarTipsView;
    }

    public Object invoke() {
        return AnimationUtils.loadAnimation(this.f222364d.getContext(), C0966R.C0968anim.f2478e2);
    }
}
