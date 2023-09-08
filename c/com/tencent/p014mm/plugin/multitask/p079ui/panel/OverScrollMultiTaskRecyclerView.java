package com.tencent.p014mm.plugin.multitask.p079ui.panel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/OverScrollMultiTaskRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;", "Lcom/tencent/mm/plugin/multitask/ui/panel/OverScrollMultiTaskVerticalBehavior;", "getBehavior", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskRecyclerView */
public final class OverScrollMultiTaskRecyclerView extends WxRecyclerView implements CoordinatorLayout.C54199b {

    /* renamed from: E1 */
    public final OverScrollMultiTaskVerticalBehavior f315166E1 = new OverScrollMultiTaskVerticalBehavior();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverScrollMultiTaskRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public OverScrollMultiTaskVerticalBehavior getBehavior() {
        return this.f315166E1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverScrollMultiTaskRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
