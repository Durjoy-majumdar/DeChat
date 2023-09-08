package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import a14.C0000n0;
import a14.C53930o0;
import com.tencent.p014mm.p136ui.MMActivity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateBaseActivity */
public abstract class CarLicensePlateBaseActivity extends MMActivity {

    /* renamed from: d */
    public final C0000n0 f248000d = C53930o0.m60555b();

    public void onDestroy() {
        if (C53930o0.m60560g(this.f248000d)) {
            C53930o0.m60558e(this.f248000d, (CancellationException) null, 1, (Object) null);
        }
        super.onDestroy();
    }
}
