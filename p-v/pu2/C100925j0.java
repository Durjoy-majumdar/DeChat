package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.w64;

/* renamed from: pu2.j0 */
public final class C100925j0 extends C87413o implements C32229r<View, w64, String, CharSequence, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C100934n0 f295549d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100925j0(C100934n0 n0Var) {
        super(4);
        this.f295549d = n0Var;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$1");
        View view = (View) obj;
        w64 w64 = (w64) obj2;
        String str = (String) obj3;
        CharSequence charSequence = (CharSequence) obj4;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$1");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(w64, "snsCommentInfo");
        C87412m.m108594g(str, "s");
        C87412m.m108594g(charSequence, "charSequence");
        BaseTimeLineItem.BaseViewHolder p = this.f295549d.mo140400p();
        BaseTimeLine baseTimeLine = this.f295549d.getAdapter().f278568b;
        if (baseTimeLine != null) {
            SnsMethodCalculate.markStartTimeMs("createCommentClickListener", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            BaseTimeLine.C95330f fVar = new BaseTimeLine.C95330f(w64, str, charSequence, p);
            SnsMethodCalculate.markEndTimeMs("createCommentClickListener", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            fVar.onClick(view);
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$1");
        return b0Var;
    }
}
