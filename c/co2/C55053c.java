package co2;

import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: co2.c */
public class C55053c implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ String f154581a;

    public C55053c(AdClickActionInfo adClickActionInfo, String str) {
        this.f154581a = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo$1");
        Log.m105920e("AdClickActionInfo", "emojiUrl " + this.f154581a + "  failed!");
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo$1");
        Log.m105924i("AdClickActionInfo", "onDownloaded emojiUrl " + this.f154581a + "  path " + str);
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo$1");
    }
}
