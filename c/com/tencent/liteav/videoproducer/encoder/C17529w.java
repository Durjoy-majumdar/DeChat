package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.C17205a;
import com.tencent.liteav.videobase.common.C17206b;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.encoder.C17501bf;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.tencent.liteav.videoproducer.encoder.w */
public final class C17529w {

    /* renamed from: A */
    private long f47592A = Long.MIN_VALUE;

    /* renamed from: B */
    private boolean f47593B = false;

    /* renamed from: C */
    private double f47594C = 0.0d;

    /* renamed from: D */
    private long f47595D = 0;

    /* renamed from: E */
    private long f47596E = 0;

    /* renamed from: F */
    private long f47597F = 0;

    /* renamed from: G */
    private long f47598G = 0;

    /* renamed from: H */
    private long f47599H = 0;

    /* renamed from: I */
    private final AtomicLong f47600I = new AtomicLong(0);

    /* renamed from: J */
    private final List<Long> f47601J = new ArrayList();

    /* renamed from: K */
    private final AtomicLong f47602K = new AtomicLong(0);

    /* renamed from: a */
    public String f47603a;

    /* renamed from: b */
    public final Bundle f47604b;

    /* renamed from: c */
    public C17111b f47605c;

    /* renamed from: d */
    public MediaCodec f47606d;

    /* renamed from: e */
    public C17501bf.C17502a f47607e;

    /* renamed from: f */
    public VideoEncodeParams f47608f;

    /* renamed from: g */
    public long f47609g = 0;

    /* renamed from: h */
    public C113473t f47610h = null;

    /* renamed from: i */
    public ServerVideoProducerConfig f47611i;

    /* renamed from: j */
    public boolean f47612j = true;

    /* renamed from: k */
    public final Deque<Long> f47613k = new LinkedList();

    /* renamed from: l */
    public int f47614l = 0;

    /* renamed from: m */
    public final Runnable f47615m = C17530x.m17717a(this);

    /* renamed from: n */
    public final Runnable f47616n = C17532z.m17719a(this);

    /* renamed from: o */
    private final IVideoReporter f47617o;

    /* renamed from: p */
    private final VideoProducerDef.StreamType f47618p;

    /* renamed from: q */
    private byte[] f47619q = null;

    /* renamed from: r */
    private boolean f47620r = true;

    /* renamed from: s */
    private long f47621s = 0;

    /* renamed from: t */
    private long f47622t = 0;

    /* renamed from: u */
    private long f47623u = 0;

    /* renamed from: v */
    private int f47624v = -1;

    /* renamed from: w */
    private final Deque<Long> f47625w = new LinkedList();

    /* renamed from: x */
    private long f47626x = 0;

    /* renamed from: y */
    private long f47627y = 0;

    /* renamed from: z */
    private long f47628z = 0;

    public C17529w(Bundle bundle, IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
        this.f47617o = iVideoReporter;
        this.f47604b = bundle;
        this.f47618p = streamType;
        this.f47603a = "SurfaceInputVideoEncoder_" + streamType + "_" + hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17708c() {
        boolean z;
        while (true) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            try {
                int dequeueOutputBuffer = this.f47606d.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(4));
                if (dequeueOutputBuffer == -1) {
                    break;
                } else if (dequeueOutputBuffer == -3) {
                    LiteavLog.m16901i(this.f47603a, "encoder output buffers changed");
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.f47606d.getOutputFormat();
                    C17501bf.C17502a aVar = this.f47607e;
                    if (aVar != null) {
                        aVar.onOutputFormatChanged(outputFormat);
                    }
                    LiteavLog.m16902i(this.f47603a, "encoder output format changed: %s", outputFormat);
                } else if (dequeueOutputBuffer < 0) {
                    mo20745a("dequeueOutputBuffer return ".concat(String.valueOf(dequeueOutputBuffer)));
                    break;
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f47601J.add(Long.valueOf(elapsedRealtime - this.f47600I.getAndSet(elapsedRealtime)));
                    ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f47606d.getOutputBuffer(dequeueOutputBuffer) : this.f47606d.getOutputBuffers()[dequeueOutputBuffer];
                    int i = bufferInfo.size;
                    if (i == 0 && (bufferInfo.flags & 4) == 0) {
                        mo20745a("size is zero, but it isn't end of stream");
                    } else {
                        byte[] bArr = new byte[i];
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        outputBuffer.get(bArr);
                        byte[] a = m17704a(bArr);
                        VideoEncodeParams videoEncodeParams = this.f47608f;
                        if (videoEncodeParams != null && !videoEncodeParams.annexb) {
                            a = m17707b(a);
                        }
                        if (this.f47620r && (bufferInfo.flags & 1) > 0) {
                            byte[] bArr2 = this.f47619q;
                            byte[] bArr3 = new byte[(bArr2.length + a.length)];
                            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                            System.arraycopy(a, 0, bArr3, this.f47619q.length, a.length);
                            a = bArr3;
                        }
                        int i2 = bufferInfo.flags;
                        if ((i2 & 2) > 0) {
                            this.f47619q = (byte[]) a.clone();
                        } else {
                            boolean z2 = (i2 & 1) > 0;
                            if (z2) {
                                this.f47624v = -1;
                            }
                            VideoEncodeParams videoEncodeParams2 = this.f47608f;
                            if (videoEncodeParams2 != null && !videoEncodeParams2.fullIFrame) {
                                int i3 = this.f47624v + 1;
                                this.f47624v = i3;
                                if (i3 == videoEncodeParams2.fps * videoEncodeParams2.gop) {
                                    mo20746b();
                                }
                            }
                            long length = (long) a.length;
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            if (z2) {
                                long j = this.f47598G;
                                if (elapsedRealtime2 > j + 1000) {
                                    this.f47597F = (long) (((((double) this.f47599H) * 8000.0d) / ((double) (elapsedRealtime2 - j))) / 1024.0d);
                                    this.f47599H = 0;
                                    this.f47598G = elapsedRealtime2;
                                    if (!this.f47613k.isEmpty()) {
                                        int i4 = this.f47608f.fps;
                                        if (i4 - ((int) this.f47594C) <= Math.max(i4 / 2, 5) && SystemClock.elapsedRealtime() > this.f47613k.peekFirst().longValue()) {
                                            this.f47613k.removeFirst();
                                            if (((long) this.f47614l) - this.f47597F > ((long) Math.max(this.f47608f.bitrate / 2, 100))) {
                                                this.f47604b.putBoolean("need_restart_when_down_bitrate", true);
                                                this.f47615m.run();
                                                this.f47613k.clear();
                                            }
                                        }
                                    }
                                }
                            }
                            this.f47599H += length;
                            m17709d();
                            if (z2) {
                                this.f47622t++;
                                this.f47623u = 0;
                            } else {
                                this.f47623u++;
                            }
                            this.f47621s++;
                            long e = m17710e();
                            long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                            if (this.f47626x == 0) {
                                this.f47626x = e;
                            }
                            if (this.f47627y == 0) {
                                this.f47627y = millis;
                            }
                            long j2 = millis + (this.f47626x - this.f47627y);
                            long j3 = this.f47628z;
                            if (e <= j3) {
                                e = j3 + 1;
                            }
                            if (e > j2) {
                                e = j2;
                            }
                            this.f47628z = e;
                            EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
                            encodedVideoFrame.nalType = z2 ? C17205a.IDR : C17205a.P;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a.length);
                            encodedVideoFrame.data = allocateDirect;
                            allocateDirect.put(a);
                            encodedVideoFrame.data.rewind();
                            encodedVideoFrame.dts = e;
                            encodedVideoFrame.pts = j2;
                            encodedVideoFrame.info = bufferInfo;
                            encodedVideoFrame.gopIndex = this.f47622t;
                            long j4 = this.f47623u;
                            encodedVideoFrame.frameIndex = j4;
                            encodedVideoFrame.gopFrameIndex = j4;
                            if (!z2) {
                                j4--;
                            }
                            encodedVideoFrame.refFrameIndex = j4;
                            encodedVideoFrame.profileType = C17206b.BASELINE;
                            VideoEncodeParams videoEncodeParams3 = this.f47608f;
                            encodedVideoFrame.codecType = videoEncodeParams3.codecType;
                            encodedVideoFrame.width = videoEncodeParams3.width;
                            encodedVideoFrame.height = videoEncodeParams3.height;
                            if ((bufferInfo.flags & 4) > 0) {
                                mo20742a();
                                z = true;
                            } else {
                                boolean z3 = videoEncodeParams3.enableBFrame;
                                if (!z3 && !this.f47593B && j2 < this.f47592A) {
                                    LiteavLog.m16902i(this.f47603a, "has B frame,isEnablesBframe=%b,mLastPresentationTimestamp=%d,packet.pts=%d", Boolean.valueOf(z3), Long.valueOf(this.f47592A), Long.valueOf(encodedVideoFrame.pts));
                                    this.f47593B = true;
                                    PersistStorage persistStorage = new PersistStorage(PersistStorage.GLOBAL_DOMAIN);
                                    persistStorage.put("Liteav.Video.android.local.rtc.enable.high.profile", 0);
                                    persistStorage.commit();
                                    C17501bf.C17502a aVar2 = this.f47607e;
                                    if (aVar2 != null) {
                                        aVar2.mo20691a();
                                    }
                                }
                                this.f47592A = encodedVideoFrame.pts;
                                z = false;
                            }
                            C17501bf.C17502a aVar3 = this.f47607e;
                            if (aVar3 != null) {
                                aVar3.onEncodedNAL(encodedVideoFrame, z);
                            }
                        }
                    }
                    this.f47606d.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            } catch (Exception e2) {
                mo20745a(e2.getMessage());
                LiteavLog.m16899e(this.f47603a, "dequeueOutputBuffer failed.", (Throwable) e2);
            }
        }
        synchronized (this.f47625w) {
            if (this.f47625w.size() != 0) {
                int i5 = this.f47608f.fps;
                int i6 = i5 != 0 ? 500 / i5 : 10;
                if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
                    this.f47605c.postDelayed(this.f47616n, (long) i6);
                } else if (!this.f47605c.hasCallbacks(this.f47616n)) {
                    this.f47605c.postDelayed(this.f47616n, (long) i6);
                }
            }
        }
    }

    /* renamed from: d */
    private void m17709d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime <= this.f47595D + TimeUnit.SECONDS.toMillis(2)) {
            this.f47596E++;
            return;
        }
        this.f47594C = (((double) this.f47596E) * 1000.0d) / ((double) (elapsedRealtime - this.f47595D));
        this.f47596E = 1;
        this.f47595D = elapsedRealtime;
        long j = -1;
        for (Long longValue : this.f47601J) {
            long longValue2 = longValue.longValue();
            if (j < longValue2) {
                j = longValue2;
            }
        }
        this.f47602K.set(j);
        this.f47601J.clear();
    }

    /* renamed from: e */
    private long m17710e() {
        long longValue;
        synchronized (this.f47625w) {
            Long pollFirst = this.f47625w.pollFirst();
            longValue = pollFirst == null ? 0 : pollFirst.longValue();
        }
        return longValue;
    }

    /* renamed from: a */
    public final void mo20743a(long j) {
        if (this.f47608f.fullIFrame) {
            this.f47605c.mo19361a(C17469ac.m17559a(this));
        }
        synchronized (this.f47625w) {
            if (this.f47625w.isEmpty()) {
                this.f47600I.set(SystemClock.elapsedRealtime());
            }
            this.f47625w.addLast(Long.valueOf(j));
            if (this.f47625w.size() > 30) {
                LiteavLog.m16898e(this.f47603a, "too much unencoded frame, hw encoder error");
                this.f47605c.post(this.f47615m);
            }
        }
        this.f47605c.postDelayed(this.f47616n, 10);
    }

    /* renamed from: b */
    public final void mo20746b() {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 19 && this.f47606d != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.f47606d.setParameters(bundle);
            } catch (Exception e) {
                LiteavLog.m16899e(this.f47603a, "requestSyncFrame failed.", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    private static byte[] m17707b(byte[] bArr) {
        int i;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(20);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 <= length) {
            int i5 = i2 + 2;
            if (i5 < length && bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i5] == 1) {
                i = 3;
            } else {
                int i6 = i2 + 3;
                i = (i6 < length && bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i5] == 0 && bArr[i6] == 1) ? 4 : 1;
            }
            if (i == 3 || i == 4 || i2 == length) {
                if (i4 != i2) {
                    arrayList.add(new int[]{i4, i2});
                    i3 += i2 - i4;
                }
                i4 = i2 + i;
            }
            i2 += i;
        }
        byte[] bArr2 = new byte[(i3 + (arrayList.size() * 4))];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            int i8 = iArr[1] - iArr[0];
            ByteBuffer order = ByteBuffer.wrap(new byte[4]).order(ByteOrder.BIG_ENDIAN);
            order.putInt(i8);
            System.arraycopy(order.array(), 0, bArr2, i7, 4);
            int i9 = i7 + 4;
            System.arraycopy(bArr, iArr[0], bArr2, i9, i8);
            i7 = i9 + i8;
        }
        return bArr2;
    }

    /* renamed from: a */
    public final void mo20745a(String str) {
        this.f47605c.post(C17472af.m17562a(this, str));
    }

    /* renamed from: a */
    public final void mo20742a() {
        if (this.f47610h != null) {
            LiteavLog.m16901i(this.f47603a, "stopEosTimer");
            this.f47610h.mo169973a();
            this.f47610h = null;
        }
    }

    /* renamed from: b */
    private MediaCodec m17705b(String str) {
        String str2;
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(str);
        try {
            str2 = createEncoderByType.getName();
        } catch (Exception e) {
            LiteavLog.m16906w(this.f47603a, "mediaCodec getName failed.", e);
            str2 = null;
        }
        LiteavLog.m16896d(this.f47603a, "codecName=".concat(String.valueOf(str2)));
        if (str2 == null || !str2.equals("OMX.google.h264.encoder")) {
            return createEncoderByType;
        }
        LiteavLog.m16905w(this.f47603a, "will be destroyed codecName=".concat(str2));
        mo20744a(createEncoderByType);
        throw new IOException("this is a Google H264 soft encoder. cancel use MediaCodec.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef A[Catch:{ Exception -> 0x0147 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013f A[SYNTHETIC, Splitter:B:58:0x013f] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface mo20741a(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r8) {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.f47609g = r0
            r0 = -9223372036854775808
            r7.f47592A = r0
            int r0 = r8.bitrate
            if (r0 != 0) goto L_0x0026
            int r0 = r8.width
            int r0 = r0 * r0
            int r1 = r8.height
            int r1 = r1 * r1
            int r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r0 = r0 * r2
            int r0 = (int) r0
            r8.bitrate = r0
        L_0x0026:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = new com.tencent.liteav.videoproducer.encoder.VideoEncodeParams
            r0.<init>(r8)
            r7.f47608f = r0
            long r1 = r0.baseFrameIndex
            r7.f47621s = r1
            long r0 = r0.baseGopIndex
            r7.f47622t = r0
            r0 = 0
            r7.f47623u = r0
            com.tencent.liteav.base.a.a r8 = com.tencent.liteav.base.p1095a.C104503a.m139784a()
            java.lang.String r2 = "Video"
            java.lang.String r3 = "CheckVideoEncDownBps"
            long r2 = r8.mo147171a(r2, r3)
            r8 = 1
            r4 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            r0 = 1
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r7.f47612j = r0
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r7.f47608f
            com.tencent.liteav.videobase.common.CodecType r1 = r0.codecType
            com.tencent.liteav.videobase.common.CodecType r2 = com.tencent.liteav.videobase.common.CodecType.H265
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = "video/hevc"
            goto L_0x005f
        L_0x005c:
            java.lang.String r1 = "video/avc"
        L_0x005f:
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r2 = r0.encoderProfile
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r3 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_MAIN
            if (r2 != r3) goto L_0x0069
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r2 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_HIGH
            r0.encoderProfile = r2
        L_0x0069:
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r0 = r0.encoderProfile
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r2 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_HIGH
            if (r0 == r2) goto L_0x0071
            if (r0 != r3) goto L_0x0082
        L_0x0071:
            com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig r0 = r7.f47611i
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.isHardwareEncoderHighProfileAllowed()
            if (r0 == 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r7.f47608f
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r5 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_BASELINE
            r0.encoderProfile = r5
        L_0x0082:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r7.f47608f
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r5 = r0.encoderProfile
            if (r5 == r2) goto L_0x008a
            if (r5 != r3) goto L_0x00b9
        L_0x008a:
            boolean r0 = r0.enableBFrame
            if (r0 != 0) goto L_0x00b9
            com.tencent.liteav.base.storage.PersistStorage r0 = new com.tencent.liteav.base.storage.PersistStorage
            java.lang.String r2 = "com.liteav.storage.global"
            r0.<init>(r2)
            java.lang.String r2 = "Liteav.Video.android.local.rtc.enable.high.profile"
            java.lang.Integer r0 = r0.getInt(r2)
            java.lang.String r2 = r7.f47603a
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "enable high profile from persist storage:"
            java.lang.String r3 = r5.concat(r3)
            com.tencent.liteav.base.util.LiteavLog.m16901i(r2, r3)
            if (r0 == 0) goto L_0x00b9
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00b3
            goto L_0x00b9
        L_0x00b3:
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r0 = r7.f47608f
            com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$EncoderProfile r2 = com.tencent.liteav.videoproducer.encoder.VideoEncoderDef.EncoderProfile.PROFILE_BASELINE
            r0.encoderProfile = r2
        L_0x00b9:
            r0 = 0
            android.media.MediaCodec r2 = r7.m17705b((java.lang.String) r1)     // Catch:{ Exception -> 0x014a }
            com.tencent.liteav.videoproducer.encoder.u r3 = new com.tencent.liteav.videoproducer.encoder.u     // Catch:{ Exception -> 0x0147 }
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r5 = r7.f47608f     // Catch:{ Exception -> 0x0147 }
            r3.<init>(r2, r1, r5)     // Catch:{ Exception -> 0x0147 }
            r3.f309902a = r4     // Catch:{ Exception -> 0x0147 }
            android.media.MediaFormat r1 = r3.mo147228a()     // Catch:{ Exception -> 0x0147 }
            boolean r5 = r7.m17703a(r2, r1)     // Catch:{ Exception -> 0x0147 }
            if (r5 != 0) goto L_0x00ec
            r3.f309903b = r4     // Catch:{ Exception -> 0x0147 }
            android.media.MediaFormat r1 = r3.mo147228a()     // Catch:{ Exception -> 0x0147 }
            boolean r5 = r7.m17703a(r2, r1)     // Catch:{ Exception -> 0x0147 }
            if (r5 != 0) goto L_0x00ec
            r3.f309904c = r4     // Catch:{ Exception -> 0x0147 }
            android.media.MediaFormat r1 = r3.mo147228a()     // Catch:{ Exception -> 0x0147 }
            boolean r3 = r7.m17703a(r2, r1)     // Catch:{ Exception -> 0x0147 }
            if (r3 == 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r3 = 0
            goto L_0x00ed
        L_0x00ec:
            r3 = 1
        L_0x00ed:
            if (r3 == 0) goto L_0x013f
            android.view.Surface r3 = r2.createInputSurface()     // Catch:{ Exception -> 0x0147 }
            r2.start()     // Catch:{ Exception -> 0x013d }
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r5 = r7.f47608f     // Catch:{ Exception -> 0x0118 }
            java.lang.String r6 = "width"
            int r6 = r1.getInteger(r6)     // Catch:{ Exception -> 0x0118 }
            r5.width = r6     // Catch:{ Exception -> 0x0118 }
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r5 = r7.f47608f     // Catch:{ Exception -> 0x0118 }
            java.lang.String r6 = "height"
            int r6 = r1.getInteger(r6)     // Catch:{ Exception -> 0x0118 }
            r5.height = r6     // Catch:{ Exception -> 0x0118 }
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r5 = r7.f47608f     // Catch:{ Exception -> 0x0118 }
            java.lang.String r6 = "bitrate"
            int r1 = r1.getInteger(r6)     // Catch:{ Exception -> 0x0118 }
            int r1 = r1 / 1024
            r5.bitrate = r1     // Catch:{ Exception -> 0x0118 }
            goto L_0x0124
        L_0x0118:
            r1 = move-exception
            java.lang.String r5 = r7.f47603a     // Catch:{ Exception -> 0x013d }
            java.lang.String r6 = "MediaFormat get key fail"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x013d }
            r8[r4] = r1     // Catch:{ Exception -> 0x013d }
            com.tencent.liteav.base.util.LiteavLog.m16906w(r5, r6, r8)     // Catch:{ Exception -> 0x013d }
        L_0x0124:
            java.lang.String r8 = r7.f47603a     // Catch:{ Exception -> 0x013d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013d }
            java.lang.String r5 = "start MediaCodec with encode params:"
            r1.<init>(r5)     // Catch:{ Exception -> 0x013d }
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r5 = r7.f47608f     // Catch:{ Exception -> 0x013d }
            r1.append(r5)     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x013d }
            com.tencent.liteav.base.util.LiteavLog.m16901i(r8, r1)     // Catch:{ Exception -> 0x013d }
            r7.f47606d = r2
            return r3
        L_0x013d:
            r8 = move-exception
            goto L_0x014d
        L_0x013f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ Exception -> 0x0147 }
            java.lang.String r1 = "configure encoder failed."
            r8.<init>(r1)     // Catch:{ Exception -> 0x0147 }
            throw r8     // Catch:{ Exception -> 0x0147 }
        L_0x0147:
            r8 = move-exception
            r3 = r0
            goto L_0x014d
        L_0x014a:
            r8 = move-exception
            r2 = r0
            r3 = r2
        L_0x014d:
            if (r3 == 0) goto L_0x0152
            r3.release()
        L_0x0152:
            r7.mo20744a((android.media.MediaCodec) r2)
            com.tencent.liteav.videobase.videobase.h$c r1 = com.tencent.liteav.videobase.videobase.C17263h.C17270c.WARNING_VIDEO_ENCODE_START_FAILED
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Start encoder failed:"
            r2.<init>(r3)
            java.lang.String r3 = r8.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt()
            r5 = 23
            if (r3 < r5) goto L_0x0194
            boolean r3 = r8 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x0194
            r3 = r8
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            int r3 = r3.getErrorCode()
            r5 = 1100(0x44c, float:1.541E-42)
            if (r3 != r5) goto L_0x0194
            com.tencent.liteav.videobase.videobase.h$c r1 = com.tencent.liteav.videobase.videobase.C17263h.C17270c.WARNING_VIDEO_ENCODE_START_FAILED_INSUFFICIENT_RESOURCE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Insufficient resource, Start encoder failed:"
            r2.<init>(r3)
            java.lang.String r3 = r8.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x0194:
            com.tencent.liteav.videobase.videobase.IVideoReporter r3 = r7.f47617o
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r3.notifyWarning(r1, r2, r4)
            java.lang.String r1 = r7.f47603a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Start MediaCodec failed,encode params:"
            r2.<init>(r3)
            com.tencent.liteav.videoproducer.encoder.VideoEncodeParams r3 = r7.f47608f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.liteav.base.util.LiteavLog.m16899e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoproducer.encoder.C17529w.mo20741a(com.tencent.liteav.videoproducer.encoder.VideoEncodeParams):android.view.Surface");
    }

    /* renamed from: a */
    private boolean m17703a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            LiteavLog.m16902i(this.f47603a, "configure format: %s", mediaFormat);
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return true;
        } catch (Exception e) {
            LiteavLog.m16899e(this.f47603a, "configure failed.", (Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m17704a(byte[] bArr) {
        if (bArr.length > 5 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0) {
            int i = 0;
            while (true) {
                int i2 = i + 3;
                if (i2 >= bArr.length) {
                    i = 0;
                    break;
                }
                byte b = bArr[i];
                if ((b == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 0 && bArr[i2] == 1) || (b == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1)) {
                    break;
                }
                i++;
            }
            if (i != 0) {
                int length = bArr.length - i;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, i, bArr2, 0, length);
                return bArr2;
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public final void mo20744a(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e) {
                LiteavLog.m16899e(this.f47603a, "destroy mediaCodec stop failed.", (Throwable) e);
            }
            try {
                mediaCodec.release();
            } catch (Exception e2) {
                LiteavLog.m16899e(this.f47603a, "destroy mediaCodec release failed.", (Throwable) e2);
            }
        }
    }
}
