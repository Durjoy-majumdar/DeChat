package com.tencent.live2;

import com.tencent.live2.impl.V2TXLiveUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;

public class V2TXLiveDef {

    public static final class V2TXLiveAudioFrame {
        public int channel;
        public byte[] data;
        public int sampleRate;
    }

    public enum V2TXLiveBufferType {
        V2TXLiveBufferTypeUnknown,
        V2TXLiveBufferTypeByteBuffer,
        V2TXLiveBufferTypeByteArray,
        V2TXLiveBufferTypeTexture
    }

    public enum V2TXLiveFillMode {
        V2TXLiveFillModeFill,
        V2TXLiveFillModeFit,
        V2TXLiveFillModeScaleFill
    }

    public enum V2TXLiveMirrorType {
        V2TXLiveMirrorTypeAuto,
        V2TXLiveMirrorTypeEnable,
        V2TXLiveMirrorTypeDisable
    }

    public enum V2TXLiveMode {
        TXLiveMode_RTMP,
        TXLiveMode_RTC
    }

    public enum V2TXLivePixelFormat {
        V2TXLivePixelFormatUnknown,
        V2TXLivePixelFormatI420,
        V2TXLivePixelFormatTexture2D
    }

    public static final class V2TXLivePlayerStatistics {
        public int appCpu;
        public int audioBitrate;
        public int fps;
        public int height;
        public int systemCpu;
        public int videoBitrate;
        public int width;
    }

    public enum V2TXLivePushStatus {
        V2TXLivePushStatusDisconnected,
        V2TXLivePushStatusConnecting,
        V2TXLivePushStatusConnectSuccess,
        V2TXLivePushStatusReconnecting
    }

    public static final class V2TXLivePusherStatistics {
        public int appCpu;
        public int audioBitrate;
        public int fps;
        public int height;
        public int systemCpu;
        public int videoBitrate;
        public int width;
    }

    public enum V2TXLiveRotation {
        V2TXLiveRotation0,
        V2TXLiveRotation90,
        V2TXLiveRotation180,
        V2TXLiveRotation270
    }

    public static final class V2TXLiveTexture {
        public EGLContext eglContext10;
        public android.opengl.EGLContext eglContext14;
        public int textureId;
    }

    public static final class V2TXLiveVideoEncoderParam {
        public int minVideoBitrate;
        public int videoBitrate;
        public int videoFps = 15;
        public V2TXLiveVideoResolution videoResolution;
        public V2TXLiveVideoResolutionMode videoResolutionMode = V2TXLiveVideoResolutionMode.V2TXLiveVideoResolutionModePortrait;

        public V2TXLiveVideoEncoderParam(V2TXLiveVideoResolution v2TXLiveVideoResolution) {
            this.videoResolution = v2TXLiveVideoResolution;
            V2TXLiveUtils.C17629a bitrateByResolution = V2TXLiveUtils.getBitrateByResolution(v2TXLiveVideoResolution);
            this.videoBitrate = bitrateByResolution.f47986b;
            this.minVideoBitrate = bitrateByResolution.f47985a;
        }

        public final String toString() {
            return "V2TXLiveVideoEncoderParam{videoResolution=" + this.videoResolution + ", videoResolutionMode=" + this.videoResolutionMode + ", videoFps=" + this.videoFps + ", videoBitrate=" + this.videoBitrate + ", minVideoBitrate=" + this.minVideoBitrate + '}';
        }
    }

    public static final class V2TXLiveVideoFrame {
        public ByteBuffer buffer;
        public V2TXLiveBufferType bufferType = V2TXLiveBufferType.V2TXLiveBufferTypeUnknown;
        public byte[] data;
        public int height;
        public V2TXLivePixelFormat pixelFormat = V2TXLivePixelFormat.V2TXLivePixelFormatUnknown;
        public int rotation;
        public V2TXLiveTexture texture;
        public int width;
    }

    public enum V2TXLiveVideoResolution {
        V2TXLiveVideoResolution160x160,
        V2TXLiveVideoResolution270x270,
        V2TXLiveVideoResolution480x480,
        V2TXLiveVideoResolution320x240,
        V2TXLiveVideoResolution480x360,
        V2TXLiveVideoResolution640x480,
        V2TXLiveVideoResolution320x180,
        V2TXLiveVideoResolution480x270,
        V2TXLiveVideoResolution640x360,
        V2TXLiveVideoResolution960x540,
        V2TXLiveVideoResolution1280x720,
        V2TXLiveVideoResolution1920x1080
    }

    public enum V2TXLiveAudioQuality {
        V2TXLiveAudioQualitySpeech,
        V2TXLiveAudioQualityDefault,
        V2TXLiveAudioQualityMusic
    }

    public static final class V2TXLiveLogLevel {
        public static final int V2TXLiveLogLevelAll = 0;
        public static final int V2TXLiveLogLevelDebug = 1;
        public static final int V2TXLiveLogLevelError = 4;
        public static final int V2TXLiveLogLevelFatal = 5;
        public static final int V2TXLiveLogLevelInfo = 2;
        public static final int V2TXLiveLogLevelNULL = 6;
        public static final int V2TXLiveLogLevelWarning = 3;
    }

    public enum V2TXLiveMixInputType {
        V2TXLiveMixInputTypeAudioVideo,
        V2TXLiveMixInputTypePureVideo,
        V2TXLiveMixInputTypePureAudio
    }

    public enum V2TXLiveVideoResolutionMode {
        V2TXLiveVideoResolutionModeLandscape,
        V2TXLiveVideoResolutionModePortrait
    }

    public static final class V2TXLiveLogConfig {
        public boolean enableConsole = false;
        public boolean enableLogFile = true;
        public boolean enableObserver = false;
        public int logLevel = 0;
        public String logPath;
    }

    public static class V2TXLiveMixStream {
        public int height;
        public V2TXLiveMixInputType inputType;
        public String streamId;
        public String userId;
        public int width;

        /* renamed from: x */
        public int f47982x;

        /* renamed from: y */
        public int f47983y;
        public int zOrder;

        public V2TXLiveMixStream() {
            this.userId = "";
            this.f47982x = 0;
            this.f47983y = 0;
            this.width = 0;
            this.height = 0;
            this.zOrder = 0;
            this.inputType = V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo;
        }

        public String toString() {
            return "[userId='" + this.userId + '\'' + "][streamId='" + this.streamId + '\'' + "][x=" + this.f47982x + "][y=" + this.f47983y + "][width=" + this.width + "][height=" + this.height + "][zOrder=" + this.zOrder + "][inputType=" + this.inputType + ']';
        }

        public V2TXLiveMixStream(String str, int i, int i2, int i3, int i4, int i5) {
            this.userId = str;
            this.f47982x = i;
            this.f47983y = i2;
            this.width = i3;
            this.height = i4;
            this.zOrder = i5;
            this.inputType = V2TXLiveMixInputType.V2TXLiveMixInputTypeAudioVideo;
        }

        public V2TXLiveMixStream(V2TXLiveMixStream v2TXLiveMixStream) {
            this.userId = v2TXLiveMixStream.userId;
            this.streamId = v2TXLiveMixStream.streamId;
            this.f47982x = v2TXLiveMixStream.f47982x;
            this.f47983y = v2TXLiveMixStream.f47983y;
            this.width = v2TXLiveMixStream.width;
            this.height = v2TXLiveMixStream.height;
            this.zOrder = v2TXLiveMixStream.zOrder;
            this.inputType = v2TXLiveMixStream.inputType;
        }
    }

    public static final class V2TXLiveTranscodingConfig {
        public int audioBitrate;
        public int audioChannels;
        public int audioSampleRate;
        public int backgroundColor;
        public String backgroundImage;
        public ArrayList<V2TXLiveMixStream> mixStreams;
        public String outputStreamId;
        public int videoBitrate;
        public int videoFramerate;
        public int videoGOP;
        public int videoHeight;
        public int videoWidth;

        public V2TXLiveTranscodingConfig() {
            this.videoWidth = 0;
            this.videoHeight = 0;
            this.videoBitrate = 0;
            this.videoFramerate = 15;
            this.videoGOP = 2;
            this.backgroundColor = 0;
            this.audioSampleRate = 48000;
            this.audioChannels = 1;
            this.outputStreamId = null;
        }

        public final String toString() {
            return "[videoWidth=" + this.videoWidth + "][videoHeight=" + this.videoHeight + "][videoBitrate=" + this.videoBitrate + "][videoFramerate=" + this.videoFramerate + "][videoGOP=" + this.videoGOP + "][backgroundColor=" + this.backgroundColor + "][backgroundImage='" + this.backgroundImage + '\'' + "][audioSampleRate=" + this.audioSampleRate + "][audioBitrate=" + this.audioBitrate + "][audioChannels=" + this.audioChannels + "][mixStreams=" + this.mixStreams + "][outputStreamId='" + this.outputStreamId + '\'' + ']';
        }

        public V2TXLiveTranscodingConfig(V2TXLiveTranscodingConfig v2TXLiveTranscodingConfig) {
            this.videoWidth = v2TXLiveTranscodingConfig.videoWidth;
            this.videoHeight = v2TXLiveTranscodingConfig.videoHeight;
            this.videoBitrate = v2TXLiveTranscodingConfig.videoBitrate;
            this.videoFramerate = v2TXLiveTranscodingConfig.videoFramerate;
            this.videoGOP = v2TXLiveTranscodingConfig.videoGOP;
            this.backgroundColor = v2TXLiveTranscodingConfig.backgroundColor;
            this.backgroundImage = v2TXLiveTranscodingConfig.backgroundImage;
            this.audioSampleRate = v2TXLiveTranscodingConfig.audioSampleRate;
            this.audioBitrate = v2TXLiveTranscodingConfig.audioBitrate;
            this.audioChannels = v2TXLiveTranscodingConfig.audioChannels;
            this.outputStreamId = v2TXLiveTranscodingConfig.outputStreamId;
            this.mixStreams = new ArrayList<>(v2TXLiveTranscodingConfig.mixStreams);
        }
    }
}
