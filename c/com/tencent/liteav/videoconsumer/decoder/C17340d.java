package com.tencent.liteav.videoconsumer.decoder;

import android.os.SystemClock;
import com.tencent.liteav.base.p1181b.C113456a;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.d */
public final class C17340d {

    /* renamed from: A */
    public int f46987A = 0;

    /* renamed from: B */
    public boolean f46988B = false;

    /* renamed from: a */
    public String f46989a = "DecoderSupervisor";

    /* renamed from: b */
    public final C17345d f46990b;

    /* renamed from: c */
    public final IVideoReporter f46991c;

    /* renamed from: d */
    public final SpsInfo f46992d = new SpsInfo();

    /* renamed from: e */
    public boolean f46993e;

    /* renamed from: f */
    public boolean f46994f;

    /* renamed from: g */
    public VideoDecodeController.DecodeStrategy f46995g = VideoDecodeController.DecodeStrategy.PREFER_HARDWARE;

    /* renamed from: h */
    public C17334au.C17335a f46996h;

    /* renamed from: i */
    public boolean f46997i = false;

    /* renamed from: j */
    public C17346e f46998j;

    /* renamed from: k */
    public long f46999k;

    /* renamed from: l */
    public long f47000l;

    /* renamed from: m */
    public int f47001m = 8;

    /* renamed from: n */
    public int f47002n = 6;

    /* renamed from: o */
    public boolean f47003o;

    /* renamed from: p */
    public int f47004p;

    /* renamed from: q */
    public int f47005q;

    /* renamed from: r */
    public boolean f47006r;

    /* renamed from: s */
    public int f47007s = 0;

    /* renamed from: t */
    public int f47008t;

    /* renamed from: u */
    public boolean f47009u;

    /* renamed from: v */
    public long f47010v;

    /* renamed from: w */
    public final C113456a f47011w = new C113456a(1000);

    /* renamed from: x */
    public float f47012x;

    /* renamed from: y */
    public long f47013y = 0;

    /* renamed from: z */
    public long f47014z = 0;

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$1 */
    public static /* synthetic */ class C173411 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47015a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.liteav.videoconsumer.decoder.d$c[] r0 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47015a = r0
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.SWITCH_TO_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47015a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.SWITCH_TO_HARDWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47015a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.RESTART_DECODER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47015a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videoconsumer.decoder.d$c r1 = com.tencent.liteav.videoconsumer.decoder.C17340d.C17344c.CONTINUE_DECODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.decoder.C17340d.C173411.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$a */
    public interface C17342a {
        /* renamed from: a */
        C17343b mo20419a(EncodedVideoFrame encodedVideoFrame);
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$b */
    public static class C17343b {

        /* renamed from: a */
        public final C17344c f47016a;

        /* renamed from: b */
        public final C17346e f47017b;

        public C17343b(C17344c cVar, C17346e eVar) {
            this.f47016a = cVar;
            this.f47017b = eVar;
            if (cVar != C17344c.SWITCH_TO_HARDWARE && cVar != C17344c.SWITCH_TO_SOFTWARE && eVar != C17346e.NONE) {
                throw new RuntimeException("SwitchReason must be NONE.)");
            }
        }

        public final String toString() {
            return "CheckResult{instruction=" + this.f47016a + ", reason=" + this.f47017b + '}';
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$c */
    public enum C17344c {
        CONTINUE_DECODE(0),
        DROP_FRAME(1),
        RESTART_DECODER(2),
        SWITCH_TO_HARDWARE(3),
        SWITCH_TO_SOFTWARE(3),
        REQUEST_KEY_FRAME(4),
        REPORT_DECODE_ERROR(5);
        
        /* access modifiers changed from: private */
        public final int mPriority;

        private C17344c(int i) {
            this.mPriority = i;
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$d */
    public interface C17345d {
        /* renamed from: a */
        SpsInfo mo20421a(boolean z, ByteBuffer byteBuffer);
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.d$e */
    public enum C17346e {
        NONE(0),
        RPS_MODE_UPDATED(1),
        HARDWARE_DECODER_ABNORMAL(2),
        LOW_RESOLUTION(2),
        DECODE_ERROR(3),
        OTHERS_DO_NOT_SUPPORT_H265(4);
        
        public final int mPriority;

        private C17346e(int i) {
            this.mPriority = i;
        }
    }

    public C17340d(C17345d dVar, IVideoReporter iVideoReporter, boolean z, boolean z2) {
        this.f46990b = dVar;
        this.f46991c = iVideoReporter;
        this.f46993e = z;
        this.f46994f = z2;
        String str = this.f46989a + "_" + hashCode();
        this.f46989a = str;
        LiteavLog.m16901i(str, "mIsSW265Supported:" + z + ",mIsHW265Supported:" + z2);
        mo20417b();
    }

    /* renamed from: a */
    public final boolean mo20416a(EncodedVideoFrame encodedVideoFrame) {
        if (encodedVideoFrame.isH265() && !this.f46994f) {
            return false;
        }
        VideoDecodeController.DecodeStrategy decodeStrategy = this.f46995g;
        if (decodeStrategy == VideoDecodeController.DecodeStrategy.USE_HARDWARE_ONLY || decodeStrategy == VideoDecodeController.DecodeStrategy.PREFER_HARDWARE || decodeStrategy == VideoDecodeController.DecodeStrategy.PREFER_SOFTWARE) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo20418b(EncodedVideoFrame encodedVideoFrame) {
        if (encodedVideoFrame.isH265() && !this.f46993e) {
            return false;
        }
        VideoDecodeController.DecodeStrategy decodeStrategy = this.f46995g;
        if (decodeStrategy == VideoDecodeController.DecodeStrategy.USE_SOFTWARE_ONLY || decodeStrategy == VideoDecodeController.DecodeStrategy.PREFER_HARDWARE || decodeStrategy == VideoDecodeController.DecodeStrategy.PREFER_SOFTWARE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo20415a() {
        this.f46991c.notifyError(C17263h.C17268a.ERR_VIDEO_NO_AVAILABLE_HEVC_DECODERS, "no available hevc decoders", new Object[0]);
    }

    /* renamed from: b */
    public final void mo20417b() {
        this.f47008t = 0;
        this.f47009u = false;
        this.f47003o = false;
        this.f47005q = 0;
        this.f47013y = 0;
        this.f47006r = false;
        this.f46992d.set(new SpsInfo());
        this.f47000l = 0;
        this.f46999k = 0;
        this.f47004p = 0;
        this.f46996h = null;
        this.f46998j = C17346e.NONE;
        this.f47007s = 0;
        this.f47012x = 0.0f;
        this.f47010v = 0;
        this.f46988B = false;
        this.f47011w.f339519a = SystemClock.elapsedRealtime();
    }
}
