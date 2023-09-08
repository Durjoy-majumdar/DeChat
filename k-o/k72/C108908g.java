package k72;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import i72.C108389l;
import java.nio.ByteBuffer;
import p206nj.C11171e;

/* renamed from: k72.g */
public class C108908g {

    /* renamed from: a */
    public int f326242a = -1;

    /* renamed from: b */
    public C108909a f326243b;

    /* renamed from: c */
    public int f326244c;

    /* renamed from: d */
    public int f326245d;

    /* renamed from: e */
    public int f326246e;

    /* renamed from: f */
    public int f326247f;

    /* renamed from: g */
    public int f326248g;

    /* renamed from: h */
    public int f326249h;

    /* renamed from: i */
    public int f326250i;

    /* renamed from: j */
    public C104619a f326251j;

    /* renamed from: k */
    public MediaFormat f326252k;

    /* renamed from: l */
    public ByteBuffer[] f326253l;

    /* renamed from: m */
    public ByteBuffer[] f326254m;

    /* renamed from: n */
    public int f326255n = -1;

    /* renamed from: o */
    public int f326256o = -1;

    /* renamed from: p */
    public MediaCodec.BufferInfo f326257p;

    /* renamed from: q */
    public int f326258q = 0;

    /* renamed from: r */
    public boolean f326259r = false;

    /* renamed from: s */
    public boolean f326260s = false;

    /* renamed from: t */
    public boolean f326261t = false;

    /* renamed from: u */
    public int f326262u;

    /* renamed from: v */
    public int f326263v;

    /* renamed from: w */
    public byte[] f326264w;

    /* renamed from: x */
    public int f326265x;

    /* renamed from: k72.g$a */
    public interface C108909a {
    }

    public C108908g(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f326244c = i;
        this.f326245d = i2;
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, init targetWidth: %d, targetHeight: %d", Integer.valueOf(i3), Integer.valueOf(i4));
        this.f326246e = i3;
        this.f326247f = i4;
        this.f326263v = i7;
        this.f326262u = i6;
        this.f326257p = new MediaCodec.BufferInfo();
        this.f326258q = i5;
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "create MMSightRemuxMediaCodecEncoder, frameWidth: %s, frameHeight: %s, targetWidth: %s, targetHeight: %s, bitrate: %s", Integer.valueOf(this.f326244c), Integer.valueOf(this.f326245d), Integer.valueOf(this.f326246e), Integer.valueOf(this.f326247f), Integer.valueOf(i5));
    }

    /* renamed from: a */
    public final void mo160041a() {
        this.f326256o = this.f326251j.mo148205g(this.f326257p, 600);
        Log.m105926v("MicroMsg.MMSightRemuxMediaCodecEncoder", "outputBufferIndex-->" + this.f326256o);
        while (true) {
            int i = this.f326256o;
            if (i == -1) {
                Log.m105919d("MicroMsg.MMSightRemuxMediaCodecEncoder", "no output from encoder available, break encoderEndStream %s", Boolean.valueOf(this.f326261t));
                if (!this.f326261t) {
                    return;
                }
            } else if (i == -3) {
                this.f326254m = this.f326251j.mo148211m();
                Log.m105918d("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder output buffers changed");
            } else if (i == -2) {
                Log.m105918d("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder output format changed: " + this.f326251j.mo148212n());
            } else if (i < 0) {
                Log.m105928w("MicroMsg.MMSightRemuxMediaCodecEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f326256o);
            } else {
                Log.m105926v("MicroMsg.MMSightRemuxMediaCodecEncoder", "perform encoding");
                ByteBuffer byteBuffer = this.f326254m[this.f326256o];
                if (byteBuffer != null) {
                    this.f326249h++;
                    MediaCodec.BufferInfo bufferInfo = this.f326257p;
                    if ((bufferInfo.flags & 2) != 0) {
                        Log.m105927v("MicroMsg.MMSightRemuxMediaCodecEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", Integer.valueOf(bufferInfo.size), Boolean.FALSE);
                    }
                    MediaCodec.BufferInfo bufferInfo2 = this.f326257p;
                    if (bufferInfo2.size != 0) {
                        byteBuffer.position(bufferInfo2.offset);
                        MediaCodec.BufferInfo bufferInfo3 = this.f326257p;
                        byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
                        MediaCodec.BufferInfo bufferInfo4 = this.f326257p;
                        if (!(bufferInfo4 == null || this.f326243b == null)) {
                            MP4MuxerJNI.writeH264DataLock(this.f326242a, byteBuffer, bufferInfo4.size);
                        }
                    }
                    this.f326251j.mo148216r(this.f326256o, false);
                    if ((this.f326257p.flags & 4) != 0) {
                        if (!this.f326260s) {
                            Log.m105920e("MicroMsg.MMSightRemuxMediaCodecEncoder", "reached end of stream unexpectedly");
                            return;
                        }
                        Log.m105929w("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", Integer.valueOf(this.f326249h), Integer.valueOf(this.f326250i));
                        try {
                            this.f326251j.mo148223z();
                            this.f326251j.mo148214p();
                            this.f326251j = null;
                            this.f326259r = false;
                            return;
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.MMSightRemuxMediaCodecEncoder", "do stop encoder error: %s", e.getMessage());
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("encoderOutputBuffer " + this.f326256o + " was null");
                }
            }
            int g = this.f326251j.mo148205g(this.f326257p, 600);
            this.f326256o = g;
            if (g <= 0) {
                Log.m105927v("MicroMsg.MMSightRemuxMediaCodecEncoder", "get outputBufferIndex %d", Integer.valueOf(g));
            }
            if (this.f326256o < 0 && !this.f326261t) {
                return;
            }
        }
    }

    /* renamed from: b */
    public int mo160042b(int i) {
        try {
            this.f326242a = i;
            return mo160043c();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightRemuxMediaCodecEncoder", "init error: %s, try to re-init again", e.getMessage());
            try {
                return mo160043c();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.MMSightRemuxMediaCodecEncoder", "re-init again error: %s", e2.getMessage());
                C108389l.m146845f();
                return -1;
            }
        }
    }

    /* renamed from: c */
    public final int mo160043c() {
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        long currentTicks = Util.currentTicks();
        int codecCount = MediaCodecList.getCodecCount();
        int i = 0;
        loop0:
        while (true) {
            if (i >= codecCount) {
                mediaCodecInfo = null;
                break;
            }
            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            if (mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase("video/avc")) {
                        break loop0;
                    }
                }
                continue;
            }
            i++;
        }
        if (mediaCodecInfo == null) {
            Log.m105920e("MicroMsg.MMSightRemuxMediaCodecEncoder", "Unable to find an appropriate codec for video/avc");
            C108389l.m146845f();
            return -1;
        }
        int i2 = 1;
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found codec: %s, used %sms", mediaCodecInfo.getName(), Long.valueOf(Util.ticksToNow(currentTicks)));
        long currentTicks2 = Util.currentTicks();
        long currentTicks3 = Util.currentTicks();
        MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "getCapabilitiesForType used %sms", Long.valueOf(Util.ticksToNow(currentTicks3)));
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "color format length: %s", Integer.valueOf(capabilitiesForType2.colorFormats.length));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = capabilitiesForType2.colorFormats;
            if (i3 >= iArr.length) {
                break;
            }
            int i5 = iArr[i3];
            Object[] objArr = new Object[i2];
            objArr[0] = Integer.valueOf(i5);
            Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "capabilities colorFormat: %s", objArr);
            if ((i5 == 19 || i5 == 21 || i5 == 2130706688) && i5 > i4) {
                i4 = i5;
                if (i5 == 19) {
                    break;
                }
            }
            i3++;
            i2 = 1;
        }
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), Integer.valueOf(i4));
        this.f326248g = i4;
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "found colorFormat: %s, used %sms", Integer.valueOf(this.f326248g), Long.valueOf(Util.ticksToNow(currentTicks2)));
        if (this.f326248g == 19) {
            this.f326265x = 2;
        } else {
            this.f326265x = 1;
        }
        long currentTicks4 = Util.currentTicks();
        this.f326252k = MediaFormat.createVideoFormat("video/avc", this.f326246e, this.f326247f);
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "createVideoFormat used %sms", Long.valueOf(Util.ticksToNow(currentTicks4)));
        if (C11171e.m11046c(23)) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType3 = mediaCodecInfo.getCapabilitiesForType("video/avc");
                if (!(capabilitiesForType3 == null || (codecProfileLevelArr = capabilitiesForType3.profileLevels) == null)) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.level = 0;
                    codecProfileLevel.profile = 0;
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        int i6 = codecProfileLevel2.profile;
                        int i7 = codecProfileLevel2.level;
                        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "profile: %s, level: %s", Integer.valueOf(i6), Integer.valueOf(i7));
                        if ((i6 == 1 || i6 == 2 || i6 == 8) && i6 >= codecProfileLevel.profile && i7 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i6;
                            codecProfileLevel.level = i7;
                        }
                    }
                    Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "best profile: %s, level: %s", Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level));
                    int i8 = codecProfileLevel.profile;
                    if (i8 > 0 && codecProfileLevel.level >= 256) {
                        this.f326252k.setInteger(Scopes.PROFILE, i8);
                        this.f326252k.setInteger(FirebaseAnalytics.C113379b.LEVEL, 256);
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetProfile error: %s", e.getMessage());
            }
        }
        try {
            if (!(!C11171e.m11046c(21) || (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc")) == null || (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) == null)) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    Log.m105924i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cbr bitrate mode");
                    this.f326252k.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(0)) {
                    Log.m105924i("MicroMsg.MMSightRemuxMediaCodecEncoder", "support cq bitrate mode");
                    this.f326252k.setInteger("bitrate-mode", 0);
                } else {
                    Log.m105924i("MicroMsg.MMSightRemuxMediaCodecEncoder", "both cbr and cq bitrate mode not support!");
                }
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.MMSightRemuxMediaCodecEncoder", "trySetBitRateMode error: %s", e2.getMessage());
        }
        this.f326252k.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f326258q);
        this.f326252k.setInteger("frame-rate", this.f326263v);
        this.f326252k.setInteger("color-format", this.f326248g);
        this.f326252k.setInteger("i-frame-interval", this.f326262u);
        Log.m105925i("MicroMsg.MMSightRemuxMediaCodecEncoder", "mediaFormat: %s", this.f326252k);
        C104619a b = C104619a.m140210b(mediaCodecInfo.getName());
        this.f326251j = b;
        b.mo148202a(this.f326252k, (Surface) null, (MediaCrypto) null, 1);
        this.f326251j.mo148222y();
        return 0;
    }

    /* renamed from: d */
    public void mo160044d(byte[] bArr, boolean z, long j) {
        byte[] bArr2 = bArr;
        try {
            if (!this.f326259r) {
                Log.m105920e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData, not start!");
            } else if (this.f326251j == null) {
                Log.m105920e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
            } else {
                long currentTicks = Util.currentTicks();
                this.f326253l = this.f326251j.mo148208j();
                this.f326254m = this.f326251j.mo148211m();
                int i = 0;
                while (true) {
                    C104619a aVar = this.f326251j;
                    if (aVar == null) {
                        break;
                    }
                    int f = aVar.mo148204f(600);
                    this.f326255n = f;
                    if (f >= 0 || i >= 10) {
                        break;
                    }
                    Log.m105924i("MicroMsg.MMSightRemuxMediaCodecEncoder", "video no input available, drain first");
                    mo160041a();
                    i++;
                }
                if (this.f326251j == null) {
                    Log.m105920e("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder is null");
                    return;
                }
                Log.m105927v("MicroMsg.MMSightRemuxMediaCodecEncoder", "inputBufferIndex: %s", Integer.valueOf(this.f326255n));
                long currentTicks2 = Util.currentTicks();
                if (this.f326255n < 0) {
                    Log.m105926v("MicroMsg.MMSightRemuxMediaCodecEncoder", "input buffer not available");
                } else if (!this.f326259r || z || bArr2 == null) {
                    Log.m105926v("MicroMsg.MMSightRemuxMediaCodecEncoder", "end of stream");
                    this.f326261t = true;
                    this.f326251j.mo148213o(this.f326255n, 0, 0, j, 4);
                    this.f326260s = true;
                } else {
                    Log.m105926v("MicroMsg.MMSightRemuxMediaCodecEncoder", "presentationTime: " + j);
                    ByteBuffer byteBuffer = this.f326253l[this.f326255n];
                    byteBuffer.clear();
                    byteBuffer.put(bArr2);
                    byteBuffer.position(0);
                    this.f326251j.mo148213o(this.f326255n, 0, bArr2.length, j, 0);
                }
                mo160041a();
                Log.m105927v("MicroMsg.MMSightRemuxMediaCodecEncoder", "encoder used %sms %sms", Long.valueOf(Util.ticksToNow(currentTicks)), Long.valueOf(Util.ticksToNow(currentTicks2)));
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecWriteYUVError");
            C115669n.INSTANCE.idkeyStat(440, 21, 1, false);
            Log.m105921e("MicroMsg.MMSightRemuxMediaCodecEncoder", "writeData error: %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecEncoder", e, "", new Object[0]);
        }
    }
}
