package qz1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.feature.emoji.api.IGIFJNIService;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.hardcoder.WXHardCoderJNI;
import com.tencent.p014mm.p136ui.tools.C97244o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.io.InputStream;
import kg3.C76577a;
import kj2.C117407d;
import p008bq.C92281h1;
import p823sg.C48380r;

/* renamed from: qz1.d */
public class C22180d extends C101325b {

    /* renamed from: A */
    public long f62707A;

    /* renamed from: B */
    public int f62708B;

    /* renamed from: C */
    public boolean f62709C;

    /* renamed from: D */
    public int f62710D;

    /* renamed from: E */
    public int f62711E;

    /* renamed from: F */
    public C101335k f62712F;

    /* renamed from: G */
    public int f62713G;

    /* renamed from: H */
    public MMHandler f62714H;

    /* renamed from: I */
    public boolean f62715I;

    /* renamed from: J */
    public boolean f62716J;

    /* renamed from: K */
    public final Runnable f62717K;

    /* renamed from: L */
    public final Runnable f62718L;

    /* renamed from: M */
    public final Runnable f62719M;

    /* renamed from: N */
    public final Runnable f62720N;

    /* renamed from: P */
    public final Runnable f62721P;

    /* renamed from: Q */
    public final Runnable f62722Q;

    /* renamed from: d */
    public boolean f62723d = true;

    /* renamed from: e */
    public boolean f62724e = false;

    /* renamed from: f */
    public volatile long f62725f;

    /* renamed from: g */
    public final int[] f62726g;

    /* renamed from: h */
    public float f62727h;

    /* renamed from: i */
    public float f62728i;

    /* renamed from: j */
    public boolean f62729j;

    /* renamed from: n */
    public final Rect f62730n;

    /* renamed from: o */
    public final Paint f62731o;

    /* renamed from: p */
    public int[] f62732p;

    /* renamed from: q */
    public Bitmap f62733q;

    /* renamed from: r */
    public boolean f62734r;

    /* renamed from: s */
    public int f62735s;

    /* renamed from: t */
    public int f62736t;

    /* renamed from: u */
    public float f62737u;

    /* renamed from: v */
    public long f62738v;

    /* renamed from: w */
    public long f62739w;

    /* renamed from: x */
    public long f62740x;

    /* renamed from: y */
    public long f62741y;

    /* renamed from: z */
    public long f62742z;

    /* renamed from: qz1.d$a */
    public class C22181a implements Runnable {
        public C22181a() {
        }

        public void run() {
            C101335k kVar = C22180d.this.f62712F;
            if (kVar != null) {
                kVar.getClass();
            }
        }
    }

    /* renamed from: qz1.d$b */
    public class C22182b implements Runnable {
        public C22182b() {
        }

        public void run() {
            C22180d dVar = C22180d.this;
            if (dVar.f62723d || dVar.f62736t == 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C22180d dVar2 = C22180d.this;
                if (uptimeMillis >= dVar2.f62707A) {
                    dVar2.f62741y = System.currentTimeMillis();
                    C22180d dVar3 = C22180d.this;
                    dVar3.f62715I = true;
                    dVar3.invalidateSelf();
                    C101335k kVar = C22180d.this.f62712F;
                    if (kVar != null) {
                        ((C97244o1) kVar).f285341a.invalidate();
                    }
                }
            }
        }
    }

    /* renamed from: qz1.d$c */
    public class C22183c implements Runnable {
        public C22183c() {
        }

        public void run() {
            if (C22180d.this.f62725f != 0) {
                ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).restoreRemainder(C22180d.this.f62725f);
                C22180d dVar = C22180d.this;
                dVar.mo35287g(dVar.f62718L, dVar.f62740x);
            }
        }
    }

    /* renamed from: qz1.d$d */
    public class C22184d implements Runnable {
        public C22184d() {
        }

        public void run() {
            if (C22180d.this.f62725f != 0) {
                ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).reset(C22180d.this.f62725f);
                C22180d dVar = C22180d.this;
                dVar.f62736t = -1;
                dVar.mo35287g(dVar.f62718L, 0);
            }
        }
    }

    /* renamed from: qz1.d$e */
    public class C22185e implements Runnable {
        public C22185e() {
        }

        public void run() {
            if (C22180d.this.f62725f != 0) {
                ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).saveRemainder(C22180d.this.f62725f);
            }
        }
    }

    /* renamed from: qz1.d$f */
    public class C22186f implements Runnable {
        public C22186f() {
        }

        public void run() {
            long j = 0;
            if (C22180d.this.f62725f != 0) {
                if (C22180d.this.f62724e) {
                    Log.m105924i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                C22180d dVar = C22180d.this;
                if (dVar.f62736t + 1 > dVar.f62735s - 1) {
                    dVar.f62736t = -1;
                }
                dVar.f62736t++;
                long j2 = C22180d.this.f62725f;
                C22180d dVar2 = C22180d.this;
                boolean drawFramePixels = ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).drawFramePixels(j2, dVar2.f62732p, dVar2.f62726g);
                C22180d dVar3 = C22180d.this;
                dVar3.f62734r = true;
                if (drawFramePixels) {
                    dVar3.f62711E++;
                }
                dVar3.f62738v = System.currentTimeMillis() - currentTimeMillis;
                C22180d dVar4 = C22180d.this;
                long j3 = dVar4.f62739w;
                if (j3 != 0) {
                    long j4 = dVar4.f62738v;
                    long j5 = (j3 - j4) - dVar4.f62742z;
                    dVar4.f62740x = j5;
                    if (j5 < 0) {
                        Log.m105919d("MicroMsg.GIF.MMGIFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", Long.valueOf(j4), Long.valueOf(C22180d.this.f62742z), Long.valueOf(C22180d.this.f62740x), Long.valueOf(C22180d.this.f62739w), Integer.valueOf(C22180d.this.f62726g[5]));
                        C117407d dVar5 = C117407d.INSTANCE;
                        dVar5.idkeyStat(401, 0, 1, false);
                        dVar5.idkeyStat(401, 1, Math.abs(C22180d.this.f62740x), false);
                        if (C22180d.this.f62740x < -100) {
                            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcGifEnable() || C40318k.m43492a().getHcGifFrameEnable(), C22180d.this.f62713G);
                            C22180d.this.f62713G = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifFrameEnable(), C40318k.m43492a().getHcGifFrameDelay(), C40318k.m43492a().getHcGifFrameCPU(), C40318k.m43492a().getHcGifFrameIO(), C40318k.m43492a().getHcGifFrameThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifFrameTimeout(), 602, C40318k.m43492a().getHcGifFrameAction(), "MicroMsg.GIF.MMGIFDrawable");
                        }
                    }
                }
                C22180d dVar6 = C22180d.this;
                Runnable runnable = dVar6.f62718L;
                long j6 = dVar6.f62740x;
                if (j6 > 0) {
                    j = j6;
                }
                dVar6.mo35287g(runnable, j);
                C22180d dVar7 = C22180d.this;
                int[] iArr = dVar7.f62726g;
                if (iArr[2] == 1) {
                    dVar7.f62739w = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                } else {
                    dVar7.f62739w = (long) iArr[4];
                }
            }
        }
    }

    public C22180d(Resources resources, int i, boolean z) {
        int[] iArr = new int[6];
        this.f62726g = iArr;
        this.f62727h = 1.0f;
        this.f62728i = 1.0f;
        this.f62730n = new Rect();
        this.f62731o = new Paint(6);
        this.f62734r = false;
        this.f62735s = 0;
        this.f62736t = -1;
        this.f62738v = 0;
        this.f62739w = 0;
        this.f62740x = 0;
        this.f62741y = 0;
        this.f62707A = 0;
        this.f62709C = false;
        this.f62710D = 0;
        this.f62711E = 0;
        this.f62714H = new MMHandler(Looper.getMainLooper());
        this.f62715I = true;
        this.f62717K = new C22181a();
        this.f62718L = new C22182b();
        this.f62719M = new C22183c();
        this.f62720N = new C22184d();
        this.f62721P = new C22185e();
        this.f62722Q = new C22186f();
        this.f62716J = z;
        InputStream openRawResource = resources.openRawResource(i);
        if (openRawResource != null) {
            this.f62713G = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f62725f = ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).openByInputStrem(openRawResource, iArr);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th, "[-] Fail to open gif.", new Object[0]);
                this.f62725f = 0;
            }
            mo35285f();
            return;
        }
        throw new NullPointerException("input stream is null.");
    }

    /* renamed from: a */
    public void mo35279a() {
        this.f62723d = false;
    }

    /* renamed from: b */
    public void mo35280b() {
        Log.m105918d("MicroMsg.GIF.MMGIFDrawable", "recycle");
        this.f62724e = true;
        this.f62723d = false;
        long j = this.f62725f;
        this.f62725f = 0;
        ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).recycle(j);
        this.f62732p = null;
    }

    /* renamed from: c */
    public void mo35281c() {
        this.f62724e = false;
        this.f62723d = true;
        ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(this.f62720N, 0);
    }

    /* renamed from: d */
    public void mo35282d() {
        if (!this.f62724e) {
            this.f62723d = true;
            mo35287g(this.f62718L, 0);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        if (this.f62725f != 0) {
            if (this.f62729j) {
                this.f62730n.set(getBounds());
                this.f62727h = ((float) this.f62730n.width()) / ((float) this.f62726g[0]);
                this.f62728i = ((float) this.f62730n.height()) / ((float) this.f62726g[1]);
                this.f62729j = false;
            }
            if (this.f62731o.getShader() == null) {
                if (this.f62741y == 0) {
                    this.f62741y = System.currentTimeMillis();
                }
                int[] iArr = this.f62732p;
                if (iArr == null) {
                    i = 3;
                    Log.m105920e("MicroMsg.GIF.MMGIFDrawable", "colors is null.");
                } else if (this.f62734r || this.f62733q == null) {
                    int length = iArr.length;
                    int[] iArr2 = this.f62726g;
                    if (length == iArr2[0] * iArr2[1]) {
                        canvas2.scale(this.f62727h, this.f62728i);
                        int[] iArr3 = this.f62726g;
                        int i2 = iArr3[0];
                        i = 3;
                        canvas.drawBitmap(iArr, 0, i2, 0.0f, 0.0f, i2, iArr3[1], true, this.f62731o);
                    } else {
                        i = 3;
                        canvas2.scale(this.f62727h, this.f62728i);
                        canvas2.drawRGB(230, 230, 230);
                        Log.m105929w("MicroMsg.GIF.MMGIFDrawable", "colors is not equal width*height. length:%d width:%d height:%d", Integer.valueOf(iArr.length), Integer.valueOf(this.f62726g[0]), Integer.valueOf(this.f62726g[1]));
                    }
                } else {
                    canvas2.scale(((float) this.f62730n.width()) / ((float) this.f62733q.getWidth()), ((float) this.f62730n.width()) / ((float) this.f62733q.getHeight()));
                    canvas2.drawBitmap(this.f62733q, 0.0f, 0.0f, this.f62731o);
                    i = 3;
                }
                this.f62742z = System.currentTimeMillis() - this.f62741y;
                if (!this.f62709C) {
                    int[] iArr4 = this.f62726g;
                    if (iArr4[2] >= 1) {
                        if (iArr4[4] < 0) {
                            Log.m105924i("MicroMsg.GIF.MMGIFDrawable", "current index error. start first frame");
                        }
                        int i3 = this.f62710D;
                        if (i3 != 0 && this.f62711E > i3 - 1) {
                            mo35287g(this.f62717K, 0);
                            return;
                        } else if (this.f62715I) {
                            ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(this.f62722Q, 0);
                            this.f62715I = false;
                            return;
                        } else {
                            return;
                        }
                    }
                }
                Object[] objArr = new Object[i];
                objArr[0] = Integer.valueOf(this.f62726g[2]);
                objArr[1] = Integer.valueOf(this.f62726g[4]);
                objArr[2] = Boolean.valueOf(this.f62709C);
                Log.m105921e("MicroMsg.GIF.MMGIFDrawable", "framecount:%d errorcode:%d no post and oversize:%b", objArr);
                return;
            }
            Log.m105924i("MicroMsg.GIF.MMGIFDrawable", "colors drawRect ");
            canvas2.drawRect(this.f62730n, this.f62731o);
        }
    }

    /* renamed from: e */
    public float mo35284e() {
        if (this.f62737u == 0.0f) {
            float g = C76577a.m92156g(MMApplicationContext.getContext()) / 2.0f;
            this.f62737u = g;
            if (g < 1.0f) {
                this.f62737u = 1.0f;
            } else if (g > 2.0f) {
                this.f62737u = 2.0f;
            }
        }
        return this.f62737u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        r1 = r10.f62726g;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35285f() {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            long r2 = r10.f62725f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.GIF.MMGIFDrawable"
            java.lang.String r4 = "gif info pointer:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            long r4 = r10.f62725f
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x001c
            return
        L_0x001c:
            int[] r1 = r10.f62726g
            r4 = 2
            r1 = r1[r4]
            r10.f62735s = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131166389(0x7f0704b5, float:1.7947022E38)
            int r1 = kg3.C76577a.m92157h(r1, r5)
            r10.f62708B = r1
            boolean r1 = r10.f62716J
            if (r1 != 0) goto L_0x006e
            int[] r1 = r10.f62726g
            r5 = r1[r3]
            r6 = 1024(0x400, float:1.435E-42)
            if (r5 > r6) goto L_0x0040
            r1 = r1[r0]
            if (r1 <= r6) goto L_0x006e
        L_0x0040:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1[r3] = r4
            int[] r3 = r10.f62726g
            r3 = r3[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r0] = r3
            java.lang.String r3 = "emoji width or height over size. Width:%d Height:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r3, r1)
            int r1 = r10.f62708B
            int r1 = r1 * r1
            int[] r1 = new int[r1]
            r10.f62732p = r1
            r10.f62709C = r0
            kj2.d r2 = kj2.C117407d.INSTANCE
            r3 = 401(0x191, double:1.98E-321)
            r5 = 2
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            goto L_0x007a
        L_0x006e:
            int[] r1 = r10.f62726g
            r2 = r1[r3]
            r0 = r1[r0]
            int r2 = r2 * r0
            int[] r0 = new int[r2]
            r10.f62732p = r0
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qz1.C22180d.mo35285f():void");
    }

    public void finalize() {
        try {
            mo35280b();
        } catch (Throwable unused) {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo35287g(Runnable runnable, long j) {
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        this.f62707A = uptimeMillis;
        MMHandler mMHandler = this.f62714H;
        if (mMHandler != null) {
            mMHandler.postAtTime(runnable, uptimeMillis);
        }
    }

    public int getIntrinsicHeight() {
        return (int) (((float) this.f62726g[1]) * mo35284e());
    }

    public int getIntrinsicWidth() {
        return (int) (((float) this.f62726g[0]) * mo35284e());
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f62723d;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f62729j = true;
    }

    public void setAlpha(int i) {
        this.f62731o.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f62731o.setColorFilter(colorFilter);
    }

    public void start() {
        this.f62723d = true;
        ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(this.f62719M, 0);
    }

    public void stop() {
        Log.m105918d("MicroMsg.GIF.MMGIFDrawable", "stop");
        this.f62723d = false;
        int i = this.f62713G;
        if (i != 0) {
            boolean z = true;
            Log.m105925i("MicroMsg.GIF.MMGIFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", Integer.valueOf(i));
            WXHardCoderJNI a = C40318k.m43492a();
            if (!C40318k.m43492a().getHcGifEnable() && !C40318k.m43492a().getHcGifFrameEnable()) {
                z = false;
            }
            a.stopPerformance(z, this.f62713G);
            this.f62713G = 0;
        }
        ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(this.f62721P, 300);
    }

    public C22180d(String str, boolean z) {
        int[] iArr = new int[6];
        this.f62726g = iArr;
        this.f62727h = 1.0f;
        this.f62728i = 1.0f;
        this.f62730n = new Rect();
        this.f62731o = new Paint(6);
        this.f62734r = false;
        this.f62735s = 0;
        this.f62736t = -1;
        this.f62738v = 0;
        this.f62739w = 0;
        this.f62740x = 0;
        this.f62741y = 0;
        this.f62707A = 0;
        this.f62709C = false;
        this.f62710D = 0;
        this.f62711E = 0;
        this.f62714H = new MMHandler(Looper.getMainLooper());
        this.f62715I = true;
        this.f62717K = new C22181a();
        this.f62718L = new C22182b();
        this.f62719M = new C22183c();
        this.f62720N = new C22184d();
        this.f62721P = new C22185e();
        this.f62722Q = new C22186f();
        this.f62716J = z;
        if (!TextUtils.isEmpty(str)) {
            this.f62713G = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f62725f = ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).openByFilePath(str, iArr);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th, "[-] Fail to open gif.", new Object[0]);
                this.f62725f = 0;
            }
            mo35285f();
            return;
        }
        throw new NullPointerException("file path is null.");
    }

    public C22180d(String str) {
        int[] iArr = new int[6];
        this.f62726g = iArr;
        this.f62727h = 1.0f;
        this.f62728i = 1.0f;
        this.f62730n = new Rect();
        this.f62731o = new Paint(6);
        this.f62734r = false;
        this.f62735s = 0;
        this.f62736t = -1;
        this.f62738v = 0;
        this.f62739w = 0;
        this.f62740x = 0;
        this.f62741y = 0;
        this.f62707A = 0;
        this.f62709C = false;
        this.f62710D = 0;
        this.f62711E = 0;
        this.f62714H = new MMHandler(Looper.getMainLooper());
        this.f62715I = true;
        this.f62716J = false;
        this.f62717K = new C22181a();
        this.f62718L = new C22182b();
        this.f62719M = new C22183c();
        this.f62720N = new C22184d();
        this.f62721P = new C22185e();
        this.f62722Q = new C22186f();
        if (!TextUtils.isEmpty(str)) {
            this.f62713G = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f62725f = ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).openByFilePath(C48380r.m53726a(str, false), iArr);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th, "[-] Fail to open gif.", new Object[0]);
                this.f62725f = 0;
            }
            mo35285f();
            return;
        }
        throw new NullPointerException("file path is null.");
    }

    public C22180d(InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        int[] iArr = new int[6];
        this.f62726g = iArr;
        this.f62727h = 1.0f;
        this.f62728i = 1.0f;
        this.f62730n = new Rect();
        this.f62731o = new Paint(6);
        this.f62734r = false;
        this.f62735s = 0;
        this.f62736t = -1;
        this.f62738v = 0;
        this.f62739w = 0;
        this.f62740x = 0;
        this.f62741y = 0;
        this.f62707A = 0;
        this.f62709C = false;
        this.f62710D = 0;
        this.f62711E = 0;
        this.f62714H = new MMHandler(Looper.getMainLooper());
        this.f62715I = true;
        this.f62716J = false;
        this.f62717K = new C22181a();
        this.f62718L = new C22182b();
        this.f62719M = new C22183c();
        this.f62720N = new C22184d();
        this.f62721P = new C22185e();
        this.f62722Q = new C22186f();
        if (inputStream2 != null) {
            this.f62713G = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f62725f = ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).openByInputStrem(inputStream2, iArr);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th, "[-] Fail to open gif.", new Object[0]);
                this.f62725f = 0;
            }
            mo35285f();
            return;
        }
        throw new NullPointerException("input stream is null.");
    }

    public C22180d(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        int[] iArr = new int[6];
        this.f62726g = iArr;
        this.f62727h = 1.0f;
        this.f62728i = 1.0f;
        this.f62730n = new Rect();
        this.f62731o = new Paint(6);
        this.f62734r = false;
        this.f62735s = 0;
        this.f62736t = -1;
        this.f62738v = 0;
        this.f62739w = 0;
        this.f62740x = 0;
        this.f62741y = 0;
        this.f62707A = 0;
        this.f62709C = false;
        this.f62710D = 0;
        this.f62711E = 0;
        this.f62714H = new MMHandler(Looper.getMainLooper());
        this.f62715I = true;
        this.f62717K = new C22181a();
        this.f62718L = new C22182b();
        this.f62719M = new C22183c();
        this.f62720N = new C22184d();
        this.f62721P = new C22185e();
        this.f62722Q = new C22186f();
        this.f62716J = z;
        if (bArr2 != null) {
            this.f62713G = C40318k.m43492a().startPerformance(C40318k.m43492a().getHcGifEnable(), C40318k.m43492a().getHcGifDelay(), C40318k.m43492a().getHcGifCPU(), C40318k.m43492a().getHcGifIO(), C40318k.m43492a().getHcGifThr() ? Process.myTid() : 0, C40318k.m43492a().getHcGifTimeout(), 602, C40318k.m43492a().getHcGifAction(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f62725f = ((IGIFJNIService) C86312j.m106911c(IGIFJNIService.class)).openByByteArray(bArr2, iArr);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.GIF.MMGIFDrawable", th, "[-] Fail to open gif.", new Object[0]);
                this.f62725f = 0;
            }
            mo35285f();
            return;
        }
        throw new NullPointerException("bytes is null.");
    }
}
