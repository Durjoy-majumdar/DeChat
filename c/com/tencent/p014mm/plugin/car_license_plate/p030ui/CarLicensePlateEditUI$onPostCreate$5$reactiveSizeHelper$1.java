package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onActivityDestroyed", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 */
public final class CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 implements ViewTreeObserver.OnGlobalLayoutListener, C0124r {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f248010d;

    /* renamed from: e */
    public final /* synthetic */ CarLicensePlateEditUI f248011e;

    public CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1(LinearLayout linearLayout, CarLicensePlateEditUI carLicensePlateEditUI) {
        this.f248010d = linearLayout;
        this.f248011e = carLicensePlateEditUI;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onActivityDestroyed() {
        ViewTreeObserver viewTreeObserver = this.f248010d.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        if (this.f248010d.isLaidOut()) {
            CarLicensePlateEditUI carLicensePlateEditUI = this.f248011e;
            int i = CarLicensePlateEditUI.f248001i;
            if (carLicensePlateEditUI.getContentView().isLaidOut()) {
                float measuredWidth = this.f248010d.getMeasuredWidth() > this.f248011e.getContentView().getMeasuredWidth() ? ((float) this.f248011e.getContentView().getMeasuredWidth()) / ((float) this.f248010d.getMeasuredWidth()) : 1.0f;
                this.f248010d.setScaleX(measuredWidth);
                this.f248010d.setScaleY(measuredWidth);
            }
        }
    }
}
