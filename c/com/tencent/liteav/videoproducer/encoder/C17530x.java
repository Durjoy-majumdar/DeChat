package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videoproducer.encoder.C17501bf;

/* renamed from: com.tencent.liteav.videoproducer.encoder.x */
final /* synthetic */ class C17530x implements Runnable {

    /* renamed from: a */
    private final C17529w f47629a;

    private C17530x(C17529w wVar) {
        this.f47629a = wVar;
    }

    /* renamed from: a */
    public static Runnable m17717a(C17529w wVar) {
        return new C17530x(wVar);
    }

    public final void run() {
        C17501bf.C17502a aVar = this.f47629a.f47607e;
        if (aVar != null) {
            aVar.mo20691a();
        }
    }
}
