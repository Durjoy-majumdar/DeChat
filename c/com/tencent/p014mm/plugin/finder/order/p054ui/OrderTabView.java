package com.tencent.p014mm.plugin.finder.order.p054ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;
import wn1.C15556f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/order/ui/OrderTabView;", "Landroid/widget/FrameLayout;", "Lwn1/f;", "e", "Lwn1/f;", "getController", "()Lwn1/f;", "setController", "(Lwn1/f;)V", "controller", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.order.ui.OrderTabView */
public final class OrderTabView extends FrameLayout {

    /* renamed from: d */
    public final String f15853d = "Finder.OrderTabView";

    /* renamed from: e */
    public C15556f f15854e;

    /* renamed from: f */
    public WxRecyclerView f15855f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C15556f getController() {
        return this.f15854e;
    }

    public final WxRecyclerView getRecyclerView() {
        return this.f15855f;
    }

    public final void setController(C15556f fVar) {
        this.f15854e = fVar;
    }

    public final void setRecyclerView(WxRecyclerView wxRecyclerView) {
        this.f15855f = wxRecyclerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
