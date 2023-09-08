package ao2;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import jr2.C33652w;
import jr2.C9510k;
import ps2.C100884n;
import vr2.C102260r;

@C86522b
/* renamed from: ao2.f */
public class C92047f extends C86301e implements C9510k {
    public void Ad0(Context context, long j, String str, C33652w wVar) {
        SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        Log.m105924i("SnsAdService", "openAdCanvasById, canvasId=" + j + ", uxInfo=" + str + ", context=" + context + ", bundle=" + wVar);
        C102260r.m134848Q(context, j, mo10203I9(str), wVar);
        SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    /* renamed from: HC */
    public void mo10202HC(long j, String str, String str2, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("preloadAdCanvas", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        try {
            Log.m105924i("SnsAdService", "preloadAdCanvas, canvasId=" + j + ", preloadInnerRes=" + z + ", preloadProcess=" + z2 + ", procName=" + MMApplicationContext.getProcessName() + ", uxInfo=" + str + ", dynamicInfo=" + str2);
            String str3 = "";
            if (!TextUtils.isEmpty(str)) {
                str3 = mo10203I9(str);
            }
            String str4 = str3;
            if (MMApplicationContext.isMainProcess()) {
                SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
                C100884n.m132182b(j, z, str4, str2);
                SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            } else {
                AdLandingPagesProxy.getInstance().doPreloadAdCanvas(j, str4, str2, z);
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1676, 21);
            if (z2) {
                C102260r.m134857Z();
                nVar.mo175911u(1676, 22);
            }
            if (z) {
                nVar.mo175911u(1676, 23);
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAdService", "preloadAdCanvas, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("preloadAdCanvas", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }

    /* renamed from: I9 */
    public String mo10203I9(String str) {
        SnsMethodCalculate.markStartTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        String r = C102260r.m134878r(str);
        SnsMethodCalculate.markEndTimeMs("getAdInfoXml", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        return r;
    }

    /* renamed from: lW */
    public void mo10204lW(long j, String str, String str2, int i) {
        SnsMethodCalculate.markStartTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
        Log.m105924i("SnsAdService", "openAdCanvasById, canvasId=" + j + ", source=" + i + ", adInfoXml=" + str + ", extra=" + str2);
        C102260r.m134847P(j, str, str2, i);
        SnsMethodCalculate.markEndTimeMs("openAdCanvasById", "com.tencent.mm.plugin.sns.ad.SnsAdService");
    }
}
