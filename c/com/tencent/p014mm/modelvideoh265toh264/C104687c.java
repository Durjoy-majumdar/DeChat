package com.tencent.p014mm.modelvideoh265toh264;

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
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.modelvideoh265toh264.c */
public class C104687c {

    /* renamed from: a */
    public int f310851a = -1;

    /* renamed from: b */
    public C104688a f310852b;

    /* renamed from: c */
    public int f310853c;

    /* renamed from: d */
    public int f310854d;

    /* renamed from: e */
    public int f310855e;

    /* renamed from: f */
    public int f310856f;

    /* renamed from: g */
    public int f310857g;

    /* renamed from: h */
    public C104619a f310858h;

    /* renamed from: i */
    public MediaFormat f310859i;

    /* renamed from: j */
    public ByteBuffer[] f310860j;

    /* renamed from: k */
    public ByteBuffer[] f310861k;

    /* renamed from: l */
    public int f310862l = -1;

    /* renamed from: m */
    public int f310863m = -1;

    /* renamed from: n */
    public MediaCodec.BufferInfo f310864n;

    /* renamed from: o */
    public int f310865o = 0;

    /* renamed from: p */
    public boolean f310866p = false;

    /* renamed from: q */
    public boolean f310867q = false;

    /* renamed from: r */
    public boolean f310868r = false;

    /* renamed from: s */
    public int f310869s;

    /* renamed from: t */
    public int f310870t;

    /* renamed from: u */
    public byte[] f310871u;

    /* renamed from: v */
    public int f310872v;

    /* renamed from: com.tencent.mm.modelvideoh265toh264.c$a */
    public interface C104688a {
    }

    public C104687c(int i, int i2, int i3, int i4, int i5) {
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "create MediaCodecTransCodeEncoder, init targetWidth: %d, targetHeight: %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f310853c = i;
        this.f310854d = i2;
        this.f310870t = i5;
        this.f310869s = i4;
        this.f310864n = new MediaCodec.BufferInfo();
        this.f310865o = i3;
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "create MMSightRemuxMediaCodecEncoder, targetWidth: %s, targetHeight: %s, bitrate: %s", Integer.valueOf(this.f310853c), Integer.valueOf(this.f310854d), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public final void mo148334a() {
        this.f310863m = this.f310858h.mo148205g(this.f310864n, 600);
        Log.m105926v("MicroMsg.MediaCodecTransCodeEncoder", "outputBufferIndex-->" + this.f310863m);
        while (true) {
            int i = this.f310863m;
            if (i == -1) {
                Log.m105919d("MicroMsg.MediaCodecTransCodeEncoder", "no output from encoder available, break encoderEndStream %s", Boolean.valueOf(this.f310868r));
                if (!this.f310868r) {
                    return;
                }
            } else if (i == -3) {
                this.f310861k = this.f310858h.mo148211m();
                Log.m105918d("MicroMsg.MediaCodecTransCodeEncoder", "encoder output buffers changed");
            } else if (i == -2) {
                Log.m105918d("MicroMsg.MediaCodecTransCodeEncoder", "encoder output format changed: " + this.f310858h.mo148212n());
            } else if (i < 0) {
                Log.m105928w("MicroMsg.MediaCodecTransCodeEncoder", "unexpected result from encoder.dequeueOutputBuffer: " + this.f310863m);
            } else {
                Log.m105926v("MicroMsg.MediaCodecTransCodeEncoder", "perform encoding");
                ByteBuffer byteBuffer = this.f310861k[this.f310863m];
                if (byteBuffer != null) {
                    this.f310856f++;
                    MediaCodec.BufferInfo bufferInfo = this.f310864n;
                    if ((bufferInfo.flags & 2) != 0) {
                        Log.m105927v("MicroMsg.MediaCodecTransCodeEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG, size: %s, %s", Integer.valueOf(bufferInfo.size), Boolean.FALSE);
                    }
                    MediaCodec.BufferInfo bufferInfo2 = this.f310864n;
                    if (bufferInfo2.size != 0) {
                        byteBuffer.position(bufferInfo2.offset);
                        MediaCodec.BufferInfo bufferInfo3 = this.f310864n;
                        byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
                        MediaCodec.BufferInfo bufferInfo4 = this.f310864n;
                        if (!(bufferInfo4 == null || this.f310852b == null)) {
                            MP4MuxerJNI.writeH264DataLock(this.f310851a, byteBuffer, bufferInfo4.size);
                        }
                    }
                    this.f310858h.mo148216r(this.f310863m, false);
                    if ((this.f310864n.flags & 4) != 0) {
                        if (!this.f310867q) {
                            Log.m105920e("MicroMsg.MediaCodecTransCodeEncoder", "reached end of stream unexpectedly");
                            return;
                        }
                        Log.m105929w("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder, frameCount: %s, writeFrameCount: %s", Integer.valueOf(this.f310856f), Integer.valueOf(this.f310857g));
                        try {
                            this.f310858h.mo148223z();
                            this.f310858h.mo148214p();
                            this.f310858h = null;
                            this.f310866p = false;
                            return;
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.MediaCodecTransCodeEncoder", "do stop encoder error: %s", e.getMessage());
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("encoderOutputBuffer " + this.f310863m + " was null");
                }
            }
            int g = this.f310858h.mo148205g(this.f310864n, 600);
            this.f310863m = g;
            if (g <= 0) {
                Log.m105927v("MicroMsg.MediaCodecTransCodeEncoder", "get outputBufferIndex %d", Integer.valueOf(g));
            }
            if (this.f310863m < 0 && !this.f310868r) {
                return;
            }
        }
    }

    /* renamed from: b */
    public int mo148335b(int i) {
        try {
            this.f310851a = i;
            return mo148336c();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MediaCodecTransCodeEncoder", "init error: %s, try to re-init again", e.getMessage());
            try {
                return mo148336c();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.MediaCodecTransCodeEncoder", "re-init again error: %s", e2.getMessage());
                return -1;
            }
        }
    }

    /* renamed from: c */
    public final int mo148336c() {
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
            Log.m105920e("MicroMsg.MediaCodecTransCodeEncoder", "Unable to find an appropriate codec for video/avc");
            return -1;
        }
        int i2 = 1;
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "found codec: %s, used %sms", mediaCodecInfo.getName(), Long.valueOf(Util.ticksToNow(currentTicks)));
        long currentTicks2 = Util.currentTicks();
        long currentTicks3 = Util.currentTicks();
        MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc");
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "getCapabilitiesForType used %sms", Long.valueOf(Util.ticksToNow(currentTicks3)));
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "color format length: %s", Integer.valueOf(capabilitiesForType2.colorFormats.length));
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
            Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "capabilities colorFormat: %s", objArr);
            if ((i5 == 19 || i5 == 21 || i5 == 2130706688) && i5 > i4) {
                i4 = i5;
                if (i5 == 21) {
                    break;
                }
            }
            i3++;
            i2 = 1;
        }
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), Integer.valueOf(i4));
        this.f310855e = i4;
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "found colorFormat: %s, used %sms", Integer.valueOf(this.f310855e), Long.valueOf(Util.ticksToNow(currentTicks2)));
        if (this.f310855e == 19) {
            this.f310872v = 2;
        } else {
            this.f310872v = 1;
        }
        long currentTicks4 = Util.currentTicks();
        this.f310859i = MediaFormat.createVideoFormat("video/avc", this.f310853c, this.f310854d);
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "createVideoFormat used %sms", Long.valueOf(Util.ticksToNow(currentTicks4)));
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
                        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "profile: %s, level: %s", Integer.valueOf(i6), Integer.valueOf(i7));
                        if ((i6 == 1 || i6 == 2 || i6 == 8) && i6 >= codecProfileLevel.profile && i7 >= codecProfileLevel.level) {
                            codecProfileLevel.profile = i6;
                            codecProfileLevel.level = i7;
                        }
                    }
                    Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "best profile: %s, level: %s", Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level));
                    int i8 = codecProfileLevel.profile;
                    if (i8 > 0 && codecProfileLevel.level >= 256) {
                        this.f310859i.setInteger(Scopes.PROFILE, i8);
                        this.f310859i.setInteger(FirebaseAnalytics.C113379b.LEVEL, 256);
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MediaCodecTransCodeEncoder", "trySetProfile error: %s", e.getMessage());
            }
        }
        try {
            if (!(!C11171e.m11046c(21) || (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc")) == null || (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) == null)) {
                if (encoderCapabilities.isBitrateModeSupported(2)) {
                    Log.m105924i("MicroMsg.MediaCodecTransCodeEncoder", "support cbr bitrate mode");
                    this.f310859i.setInteger("bitrate-mode", 2);
                } else if (encoderCapabilities.isBitrateModeSupported(0)) {
                    Log.m105924i("MicroMsg.MediaCodecTransCodeEncoder", "support cq bitrate mode");
                    this.f310859i.setInteger("bitrate-mode", 0);
                } else {
                    Log.m105924i("MicroMsg.MediaCodecTransCodeEncoder", "both cbr and cq bitrate mode not support!");
                }
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.MediaCodecTransCodeEncoder", "trySetBitRateMode error: %s", e2.getMessage());
        }
        this.f310859i.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f310865o);
        this.f310859i.setInteger("frame-rate", this.f310870t);
        this.f310859i.setInteger("color-format", this.f310855e);
        this.f310859i.setInteger("i-frame-interval", this.f310869s);
        Log.m105925i("MicroMsg.MediaCodecTransCodeEncoder", "mediaFormat: %s", this.f310859i);
        C104619a b = C104619a.m140210b(mediaCodecInfo.getName());
        this.f310858h = b;
        b.mo148202a(this.f310859i, (Surface) null, (MediaCrypto) null, 1);
        this.f310858h.mo148222y();
        return 0;
    }

    /* renamed from: d */
    public void mo148337d(byte[] bArr, boolean z, long j) {
        byte[] bArr2 = bArr;
        try {
            if (!this.f310866p) {
                Log.m105920e("MicroMsg.MediaCodecTransCodeEncoder", "writeData, not start!");
            } else if (this.f310858h == null) {
                Log.m105920e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
            } else {
                long currentTicks = Util.currentTicks();
                this.f310860j = this.f310858h.mo148208j();
                this.f310861k = this.f310858h.mo148211m();
                int i = 0;
                while (true) {
                    C104619a aVar = this.f310858h;
                    if (aVar == null) {
                        break;
                    }
                    int f = aVar.mo148204f(600);
                    this.f310862l = f;
                    if (f >= 0 || i >= 10) {
                        break;
                    }
                    Log.m105924i("MicroMsg.MediaCodecTransCodeEncoder", "video no input available, drain first");
                    mo148334a();
                    i++;
                }
                if (this.f310858h == null) {
                    Log.m105920e("MicroMsg.MediaCodecTransCodeEncoder", "encoder is null");
                    return;
                }
                Log.m105927v("MicroMsg.MediaCodecTransCodeEncoder", "inputBufferIndex: %s", Integer.valueOf(this.f310862l));
                long currentTicks2 = Util.currentTicks();
                if (this.f310862l < 0) {
                    Log.m105926v("MicroMsg.MediaCodecTransCodeEncoder", "input buffer not available");
                } else if (!this.f310866p || z || bArr2 == null) {
                    Log.m105926v("MicroMsg.MediaCodecTransCodeEncoder", "end of stream");
                    this.f310868r = true;
                    this.f310858h.mo148213o(this.f310862l, 0, 0, j, 4);
                    this.f310867q = true;
                } else {
                    Log.m105926v("MicroMsg.MediaCodecTransCodeEncoder", "presentationTime: " + j);
                    ByteBuffer byteBuffer = this.f310860j[this.f310862l];
                    byteBuffer.clear();
                    byteBuffer.put(bArr2);
                    byteBuffer.position(0);
                    this.f310858h.mo148213o(this.f310862l, 0, bArr2.length, j, 0);
                }
                mo148334a();
                Log.m105927v("MicroMsg.MediaCodecTransCodeEncoder", "encoder used %sms %sms", Long.valueOf(Util.ticksToNow(currentTicks)), Long.valueOf(Util.ticksToNow(currentTicks2)));
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MediaCodecTransCodeEncoder", "writeData error: %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.MediaCodecTransCodeEncoder", e, "", new Object[0]);
        }
    }
}
