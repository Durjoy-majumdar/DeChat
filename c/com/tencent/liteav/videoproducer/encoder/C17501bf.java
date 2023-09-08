package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;

/* renamed from: com.tencent.liteav.videoproducer.encoder.bf */
public interface C17501bf {

    /* renamed from: com.tencent.liteav.videoproducer.encoder.bf$a */
    public interface C17502a extends VideoEncoderDef.VideoEncoderDataListener {
        /* renamed from: a */
        void mo20691a();

        /* renamed from: a */
        void mo20697a(String str);

        /* renamed from: a */
        void mo20699a(boolean z, int i);
    }

    void ackRPSRecvFrameIndex(int i, int i2);

    void encodeFrame(PixelFrame pixelFrame);

    VideoEncodeParams getEncodeParams();

    VideoEncoderDef.C17464a getEncoderType();

    void initialize();

    void restartIDRFrame();

    void setBitrate(int i);

    void setFps(int i);

    void setRPSIFrameFPS(int i);

    void setRPSNearestREFSize(int i);

    void setServerConfig(ServerVideoProducerConfig serverVideoProducerConfig);

    void signalEndOfStream();

    boolean start(VideoEncodeParams videoEncodeParams, C17502a aVar);

    void stop();

    void takeSnapshot(TakeSnapshotListener takeSnapshotListener);

    void uninitialize();
}
