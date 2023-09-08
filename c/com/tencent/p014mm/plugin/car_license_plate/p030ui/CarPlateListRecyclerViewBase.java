package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarPlateListRecyclerViewBase;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarPlateListRecyclerViewBase */
public final class CarPlateListRecyclerViewBase extends MRecyclerView {
    public CarPlateListRecyclerViewBase(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RecyclerView.C16616j itemAnimator = getItemAnimator();
        boolean z = true;
        if (itemAnimator == null || !itemAnimator.mo17325n()) {
            z = false;
        }
        if (z) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RecyclerView.C16616j itemAnimator = getItemAnimator();
        boolean z = true;
        if (itemAnimator == null || !itemAnimator.mo17325n()) {
            z = false;
        }
        if (z) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerView.C16616j itemAnimator = getItemAnimator();
        boolean z = true;
        if (itemAnimator == null || !itemAnimator.mo17325n()) {
            z = false;
        }
        if (z) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException unused) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            return super.onTouchEvent(obtain);
        }
    }

    public CarPlateListRecyclerViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CarPlateListRecyclerViewBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
