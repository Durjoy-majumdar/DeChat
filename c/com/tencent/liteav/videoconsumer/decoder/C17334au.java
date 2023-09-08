package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videoconsumer.consumer.ServerVideoConsumerConfig;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.au */
public interface C17334au {

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.au$a */
    public enum C17335a {
        SOFTWARE(0),
        HARDWARE(1),
        CUSTOM(2);
        
        public int mValue;

        private C17335a(int i) {
            this.mValue = i;
        }
    }

    boolean decode(EncodedVideoFrame encodedVideoFrame);

    C17335a getDecoderType();

    void initialize();

    void setScene(VideoDecoderDef.ConsumerScene consumerScene);

    void setServerConfig(ServerVideoConsumerConfig serverVideoConsumerConfig);

    void start(Object obj, C17336av avVar);

    void stop();

    void uninitialize();
}
