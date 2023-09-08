package yu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.VoIPFlutterPluginApi;

/* renamed from: yu1.e */
public final class C39182e<T> implements VoIPFlutterPluginApi.VoIPFlutterApi.Reply {

    /* renamed from: a */
    public final /* synthetic */ int f105423a;

    public C39182e(int i) {
        this.f105423a = i;
    }

    public void reply(Object obj) {
        Void voidR = (Void) obj;
        Log.m105924i("MicroMsg.FlutterVoipService", "callback onConnected(" + this.f105423a + ')');
    }
}
