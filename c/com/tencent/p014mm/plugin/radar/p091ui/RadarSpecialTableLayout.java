package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "Landroid/widget/TableLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout */
public final class RadarSpecialTableLayout extends TableLayout {

    /* renamed from: d */
    public boolean f20356d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarSpecialTableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        if (this.f20356d || i2 >= 0) {
            i6 = i2;
            i5 = i4;
            z2 = false;
        } else {
            int i7 = i4 - i2;
            z2 = true;
            i5 = i7;
            i6 = 0;
        }
        this.f20356d = false;
        if (!z2) {
            super.onLayout(z, i, i6, i3, i5);
        } else {
            layout(i, i6, i3, i5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarSpecialTableLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }
}
