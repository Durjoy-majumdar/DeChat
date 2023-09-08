package p288a6;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import java.io.File;
import org.json.JSONObject;
import p392w5.C22865a;
import p392w5.C22866b;
import p392w5.C26421e;
import p392w5.C26424f;
import p409b6.C23674a;
import p409b6.C23676c;
import p421x5.C26534c;
import p424z5.C26654a;

/* renamed from: a6.b */
public class C23611b implements C53978d {

    /* renamed from: a */
    public Vibrator f67759a;

    /* renamed from: b */
    public Context f67760b;

    /* renamed from: c */
    public C22866b f67761c;

    /* renamed from: d */
    public Handler f67762d;

    /* renamed from: e */
    public HandlerThread f67763e;

    /* renamed from: f */
    public C23676c f67764f;

    /* renamed from: g */
    public C23674a f67765g;

    /* renamed from: h */
    public C23610a f67766h = new C23610a();

    /* renamed from: i */
    public C26421e f67767i;

    /* renamed from: a6.b$a */
    public class C23612a extends C26421e.C26423b {

        /* renamed from: a */
        public final /* synthetic */ String f67768a;

        /* renamed from: b */
        public final /* synthetic */ int f67769b;

        /* renamed from: c */
        public final /* synthetic */ int f67770c;

        public C23612a(String str, int i, int i2) {
            this.f67768a = str;
            this.f67769b = i;
            this.f67770c = i2;
        }
    }

    /* renamed from: a6.b$b */
    public class C23613b extends Handler {

        /* renamed from: a */
        public int f67772a = 0;

        /* renamed from: b */
        public final /* synthetic */ int f67773b;

        /* renamed from: c */
        public final /* synthetic */ int f67774c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23613b(Looper looper, int i, int i2) {
            super(looper);
            this.f67773b = i;
            this.f67774c = i2;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                a6.b r0 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                android.os.Handler r1 = r0.f67762d     // Catch:{ Exception -> 0x00e1 }
                if (r1 == 0) goto L_0x00e0
                android.os.HandlerThread r1 = r0.f67763e     // Catch:{ Exception -> 0x00e1 }
                if (r1 == 0) goto L_0x00e0
                b6.c r1 = r0.f67764f     // Catch:{ Exception -> 0x00e1 }
                if (r1 != 0) goto L_0x0010
                goto L_0x00e0
            L_0x0010:
                int r1 = r9.what     // Catch:{ Exception -> 0x00e1 }
                switch(r1) {
                    case 100: goto L_0x0095;
                    case 101: goto L_0x004c;
                    case 102: goto L_0x0017;
                    default: goto L_0x0015;
                }     // Catch:{ Exception -> 0x00e1 }
            L_0x0015:
                goto L_0x00e5
            L_0x0017:
                a6.a r9 = r0.f67766h     // Catch:{ Exception -> 0x00e1 }
                int r1 = r9.f67751c     // Catch:{ Exception -> 0x00e1 }
                if (r1 <= 0) goto L_0x0046
                b6.a r9 = r0.f67765g     // Catch:{ Exception -> 0x00e1 }
                if (r9 == 0) goto L_0x003e
                int r9 = r9.getCurrentPosition()     // Catch:{ Exception -> 0x00e1 }
                a6.b r0 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                a6.a r0 = r0.f67766h     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r0 = r0.f67749a     // Catch:{ Exception -> 0x00e1 }
                int r0 = p392w5.C26424f.m34022d(r0)     // Catch:{ Exception -> 0x00e1 }
                if (r9 <= r0) goto L_0x003e
                a6.b r9 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                android.os.Handler r9 = r9.f67762d     // Catch:{ Exception -> 0x00e1 }
                r0 = 102(0x66, float:1.43E-43)
                r1 = 10
                r9.sendEmptyMessageDelayed(r0, r1)     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00e5
            L_0x003e:
                a6.b r9 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                r0 = 0
                r9.mo37107f(r0)     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00e5
            L_0x0046:
                r0 = 9
                r9.f67757i = r0     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00e5
            L_0x004c:
                java.lang.Object r9 = r9.obj     // Catch:{ Exception -> 0x00e1 }
                boolean r1 = r9 instanceof android.os.Parcel     // Catch:{ Exception -> 0x00e1 }
                if (r1 == 0) goto L_0x00e5
                android.os.Parcel r9 = (android.os.Parcel) r9     // Catch:{ Exception -> 0x00e1 }
                b6.a r0 = r0.f67765g     // Catch:{ Exception -> 0x00e1 }
                if (r0 == 0) goto L_0x005b
                r0.getCurrentPosition()     // Catch:{ Exception -> 0x00e1 }
            L_0x005b:
                com.appaac.haptic.sync.VibrationPattern r0 = new com.appaac.haptic.sync.VibrationPattern     // Catch:{ Exception -> 0x00e1 }
                r0.<init>(r9)     // Catch:{ Exception -> 0x00e1 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
                r1.<init>()     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r2 = "{\"Metadata\": {\"Version\": 1},"
                r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r0 = r0.f68204d     // Catch:{ Exception -> 0x00e1 }
                r1.append(r0)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r0 = "}"
                r1.append(r0)     // Catch:{ Exception -> 0x00e1 }
                java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x00e1 }
                a6.b r2 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                r4 = 1
                r5 = 0
                w5.e r0 = r2.f67767i     // Catch:{ Exception -> 0x00e1 }
                if (r0 == 0) goto L_0x0089
                monitor-enter(r0)     // Catch:{ Exception -> 0x00e1 }
                int r1 = r0.f73689c     // Catch:{ all -> 0x0086 }
                monitor-exit(r0)     // Catch:{ Exception -> 0x00e1 }
                r6 = r1
                goto L_0x008c
            L_0x0086:
                r9 = move-exception
                monitor-exit(r0)     // Catch:{ Exception -> 0x00e1 }
                throw r9     // Catch:{ Exception -> 0x00e1 }
            L_0x0089:
                int r0 = r8.f67773b     // Catch:{ Exception -> 0x00e1 }
                r6 = r0
            L_0x008c:
                int r7 = r8.f67774c     // Catch:{ Exception -> 0x00e1 }
                r2.mo37102a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00e1 }
                r9.recycle()     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00e5
            L_0x0095:
                java.lang.Object r0 = r9.obj     // Catch:{ Exception -> 0x00e1 }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00e1 }
                long r0 = r0.longValue()     // Catch:{ Exception -> 0x00e1 }
                a6.b r2 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                b6.a r3 = r2.f67765g     // Catch:{ Exception -> 0x00e1 }
                if (r3 == 0) goto L_0x00d8
                int r2 = r3.getCurrentPosition()     // Catch:{ Exception -> 0x00e1 }
                if (r2 <= 0) goto L_0x00b8
                int r3 = r8.f67772a     // Catch:{ Exception -> 0x00e1 }
                if (r2 < r3) goto L_0x00b8
                a6.b r9 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                b6.c r9 = r9.f67764f     // Catch:{ Exception -> 0x00e1 }
                long r3 = (long) r2     // Catch:{ Exception -> 0x00e1 }
                r9.f67860a = r3     // Catch:{ Exception -> 0x00e1 }
                r9.mo37212a(r3, r0)     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00d5
            L_0x00b8:
                if (r2 < 0) goto L_0x00ca
                int r0 = r8.f67772a     // Catch:{ Exception -> 0x00e1 }
                if (r2 >= r0) goto L_0x00ca
                a6.b r0 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                a6.a r1 = r0.f67766h     // Catch:{ Exception -> 0x00e1 }
                int r1 = r1.f67751c     // Catch:{ Exception -> 0x00e1 }
                if (r1 <= 0) goto L_0x00ca
                r0.mo37107f(r2)     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00d5
            L_0x00ca:
                a6.b r0 = p288a6.C23611b.this     // Catch:{ Exception -> 0x00e1 }
                android.os.Handler r0 = r0.f67762d     // Catch:{ Exception -> 0x00e1 }
                android.os.Message r9 = android.os.Message.obtain(r9)     // Catch:{ Exception -> 0x00e1 }
                r0.sendMessage(r9)     // Catch:{ Exception -> 0x00e1 }
            L_0x00d5:
                r8.f67772a = r2     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00e5
            L_0x00d8:
                b6.c r9 = r2.f67764f     // Catch:{ Exception -> 0x00e1 }
                r9.f67860a = r0     // Catch:{ Exception -> 0x00e1 }
                r9.mo37212a(r0, r0)     // Catch:{ Exception -> 0x00e1 }
                goto L_0x00e5
            L_0x00e0:
                return
            L_0x00e1:
                r9 = move-exception
                r9.toString()
            L_0x00e5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p288a6.C23611b.C23613b.handleMessage(android.os.Message):void");
        }
    }

    public C23611b(Context context) {
        this.f67760b = context;
        this.f67759a = (Vibrator) context.getSystemService("vibrator");
        C22866b bVar = new C22866b(this.f67760b);
        this.f67761c = bVar;
        bVar.start();
    }

    /* renamed from: a */
    public void mo37102a(String str, int i, int i2, int i3, int i4) {
        try {
            int i5 = new JSONObject(str).getJSONObject("Metadata").getInt("Version");
            if (i5 == 1) {
                mo37109h();
                this.f67761c.mo36029a(new C22865a(str, i, i2, i3, i4));
            } else if (i5 == 2) {
                mo37108g();
                String k = C26424f.m34029k(C26424f.m34028j(str));
                C26421e eVar = new C26421e();
                this.f67767i = eVar;
                synchronized (eVar) {
                    if (i2 >= 0) {
                        eVar.f73687a = i2;
                    }
                    if (i3 >= 0 && i3 <= 255) {
                        eVar.f73689c = i3;
                    }
                }
                C26421e eVar2 = this.f67767i;
                C26654a f = C26424f.m34024f(k);
                eVar2.mo53416a(i, i2, f != null ? f.getDuration() : 0, new C23612a(k, i3, i4));
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public void mo37103b(boolean z) {
        if (z) {
            this.f67766h.f67751c = Integer.MAX_VALUE;
        } else {
            this.f67766h.f67751c = 0;
        }
    }

    /* renamed from: c */
    public void mo37104c() {
        this.f67766h.mo37100b();
        mo37108g();
        mo37109h();
    }

    /* renamed from: d */
    public void mo37105d(File file, int i, int i2, C23674a aVar) {
        this.f67766h.mo37100b();
        C23610a aVar2 = this.f67766h;
        aVar2.f67758j = file;
        aVar2.f67752d = i;
        aVar2.f67753e = i2;
        aVar2.f67755g = aVar;
    }

    /* renamed from: e */
    public final void mo37106e(String str, int i, int i2, C23674a aVar) {
        this.f67765g = aVar;
        HandlerThread handlerThread = new HandlerThread("Richtap-Sync");
        this.f67763e = handlerThread;
        handlerThread.start();
        C23613b bVar = new C23613b(this.f67763e.getLooper(), i, i2);
        this.f67762d = bVar;
        C23676c cVar = new C23676c(bVar, str, this.f67766h);
        this.f67764f = cVar;
        C23674a aVar2 = this.f67766h.f67755g;
        if (aVar2 != null) {
            if (aVar2.getCurrentPosition() < 0) {
                this.f67764f.f67860a = (long) this.f67766h.f67755g.getCurrentPosition();
                this.f67764f.mo37212a((long) this.f67766h.f67755g.getCurrentPosition(), (long) this.f67766h.f67756h);
                return;
            }
            C23676c cVar2 = this.f67764f;
            long j = (long) this.f67766h.f67756h;
            cVar2.f67860a = j;
            cVar2.mo37212a(j, j);
        } else if (aVar != null) {
            cVar.f67860a = (long) aVar.getCurrentPosition();
            this.f67764f.mo37212a((long) aVar.getCurrentPosition(), 0);
        } else {
            synchronized (cVar) {
                cVar.mo37214c(0, 0);
            }
            cVar.mo37213b();
        }
    }

    /* renamed from: f */
    public boolean mo37107f(int i) {
        if (C23610a.m28204a(this.f67766h.f67754f) && i >= 0 && i <= this.f67766h.f67754f.getDuration()) {
            mo37108g();
            mo37109h();
            C23610a aVar = this.f67766h;
            aVar.f67756h = i;
            String c = C26424f.m34021c(aVar.f67749a, i);
            if (c == null || "".equals(c)) {
                C23610a aVar2 = this.f67766h;
                if (aVar2.f67751c > 0) {
                    String str = aVar2.f67749a;
                    aVar2.f67756h = 0;
                    c = str;
                } else {
                    aVar2.f67757i = 9;
                }
            }
            C23610a aVar3 = this.f67766h;
            if (6 != aVar3.f67757i) {
                return true;
            }
            aVar3.f67750b = SystemClock.elapsedRealtime();
            C23610a aVar4 = this.f67766h;
            C23674a aVar5 = aVar4.f67755g;
            if (aVar5 != null) {
                mo37106e(aVar4.f67749a, aVar4.f67752d, aVar4.f67753e, aVar5);
            } else {
                mo37106e(c, aVar4.f67752d, aVar4.f67753e, (C23674a) null);
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo37108g() {
        HandlerThread handlerThread = this.f67763e;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f67763e = null;
            this.f67762d = null;
            this.f67764f = null;
        }
        C26421e eVar = this.f67767i;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    HandlerThread handlerThread2 = eVar.f73691e;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        eVar.f73691e = null;
                    }
                    eVar.f73692f = null;
                } catch (Throwable unused) {
                }
            }
            this.f67767i = null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    public final void mo37109h() {
        /*
            r6 = this;
            w5.b r0 = r6.f67761c
            if (r0 == 0) goto L_0x0038
            java.lang.Object r1 = r0.f65739d
            monitor-enter(r1)
            java.lang.Object r2 = r0.f65740e     // Catch:{ Exception -> 0x0034 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0034 }
            java.util.List<w5.a> r3 = r0.f65743h     // Catch:{ all -> 0x002f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x0017
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0038
        L_0x0017:
            java.util.List<w5.a> r3 = r0.f65743h     // Catch:{ all -> 0x002f }
            r4 = 0
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x002f }
            w5.a r3 = (p392w5.C22865a) r3     // Catch:{ all -> 0x002f }
            boolean r5 = r3.f65736g     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x0028
            r3.f65736g = r4     // Catch:{ all -> 0x002f }
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.f65739d     // Catch:{ Exception -> 0x0034 }
            r0.notify()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0034
        L_0x002f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ Exception -> 0x0034 }
        L_0x0032:
            r0 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0038
        L_0x0036:
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0038:
            android.os.Vibrator r0 = r6.f67759a
            r0.cancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p288a6.C23611b.mo37109h():void");
    }

    public void pause() {
        if (6 == this.f67766h.f67757i) {
            mo37108g();
            mo37109h();
            C23610a aVar = this.f67766h;
            aVar.f67757i = 7;
            if (!C23610a.m28204a(aVar.f67754f)) {
                this.f67766h.f67756h = 0;
                return;
            }
            C23610a aVar2 = this.f67766h;
            C23674a aVar3 = aVar2.f67755g;
            if (aVar3 != null) {
                aVar2.f67756h = aVar3.getCurrentPosition();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C23610a aVar4 = this.f67766h;
            int i = (int) (elapsedRealtime - aVar4.f67750b);
            if (i < 0) {
                aVar4.f67756h = 0;
            } else {
                aVar4.f67756h += i;
            }
        }
    }

    public boolean prepare() {
        C23610a aVar = this.f67766h;
        File file = aVar.f67758j;
        if (file != null) {
            aVar.f67749a = C26424f.m34026h(file);
        }
        if (1 == C26424f.m34027i(this.f67766h.f67749a)) {
            C23610a aVar2 = this.f67766h;
            aVar2.f67749a = C26424f.m34019a(aVar2.f67749a);
        }
        C23610a aVar3 = this.f67766h;
        aVar3.f67749a = C26424f.m34028j(aVar3.f67749a);
        C23610a aVar4 = this.f67766h;
        aVar4.f67749a = C26424f.m34029k(aVar4.f67749a);
        C26534c g = C26424f.m34025g(this.f67766h.f67749a);
        if (!C23610a.m28204a(g)) {
            this.f67766h.mo37100b();
            return false;
        }
        this.f67766h.f67754f = g;
        return true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void release() {
        /*
            r5 = this;
            a6.a r0 = r5.f67766h
            r0.mo37100b()
            r5.mo37108g()
            w5.b r0 = r5.f67761c
            if (r0 == 0) goto L_0x0031
            r1 = 1
            r0.f65742g = r1
            java.lang.Object r1 = r0.f65739d
            monitor-enter(r1)
            r2 = 0
            java.lang.Object r3 = r0.f65740e     // Catch:{ Exception -> 0x002b }
            monitor-enter(r3)     // Catch:{ Exception -> 0x002b }
            java.util.List<w5.a> r4 = r0.f65743h     // Catch:{ all -> 0x0026 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x0026 }
            r4.clear()     // Catch:{ all -> 0x0026 }
            r0.f65743h = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.f65739d     // Catch:{ Exception -> 0x002b }
            r0.notify()     // Catch:{ Exception -> 0x002b }
            goto L_0x002b
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ Exception -> 0x002b }
        L_0x0029:
            r0 = move-exception
            goto L_0x002f
        L_0x002b:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r5.f67761c = r2
            goto L_0x0031
        L_0x002f:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p288a6.C23611b.release():void");
    }

    public boolean start() {
        C23610a aVar = this.f67766h;
        if (6 == aVar.f67757i || !C23610a.m28204a(aVar.f67754f)) {
            return false;
        }
        C23610a aVar2 = this.f67766h;
        if (aVar2.f67756h < 0) {
            return false;
        }
        if (9 == aVar2.f67757i) {
            aVar2.f67756h = 0;
        }
        String c = C26424f.m34021c(aVar2.f67749a, aVar2.f67756h);
        if (c == null || "".equals(c)) {
            this.f67766h.f67757i = 9;
            return false;
        }
        this.f67766h.f67750b = SystemClock.elapsedRealtime();
        C23610a aVar3 = this.f67766h;
        aVar3.f67757i = 6;
        C23674a aVar4 = aVar3.f67755g;
        if (aVar4 != null) {
            mo37106e(aVar3.f67749a, aVar3.f67752d, aVar3.f67753e, aVar4);
            return true;
        }
        mo37106e(c, aVar3.f67752d, aVar3.f67753e, (C23674a) null);
        return true;
    }
}
