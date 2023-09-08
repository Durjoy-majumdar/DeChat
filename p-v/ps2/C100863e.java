package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ps2.e */
public class C100863e<T> {
    /* renamed from: a */
    public T mo140335a(C95295z zVar, Class<T> cls) {
        SnsMethodCalculate.markStartTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
        if (zVar == null) {
            SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
            return null;
        } else if (cls.isInstance(zVar)) {
            SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
            return zVar;
        } else {
            try {
                if (zVar instanceof C95250a) {
                    for (C95295z a : ((C95250a) zVar).mo130196E()) {
                        T a2 = mo140335a(a, cls);
                        if (a2 != null) {
                            SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
                            return a2;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageCompFinder", "findCardComp, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
            return null;
        }
    }
}
