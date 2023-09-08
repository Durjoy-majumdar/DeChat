package p1105d5;

import android.content.Context;
import gy3.C8480h;
import p632o5.C109951c;
import p632o5.C109953e;
import p632o5.C109956h;
import p632o5.C109959i;
import p864t5.C64203g;
import wx3.C15601d;

/* renamed from: d5.f */
public interface C106994f {

    /* renamed from: d5.f$a */
    public static final class C106995a {

        /* renamed from: a */
        public final Context f320263a;

        /* renamed from: b */
        public C109951c f320264b = C109951c.f328954m;

        /* renamed from: c */
        public C106989b f320265c = null;

        /* renamed from: d */
        public C64203g f320266d = new C64203g(false, false, false, 7, (C8480h) null);

        /* renamed from: e */
        public double f320267e;

        /* renamed from: f */
        public double f320268f;

        /* renamed from: g */
        public boolean f320269g;

        /* renamed from: h */
        public boolean f320270h;

        /* JADX WARNING: Removed duplicated region for block: B:13:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C106995a(android.content.Context r8) {
            /*
                r7 = this;
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r8, r0)
                r7.<init>()
                android.content.Context r8 = r8.getApplicationContext()
                java.lang.String r0 = "context.applicationContext"
                gy3.C87412m.m108593f(r8, r0)
                r7.f320263a = r8
                o5.c r0 = p632o5.C109951c.f328954m
                r7.f320264b = r0
                r0 = 0
                r7.f320265c = r0
                t5.g r0 = new t5.g
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 7
                r6 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f320266d = r0
                java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
                java.lang.Object r8 = p385u2.C111105a.m151502d(r8, r0)     // Catch:{ Exception -> 0x005f }
                if (r8 == 0) goto L_0x003d
                android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch:{ Exception -> 0x005f }
                boolean r8 = r8.isLowRamDevice()     // Catch:{ Exception -> 0x005f }
                if (r8 == 0) goto L_0x005f
                r0 = 4594572339843380019(0x3fc3333333333333, double:0.15)
                goto L_0x0064
            L_0x003d:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
                r8.<init>()     // Catch:{ Exception -> 0x005f }
                java.lang.String r0 = "System service of type "
                r8.append(r0)     // Catch:{ Exception -> 0x005f }
                java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
                r8.append(r0)     // Catch:{ Exception -> 0x005f }
                java.lang.String r0 = " was not found."
                r8.append(r0)     // Catch:{ Exception -> 0x005f }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x005f }
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x005f }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x005f }
                r0.<init>(r8)     // Catch:{ Exception -> 0x005f }
                throw r0     // Catch:{ Exception -> 0x005f }
            L_0x005f:
                r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            L_0x0064:
                r7.f320267e = r0
                int r8 = android.os.Build.VERSION.SDK_INT
                r0 = 24
                if (r8 < r0) goto L_0x006f
                r0 = 0
                goto L_0x0071
            L_0x006f:
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            L_0x0071:
                r7.f320268f = r0
                r8 = 1
                r7.f320269g = r8
                r7.f320270h = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1105d5.C106994f.C106995a.<init>(android.content.Context):void");
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [e5.d] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p1105d5.C106994f mo157446a() {
            /*
                r17 = this;
                r0 = r17
                android.content.Context r1 = r0.f320263a
                double r2 = r0.f320267e
                java.lang.String r4 = "context"
                gy3.C87412m.m108594g(r1, r4)
                java.lang.Class<android.app.ActivityManager> r4 = android.app.ActivityManager.class
                java.lang.Object r4 = p385u2.C111105a.m151502d(r1, r4)     // Catch:{ Exception -> 0x0051 }
                if (r4 == 0) goto L_0x002f
                android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ Exception -> 0x0051 }
                android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch:{ Exception -> 0x0051 }
                int r1 = r1.flags     // Catch:{ Exception -> 0x0051 }
                r5 = 1048576(0x100000, float:1.469368E-39)
                r1 = r1 & r5
                if (r1 == 0) goto L_0x0022
                r1 = 1
                goto L_0x0023
            L_0x0022:
                r1 = 0
            L_0x0023:
                if (r1 == 0) goto L_0x002a
                int r1 = r4.getLargeMemoryClass()     // Catch:{ Exception -> 0x0051 }
                goto L_0x0053
            L_0x002a:
                int r1 = r4.getMemoryClass()     // Catch:{ Exception -> 0x0051 }
                goto L_0x0053
            L_0x002f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0051 }
                r1.<init>()     // Catch:{ Exception -> 0x0051 }
                java.lang.String r4 = "System service of type "
                r1.append(r4)     // Catch:{ Exception -> 0x0051 }
                java.lang.Class<android.app.ActivityManager> r4 = android.app.ActivityManager.class
                r1.append(r4)     // Catch:{ Exception -> 0x0051 }
                java.lang.String r4 = " was not found."
                r1.append(r4)     // Catch:{ Exception -> 0x0051 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0051 }
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0051 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0051 }
                r4.<init>(r1)     // Catch:{ Exception -> 0x0051 }
                throw r4     // Catch:{ Exception -> 0x0051 }
            L_0x0051:
                r1 = 256(0x100, float:3.59E-43)
            L_0x0053:
                double r4 = (double) r1
                double r2 = r2 * r4
                r1 = 1024(0x400, float:1.435E-42)
                double r4 = (double) r1
                double r2 = r2 * r4
                double r2 = r2 * r4
                long r1 = (long) r2
                boolean r3 = r0.f320269g
                if (r3 == 0) goto L_0x0065
                double r3 = r0.f320268f
                goto L_0x0067
            L_0x0065:
                r3 = 0
            L_0x0067:
                double r5 = (double) r1
                double r3 = r3 * r5
                int r6 = (int) r3
                long r3 = (long) r6
                long r1 = r1 - r3
                int r2 = (int) r1
                if (r6 != 0) goto L_0x0076
                e5.d r1 = new e5.d
                r1.<init>()
                goto L_0x0081
            L_0x0076:
                e5.f r1 = new e5.f
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 6
                r11 = 0
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11)
            L_0x0081:
                boolean r3 = r0.f320270h
                r4 = 0
                if (r3 == 0) goto L_0x008c
                m5.p r3 = new m5.p
                r3.<init>(r4)
                goto L_0x008e
            L_0x008c:
                m5.d r3 = p1132m5.C109504d.f327745a
            L_0x008e:
                boolean r5 = r0.f320269g
                if (r5 == 0) goto L_0x0098
                e5.g r5 = new e5.g
                r5.<init>(r3, r1, r4)
                goto L_0x009a
            L_0x0098:
                e5.e r5 = p1106e5.C107232e.f320841a
            L_0x009a:
                int r6 = p1132m5.C109527r.f327807a
                if (r2 <= 0) goto L_0x00a4
                m5.o r6 = new m5.o
                r6.<init>(r3, r5, r2, r4)
                goto L_0x00b0
            L_0x00a4:
                boolean r2 = r3 instanceof p1132m5.C109523p
                if (r2 == 0) goto L_0x00ae
                m5.e r6 = new m5.e
                r6.<init>(r3)
                goto L_0x00b0
            L_0x00ae:
                m5.b r6 = p1132m5.C109502b.f327743b
            L_0x00b0:
                m5.n r11 = new m5.n
                r11.<init>(r6, r3, r5, r1)
                d5.h r1 = new d5.h
                android.content.Context r8 = r0.f320263a
                o5.c r9 = r0.f320264b
                e5.a r10 = r11.f327789d
                d5.e r2 = new d5.e
                r2.<init>(r0)
                d24.r r3 = p864t5.C110905d.f331711a
                rx3.g r2 = rx3.C36568h.m40985a(r2)
                t5.d$$a r12 = new t5.d$$a
                r12.<init>(r2)
                d5.c$b r13 = p1105d5.C106991c.C106993b.f320261a
                d5.b r2 = r0.f320265c
                if (r2 != 0) goto L_0x00da
                d5.b r2 = new d5.b
                sx3.f0 r3 = sx3.C64186f0.f181907d
                r2.<init>(r3, r3, r3, r3)
            L_0x00da:
                r14 = r2
                t5.g r15 = r0.f320266d
                r16 = 0
                r7 = r1
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p1105d5.C106994f.C106995a.mo157446a():d5.f");
        }
    }

    /* renamed from: a */
    Object mo157443a(C109956h hVar, C15601d<? super C109959i> dVar);

    /* renamed from: b */
    C109953e mo157444b(C109956h hVar);

    /* renamed from: c */
    C109951c mo157445c();
}
