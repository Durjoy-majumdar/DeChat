package com.tencent.liteav.videoproducer.encoder;

import java.util.concurrent.Callable;

/* renamed from: com.tencent.liteav.videoproducer.encoder.aq */
final /* synthetic */ class C17485aq implements Callable {

    /* renamed from: a */
    private final C17474ah f47465a;

    private C17485aq(C17474ah ahVar) {
        this.f47465a = ahVar;
    }

    /* renamed from: a */
    public static Callable m17627a(C17474ah ahVar) {
        return new C17485aq(ahVar);
    }

    public final Object call() {
        return C17474ah.m17583b(this.f47465a);
    }
}
