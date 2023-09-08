package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicLyricLineView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicLyricLineView */
public final class MusicLyricLineView extends RecyclerView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicLyricLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicLyricLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
