package yu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.VoIPFlutterPluginApi;

/* renamed from: yu1.f */
public final class C112499f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPFlutterApi f336913d;

    /* renamed from: e */
    public final /* synthetic */ VoIPFlutterPluginApi.FLIntType f336914e;

    /* renamed from: yu1.f$a */
    public static final class C112500a<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public static final C112500a<T> f336915a = new C112500a<>();

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback onError");
        }
    }

    public C112499f(VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi, VoIPFlutterPluginApi.FLIntType fLIntType) {
        this.f336913d = voIPFlutterApi;
        this.f336914e = fLIntType;
    }

    public final void run() {
        this.f336913d.onError(this.f336914e, C112500a.f336915a);
    }
}
