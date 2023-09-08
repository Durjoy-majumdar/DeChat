package ut2;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.List;

/* renamed from: ut2.h */
public final class C102093h extends WindowInsetsAnimation.Callback {

    /* renamed from: a */
    public final /* synthetic */ ImproveInputUIC f300631a;

    /* renamed from: b */
    public final /* synthetic */ View f300632b;

    /* renamed from: c */
    public final /* synthetic */ SnsCommentFooter f300633c;

    /* renamed from: d */
    public final /* synthetic */ int f300634d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102093h(ImproveInputUIC improveInputUIC, View view, SnsCommentFooter snsCommentFooter, int i) {
        super(1);
        this.f300631a = improveInputUIC;
        this.f300632b = view;
        this.f300633c = snsCommentFooter;
        this.f300634d = i;
    }

    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        SnsMethodCalculate.markStartTimeMs("onEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        C87412m.m108594g(windowInsetsAnimation, "animation");
        C102093h.super.onEnd(windowInsetsAnimation);
        ImproveInputUIC improveInputUIC = this.f300631a;
        View view = this.f300632b;
        SnsCommentFooter snsCommentFooter = this.f300633c;
        int i = this.f300634d;
        SnsMethodCalculate.markStartTimeMs("access$scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.mo133293n3(view, snsCommentFooter, i);
        SnsMethodCalculate.markEndTimeMs("access$scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        this.f300633c.setWindowInsetsAnimationCallback((WindowInsetsAnimation.Callback) null);
        SnsMethodCalculate.markEndTimeMs("onEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
    }

    public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
        SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        C87412m.m108594g(windowInsets, "insets");
        C87412m.m108594g(list, "animations");
        SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        return windowInsets;
    }
}
