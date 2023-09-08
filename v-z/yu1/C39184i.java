package yu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.VoIPFlutterPluginApi;

/* renamed from: yu1.i */
public final class C39184i<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

    /* renamed from: a */
    public final /* synthetic */ int f105425a;

    public C39184i(int i) {
        this.f105425a = i;
    }

    public void reply(Object obj) {
        Void voidR = (Void) obj;
        Log.m105924i("MicroMsg.FlutterVoipService", "onPhysicalOrientationChanged: " + this.f105425a + ", callback");
    }
}
