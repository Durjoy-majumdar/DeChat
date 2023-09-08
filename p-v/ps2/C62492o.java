package ps2;

import a14.C53916l;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import kotlin.Result;
import ps2.C100880k;
import zt3.C119157j;

/* renamed from: ps2.o */
public final class C62492o implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ C53916l<Bitmap> f177530a;

    /* renamed from: ps2.o$a */
    public static final class C62493a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53916l<Bitmap> f177531d;

        /* renamed from: e */
        public final /* synthetic */ String f177532e;

        public C62493a(C53916l<? super Bitmap> lVar, String str) {
            this.f177531d = lVar;
            this.f177532e = str;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1$onDownloaded$1");
            C53916l<Bitmap> lVar = this.f177531d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(BitmapUtil.decodeFile(this.f177532e, (BitmapFactory.Options) null)));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1$onDownloaded$1");
        }
    }

    public C62492o(C53916l<? super Bitmap> lVar) {
        this.f177530a = lVar;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1");
        this.f177530a.resumeWith(Result.m168114constructorimpl((Object) null));
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1");
        ((C119157j) C119157j.f356862d).mo183884o(new C62493a(this.f177530a, str));
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2$downloadImg$2$1");
    }
}
