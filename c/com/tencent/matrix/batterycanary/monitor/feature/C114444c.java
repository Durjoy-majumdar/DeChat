package com.tencent.matrix.batterycanary.monitor.feature;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.util.ArrayList;
import p1177ce.C113314g;
import p1190de.C116608a;
import p723vf.C118672d;
import p981ie.C117154a;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.c */
public final class C114444c extends C116608a {

    /* renamed from: b */
    public Handler f343118b;

    /* renamed from: c */
    public final C114447d f343119c = new C114447d();

    /* renamed from: d */
    public C117154a.C117157c f343120d;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.c$b */
    public static class C28653b {

        /* renamed from: a */
        public final int f78619a;

        /* renamed from: b */
        public final long f78620b;

        /* renamed from: c */
        public final long f78621c;

        /* renamed from: d */
        public final long f78622d;

        /* renamed from: e */
        public final int f78623e;

        /* renamed from: f */
        public final long f78624f = System.currentTimeMillis();

        /* renamed from: g */
        public final String f78625g;

        public C28653b(int i, long j, long j2, long j3, int i2, String str) {
            this.f78619a = i;
            this.f78620b = j;
            this.f78621c = j2;
            this.f78622d = j3;
            this.f78623e = i2;
            this.f78625g = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C28653b.class == obj.getClass() && hashCode() == ((C28653b) obj).hashCode();
        }

        public String toString() {
            return "AlarmRecord{type=" + this.f78619a + ", triggerAtMillis=" + this.f78620b + ", windowMillis=" + this.f78621c + ", intervalMillis=" + this.f78622d + ", flag=" + this.f78623e + ", timeBgn=" + this.f78624f + ", stack='" + this.f78625g + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.c$a */
    public class C114445a implements C117154a.C117157c {
        public C114445a() {
        }

        /* renamed from: a */
        public void mo173649a(int i, long j, long j2, long j3, int i2, PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener) {
            String str = "";
            if (C114444c.this.f349668a.f339057d.f339044o) {
                String stackTraceString = Log.getStackTraceString(new Throwable());
                ArrayList arrayList = new ArrayList();
                String[] split = stackTraceString.split("\n\t");
                boolean isEmpty = TextUtils.isEmpty("at android.app.AlarmManager");
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (!isEmpty && str2.startsWith("at android.app.AlarmManager")) {
                            isEmpty = true;
                        }
                        if (isEmpty) {
                            arrayList.add(str2.trim());
                        }
                    }
                }
                str = TextUtils.join(";", arrayList.subList(0, Math.min(5, arrayList.size())));
            }
            C118672d.m167353c("Matrix.battery.AlarmMonitorFeature", "#onAlarmSet, target = " + new C28653b(i, j, j2, j3, i2, str), new Object[0]);
            if (pendingIntent != null || onAlarmListener != null) {
                if (pendingIntent != null) {
                    pendingIntent.hashCode();
                } else {
                    onAlarmListener.hashCode();
                }
                C114447d dVar = C114444c.this.f343119c;
                synchronized (dVar.f343127a) {
                    dVar.f343128b++;
                    dVar.f343129c++;
                }
            }
        }

        /* renamed from: b */
        public void mo173650b(PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener) {
            if (pendingIntent != null || onAlarmListener != null) {
                if (pendingIntent != null) {
                    pendingIntent.hashCode();
                } else {
                    onAlarmListener.hashCode();
                }
                C114447d dVar = C114444c.this.f343119c;
                synchronized (dVar.f343127a) {
                    dVar.f343129c--;
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.c$c */
    public static class C114446c extends C114490k0.C114491a<C114446c> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343122d;

        /* renamed from: e */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343123e;

        /* renamed from: f */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343124f;

        /* renamed from: g */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343125g;

        /* renamed from: h */
        public C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114495a<C28653b>> f343126h;

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114449d(this, (C114446c) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.c$d */
    public static final class C114447d {

        /* renamed from: a */
        public final byte[] f343127a = new byte[0];

        /* renamed from: b */
        public int f343128b;

        /* renamed from: c */
        public int f343129c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111817b() {
        /*
            r5 = this;
            super.mo111817b()
            ce.g r0 = r5.f349668a
            ce.f r0 = r0.f339057d
            boolean r0 = r0.f339046q
            if (r0 == 0) goto L_0x0058
            com.tencent.matrix.batterycanary.monitor.feature.c$a r0 = new com.tencent.matrix.batterycanary.monitor.feature.c$a
            r0.<init>()
            r5.f343120d = r0
            boolean r1 = p981ie.C117154a.f350992a
            java.lang.Class<ie.a> r1 = p981ie.C117154a.class
            monitor-enter(r1)
            java.util.List<ie.a$c> r2 = p981ie.C117154a.f350994c     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0023
            monitor-exit(r1)
            goto L_0x0058
        L_0x0023:
            java.util.List<ie.a$c> r2 = p981ie.C117154a.f350994c     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0055 }
            r2.add(r0)     // Catch:{ all -> 0x0055 }
            boolean r0 = p981ie.C117154a.f350992a     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            java.util.List<ie.a$c> r0 = p981ie.C117154a.f350994c     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            ie.u r0 = p981ie.C117154a.f350993b     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.mo122132a()     // Catch:{ all -> 0x0055 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0055 }
            r4 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r3[r4] = r0     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "Matrix.battery.AlarmHooker"
            java.lang.String r4 = "checkHook hookRet:%b"
            p723vf.C118672d.m167353c(r0, r4, r3)     // Catch:{ all -> 0x0055 }
            p981ie.C117154a.f350992a = r2     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r1)
            goto L_0x0058
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.monitor.feature.C114444c.mo111817b():void");
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        super.mo173631e(gVar);
        this.f343118b = gVar.f339059f;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        C117154a.C117157c cVar = this.f343120d;
        boolean z = C117154a.f350992a;
        synchronized (C117154a.class) {
            if (cVar != null) {
                ((ArrayList) C117154a.f350994c).remove(cVar);
                if (C117154a.f350992a) {
                    if (((ArrayList) C117154a.f350994c).isEmpty()) {
                        C118672d.m167353c("Matrix.battery.AlarmHooker", "checkUnHook unHookRet:%b", Boolean.valueOf(C117154a.f350993b.mo122133b()));
                        C117154a.f350992a = false;
                    }
                }
            }
        }
        this.f343118b.removeCallbacksAndMessages((Object) null);
        C114447d dVar = this.f343119c;
        dVar.f343128b = 0;
        dVar.f343129c = 0;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.AlarmMonitorFeature";
    }
}
