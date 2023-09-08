package ps2;

import a14.C53916l;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kotlin.Result;
import ps2.C100880k;

/* renamed from: ps2.p */
public final class C62494p implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ C53916l<String> f177533a;

    public C62494p(C53916l<? super String> lVar) {
        this.f177533a = lVar;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImgWithPath$2$1");
        this.f177533a.resumeWith(Result.m168114constructorimpl((Object) null));
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImgWithPath$2$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImgWithPath$2$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImgWithPath$2$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImgWithPath$2$1");
        this.f177533a.resumeWith(Result.m168114constructorimpl(str));
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImgWithPath$2$1");
    }
}
