package vv3;

import android.os.Message;
import aw3.C113080a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ov3.C117899b;
import rv3.C118245h;

/* renamed from: vv3.f */
public class C118704f extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C118705g f355213a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118704f(C118705g gVar, String str) {
        super(str);
        this.f355213a = gVar;
    }

    public void handleMessage(Message message) {
        C117899b bVar;
        try {
            this.f355213a.getClass();
        } catch (Throwable th) {
            C118245h.m166799a("sensor_AsyncWorker", "[method: handleMessage ] e: " + th.getCause());
            C118702d dVar = ((C118706h) this.f355213a).f355215b;
            if (dVar != null && (bVar = dVar.f355208d) != null) {
                ((C113080a) bVar).mo165608b(th, "turing async worker");
            }
        }
    }
}
