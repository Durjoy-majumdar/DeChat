package ps2;

import bo2.C92277a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import p749xh.C102646h;
import rq2.C101429o;

/* renamed from: ps2.w */
public class C100900w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f295478d;

    public C100900w(String str) {
        this.f295478d = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$3");
        if (C100894u.m132239s(this.f295478d) || C101429o.m133108a(this.f295478d, C102646h.COL_ADXML)) {
            Log.m105924i("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForMsg");
            C100884n.m132183e().mo140357l(this.f295478d, C102646h.COL_ADXML, (C92277a) null, 5);
        } else {
            Log.m105928w("AdLandingPagesPreDownloadResHelper", "preDownloadAdLandingPagesForMsg, invalid canvas");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper$3");
    }
}
