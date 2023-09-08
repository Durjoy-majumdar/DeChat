package bo0;

import bo0.C79735e;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bo0.c */
public class C79733c implements C79735e.C79736a {

    /* renamed from: a */
    public final /* synthetic */ C79729a f233693a;

    public C79733c(C79729a aVar) {
        this.f233693a = aVar;
    }

    /* renamed from: a */
    public void mo109865a() {
        Log.m105924i("MicroMsg.WiFiConnector", "connect, onConnectSuccess");
        this.f233693a.mo109860b(true, "");
    }

    /* renamed from: b */
    public void mo109866b() {
        Log.m105924i("MicroMsg.WiFiConnector", "connect, onConnectFailure");
        this.f233693a.mo109860b(false, "");
    }
}
