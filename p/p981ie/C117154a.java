package p981ie;

import android.app.AlarmManager;
import android.app.PendingIntent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p981ie.C87710u;

/* renamed from: ie.a */
public class C117154a {

    /* renamed from: a */
    public static boolean f350992a;

    /* renamed from: b */
    public static C87710u f350993b = new C87710u("alarm", "android.app.IAlarmManager", new C117155a());

    /* renamed from: c */
    public static List<C117157c> f350994c = new ArrayList();

    /* renamed from: ie.a$a */
    public class C117155a implements C87710u.C87712b {
        /* renamed from: a */
        public Object mo122125a(Object obj, Method method, Object[] objArr) {
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo122126b(java.lang.reflect.Method r20, java.lang.Object[] r21) {
            /*
                r19 = this;
                r0 = r21
                java.lang.String r1 = "Matrix.battery.AlarmHooker"
                java.lang.String r2 = "onServiceMethodInvoke: method name %s"
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r5 = r20.getName()
                r6 = 0
                r4[r6] = r5
                p723vf.C118672d.m167355e(r1, r2, r4)
                java.lang.Class<ie.a> r1 = p981ie.C117154a.class
                java.lang.String r2 = r20.getName()
                java.lang.String r4 = "set"
                boolean r2 = r2.equals(r4)
                r4 = 2
                r5 = 3
                r7 = 0
                if (r2 != 0) goto L_0x010c
                java.lang.String r2 = r20.getName()
                java.lang.String r8 = "setRepeating"
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x010c
                java.lang.String r2 = r20.getName()
                java.lang.String r8 = "setInexactRepeating"
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x003e
                goto L_0x010c
            L_0x003e:
                java.lang.String r2 = r20.getName()
                java.lang.String r8 = "remove"
                boolean r2 = r2.equals(r8)
                if (r2 == 0) goto L_0x0441
                java.lang.String r2 = "Matrix.battery.AlarmHooker"
                if (r0 != 0) goto L_0x0057
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r3 = "createCancelArgs args null"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x00d6
            L_0x0057:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r8 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r5[r6] = r9
                java.lang.String r9 = android.os.Build.VERSION.CODENAME
                r5[r3] = r9
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r5[r4] = r8
                java.lang.String r8 = "createCancelArgs apiLevel:%d, codeName:%s, versionRelease:%s"
                p723vf.C118672d.m167353c(r2, r8, r5)
                int r5 = r0.length
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                r8[r6] = r9
                java.lang.String r9 = "createCancelArgsAccordingToArgsLength: length:%s"
                p723vf.C118672d.m167353c(r2, r9, r8)
                if (r5 == r3) goto L_0x00ae
                int r5 = r0.length
                if (r5 == r4) goto L_0x0092
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                java.lang.String r0 = "createCancelArgs2 args length invalid : %d"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x00d6
            L_0x0092:
                ie.a$b r4 = new ie.a$b
                r4.<init>(r7)
                r0 = r0[r6]
                if (r0 == 0) goto L_0x00a9
                boolean r5 = r0 instanceof android.app.PendingIntent
                if (r5 != 0) goto L_0x00a9
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createCancelArgs2 args idx 0 not PendingIntent, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x00d6
            L_0x00a9:
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r4.f350995a = r0
                goto L_0x00dc
            L_0x00ae:
                int r4 = r0.length
                if (r4 == r3) goto L_0x00c0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                java.lang.String r0 = "createCancelArgs1 args length invalid : %d"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x00d6
            L_0x00c0:
                ie.a$b r4 = new ie.a$b
                r4.<init>(r7)
                r0 = r0[r6]
                if (r0 == 0) goto L_0x00d8
                boolean r5 = r0 instanceof android.app.PendingIntent
                if (r5 != 0) goto L_0x00d8
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createCancelArgs1 args idx 0 not PendingIntent, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
            L_0x00d6:
                r4 = r7
                goto L_0x00dc
            L_0x00d8:
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r4.f350995a = r0
            L_0x00dc:
                if (r4 != 0) goto L_0x00e9
                java.lang.String r0 = "Matrix.battery.AlarmHooker"
                java.lang.String r1 = "dispatchCancel cancelArgs null"
                java.lang.Object[] r2 = new java.lang.Object[r6]
                p723vf.C118672d.m167356f(r0, r1, r2)
                goto L_0x0441
            L_0x00e9:
                monitor-enter(r1)
            L_0x00ea:
                java.util.List<ie.a$c> r0 = p981ie.C117154a.f350994c     // Catch:{ all -> 0x0109 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0109 }
                int r0 = r0.size()     // Catch:{ all -> 0x0109 }
                if (r6 >= r0) goto L_0x0106
                java.util.List<ie.a$c> r0 = p981ie.C117154a.f350994c     // Catch:{ all -> 0x0109 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0109 }
                java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0109 }
                ie.a$c r0 = (p981ie.C117154a.C117157c) r0     // Catch:{ all -> 0x0109 }
                android.app.PendingIntent r2 = r4.f350995a     // Catch:{ all -> 0x0109 }
                r0.mo173650b(r2, r7)     // Catch:{ all -> 0x0109 }
                int r6 = r6 + 1
                goto L_0x00ea
            L_0x0106:
                monitor-exit(r1)     // Catch:{ all -> 0x0109 }
                goto L_0x0441
            L_0x0109:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0109 }
                throw r0
            L_0x010c:
                java.lang.String r2 = "Matrix.battery.AlarmHooker"
                if (r0 != 0) goto L_0x0119
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r3 = "createSetArgs args null"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0406
            L_0x0119:
                java.lang.Object[] r8 = new java.lang.Object[r5]
                int r9 = android.os.Build.VERSION.SDK_INT
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r8[r6] = r10
                java.lang.String r10 = android.os.Build.VERSION.CODENAME
                r8[r3] = r10
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r8[r4] = r9
                java.lang.String r9 = "createSetArgs apiLevel:%d, codeName:%s, versionRelease:%s"
                p723vf.C118672d.m167353c(r2, r9, r8)
                int r8 = r0.length
                java.lang.Object[] r9 = new java.lang.Object[r3]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
                r9[r6] = r10
                java.lang.String r10 = "createSetArgsAccordingToArgsLength: length:%s"
                p723vf.C118672d.m167353c(r2, r10, r9)
                java.lang.String r9 = "createSetArgs args idx 1 not Long, %s"
                java.lang.String r10 = "createSetArgs args idx 0 not Integer, %s"
                java.lang.String r11 = "createSetArgs args length invalid : %d"
                if (r8 == r5) goto L_0x03ae
                java.lang.String r12 = "createSetArgs args idx 2 not Long, %s"
                r13 = 4
                if (r8 == r13) goto L_0x033a
                r14 = 7
                java.lang.String r15 = "createSetArgs args idx 3 not Long, %s"
                r13 = 6
                if (r8 == r13) goto L_0x02ab
                if (r8 == r14) goto L_0x02ab
                r14 = 8
                r16 = 5
                if (r8 == r14) goto L_0x0206
                int r8 = r0.length
                r9 = 11
                if (r8 == r9) goto L_0x016e
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                p723vf.C118672d.m167356f(r2, r11, r3)
                goto L_0x0406
            L_0x016e:
                ie.a$d r8 = new ie.a$d
                r8.<init>(r7)
                r9 = r0[r3]
                boolean r10 = r9 instanceof java.lang.Integer
                if (r10 != 0) goto L_0x0184
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r9
                java.lang.String r3 = "createSetArgs args idx 1 not Integer, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0406
            L_0x0184:
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                r8.f350996a = r9
                r4 = r0[r4]
                boolean r9 = r4 instanceof java.lang.Long
                if (r9 != 0) goto L_0x019b
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r12, r0)
                goto L_0x0406
            L_0x019b:
                java.lang.Long r4 = (java.lang.Long) r4
                long r9 = r4.longValue()
                r8.f350997b = r9
                r4 = r0[r5]
                boolean r5 = r4 instanceof java.lang.Long
                if (r5 != 0) goto L_0x01b2
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r15, r0)
                goto L_0x0406
            L_0x01b2:
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r8.f350998c = r4
                r4 = 4
                r4 = r0[r4]
                boolean r5 = r4 instanceof java.lang.Long
                if (r5 != 0) goto L_0x01cc
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                java.lang.String r3 = "createSetArgs args idx 4 not Long, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0406
            L_0x01cc:
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r8.f350999d = r4
                r4 = r0[r16]
                boolean r5 = r4 instanceof java.lang.Integer
                if (r5 != 0) goto L_0x01e5
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                java.lang.String r3 = "createSetArgs args idx 5 not Integer, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0406
            L_0x01e5:
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r8.f351000e = r4
                r0 = r0[r13]
                if (r0 == 0) goto L_0x0200
                boolean r4 = r0 instanceof android.app.PendingIntent
                if (r4 != 0) goto L_0x0200
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createSetArgs args idx 6 not PendingIntent, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0406
            L_0x0200:
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r8.f351001f = r0
                goto L_0x03ac
            L_0x0206:
                int r8 = r0.length
                if (r8 == r14) goto L_0x0217
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                p723vf.C118672d.m167356f(r2, r11, r3)
                goto L_0x0406
            L_0x0217:
                ie.a$d r8 = new ie.a$d
                r8.<init>(r7)
                r11 = r0[r6]
                boolean r13 = r11 instanceof java.lang.Integer
                if (r13 != 0) goto L_0x022b
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r11
                p723vf.C118672d.m167356f(r2, r10, r0)
                goto L_0x0406
            L_0x022b:
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r10 = r11.intValue()
                r8.f350996a = r10
                r10 = r0[r3]
                boolean r11 = r10 instanceof java.lang.Long
                if (r11 != 0) goto L_0x0242
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r10
                p723vf.C118672d.m167356f(r2, r9, r0)
                goto L_0x0406
            L_0x0242:
                java.lang.Long r10 = (java.lang.Long) r10
                long r9 = r10.longValue()
                r8.f350997b = r9
                r4 = r0[r4]
                boolean r9 = r4 instanceof java.lang.Long
                if (r9 != 0) goto L_0x0259
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r12, r0)
                goto L_0x0406
            L_0x0259:
                java.lang.Long r4 = (java.lang.Long) r4
                long r9 = r4.longValue()
                r8.f350998c = r9
                r4 = r0[r5]
                boolean r5 = r4 instanceof java.lang.Long
                if (r5 != 0) goto L_0x0270
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r15, r0)
                goto L_0x0406
            L_0x0270:
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r8.f350999d = r4
                r4 = 4
                r4 = r0[r4]
                boolean r5 = r4 instanceof java.lang.Integer
                if (r5 != 0) goto L_0x028a
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                java.lang.String r3 = "createSetArgs args idx 4 not Integer, %s"
                p723vf.C118672d.m167356f(r2, r3, r0)
                goto L_0x0406
            L_0x028a:
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r8.f351000e = r4
                r0 = r0[r16]
                if (r0 == 0) goto L_0x02a5
                boolean r4 = r0 instanceof android.app.PendingIntent
                if (r4 != 0) goto L_0x02a5
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createSetArgs args idx 5 not PendingIntent, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0406
            L_0x02a5:
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r8.f351001f = r0
                goto L_0x03ac
            L_0x02ab:
                int r8 = r0.length
                if (r8 == r14) goto L_0x02bf
                int r8 = r0.length
                if (r8 == r13) goto L_0x02bf
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                p723vf.C118672d.m167356f(r2, r11, r3)
                goto L_0x0406
            L_0x02bf:
                ie.a$d r8 = new ie.a$d
                r8.<init>(r7)
                r11 = r0[r6]
                boolean r13 = r11 instanceof java.lang.Integer
                if (r13 != 0) goto L_0x02d3
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r11
                p723vf.C118672d.m167356f(r2, r10, r0)
                goto L_0x0406
            L_0x02d3:
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r10 = r11.intValue()
                r8.f350996a = r10
                r10 = r0[r3]
                boolean r11 = r10 instanceof java.lang.Long
                if (r11 != 0) goto L_0x02ea
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r10
                p723vf.C118672d.m167356f(r2, r9, r0)
                goto L_0x0406
            L_0x02ea:
                java.lang.Long r10 = (java.lang.Long) r10
                long r9 = r10.longValue()
                r8.f350997b = r9
                r4 = r0[r4]
                boolean r9 = r4 instanceof java.lang.Long
                if (r9 != 0) goto L_0x0301
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r12, r0)
                goto L_0x0406
            L_0x0301:
                java.lang.Long r4 = (java.lang.Long) r4
                long r9 = r4.longValue()
                r8.f350998c = r9
                r4 = r0[r5]
                boolean r5 = r4 instanceof java.lang.Long
                if (r5 != 0) goto L_0x0318
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r15, r0)
                goto L_0x0406
            L_0x0318:
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r8.f350999d = r4
                r4 = 4
                r0 = r0[r4]
                if (r0 == 0) goto L_0x0334
                boolean r4 = r0 instanceof android.app.PendingIntent
                if (r4 != 0) goto L_0x0334
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createSetArgs args idx 4 not PendingIntent, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0406
            L_0x0334:
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r8.f351001f = r0
                goto L_0x03ac
            L_0x033a:
                int r8 = r0.length
                r13 = 4
                if (r8 == r13) goto L_0x034c
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                p723vf.C118672d.m167356f(r2, r11, r3)
                goto L_0x0406
            L_0x034c:
                ie.a$d r8 = new ie.a$d
                r8.<init>(r7)
                r11 = r0[r6]
                boolean r13 = r11 instanceof java.lang.Integer
                if (r13 != 0) goto L_0x0360
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r11
                p723vf.C118672d.m167356f(r2, r10, r0)
                goto L_0x0406
            L_0x0360:
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r10 = r11.intValue()
                r8.f350996a = r10
                r10 = r0[r3]
                boolean r11 = r10 instanceof java.lang.Long
                if (r11 != 0) goto L_0x0377
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r10
                p723vf.C118672d.m167356f(r2, r9, r0)
                goto L_0x0406
            L_0x0377:
                java.lang.Long r10 = (java.lang.Long) r10
                long r9 = r10.longValue()
                r8.f350997b = r9
                r4 = r0[r4]
                boolean r9 = r4 instanceof java.lang.Long
                if (r9 != 0) goto L_0x038e
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r4
                p723vf.C118672d.m167356f(r2, r12, r0)
                goto L_0x0406
            L_0x038e:
                java.lang.Long r4 = (java.lang.Long) r4
                long r9 = r4.longValue()
                r8.f350999d = r9
                r0 = r0[r5]
                if (r0 == 0) goto L_0x03a8
                boolean r4 = r0 instanceof android.app.PendingIntent
                if (r4 != 0) goto L_0x03a8
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createSetArgs args idx 3 not PendingIntent, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0406
            L_0x03a8:
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r8.f351001f = r0
            L_0x03ac:
                r7 = r8
                goto L_0x0406
            L_0x03ae:
                int r8 = r0.length
                if (r8 == r5) goto L_0x03be
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r0 = r0.length
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r6] = r0
                p723vf.C118672d.m167356f(r2, r11, r3)
                goto L_0x0406
            L_0x03be:
                ie.a$d r5 = new ie.a$d
                r5.<init>(r7)
                r8 = r0[r6]
                boolean r11 = r8 instanceof java.lang.Integer
                if (r11 != 0) goto L_0x03d1
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r8
                p723vf.C118672d.m167356f(r2, r10, r0)
                goto L_0x0406
            L_0x03d1:
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r5.f350996a = r8
                r8 = r0[r3]
                boolean r10 = r8 instanceof java.lang.Long
                if (r10 != 0) goto L_0x03e7
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r6] = r8
                p723vf.C118672d.m167356f(r2, r9, r0)
                goto L_0x0406
            L_0x03e7:
                java.lang.Long r8 = (java.lang.Long) r8
                long r8 = r8.longValue()
                r5.f350997b = r8
                r0 = r0[r4]
                if (r0 == 0) goto L_0x0401
                boolean r4 = r0 instanceof android.app.PendingIntent
                if (r4 != 0) goto L_0x0401
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r6] = r0
                java.lang.String r0 = "createSetArgs args idx 2 not PendingIntent, %s"
                p723vf.C118672d.m167356f(r2, r0, r3)
                goto L_0x0406
            L_0x0401:
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                r5.f351001f = r0
                r7 = r5
            L_0x0406:
                if (r7 != 0) goto L_0x0412
                java.lang.String r0 = "Matrix.battery.AlarmHooker"
                java.lang.String r1 = "dispatchSet setArgs null"
                java.lang.Object[] r2 = new java.lang.Object[r6]
                p723vf.C118672d.m167356f(r0, r1, r2)
                goto L_0x0441
            L_0x0412:
                monitor-enter(r1)
            L_0x0413:
                java.util.List<ie.a$c> r0 = p981ie.C117154a.f350994c     // Catch:{ all -> 0x0442 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0442 }
                int r0 = r0.size()     // Catch:{ all -> 0x0442 }
                if (r6 >= r0) goto L_0x0440
                java.util.List<ie.a$c> r0 = p981ie.C117154a.f350994c     // Catch:{ all -> 0x0442 }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0442 }
                java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0442 }
                r8 = r0
                ie.a$c r8 = (p981ie.C117154a.C117157c) r8     // Catch:{ all -> 0x0442 }
                int r9 = r7.f350996a     // Catch:{ all -> 0x0442 }
                long r10 = r7.f350997b     // Catch:{ all -> 0x0442 }
                long r12 = r7.f350998c     // Catch:{ all -> 0x0442 }
                long r14 = r7.f350999d     // Catch:{ all -> 0x0442 }
                int r0 = r7.f351000e     // Catch:{ all -> 0x0442 }
                android.app.PendingIntent r2 = r7.f351001f     // Catch:{ all -> 0x0442 }
                r18 = 0
                r16 = r0
                r17 = r2
                r8.mo173649a(r9, r10, r12, r14, r16, r17, r18)     // Catch:{ all -> 0x0442 }
                int r6 = r6 + 1
                goto L_0x0413
            L_0x0440:
                monitor-exit(r1)     // Catch:{ all -> 0x0442 }
            L_0x0441:
                return
            L_0x0442:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0442 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p981ie.C117154a.C117155a.mo122126b(java.lang.reflect.Method, java.lang.Object[]):void");
        }
    }

    /* renamed from: ie.a$b */
    public static final class C117156b {

        /* renamed from: a */
        public PendingIntent f350995a;

        public C117156b(C117155a aVar) {
        }
    }

    /* renamed from: ie.a$c */
    public interface C117157c {
        /* renamed from: a */
        void mo173649a(int i, long j, long j2, long j3, int i2, PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener);

        /* renamed from: b */
        void mo173650b(PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener);
    }

    /* renamed from: ie.a$d */
    public static final class C117158d {

        /* renamed from: a */
        public int f350996a;

        /* renamed from: b */
        public long f350997b;

        /* renamed from: c */
        public long f350998c;

        /* renamed from: d */
        public long f350999d;

        /* renamed from: e */
        public int f351000e;

        /* renamed from: f */
        public PendingIntent f351001f;

        public C117158d(C117155a aVar) {
        }
    }
}
