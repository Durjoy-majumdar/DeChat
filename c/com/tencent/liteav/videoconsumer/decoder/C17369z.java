package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.z */
public final /* synthetic */ class C17369z implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f47091a;

    public C17369z(VideoDecodeController videoDecodeController) {
        this.f47091a = videoDecodeController;
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f47091a;
        videoDecodeController.f46903k = false;
        videoDecodeController.f46900h = null;
        C113473t tVar = videoDecodeController.f46899g;
        if (tVar != null) {
            tVar.mo169973a();
            videoDecodeController.f46899g = null;
        }
        videoDecodeController.f46896d.mo20407a();
        videoDecodeController.mo20382k();
        synchronized (videoDecodeController) {
            for (EncodedVideoFrame next : videoDecodeController.f46907o) {
                if (next != null) {
                    next.release();
                }
            }
            videoDecodeController.f46907o.clear();
        }
    }
}
