package com.tencent.liteav.videoconsumer.consumer;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.common.SnapshotSourceType;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.C17314ac;
import com.tencent.liteav.videoconsumer.decoder.C17315ad;
import com.tencent.liteav.videoconsumer.decoder.C17337b;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import com.tencent.liteav.videoconsumer.renderer.C17380g;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

@JNINamespace("liteav::video")
public class VideoConsumerProxy {
    private final C17286j mConsumer;

    public VideoConsumerProxy(IVideoReporter iVideoReporter) {
        this.mConsumer = new C17286j(iVideoReporter);
    }

    public static VideoDecoderDef.DecodeAbility getDecodeAbility() {
        return C17337b.C17338a.f46985a.f46983a;
    }

    public void appendNALPacket(EncodedVideoFrame encodedVideoFrame) {
        C17286j jVar = this.mConsumer;
        if (encodedVideoFrame == null || encodedVideoFrame.data == null) {
            LiteavLog.m16906w(jVar.f46828a, "packet or packet.data is null,packet={%s}", encodedVideoFrame);
            return;
        }
        jVar.mo20329a(C17273aa.m17178a(jVar, encodedVideoFrame), "appendNALPacket", false);
    }

    public long getCurrentRenderTimeStamp() {
        return this.mConsumer.f46850w.get();
    }

    public void initialize() {
        C17286j jVar = this.mConsumer;
        synchronized (jVar) {
            if (jVar.f46829b != null) {
                LiteavLog.m16905w(jVar.f46828a, "videoConsumer is initialized!");
                return;
            }
            LiteavLog.m16901i(jVar.f46828a, "initialize videoConsumer");
            HandlerThread handlerThread = new HandlerThread("VideoConsumer_" + jVar.hashCode());
            handlerThread.start();
            jVar.f46829b = new C17111b(handlerThread.getLooper(), C17303t.m17213a(jVar));
            jVar.mo20329a(C17305v.m17215a(jVar), "initialize", false);
        }
    }

    public void pause() {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17308y.m17218a(jVar), "pause", false);
    }

    public void resume() {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17309z.m17219a(jVar), "resume", false);
    }

    public void setCustomRenderListener(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType, VideoRenderListener videoRenderListener) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17301r.m17211a(jVar, pixelFormatType, pixelBufferType, videoRenderListener), "setCustomRenderListener", false);
    }

    public void setDecoderStrategy(VideoDecodeController.DecodeStrategy decodeStrategy) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17297n.m17207a(jVar, decodeStrategy), "setDecoderType", true);
    }

    public void setDisplayTarget(DisplayTarget displayTarget) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17298o.m17208a(jVar, displayTarget), "setDisplayTarget", false);
    }

    public void setHWDecoderDeviceRelatedParams(String str) {
        C17286j jVar = this.mConsumer;
        if (!TextUtils.isEmpty(str)) {
            jVar.mo20329a(C17300q.m17210a(jVar, str), "setHWDecoderDeviceRelatedParams", true);
        }
    }

    public void setRenderMirrorEnabled(boolean z) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17275ac.m17180a(jVar, z), "setRenderMirrorEnabled", true);
    }

    public void setRenderRotation(Rotation rotation) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17295l.m17205a(jVar, rotation), "setRenderRotation", true);
    }

    public void setScaleType(GLConstants.GLScaleType gLScaleType) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17296m.m17206a(jVar, gLScaleType), "setScaleType", true);
    }

    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17274ab.m17179a(jVar, consumerScene), "setScene", false);
    }

    public void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17304u.m17214a(jVar, serverVideoConsumerConfig), "setServerConfig", true);
    }

    public void setSharedEGLContext(Object obj) {
        C17286j jVar = this.mConsumer;
        String str = jVar.f46828a;
        LiteavLog.m16901i(str, "setSharedEGLContext(object:" + obj + ")");
        jVar.mo20329a(C17302s.m17212a(jVar, obj), "setSharedEGLContext", false);
    }

    public void start() {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17306w.m17216a(jVar), "Start", false);
    }

    public void stop(boolean z) {
        this.mConsumer.mo20330a(z);
    }

    public void takeSnapshot(SnapshotSourceType snapshotSourceType, TakeSnapshotListener takeSnapshotListener) {
        C17286j jVar = this.mConsumer;
        jVar.mo20329a(C17299p.m17209a(jVar, snapshotSourceType, takeSnapshotListener), "takeSnapshot", false);
    }

    public void uninitialize() {
        C17286j jVar = this.mConsumer;
        jVar.mo20330a(false);
        jVar.mo20329a(new Runnable() {
            public final void run() {
                LiteavLog.m16901i(C17286j.this.f46828a, "uninitialize videoConsumer");
                C17380g gVar = C17286j.this.f46831d;
                if (gVar != null) {
                    gVar.mo20308a((DisplayTarget) null, false);
                    C17286j.this.f46831d = null;
                }
                C17286j jVar = C17286j.this;
                jVar.f46832e = null;
                VideoDecodeController videoDecodeController = jVar.f46833f;
                if (videoDecodeController != null) {
                    LiteavLog.m16901i(videoDecodeController.f46893a, "uninitialize");
                    videoDecodeController.mo20376a((Runnable) new C17314ac(videoDecodeController));
                    videoDecodeController.mo20376a((Runnable) new C17315ad(videoDecodeController));
                    synchronized (videoDecodeController) {
                        C17111b bVar = videoDecodeController.f46898f;
                        if (bVar != null) {
                            bVar.mo19360a();
                            videoDecodeController.f46898f = null;
                        }
                    }
                    C17286j.this.f46833f = null;
                }
                C17286j jVar2 = C17286j.this;
                jVar2.f46848u = null;
                jVar2.f46836i = null;
                jVar2.f46834g = null;
                jVar2.f46835h = null;
                synchronized (this) {
                    C17111b bVar2 = C17286j.this.f46829b;
                    if (bVar2 != null) {
                        bVar2.mo19360a();
                        C17286j.this.f46829b = null;
                    }
                }
            }
        }, "uninitialize", false);
    }
}
