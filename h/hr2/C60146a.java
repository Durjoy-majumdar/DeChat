package hr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: hr2.a */
public class C60146a implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ String f171688a;

    public C60146a(String str) {
        this.f171688a = str;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
        Log.m105920e("CardImgCacheUtil", "onDownloadError, url=" + this.f171688a);
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
        Log.m105924i("CardImgCacheUtil", "onDownloaded, url=" + this.f171688a);
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$1");
    }
}
