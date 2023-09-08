package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/MaxWidthLinearLayout;", "Landroid/widget/LinearLayout;", "", "d", "I", "getMaxWidthPixels", "()I", "maxWidthPixels", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.MaxWidthLinearLayout */
public final class MaxWidthLinearLayout extends LinearLayout {

    /* renamed from: d */
    public final int f12119d = 1073741823;

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int getMaxWidthPixels() {
        return this.f12119d;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f12119d, Integer.MIN_VALUE), i2);
    }

    public MaxWidthLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
