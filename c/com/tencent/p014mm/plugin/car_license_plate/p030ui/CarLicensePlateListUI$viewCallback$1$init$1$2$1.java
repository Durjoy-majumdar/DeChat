package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1$init$1$2$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$viewCallback$1$init$1$2$1 */
public final class CarLicensePlateListUI$viewCallback$1$init$1$2$1 extends LinearLayoutManager {
    public CarLicensePlateListUI$viewCallback$1$init$1$2$1(CarLicensePlateListUI carLicensePlateListUI) {
        super(carLicensePlateListUI, 1, false);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        try {
            return super.scrollVerticallyBy(i, rVar, wVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
