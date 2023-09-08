package wo2;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pp2.C47518b;
import qp2.C101232a;
import wo2.C102471g;

/* renamed from: wo2.f */
public final class C102470f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Parcelable f301747d;

    public C102470f(Parcelable parcelable) {
        this.f301747d = parcelable;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion$callOnSubThread$1");
        C102471g.C102472a aVar = C102471g.f301748d;
        Parcelable parcelable = this.f301747d;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
        C87412m.m108594g(parcelable, "obj");
        try {
            SnsMethodCalculate.markStartTimeMs("access$getCurrentRemoteProxy$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
            C47518b bVar = C102471g.f301750f;
            SnsMethodCalculate.markEndTimeMs("access$getCurrentRemoteProxy$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
            boolean z = true;
            if (bVar == null || !aVar.mo142081a(bVar)) {
                z = false;
            }
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
            } else {
                SnsMethodCalculate.markStartTimeMs("access$getCurrentRemoteProxy$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
                C47518b bVar2 = C102471g.f301750f;
                SnsMethodCalculate.markEndTimeMs("access$getCurrentRemoteProxy$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
                if (bVar2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("obj", parcelable);
                    ((C101232a) bVar2).mo140694d(bundle);
                }
                SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
            }
        } catch (Throwable th) {
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
            Log.printErrStackTrace("AdLandingIPCCall", th, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdMMIPCProxy$Companion$callOnSubThread$1");
    }
}
