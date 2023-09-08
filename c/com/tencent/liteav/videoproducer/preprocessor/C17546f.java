package com.tencent.liteav.videoproducer.preprocessor;

/* renamed from: com.tencent.liteav.videoproducer.preprocessor.f */
final /* synthetic */ class C17546f implements Runnable {

    /* renamed from: a */
    private final BeautyProcessor f47662a;

    /* renamed from: b */
    private final String f47663b;

    /* renamed from: c */
    private final int f47664c;

    private C17546f(BeautyProcessor beautyProcessor, String str, int i) {
        this.f47662a = beautyProcessor;
        this.f47663b = str;
        this.f47664c = i;
    }

    /* renamed from: a */
    public static Runnable m17732a(BeautyProcessor beautyProcessor, String str, int i) {
        return new C17546f(beautyProcessor, str, i);
    }

    public final void run() {
        this.f47662a.updateStatsInternal(this.f47663b, (float) this.f47664c);
    }
}
