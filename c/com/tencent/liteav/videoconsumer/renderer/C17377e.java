package com.tencent.liteav.videoconsumer.renderer;

import com.tencent.liteav.base.util.C104507p;

/* renamed from: com.tencent.liteav.videoconsumer.renderer.e */
final /* synthetic */ class C17377e implements Runnable {

    /* renamed from: a */
    private final C17370a f47110a;

    /* renamed from: b */
    private final int f47111b;

    /* renamed from: c */
    private final int f47112c;

    private C17377e(C17370a aVar, int i, int i2) {
        this.f47110a = aVar;
        this.f47111b = i;
        this.f47112c = i2;
    }

    /* renamed from: a */
    public static Runnable m17356a(C17370a aVar, int i, int i2) {
        return new C17377e(aVar, i, i2);
    }

    public final void run() {
        C17370a aVar = this.f47110a;
        int i = this.f47111b;
        int i2 = this.f47112c;
        C104507p pVar = aVar.f47095d;
        pVar.f309736a = i;
        pVar.f309737b = i2;
        aVar.mo20447a(aVar.f47093b, i, i2, false, false);
    }
}
