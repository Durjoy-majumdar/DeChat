package ps2;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ps2.C100853b;

/* renamed from: ps2.c */
public class C100861c extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C100853b f295389a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100861c(C100853b bVar, Looper looper) {
        super(looper);
        this.f295389a = bVar;
    }

    public void handleMessage(Message message) {
        SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$2");
        if (message.what == 10008) {
            Log.m105928w("MicroMsg.AdDownloadApkMgr", "unregister package receiver");
            try {
                Context context = MMApplicationContext.getContext();
                C100853b bVar = this.f295389a;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                C100853b.C100855b bVar2 = bVar.f295368a;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
                context.unregisterReceiver(bVar2);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AdDownloadApkMgr", "unregister package receiver, exp=" + e.toString());
            }
            C100853b bVar3 = this.f295389a;
            SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            bVar3.f295369b = false;
            SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        }
        SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$2");
    }
}
