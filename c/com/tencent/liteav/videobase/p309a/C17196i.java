package com.tencent.liteav.videobase.p309a;

/* renamed from: com.tencent.liteav.videobase.a.i */
final /* synthetic */ class C17196i implements Runnable {

    /* renamed from: a */
    private final C17195h f46461a;

    private C17196i(C17195h hVar) {
        this.f46461a = hVar;
    }

    /* renamed from: a */
    public static Runnable m17035a(C17195h hVar) {
        return new C17196i(hVar);
    }

    public final void run() {
        this.f46461a.initFiltersAndInterceptors();
    }
}
