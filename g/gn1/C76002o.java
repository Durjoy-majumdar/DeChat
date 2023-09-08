package gn1;

import android.content.DialogInterface;
import cc2.C67350b;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C89137b0;

/* renamed from: gn1.o */
public final class C76002o implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f222857d;

    public C76002o(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f222857d = nearbyPersonV1UIC;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f222857d.f198111x = true;
        C85405m.m105415e(11);
        if (this.f222857d.f222830d != null) {
            C89137b0 d = C86709a0.m107524d();
            C67350b bVar = this.f222857d.f222830d;
            C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123458d((C117747y) bVar);
        }
        Log.m105924i("NearbyPersonUIC", "showLoadingDialog  [loading cancel] cancel in loading");
        if (!this.f222857d.f198106s) {
            Log.m105924i("NearbyPersonUIC", "showLoadingDialog [loading cancel] cancel in first loading");
        }
    }
}
