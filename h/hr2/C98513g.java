package hr2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: hr2.g */
public class C98513g extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ TwistCoverView f288913d;

    public C98513g(TwistCoverView twistCoverView) {
        this.f288913d = twistCoverView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$4");
        TwistCoverView twistCoverView = this.f288913d;
        int i = TwistCoverView.f274546C;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        Handler handler = twistCoverView.f274567y;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        handler.sendEmptyMessageDelayed(4, 500);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$4");
    }
}
