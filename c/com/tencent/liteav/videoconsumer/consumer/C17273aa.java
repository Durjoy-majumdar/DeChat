package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videoconsumer.consumer.C17286j;
import com.tencent.liteav.videoconsumer.decoder.C17329ar;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.aa */
final /* synthetic */ class C17273aa implements Runnable {

    /* renamed from: a */
    private final C17286j f46801a;

    /* renamed from: b */
    private final EncodedVideoFrame f46802b;

    private C17273aa(C17286j jVar, EncodedVideoFrame encodedVideoFrame) {
        this.f46801a = jVar;
        this.f46802b = encodedVideoFrame;
    }

    /* renamed from: a */
    public static Runnable m17178a(C17286j jVar, EncodedVideoFrame encodedVideoFrame) {
        return new C17273aa(jVar, encodedVideoFrame);
    }

    public final void run() {
        C17286j jVar = this.f46801a;
        EncodedVideoFrame encodedVideoFrame = this.f46802b;
        if (jVar.f46843p == C17286j.C17292a.STOPPED) {
            LiteavLog.m16901i(jVar.f46828a, "appendNALPacket ignored packet. status is  stoped.");
            return;
        }
        if (!jVar.f46841n) {
            jVar.f46841n = true;
            jVar.f46830c.notifyEvent(C17263h.C17269b.EVT_VIDEO_CONSUMER_RECEIVE_FIRST_FRAME, (String) null, new Object[0]);
        }
        jVar.f46830c.updateStatus(C17271i.STATUS_VIDEO_RECEIVED_FRAME, 0);
        jVar.f46842o.mo20222a();
        VideoDecodeController videoDecodeController = jVar.f46833f;
        if (videoDecodeController != null) {
            if (encodedVideoFrame != null) {
                synchronized (videoDecodeController) {
                    videoDecodeController.f46907o.addLast(encodedVideoFrame);
                }
            }
            videoDecodeController.mo20376a((Runnable) new C17329ar(videoDecodeController));
        }
    }
}
