package com.tencent.wxmm;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.coremedia.TimeUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public class v2encoder {
    public static int EMethodGetQosPara = 25;
    public static final int EMethodGetRemoteHW = 26;
    public static final int ENUM_AVCEncCfgERROR = 2003;
    public static final int ENUM_AVCEncCreateERROR = 2002;
    public static final int ENUM_AVCEncERROR = 2004;
    public static final int ENUM_AVCEncNotFound = 2001;
    public static final int ENUM_AVCEncOK = 2000;
    public static final boolean SAVEVIDEOSTREAM = true;
    public static short[] SizeFormat2WH = {128, 96, 240, 160, 320, 240, 480, 360, 640, 480};
    private static final String TAG = "v2encoder";
    public static final int VFMT_420SP = 7;
    public static final int VFMT_HEVC_HW = 19;
    public static final int VFMT_ROTATE = 32;
    public static final int VFMT_i264 = 18;
    public static final byte enumCODEC_Vcodec2_hw = 4;
    public static final byte enumCODEC_f264 = 1;
    public static final byte enumCODEC_i264 = 8;
    public static final byte enumCODEC_vcodec2 = 16;
    public static int frameID = 0;
    private static String path = Environment.getExternalStorageDirectory().getAbsolutePath();
    private static int streamqueuesize = 100;
    private static final String[] supportedH264HwCodecPrefixes = {MediaCodecUtils.QCOM_PREFIX, MediaCodecUtils.EXYNOS_PREFIX, "OMX.hisi"};
    public String ENCODING = "hevc";
    private int TIMEOUT_USEC = 12000;
    public byte[] configbyte = null;
    public int encLen = 0;
    public boolean isRuning = false;
    public long mGeneratedIdx;
    public int mPrevResolution = 8;
    public int mProfileCfg;
    public v2service mProtocol;
    public int m_CapH;
    public int m_CapW;
    public int m_br_kbps;
    public int m_framerate;
    public int m_height;
    public int m_width;
    private MediaCodec mediaCodec = null;
    public MediaFormat mediaFormat;
    private BufferedOutputStream outputStream;
    public v2stqos stQoS;

    public static class Frame {
        public byte[] frameData = null;

        /* renamed from: id */
        public int f82914id;
        public int type = 0;

        public Frame(int i) {
            this.f82914id = i;
        }
    }

    public v2encoder(int i, int i2, int i3, int i4, int i5, v2service v2service) {
        this.m_width = i;
        this.m_height = i2;
        this.m_CapW = i;
        this.m_CapH = i2;
        this.mProtocol = v2service;
        this.m_framerate = i3;
        this.m_br_kbps = i4;
        this.mProfileCfg = i5;
        frameID = 0;
        this.mGeneratedIdx = 0;
        this.stQoS = new v2stqos();
    }

    private void NV21ToNV12(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        if (bArr != null && bArr2 != null) {
            int i4 = i * i2;
            int i5 = 0;
            if (i3 == 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i4);
                while (i5 < i4 / 2) {
                    int i6 = i4 + i5;
                    int i7 = i6 + 1;
                    bArr2[i6] = bArr[i7];
                    bArr2[i7] = bArr[i6];
                    i5 += 2;
                }
                return;
            }
            for (int i8 = 0; i8 < i4; i8++) {
                bArr2[i8] = bArr[(i4 - 1) - i8];
            }
            while (true) {
                int i9 = i4 / 2;
                if (i5 < i9) {
                    bArr2[i4 + i5] = bArr[((i9 + i4) - 1) - i5];
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    private void StopEncoder() {
        try {
            MediaCodec mediaCodec2 = this.mediaCodec;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
                this.mediaCodec.release();
            }
        } catch (Exception e) {
            e.toString();
        }
    }

    private boolean SupportAvcCodec(String str, int i) {
        String str2 = str;
        boolean z = false;
        for (int codecCount = MediaCodecList.getCodecCount() - 1; codecCount >= 0; codecCount--) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(codecCount);
            codecInfoAt.getName();
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                String name = codecInfoAt.getName();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str2)) {
                        for (String startsWith : supportedH264HwCodecPrefixes) {
                            if (name.startsWith(startsWith)) {
                                try {
                                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecInfoAt.getCapabilitiesForType(str2).profileLevels) {
                                        if (codecProfileLevel.profile == i) {
                                            z = true;
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            int i2 = i;
                        }
                    }
                    int i3 = i;
                }
            }
            int i4 = i;
        }
        return z;
    }

    private long computePresentationTime(long j) {
        return ((j * TimeUtil.SECOND_TO_US) / 15) + 132;
    }

    private void createfile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            this.outputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Exception e) {
            e.toString();
        }
    }

    private boolean isRecognizedProfile(int i) {
        return i == 1 || i == 2 || i == 8;
    }

    private MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        codecInfoAt.getName();
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private void trySetBitRateMode(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        try {
            if (Build.VERSION.SDK_INT > 21 && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.ENCODING)) != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    this.mediaFormat.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(1)) {
                    this.mediaFormat.setInteger("bitrate-mode", 1);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void trySetProfile(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(this.ENCODING);
                if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.level = 0;
                    codecProfileLevel.profile = 0;
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        int i = codecProfileLevel2.profile;
                        int i2 = codecProfileLevel2.level;
                        if (isRecognizedProfile(i) && i >= codecProfileLevel.profile && i2 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i;
                            codecProfileLevel.level = i2;
                        }
                    }
                    int i3 = codecProfileLevel.profile;
                    int i4 = codecProfileLevel.level;
                    if (i3 > 0 && i4 >= 256) {
                        this.mediaFormat.setInteger(Scopes.PROFILE, i3);
                        this.mediaFormat.setInteger(FirebaseAnalytics.C113379b.LEVEL, 256);
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public int DoMediacodecEnc(byte[] bArr, int i) {
        byte[] bArr2;
        int i2 = this.m_CapW;
        int i3 = this.m_CapH;
        int i4 = this.m_width;
        int i5 = this.m_height;
        if (this.stQoS.cSkipFlag == 0) {
            bArr2 = new byte[(((i2 * i3) * 3) / 2)];
            NV21ToNV12(bArr, bArr2, i4, i5, i & 32);
            this.encLen = ((this.m_width * this.m_height) * 3) >> 1;
        } else {
            bArr2 = null;
        }
        if (bArr2 == null) {
            return 0;
        }
        try {
            System.currentTimeMillis();
            ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
            ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(-1);
            if (dequeueInputBuffer >= 0) {
                long computePresentationTime = computePresentationTime(this.mGeneratedIdx);
                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                byteBuffer.put(bArr2, 0, this.encLen);
                this.mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, this.encLen, computePresentationTime, 0);
                this.mGeneratedIdx++;
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, (long) this.TIMEOUT_USEC);
            int i6 = 0;
            while (dequeueOutputBuffer >= 0) {
                int i7 = bufferInfo.size;
                byte[] bArr3 = new byte[i7];
                outputBuffers[dequeueOutputBuffer].get(bArr3);
                BufferedOutputStream bufferedOutputStream = this.outputStream;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.write(bArr3, 0, i7);
                }
                putH2645Data(bArr3, bufferInfo.flags, i7);
                i6 = bufferInfo.flags;
                frameID++;
                this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, (long) this.TIMEOUT_USEC);
            }
            return i6;
        } catch (Exception e) {
            e.toString();
            return -2004;
        }
    }

    public void DoQosSvrCtrl() {
        v2service v2service = this.mProtocol;
        if (v2service != null) {
            int i = EMethodGetQosPara;
            byte[] bArr = this.stQoS.s2p;
            if (v2service.setAppCmd(i, bArr, bArr.length) >= 0) {
                this.stQoS.parseS2PData();
                this.stQoS.printS2P();
            }
            short s = this.stQoS.iKbps;
            int i2 = this.m_br_kbps;
            if (s != i2) {
                SetBitRate(i2);
                this.m_br_kbps = this.stQoS.iKbps;
            }
            if (1 == this.stQoS.cIReqFlag) {
                MakeIFrame();
            }
            byte b = this.stQoS.cFps;
            if (b != this.m_framerate) {
                this.m_framerate = b;
            }
        }
    }

    public int InitHWEncoder(boolean z) {
        int i;
        this.ENCODING = z ? "video/avc" : "video/hevc";
        byte[] bArr = new byte[4];
        bArr[0] = 0;
        this.mProtocol.setAppCmd(26, bArr, 4);
        byte b = bArr[0];
        if (z) {
            if ((b & 1) == 0 && (b & 8) == 0) {
                return -2;
            }
        } else if ((b & enumCODEC_vcodec2) == 0 && (b & 4) == 0) {
            return -3;
        }
        try {
            i = StartEncoder();
        } catch (Exception e) {
            e.getMessage();
            i = -2003;
        }
        if (i < 0) {
            return i;
        }
        createfile(path + "/AVLog/mediacodec.h264");
        return i;
    }

    public void MakeIFrame() {
        if (this.mediaCodec != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.mediaCodec.setParameters(bundle);
        }
    }

    public boolean SetBitRate(int i) {
        try {
            if (this.mediaCodec == null) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i * 1000);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }

    public int StartEncoder() {
        if (this.mediaCodec != null) {
            StopEncoder();
        }
        MediaCodecInfo selectCodec = selectCodec(this.ENCODING);
        if (selectCodec == null) {
            return -2001;
        }
        selectCodec.getName();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.ENCODING, this.m_width, this.m_height);
        this.mediaFormat = createVideoFormat;
        createVideoFormat.setInteger("color-format", 21);
        this.mediaFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.m_br_kbps * 1000);
        this.mediaFormat.setInteger("frame-rate", this.m_framerate);
        this.mediaFormat.setInteger("i-frame-interval", 1);
        String string = this.mediaFormat.getString("mime");
        if (this.ENCODING.equalsIgnoreCase("video/avc")) {
            boolean z = (this.mProfileCfg & 4) != 0;
            if (Build.VERSION.SDK_INT < 23 || !z) {
                trySetProfile(selectCodec);
            } else if (SupportAvcCodec(string, 8)) {
                this.mediaFormat.setInteger(Scopes.PROFILE, 8);
            }
        }
        this.mediaFormat.setInteger("bitrate-mode", 2);
        try {
            this.mediaCodec = MediaCodec.createEncoderByType(string);
            Objects.toString(this.mediaFormat);
            this.mediaCodec.configure(this.mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mediaCodec.start();
            return 2000;
        } catch (Exception e) {
            e.toString();
            return -2002;
        }
    }

    public void UninitHWEncoder() {
        this.isRuning = false;
        try {
            StopEncoder();
            BufferedOutputStream bufferedOutputStream = this.outputStream;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.flush();
                this.outputStream.close();
            }
        } catch (Exception e) {
            e.toString();
        }
    }

    public void putH2645Data(byte[] bArr, int i, int i2) {
        if (bArr != null && this.mProtocol != null) {
            this.mProtocol.videoEncodeToSend(bArr, i2, this.m_width, i, this.ENCODING.equalsIgnoreCase("video/hevc") ? 19 : 18);
        }
    }
}
