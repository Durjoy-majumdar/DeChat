package g23;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.C96533c0;
import com.tencent.p014mm.plugin.vlog.model.C96559y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: g23.j */
public final class C107707j extends C107697b {

    /* renamed from: A */
    public long f322260A = -1;

    /* renamed from: p */
    public Surface f322261p;

    /* renamed from: q */
    public SurfaceTexture f322262q;

    /* renamed from: r */
    public MediaExtractor f322263r;

    /* renamed from: s */
    public MediaCodec f322264s;

    /* renamed from: t */
    public MediaFormat f322265t;

    /* renamed from: u */
    public String f322266u = "";

    /* renamed from: v */
    public int f322267v = -1;

    /* renamed from: w */
    public boolean f322268w;

    /* renamed from: x */
    public boolean f322269x;

    /* renamed from: y */
    public final MediaCodec.BufferInfo f322270y = new MediaCodec.BufferInfo();

    /* renamed from: z */
    public int f322271z = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107707j(int i, int i2, int i3, C96559y0 y0Var) {
        super(i, i2, i3, y0Var, false, 16, (C8480h) null);
        C87412m.m108594g(y0Var, "material");
    }

    /* renamed from: a */
    public void mo158103a(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x019a A[SYNTHETIC, Splitter:B:51:0x019a] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x021d A[EDGE_INSN: B:71:0x021d->B:66:0x021d ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158104b(long r21, boolean r23) {
        /*
            r20 = this;
            r1 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "VideoPlayer playing : "
            r0.append(r2)
            long r2 = r20.mo158114g(r21)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.VLogVideoPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
        L_0x001c:
            long r3 = r20.mo158114g(r21)
            java.lang.String r0 = "crop-bottom"
            java.lang.String r5 = "crop-right"
            java.lang.String r6 = "crop-top"
            java.lang.String r7 = "crop-left"
            r10 = 1
            r11 = 0
            android.media.MediaCodec r12 = r1.f322264s     // Catch:{ Exception -> 0x018f }
            if (r12 == 0) goto L_0x0197
            long r13 = r1.f322260A     // Catch:{ Exception -> 0x018f }
            r15 = -1
            r8 = -1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L_0x008c
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r15
            long r15 = r3 - r13
            r17 = 0
            java.lang.String r9 = ", dura2 = "
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 > 0) goto L_0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018f }
            r0.<init>()     // Catch:{ Exception -> 0x018f }
            java.lang.String r5 = "[debug video] [draw] dura1 = "
            r0.append(r5)     // Catch:{ Exception -> 0x018f }
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            r0.append(r9)     // Catch:{ Exception -> 0x018f }
            r0.append(r13)     // Catch:{ Exception -> 0x018f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x018f }
            int r0 = r1.f322271z     // Catch:{ Exception -> 0x018f }
            if (r0 == r8) goto L_0x018d
            r12.releaseOutputBuffer(r0, r10)     // Catch:{ Exception -> 0x018f }
            r1.f322271z = r8     // Catch:{ Exception -> 0x018f }
            goto L_0x018d
        L_0x0069:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018f }
            r15.<init>()     // Catch:{ Exception -> 0x018f }
            java.lang.String r10 = "[debug video] [drop] dura1 = "
            r15.append(r10)     // Catch:{ Exception -> 0x018f }
            r15.append(r3)     // Catch:{ Exception -> 0x018f }
            r15.append(r9)     // Catch:{ Exception -> 0x018f }
            r15.append(r13)     // Catch:{ Exception -> 0x018f }
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ Exception -> 0x018f }
            int r3 = r1.f322271z     // Catch:{ Exception -> 0x018f }
            if (r3 == r8) goto L_0x008c
            r12.releaseOutputBuffer(r3, r11)     // Catch:{ Exception -> 0x018f }
            r1.f322271z = r8     // Catch:{ Exception -> 0x018f }
        L_0x008c:
            boolean r3 = r1.f322269x     // Catch:{ Exception -> 0x018f }
            if (r3 != 0) goto L_0x018d
            android.media.MediaCodec$BufferInfo r3 = r1.f322270y     // Catch:{ Exception -> 0x018f }
            r9 = 10000(0x2710, double:4.9407E-320)
            int r3 = r12.dequeueOutputBuffer(r3, r9)     // Catch:{ Exception -> 0x018f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018f }
            r4.<init>()     // Catch:{ Exception -> 0x018f }
            java.lang.String r9 = "drainoutputbuffer bufferIndex: "
            r4.append(r9)     // Catch:{ Exception -> 0x018f }
            r4.append(r3)     // Catch:{ Exception -> 0x018f }
            java.lang.String r9 = ", flags: "
            r4.append(r9)     // Catch:{ Exception -> 0x018f }
            android.media.MediaCodec$BufferInfo r9 = r1.f322270y     // Catch:{ Exception -> 0x018f }
            int r9 = r9.flags     // Catch:{ Exception -> 0x018f }
            r4.append(r9)     // Catch:{ Exception -> 0x018f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r4)     // Catch:{ Exception -> 0x018f }
            r4 = -2
            if (r3 != r4) goto L_0x0141
            android.media.MediaCodec r3 = r1.f322264s     // Catch:{ Exception -> 0x018f }
            if (r3 == 0) goto L_0x0197
            android.media.MediaFormat r3 = r3.getOutputFormat()     // Catch:{ Exception -> 0x018f }
            if (r3 == 0) goto L_0x0197
            java.lang.String r4 = "width"
            int r4 = r3.getInteger(r4)     // Catch:{ Exception -> 0x018f }
            r1.f322216f = r4     // Catch:{ Exception -> 0x018f }
            java.lang.String r4 = "height"
            int r4 = r3.getInteger(r4)     // Catch:{ Exception -> 0x018f }
            r1.f322217g = r4     // Catch:{ Exception -> 0x018f }
            boolean r4 = r3.containsKey(r7)     // Catch:{ Exception -> 0x018f }
            if (r4 == 0) goto L_0x00e1
            int r4 = r3.getInteger(r7)     // Catch:{ Exception -> 0x018f }
            goto L_0x00e2
        L_0x00e1:
            r4 = -1
        L_0x00e2:
            r1.f322218h = r4     // Catch:{ Exception -> 0x018f }
            boolean r4 = r3.containsKey(r6)     // Catch:{ Exception -> 0x018f }
            if (r4 == 0) goto L_0x00ef
            int r4 = r3.getInteger(r6)     // Catch:{ Exception -> 0x018f }
            goto L_0x00f0
        L_0x00ef:
            r4 = -1
        L_0x00f0:
            r1.f322219i = r4     // Catch:{ Exception -> 0x018f }
            boolean r4 = r3.containsKey(r5)     // Catch:{ Exception -> 0x018f }
            if (r4 == 0) goto L_0x00fd
            int r4 = r3.getInteger(r5)     // Catch:{ Exception -> 0x018f }
            goto L_0x00fe
        L_0x00fd:
            r4 = -1
        L_0x00fe:
            r1.f322220j = r4     // Catch:{ Exception -> 0x018f }
            boolean r4 = r3.containsKey(r0)     // Catch:{ Exception -> 0x018f }
            if (r4 == 0) goto L_0x010a
            int r8 = r3.getInteger(r0)     // Catch:{ Exception -> 0x018f }
        L_0x010a:
            r1.f322221k = r8     // Catch:{ Exception -> 0x018f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018f }
            r0.<init>()     // Catch:{ Exception -> 0x018f }
            java.lang.String r3 = "[debug video] format change, cropLeft = "
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            int r3 = r1.f322218h     // Catch:{ Exception -> 0x018f }
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            java.lang.String r3 = ", cropTop = "
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            int r3 = r1.f322219i     // Catch:{ Exception -> 0x018f }
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            java.lang.String r3 = ", cropRight = "
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            int r3 = r1.f322220j     // Catch:{ Exception -> 0x018f }
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            java.lang.String r3 = ", cropBottom = "
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            int r3 = r1.f322221k     // Catch:{ Exception -> 0x018f }
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x018f }
            goto L_0x0197
        L_0x0141:
            if (r3 < 0) goto L_0x0197
            android.media.MediaCodec$BufferInfo r0 = r1.f322270y     // Catch:{ Exception -> 0x018f }
            int r4 = r0.flags     // Catch:{ Exception -> 0x018f }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0168
            r4 = 1
            r1.f322269x = r4     // Catch:{ Exception -> 0x018f }
            r12.releaseOutputBuffer(r3, r11)     // Catch:{ Exception -> 0x018f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018f }
            r0.<init>()     // Catch:{ Exception -> 0x018f }
            java.lang.String r3 = "[debug video] [decode] output done, lastPts = "
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            long r3 = r1.f322260A     // Catch:{ Exception -> 0x018f }
            r0.append(r3)     // Catch:{ Exception -> 0x018f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x018f }
            goto L_0x018d
        L_0x0168:
            long r4 = r0.presentationTimeUs     // Catch:{ Exception -> 0x018f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018f }
            r0.<init>()     // Catch:{ Exception -> 0x018f }
            java.lang.String r6 = "[debug video] [decode] lastPts = "
            r0.append(r6)     // Catch:{ Exception -> 0x018f }
            long r6 = r1.f322260A     // Catch:{ Exception -> 0x018f }
            r0.append(r6)     // Catch:{ Exception -> 0x018f }
            java.lang.String r6 = ", pts = "
            r0.append(r6)     // Catch:{ Exception -> 0x018f }
            r0.append(r4)     // Catch:{ Exception -> 0x018f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x018f }
            r1.f322260A = r4     // Catch:{ Exception -> 0x018f }
            r1.f322271z = r3     // Catch:{ Exception -> 0x018f }
            goto L_0x0197
        L_0x018d:
            r4 = 1
            goto L_0x0198
        L_0x018f:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r4 = "drainOutputBuffer error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x0197:
            r4 = 0
        L_0x0198:
            if (r4 != 0) goto L_0x021d
            android.media.MediaExtractor r0 = r1.f322263r     // Catch:{ Exception -> 0x0213 }
            if (r0 == 0) goto L_0x001c
            android.media.MediaCodec r3 = r1.f322264s     // Catch:{ Exception -> 0x0213 }
            if (r3 == 0) goto L_0x001c
            boolean r4 = r1.f322268w     // Catch:{ Exception -> 0x0213 }
            if (r4 != 0) goto L_0x001c
            r4 = 10000(0x2710, double:4.9407E-320)
            int r4 = r3.dequeueInputBuffer(r4)     // Catch:{ Exception -> 0x0213 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0213 }
            r5.<init>()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r6 = "feedInputBuffer bufferIndex :"
            r5.append(r6)     // Catch:{ Exception -> 0x0213 }
            r5.append(r4)     // Catch:{ Exception -> 0x0213 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r5)     // Catch:{ Exception -> 0x0213 }
            if (r4 < 0) goto L_0x001c
            java.nio.ByteBuffer r5 = r3.getInputBuffer(r4)     // Catch:{ Exception -> 0x0213 }
            gy3.C87412m.m108591d(r5)     // Catch:{ Exception -> 0x0213 }
            int r6 = r0.readSampleData(r5, r11)     // Catch:{ Exception -> 0x0213 }
            long r12 = r0.getSampleTime()     // Catch:{ Exception -> 0x0213 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0213 }
            r5.<init>()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r7 = "[debug video] [decode] input pts = "
            r5.append(r7)     // Catch:{ Exception -> 0x0213 }
            r5.append(r12)     // Catch:{ Exception -> 0x0213 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r5)     // Catch:{ Exception -> 0x0213 }
            r0.advance()     // Catch:{ Exception -> 0x0213 }
            if (r6 <= 0) goto L_0x01f2
            r5 = 0
            r9 = 0
            r7 = r12
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch:{ Exception -> 0x0213 }
            goto L_0x001c
        L_0x01f2:
            r5 = 1
            r1.f322268w = r5     // Catch:{ Exception -> 0x0213 }
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 4
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch:{ Exception -> 0x0213 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0213 }
            r0.<init>()     // Catch:{ Exception -> 0x0213 }
            java.lang.String r3 = "[debug video] [decode] input done, pts = "
            r0.append(r3)     // Catch:{ Exception -> 0x0213 }
            r0.append(r12)     // Catch:{ Exception -> 0x0213 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0213 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x0213 }
            goto L_0x001c
        L_0x0213:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r4 = "feedInputBuffer error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
            goto L_0x001c
        L_0x021d:
            if (r23 == 0) goto L_0x0226
            android.graphics.SurfaceTexture r0 = r1.f322262q
            if (r0 == 0) goto L_0x0226
            r0.updateTexImage()
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g23.C107707j.mo158104b(long, boolean):void");
    }

    /* renamed from: c */
    public void mo158105c() {
        this.f322225o = true;
        this.f322262q = new SurfaceTexture(this.f322211a);
        this.f322261p = new Surface(this.f322262q);
        int mp4RotateVFS = SightVideoJNI.getMp4RotateVFS(this.f322214d.f282491c);
        this.f322222l = mp4RotateVFS;
        if (mp4RotateVFS == 90) {
            this.f322222l = 1;
        } else if (mp4RotateVFS == 180) {
            this.f322222l = 2;
        } else if (mp4RotateVFS == 270) {
            this.f322222l = 3;
        }
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(this.f322214d.f282491c);
        int trackCount = mediaExtractor.getTrackCount();
        int i = 0;
        while (true) {
            if (i >= trackCount) {
                break;
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            C87412m.m108593f(trackFormat, "mediaExtractor.getTrackFormat(i)");
            String string = trackFormat.getString("mime");
            C87412m.m108591d(string);
            if (C112551y.m153819s(string, "video", false)) {
                this.f322216f = trackFormat.getInteger("width");
                this.f322217g = trackFormat.getInteger("height");
                String string2 = trackFormat.getString("mime");
                C87412m.m108591d(string2);
                this.f322266u = string2;
                this.f322265t = trackFormat;
                this.f322267v = i;
                break;
            }
            i++;
        }
        mediaExtractor.release();
        StringBuilder sb = new StringBuilder();
        sb.append("prepare video, rotate = ");
        sb.append(this.f322222l);
        sb.append(", width = ");
        sb.append(this.f322216f);
        sb.append(", height = ");
        sb.append(this.f322217g);
        sb.append(", startTime = ");
        sb.append(this.f322214d.f282489a);
        sb.append(", endTime = ");
        sb.append(this.f322214d.f282490b);
        sb.append(", videoStartTime = ");
        C96533c0 c0Var = this.f322214d;
        C87412m.m108592e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
        sb.append(((C96559y0) c0Var).f282622f);
        sb.append(", videoEndTime = ");
        sb.append(((C96559y0) this.f322214d).f282623g);
        Log.m105924i("MicroMsg.VLogVideoPlayer", sb.toString());
    }

    /* renamed from: d */
    public void mo158106d(long j) {
        if (!this.f322224n) {
            this.f322224n = true;
            long currentTimeMillis = System.currentTimeMillis();
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.f322263r = mediaExtractor;
            mediaExtractor.setDataSource(this.f322214d.f282491c);
            MediaExtractor mediaExtractor2 = this.f322263r;
            if (mediaExtractor2 != null) {
                mediaExtractor2.selectTrack(this.f322267v);
            }
            MediaExtractor mediaExtractor3 = this.f322263r;
            if (mediaExtractor3 != null) {
                mediaExtractor3.seekTo(mo158114g(j) * ((long) 1000), 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[debug video] play seekTime :");
            sb.append(mo158114g(j));
            sb.append(", real seekTime: ");
            MediaExtractor mediaExtractor4 = this.f322263r;
            sb.append(mediaExtractor4 != null ? Long.valueOf(mediaExtractor4.getSampleTime()) : null);
            Log.m105924i("MicroMsg.VLogVideoPlayer", sb.toString());
            if (this.f322265t != null) {
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.f322266u);
                this.f322264s = createDecoderByType;
                if (createDecoderByType != null) {
                    createDecoderByType.configure(this.f322265t, this.f322261p, (MediaCrypto) null, 0);
                }
                MediaCodec mediaCodec = this.f322264s;
                if (mediaCodec != null) {
                    mediaCodec.start();
                }
            }
            this.f322260A = -1;
            this.f322271z = -1;
            this.f322268w = false;
            this.f322269x = false;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Log.m105918d("MicroMsg.VLogVideoPlayer", "[prepare] video play time = " + currentTimeMillis2);
        }
    }

    /* renamed from: e */
    public void mo158107e() {
        this.f322224n = false;
        try {
            MediaExtractor mediaExtractor = this.f322263r;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            MediaCodec mediaCodec = this.f322264s;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            MediaCodec mediaCodec2 = this.f322264s;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            Surface surface = this.f322261p;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture = this.f322262q;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e, "release error", new Object[0]);
        }
        this.f322261p = null;
        this.f322262q = null;
        this.f322263r = null;
        this.f322264s = null;
        this.f322265t = null;
        this.f322225o = false;
        Log.m105918d("MicroMsg.VLogVideoPlayer", "video player release");
    }

    /* renamed from: f */
    public void mo158108f() {
        this.f322224n = false;
        try {
            MediaCodec mediaCodec = this.f322264s;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            MediaCodec mediaCodec2 = this.f322264s;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            this.f322264s = null;
            MediaExtractor mediaExtractor = this.f322263r;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.f322263r = null;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e, "stop error", new Object[0]);
        }
        Log.m105918d("MicroMsg.VLogVideoPlayer", "video player stop");
    }

    /* renamed from: g */
    public final long mo158114g(long j) {
        C96533c0 c0Var = this.f322214d;
        C87412m.m108592e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
        return ((C96559y0) c0Var).f282622f + j;
    }
}
