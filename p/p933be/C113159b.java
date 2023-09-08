package p933be;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.batterycanary.stats.C114572i;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p1177ce.C113314g;
import p723vf.C118672d;
import p981ie.C117159b;

/* renamed from: be.b */
public final class C113159b {

    /* renamed from: i */
    public static volatile C113159b f338581i;

    /* renamed from: j */
    public static long f338582j;

    /* renamed from: a */
    public final Context f338583a;

    /* renamed from: b */
    public final List<C113164d> f338584b = new LinkedList();

    /* renamed from: c */
    public final Handler f338585c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final C113162b f338586d = new C113162b();

    /* renamed from: e */
    public boolean f338587e = true;

    /* renamed from: f */
    public long f338588f;

    /* renamed from: g */
    public long f338589g;

    /* renamed from: h */
    public C113314g f338590h;

    /* renamed from: be.b$a */
    public class C113160a extends BroadcastReceiver {

        /* renamed from: a */
        public long f338591a = -1;

        /* renamed from: be.b$a$a */
        public class C113161a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Intent f338593d;

            public C113161a(Intent intent) {
                this.f338593d = intent;
            }

            public void run() {
                C114572i iVar;
                C114572i iVar2;
                Class cls = C114572i.class;
                if (this.f338593d.getIntExtra("status", -1) == 5) {
                    C113159b bVar = C113159b.this;
                    bVar.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar.mo165666c();
                    } else {
                        bVar.f338585c.post(new C113171g(bVar));
                    }
                } else {
                    int f = C117159b.m165205f(C113159b.this.f338583a);
                    if (f >= 0 && f <= 1000) {
                        long j = (long) f;
                        if (Math.abs(j - C113159b.this.f338588f) >= 5) {
                            C113159b bVar2 = C113159b.this;
                            bVar2.f338588f = j;
                            C113314g gVar = bVar2.f338590h;
                            if (!(gVar == null || (iVar2 = (C114572i) gVar.mo165880e(cls)) == null)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("battery-change", Boolean.TRUE);
                                hashMap.put("battery-pct", Integer.valueOf(f));
                                iVar2.mo173741i("BATTERY_STAT", 0, hashMap);
                            }
                            C113159b bVar3 = C113159b.this;
                            bVar3.getClass();
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                bVar3.mo165667d(f);
                            } else {
                                bVar3.f338585c.post(new C113170f(bVar3, f));
                            }
                        }
                    }
                    try {
                        int intExtra = this.f338593d.getIntExtra("temperature", -1);
                        if (intExtra >= 0 && f <= 1000) {
                            long j2 = (long) intExtra;
                            if (Math.abs(j2 - C113159b.this.f338589g) >= 15) {
                                C113159b bVar4 = C113159b.this;
                                bVar4.f338589g = j2;
                                C113314g gVar2 = bVar4.f338590h;
                                if (!(gVar2 == null || (iVar = (C114572i) gVar2.mo165880e(cls)) == null)) {
                                    int f2 = C117159b.m165205f(iVar.f349668a.mo165879a());
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("battery-temp", Integer.valueOf(intExtra));
                                    hashMap2.put("battery-pct", Integer.valueOf(f2));
                                    iVar.mo173741i("BATTERY_STAT", 0, hashMap2);
                                }
                                C113159b bVar5 = C113159b.this;
                                bVar5.getClass();
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    bVar5.mo165669f(intExtra);
                                } else {
                                    bVar5.f338585c.post(new C113172h(bVar5, intExtra));
                                }
                            }
                        }
                    } catch (Exception e) {
                        C118672d.m167356f("Matrix.battery.LifeCycle", "get EXTRA_TEMPERATURE failed: " + e.getMessage(), new Object[0]);
                    }
                }
            }
        }

        public C113160a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
            r14 = true;
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d4, code lost:
            if (r4 == -1) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d6, code lost:
            r5 = r13.f338592b.f338590h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00da, code lost:
            if (r5 == null) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dc, code lost:
            r5 = (com.tencent.matrix.batterycanary.stats.C114572i) r5.mo165880e(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e2, code lost:
            if (r5 == null) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e6, code lost:
            if (r5.f343367e == null) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e8, code lost:
            r6 = new com.tencent.matrix.batterycanary.stats.BatteryRecord.DevStatRecord();
            r6.f343327f = r4;
            r5.mo173742j(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f2, code lost:
            if (r14 == false) goto L_0x0111;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f4, code lost:
            r14 = r13.f338592b;
            r14.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0101, code lost:
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L_0x0107;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0103, code lost:
            r14.mo165670g(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
            r14.f338585c.post(new p933be.C113167c(r14, r15));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0111, code lost:
            if (r2 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0113, code lost:
            r14 = r13.f338592b.f338590h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
            if (r14 == null) goto L_0x014b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0119, code lost:
            r14 = (com.tencent.matrix.batterycanary.stats.C114572i) r14.mo165880e(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x011f, code lost:
            if (r14 == null) goto L_0x014b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0121, code lost:
            r0 = r1.equals("android.intent.action.BATTERY_LOW");
            r1 = p981ie.C117159b.m165205f(r14.f349668a.mo165879a());
            r2 = new java.util.HashMap();
            r2.put("battery-low", java.lang.Boolean.valueOf(r0));
            r2.put("battery-pct", java.lang.Integer.valueOf(r1));
            r14.mo173741i("BATTERY_STAT", 0, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x014b, code lost:
            r14 = r13.f338592b;
            r14.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0158, code lost:
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L_0x015e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x015a, code lost:
            r14.mo165668e(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x015e, code lost:
            r14.f338585c.post(new p933be.C113169e(r14, r15));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r14, android.content.Intent r15) {
            /*
                r13 = this;
                java.lang.Class<com.tencent.matrix.batterycanary.stats.i> r0 = com.tencent.matrix.batterycanary.stats.C114572i.class
                java.lang.String r1 = r15.getAction()
                if (r1 == 0) goto L_0x0168
                java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
                boolean r2 = r1.equals(r2)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0042
                be.b r14 = p933be.C113159b.this
                ce.g r14 = r14.f338590h
                if (r14 == 0) goto L_0x0168
                long r0 = java.lang.System.currentTimeMillis()
                long r5 = r13.f338591a
                r7 = 0
                int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r14 <= 0) goto L_0x002e
                long r5 = r0 - r5
                r7 = 60000(0xea60, double:2.9644E-319)
                int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r14 >= 0) goto L_0x002e
                r3 = 1
            L_0x002e:
                if (r3 != 0) goto L_0x0168
                r13.f338591a = r0
                be.b r14 = p933be.C113159b.this
                ce.g r14 = r14.f338590h
                android.os.Handler r14 = r14.f339059f
                be.b$a$a r0 = new be.b$a$a
                r0.<init>(r15)
                r14.post(r0)
                goto L_0x0168
            L_0x0042:
                int r2 = r1.hashCode()
                r5 = 7
                r6 = 6
                r7 = 5
                r8 = 4
                java.lang.String r9 = "android.intent.action.BATTERY_LOW"
                r10 = 3
                r11 = 2
                r12 = -1
                switch(r2) {
                    case -2128145023: goto L_0x009f;
                    case -1980154005: goto L_0x0094;
                    case -1886648615: goto L_0x0089;
                    case -1454123155: goto L_0x007e;
                    case 490310653: goto L_0x0075;
                    case 870701415: goto L_0x006a;
                    case 1019184907: goto L_0x005f;
                    case 1779291251: goto L_0x0054;
                    default: goto L_0x0052;
                }
            L_0x0052:
                r2 = -1
                goto L_0x00a9
            L_0x0054:
                java.lang.String r2 = "android.os.action.POWER_SAVE_MODE_CHANGED"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x005d
                goto L_0x0052
            L_0x005d:
                r2 = 7
                goto L_0x00a9
            L_0x005f:
                java.lang.String r2 = "android.intent.action.ACTION_POWER_CONNECTED"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0068
                goto L_0x0052
            L_0x0068:
                r2 = 6
                goto L_0x00a9
            L_0x006a:
                java.lang.String r2 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0073
                goto L_0x0052
            L_0x0073:
                r2 = 5
                goto L_0x00a9
            L_0x0075:
                boolean r2 = r1.equals(r9)
                if (r2 != 0) goto L_0x007c
                goto L_0x0052
            L_0x007c:
                r2 = 4
                goto L_0x00a9
            L_0x007e:
                java.lang.String r2 = "android.intent.action.SCREEN_ON"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0087
                goto L_0x0052
            L_0x0087:
                r2 = 3
                goto L_0x00a9
            L_0x0089:
                java.lang.String r2 = "android.intent.action.ACTION_POWER_DISCONNECTED"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0092
                goto L_0x0052
            L_0x0092:
                r2 = 2
                goto L_0x00a9
            L_0x0094:
                java.lang.String r2 = "android.intent.action.BATTERY_OKAY"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x009d
                goto L_0x0052
            L_0x009d:
                r2 = 1
                goto L_0x00a9
            L_0x009f:
                java.lang.String r2 = "android.intent.action.SCREEN_OFF"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x00a8
                goto L_0x0052
            L_0x00a8:
                r2 = 0
            L_0x00a9:
                switch(r2) {
                    case 0: goto L_0x00d1;
                    case 1: goto L_0x00ce;
                    case 2: goto L_0x00ca;
                    case 3: goto L_0x00c6;
                    case 4: goto L_0x00ce;
                    case 5: goto L_0x00bb;
                    case 6: goto L_0x00b8;
                    case 7: goto L_0x00b0;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                r14 = 0
                r2 = 0
            L_0x00ae:
                r4 = -1
                goto L_0x00d4
            L_0x00b0:
                boolean r14 = p981ie.C117159b.m165220u(r14)
                if (r14 == 0) goto L_0x00b7
                r6 = 4
            L_0x00b7:
                r4 = r6
            L_0x00b8:
                r14 = 1
                r2 = 0
                goto L_0x00d4
            L_0x00bb:
                boolean r14 = p981ie.C117159b.m165219t(r14)
                if (r14 == 0) goto L_0x00c2
                goto L_0x00c4
            L_0x00c2:
                r5 = 8
            L_0x00c4:
                r4 = r5
                goto L_0x00b8
            L_0x00c6:
                r14 = 1
                r2 = 0
                r4 = 5
                goto L_0x00d4
            L_0x00ca:
                r14 = 1
                r2 = 0
                r4 = 2
                goto L_0x00d4
            L_0x00ce:
                r14 = 1
                r2 = 1
                goto L_0x00ae
            L_0x00d1:
                r14 = 1
                r2 = 0
                r4 = 3
            L_0x00d4:
                if (r4 == r12) goto L_0x00f2
                be.b r5 = p933be.C113159b.this
                ce.g r5 = r5.f338590h
                if (r5 == 0) goto L_0x00f2
                com.tencent.matrix.batterycanary.monitor.feature.k0 r5 = r5.mo165880e(r0)
                com.tencent.matrix.batterycanary.stats.i r5 = (com.tencent.matrix.batterycanary.stats.C114572i) r5
                if (r5 == 0) goto L_0x00f2
                com.tencent.matrix.batterycanary.stats.h r6 = r5.f343367e
                if (r6 == 0) goto L_0x00f2
                com.tencent.matrix.batterycanary.stats.BatteryRecord$DevStatRecord r6 = new com.tencent.matrix.batterycanary.stats.BatteryRecord$DevStatRecord
                r6.<init>()
                r6.f343327f = r4
                r5.mo173742j(r6)
            L_0x00f2:
                if (r14 == 0) goto L_0x0111
                be.b r14 = p933be.C113159b.this
                r14.getClass()
                android.os.Looper r4 = android.os.Looper.myLooper()
                android.os.Looper r5 = android.os.Looper.getMainLooper()
                if (r4 != r5) goto L_0x0107
                r14.mo165670g(r15)
                goto L_0x0111
            L_0x0107:
                android.os.Handler r4 = r14.f338585c
                be.c r5 = new be.c
                r5.<init>(r14, r15)
                r4.post(r5)
            L_0x0111:
                if (r2 == 0) goto L_0x0168
                be.b r14 = p933be.C113159b.this
                ce.g r14 = r14.f338590h
                if (r14 == 0) goto L_0x014b
                com.tencent.matrix.batterycanary.monitor.feature.k0 r14 = r14.mo165880e(r0)
                com.tencent.matrix.batterycanary.stats.i r14 = (com.tencent.matrix.batterycanary.stats.C114572i) r14
                if (r14 == 0) goto L_0x014b
                boolean r0 = r1.equals(r9)
                ce.g r1 = r14.f349668a
                android.content.Context r1 = r1.mo165879a()
                int r1 = p981ie.C117159b.m165205f(r1)
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                java.lang.String r4 = "battery-low"
                r2.put(r4, r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                java.lang.String r1 = "battery-pct"
                r2.put(r1, r0)
                java.lang.String r0 = "BATTERY_STAT"
                r14.mo173741i(r0, r3, r2)
            L_0x014b:
                be.b r14 = p933be.C113159b.this
                r14.getClass()
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                if (r0 != r1) goto L_0x015e
                r14.mo165668e(r15)
                goto L_0x0168
            L_0x015e:
                android.os.Handler r0 = r14.f338585c
                be.e r1 = new be.e
                r1.<init>(r14, r15)
                r0.post(r1)
            L_0x0168:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p933be.C113159b.C113160a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: be.b$b */
    public final class C113162b implements Runnable {

        /* renamed from: d */
        public long f338595d;

        public C113162b() {
        }

        public void run() {
            C113159b bVar = C113159b.this;
            if (!bVar.f338587e) {
                if (!C117159b.m165218s(bVar.f338583a)) {
                    C113159b bVar2 = C113159b.this;
                    long j = this.f338595d;
                    bVar2.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar2.mo165665b(j);
                    } else {
                        bVar2.f338585c.post(new C113168d(bVar2, j));
                    }
                }
                long j2 = this.f338595d;
                if (j2 <= 300000) {
                    Handler handler = C113159b.this.f338585c;
                    this.f338595d = j2 + 300000;
                    handler.postDelayed(this, 300000);
                } else if (j2 <= 600000) {
                    Handler handler2 = C113159b.this.f338585c;
                    this.f338595d = j2 + 1200000;
                    handler2.postDelayed(this, 1200000);
                }
            }
        }
    }

    /* renamed from: be.b$c */
    public static final class C113163c {

        /* renamed from: a */
        public C113314g f338597a;

        /* renamed from: b */
        public final Context f338598b;

        public C113163c(Context context) {
            this.f338598b = context;
        }

        /* renamed from: a */
        public long mo165676a() {
            if (!mo165679d() && C113159b.f338582j > 0) {
                return SystemClock.uptimeMillis() - C113159b.f338582j;
            }
            return 0;
        }

        /* renamed from: b */
        public int mo165677b() {
            return C117159b.m165205f(this.f338598b);
        }

        /* renamed from: c */
        public boolean mo165678c() {
            return C117159b.m165218s(this.f338598b);
        }

        /* renamed from: d */
        public boolean mo165679d() {
            C113314g gVar = this.f338597a;
            return gVar == null || gVar.f339064n;
        }

        /* renamed from: e */
        public boolean mo165680e() {
            Intent g = C117159b.m165206g(this.f338598b);
            if (g != null) {
                g.getBooleanExtra("android.intent.action.BATTERY_LOW", false);
            }
            return false;
        }

        public String toString() {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append("BatteryState{fg=");
            sb.append(mo165679d());
            sb.append(", charge=");
            sb.append(mo165678c());
            sb.append(", screen=");
            try {
                PowerManager powerManager = (PowerManager) this.f338598b.getSystemService("power");
                if (powerManager != null) {
                    z = powerManager.isInteractive();
                    sb.append(z);
                    sb.append(", sysDoze=");
                    sb.append(C117159b.m165219t(this.f338598b));
                    sb.append(", appStandby=");
                    sb.append(C117159b.m165220u(this.f338598b));
                    sb.append(", bgMillis=");
                    sb.append(mo165676a());
                    sb.append('}');
                    return sb.toString();
                }
            } catch (Exception unused) {
            }
            z = false;
            sb.append(z);
            sb.append(", sysDoze=");
            sb.append(C117159b.m165219t(this.f338598b));
            sb.append(", appStandby=");
            sb.append(C117159b.m165220u(this.f338598b));
            sb.append(", bgMillis=");
            sb.append(mo165676a());
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: be.b$d */
    public interface C113164d {

        /* renamed from: be.b$d$a */
        public static class C113165a implements C113166b {

            /* renamed from: a */
            public final boolean f338599a;

            public C113165a(boolean z) {
                this.f338599a = z;
            }

            /* renamed from: a */
            public boolean mo165682a(String str) {
                throw new RuntimeException("Use #onStateChanged(BatteryState, String) instead");
            }

            /* renamed from: d */
            public boolean mo165684d(C113163c cVar, boolean z) {
                return !this.f338599a;
            }
        }

        /* renamed from: be.b$d$b */
        public interface C113166b extends C113164d {
            /* renamed from: b */
            boolean mo165685b(C113163c cVar, int i);

            /* renamed from: c */
            boolean mo165686c(C113163c cVar, int i);

            /* renamed from: d */
            boolean mo165684d(C113163c cVar, boolean z);

            /* renamed from: f */
            boolean mo165687f(C113163c cVar);

            /* renamed from: g */
            boolean mo165688g(C113163c cVar, String str);
        }

        @Deprecated
        /* renamed from: a */
        boolean mo165682a(String str);

        /* renamed from: e */
        boolean mo165683e(C113163c cVar, long j);
    }

    public C113159b(Context context) {
        if (context != null) {
            this.f338583a = context;
            Intent g = C117159b.m165206g(context);
            int i = -1;
            if (g != null) {
                int intExtra = g.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, -1);
                int intExtra2 = g.getIntExtra("scale", -1);
                if (intExtra2 > 0) {
                    i = (intExtra * 100) / intExtra2;
                }
            }
            this.f338588f = (long) i;
            this.f338589g = (long) C117159b.m165207h(context);
            return;
        }
        throw new IllegalStateException("Context should not be null");
    }

    /* renamed from: h */
    public static C113159b m154842h() {
        if (f338581i == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (f338581i == null) {
                    throw new IllegalStateException("Call #init() first!");
                }
            }
        }
        return f338581i;
    }

    /* renamed from: i */
    public static boolean m154843i() {
        boolean z = true;
        if (f338581i != null) {
            return true;
        }
        synchronized ("Matrix.battery.LifeCycle") {
            if (f338581i == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C113163c mo165664a() {
        C113163c cVar = new C113163c(this.f338583a);
        C113314g gVar = this.f338590h;
        if (gVar != null) {
            cVar.f338597a = gVar;
        }
        return cVar;
    }

    /* renamed from: b */
    public void mo165665b(long j) {
        C118672d.m167353c("Matrix.battery.LifeCycle", "onAppLowEnergy >> " + (j / 60000) + "min", new Object[0]);
        synchronized (this.f338584b) {
            C113163c a = mo165664a();
            for (C113164d next : this.f338584b) {
                if (next.mo165683e(a, j)) {
                    mo165671j(next);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo165666c() {
        C118672d.m167353c("Matrix.battery.LifeCycle", "dispatchBatteryFullCharged", new Object[0]);
        synchronized (this.f338584b) {
            C113163c a = mo165664a();
            for (C113164d next : this.f338584b) {
                if ((next instanceof C113164d.C113166b) && ((C113164d.C113166b) next).mo165687f(a)) {
                    mo165671j(next);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo165667d(int i) {
        C118672d.m167353c("Matrix.battery.LifeCycle", "onBatteryPowerChanged >> " + i + "%", new Object[0]);
        synchronized (this.f338584b) {
            C113163c a = mo165664a();
            for (C113164d next : this.f338584b) {
                if ((next instanceof C113164d.C113166b) && ((C113164d.C113166b) next).mo165686c(a, i)) {
                    mo165671j(next);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo165668e(Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.BATTERY_OKAY".equals(action) || "android.intent.action.BATTERY_LOW".equals(action)) {
            C118672d.m167353c("Matrix.battery.LifeCycle", "onBatteryStateChanged >> " + action, new Object[0]);
            synchronized (this.f338584b) {
                C113163c a = mo165664a();
                for (C113164d next : this.f338584b) {
                    if ((next instanceof C113164d.C113166b) && ((C113164d.C113166b) next).mo165684d(a, "android.intent.action.BATTERY_LOW".equals(action))) {
                        mo165671j(next);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Illegal battery state: " + action);
    }

    /* renamed from: f */
    public void mo165669f(int i) {
        C118672d.m167353c("Matrix.battery.LifeCycle", "onBatteryTemperatureChanged >> " + (((float) i) / 10.0f) + "°C", new Object[0]);
        synchronized (this.f338584b) {
            C113163c a = mo165664a();
            for (C113164d next : this.f338584b) {
                if ((next instanceof C113164d.C113166b) && ((C113164d.C113166b) next).mo165685b(a, i)) {
                    mo165671j(next);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo165670g(Intent intent) {
        C118672d.m167353c("Matrix.battery.LifeCycle", "onSateChanged >> " + intent.getAction(), new Object[0]);
        synchronized (this.f338584b) {
            C113163c a = mo165664a();
            for (C113164d next : this.f338584b) {
                if (next instanceof C113164d.C113166b) {
                    if (((C113164d.C113166b) next).mo165688g(a, intent.getAction())) {
                        mo165671j(next);
                    }
                } else if (next.mo165682a(intent.getAction())) {
                    mo165671j(next);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo165671j(C113164d dVar) {
        synchronized (this.f338584b) {
            ListIterator<C113164d> listIterator = this.f338584b.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next() == dVar) {
                    listIterator.remove();
                }
            }
        }
    }

    /* renamed from: k */
    public void mo165672k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        int i = Build.VERSION.SDK_INT;
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        if (i >= 23) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        this.f338583a.registerReceiver(new C113160a(), intentFilter);
    }
}
