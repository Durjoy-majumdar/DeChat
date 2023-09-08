package com.tencent.p014mm.plugin.vlog.p117ui.thumb;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/EditFrameListContainer;", "Landroid/widget/FrameLayout;", "", "getLayoutDirection", "layoutDirection", "Lrx3/b0;", "setLayoutDirection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListContainer */
public final class EditFrameListContainer extends FrameLayout {

    /* renamed from: d */
    public int f21679d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFrameListContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public int getLayoutDirection() {
        return this.f21679d;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.m105918d("EditFrameListContainer", "onDraw, " + this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Log.m105918d("EditFrameListContainer", "onLayout, " + this + ", LayoutDirection:" + this.f21679d);
    }

    public void setLayoutDirection(int i) {
        this.f21679d = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditFrameListContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
