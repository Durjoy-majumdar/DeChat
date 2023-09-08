package lo2;

import a14.C53916l;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Result;
import ps2.C100880k;

/* renamed from: lo2.v */
public final class C61332v implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ String f174479a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<String> f174480b;

    public C61332v(String str, C53916l<? super String> lVar) {
        this.f174479a = str;
        this.f174480b = lVar;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        C61326u.f174449a.mo86287d();
        Log.m105920e("AdQrClickHelper", "res " + this.f174479a + "  failed!");
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        C87412m.m108594g(str, "path");
        this.f174480b.resumeWith(Result.m168114constructorimpl(str));
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }
}
