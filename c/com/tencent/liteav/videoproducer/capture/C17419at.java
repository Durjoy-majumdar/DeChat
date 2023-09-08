package com.tencent.liteav.videoproducer.capture;

/* renamed from: com.tencent.liteav.videoproducer.capture.at */
final /* synthetic */ class C17419at implements Runnable {

    /* renamed from: a */
    private final C17417ar f47275a;

    private C17419at(C17417ar arVar) {
        this.f47275a = arVar;
    }

    /* renamed from: a */
    public static Runnable m17483a(C17417ar arVar) {
        return new C17419at(arVar);
    }

    public final void run() {
        C17417ar.m17475a(this.f47275a);
    }
}
