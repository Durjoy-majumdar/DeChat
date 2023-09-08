package dp1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C20480e0;
import eb0.C31543z5;

/* renamed from: dp1.g0 */
public final class C7437g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f25627d;

    public C7437g0(int i) {
        this.f25627d = i;
    }

    public final void run() {
        C20480e0.C20481a aVar = C20480e0.f57589g.get(Integer.valueOf(this.f25627d));
        if (aVar == null) {
            aVar = C20480e0.f57583a.mo32032e(this.f25627d);
        }
        boolean z = false;
        if (aVar != null) {
            int i = this.f25627d;
            if (aVar.f57623d > 0) {
                z = true;
                Log.m105924i("Finder.FinderLoadingTimeReporter", "reportViewPagerFirsFrameTime: tabType=" + i + " viewPagerFirstFrameCost=" + (C31543z5.m39453c() - aVar.f57623d) + LocaleUtil.MALAY);
                aVar.f57634i0 = C31543z5.m39453c() - aVar.f57623d;
            }
        }
        if (!z) {
            Log.m105920e("Finder.FinderLoadingTimeReporter", "reportViewPagerFirsFrameTime: report failed, tabType=" + this.f25627d);
        }
    }
}
