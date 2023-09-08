package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import jq2.C33629d;
import p166hy.C98559a0;
import ps2.C100869i;
import ps2.C100871j;

/* renamed from: ps2.g */
public class C100865g implements C98559a0 {

    /* renamed from: a */
    public final /* synthetic */ C100869i f295399a;

    /* renamed from: ps2.g$a */
    public class C100866a implements Runnable {
        public C100866a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$1");
            ((C100871j.C100879e) C100869i.m132168a(C100865g.this.f295399a)).mo140347a();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$1");
        }
    }

    /* renamed from: ps2.g$b */
    public class C100867b implements Runnable {
        public C100867b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$2");
            C100869i.C100870a a = C100869i.m132168a(C100865g.this.f295399a);
            C100869i iVar = C100865g.this.f295399a;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
            String str = iVar.f295405h;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
            C100871j.C100879e eVar = (C100871j.C100879e) a;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
            Log.m105925i("MicroMsg.AdLandingPageDownloadFileHelper", " download success for cdn file %s, path %s", eVar.f295421b, str);
            eVar.f295420a.mo76115c(eVar.f295423d);
            if (eVar.f295422c == 0) {
                C33629d.m40145b(0, 1, 1, eVar.f295421b);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1$2");
        }
    }

    public C100865g(C100869i iVar) {
        this.f295399a = iVar;
    }

    /* renamed from: a */
    public void mo121891a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
        String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
        Log.m105920e("MicroMsg.AdLandingPageDownloadCDNFileTask", "onDownloadError, netType=" + formatedNetType + ", url=" + this.f295399a.f295394a);
        C100869i iVar = this.f295399a;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        String str = iVar.f295405h;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        iVar.mo140339b(str);
        if (C100869i.m132168a(this.f295399a) != null) {
            MMHandlerThread.postToMainThread(new C100866a());
        }
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
    }

    /* renamed from: b */
    public void mo121892b() {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
        if (C100869i.m132168a(this.f295399a) != null) {
            MMHandlerThread.postToMainThread(new C100867b());
        }
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask$1");
    }
}
