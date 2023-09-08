package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.os.Looper;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ae */
final /* synthetic */ class C17471ae implements Runnable {

    /* renamed from: a */
    private final C17529w f47418a;

    private C17471ae(C17529w wVar) {
        this.f47418a = wVar;
    }

    /* renamed from: a */
    public static Runnable m17561a(C17529w wVar) {
        return new C17471ae(wVar);
    }

    public final void run() {
        C17529w wVar = this.f47418a;
        LiteavLog.m16901i(wVar.f47603a, "signalEndOfStream");
        MediaCodec mediaCodec = wVar.f47606d;
        if (mediaCodec != null) {
            mediaCodec.signalEndOfInputStream();
        }
        if (wVar.f47610h == null) {
            C113473t tVar = new C113473t(Looper.myLooper(), new C17531y(wVar));
            wVar.f47610h = tVar;
            tVar.mo169974a(0, 30);
        }
    }
}
