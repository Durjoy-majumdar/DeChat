package lo2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import lo2.C99520a0;

/* renamed from: lo2.z */
public class C99577z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f291878d;

    /* renamed from: e */
    public final /* synthetic */ boolean f291879e;

    public C99577z(ArrayList arrayList, boolean z) {
        this.f291878d = arrayList;
        this.f291879e = z;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$2");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f291878d;
        boolean z = this.f291879e;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        SnsMethodCalculate.markStartTimeMs("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (arrayList == null || arrayList.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        } else {
            Iterator it = arrayList.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                C99520a0.C99521a aVar = (C99520a0.C99521a) it.next();
                if (!TextUtils.isEmpty(aVar.f291756a)) {
                    if (aVar.f291758c == 2) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                }
            }
            if (z2 || z3) {
                C99520a0.m129874d(arrayList, z, z2, z3);
            } else {
                Log.m105924i("AdWeAppPreloader", "doPreloadWeAppEnvForNativeLandingPage, preloadWeAppPkg=" + z + ", no weAppUserName");
            }
            SnsMethodCalculate.markEndTimeMs("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        }
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        Log.m105924i("AdWeAppPreloader", "---checkPreloadWeAppEnvForNativeLandingPage, timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$2");
    }
}
