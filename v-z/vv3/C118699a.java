package vv3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import rv3.C118245h;

/* renamed from: vv3.a */
public class C118699a extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C118700b f355201a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118699a(C118700b bVar, Looper looper) {
        super(looper);
        this.f355201a = bVar;
    }

    public void handleMessage(Message message) {
        try {
            this.f355201a.mo180766d(message);
        } catch (Throwable th) {
            C118245h.m166799a("sensor_AsyncWorker", "[method: handleMessage ] e: " + th.getCause());
            this.f355201a.mo183457c(th);
        }
    }
}
