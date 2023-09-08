package com.tencent.p014mm.plugin.finder.webview;

import android.os.Looper;
import android.os.MessageQueue;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.webview.i */
public final class C41633i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f112072d;

    /* renamed from: com.tencent.mm.plugin.finder.webview.i$a */
    public static final class C41634a implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ C32224a f112073d;

        public C41634a(C32224a aVar) {
            this.f112073d = aVar;
        }

        public boolean queueIdle() {
            Looper.myQueue().removeIdleHandler(this);
            this.f112073d.invoke();
            return false;
        }
    }

    public C41633i(C32224a<C13598b0> aVar) {
        this.f112072d = aVar;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new C41634a(this.f112072d));
    }
}
