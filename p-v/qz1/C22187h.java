package qz1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.emoji.api.IWXGFJNIService;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.hardcoder.WXHardCoderJNI;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import kg3.C76577a;
import kj2.C117407d;
import p008bq.C92281h1;

/* renamed from: qz1.h */
public class C22187h extends C101325b {

    /* renamed from: A */
    public long f62749A = 0;

    /* renamed from: B */
    public long f62750B = 0;

    /* renamed from: C */
    public long f62751C = 0;

    /* renamed from: D */
    public long f62752D = 0;

    /* renamed from: E */
    public long f62753E;

    /* renamed from: F */
    public long f62754F = 0;

    /* renamed from: G */
    public boolean f62755G = false;

    /* renamed from: H */
    public MMHandler f62756H = new MMHandler(Looper.getMainLooper());

    /* renamed from: I */
    public int f62757I;

    /* renamed from: J */
    public boolean f62758J = true;

    /* renamed from: K */
    public final Runnable f62759K = new C22188a();

    /* renamed from: L */
    public final Runnable f62760L = new C22189b();

    /* renamed from: M */
    public final Runnable f62761M = new C22190c();

    /* renamed from: N */
    public Runnable f62762N;

    /* renamed from: P */
    public int f62763P = -1;

    /* renamed from: Q */
    public int f62764Q = 0;

    /* renamed from: R */
    public final Runnable f62765R = new C22191d();

    /* renamed from: d */
    public boolean f62766d = false;

    /* renamed from: e */
    public boolean f62767e = false;

    /* renamed from: f */
    public volatile long f62768f;

    /* renamed from: g */
    public final Object f62769g = new Object();

    /* renamed from: h */
    public int[] f62770h = new int[4];

    /* renamed from: i */
    public int[] f62771i = new int[4];

    /* renamed from: j */
    public float f62772j = 1.0f;

    /* renamed from: n */
    public float f62773n = 1.0f;

    /* renamed from: o */
    public final Rect f62774o = new Rect();

    /* renamed from: p */
    public boolean f62775p;

    /* renamed from: q */
    public final Paint f62776q = new Paint(6);

    /* renamed from: r */
    public Bitmap[] f62777r = new Bitmap[2];

    /* renamed from: s */
    public Bitmap f62778s;

    /* renamed from: t */
    public int f62779t = 0;

    /* renamed from: u */
    public int f62780u = 0;

    /* renamed from: v */
    public int f62781v;

    /* renamed from: w */
    public int f62782w;

    /* renamed from: x */
    public int f62783x = 0;

    /* renamed from: y */
    public int f62784y = -1;

    /* renamed from: z */
    public float f62785z;

    /* renamed from: qz1.h$a */
    public class C22188a implements Runnable {
        public C22188a() {
        }

        public void run() {
            C22187h hVar = C22187h.this;
            if (hVar.f62767e) {
                return;
            }
            if (hVar.f62766d || hVar.f62784y == 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C22187h hVar2 = C22187h.this;
                if (uptimeMillis >= hVar2.f62754F) {
                    hVar2.f62752D = System.currentTimeMillis();
                    C22187h hVar3 = C22187h.this;
                    hVar3.f62758J = true;
                    hVar3.invalidateSelf();
                }
            }
        }
    }

    /* renamed from: qz1.h$b */
    public class C22189b implements Runnable {
        public C22189b() {
        }

        public void run() {
            C22187h hVar = C22187h.this;
            hVar.mo35305f(hVar.f62759K, hVar.f62751C);
        }
    }

    /* renamed from: qz1.h$c */
    public class C22190c implements Runnable {
        public C22190c() {
        }

        public void run() {
            C22187h hVar = C22187h.this;
            hVar.f62784y = -1;
            synchronized (hVar.f62769g) {
                ((IWXGFJNIService) C86312j.m106911c(IWXGFJNIService.class)).nativeRewindBuffer(C22187h.this.f62768f);
            }
            C22187h hVar2 = C22187h.this;
            hVar2.mo35305f(hVar2.f62759K, 0);
        }
    }

    /* renamed from: qz1.h$d */
    public class C22191d implements Runnable {
        public C22191d() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0102, code lost:
            r0 = r1.f62789d;
            r2 = r0.f62750B;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0109, code lost:
            if (r2 == 0) goto L_0x01ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
            r8 = r0.f62749A;
            r2 = (r2 - r8) - r0.f62753E;
            r0.f62751C = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
            if (r2 >= 0) goto L_0x01ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.GIF.MMWXGFDrawable", "%s Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", r1, java.lang.Long.valueOf(r8), java.lang.Long.valueOf(r1.f62789d.f62753E), java.lang.Long.valueOf(r1.f62789d.f62751C), java.lang.Long.valueOf(r1.f62789d.f62750B), java.lang.Integer.valueOf(r1.f62789d.f62784y));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x015d, code lost:
            if (r1.f62789d.f62751C >= -100) goto L_0x01ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x015f, code lost:
            r0 = kj2.C117407d.INSTANCE;
            r0.idkeyStat(401, 16, 1, false);
            r0.idkeyStat(401, 17, java.lang.Math.abs(r1.f62789d.f62751C), false);
            r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0187, code lost:
            if (com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifEnable() != false) goto L_0x0195;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0191, code lost:
            if (com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameEnable() == false) goto L_0x0194;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0194, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0195, code lost:
            r0.stopPerformance(r4, r1.f62789d.f62757I);
            r0 = r1.f62789d;
            r8 = com.tencent.p014mm.hardcoder.C40318k.m43492a();
            r9 = com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameEnable();
            r10 = com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameDelay();
            r11 = com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameCPU();
            r12 = com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameIO();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ca, code lost:
            if (com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameThr() == false) goto L_0x01d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01cc, code lost:
            r13 = android.os.Process.myTid();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d2, code lost:
            r13 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d3, code lost:
            r0.f62757I = r8.startPerformance(r9, r10, r11, r12, r13, com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameTimeout(), 602, com.tencent.p014mm.hardcoder.C40318k.m43492a().getHcGifFrameAction(), "MicroMsg.GIF.MMWXGFDrawable");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ed, code lost:
            r0 = r1.f62789d;
            r2 = r0.f62759K;
            r3 = r0.f62751C;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f5, code lost:
            if (r3 <= 0) goto L_0x01f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f7, code lost:
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f8, code lost:
            r0.mo35305f(r2, r5);
            r0 = r1.f62789d;
            r2 = r0.f62771i[0];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0201, code lost:
            if (r2 <= 0) goto L_0x0204;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0204, code lost:
            r2 = 100;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0206, code lost:
            r0.f62750B = (long) r2;
            r0.f62755G = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x020b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r20 = this;
                r1 = r20
                java.lang.Class<com.tencent.mm.feature.emoji.api.IWXGFJNIService> r0 = com.tencent.p014mm.feature.emoji.api.IWXGFJNIService.class
                qz1.h r2 = qz1.C22187h.this
                java.lang.Object r2 = r2.f62769g
                monitor-enter(r2)
                qz1.h r3 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                boolean r4 = r3.f62755G     // Catch:{ all -> 0x020c }
                if (r4 == 0) goto L_0x0018
                java.lang.String r0 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r3 = "Cpan Render Task is Running."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)     // Catch:{ all -> 0x020c }
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                return
            L_0x0018:
                boolean r4 = r3.f62767e     // Catch:{ all -> 0x020c }
                if (r4 == 0) goto L_0x0025
                java.lang.String r0 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r3 = "Cpan This WXGF had been recycle."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x020c }
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                return
            L_0x0025:
                long r3 = r3.f62768f     // Catch:{ all -> 0x020c }
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L_0x0042
                java.lang.String r0 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r3 = "Cpan This WXGF JNIHandle is null."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x020c }
                kj2.d r4 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x020c }
                r5 = 401(0x191, double:1.98E-321)
                r7 = 18
                r9 = 1
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ all -> 0x020c }
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                return
            L_0x0042:
                qz1.h r3 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                r4 = 1
                r3.f62755G = r4     // Catch:{ all -> 0x020c }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020c }
                qz1.h r3 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                int r9 = r3.f62779t     // Catch:{ all -> 0x020c }
                int r9 = r9 + r4
                android.graphics.Bitmap[] r10 = r3.f62777r     // Catch:{ all -> 0x020c }
                int r11 = r10.length     // Catch:{ all -> 0x020c }
                int r9 = r9 % r11
                r10 = r10[r9]     // Catch:{ all -> 0x020c }
                if (r10 != 0) goto L_0x0068
                int r10 = r3.f62781v     // Catch:{ all -> 0x020c }
                int r3 = r3.f62782w     // Catch:{ all -> 0x020c }
                android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x020c }
                android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r10, r3, r11)     // Catch:{ all -> 0x020c }
                qz1.h r3 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                android.graphics.Bitmap[] r3 = r3.f62777r     // Catch:{ all -> 0x020c }
                r3[r9] = r10     // Catch:{ all -> 0x020c }
            L_0x0068:
                r16 = r10
                di3.d r3 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x020c }
                r11 = r3
                com.tencent.mm.feature.emoji.api.IWXGFJNIService r11 = (com.tencent.p014mm.feature.emoji.api.IWXGFJNIService) r11     // Catch:{ all -> 0x020c }
                qz1.h r3 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                long r12 = r3.f62768f     // Catch:{ all -> 0x020c }
                r14 = 0
                r15 = 0
                qz1.h r3 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                int[] r3 = r3.f62771i     // Catch:{ all -> 0x020c }
                r17 = r3
                int r3 = r11.nativeDecodeBufferFrame(r12, r14, r15, r16, r17)     // Catch:{ all -> 0x020c }
                r9 = -904(0xfffffffffffffc78, float:NaN)
                if (r3 != r9) goto L_0x009a
                java.lang.String r0 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r3 = "nativeDecodeBufferFrame failed. func is null."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x020c }
                kj2.d r4 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x020c }
                r5 = 401(0x191, double:1.98E-321)
                r7 = 8
                r9 = 1
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ all -> 0x020c }
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                return
            L_0x009a:
                r9 = -909(0xfffffffffffffc73, float:NaN)
                r10 = -1
                if (r3 != r9) goto L_0x00b4
                java.lang.String r9 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r11 = "nativeDecodeBufferFrame failed. frame is null."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)     // Catch:{ all -> 0x020c }
                kj2.d r12 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x020c }
                r13 = 401(0x191, double:1.98E-321)
                r15 = 11
                r17 = 1
                r19 = 0
                r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ all -> 0x020c }
                goto L_0x00bf
            L_0x00b4:
                if (r3 != r10) goto L_0x00bf
                java.lang.String r0 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r3 = "nativeDecodeBufferFrame failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x020c }
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                return
            L_0x00bf:
                qz1.h r9 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                int r11 = r9.f62784y     // Catch:{ all -> 0x020c }
                int r11 = r11 + r4
                r9.f62784y = r11     // Catch:{ all -> 0x020c }
                int r12 = r9.f62780u     // Catch:{ all -> 0x020c }
                int r12 = r12 - r4
                if (r11 >= r12) goto L_0x00cd
                if (r3 != r4) goto L_0x00f8
            L_0x00cd:
                r9.f62784y = r10     // Catch:{ all -> 0x020c }
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x020c }
                com.tencent.mm.feature.emoji.api.IWXGFJNIService r0 = (com.tencent.p014mm.feature.emoji.api.IWXGFJNIService) r0     // Catch:{ all -> 0x020c }
                qz1.h r3 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                long r9 = r3.f62768f     // Catch:{ all -> 0x020c }
                int r0 = r0.nativeRewindBuffer(r9)     // Catch:{ all -> 0x020c }
                if (r0 == 0) goto L_0x00f8
                r3 = -905(0xfffffffffffffc77, float:NaN)
                if (r0 != r3) goto L_0x00ef
                kj2.d r4 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x020c }
                r5 = 711(0x2c7, double:3.513E-321)
                r7 = 9
                r9 = 1
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ all -> 0x020c }
            L_0x00ef:
                java.lang.String r0 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r3 = "Cpan Rewind buffer failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)     // Catch:{ all -> 0x020c }
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                return
            L_0x00f8:
                qz1.h r0 = qz1.C22187h.this     // Catch:{ all -> 0x020c }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x020c }
                long r9 = r9 - r7
                r0.f62749A = r9     // Catch:{ all -> 0x020c }
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                qz1.h r0 = qz1.C22187h.this
                long r2 = r0.f62750B
                r7 = 0
                int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r8 == 0) goto L_0x01ed
                long r8 = r0.f62749A
                long r2 = r2 - r8
                long r10 = r0.f62753E
                long r2 = r2 - r10
                r0.f62751C = r2
                int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x01ed
                java.lang.String r0 = "MicroMsg.GIF.MMWXGFDrawable"
                java.lang.String r2 = "%s Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d"
                r3 = 6
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r7] = r1
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r3[r4] = r8
                r8 = 2
                qz1.h r9 = qz1.C22187h.this
                long r9 = r9.f62753E
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r3[r8] = r9
                r8 = 3
                qz1.h r9 = qz1.C22187h.this
                long r9 = r9.f62751C
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r3[r8] = r9
                r8 = 4
                qz1.h r9 = qz1.C22187h.this
                long r9 = r9.f62750B
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r3[r8] = r9
                r8 = 5
                qz1.h r9 = qz1.C22187h.this
                int r9 = r9.f62784y
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r3[r8] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r3)
                qz1.h r0 = qz1.C22187h.this
                long r2 = r0.f62751C
                r8 = -100
                int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x01ed
                kj2.d r0 = kj2.C117407d.INSTANCE
                r9 = 401(0x191, double:1.98E-321)
                r11 = 16
                r13 = 1
                r15 = 0
                r8 = r0
                r8.idkeyStat(r9, r11, r13, r15)
                r11 = 17
                qz1.h r2 = qz1.C22187h.this
                long r2 = r2.f62751C
                long r13 = java.lang.Math.abs(r2)
                r15 = 0
                r8 = r0
                r8.idkeyStat(r9, r11, r13, r15)
                com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r2 = r2.getHcGifEnable()
                if (r2 != 0) goto L_0x0195
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r2 = r2.getHcGifFrameEnable()
                if (r2 == 0) goto L_0x0194
                goto L_0x0195
            L_0x0194:
                r4 = 0
            L_0x0195:
                qz1.h r2 = qz1.C22187h.this
                int r2 = r2.f62757I
                r0.stopPerformance(r4, r2)
                qz1.h r0 = qz1.C22187h.this
                com.tencent.mm.hardcoder.WXHardCoderJNI r8 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r9 = r2.getHcGifFrameEnable()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r10 = r2.getHcGifFrameDelay()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r11 = r2.getHcGifFrameCPU()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r12 = r2.getHcGifFrameIO()
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                boolean r2 = r2.getHcGifFrameThr()
                if (r2 == 0) goto L_0x01d2
                int r2 = android.os.Process.myTid()
                r13 = r2
                goto L_0x01d3
            L_0x01d2:
                r13 = 0
            L_0x01d3:
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                int r14 = r2.getHcGifFrameTimeout()
                r15 = 602(0x25a, float:8.44E-43)
                com.tencent.mm.hardcoder.WXHardCoderJNI r2 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
                long r16 = r2.getHcGifFrameAction()
                java.lang.String r18 = "MicroMsg.GIF.MMWXGFDrawable"
                int r2 = r8.startPerformance(r9, r10, r11, r12, r13, r14, r15, r16, r18)
                r0.f62757I = r2
            L_0x01ed:
                qz1.h r0 = qz1.C22187h.this
                java.lang.Runnable r2 = r0.f62759K
                long r3 = r0.f62751C
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 <= 0) goto L_0x01f8
                r5 = r3
            L_0x01f8:
                r0.mo35305f(r2, r5)
                qz1.h r0 = qz1.C22187h.this
                int[] r2 = r0.f62771i
                r2 = r2[r7]
                if (r2 <= 0) goto L_0x0204
                goto L_0x0206
            L_0x0204:
                r2 = 100
            L_0x0206:
                long r2 = (long) r2
                r0.f62750B = r2
                r0.f62755G = r7
                return
            L_0x020c:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x020c }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qz1.C22187h.C22191d.run():void");
        }
    }

    public C22187h(byte[] bArr) {
        byte[] bArr2 = bArr;
        Class cls = IWXGFJNIService.class;
        if (bArr2 != null) {
            this.f62757I = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMWXGFDrawable");
            this.f62768f = ((IWXGFJNIService) C86312j.m106911c(cls)).nativeInitWxAMDecoder();
            if (this.f62768f == 0 || this.f62768f == -901) {
                Log.m105929w("MicroMsg.GIF.MMWXGFDrawable", "Cpan init wxam decoder failed. mWXGFJNIHandle:%d", Long.valueOf(this.f62768f));
                if (this.f62768f == -901) {
                    C117407d.INSTANCE.idkeyStat(711, 5, 1, false);
                }
                C117407d.INSTANCE.idkeyStat(711, 4, 1, false);
                throw new MMGIFException(201);
            }
            int nativeDecodeBufferHeader = ((IWXGFJNIService) C86312j.m106911c(cls)).nativeDecodeBufferHeader(this.f62768f, bArr2, bArr2.length);
            if (nativeDecodeBufferHeader != 0) {
                Log.m105929w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF decode buffer header failed. result:%d", Integer.valueOf(nativeDecodeBufferHeader));
                if (nativeDecodeBufferHeader == -904) {
                    C117407d.INSTANCE.idkeyStat(711, 8, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(711, 3, 1, false);
                }
                throw new MMGIFException(nativeDecodeBufferHeader);
            }
            int nativeGetOption = ((IWXGFJNIService) C86312j.m106911c(cls)).nativeGetOption(this.f62768f, bArr, bArr2.length, this.f62770h);
            if (nativeGetOption != 0) {
                Log.m105929w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d", Integer.valueOf(nativeGetOption));
                if (nativeGetOption == -903) {
                    C117407d.INSTANCE.idkeyStat(711, 7, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(711, 3, 1, false);
                }
                throw new MMGIFException(nativeGetOption);
            }
            int[] iArr = this.f62770h;
            this.f62780u = iArr[0];
            int i = iArr[1];
            this.f62781v = i;
            int i2 = iArr[2];
            this.f62782w = i2;
            int i3 = iArr[3];
            this.f62783x = i3;
            if (i3 <= 0) {
                this.f62783x = 1;
            }
            if (i == 0 || i2 == 0) {
                int h = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.a4z);
                this.f62782w = h;
                this.f62781v = h;
                return;
            }
            return;
        }
        throw new NullPointerException("bytes is null.");
    }

    /* renamed from: a */
    public void mo35279a() {
        this.f62766d = false;
    }

    /* renamed from: b */
    public synchronized void mo35280b() {
        Log.m105927v("MicroMsg.GIF.MMWXGFDrawable", "Cpan recycle decode handle:%d", Long.valueOf(this.f62768f));
        synchronized (this.f62769g) {
            this.f62767e = true;
            this.f62766d = false;
            long j = this.f62768f;
            this.f62768f = 0;
            this.f62756H.removeCallbacks(this.f62759K);
            int nativeUninit = ((IWXGFJNIService) C86312j.m106911c(IWXGFJNIService.class)).nativeUninit(j);
            if (nativeUninit == -906) {
                C117407d.INSTANCE.idkeyStat(401, 10, 1, false);
            }
            Log.m105919d("MicroMsg.GIF.MMWXGFDrawable", "nativeUninit result:%d mWXGFJNIHandle:%s mIsRender:%b", Integer.valueOf(nativeUninit), Long.valueOf(j), Boolean.valueOf(this.f62755G));
            this.f62777r = null;
            this.f62762N = null;
        }
    }

    /* renamed from: c */
    public void mo35281c() {
        this.f62766d = true;
        ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(this.f62761M, 0);
    }

    /* renamed from: d */
    public void mo35282d() {
        if (!this.f62767e) {
            this.f62766d = true;
            mo35305f(this.f62759K, 0);
        }
    }

    public void draw(Canvas canvas) {
        if (this.f62775p) {
            this.f62774o.set(getBounds());
            this.f62772j = ((float) this.f62774o.width()) / ((float) this.f62781v);
            this.f62773n = ((float) this.f62774o.height()) / ((float) this.f62782w);
            this.f62775p = false;
        }
        if (this.f62776q.getShader() == null) {
            if (this.f62752D == 0) {
                this.f62752D = System.currentTimeMillis();
            }
            boolean z = true;
            if (this.f62758J) {
                this.f62779t = (this.f62779t + 1) % this.f62777r.length;
            }
            Bitmap[] bitmapArr = this.f62777r;
            int i = this.f62779t;
            Bitmap bitmap = bitmapArr[i];
            if (bitmap == null) {
                bitmap = bitmapArr[(i + 1) % bitmapArr.length];
                Log.m105925i("MicroMsg.GIF.MMWXGFDrawable", "use last decode bitmap %s  hash:[%s]", bitmap, Integer.valueOf(hashCode()));
            }
            if (bitmap != null && !bitmap.isRecycled() && !this.f62767e) {
                canvas.scale(this.f62772j, this.f62773n);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f62776q);
            } else if (this.f62778s != null) {
                canvas.scale(((float) this.f62774o.width()) / ((float) this.f62778s.getWidth()), ((float) this.f62774o.height()) / ((float) this.f62778s.getHeight()));
                canvas.drawBitmap(this.f62778s, 0.0f, 0.0f, this.f62776q);
            } else {
                Log.m105921e("MicroMsg.GIF.MMWXGFDrawable", "Cpan draw bitmap failed. Bitmap buffer is null or recycle %s", Integer.valueOf(hashCode()));
            }
            this.f62753E = System.currentTimeMillis() - this.f62752D;
            if (this.f62758J) {
                int i2 = this.f62763P;
                if (i2 > 0 && this.f62784y == -1) {
                    int i3 = this.f62764Q + 1;
                    this.f62764Q = i3;
                    if (i3 >= i2) {
                        this.f62766d = false;
                        mo35305f(this.f62762N, this.f62750B);
                        z = false;
                    }
                }
                if (z) {
                    ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(this.f62765R, 0);
                }
                this.f62758J = false;
                return;
            }
            return;
        }
        canvas.drawRect(this.f62774o, this.f62776q);
    }

    /* renamed from: e */
    public float mo35304e() {
        if (this.f62785z == 0.0f) {
            float g = C76577a.m92156g(MMApplicationContext.getContext()) / 2.0f;
            this.f62785z = g;
            if (g < 1.0f) {
                this.f62785z = 1.0f;
            } else if (g > 2.0f) {
                this.f62785z = 2.0f;
            }
        }
        return this.f62785z;
    }

    /* renamed from: f */
    public final void mo35305f(Runnable runnable, long j) {
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        this.f62754F = uptimeMillis;
        MMHandler mMHandler = this.f62756H;
        if (mMHandler != null) {
            mMHandler.postAtTime(runnable, uptimeMillis);
        }
    }

    public void finalize() {
        try {
            mo35280b();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.GIF.MMWXGFDrawable", th, "", new Object[0]);
            super.finalize();
        }
    }

    public int getIntrinsicHeight() {
        return (int) (((float) this.f62782w) * mo35304e());
    }

    public int getIntrinsicWidth() {
        return (int) (((float) this.f62781v) * mo35304e());
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f62766d;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f62775p = true;
    }

    public void setAlpha(int i) {
        this.f62776q.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f62776q.setColorFilter(colorFilter);
    }

    public void start() {
        this.f62766d = true;
        ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(this.f62760L, 0);
    }

    public void stop() {
        this.f62766d = false;
        int i = this.f62757I;
        if (i != 0) {
            boolean z = true;
            Log.m105925i("MicroMsg.GIF.MMWXGFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", Integer.valueOf(i));
            WXHardCoderJNI a = C40318k.m43492a();
            if (!C40318k.m43492a().getHcGifEnable() && !C40318k.m43492a().getHcGifFrameEnable()) {
                z = false;
            }
            a.stopPerformance(z, this.f62757I);
            this.f62757I = 0;
        }
    }
}
