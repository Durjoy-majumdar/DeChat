package ju2;

import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.PopupWindow;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ju2.d */
public final class C99044d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f290343d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99044d(boolean z) {
        super(0);
        this.f290343d = z;
    }

    public Object invoke() {
        View contentView;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        if (this.f290343d) {
            SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            PopupWindow popupWindow = C99045e.f290347d;
            SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (!(popupWindow == null || (contentView = popupWindow.getContentView()) == null)) {
                SnsMethodCalculate.markStartTimeMs("access$getCommentOutAnim$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                TranslateAnimation translateAnimation = C99045e.f290346c;
                SnsMethodCalculate.markEndTimeMs("access$getCommentOutAnim$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                contentView.startAnimation(translateAnimation);
            }
        } else {
            SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            PopupWindow popupWindow2 = C99045e.f290347d;
            SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$dismissCommentWindow$1");
        return b0Var;
    }
}
