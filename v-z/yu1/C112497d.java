package yu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.VoIPFlutterPluginApi;
import p492dn.C107054l;

/* renamed from: yu1.d */
public final class C112497d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoIPFlutterPluginApi.AudioRouteInfo f336910d;

    /* renamed from: e */
    public final /* synthetic */ C107054l.C107055a f336911e;

    /* renamed from: yu1.d$a */
    public static final class C112498a<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public final /* synthetic */ C107054l.C107055a f336912a;

        public C112498a(C107054l.C107055a aVar) {
            this.f336912a = aVar;
        }

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback onAudioOutputDeviceChanged(" + this.f336912a + ')');
        }
    }

    public C112497d(VoIPFlutterPluginApi.AudioRouteInfo audioRouteInfo, C107054l.C107055a aVar) {
        this.f336910d = audioRouteInfo;
        this.f336911e = aVar;
    }

    public final void run() {
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onAudioOutputDeviceChanged(this.f336910d, new C112498a(this.f336911e));
        }
    }
}
