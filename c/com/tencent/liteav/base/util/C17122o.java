package com.tencent.liteav.base.util;

import com.tencent.liteav.base.util.C17118l;

/* renamed from: com.tencent.liteav.base.util.o */
final /* synthetic */ class C17122o implements Runnable {

    /* renamed from: a */
    private final C17118l.C17119a f46176a;

    private C17122o(C17118l.C17119a aVar) {
        this.f46176a = aVar;
    }

    /* renamed from: a */
    public static Runnable m16933a(C17118l.C17119a aVar) {
        return new C17122o(aVar);
    }

    public final void run() {
        C17118l.C17119a aVar = this.f46176a;
        C17118l.this.f46165a.execute(aVar.f46168a);
    }
}
