package pu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import uo3.C78253a;

/* renamed from: pu2.k0 */
public final class C62546k0 extends C87413o implements C32228q<View, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C100934n0 f177649d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62546k0(C100934n0 n0Var) {
        super(3);
        this.f177649d = n0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$2");
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$2");
        C87412m.m108594g(view, "view");
        SnsTimeLineBaseAdapter adapter = this.f177649d.getAdapter();
        C78253a k = adapter.mo132921k();
        TimelineClickListener timelineClickListener = adapter.f278572f;
        k.mo108273h(view, timelineClickListener.f280394x, timelineClickListener.f280381k, intValue, intValue2);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$2");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$addCommentClickListener$2");
        return b0Var;
    }
}
