package lo2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: lo2.k0 */
public class C99551k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f291827d;

    /* renamed from: e */
    public final /* synthetic */ int f291828e;

    public C99551k0(SnsInfo snsInfo, int i) {
        this.f291827d = snsInfo;
        this.f291828e = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        try {
            Context context = MMApplicationContext.getContext();
            C99544i0.m129914a(context, this.f291827d.getAdXml(), this.f291827d, this.f291828e);
            C99544i0.m129915b(context, this.f291827d.getAdInfo(this.f291828e), this.f291827d, this.f291828e);
        } catch (Throwable th) {
            Log.m105920e("FinderAdPreloadHelper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
    }
}
