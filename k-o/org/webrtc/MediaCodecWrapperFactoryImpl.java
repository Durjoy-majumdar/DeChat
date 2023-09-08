package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec2) {
            this.mediaCodec = mediaCodec2;
        }

        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        }

        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        public void flush() {
            this.mediaCodec.flush();
        }

        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }

        public void release() {
            this.mediaCodec.release();
        }

        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        public void start() {
            this.mediaCodec.start();
        }

        public void stop() {
            this.mediaCodec.stop();
        }
    }

    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
