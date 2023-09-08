package com.tencent.tav.decoder.thread;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.tav.decoder.logger.Logger;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/tav/decoder/thread/ReActionHandlerThread;", "Landroid/os/HandlerThread;", "Lrx3/b0;", "start", "action", "release", "doAction", "", "TAG", "Ljava/lang/String;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "name", "<init>", "(Ljava/lang/String;)V", "avfoundation_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
public abstract class ReActionHandlerThread extends HandlerThread {
    private final String TAG;
    private Handler handler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReActionHandlerThread(String str) {
        super(str);
        C87412m.m108595h(str, "name");
        this.TAG = "ReHandlerThread-" + str;
    }

    public final void action() {
        String str = this.TAG;
        Logger.m144648v(str, "action: " + this + " " + hashCode());
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.post(new ReActionHandlerThread$action$1(this));
        }
    }

    public abstract void doAction();

    public final synchronized void release() {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.removeCallbacks((Runnable) null);
        }
        quitSafely();
    }

    public void start() {
        super.start();
        this.handler = new Handler(getLooper());
    }
}
