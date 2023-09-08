package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* renamed from: com.tencent.liteav.base.util.h */
final /* synthetic */ class C17117h implements Runnable {

    /* renamed from: a */
    private final C17111b f46163a;

    /* renamed from: b */
    private final MessageQueue.IdleHandler f46164b;

    private C17117h(C17111b bVar, MessageQueue.IdleHandler idleHandler) {
        this.f46163a = bVar;
        this.f46164b = idleHandler;
    }

    /* renamed from: a */
    public static Runnable m16926a(C17111b bVar, MessageQueue.IdleHandler idleHandler) {
        return new C17117h(bVar, idleHandler);
    }

    public final void run() {
        C17111b.m16913a(this.f46163a, this.f46164b);
    }
}
