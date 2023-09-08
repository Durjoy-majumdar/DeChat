package yu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.VoIPFlutterPluginApi;
import java.util.List;

/* renamed from: yu1.g */
public final class C112501g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List<VoIPFlutterPluginApi.AudioRouteInfo> f336916d;

    /* renamed from: yu1.g$a */
    public static final class C112502a<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public static final C112502a<T> f336917a = new C112502a<>();

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback onExternalAudioOutputDeviceChanged");
        }
    }

    public C112501g(List<VoIPFlutterPluginApi.AudioRouteInfo> list) {
        this.f336916d = list;
    }

    public final void run() {
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onExternalAudioOutputDeviceChanged(this.f336916d, C112502a.f336917a);
        }
    }
}
