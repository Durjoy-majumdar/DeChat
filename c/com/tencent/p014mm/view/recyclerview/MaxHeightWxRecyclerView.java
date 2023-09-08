package com.tencent.p014mm.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/MaxHeightWxRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "E1", "I", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "maxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView */
public final class MaxHeightWxRecyclerView extends WxRecyclerView {

    /* renamed from: E1 */
    public int f24984E1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightWxRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final int getMaxHeight() {
        return this.f24984E1;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f24984E1;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeight(int i) {
        this.f24984E1 = i;
    }
}
