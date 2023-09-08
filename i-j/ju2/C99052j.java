package ju2;

import android.view.animation.Animation;
import android.widget.PopupWindow;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: ju2.j */
public final class C99052j implements Animation.AnimationListener {
    public void onAnimationEnd(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$2");
        SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        PopupWindow popupWindow = C99045e.f290347d;
        SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$2");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$2");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$2");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$2");
    }
}
