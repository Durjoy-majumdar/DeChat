package ju2;

import android.view.View;
import android.view.animation.Animation;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: ju2.i */
public final class C99051i implements Animation.AnimationListener {
    public void onAnimationEnd(Animation animation) {
        View contentView;
        View findViewById;
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
        SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        PopupWindow popupWindow = C99045e.f290347d;
        SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (!(popupWindow == null || (contentView = popupWindow.getContentView()) == null || (findViewById = contentView.findViewById(C0966R.C0970id.f5731n3)) == null)) {
            findViewById.sendAccessibilityEvent(128);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
    }

    public void onAnimationRepeat(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
    }

    public void onAnimationStart(Animation animation) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
    }
}
