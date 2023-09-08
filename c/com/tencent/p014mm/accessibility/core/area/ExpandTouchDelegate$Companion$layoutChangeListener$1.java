package com.tencent.p014mm.accessibility.core.area;

import android.view.View;
import com.tencent.p014mm.accessibility.uitl.TimeBlocker;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, mo182094d2 = {"com/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion$layoutChangeListener$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lrx3/b0;", "onLayoutChange", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1 */
public final class ExpandTouchDelegate$Companion$layoutChangeListener$1 implements View.OnLayoutChangeListener {
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C87412m.m108594g(view, "v");
        TimeBlocker.INSTANCE.pendingExcu(view, "onLayoutChange", new C104575xba8ec8dd(view, this));
    }
}
