package com.tencent.liteav.videoproducer.encoder;

import android.view.Surface;
import com.tencent.liteav.videoproducer.encoder.C17501bf;

/* renamed from: com.tencent.liteav.videoproducer.encoder.ab */
final /* synthetic */ class C17468ab implements Runnable {

    /* renamed from: a */
    private final C17529w f47411a;

    /* renamed from: b */
    private final C17501bf.C17502a f47412b;

    /* renamed from: c */
    private final Surface[] f47413c;

    /* renamed from: d */
    private final VideoEncodeParams f47414d;

    private C17468ab(C17529w wVar, C17501bf.C17502a aVar, Surface[] surfaceArr, VideoEncodeParams videoEncodeParams) {
        this.f47411a = wVar;
        this.f47412b = aVar;
        this.f47413c = surfaceArr;
        this.f47414d = videoEncodeParams;
    }

    /* renamed from: a */
    public static Runnable m17558a(C17529w wVar, C17501bf.C17502a aVar, Surface[] surfaceArr, VideoEncodeParams videoEncodeParams) {
        return new C17468ab(wVar, aVar, surfaceArr, videoEncodeParams);
    }

    public final void run() {
        C17529w wVar = this.f47411a;
        C17501bf.C17502a aVar = this.f47412b;
        Surface[] surfaceArr = this.f47413c;
        VideoEncodeParams videoEncodeParams = this.f47414d;
        wVar.f47607e = aVar;
        surfaceArr[0] = wVar.mo20741a(videoEncodeParams);
    }
}
