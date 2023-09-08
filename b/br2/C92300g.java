package br2;

import co2.C92445n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.FinderLivingAnimWrapper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: br2.g */
public class C92300g implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ C92445n.C92446a f264128a;

    public C92300g(FinderLivingAnimWrapper finderLivingAnimWrapper, C92445n.C92446a aVar) {
        this.f264128a = aVar;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
        Log.m105920e("FinderLivingAnimWrapper", "onDownloadError, url=" + this.f264128a.f264565a);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
        Log.m105920e("FinderLivingAnimWrapper", "onDownloaded, url=" + this.f264128a.f264565a);
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$2");
    }
}
