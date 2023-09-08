package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import android.app.Instrumentation;
import android.content.Intent;
import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateListUI;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateListViewContract$ViewModel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.r0 */
public final class C82200r0 extends C87413o implements C32226l<Instrumentation.ActivityResult, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C82185m0 f241071d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82200r0(C82185m0 m0Var) {
        super(1);
        this.f241071d = m0Var;
    }

    public Object invoke(Object obj) {
        ArrayList<String> arrayList;
        Instrumentation.ActivityResult activityResult = (Instrumentation.ActivityResult) obj;
        C87412m.m108594g(activityResult, LocaleUtil.ITALIAN);
        int resultCode = activityResult.getResultCode();
        Intent resultData = activityResult.getResultData();
        if (-1 == resultCode && resultData != null) {
            ArrayList<String> stringArrayListExtra = resultData.getStringArrayListExtra("RESULT_KEY_UPDATED_LIST");
            CarLicensePlateListViewContract$ViewModel h = this.f241071d.mo114595h();
            C82185m0 m0Var = this.f241071d;
            MMCarLicensePlateInfo mMCarLicensePlateInfo = h.f248031d;
            if (mMCarLicensePlateInfo == null || (arrayList = mMCarLicensePlateInfo.f247996d) == null) {
                arrayList = new ArrayList<>();
            }
            C54248l.C54251c a = C54248l.m60949a(new CarLicensePlateListUI.C85124b(arrayList, stringArrayListExtra == null ? new ArrayList<>() : stringArrayListExtra), true);
            C8477a0 a0Var = new C8477a0();
            a.mo75045a(new C55473q0(a0Var));
            if (a0Var.f27482d) {
                h.mo118135b(stringArrayListExtra);
                m0Var.mo110053a(h.f248031d);
            }
        }
        return C13598b0.f38549a;
    }
}
