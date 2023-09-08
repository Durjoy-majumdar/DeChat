package com.tencent.matrix.backtrace;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.backtrace.WarmUpService;

/* renamed from: com.tencent.matrix.backtrace.i */
public class C114416i extends Handler {

    /* renamed from: a */
    public final /* synthetic */ WarmUpService.C114396c f342995a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114416i(WarmUpService.C114396c cVar, Looper looper) {
        super(looper);
        this.f342995a = cVar;
    }

    public void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            synchronized (this.f342995a.f342932c) {
                Bundle[] bundleArr = this.f342995a.f342932c;
                bundleArr[0] = bundle;
                bundleArr.notifyAll();
            }
        }
    }
}
