package ut2;

import android.view.MotionEvent;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveOverScrollView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ju2.C99044d;
import ju2.C99045e;
import o40.C61926c;

/* renamed from: ut2.t */
public final class C102106t extends C102084a implements ImproveOverScrollView.C95894a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102106t(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: Z1 */
    public boolean mo133284Z1(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        C87412m.m108594g(motionEvent, "ev");
        SnsMethodCalculate.markStartTimeMs("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        PopupWindow popupWindow = C99045e.f290347d;
        boolean z = popupWindow != null && popupWindow.isShowing();
        SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (z) {
            SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            PopupWindow popupWindow2 = C99045e.f290347d;
            SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (!isTouchPointInView(popupWindow2 != null ? popupWindow2.getContentView() : null, motionEvent)) {
                SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                C61926c.m72668M(new C99044d(true));
                SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            }
        }
        SnsMethodCalculate.markEndTimeMs("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        return false;
    }
}
