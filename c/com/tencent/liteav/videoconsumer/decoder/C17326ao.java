package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ao */
public final /* synthetic */ class C17326ao implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46951a;

    /* renamed from: b */
    private final TakeSnapshotListener f46952b;

    public C17326ao(VideoDecodeController videoDecodeController, TakeSnapshotListener takeSnapshotListener) {
        this.f46951a = videoDecodeController;
        this.f46952b = takeSnapshotListener;
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46951a;
        TakeSnapshotListener takeSnapshotListener = this.f46952b;
        LiteavLog.m16901i(videoDecodeController.f46893a, "takeSnapshot ".concat(String.valueOf(takeSnapshotListener)));
        videoDecodeController.f46911s.f46629a = takeSnapshotListener;
    }
}
