package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import qs2.C101255a0;

/* renamed from: ps2.m */
public class C100883m<T> {
    /* renamed from: a */
    public T mo140351a(C101255a0 a0Var, Class<T> cls) {
        List<C101255a0> a;
        SnsMethodCalculate.markStartTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
        if (a0Var == null) {
            SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
            return null;
        } else if (cls.isInstance(a0Var)) {
            SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
            return a0Var;
        } else {
            try {
                if (C100894u.m132237q(a0Var.f296505k) && (a = a0Var.mo140732a()) != null) {
                    for (C101255a0 a2 : a) {
                        T a3 = mo140351a(a2, cls);
                        if (a3 != null) {
                            SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
                            return a3;
                        }
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageInfoFinder", "findCardInfo, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
            return null;
        }
    }
}
