package rq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;
import zq2.C103063b;

/* renamed from: rq2.h */
public class C101422h implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ C103063b f297067a;

    /* renamed from: b */
    public final /* synthetic */ String f297068b;

    /* renamed from: c */
    public final /* synthetic */ float f297069c;

    public C101422h(C103063b bVar, String str, float f) {
        this.f297067a = bVar;
        this.f297068b = str;
        this.f297069c = f;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        Log.m105920e("SnsAd.AdImageLoader", "onDownloadError, hash=" + this.f297067a.hashCode() + ", url=" + this.f297068b);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        try {
            Log.m105918d("SnsAd.AdImageLoader", "loadImageByCdn, succ, hash=" + this.f297067a.hashCode() + ", url=" + this.f297068b);
            C101419f.m133079b(this.f297067a, str, this.f297069c);
        } catch (Throwable th) {
            Log.m105920e("SnsAd.AdImageLoader", "loadImageByCdn, onDownloaded, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }
}
