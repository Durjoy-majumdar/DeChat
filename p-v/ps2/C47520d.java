package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import e51.C45542a;
import e51.C45543b;

/* renamed from: ps2.d */
public class C47520d implements C45543b {
    public C47520d(C100853b bVar) {
    }

    /* renamed from: a */
    public void mo63984a(C45542a aVar, long j) {
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$3");
        Log.m105918d("MicroMsg.AdDownloadApkMgr", "downloadId=" + j + ", result=" + aVar);
        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$3");
    }
}
