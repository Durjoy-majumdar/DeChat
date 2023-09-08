package em0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85153j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p576jp.C33610c;
import p576jp.C88007b;

/* renamed from: em0.t */
public class C86574t {

    /* renamed from: em0.t$a */
    public class C86575a implements C85147b<String> {
        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            String str2 = (String) obj;
            Log.m105924i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUp VoIP Talking exit room");
        }
    }

    /* renamed from: a */
    public static void m107377a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105924i("MicroMsg.OpenVoice.VoIpLogicHandler", "closeFloatBall, appId is empty");
            return;
        }
        Log.m105925i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:closeFloatBall, appId:%s", str);
        AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new AppBrandBackgroundRunningOperationEvent();
        AppBrandBackgroundRunningOperationEvent.C83126a aVar = appBrandBackgroundRunningOperationEvent.f242920d;
        aVar.f242921a = str;
        aVar.f242922b = 16;
        aVar.f242923c = 2;
        appBrandBackgroundRunningOperationEvent.publish();
    }

    /* renamed from: b */
    public static boolean m107378b() {
        Class cls = C88007b.class;
        Log.m105925i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, is1v1:%s", Boolean.valueOf(((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312351N));
        if (((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312350M) {
            Log.m105924i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, stop voip talking");
            C33610c Bp = ((C88007b) C86312j.m106911c(cls)).mo59116Bp();
            C86575a aVar = new C86575a();
            C33610c.C33611a aVar2 = C33610c.C33611a.ReasonWeappStopFromPassiveFloatBall;
            C105181w wVar = (C105181w) Bp;
            wVar.getClass();
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: user triggered exit conference");
            wVar.mo149500g(new C85153j0(wVar, aVar2, aVar));
            return true;
        }
        Log.m105924i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, voip is stopped");
        return false;
    }
}
