package com.tencent.liteav.videoproducer.preprocessor;

import com.tencent.liteav.videobase.p309a.C17188a;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.i */
final /* synthetic */ class C17554i implements Runnable {

    /* renamed from: a */
    private final C17548h f47704a;

    /* renamed from: b */
    private final C17188a f47705b;

    private C17554i(C17548h hVar, C17188a aVar) {
        this.f47704a = hVar;
        this.f47705b = aVar;
    }

    /* renamed from: a */
    public static Runnable m17745a(C17548h hVar, C17188a aVar) {
        return new C17554i(hVar, aVar);
    }

    public final void run() {
        C17548h hVar = this.f47704a;
        hVar.f47680n = this.f47705b;
        hVar.mo20819b();
    }
}
