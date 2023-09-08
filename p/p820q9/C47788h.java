package p820q9;

import android.os.Handler;
import android.os.Message;
import com.tencent.p014mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;

/* renamed from: q9.h */
public final class C47788h extends Handler {

    /* renamed from: a */
    public /* synthetic */ C47787g f128326a;

    public C47788h(C47787g gVar) {
        this.f128326a = gVar;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 100) {
            int i2 = message.getData().getInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            ((ExtControlProviderVoiceControl.C41396d) this.f128326a.f128324a).getClass();
            Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetError:%s", Integer.valueOf(i2));
        } else if (i == 200) {
            C47780a aVar = (C47780a) message.obj;
            ExtControlProviderVoiceControl.C41396d dVar = (ExtControlProviderVoiceControl.C41396d) this.f128326a.f128324a;
            dVar.getClass();
            if (aVar == null) {
                Log.m105928w("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetResult restult is null");
                return;
            }
            Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl use time2:%s,text: %s,name: %s", Long.valueOf(System.currentTimeMillis() - ExtControlProviderVoiceControl.this.f111449w), aVar.f128308a, aVar.f128309b);
            if (!Util.isNullOrNil(aVar.f128309b)) {
                ExtControlProviderVoiceControl extControlProviderVoiceControl = ExtControlProviderVoiceControl.this;
                extControlProviderVoiceControl.f111450x = true;
                extControlProviderVoiceControl.mo64471m(aVar.f128309b);
            }
        }
    }
}
