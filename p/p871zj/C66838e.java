package p871zj;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.tencent.p014mm.danmaku.render.C55190a;
import com.tencent.p014mm.danmaku.render.C55193b;
import com.tencent.p014mm.danmaku.render.C55194c;
import com.tencent.p014mm.danmaku.render.C55195d;
import com.tencent.p014mm.danmaku.render.NativeDanmakuView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import p001ak.C54053a;
import p006bk.C54479b;
import p006bk.C54483e;
import p006bk.C54485h;
import p848dk.C58295a;
import p848dk.C58297b;
import p848dk.C58298c;
import p848dk.C58302f;
import p848dk.C58306h;
import p850ek.C58611b;
import p850ek.C58612c;
import p850ek.C58613d;
import p850ek.C58614e;
import p852fk.C59109a;
import p852fk.C59110b;
import p871zj.C66846j;

/* renamed from: zj.e */
public class C66838e implements C55190a.C55191a, View.OnTouchListener {

    /* renamed from: P */
    public static final DecimalFormat f191970P = new DecimalFormat("00.00");

    /* renamed from: Q */
    public static final DecimalFormat f191971Q = new DecimalFormat("00");

    /* renamed from: A */
    public String f191972A;

    /* renamed from: B */
    public long f191973B;

    /* renamed from: C */
    public long f191974C;

    /* renamed from: D */
    public C54479b f191975D;

    /* renamed from: E */
    public final Queue<C58306h> f191976E = new LinkedBlockingDeque();

    /* renamed from: F */
    public final List<C54053a> f191977F = new LinkedList();

    /* renamed from: G */
    public final C66834a f191978G;

    /* renamed from: H */
    public C66846j.C66848b f191979H;

    /* renamed from: I */
    public C55190a.C55192b f191980I;

    /* renamed from: J */
    public C66853n f191981J;

    /* renamed from: K */
    public Object f191982K = new Object();

    /* renamed from: L */
    public boolean f191983L = true;

    /* renamed from: M */
    public int f191984M = 0;

    /* renamed from: N */
    public C66840b f191985N;

    /* renamed from: d */
    public volatile boolean f191986d;

    /* renamed from: e */
    public volatile boolean f191987e;

    /* renamed from: f */
    public volatile boolean f191988f;

    /* renamed from: g */
    public final C55190a f191989g;

    /* renamed from: h */
    public final C66843h f191990h;

    /* renamed from: i */
    public final C66845i f191991i;

    /* renamed from: j */
    public final C66835b f191992j;

    /* renamed from: n */
    public final C66851m f191993n;

    /* renamed from: o */
    public final C58302f f191994o;

    /* renamed from: p */
    public final C58298c f191995p;

    /* renamed from: q */
    public long f191996q;

    /* renamed from: r */
    public long f191997r;

    /* renamed from: s */
    public boolean f191998s;

    /* renamed from: t */
    public volatile boolean f191999t = true;

    /* renamed from: u */
    public long f192000u;

    /* renamed from: v */
    public long f192001v;

    /* renamed from: w */
    public long f192002w;

    /* renamed from: x */
    public int f192003x;

    /* renamed from: y */
    public int f192004y;

    /* renamed from: z */
    public int f192005z;

    /* renamed from: zj.e$a */
    public class C66839a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54053a f192006d;

        /* renamed from: e */
        public final /* synthetic */ C58306h f192007e;

        public C66839a(C54053a aVar, C58306h hVar) {
            this.f192006d = aVar;
            this.f192007e = hVar;
        }

        public void run() {
            C66838e.this.mo90815b(this.f192006d, this.f192007e);
        }
    }

    /* renamed from: zj.e$b */
    public class C66840b implements Choreographer.FrameCallback {
        public C66840b(C66837d dVar) {
        }

        public void doFrame(long j) {
            if (C66838e.this.mo90823j()) {
                C66853n nVar = C66838e.this.f191981J;
                Handler handler = nVar.f192028a;
                if (handler != null) {
                    handler.removeMessages(4);
                    nVar.f192028a.sendEmptyMessage(4);
                }
            }
        }
    }

    public C66838e(View view, C54479b bVar) {
        this.f191975D = bVar;
        C55190a cVar = view instanceof SurfaceView ? new C55194c((SurfaceView) view) : view instanceof TextureView ? new C55195d((TextureView) view) : view instanceof NativeDanmakuView ? new C55193b((NativeDanmakuView) view) : null;
        this.f191989g = cVar;
        if (cVar != null) {
            cVar.mo76353a(this);
            cVar.setOnTouchListener(this);
            C58302f fVar = new C58302f();
            this.f191994o = fVar;
            C58298c cVar2 = new C58298c();
            this.f191995p = cVar2;
            C66835b bVar2 = new C66835b();
            this.f191992j = bVar2;
            this.f191993n = new C66851m(bVar);
            C66846j.C66847a aVar = new C66846j.C66847a();
            this.f191990h = new C66843h(fVar, aVar);
            this.f191978G = new C66856o(bVar, bVar2, aVar, fVar, cVar2);
            this.f191991i = new C66845i(bVar);
            C66853n nVar = new C66853n(this);
            this.f191981J = nVar;
            if (cVar instanceof NativeDanmakuView) {
                nVar.f192030c = 1;
            } else {
                nVar.f192030c = bVar.f152747h;
            }
            if (cVar instanceof NativeDanmakuView) {
                this.f191984M = 0;
            } else {
                this.f191984M = 1;
            }
            if (this.f191984M == 0) {
                this.f191985N = new C66840b((C66837d) null);
                return;
            }
            return;
        }
        throw new RuntimeException("root view not a IDanmakuView");
    }

    /* renamed from: a */
    public boolean mo90814a(Point point, int i) {
        point.y = (int) (((float) point.y) - this.f191989g.mo76355c());
        C58306h hVar = new C58306h(this.f191995p.f166934a, point, i);
        boolean z = true;
        boolean z2 = false;
        if (C58614e.f167821b >= 4) {
            C58614e.m68070g("DanmakuManager", "addClickPoint:", hVar);
        }
        ((LinkedBlockingDeque) this.f191976E).add(hVar);
        if (this.f191981J.f192030c == 1) {
            return mo90819f();
        }
        try {
            if (this.f191978G.mo90811e(hVar) == null) {
                z = false;
            }
            z2 = z;
        } catch (Exception e) {
            C58614e.m68066c("DanmakuManager", "addClickPoint:", e);
        }
        this.f191981J.mo90858a(10);
        return z2;
    }

    /* renamed from: b */
    public final boolean mo90815b(C54053a aVar, C58306h hVar) {
        if (aVar == null) {
            this.f191979H.mo84286c(false);
            return false;
        }
        hVar.f166951d = aVar.mo74712d() + ((float) C54479b.m61196c().f152758e);
        hVar.f166952e = aVar.mo74719i() + ((float) C54479b.m61196c().f152757d);
        C58297b n = aVar.mo74724n(hVar);
        if ((this.f191988f && !this.f191986d) && n.f166933a != -1) {
            this.f191979H.mo84286c(true);
            n.getClass();
            this.f191979H.mo84284a(aVar, hVar, n);
            return true;
        }
        this.f191979H.mo84286c(false);
        return false;
    }

    /* renamed from: c */
    public final void mo90816c(Canvas canvas) {
        StringBuilder sb;
        if (canvas != null) {
            try {
                TextPaint textPaint = C58613d.f167816a;
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f191978G.mo90808b(canvas, this.f191994o.f166940a);
                mo90818e(canvas);
            } catch (Throwable th) {
                th = th;
                sb = new StringBuilder();
            }
        }
        try {
            mo90830p(canvas);
            return;
        } catch (Throwable th4) {
            th = th4;
            sb = new StringBuilder();
        }
        sb.append("unlockCanvas exception ");
        sb.append(canvas.hashCode());
        C58614e.m68066c("surface_lock", sb.toString(), th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0041, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo90817d() {
        /*
            r4 = this;
            com.tencent.mm.danmaku.render.a r0 = r4.f191989g     // Catch:{ all -> 0x0007 }
            android.graphics.Canvas r0 = r0.lockCanvas()     // Catch:{ all -> 0x0007 }
            goto L_0x0022
        L_0x0007:
            r0 = move-exception
            java.lang.String r1 = "surface_lock"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "draw exception "
            r2.append(r3)
            java.lang.String r3 = "null"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p850ek.C58614e.m68066c(r1, r2, r0)
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            r4.mo90816c(r0)
            r0 = 1
            return r0
        L_0x0029:
            r4.mo90831q()
            com.tencent.mm.danmaku.render.a$b r0 = r4.f191980I
            if (r0 != 0) goto L_0x0037
            zj.d r0 = new zj.d
            r0.<init>(r4)
            r4.f191980I = r0
        L_0x0037:
            com.tencent.mm.danmaku.render.a r0 = r4.f191989g
            com.tencent.mm.danmaku.render.a$b r1 = r4.f191980I
            r0.mo76354b(r1)
            java.lang.Object r0 = r4.f191982K
            monitor-enter(r0)
        L_0x0041:
            boolean r1 = r4.f191983L     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x0062
            boolean r1 = r4.mo90823j()     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r4.f191982K     // Catch:{ InterruptedException -> 0x0053 }
            r2 = 200(0xc8, double:9.9E-322)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0053 }
            goto L_0x0041
        L_0x0053:
            boolean r1 = r4.mo90823j()     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0067 }
            r1.interrupt()     // Catch:{ all -> 0x0067 }
            goto L_0x0041
        L_0x0062:
            r1 = 0
            r4.f191983L = r1     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            return r1
        L_0x0067:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p871zj.C66838e.mo90817d():boolean");
    }

    /* renamed from: e */
    public final void mo90818e(Canvas canvas) {
        C54485h hVar;
        int i = C58614e.f167821b;
        if (i >= 4) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = uptimeMillis - this.f192000u;
            this.f192003x++;
            this.f192005z = (int) (((long) this.f192005z) + j);
            if (j > ((long) 17)) {
                this.f192004y++;
                if (i >= 5) {
                    String str = "a draw block:" + j;
                    if (i >= 2 && (hVar = C58614e.f167820a) != null) {
                        hVar.mo14331w("DanmakuManager", str);
                    }
                }
            }
            C54053a aVar = (C54053a) this.f191990h.f192013b.f166941a.f166946b.f166945a;
            if (this.f192003x % 60 == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(",t:");
                sb.append(C58612c.m68062b(SystemClock.uptimeMillis()));
                sb.append(",f:");
                long j2 = this.f191995p.f166935b;
                if (j2 == 0) {
                    j2 = 1;
                }
                sb.append(1000 / j2);
                sb.append(",ds:");
                sb.append(this.f191978G.f191958a);
                sb.append(",ts:");
                sb.append(this.f191990h.f192013b.f166944d);
                sb.append(",mt:");
                DecimalFormat decimalFormat = f191971Q;
                sb.append(decimalFormat.format(this.f192001v - this.f192000u));
                sb.append(",lt:");
                sb.append(decimalFormat.format(this.f192002w - this.f192001v));
                sb.append(",dt:");
                sb.append(decimalFormat.format(uptimeMillis - this.f192002w));
                sb.append(",tt:");
                sb.append(decimalFormat.format(j));
                sb.append(",jp:");
                DecimalFormat decimalFormat2 = f191970P;
                sb.append(decimalFormat2.format((double) ((((float) this.f192004y) * 100.0f) / ((float) this.f192003x))));
                sb.append("%,at:");
                sb.append(decimalFormat2.format((double) (((float) this.f192005z) / ((float) this.f192003x))));
                sb.append(",fd:");
                sb.append(aVar == null ? "null" : C58612c.m68062b(aVar.f151348e));
                sb.append(",cs:");
                sb.append(decimalFormat2.format((double) ((((float) this.f191992j.f191966a.f166925d) / 1024.0f) / 1024.0f)));
                sb.append(",uc:");
                C58295a aVar2 = this.f191992j.f191966a;
                sb.append(decimalFormat2.format((double) ((((float) aVar2.f166927f) * 100.0f) / ((float) aVar2.f166926e))));
                this.f191972A = sb.toString();
            }
            String str2 = this.f191972A;
            if (str2 != null) {
                if (C58613d.f167818c == null) {
                    Paint paint = new Paint();
                    C58613d.f167818c = paint;
                    paint.setColor(-256);
                    C58613d.f167818c.setTextSize(C59109a.m69050a().getResources().getDisplayMetrics().density * 12.5f);
                    Paint.FontMetrics fontMetrics = C58613d.f167818c.getFontMetrics();
                    C58613d.f167819d = (int) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent));
                }
                canvas.drawText(str2, 10.0f, (float) (canvas.getHeight() - C58613d.f167819d), C58613d.f167818c);
            }
        }
    }

    /* renamed from: f */
    public boolean mo90819f() {
        boolean z = false;
        if (this.f191979H != null) {
            boolean z2 = false;
            while (!this.f191976E.isEmpty()) {
                C58306h hVar = (C58306h) ((LinkedBlockingDeque) this.f191976E).poll();
                C54053a e = this.f191978G.mo90811e(hVar);
                if (C58614e.f167821b >= 4) {
                    C58614e.m68070g("DanmakuManager", "handleClick:", hVar, ",currentTime:", Long.valueOf(SystemClock.uptimeMillis()));
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    z2 = mo90815b(e, hVar);
                } else {
                    C59110b.f169073a.post(new C66839a(e, hVar));
                }
            }
            z = z2;
        }
        C58614e.m68069f("DanmakuManager", "message click");
        return z;
    }

    /* renamed from: g */
    public void mo90820g() {
        C58614e.m68067d("DanmakuManager", "handlePause()");
        mo90831q();
        this.f191987e = false;
        C54483e eVar = this.f191975D.f152742c;
        long j = ((eVar == null ? -1 : eVar.getPlayTime()) > 0 ? 1 : ((eVar == null ? -1 : eVar.getPlayTime()) == 0 ? 0 : -1)) < 0 ? this.f191994o.f166940a : this.f191995p.f166934a;
        this.f191997r = j;
        if (C58614e.f167821b >= 5) {
            C58614e.m68070g("DanmakuManager", "message pause:mPausedTime:", Long.valueOf(j));
        }
    }

    /* renamed from: h */
    public void mo90821h() {
        C58614e.m68067d("DanmakuManager", "handleResume()");
        if (!this.f191987e) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f191996q = uptimeMillis - this.f191997r;
            if (C58614e.f167821b >= 5) {
                C58614e.m68064a("DanmakuManager", "handleResume, mBaseTime = " + this.f191996q + ", currentTime = " + uptimeMillis + ", mPauseTime = " + this.f191997r);
            }
            C58298c cVar = this.f191995p;
            cVar.getClass();
            cVar.f166936c = SystemClock.uptimeMillis();
        }
        this.f191987e = true;
        this.f191972A = null;
        mo90832r();
        if (C58614e.f167821b >= 5) {
            C58614e.m68065b("DanmakuManager", "message resume:mPausedTime:", Long.valueOf(this.f191997r), ",mBaseTime:", Long.valueOf(this.f191996q));
        }
    }

    /* renamed from: i */
    public boolean mo90822i() {
        boolean z = !this.f191986d && this.f191987e;
        C58614e.m68064a("DanmakuManager", "isPlaying() = " + z + " : mIsQuited = " + this.f191986d + ", mIsPlaying = " + this.f191987e);
        return z;
    }

    /* renamed from: j */
    public boolean mo90823j() {
        boolean z = this.f191988f && !this.f191986d && this.f191987e;
        C58614e.m68069f("DanmakuManager", "isPrepared() = " + z + ", mIsSurfaceCreated = " + this.f191988f + ", mIsQuited = " + this.f191986d + ", mIsPlaying = " + this.f191987e);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0226 A[LOOP:2: B:33:0x00cb->B:74:0x0226, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02ab  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90824k() {
        /*
            r23 = this;
            r0 = r23
            zj.a r1 = r0.f191978G
            zj.o r1 = (p871zj.C66856o) r1
            r1.getClass()
            bk.i r2 = p006bk.C54479b.m61196c()
            int r2 = r2.f152763j
            int r3 = p850ek.C58614e.f167821b
            r4 = 5
            r5 = 1
            r6 = 0
            java.lang.String r7 = "Danmaku_R2LWindow"
            if (r3 < r4) goto L_0x0029
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.util.TreeSet<ak.a> r8 = r1.f191959b
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3[r6] = r8
            p850ek.C58614e.m68065b(r7, r3)
        L_0x0029:
            java.util.TreeSet<ak.a> r3 = r1.f191959b
            java.util.Iterator r3 = r3.iterator()
            r8 = 0
        L_0x0030:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0307
            java.lang.Object r9 = r3.next()
            ak.a r9 = (p001ak.C54053a) r9
            r3.remove()
            dk.c r11 = r1.f191965h
            long r11 = r11.f166934a
            boolean r11 = r9.mo74721k(r11)
            r12 = 2
            if (r11 != 0) goto L_0x02e2
            dk.f r11 = r1.f191964g
            long r13 = r11.f166940a
            boolean r11 = r9.mo74723m(r13)
            if (r11 != 0) goto L_0x02e2
            java.util.List<java.util.List<ak.a>> r11 = r1.f192036m
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x005c:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x007b
            java.lang.Object r13 = r11.next()
            java.util.List r13 = (java.util.List) r13
            boolean r13 = r13.contains(r9)
            if (r13 == 0) goto L_0x005c
            java.lang.Object[] r11 = new java.lang.Object[r12]
            r11[r6] = r9
            java.lang.String r13 = " is repeat"
            r11[r5] = r13
            p850ek.C58614e.m68065b(r7, r11)
            r11 = 1
            goto L_0x007c
        L_0x007b:
            r11 = 0
        L_0x007c:
            if (r11 == 0) goto L_0x0080
            goto L_0x02e2
        L_0x0080:
            boolean r11 = r9.mo74722l()
            if (r11 != 0) goto L_0x008b
            bk.b r11 = r1.f191962e
            p871zj.C66851m.m78951b(r11, r9)
        L_0x008b:
            int r11 = r1.f192033j
            int r13 = r9.f151359p
            if (r13 < r11) goto L_0x0093
            int r13 = r11 + -1
        L_0x0093:
            if (r13 < 0) goto L_0x0097
            r14 = r13
            goto L_0x009d
        L_0x0097:
            if (r11 >= 0) goto L_0x009c
            int r14 = r11 + -1
            goto L_0x009d
        L_0x009c:
            r14 = 0
        L_0x009d:
            if (r13 < 0) goto L_0x00a2
            int r11 = r14 + 1
            goto L_0x00a3
        L_0x00a2:
            int r11 = r11 + r14
        L_0x00a3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "startLayout, startLine = "
            r13.append(r15)
            r13.append(r14)
            java.lang.String r15 = ", maxLine = "
            r13.append(r15)
            r13.append(r11)
            java.lang.String r15 = ", danmaku = "
            r13.append(r15)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            p850ek.C58614e.m68064a(r7, r13)
            r13 = 2147483647(0x7fffffff, float:NaN)
        L_0x00cb:
            java.lang.String r15 = ",top:"
            java.lang.String r16 = " layout success:"
            r17 = 3
            if (r14 >= r11) goto L_0x0233
            r10 = r14
        L_0x00d4:
            int r5 = r1.f192033j
            if (r10 < r5) goto L_0x00da
            int r10 = r10 - r5
            goto L_0x00d4
        L_0x00da:
            int r5 = p850ek.C58614e.f167821b
            if (r5 < r4) goto L_0x0113
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r5[r6] = r9
            java.lang.String r19 = " try layout"
            r18 = 1
            r5[r18] = r19
            p850ek.C58614e.m68065b(r7, r5)
            r5 = 0
        L_0x00ec:
            int r12 = r1.f192033j
            if (r5 >= r12) goto L_0x0113
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r6 = "row "
            r12.append(r6)
            r12.append(r5)
            ak.a[] r6 = r1.f192035l
            r6 = r6[r5]
            if (r6 != 0) goto L_0x0105
            java.lang.String r6 = " null"
        L_0x0105:
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            p850ek.C58614e.m68064a(r7, r6)
            int r5 = r5 + 1
            r6 = 0
            goto L_0x00ec
        L_0x0113:
            ak.a[] r5 = r1.f192035l
            r6 = r5[r10]
            if (r6 != 0) goto L_0x015a
            r5[r10] = r9
            java.util.List<java.util.List<ak.a>> r5 = r1.f192036m
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r10)
            java.util.List r5 = (java.util.List) r5
            r5.add(r9)
            int r5 = r1.f191958a
            r6 = 1
            int r5 = r5 + r6
            r1.f191958a = r5
            int[] r5 = r1.f192034k
            r5 = r5[r10]
            r1.mo90861g(r9, r5, r2)
            int r5 = p850ek.C58614e.f167821b
            r11 = 4
            if (r5 < r11) goto L_0x0157
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r9
            r5[r6] = r16
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r12 = 2
            r5[r12] = r6
            r5[r17] = r15
            int[] r6 = r1.f192034k
            r6 = r6[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r11] = r6
            p850ek.C58614e.m68065b(r7, r5)
        L_0x0157:
            r0 = r7
            goto L_0x0224
        L_0x015a:
            dk.c r5 = r1.f191965h
            long r4 = r5.f166934a
            java.text.SimpleDateFormat r20 = p850ek.C58612c.f167811a
            boolean r20 = r6.mo74721k(r4)
            if (r20 != 0) goto L_0x01bd
            boolean r4 = r9.mo74721k(r4)
            if (r4 == 0) goto L_0x016d
            goto L_0x01bd
        L_0x016d:
            long r4 = r6.f151346c
            float[] r4 = r6.mo74711c(r4)
            r5 = r13
            long r12 = r6.f151346c
            float[] r12 = r9.mo74711c(r12)
            if (r4 == 0) goto L_0x01b8
            if (r12 != 0) goto L_0x017f
            goto L_0x01b8
        L_0x017f:
            r13 = 0
            r12 = r12[r13]
            r13 = 2
            r4 = r4[r13]
            float r12 = r12 - r4
            float r4 = r9.mo74717h()
            float r12 = r12 / r4
            int r4 = (int) r12
            long r12 = r6.f151346c
            dk.e r0 = r6.f151347d
            r21 = r7
            r22 = r8
            long r7 = r0.f166939a
            long r12 = r12 + r7
            float[] r0 = r6.mo74711c(r12)
            long r7 = r6.f151346c
            dk.e r6 = r6.f151347d
            long r12 = r6.f166939a
            long r7 = r7 + r12
            float[] r6 = r9.mo74711c(r7)
            r7 = 0
            r6 = r6[r7]
            r7 = 2
            r0 = r0[r7]
            float r6 = r6 - r0
            float r0 = r9.mo74717h()
            float r6 = r6 / r0
            int r0 = (int) r6
            int r0 = java.lang.Math.max(r4, r0)
            goto L_0x01c3
        L_0x01b8:
            r21 = r7
            r22 = r8
            goto L_0x01c2
        L_0x01bd:
            r21 = r7
            r22 = r8
            r5 = r13
        L_0x01c2:
            r0 = -1
        L_0x01c3:
            if (r0 >= r5) goto L_0x01c8
            r13 = r0
            r8 = r10
            goto L_0x01cb
        L_0x01c8:
            r13 = r5
            r8 = r22
        L_0x01cb:
            if (r13 >= 0) goto L_0x0226
            ak.a[] r0 = r1.f192035l
            r0[r10] = r9
            java.util.List<java.util.List<ak.a>> r0 = r1.f192036m
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r10)
            java.util.List r0 = (java.util.List) r0
            r0.add(r9)
            int r0 = r1.f191958a
            r4 = 1
            int r0 = r0 + r4
            r1.f191958a = r0
            int[] r0 = r1.f192034k
            r0 = r0[r10]
            r1.mo90861g(r9, r0, r2)
            int r0 = p850ek.C58614e.f167821b
            r5 = 4
            if (r0 < r5) goto L_0x0222
            r0 = 5
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r0 = 0
            r5[r0] = r9
            r5[r4] = r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4 = 2
            r5[r4] = r0
            r5[r17] = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int[] r4 = r1.f192034k
            r4 = r4[r10]
            r0.append(r4)
            java.lang.String r4 = ", hitTime = "
            r0.append(r4)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r4 = 4
            r5[r4] = r0
            r0 = r21
            p850ek.C58614e.m68065b(r0, r5)
            goto L_0x0224
        L_0x0222:
            r0 = r21
        L_0x0224:
            r4 = 1
            goto L_0x0238
        L_0x0226:
            r0 = r21
            int r14 = r14 + 1
            r7 = r0
            r4 = 5
            r5 = 1
            r6 = 0
            r12 = 2
            r0 = r23
            goto L_0x00cb
        L_0x0233:
            r0 = r7
            r22 = r8
            r5 = r13
            r4 = 0
        L_0x0238:
            if (r4 != 0) goto L_0x02a9
            boolean r5 = r9.f151361r
            if (r5 != 0) goto L_0x0246
            int r5 = r9.f151358o
            int r5 = r5 - r13
            if (r5 < 0) goto L_0x0244
            goto L_0x0246
        L_0x0244:
            r5 = 0
            goto L_0x0252
        L_0x0246:
            int r5 = r9.f151358o
            int r5 = r5 - r13
            r9.f151358o = r5
            long r5 = r9.f151346c
            long r10 = (long) r13
            long r5 = r5 + r10
            r9.f151346c = r5
            r5 = 1
        L_0x0252:
            if (r5 == 0) goto L_0x02a9
            ak.a[] r4 = r1.f192035l
            r4[r8] = r9
            java.util.List<java.util.List<ak.a>> r4 = r1.f192036m
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r8)
            java.util.List r4 = (java.util.List) r4
            r4.add(r9)
            int r4 = r1.f191958a
            r5 = 1
            int r4 = r4 + r5
            r1.f191958a = r4
            int[] r4 = r1.f192034k
            r4 = r4[r8]
            r1.mo90861g(r9, r4, r2)
            int r4 = p850ek.C58614e.f167821b
            r6 = 4
            if (r4 < r6) goto L_0x02a8
            r4 = 5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r4 = 0
            r6[r4] = r9
            r6[r5] = r16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r5 = 2
            r6[r5] = r4
            r6[r17] = r15
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int[] r5 = r1.f192034k
            r5 = r5[r8]
            r4.append(r5)
            java.lang.String r5 = ", danmakuRepeatTime = "
            r4.append(r5)
            int r5 = r9.f151358o
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 4
            r6[r5] = r4
            p850ek.C58614e.m68065b(r0, r6)
        L_0x02a8:
            r4 = 1
        L_0x02a9:
            if (r4 != 0) goto L_0x02c5
            java.util.List<ak.a> r5 = r1.f191960c
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.add(r9)
            int r5 = p850ek.C58614e.f167821b
            r6 = 4
            if (r5 < r6) goto L_0x02c5
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r9
            java.lang.String r6 = " can not in window"
            r7 = 1
            r5[r7] = r6
            p850ek.C58614e.m68065b(r0, r5)
        L_0x02c5:
            boolean r5 = r9.f151361r
            if (r5 == 0) goto L_0x02df
            if (r4 == 0) goto L_0x02df
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "must show danmaku layout success :"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            p850ek.C58614e.m68064a(r0, r4)
        L_0x02df:
            r5 = 5
            r12 = 0
            goto L_0x02ff
        L_0x02e2:
            r0 = r7
            int r4 = p850ek.C58614e.f167821b
            r5 = 5
            if (r4 < r5) goto L_0x02f7
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r12 = 0
            r4[r12] = r9
            java.lang.String r6 = " is out side"
            r7 = 1
            r4[r7] = r6
            p850ek.C58614e.m68065b(r0, r4)
            goto L_0x02f8
        L_0x02f7:
            r12 = 0
        L_0x02f8:
            java.util.List<ak.a> r4 = r1.f191960c
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            r4.add(r9)
        L_0x02ff:
            r7 = r0
            r4 = 5
            r5 = 1
            r6 = 0
            r0 = r23
            goto L_0x0030
        L_0x0307:
            r12 = 0
            java.util.List<java.util.List<ak.a>> r0 = r1.f192036m
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r2 = 0
        L_0x0311:
            if (r2 >= r0) goto L_0x0364
            java.util.List<java.util.List<ak.a>> r3 = r1.f192036m
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0321:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x035f
            java.lang.Object r4 = r3.next()
            ak.a r4 = (p001ak.C54053a) r4
            dk.c r5 = r1.f191965h
            long r5 = r5.f166934a
            boolean r5 = r4.mo74721k(r5)
            if (r5 != 0) goto L_0x0344
            int r5 = r4.f151354k
            r6 = 1
            if (r5 != r6) goto L_0x033f
            r18 = 1
            goto L_0x0341
        L_0x033f:
            r18 = 0
        L_0x0341:
            if (r18 != 0) goto L_0x0321
            goto L_0x0345
        L_0x0344:
            r6 = 1
        L_0x0345:
            ak.a[] r5 = r1.f192035l
            r7 = r5[r2]
            if (r4 != r7) goto L_0x034e
            r7 = 0
            r5[r2] = r7
        L_0x034e:
            r3.remove()
            int r5 = r1.f191958a
            r7 = -1
            int r5 = r5 + r7
            r1.f191958a = r5
            java.util.List<ak.a> r5 = r1.f191960c
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.add(r4)
            goto L_0x0321
        L_0x035f:
            r6 = 1
            r7 = -1
            int r2 = r2 + 1
            goto L_0x0311
        L_0x0364:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p871zj.C66838e.mo90824k():void");
    }

    /* renamed from: l */
    public void mo90825l() {
        C58614e.m68067d("surface_lock", "surfaceChanged");
        this.f191988f = true;
        mo90832r();
    }

    /* renamed from: m */
    public void mo90826m() {
        this.f191988f = false;
        mo90831q();
        C66834a aVar = this.f191978G;
        if (aVar instanceof C66856o) {
            C66856o oVar = (C66856o) aVar;
            oVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) oVar.f192036m).iterator();
            while (it.hasNext()) {
                arrayList.addAll((List) it.next());
            }
            Log.m105925i("Danmaku_R2LWindow", "getDrawingDanmakuList: size = %d", Integer.valueOf(arrayList.size()));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C54053a aVar2 = (C54053a) it4.next();
                this.f191975D.mo75305a(aVar2).mo75813d(aVar2);
            }
        }
        C58614e.m68067d("surface_lock", "surfaceDestroyed");
    }

    /* renamed from: n */
    public void mo90827n() {
        C58614e.m68069f("DanmakuManager", "quit(); mIsQuited = true");
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (BuildInfo.DEBUG) {
            C58611b.f167810d = false;
            long j = (currentTimeMillis - C58611b.f167807a) / ((long) 1000);
            C58611b.f167809c = j != 0 ? (int) (C58611b.f167808b / j) : Integer.MIN_VALUE;
            Log.m105924i("CountUtil", "fps:" + C58611b.f167809c + ",count:" + C58611b.f167808b + ",duration:" + j + '!');
        }
        this.f191986d = true;
        this.f191981J.mo90858a(6);
        if (this.f191984M == 0 && this.f191985N != null) {
            z = true;
        }
        if (z) {
            Choreographer.getInstance().removeFrameCallback(this.f191985N);
        }
        mo90831q();
    }

    /* renamed from: o */
    public final void mo90828o() {
        ((LinkedList) this.f191977F).addAll(this.f191978G.f191960c);
        ((LinkedList) this.f191978G.f191960c).clear();
        for (C54053a next : this.f191977F) {
            Bitmap bitmap = next.f151356m;
            if (bitmap != null) {
                next.f151356m = null;
                next.f151357n.setBitmap((Bitmap) null);
                this.f191992j.f191966a.mo83056b(bitmap);
            }
        }
        C66846j.C66848b bVar = this.f191979H;
        if (bVar != null) {
            bVar.mo84285b(this.f191977F);
        }
        for (C54053a next2 : this.f191977F) {
            this.f191975D.mo75305a(next2).mo75813d(next2);
            C66845i iVar = this.f191991i;
            iVar.getClass();
            int j = next2.mo74720j();
            BlockingQueue blockingQueue = iVar.f192018b.get(j);
            if (blockingQueue == null) {
                blockingQueue = new LinkedBlockingQueue();
                iVar.f192018b.put(j, blockingQueue);
            }
            if (300 > blockingQueue.size()) {
                blockingQueue.add(next2);
            }
        }
        ((LinkedList) this.f191977F).clear();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/danmaku/core/DanmakuController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f191999t) {
            if (C58614e.f167821b >= 4) {
                C58614e.m68070g("DanmakuManager", "onClick:", motionEvent);
            }
            if ((motionEvent.getAction() & 255) == 0) {
                mo90814a(new Point((int) motionEvent.getX(), (int) motionEvent.getY()), 0);
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/danmaku/core/DanmakuController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* renamed from: p */
    public final void mo90830p(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (this.f191988f) {
            this.f191989g.unlockCanvasAndPost(canvas);
        } else {
            this.f191989g.unlock();
        }
    }

    /* renamed from: q */
    public final void mo90831q() {
        C58614e.m68069f("DanmakuManager", "removeUpdateMessage()");
        Handler handler = this.f191981J.f192028a;
        if (handler != null) {
            handler.removeMessages(4);
        }
    }

    /* renamed from: r */
    public final void mo90832r() {
        C58614e.m68069f("DanmakuManager", "resumeUpdateMessage()");
        if (mo90822i()) {
            C66853n nVar = this.f191981J;
            Handler handler = nVar.f192028a;
            if (handler != null) {
                handler.removeMessages(4);
                nVar.f192028a.sendEmptyMessage(4);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (BuildInfo.DEBUG) {
                C58611b.f167807a = currentTimeMillis;
                C58611b.f167808b = 0;
                C58611b.f167810d = true;
            }
        }
    }

    /* renamed from: s */
    public final void mo90833s(long j) {
        boolean z = true;
        if (!(this.f191984M == 0 && this.f191985N != null)) {
            mo90831q();
            if (mo90823j()) {
                C66853n nVar = this.f191981J;
                Handler handler = nVar.f192028a;
                if (handler == null) {
                    z = false;
                }
                if (z) {
                    handler.removeMessages(4);
                    nVar.f192028a.sendEmptyMessageDelayed(4, j);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0052 A[EDGE_INSN: B:74:0x0052->B:17:0x0052 ?: BREAK  , SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90834t() {
        /*
            r17 = this;
            r0 = r17
            zj.h r1 = r0.f191990h
            r1.mo90840c()
            dk.g<ak.a> r2 = r1.f192013b
            dk.f r3 = r1.f192014c
            long r3 = r3.f166940a
            java.util.List<ak.a> r5 = r1.f192012a
            dk.g$a<T> r6 = r2.f166941a
            dk.g$a<T> r6 = r6.f166946b
            r7 = 0
            r8 = 0
        L_0x0015:
            r9 = 3
            r10 = -1
            r11 = 1
            if (r8 >= r9) goto L_0x0052
            dk.g$a<T> r12 = r2.f166941a
            if (r6 == r12) goto L_0x0052
            dk.g$b r12 = r2.f166943c
            T r13 = r6.f166945a
            zj.h$a r12 = (p871zj.C66843h.C66844a) r12
            r12.getClass()
            ak.a r13 = (p001ak.C54053a) r13
            if (r13 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            long r12 = r13.f151348e
            long r12 = r12 - r3
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0037
            r12 = 0
            goto L_0x003c
        L_0x0037:
            if (r16 <= 0) goto L_0x003b
            r12 = 1
            goto L_0x003c
        L_0x003b:
            r12 = -1
        L_0x003c:
            if (r12 > 0) goto L_0x0052
            if (r5 == 0) goto L_0x004a
            T r9 = r6.f166945a
            r10 = r5
            java.util.LinkedList r10 = (java.util.LinkedList) r10
            r10.add(r9)
            int r8 = r8 + 1
        L_0x004a:
            int r9 = r2.f166944d
            int r9 = r9 - r11
            r2.f166944d = r9
            dk.g$a<T> r6 = r6.f166946b
            goto L_0x0015
        L_0x0052:
            boolean r8 = p871zj.C66836c.f191968b
            r12 = 2
            if (r8 == 0) goto L_0x00b8
            int r8 = p852fk.C59112c.f169074a
            if (r5 == 0) goto L_0x0066
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            int r5 = r5.size()
            if (r5 > 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r5 = 0
            goto L_0x0067
        L_0x0066:
            r5 = 1
        L_0x0067:
            if (r5 == 0) goto L_0x00b8
            dk.g$a<T> r5 = r2.f166941a
            dk.g$a<T> r8 = r5.f166946b
            if (r8 != r5) goto L_0x0071
            r5 = 1
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            if (r5 != 0) goto L_0x00b8
            T r5 = r6.f166945a
            boolean r8 = r5 instanceof p001ak.C54053a
            if (r8 == 0) goto L_0x00b8
            ak.a r5 = (p001ak.C54053a) r5
            long r13 = r5.f151348e
            long r13 = r13 - r3
            long r13 = java.lang.Math.abs(r13)
            r15 = 60000(0xea60, double:2.9644E-319)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x00b8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "Danmaku upload to screen fail, deltaTime = "
            r8.append(r15)
            r8.append(r13)
            java.lang.String r13 = " , curTime = "
            r8.append(r13)
            r8.append(r3)
            java.lang.String r3 = ", curDanmaku = "
            r8.append(r3)
            r8.append(r5)
            java.lang.String r3 = r8.toString()
            int r4 = p850ek.C58614e.f167821b
            if (r4 < r12) goto L_0x00b8
            bk.h r4 = p850ek.C58614e.f167820a
            if (r4 == 0) goto L_0x00b8
            java.lang.String r5 = "DanmakuDataSource"
            r4.mo14331w(r5, r3)
        L_0x00b8:
            dk.g$a<T> r2 = r2.f166941a
            r2.f166946b = r6
            r6.f166947c = r2
            java.util.List<ak.a> r2 = r1.f192012a
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r3 = r2.size()
            int r3 = r3 + r10
        L_0x00c7:
            if (r3 < 0) goto L_0x00e8
            java.lang.Object r4 = r2.get(r3)
            ak.a r4 = (p001ak.C54053a) r4
            long r5 = r4.f151348e
            long r13 = r1.f192016e
            int r8 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x00e5
            bk.i r5 = p006bk.C54479b.m61196c()
            dk.e r6 = new dk.e
            int r5 = r5.f152754a
            long r13 = (long) r5
            r6.<init>(r13)
            r4.f151347d = r6
        L_0x00e5:
            int r3 = r3 + -1
            goto L_0x00c7
        L_0x00e8:
            r1.mo90841d()
            java.util.List<ak.a> r1 = r1.f192012a
            int r2 = p850ek.C58614e.f167821b
            java.lang.String r3 = "DanmakuManager"
            r4 = 4
            if (r2 < r4) goto L_0x010c
            r2 = r1
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x010c
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.String r6 = "new danmaku to draw:"
            r5[r7] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r11] = r2
            p850ek.C58614e.m68065b(r3, r5)
        L_0x010c:
            java.util.Iterator r1 = r1.iterator()
        L_0x0110:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01a1
            java.lang.Object r2 = r1.next()
            ak.a r2 = (p001ak.C54053a) r2
            r1.remove()
            dk.f r5 = r0.f191994o
            long r5 = r5.f166940a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "upload, danmaku = "
            r8.append(r10)
            r8.append(r2)
            java.lang.String r10 = ", playerTime="
            r8.append(r10)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            p850ek.C58614e.m68067d(r3, r8)
            boolean r8 = r2.mo74723m(r5)
            if (r8 != 0) goto L_0x0185
            boolean r8 = r2.f151361r
            if (r8 == 0) goto L_0x014b
            goto L_0x0156
        L_0x014b:
            long r13 = r2.f151348e
            long r5 = r5 - r13
            long r13 = r2.f151349f
            int r10 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x0156
            r5 = 1
            goto L_0x0157
        L_0x0156:
            r5 = 0
        L_0x0157:
            if (r5 == 0) goto L_0x015a
            goto L_0x0185
        L_0x015a:
            int r5 = p850ek.C58614e.f167821b
            if (r5 < r4) goto L_0x0177
            if (r8 == 0) goto L_0x0177
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "不可淘汰弹幕从数据源的绘制列表中取出加入到Window中:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MustShowDMComment"
            p850ek.C58614e.m68064a(r6, r5)
        L_0x0177:
            dk.c r5 = r0.f191995p
            long r5 = r5.f166934a
            r2.f151346c = r5
            zj.a r5 = r0.f191978G
            java.util.TreeSet<ak.a> r5 = r5.f191959b
            r5.add(r2)
            goto L_0x0110
        L_0x0185:
            int r5 = p850ek.C58614e.f167821b
            if (r5 < r4) goto L_0x0198
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r6 = "before measure "
            r5[r7] = r6
            r5[r11] = r2
            java.lang.String r6 = " is out side"
            r5[r12] = r6
            p850ek.C58614e.m68068e(r3, r5)
        L_0x0198:
            java.util.List<ak.a> r5 = r0.f191977F
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.add(r2)
            goto L_0x0110
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p871zj.C66838e.mo90834t():void");
    }
}
