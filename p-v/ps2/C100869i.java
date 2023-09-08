package ps2;

import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86013q1;
import vr2.C37817q;

/* renamed from: ps2.i */
public class C100869i extends C100864f {

    /* renamed from: f */
    public final String f295403f;

    /* renamed from: g */
    public final String f295404g;

    /* renamed from: h */
    public final String f295405h;

    /* renamed from: i */
    public final int f295406i;

    /* renamed from: j */
    public final C100870a f295407j;

    /* renamed from: ps2.i$a */
    public interface C100870a {
    }

    public C100869i(String str, String str2, String str3, int i, C100870a aVar) {
        C86013q1.m106461v(str2);
        this.f295394a = str;
        this.f295403f = str2;
        this.f295404g = str3;
        this.f295405h = str2 + str3;
        this.f295406i = i;
        this.f295407j = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C100870a m132168a(C100869i iVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        C100870a aVar = iVar.f295407j;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        return aVar;
    }

    /* renamed from: b */
    public void mo140339b(String str) {
        SnsMethodCalculate.markStartTimeMs("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        int i = 0;
        String str2 = "0";
        try {
            if (C86013q1.m106450k(str)) {
                str2 = "1";
                if (C86013q1.m106447h(str)) {
                    i = 1;
                    Log.m105920e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, succ");
                } else {
                    Log.m105920e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, failed");
                }
            } else {
                Log.m105920e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, file not exists");
            }
            String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
            int i2 = this.f295406i;
            C37817q.m41545a("sight_del_err_file", str2, i2, i, "cdn|" + formatedNetType);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
    }

    public Object doInBackground(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        Void[] voidArr = (Void[]) objArr;
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        try {
            AdLandingPagesProxy.getInstance().downloadLandingPagesCDNFile(this.f295403f, this.f295404g, this.f295394a, this.f295406i, new C100865g(this));
        } catch (Exception e) {
            String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
            Log.m105920e("MicroMsg.AdLandingPageDownloadCDNFileTask", "doInBackground exp, netType=" + formatedNetType + ", exp=" + e.toString() + ", url=" + this.f295394a);
            mo140339b(this.f295405h);
            MMHandlerThread.postToMainThread(new C100868h(this));
        }
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        return null;
    }
}
