package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/location/ui/impl/LocationCrossHairView;", "Landroid/widget/FrameLayout;", "", "selected", "Lrx3/b0;", "setSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-map_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView */
public final class LocationCrossHairView extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationCrossHairView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        View childAt = getChildAt(0);
        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((WeImageView) childAt).setIconColor(getResources().getColor(z ? C0966R.color.Blue_80 : C0966R.color.f3133gi));
    }
}
