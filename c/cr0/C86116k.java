package cr0;

import android.provider.Settings;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: cr0.k */
public final class C86116k implements C84800z1.C84802b {

    /* renamed from: a */
    public final /* synthetic */ C86117l f250628a;

    public C86116k(C86117l lVar) {
        this.f250628a = lVar;
    }

    /* renamed from: a */
    public final void mo22146a(C84800z1.C84801a aVar, C84800z1.C84801a aVar2) {
        boolean z = false;
        if (Settings.System.getInt(this.f250628a.f250632b.getContentResolver(), "accelerometer_rotation", 0) == 0) {
            z = true;
        }
        String str = this.f250628a.f250631a;
        Log.m105918d(str, "onFourOrientationsChange, newOrientation: " + aVar2 + ", isSystemOrientationLocked: " + z);
        if (!z) {
            C86117l lVar = this.f250628a;
            if (lVar.f250633c != aVar2) {
                for (C86118m a : lVar.f250636f) {
                    C87412m.m108593f(aVar2, "newOrientation");
                    a.mo120540a(aVar2);
                }
                C86117l lVar2 = this.f250628a;
                C87412m.m108593f(aVar2, "newOrientation");
                lVar2.f250633c = aVar2;
            }
        }
        C86117l lVar3 = this.f250628a;
        C87412m.m108593f(aVar2, "newOrientation");
        lVar3.getClass();
    }
}
