package com.tencent.liteav.videoconsumer.consumer;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.t */
final /* synthetic */ class C17303t implements Handler.Callback {

    /* renamed from: a */
    private final C17286j f46883a;

    private C17303t(C17286j jVar) {
        this.f46883a = jVar;
    }

    /* renamed from: a */
    public static Handler.Callback m17213a(C17286j jVar) {
        return new C17303t(jVar);
    }

    public final boolean handleMessage(Message message) {
        return this.f46883a.mo20331a(message);
    }
}
