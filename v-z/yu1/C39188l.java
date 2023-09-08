package yu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.VoIPFlutterPluginApi;

/* renamed from: yu1.l */
public final class C39188l<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

    /* renamed from: a */
    public final /* synthetic */ boolean f105430a;

    public C39188l(boolean z) {
        this.f105430a = z;
    }

    public void reply(Object obj) {
        Void voidR = (Void) obj;
        Log.m105924i("MicroMsg.FlutterVoipService", "onSystemRotateLockedChanged: " + this.f105430a + ", callback");
    }
}
