package com.tencent.liteav.videobase.common;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;

@JNINamespace("liteav::video")
public class EncodedVideoFrame {
    private static final String TAG = "EncodedVideoFrame";
    public CodecType codecType = CodecType.H264;
    public ByteBuffer data;
    public long dts;
    public long frameIndex = 0;
    public long gopFrameIndex = 0;
    public long gopIndex = 0;
    public int height;
    public MediaCodec.BufferInfo info = null;
    public boolean isEosFrame = false;
    public C17205a nalType;
    public long nativePtr = 0;
    public C17206b profileType;
    public long pts;
    public long refFrameIndex = 0;
    public int rotation;
    public MediaFormat videoFormat;
    public int width;

    public static EncodedVideoFrame createEncodedVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, int i4, long j7, int i5, int i6) {
        EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
        encodedVideoFrame.data = byteBuffer;
        encodedVideoFrame.nativePtr = j7;
        encodedVideoFrame.nalType = C17205a.m17048a(i);
        encodedVideoFrame.profileType = C17206b.m17049a(i2);
        encodedVideoFrame.codecType = CodecType.m17046a(i4);
        encodedVideoFrame.rotation = i3;
        encodedVideoFrame.dts = j;
        encodedVideoFrame.pts = j2;
        encodedVideoFrame.gopIndex = j3;
        encodedVideoFrame.gopFrameIndex = j4;
        encodedVideoFrame.frameIndex = j5;
        encodedVideoFrame.refFrameIndex = j6;
        encodedVideoFrame.info = null;
        encodedVideoFrame.width = i5;
        encodedVideoFrame.height = i6;
        return encodedVideoFrame;
    }

    private C17205a getNalTypeFromH264NALHeader(ByteBuffer byteBuffer, int i) {
        byte b = byteBuffer.get(i) & 31;
        return b != 5 ? b != 6 ? b != 7 ? b != 8 ? C17205a.UNKNOWN : C17205a.PPS : C17205a.SPS : C17205a.SEI : C17205a.IDR;
    }

    private C17205a getNalTypeFromH265NALHeader(ByteBuffer byteBuffer, int i) {
        int i2 = (byteBuffer.get(i) & 126) >> 1;
        if (i2 == 39) {
            return C17205a.SEI;
        }
        switch (i2) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return C17205a.IDR;
            default:
                switch (i2) {
                    case 32:
                        return C17205a.VPS;
                    case 33:
                        return C17205a.SPS;
                    case 34:
                        return C17205a.PPS;
                    default:
                        return C17205a.UNKNOWN;
                }
        }
    }

    public static int getNextNALHeaderPos(int i, ByteBuffer byteBuffer) {
        while (true) {
            int i2 = i + 3;
            if (i2 >= byteBuffer.remaining()) {
                return -1;
            }
            if (byteBuffer.get(i) == 0 && byteBuffer.get(i + 1) == 0 && byteBuffer.get(i + 2) == 0 && byteBuffer.get(i2) == 1) {
                return i + 4;
            }
            if (byteBuffer.get(i) == 0 && byteBuffer.get(i + 1) == 0 && byteBuffer.get(i + 2) == 1) {
                return i2;
            }
            i++;
        }
    }

    private native void nativeRelease(long j);

    public static long resetEncodedVideoFrame(EncodedVideoFrame encodedVideoFrame) {
        long j = encodedVideoFrame.nativePtr;
        if (j == 0 || encodedVideoFrame.data == null) {
            return 0;
        }
        encodedVideoFrame.data = null;
        encodedVideoFrame.nativePtr = 0;
        return j;
    }

    public void finalize() {
        super.finalize();
        if (this.nativePtr != 0) {
            LiteavLog.m16905w(TAG, "nativePtr != 0, must call release before finalize ");
            release();
        }
    }

    public boolean isH265() {
        return this.codecType == CodecType.H265;
    }

    public boolean isIDRFrame() {
        C17205a aVar = this.nalType;
        if (aVar != null) {
            if (aVar == C17205a.IDR) {
                return true;
            }
        }
        return false;
    }

    public boolean isRPSEnable() {
        C17206b bVar = this.profileType;
        return bVar == C17206b.BASELINE_RPS || bVar == C17206b.MAIN_RPS || bVar == C17206b.HIGH_RPS;
    }

    public void release() {
        long j = this.nativePtr;
        if (j != 0) {
            nativeRelease(j);
            this.nativePtr = 0;
        }
    }

    public String toString() {
        return "nalType = " + this.nalType + ", profiletype=" + this.profileType + ", rotation=" + this.rotation + ", codecType=" + this.codecType + ", dts=" + this.dts + ", pts=" + this.pts + ", gopIndex=" + this.gopIndex + ", gopFrameIndex=" + this.gopFrameIndex + ", frameIndex=" + this.frameIndex;
    }

    public void updateNALTypeAccordingNALHeader() {
        if (this.data != null) {
            C17205a aVar = this.nalType;
            if (aVar == null || aVar == C17205a.UNKNOWN) {
                int i = 0;
                while (true) {
                    i = getNextNALHeaderPos(i, this.data);
                    if (i != -1 && i < this.data.remaining()) {
                        C17205a aVar2 = C17205a.UNKNOWN;
                        C17205a nalTypeFromH265NALHeader = isH265() ? getNalTypeFromH265NALHeader(this.data, i) : getNalTypeFromH264NALHeader(this.data, i);
                        C17205a aVar3 = this.nalType;
                        if (aVar3 == null || aVar3 == C17205a.UNKNOWN || nalTypeFromH265NALHeader == C17205a.IDR) {
                            this.nalType = nalTypeFromH265NALHeader;
                        }
                        C17205a aVar4 = this.nalType;
                        if (aVar4 != C17205a.SPS && aVar4 != C17205a.PPS && aVar4 != C17205a.VPS && aVar4 != C17205a.SEI) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
