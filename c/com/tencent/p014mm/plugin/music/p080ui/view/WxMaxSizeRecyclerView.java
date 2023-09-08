package com.tencent.p014mm.plugin.music.p080ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;
import ya2.C15944k;
import ya2.C15945l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "maxHeight", "Lrx3/b0;", "setMaxHeight", "maxWidth", "setMaxWidth", "getMaxHeight", "getMaxWidth", "Lcom/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$a;", "marginClickListener", "setMarginClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-music_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.music.ui.view.WxMaxSizeRecyclerView */
public final class WxMaxSizeRecyclerView extends WxRecyclerView {

    /* renamed from: E1 */
    public int f20045E1;

    /* renamed from: F1 */
    public int f20046F1;

    /* renamed from: com.tencent.mm.plugin.music.ui.view.WxMaxSizeRecyclerView$a */
    public interface C4917a {
        /* renamed from: a */
        void mo5850a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxMaxSizeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setOnTouchListener(new C15944k(new GestureDetector(getContext(), new C15945l(this))));
    }

    public final int getMaxHeight() {
        return this.f20045E1;
    }

    public final int getMaxWidth() {
        return this.f20046F1;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f20045E1;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.f20046F1;
        if (i4 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setMarginClickListener(C4917a aVar) {
        C87412m.m108594g(aVar, "marginClickListener");
    }

    public final void setMaxHeight(int i) {
        this.f20045E1 = i;
        invalidate();
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.f20046F1 = i;
        invalidate();
        requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxMaxSizeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setOnTouchListener(new C15944k(new GestureDetector(getContext(), new C15945l(this))));
    }
}
