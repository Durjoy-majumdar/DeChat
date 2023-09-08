package com.tencent.liteav.videoproducer.encoder;

import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.liteav.base.p1095a.C104503a;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.C17123s;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.encoder.C17465a;
import com.tencent.liteav.videoproducer.encoder.C17527v;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.liteav.videoproducer.producer.VideoProducerDef;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.tencent.liteav.videoproducer.encoder.c */
public final class C17503c implements C113473t.C113474a, C17527v.C17528a {

    /* renamed from: t */
    private static final C17505b f47498t = new C17505b(C17507d.CONTINUE_ENCODE, C17508e.NONE);

    /* renamed from: A */
    private boolean f47499A;

    /* renamed from: B */
    private boolean f47500B;

    /* renamed from: C */
    private int f47501C = 15;

    /* renamed from: a */
    public final String f47502a;

    /* renamed from: b */
    public long f47503b = 0;

    /* renamed from: c */
    public long f47504c = 0;

    /* renamed from: d */
    public float f47505d = 0.0f;

    /* renamed from: e */
    public float f47506e = 0.0f;

    /* renamed from: f */
    public float f47507f = 0.0f;

    /* renamed from: g */
    public double f47508g = 0.0d;

    /* renamed from: h */
    public boolean f47509h = false;

    /* renamed from: i */
    public boolean f47510i = false;

    /* renamed from: j */
    public VideoEncoderDef.EncodeStrategy f47511j = VideoEncoderDef.EncodeStrategy.PREFER_HARDWARE;

    /* renamed from: k */
    public VideoEncoderDef.C17464a f47512k = null;

    /* renamed from: l */
    public C17508e f47513l = C17508e.NONE;

    /* renamed from: m */
    public int f47514m = 0;

    /* renamed from: n */
    public int f47515n = 0;

    /* renamed from: o */
    public VideoEncodeParams f47516o;

    /* renamed from: p */
    public VideoEncodeParams f47517p;

    /* renamed from: q */
    public boolean f47518q = false;

    /* renamed from: r */
    public int f47519r = 0;

    /* renamed from: s */
    public final C17527v f47520s;

    /* renamed from: u */
    private long f47521u = 0;

    /* renamed from: v */
    private long f47522v = 0;

    /* renamed from: w */
    private long f47523w = 0;

    /* renamed from: x */
    private C113473t f47524x;

    /* renamed from: y */
    private final IVideoReporter f47525y;

    /* renamed from: z */
    private final VideoProducerDef.StreamType f47526z;

    /* renamed from: com.tencent.liteav.videoproducer.encoder.c$a */
    public interface C17504a {
        /* renamed from: a */
        C17505b mo20735a();
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.c$b */
    public static class C17505b {

        /* renamed from: a */
        public final C17507d f47527a;

        /* renamed from: b */
        public final C17508e f47528b;

        public C17505b(C17507d dVar, C17508e eVar) {
            this.f47527a = dVar;
            this.f47528b = eVar;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.c$d */
    public enum C17507d {
        CONTINUE_ENCODE(0),
        RESTART_ENCODER(1),
        USE_HARDWARE(2),
        USE_SOFTWARE(3),
        REPORT_ENCODE_FAILED(4);
        
        /* access modifiers changed from: private */
        public final int mPriority;

        private C17507d(int i) {
            this.mPriority = i;
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.c$e */
    public enum C17508e {
        NONE(0),
        STRATEGY(1),
        LOW_RESOLUTION_LIMIT(1),
        INPUT_OUTPUT_DIFFERENCE(2),
        NO_OUTPUT(3),
        CPU_USAGE(4),
        RPS_SCENE(5),
        ENCODER_ERROR(6),
        OTHERS_DO_NOT_SUPPORT_H265(7);
        
        public final int mPriority;

        private C17508e(int i) {
            this.mPriority = i;
        }
    }

    public C17503c(boolean z, IVideoReporter iVideoReporter, VideoProducerDef.StreamType streamType) {
        this.f47525y = iVideoReporter;
        this.f47499A = z;
        this.f47500B = false;
        this.f47526z = streamType;
        this.f47520s = new C17527v(this, streamType);
        this.f47502a = "EncoderSupervisor_" + streamType + "_" + hashCode();
    }

    /* renamed from: d */
    private void m17650d() {
        if (this.f47518q) {
            this.f47518q = false;
            this.f47519r = 0;
            VideoEncodeParams videoEncodeParams = this.f47517p;
            if (videoEncodeParams == null) {
                videoEncodeParams = this.f47516o;
            }
            if (videoEncodeParams != null) {
                videoEncodeParams.fps = this.f47501C;
            }
        }
    }

    /* renamed from: e */
    private void m17652e() {
        C17465a.C17466a.f47408a.f47406a.f47379c = false;
        this.f47525y.updateStatus(C17271i.STATUS_VIDEO_ENCODER_ABILITY, this.f47526z.mValue, C17465a.C17466a.f47408a.f47406a);
    }

    /* renamed from: f */
    private boolean m17654f() {
        VideoEncoderDef.EncodeStrategy encodeStrategy = this.f47511j;
        return encodeStrategy == VideoEncoderDef.EncodeStrategy.PREFER_HARDWARE || encodeStrategy == VideoEncoderDef.EncodeStrategy.PREFER_SOFTWARE || encodeStrategy == VideoEncoderDef.EncodeStrategy.USE_HARDWARE_ONLY;
    }

    /* renamed from: g */
    private boolean m17656g() {
        VideoEncoderDef.EncodeStrategy encodeStrategy = this.f47511j;
        return encodeStrategy == VideoEncoderDef.EncodeStrategy.PREFER_HARDWARE || encodeStrategy == VideoEncoderDef.EncodeStrategy.PREFER_SOFTWARE || encodeStrategy == VideoEncoderDef.EncodeStrategy.USE_SOFTWARE_ONLY;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C17505b m17657h() {
        if (!this.f47509h) {
            return null;
        }
        this.f47509h = false;
        if (this.f47512k == VideoEncoderDef.C17464a.HARDWARE) {
            this.f47514m++;
            VideoEncodeParams videoEncodeParams = this.f47516o;
            if (videoEncodeParams == null) {
                return f47498t;
            }
            if (videoEncodeParams.codecType == CodecType.H265) {
                this.f47499A = false;
                if (m17656g() && this.f47500B && this.f47515n < 5) {
                    return new C17505b(C17507d.USE_SOFTWARE, C17508e.OTHERS_DO_NOT_SUPPORT_H265);
                }
                this.f47514m = 0;
                VideoEncodeParams videoEncodeParams2 = this.f47516o;
                CodecType codecType = CodecType.H264;
                videoEncodeParams2.setCodecType(codecType);
                VideoEncodeParams videoEncodeParams3 = this.f47517p;
                if (videoEncodeParams3 != null) {
                    videoEncodeParams3.setCodecType(codecType);
                }
                m17652e();
                C17505b j = m17661j();
                return j == null ? new C17505b(C17507d.RESTART_ENCODER, C17508e.ENCODER_ERROR) : j;
            } else if (!m17656g() || this.f47515n >= 5) {
                return new C17505b(C17507d.REPORT_ENCODE_FAILED, C17508e.NONE);
            } else {
                return new C17505b(C17507d.USE_SOFTWARE, C17508e.ENCODER_ERROR);
            }
        } else {
            this.f47515n++;
            VideoEncodeParams videoEncodeParams4 = this.f47516o;
            if (videoEncodeParams4 == null) {
                return f47498t;
            }
            if (videoEncodeParams4.codecType == CodecType.H265) {
                this.f47500B = false;
                if (m17654f() && this.f47499A && this.f47514m <= 0) {
                    return new C17505b(C17507d.USE_HARDWARE, C17508e.OTHERS_DO_NOT_SUPPORT_H265);
                }
                this.f47515n = 0;
                VideoEncodeParams videoEncodeParams5 = this.f47516o;
                CodecType codecType2 = CodecType.H264;
                videoEncodeParams5.setCodecType(codecType2);
                VideoEncodeParams videoEncodeParams6 = this.f47517p;
                if (videoEncodeParams6 != null) {
                    videoEncodeParams6.setCodecType(codecType2);
                }
                m17652e();
                C17505b j2 = m17661j();
                return j2 == null ? new C17505b(C17507d.RESTART_ENCODER, C17508e.ENCODER_ERROR) : j2;
            } else if (m17654f() && this.f47514m <= 0) {
                return new C17505b(C17507d.USE_HARDWARE, C17508e.ENCODER_ERROR);
            } else {
                if (this.f47515n >= 5) {
                    return new C17505b(C17507d.REPORT_ENCODE_FAILED, C17508e.NONE);
                }
                return new C17505b(C17507d.RESTART_ENCODER, C17508e.ENCODER_ERROR);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C17505b m17659i() {
        VideoEncodeParams videoEncodeParams;
        VideoEncodeParams videoEncodeParams2 = this.f47516o;
        boolean z = false;
        boolean z2 = videoEncodeParams2 == null || videoEncodeParams2.codecType == CodecType.H264;
        if ((z2 && this.f47517p == null) || ((videoEncodeParams = this.f47517p) != null && videoEncodeParams.codecType == CodecType.H264)) {
            z = true;
        }
        if (!z) {
            return null;
        }
        C17505b j = m17661j();
        return (j != null || z2) ? j : new C17505b(C17507d.RESTART_ENCODER, C17508e.NONE);
    }

    /* renamed from: j */
    private C17505b m17661j() {
        VideoEncoderDef.EncodeStrategy encodeStrategy = this.f47511j;
        if (encodeStrategy == VideoEncoderDef.EncodeStrategy.USE_HARDWARE_ONLY && this.f47512k != VideoEncoderDef.C17464a.HARDWARE) {
            return new C17505b(C17507d.USE_HARDWARE, C17508e.STRATEGY);
        }
        if (encodeStrategy == VideoEncoderDef.EncodeStrategy.USE_SOFTWARE_ONLY && this.f47512k != VideoEncoderDef.C17464a.SOFTWARE) {
            return new C17505b(C17507d.USE_SOFTWARE, C17508e.STRATEGY);
        }
        VideoEncoderDef.EncodeStrategy encodeStrategy2 = VideoEncoderDef.EncodeStrategy.PREFER_HARDWARE;
        if ((encodeStrategy != encodeStrategy2 && encodeStrategy != VideoEncoderDef.EncodeStrategy.PREFER_SOFTWARE) || this.f47512k != null) {
            return null;
        }
        if (encodeStrategy == encodeStrategy2) {
            return new C17505b(C17507d.USE_HARDWARE, C17508e.STRATEGY);
        }
        return new C17505b(C17507d.USE_SOFTWARE, C17508e.STRATEGY);
    }

    /* renamed from: a */
    public final C17507d mo20729a(PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            this.f47521u++;
        }
        List<C17504a> asList = Arrays.asList(new C17504a[]{new C17509d(this), new C17512g(this), new C17513h(this), new C17514i(this), new C17515j(this), new C17516k(this), new C17517l(this), new C17518m(this), new C17519n(this), new C17510e(this)});
        VideoEncodeParams videoEncodeParams = this.f47516o;
        if (videoEncodeParams != null && videoEncodeParams.isTranscodingMode()) {
            asList = Arrays.asList(new C17504a[]{new C17511f(this)});
        }
        C17505b bVar = null;
        for (C17504a a : asList) {
            C17505b a2 = a.mo20735a();
            if (a2 != null) {
                if (bVar != null) {
                    if (!(a2.f47527a.mPriority > bVar.f47527a.mPriority || (a2.f47527a == bVar.f47527a && a2.f47528b.mPriority > bVar.f47528b.mPriority))) {
                    }
                }
                bVar = a2;
            }
        }
        VideoEncodeParams videoEncodeParams2 = this.f47517p;
        if (videoEncodeParams2 != null) {
            this.f47516o = videoEncodeParams2;
            this.f47517p = null;
        }
        if (bVar == null) {
            if (this.f47512k == null) {
                bVar = new C17505b(C17507d.USE_HARDWARE, C17508e.NONE);
            } else {
                bVar = new C17505b(C17507d.CONTINUE_ENCODE, C17508e.NONE);
            }
        }
        C17507d dVar = bVar.f47527a;
        if (dVar == C17507d.USE_HARDWARE) {
            VideoEncoderDef.C17464a aVar = this.f47512k;
            VideoEncoderDef.C17464a aVar2 = VideoEncoderDef.C17464a.HARDWARE;
            if (aVar != aVar2) {
                int i = this.f47513l.mPriority;
                C17508e eVar = bVar.f47528b;
                if (i <= eVar.mPriority) {
                    this.f47512k = aVar2;
                    this.f47513l = eVar;
                    if (eVar == C17508e.CPU_USAGE) {
                        this.f47525y.notifyEvent(C17263h.C17269b.EVT_VIDEO_ENCODE_SW_TO_HW_CPU_USAGE, (String) null, new Object[0]);
                    }
                    m17650d();
                }
            }
            return C17507d.CONTINUE_ENCODE;
        } else if (dVar == C17507d.USE_SOFTWARE) {
            VideoEncoderDef.C17464a aVar3 = this.f47512k;
            VideoEncoderDef.C17464a aVar4 = VideoEncoderDef.C17464a.SOFTWARE;
            if (aVar3 != aVar4) {
                int i2 = this.f47513l.mPriority;
                C17508e eVar2 = bVar.f47528b;
                if (i2 <= eVar2.mPriority) {
                    this.f47512k = aVar4;
                    this.f47513l = eVar2;
                    if (eVar2 == C17508e.ENCODER_ERROR) {
                        this.f47525y.notifyEvent(C17263h.C17269b.EVT_VIDEO_ENCODE_HW_TO_SW_MEDIACODEC_NOT_WORK, (String) null, new Object[0]);
                    }
                    C113473t tVar = new C113473t(Looper.myLooper(), this);
                    this.f47524x = tVar;
                    tVar.mo169974a(1000, 1000);
                }
            }
            return C17507d.CONTINUE_ENCODE;
        }
        if (bVar.f47527a != C17507d.CONTINUE_ENCODE) {
            LiteavLog.m16901i(this.f47502a, "instruction: " + bVar.f47527a + ", reason: " + bVar.f47528b);
        }
        if (bVar.f47527a == C17507d.RESTART_ENCODER) {
            mo20734c();
        }
        return bVar.f47527a;
    }

    /* renamed from: a_ */
    public final void mo20405a_() {
        int i;
        long a = C104503a.m139784a().mo147171a("Video", "SWToHWThreshold_CheckCount");
        if (this.f47504c < a) {
            int[] a2 = C17123s.m16935a();
            this.f47504c++;
            this.f47505d += (float) (a2[0] / 10);
            this.f47506e += (float) (a2[1] / 10);
            VideoEncodeParams videoEncodeParams = this.f47516o;
            if (videoEncodeParams != null && (i = videoEncodeParams.fps) != 0) {
                this.f47507f = (float) (((double) this.f47507f) + ((this.f47508g * 100.0d) / ((double) i)));
                return;
            }
            return;
        }
        float f = (float) a;
        float f2 = this.f47507f / f;
        float f3 = this.f47506e / f;
        if (this.f47505d / f >= ((float) C104503a.m139784a().mo147171a("Video", "SWToHWThreshold_CPU_MAX")) || f2 <= ((float) C104503a.m139784a().mo147171a("Video", "SWToHWThreshold_FPS_MIN")) || (f3 >= ((float) C104503a.m139784a().mo147171a("Video", "SWToHWThreshold_CPU")) && f2 <= ((float) C104503a.m139784a().mo147171a("Video", "SWToHWThreshold_FPS")))) {
            this.f47510i = true;
        }
        C113473t tVar = this.f47524x;
        if (tVar != null) {
            tVar.mo169973a();
            this.f47524x = null;
        }
        this.f47504c = 0;
        this.f47505d = 0.0f;
        this.f47506e = 0.0f;
        this.f47507f = 0.0f;
        this.f47508g = 0.0d;
    }

    /* renamed from: b */
    public final VideoEncodeParams mo20733b() {
        VideoEncodeParams videoEncodeParams = this.f47517p;
        if (videoEncodeParams == null) {
            videoEncodeParams = this.f47516o;
        }
        return new VideoEncodeParams(videoEncodeParams);
    }

    /* renamed from: c */
    public final void mo20734c() {
        this.f47503b = 0;
        this.f47521u = 0;
        this.f47523w = 0;
        this.f47522v = 0;
    }

    /* renamed from: com.tencent.liteav.videoproducer.encoder.c$c */
    public static class C17506c {

        /* renamed from: a */
        public VideoEncoderDef.EncoderProfile f47529a;

        private C17506c() {
            this.f47529a = VideoEncoderDef.EncoderProfile.PROFILE_BASELINE;
        }

        public /* synthetic */ C17506c(byte b) {
            this();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ C17505b m17653f(C17503c cVar) {
        if (cVar.f47512k == VideoEncoderDef.C17464a.SOFTWARE || cVar.f47521u - cVar.f47503b <= 30) {
            return f47498t;
        }
        String str = cVar.f47502a;
        LiteavLog.m16901i(str, "checkFrameInOutDifference in frame:" + cVar.f47521u + " out frame " + cVar.f47503b);
        return new C17505b(C17507d.RESTART_ENCODER, C17508e.INPUT_OUTPUT_DIFFERENCE);
    }

    /* renamed from: b */
    public static /* synthetic */ C17505b m17647b(C17503c cVar) {
        VideoEncodeParams videoEncodeParams;
        VideoEncodeParams videoEncodeParams2 = cVar.f47516o;
        boolean z = true;
        boolean z2 = videoEncodeParams2 != null && videoEncodeParams2.codecType == CodecType.H265;
        if ((!z2 || cVar.f47517p != null) && ((videoEncodeParams = cVar.f47517p) == null || videoEncodeParams.codecType != CodecType.H265)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        boolean z3 = cVar.f47499A;
        if (!z3 || !cVar.f47500B) {
            boolean z4 = cVar.f47500B;
            if (z4 || !z3) {
                if (!z3 && z4) {
                    if (cVar.f47512k == VideoEncoderDef.C17464a.SOFTWARE) {
                        if (z2) {
                            return new C17505b(C17507d.CONTINUE_ENCODE, C17508e.NONE);
                        }
                        return new C17505b(C17507d.RESTART_ENCODER, C17508e.NONE);
                    } else if (cVar.m17656g()) {
                        return new C17505b(C17507d.USE_SOFTWARE, C17508e.OTHERS_DO_NOT_SUPPORT_H265);
                    }
                }
            } else if (cVar.f47512k == VideoEncoderDef.C17464a.HARDWARE) {
                if (z2) {
                    return new C17505b(C17507d.CONTINUE_ENCODE, C17508e.NONE);
                }
                return new C17505b(C17507d.RESTART_ENCODER, C17508e.NONE);
            } else if (cVar.m17654f()) {
                return new C17505b(C17507d.USE_HARDWARE, C17508e.OTHERS_DO_NOT_SUPPORT_H265);
            }
            String str = cVar.f47502a;
            LiteavLog.m16898e(str, "checkEncodeH265, enable h265 failed because encode strategy conflict, mIsHWSupportH265:" + cVar.f47499A + ", mIsSwSupportH265:" + cVar.f47500B + ", mUsingEncodeType:" + cVar.f47512k + ", mUsingEncodeStrategy:" + cVar.f47511j);
            cVar.m17652e();
            cVar.f47517p.setCodecType(CodecType.H264);
            return cVar.m17659i();
        }
        C17505b j = cVar.m17661j();
        return (j != null || z2) ? j : new C17505b(C17507d.RESTART_ENCODER, C17508e.NONE);
    }

    /* renamed from: c */
    public static /* synthetic */ C17505b m17648c(C17503c cVar) {
        VideoEncodeParams videoEncodeParams = cVar.f47517p;
        if (videoEncodeParams == null) {
            return f47498t;
        }
        C17505b bVar = f47498t;
        boolean isEnablesRps = videoEncodeParams.isEnablesRps();
        VideoEncodeParams videoEncodeParams2 = cVar.f47516o;
        if (isEnablesRps == (videoEncodeParams2 != null && videoEncodeParams2.isEnablesRps())) {
            return bVar;
        }
        if (!isEnablesRps) {
            cVar.m17650d();
        }
        VideoEncoderDef.EncodeStrategy encodeStrategy = cVar.f47511j;
        if (encodeStrategy != VideoEncoderDef.EncodeStrategy.USE_HARDWARE_ONLY) {
            if (isEnablesRps && cVar.f47512k != VideoEncoderDef.C17464a.SOFTWARE) {
                return new C17505b(C17507d.USE_SOFTWARE, C17508e.RPS_SCENE);
            }
            if (isEnablesRps || encodeStrategy != VideoEncoderDef.EncodeStrategy.PREFER_HARDWARE) {
                return new C17505b(C17507d.RESTART_ENCODER, C17508e.RPS_SCENE);
            }
            return new C17505b(C17507d.USE_HARDWARE, C17508e.RPS_SCENE);
        } else if (!isEnablesRps) {
            return bVar;
        } else {
            String str = cVar.f47502a;
            LiteavLog.m16898e(str, "checkRpsStatus, enable rps failed while current encode strategy is " + cVar.f47511j);
            C17505b bVar2 = new C17505b(C17507d.REPORT_ENCODE_FAILED, C17508e.RPS_SCENE);
            cVar.f47517p.setReferenceStrategy(VideoEncoderDef.ReferenceStrategy.FIX_GOP);
            return bVar2;
        }
    }

    /* renamed from: i */
    public static /* synthetic */ C17505b m17660i(C17503c cVar) {
        if (cVar.f47510i) {
            cVar.f47510i = false;
            if (cVar.f47512k == VideoEncoderDef.C17464a.SOFTWARE && cVar.f47514m <= 0) {
                return new C17505b(C17507d.USE_HARDWARE, C17508e.CPU_USAGE);
            }
        }
        return f47498t;
    }

    /* renamed from: d */
    public static /* synthetic */ C17505b m17649d(C17503c cVar) {
        VideoEncodeParams videoEncodeParams = cVar.f47517p;
        if (videoEncodeParams == null) {
            return f47498t;
        }
        C17505b bVar = f47498t;
        VideoEncodeParams videoEncodeParams2 = cVar.f47516o;
        return (videoEncodeParams2 == null || videoEncodeParams2.fps == videoEncodeParams.fps || cVar.f47512k != VideoEncoderDef.C17464a.HARDWARE) ? bVar : new C17505b(C17507d.RESTART_ENCODER, C17508e.NONE);
    }

    /* renamed from: j */
    public static /* synthetic */ C17505b m17662j(C17503c cVar) {
        VideoEncoderDef.C17464a aVar;
        if (cVar.m17656g() && ((aVar = cVar.f47512k) == VideoEncoderDef.C17464a.HARDWARE || aVar == null)) {
            VideoEncodeParams videoEncodeParams = cVar.f47516o;
            boolean z = false;
            int i = videoEncodeParams != null ? videoEncodeParams.width * videoEncodeParams.height : 0;
            boolean z2 = i != 0 && i <= 10000;
            VideoEncodeParams videoEncodeParams2 = cVar.f47517p;
            int i2 = videoEncodeParams2 != null ? videoEncodeParams2.width * videoEncodeParams2.height : 0;
            if (i2 != 0 && i2 <= 10000) {
                z = true;
            }
            if (z || (videoEncodeParams2 == null && z2)) {
                return new C17505b(C17507d.USE_SOFTWARE, C17508e.LOW_RESOLUTION_LIMIT);
            }
        }
        return f47498t;
    }

    /* renamed from: h */
    public static /* synthetic */ C17505b m17658h(C17503c cVar) {
        if (cVar.f47512k != VideoEncoderDef.C17464a.SOFTWARE && cVar.f47522v + FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION < SystemClock.elapsedRealtime()) {
            cVar.f47522v = SystemClock.elapsedRealtime();
            long j = cVar.f47523w;
            if (j != 0 && j == cVar.f47503b) {
                return new C17505b(C17507d.RESTART_ENCODER, C17508e.NO_OUTPUT);
            }
            cVar.f47523w = cVar.f47503b;
        }
        return f47498t;
    }

    /* renamed from: a */
    public final void mo20730a(double d) {
        this.f47508g = d;
        this.f47525y.updateStatus(C17271i.STATUS_VIDEO_ENCODE_REAL_FRAME_RATE, Double.valueOf(d));
    }

    /* renamed from: a */
    public final void mo20731a(long j) {
        this.f47525y.updateStatus(C17271i.STATUS_VIDEO_ENCODE_REAL_ENCODE_BITRATE, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo20732a(VideoEncodeParams videoEncodeParams) {
        VideoProducerDef.StreamType streamType;
        VideoEncodeParams videoEncodeParams2 = new VideoEncodeParams(videoEncodeParams);
        C17506c cVar = new C17506c((byte) 0);
        if (videoEncodeParams2.referenceStrategy == VideoEncoderDef.ReferenceStrategy.RPS) {
            VideoProducerDef.StreamType streamType2 = this.f47526z;
            if (streamType2 == VideoProducerDef.StreamType.STREAM_TYPE_BIG_VIDEO || streamType2 == VideoProducerDef.StreamType.STREAM_TYPE_SUB_VIDEO) {
                cVar.f47529a = VideoEncoderDef.EncoderProfile.PROFILE_HIGHRPS;
            }
        } else if (!videoEncodeParams2.enableBFrame && ((streamType = this.f47526z) == VideoProducerDef.StreamType.STREAM_TYPE_BIG_VIDEO || streamType == VideoProducerDef.StreamType.STREAM_TYPE_SUB_VIDEO)) {
            cVar.f47529a = VideoEncoderDef.EncoderProfile.PROFILE_HIGH;
        }
        if (videoEncodeParams2.encoderProfile == null) {
            videoEncodeParams2.encoderProfile = cVar.f47529a;
        }
        if (this.f47518q) {
            videoEncodeParams2.fps = this.f47519r;
        }
        this.f47501C = videoEncodeParams.fps;
        this.f47517p = videoEncodeParams2;
    }

    /* renamed from: a */
    public static /* synthetic */ C17505b m17646a(C17503c cVar) {
        VideoEncodeParams videoEncodeParams = cVar.f47517p;
        if (videoEncodeParams == null) {
            return f47498t;
        }
        C17505b bVar = f47498t;
        if (cVar.f47516o == null) {
            return bVar;
        }
        VideoEncodeParams videoEncodeParams2 = new VideoEncodeParams(videoEncodeParams);
        videoEncodeParams2.setBaseFrameIndex(cVar.f47516o.baseFrameIndex);
        videoEncodeParams2.setBaseGopIndex(cVar.f47516o.baseGopIndex);
        videoEncodeParams2.setReferenceStrategy(cVar.f47516o.getReferenceStrategy());
        videoEncodeParams2.setFps(cVar.f47516o.fps);
        videoEncodeParams2.setCodecType(cVar.f47516o.codecType);
        videoEncodeParams2.setBitrate(cVar.f47516o.bitrate);
        return !cVar.f47516o.equals(videoEncodeParams2) ? new C17505b(C17507d.RESTART_ENCODER, C17508e.NONE) : bVar;
    }
}
