package yu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.VoIPFlutterPluginApi;

/* renamed from: yu1.k */
public final class C39186k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VoIPFlutterPluginApi.FLBoolType f105427d;

    /* renamed from: e */
    public final /* synthetic */ boolean f105428e;

    /* renamed from: yu1.k$a */
    public static final class C39187a<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

        /* renamed from: a */
        public final /* synthetic */ boolean f105429a;

        public C39187a(boolean z) {
            this.f105429a = z;
        }

        public void reply(Object obj) {
            Void voidR = (Void) obj;
            Log.m105924i("MicroMsg.FlutterVoipService", "callback onScreenStateChanged(" + this.f105429a + ')');
        }
    }

    public C39186k(VoIPFlutterPluginApi.FLBoolType fLBoolType, boolean z) {
        this.f105427d = fLBoolType;
        this.f105428e = z;
    }

    public final void run() {
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onScreenStateChanged(this.f105427d, new C39187a(this.f105428e));
        }
    }
}
