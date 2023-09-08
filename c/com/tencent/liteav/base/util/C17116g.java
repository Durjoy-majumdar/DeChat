package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* renamed from: com.tencent.liteav.base.util.g */
final /* synthetic */ class C17116g implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private final C17111b f46162a;

    private C17116g(C17111b bVar) {
        this.f46162a = bVar;
    }

    /* renamed from: a */
    public static MessageQueue.IdleHandler m16925a(C17111b bVar) {
        return new C17116g(bVar);
    }

    public final boolean queueIdle() {
        return C17111b.m16915a(this.f46162a);
    }
}
