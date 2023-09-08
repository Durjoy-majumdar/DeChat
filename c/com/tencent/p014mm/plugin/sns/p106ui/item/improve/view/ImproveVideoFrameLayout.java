package com.tencent.p014mm.plugin.sns.p106ui.item.improve.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/view/ImproveVideoFrameLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Lrx3/b0;", "d", "Lfy3/a;", "getVideoRemoveCallback", "()Lfy3/a;", "setVideoRemoveCallback", "(Lfy3/a;)V", "videoRemoveCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout */
public final class ImproveVideoFrameLayout extends FrameLayout {

    /* renamed from: d */
    public C32224a<C13598b0> f206193d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveVideoFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C32224a<C13598b0> getVideoRemoveCallback() {
        SnsMethodCalculate.markStartTimeMs("getVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        C32224a<C13598b0> aVar = this.f206193d;
        SnsMethodCalculate.markEndTimeMs("getVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        return aVar;
    }

    public void removeView(View view) {
        SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        super.removeView(view);
        C32224a<C13598b0> aVar = this.f206193d;
        if (aVar != null) {
            aVar.invoke();
        }
        SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
    }

    public final void setVideoRemoveCallback(C32224a<C13598b0> aVar) {
        SnsMethodCalculate.markStartTimeMs("setVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
        this.f206193d = aVar;
        SnsMethodCalculate.markEndTimeMs("setVideoRemoveCallback", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveVideoFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
