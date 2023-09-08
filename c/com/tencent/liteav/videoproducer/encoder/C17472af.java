package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videoproducer.encoder.C17501bf;

/* renamed from: com.tencent.liteav.videoproducer.encoder.af */
final /* synthetic */ class C17472af implements Runnable {

    /* renamed from: a */
    private final C17529w f47419a;

    /* renamed from: b */
    private final String f47420b;

    private C17472af(C17529w wVar, String str) {
        this.f47419a = wVar;
        this.f47420b = str;
    }

    /* renamed from: a */
    public static Runnable m17562a(C17529w wVar, String str) {
        return new C17472af(wVar, str);
    }

    public final void run() {
        C17529w wVar = this.f47419a;
        String str = this.f47420b;
        C17501bf.C17502a aVar = wVar.f47607e;
        if (aVar != null) {
            aVar.mo20697a(str);
        }
    }
}
