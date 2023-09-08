package yu2;

import bv2.C92320h;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import te3.C101804kv2;

/* renamed from: yu2.b */
public final class C102920b implements C92320h.C92321a {

    /* renamed from: a */
    public final /* synthetic */ String f303779a;

    /* renamed from: b */
    public final /* synthetic */ C102914a f303780b;

    /* renamed from: c */
    public final /* synthetic */ C101804kv2 f303781c;

    /* renamed from: d */
    public final /* synthetic */ String f303782d;

    public C102920b(String str, C102914a aVar, C101804kv2 kv22, String str2) {
        this.f303779a = str;
        this.f303780b = aVar;
        this.f303781c = kv22;
        this.f303782d = str2;
    }

    /* renamed from: a */
    public void mo126322a() {
        SnsMethodCalculate.markStartTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        boolean k = C86013q1.m106450k(this.f303779a);
        Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsVideoByCdn onCompleted, cdn video fileExist:" + k + ", path:" + this.f303779a);
        if (k) {
            C102914a aVar = this.f303780b;
            String str = this.f303779a;
            C87412m.m108593f(str, "mediaPath");
            aVar.mo142633a(str, this.f303781c);
        } else {
            C102914a.m136062c(this.f303780b, (String) null, 1, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    /* renamed from: b */
    public void mo126323b(Exception exc) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        C87412m.m108594g(exc, "exception");
        boolean k = C86013q1.m106450k(this.f303779a);
        Log.m105920e("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsVideoByCdn onError, thread name:" + Thread.currentThread().getName() + ", localId:" + this.f303782d + ", fileExist:" + k + ", path:" + this.f303779a);
        C102914a.m136062c(this.f303780b, (String) null, 1, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    /* renamed from: c */
    public void mo126324c(CdnLogic.VideoInfo videoInfo) {
        SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    public void onProgress(float f) {
        SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }
}
