package vv3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;

/* renamed from: vv3.b */
public abstract class C118700b {

    /* renamed from: a */
    public HandlerThread f355202a;

    /* renamed from: b */
    public Handler f355203b;

    public C118700b(String str) {
        HandlerThread handlerThread = new HandlerThread(TextUtils.isEmpty(str) ? "worker_thread" : str, 0);
        this.f355202a = handlerThread;
        handlerThread.start();
        this.f355203b = new C118699a(this, this.f355202a.getLooper());
    }

    /* renamed from: c */
    public void mo183457c(Throwable th) {
    }

    /* renamed from: d */
    public void mo180766d(Message message) {
    }

    /* renamed from: e */
    public void mo183458e(int i, int i2, Object obj) {
        Handler handler = this.f355203b;
        if (handler != null && handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = -1;
            obtainMessage.obj = obj;
            this.f355203b.sendMessageDelayed(obtainMessage, 0);
        }
    }
}
