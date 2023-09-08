package ps2;

import bo2.C92277a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.Log;
import p749xh.C102646h;

/* renamed from: ps2.x */
public class C100901x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ADInfo f295479d;

    /* renamed from: e */
    public final /* synthetic */ String f295480e;

    public C100901x(ADInfo aDInfo, String str) {
        this.f295479d = aDInfo;
        this.f295480e = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$4");
        ADInfo aDInfo = this.f295479d;
        C92277a adPreloadConfig = aDInfo != null ? aDInfo.getAdPreloadConfig() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("preDownloadAdLandingPagesForAtMsg, preloadConfig=");
        sb.append(adPreloadConfig == null ? "" : adPreloadConfig.toString());
        Log.m105924i("AdLandingPagesPreDownloadResHelper", sb.toString());
        try {
            if (C100894u.m132239s(this.f295480e)) {
                Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg");
                C100884n.m132183e().mo140357l(this.f295480e, C102646h.COL_ADXML, adPreloadConfig, 2);
            } else {
                Log.m105928w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg, inValidCanvas");
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg, exp=" + th.toString());
        }
        try {
            String gestureCanvasInfo = ADXml.getGestureCanvasInfo(this.f295480e);
            if (C100894u.m132239s(gestureCanvasInfo)) {
                Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg for gestureAdXml");
                C100884n.m132183e().mo140357l(gestureCanvasInfo, C102646h.COL_ADXML, adPreloadConfig, 3);
            }
        } catch (Throwable th4) {
            Log.m105920e("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForAtMsg for gestureAdXml, exp=" + th4.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$4");
    }
}
