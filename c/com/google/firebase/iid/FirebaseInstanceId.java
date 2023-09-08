package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p1042u.C111059i;
import p516f9.C116814c0;
import p516f9.C116817e;
import p516f9.C116823h;
import p516f9.C116825i;
import p516f9.C116827j;
import p516f9.C116829k;
import p516f9.C116835n;
import p516f9.C116837p;
import p516f9.C116846y;
import p516f9.C116847z;
import p516f9.C31961o;

public class FirebaseInstanceId {

    /* renamed from: g */
    public static final long f339215g = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: h */
    public static C116835n f339216h;

    /* renamed from: i */
    public static ScheduledThreadPoolExecutor f339217i;

    /* renamed from: a */
    public final FirebaseApp f339218a;

    /* renamed from: b */
    public final C116817e f339219b;

    /* renamed from: c */
    public final C116814c0 f339220c;

    /* renamed from: d */
    public final C116823h f339221d = new C116823h();

    /* renamed from: e */
    public boolean f339222e;

    /* renamed from: f */
    public boolean f339223f;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        if (r7.serviceInfo != null) goto L_0x00a0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseInstanceId(com.google.firebase.FirebaseApp r7) {
        /*
            r6 = this;
            f9.e r0 = new f9.e
            r7.mo169379d()
            android.content.Context r1 = r7.f339194a
            r0.<init>(r1)
            r6.<init>()
            f9.h r1 = new f9.h
            r1.<init>()
            r6.f339221d = r1
            r1 = 0
            r6.f339222e = r1
            java.lang.String r2 = p516f9.C116817e.m164804a(r7)
            if (r2 == 0) goto L_0x00b4
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceId> r2 = com.google.firebase.iid.FirebaseInstanceId.class
            monitor-enter(r2)
            f9.n r3 = f339216h     // Catch:{ all -> 0x00b1 }
            if (r3 != 0) goto L_0x0030
            f9.n r3 = new f9.n     // Catch:{ all -> 0x00b1 }
            r7.mo169379d()     // Catch:{ all -> 0x00b1 }
            android.content.Context r4 = r7.f339194a     // Catch:{ all -> 0x00b1 }
            r3.<init>(r4)     // Catch:{ all -> 0x00b1 }
            f339216h = r3     // Catch:{ all -> 0x00b1 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            r6.f339218a = r7
            r6.f339219b = r0
            f9.z r2 = new f9.z
            r2.<init>(r7, r6, r0)
            r6.f339220c = r2
            java.lang.String r0 = "firebase_messaging_auto_init_enabled"
            r7.mo169379d()
            android.content.Context r7 = r7.f339194a
            java.lang.String r2 = "com.google.firebase.messaging"
            android.content.SharedPreferences r2 = r7.getSharedPreferences(r2, r1)
            java.lang.String r3 = "auto_init"
            boolean r4 = r2.contains(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0057
            boolean r7 = r2.getBoolean(r3, r5)
            goto L_0x00a2
        L_0x0057:
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x007a }
            if (r2 == 0) goto L_0x007a
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r7 = r2.getApplicationInfo(r7, r3)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x007a
            android.os.Bundle r2 = r7.metaData     // Catch:{ NameNotFoundException -> 0x007a }
            if (r2 == 0) goto L_0x007a
            boolean r2 = r2.containsKey(r0)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r2 == 0) goto L_0x007a
            android.os.Bundle r7 = r7.metaData     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r7 = r7.getBoolean(r0)     // Catch:{ NameNotFoundException -> 0x007a }
            goto L_0x00a2
        L_0x007a:
            h9.a r7 = p545h9.C32739a.f89115b     // Catch:{ ClassNotFoundException -> 0x007d }
            goto L_0x00a0
        L_0x007d:
            com.google.firebase.FirebaseApp r7 = r6.f339218a
            r7.mo169379d()
            android.content.Context r7 = r7.f339194a
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.firebase.MESSAGING_EVENT"
            r0.<init>(r2)
            java.lang.String r2 = r7.getPackageName()
            r0.setPackage(r2)
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveService(r0, r1)
            if (r7 == 0) goto L_0x00a1
            android.content.pm.ServiceInfo r7 = r7.serviceInfo
            if (r7 == 0) goto L_0x00a1
        L_0x00a0:
            r1 = 1
        L_0x00a1:
            r7 = r1
        L_0x00a2:
            r6.f339223f = r7
            monitor-enter(r6)
            boolean r7 = r6.f339223f     // Catch:{ all -> 0x00ae }
            monitor-exit(r6)
            if (r7 == 0) goto L_0x00ad
            r6.mo169416h()
        L_0x00ad:
            return
        L_0x00ae:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00b1:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            throw r7
        L_0x00b4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.<init>(com.google.firebase.FirebaseApp):void");
    }

    /* renamed from: a */
    public static FirebaseInstanceId m155204a() {
        return getInstance(FirebaseApp.m155197a());
    }

    public static synchronized FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        FirebaseInstanceId firebaseInstanceId;
        Class cls = FirebaseInstanceId.class;
        synchronized (cls) {
            firebaseInstanceId = (FirebaseInstanceId) firebaseApp.get(cls);
        }
        return firebaseInstanceId;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        m155204a().mo169419m();
        r2 = r0.f350204c.mo180807e(r0.f350203b, "");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m155205i() {
        /*
            f9.n r0 = f339216h
            java.lang.String r1 = ""
            monitor-enter(r0)
            java.util.Map<java.lang.String, f9.e0> r2 = r0.f350205d     // Catch:{ all -> 0x0063 }
            u.i r2 = (p1042u.C111059i) r2     // Catch:{ all -> 0x0063 }
            r3 = 0
            java.lang.Object r2 = r2.getOrDefault(r1, r3)     // Catch:{ all -> 0x0063 }
            f9.e0 r2 = (p516f9.C116818e0) r2     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0014
        L_0x0012:
            monitor-exit(r0)
            goto L_0x003c
        L_0x0014:
            f9.d0 r2 = r0.f350204c     // Catch:{ f0 -> 0x0025 }
            android.content.Context r4 = r0.f350203b     // Catch:{ f0 -> 0x0025 }
            f9.e0 r5 = r2.mo180808g(r4, r1)     // Catch:{ f0 -> 0x0025 }
            if (r5 == 0) goto L_0x0020
            r2 = r5
            goto L_0x0034
        L_0x0020:
            f9.e0 r2 = r2.mo180807e(r4, r1)     // Catch:{ f0 -> 0x0025 }
            goto L_0x0034
        L_0x0025:
            com.google.firebase.iid.FirebaseInstanceId r2 = m155204a()     // Catch:{ all -> 0x0063 }
            r2.mo169419m()     // Catch:{ all -> 0x0063 }
            f9.d0 r2 = r0.f350204c     // Catch:{ all -> 0x0063 }
            android.content.Context r4 = r0.f350203b     // Catch:{ all -> 0x0063 }
            f9.e0 r2 = r2.mo180807e(r4, r1)     // Catch:{ all -> 0x0063 }
        L_0x0034:
            java.util.Map<java.lang.String, f9.e0> r4 = r0.f350205d     // Catch:{ all -> 0x0063 }
            u.i r4 = (p1042u.C111059i) r4     // Catch:{ all -> 0x0063 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0012
        L_0x003c:
            java.security.KeyPair r0 = r2.f350170a
            java.security.PublicKey r0 = r0.getPublic()
            byte[] r0 = r0.getEncoded()
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0062 }
            byte[] r0 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0062 }
            r1 = 0
            byte r2 = r0[r1]     // Catch:{ NoSuchAlgorithmException -> 0x0062 }
            r2 = r2 & 15
            int r2 = r2 + 112
            byte r2 = (byte) r2     // Catch:{ NoSuchAlgorithmException -> 0x0062 }
            r0[r1] = r2     // Catch:{ NoSuchAlgorithmException -> 0x0062 }
            r2 = 8
            r4 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r0, r1, r2, r4)     // Catch:{ NoSuchAlgorithmException -> 0x0062 }
        L_0x0062:
            return r3
        L_0x0063:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.m155205i():java.lang.String");
    }

    /* renamed from: l */
    public static boolean m155206l() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* renamed from: b */
    public String mo169410b() {
        C31961o j = mo169417j();
        if (j == null || j.mo58437b(this.f339219b.mo180813e())) {
            mo169411c();
        }
        if (j != null) {
            return j.f85111a;
        }
        return null;
    }

    /* renamed from: c */
    public final synchronized void mo169411c() {
        if (!this.f339222e) {
            mo169412d(0);
        }
    }

    /* renamed from: d */
    public final synchronized void mo169412d(long j) {
        C116837p pVar = new C116837p(this, this.f339219b, Math.min(Math.max(30, j << 1), f339215g));
        synchronized (FirebaseInstanceId.class) {
            if (f339217i == null) {
                f339217i = new ScheduledThreadPoolExecutor(1);
            }
            f339217i.schedule(pVar, j, TimeUnit.SECONDS);
        }
        this.f339222e = true;
    }

    /* renamed from: e */
    public final synchronized void mo169413e(boolean z) {
        this.f339222e = z;
    }

    /* renamed from: f */
    public final void mo169414f(String str) {
        C31961o j = mo169417j();
        if (j == null || j.mo58437b(this.f339219b.mo180813e())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String str2 = j.f85111a;
        String valueOf2 = String.valueOf(str);
        String concat = valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/");
        C116847z zVar = (C116847z) this.f339220c;
        zVar.mo180846b(str2, concat, bundle);
        zVar.mo180845a(zVar.f350237d.mo169425b(bundle));
    }

    /* renamed from: g */
    public final void mo169415g(String str) {
        C31961o j = mo169417j();
        if (j == null || j.mo58437b(this.f339219b.mo180813e())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String str2 = j.f85111a;
        String valueOf2 = String.valueOf(str);
        String concat = valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/");
        C116847z zVar = (C116847z) this.f339220c;
        zVar.mo180846b(str2, concat, bundle);
        zVar.mo180845a(zVar.f350237d.mo169425b(bundle));
    }

    /* renamed from: h */
    public final void mo169416h() {
        C31961o j = mo169417j();
        if (j == null || j.mo58437b(this.f339219b.mo180813e()) || f339216h.mo180828b() != null) {
            mo169411c();
        }
    }

    /* renamed from: j */
    public final C31961o mo169417j() {
        C31961o a;
        C116835n nVar = f339216h;
        String a2 = C116817e.m164804a(this.f339218a);
        synchronized (nVar) {
            a = C31961o.m39597a(nVar.f350202a.getString(C116835n.m164817a("", a2, "*"), (String) null));
        }
        return a;
    }

    /* renamed from: k */
    public final String mo169418k() {
        C31961o a;
        C116829k kVar;
        String a2 = C116817e.m164804a(this.f339218a);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C116835n nVar = f339216h;
            synchronized (nVar) {
                a = C31961o.m39597a(nVar.f350202a.getString(C116835n.m164817a("", a2, "*"), (String) null));
            }
            if (a != null && !a.mo58437b(this.f339219b.mo180813e())) {
                return a.f85111a;
            }
            C116823h hVar = this.f339221d;
            C116846y yVar = new C116846y(this, a2, "*");
            synchronized (hVar) {
                Pair pair = new Pair(a2, "*");
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) ((C111059i) hVar.f350179a).getOrDefault(pair, null);
                if (taskCompletionSource != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        new StringBuilder(String.valueOf(pair).length() + 29);
                    }
                    kVar = new C116825i(taskCompletionSource);
                } else {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        new StringBuilder(String.valueOf(pair).length() + 24);
                    }
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    ((C111059i) hVar.f350179a).put(pair, taskCompletionSource2);
                    kVar = new C116827j(hVar, yVar, taskCompletionSource2, pair);
                }
            }
            return kVar.mo180817a();
        }
        throw new IOException("MAIN_THREAD");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: m */
    public final synchronized void mo169419m() {
        /*
            r1 = this;
            monitor-enter(r1)
            f9.n r0 = f339216h     // Catch:{ all -> 0x0014 }
            r0.mo180829c()     // Catch:{ all -> 0x0014 }
            monitor-enter(r1)     // Catch:{ all -> 0x0014 }
            boolean r0 = r1.f339223f     // Catch:{ all -> 0x0011 }
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x000f
            r1.mo169411c()     // Catch:{ all -> 0x0014 }
        L_0x000f:
            monitor-exit(r1)
            return
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.mo169419m():void");
    }
}
