package com.tencent.liteav.videoproducer.producer;

/* renamed from: com.tencent.liteav.videoproducer.producer.o */
final /* synthetic */ class C17617o implements Runnable {

    /* renamed from: a */
    private final C17604f f47952a;

    /* renamed from: b */
    private final int f47953b;

    /* renamed from: c */
    private final int f47954c;

    private C17617o(C17604f fVar, int i, int i2) {
        this.f47952a = fVar;
        this.f47953b = i;
        this.f47954c = i2;
    }

    /* renamed from: a */
    public static Runnable m17904a(C17604f fVar, int i, int i2) {
        return new C17617o(fVar, i, i2);
    }

    public final void run() {
        C17604f.m17830a(this.f47952a, this.f47953b, this.f47954c);
    }
}
