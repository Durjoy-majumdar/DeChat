package p288a6;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import android.p293os.HapticPlayer;
import java.io.File;
import p392w5.C26424f;
import p409b6.C23674a;
import p409b6.C23676c;
import p421x5.C26534c;

/* renamed from: a6.f */
public class C23616f implements C53978d {

    /* renamed from: a */
    public Context f67787a;

    /* renamed from: b */
    public HapticPlayer f67788b;

    /* renamed from: c */
    public Handler f67789c;

    /* renamed from: d */
    public HandlerThread f67790d;

    /* renamed from: e */
    public C23676c f67791e;

    /* renamed from: f */
    public C23674a f67792f;

    /* renamed from: g */
    public C23610a f67793g = new C23610a();

    /* renamed from: a6.f$a */
    public class C23617a extends Handler {

        /* renamed from: a */
        public int f67794a = 0;

        /* renamed from: b */
        public final /* synthetic */ int f67795b;

        /* renamed from: c */
        public final /* synthetic */ int f67796c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23617a(Looper looper, int i, int i2) {
            super(looper);
            this.f67795b = i;
            this.f67796c = i2;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:29|30|31|32|33|34) */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                a6.f r0 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                android.os.Handler r1 = r0.f67789c     // Catch:{ Exception -> 0x00f5 }
                if (r1 == 0) goto L_0x00f4
                android.os.HandlerThread r1 = r0.f67790d     // Catch:{ Exception -> 0x00f5 }
                if (r1 == 0) goto L_0x00f4
                b6.c r1 = r0.f67791e     // Catch:{ Exception -> 0x00f5 }
                if (r1 != 0) goto L_0x0010
                goto L_0x00f4
            L_0x0010:
                int r1 = r6.what     // Catch:{ Exception -> 0x00f5 }
                r2 = 0
                switch(r1) {
                    case 100: goto L_0x00a9;
                    case 101: goto L_0x004f;
                    case 102: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ Exception -> 0x00f5 }
            L_0x0016:
                goto L_0x00f9
            L_0x0018:
                a6.a r6 = r0.f67793g     // Catch:{ Exception -> 0x00f5 }
                int r1 = r6.f67751c     // Catch:{ Exception -> 0x00f5 }
                if (r1 <= 0) goto L_0x0046
                b6.a r6 = r0.f67792f     // Catch:{ Exception -> 0x00f5 }
                if (r6 == 0) goto L_0x003f
                int r6 = r6.getCurrentPosition()     // Catch:{ Exception -> 0x00f5 }
                a6.f r0 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                a6.a r0 = r0.f67793g     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r0 = r0.f67749a     // Catch:{ Exception -> 0x00f5 }
                int r0 = p392w5.C26424f.m34022d(r0)     // Catch:{ Exception -> 0x00f5 }
                if (r6 <= r0) goto L_0x003f
                a6.f r6 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                android.os.Handler r6 = r6.f67789c     // Catch:{ Exception -> 0x00f5 }
                r0 = 102(0x66, float:1.43E-43)
                r1 = 10
                r6.sendEmptyMessageDelayed(r0, r1)     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00f9
            L_0x003f:
                a6.f r6 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                r6.mo37120e(r2)     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00f9
            L_0x0046:
                r1 = 9
                r6.f67757i = r1     // Catch:{ Exception -> 0x00f5 }
                r0.getClass()     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00f9
            L_0x004f:
                java.lang.Object r6 = r6.obj     // Catch:{ Exception -> 0x00f5 }
                boolean r1 = r6 instanceof android.os.Parcel     // Catch:{ Exception -> 0x00f5 }
                if (r1 == 0) goto L_0x00f9
                android.os.Parcel r6 = (android.os.Parcel) r6     // Catch:{ Exception -> 0x00f5 }
                b6.a r0 = r0.f67792f     // Catch:{ Exception -> 0x00f5 }
                if (r0 == 0) goto L_0x005e
                r0.getCurrentPosition()     // Catch:{ Exception -> 0x00f5 }
            L_0x005e:
                com.appaac.haptic.sync.VibrationPattern r0 = new com.appaac.haptic.sync.VibrationPattern     // Catch:{ Exception -> 0x00f5 }
                r0.<init>(r6)     // Catch:{ Exception -> 0x00f5 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
                r1.<init>()     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r3 = "{\"Metadata\": {\"Version\": 1},"
                r1.append(r3)     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r0 = r0.f68204d     // Catch:{ Exception -> 0x00f5 }
                r1.append(r0)     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r0 = "}"
                r1.append(r0)     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00f5 }
                boolean r1 = android.p293os.HapticPlayer.isAvailable()     // Catch:{ all -> 0x00a5 }
                if (r1 == 0) goto L_0x00a5
                android.os.DynamicEffect r0 = android.p293os.DynamicEffect.create(r0)     // Catch:{ all -> 0x00a5 }
                a6.f r1 = p288a6.C23616f.this     // Catch:{ all -> 0x00a5 }
                android.os.HapticPlayer r3 = new android.os.HapticPlayer     // Catch:{ all -> 0x00a5 }
                r3.<init>(r0)     // Catch:{ all -> 0x00a5 }
                r1.f67788b = r3     // Catch:{ all -> 0x00a5 }
                r0 = 1
                a6.f r1 = p288a6.C23616f.this     // Catch:{ NoSuchMethodError -> 0x009e }
                android.os.HapticPlayer r3 = r1.f67788b     // Catch:{ NoSuchMethodError -> 0x009e }
                r1.getClass()     // Catch:{ NoSuchMethodError -> 0x009e }
                int r1 = r5.f67795b     // Catch:{ NoSuchMethodError -> 0x009e }
                int r4 = r5.f67796c     // Catch:{ NoSuchMethodError -> 0x009e }
                r3.start(r0, r2, r1, r4)     // Catch:{ NoSuchMethodError -> 0x009e }
                goto L_0x00a5
            L_0x009e:
                a6.f r1 = p288a6.C23616f.this     // Catch:{ all -> 0x00a5 }
                android.os.HapticPlayer r1 = r1.f67788b     // Catch:{ all -> 0x00a5 }
                r1.start(r0)     // Catch:{ all -> 0x00a5 }
            L_0x00a5:
                r6.recycle()     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00f9
            L_0x00a9:
                java.lang.Object r0 = r6.obj     // Catch:{ Exception -> 0x00f5 }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00f5 }
                long r0 = r0.longValue()     // Catch:{ Exception -> 0x00f5 }
                a6.f r2 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                b6.a r3 = r2.f67792f     // Catch:{ Exception -> 0x00f5 }
                if (r3 == 0) goto L_0x00ec
                int r2 = r3.getCurrentPosition()     // Catch:{ Exception -> 0x00f5 }
                if (r2 <= 0) goto L_0x00cc
                int r3 = r5.f67794a     // Catch:{ Exception -> 0x00f5 }
                if (r2 < r3) goto L_0x00cc
                a6.f r6 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                b6.c r6 = r6.f67791e     // Catch:{ Exception -> 0x00f5 }
                long r3 = (long) r2     // Catch:{ Exception -> 0x00f5 }
                r6.f67860a = r3     // Catch:{ Exception -> 0x00f5 }
                r6.mo37212a(r3, r0)     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00e9
            L_0x00cc:
                if (r2 < 0) goto L_0x00de
                int r0 = r5.f67794a     // Catch:{ Exception -> 0x00f5 }
                if (r2 >= r0) goto L_0x00de
                a6.f r0 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                a6.a r1 = r0.f67793g     // Catch:{ Exception -> 0x00f5 }
                int r1 = r1.f67751c     // Catch:{ Exception -> 0x00f5 }
                if (r1 <= 0) goto L_0x00de
                r0.mo37120e(r2)     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00e9
            L_0x00de:
                a6.f r0 = p288a6.C23616f.this     // Catch:{ Exception -> 0x00f5 }
                android.os.Handler r0 = r0.f67789c     // Catch:{ Exception -> 0x00f5 }
                android.os.Message r6 = android.os.Message.obtain(r6)     // Catch:{ Exception -> 0x00f5 }
                r0.sendMessage(r6)     // Catch:{ Exception -> 0x00f5 }
            L_0x00e9:
                r5.f67794a = r2     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00f9
            L_0x00ec:
                b6.c r6 = r2.f67791e     // Catch:{ Exception -> 0x00f5 }
                r6.f67860a = r0     // Catch:{ Exception -> 0x00f5 }
                r6.mo37212a(r0, r0)     // Catch:{ Exception -> 0x00f5 }
                goto L_0x00f9
            L_0x00f4:
                return
            L_0x00f5:
                r6 = move-exception
                r6.toString()
            L_0x00f9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p288a6.C23616f.C23617a.handleMessage(android.os.Message):void");
        }
    }

    public C23616f(Context context) {
        this.f67787a = context;
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: a */
    public final void mo37119a(String str, int i, int i2, C23674a aVar) {
        this.f67792f = aVar;
        HandlerThread handlerThread = new HandlerThread("Tencent-Sync");
        this.f67790d = handlerThread;
        handlerThread.start();
        C23617a aVar2 = new C23617a(this.f67790d.getLooper(), i, i2);
        this.f67789c = aVar2;
        C23676c cVar = new C23676c(aVar2, str, this.f67793g);
        this.f67791e = cVar;
        C23674a aVar3 = this.f67793g.f67755g;
        if (aVar3 != null) {
            if (aVar3.getCurrentPosition() < 0) {
                this.f67791e.f67860a = (long) this.f67793g.f67755g.getCurrentPosition();
                this.f67791e.mo37212a((long) this.f67793g.f67755g.getCurrentPosition(), (long) this.f67793g.f67756h);
                return;
            }
            C23676c cVar2 = this.f67791e;
            long j = (long) this.f67793g.f67756h;
            cVar2.f67860a = j;
            cVar2.mo37212a(j, j);
        } else if (aVar != null) {
            cVar.f67860a = (long) aVar.getCurrentPosition();
            this.f67791e.mo37212a((long) aVar.getCurrentPosition(), 0);
        } else {
            synchronized (cVar) {
                cVar.mo37214c(0, 0);
            }
            cVar.mo37213b();
        }
    }

    /* renamed from: b */
    public void mo37103b(boolean z) {
        if (z) {
            this.f67793g.f67751c = Integer.MAX_VALUE;
        } else {
            this.f67793g.f67751c = 0;
        }
    }

    /* renamed from: c */
    public void mo37104c() {
        try {
            this.f67793g.mo37100b();
            if (this.f67788b != null) {
                mo37121f();
                this.f67788b.stop();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public void mo37105d(File file, int i, int i2, C23674a aVar) {
        this.f67793g.mo37100b();
        C23610a aVar2 = this.f67793g;
        aVar2.f67758j = file;
        aVar2.f67752d = i;
        aVar2.f67753e = i2;
        aVar2.f67755g = aVar;
    }

    /* renamed from: e */
    public boolean mo37120e(int i) {
        if (C23610a.m28204a(this.f67793g.f67754f) && i >= 0 && i <= this.f67793g.f67754f.getDuration()) {
            HapticPlayer hapticPlayer = this.f67788b;
            if (hapticPlayer != null) {
                hapticPlayer.stop();
            }
            mo37121f();
            C23610a aVar = this.f67793g;
            aVar.f67756h = i;
            String c = C26424f.m34021c(aVar.f67749a, i);
            if (c == null || "".equals(c)) {
                C23610a aVar2 = this.f67793g;
                if (aVar2.f67751c > 0) {
                    String str = aVar2.f67749a;
                    aVar2.f67756h = 0;
                    c = str;
                } else {
                    aVar2.f67757i = 9;
                }
            }
            C23610a aVar3 = this.f67793g;
            if (6 != aVar3.f67757i) {
                return true;
            }
            aVar3.f67750b = SystemClock.elapsedRealtime();
            C23610a aVar4 = this.f67793g;
            C23674a aVar5 = aVar4.f67755g;
            if (aVar5 != null) {
                mo37119a(aVar4.f67749a, aVar4.f67752d, aVar4.f67753e, aVar5);
            } else {
                mo37119a(c, aVar4.f67752d, aVar4.f67753e, (C23674a) null);
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo37121f() {
        HandlerThread handlerThread = this.f67790d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f67790d = null;
            this.f67789c = null;
            this.f67791e = null;
        }
    }

    public void pause() {
        if (6 == this.f67793g.f67757i) {
            HapticPlayer hapticPlayer = this.f67788b;
            if (hapticPlayer != null) {
                hapticPlayer.stop();
            }
            mo37121f();
            C23610a aVar = this.f67793g;
            aVar.f67757i = 7;
            if (!C23610a.m28204a(aVar.f67754f)) {
                this.f67793g.f67756h = 0;
                return;
            }
            C23610a aVar2 = this.f67793g;
            C23674a aVar3 = aVar2.f67755g;
            if (aVar3 != null) {
                aVar2.f67756h = aVar3.getCurrentPosition();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C23610a aVar4 = this.f67793g;
            int i = (int) (elapsedRealtime - aVar4.f67750b);
            if (i < 0) {
                aVar4.f67756h = 0;
            } else {
                aVar4.f67756h += i;
            }
        }
    }

    public boolean prepare() {
        C23610a aVar = this.f67793g;
        File file = aVar.f67758j;
        if (file != null) {
            aVar.f67749a = C26424f.m34026h(file);
        }
        if (1 == C26424f.m34027i(this.f67793g.f67749a)) {
            C23610a aVar2 = this.f67793g;
            aVar2.f67749a = C26424f.m34019a(aVar2.f67749a);
        }
        C23610a aVar3 = this.f67793g;
        aVar3.f67749a = C26424f.m34028j(aVar3.f67749a);
        C23610a aVar4 = this.f67793g;
        aVar4.f67749a = C26424f.m34029k(aVar4.f67749a);
        C26534c g = C26424f.m34025g(this.f67793g.f67749a);
        if (!C23610a.m28204a(g)) {
            this.f67793g.mo37100b();
            return false;
        }
        this.f67793g.f67754f = g;
        return true;
    }

    public void release() {
        this.f67793g.mo37100b();
        mo37121f();
        HapticPlayer hapticPlayer = this.f67788b;
        if (hapticPlayer != null) {
            hapticPlayer.stop();
        }
        this.f67788b = null;
    }

    public boolean start() {
        C23610a aVar = this.f67793g;
        if (6 == aVar.f67757i || !C23610a.m28204a(aVar.f67754f)) {
            return false;
        }
        C23610a aVar2 = this.f67793g;
        if (aVar2.f67756h < 0) {
            return false;
        }
        if (9 == aVar2.f67757i) {
            aVar2.f67756h = 0;
        }
        String c = C26424f.m34021c(aVar2.f67749a, aVar2.f67756h);
        if (c == null || "".equals(c)) {
            this.f67793g.f67757i = 9;
            return false;
        }
        this.f67793g.f67750b = SystemClock.elapsedRealtime();
        C23610a aVar3 = this.f67793g;
        aVar3.f67757i = 6;
        C23674a aVar4 = aVar3.f67755g;
        if (aVar4 != null) {
            mo37119a(aVar3.f67749a, aVar3.f67752d, aVar3.f67753e, aVar4);
            return true;
        }
        mo37119a(c, aVar3.f67752d, aVar3.f67753e, (C23674a) null);
        return true;
    }
}
