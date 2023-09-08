package i01;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.Socket;

/* renamed from: i01.b */
public final class C108316b {

    /* renamed from: a */
    public C76253c f324333a;

    /* renamed from: b */
    public Socket f324334b;

    public C108316b() {
        C76253c cVar = C76253c.DISCONNECTED;
        this.f324333a = cVar;
        Log.m105924i("ScreenRecord.Main", "try socket init ");
        this.f324333a = cVar;
        Socket socket = new Socket();
        this.f324334b = socket;
        Log.m105924i("ScreenRecord.Main", "socket:" + this.f324334b + ',' + socket);
    }
}
