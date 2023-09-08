package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import p1042u.C111059i;
import p516f9.C116813c;
import p516f9.C116815d;
import p516f9.C116817e;
import p516f9.C116822g0;
import p516f9.C116831l;

/* renamed from: com.google.firebase.iid.a */
public final class C113382a {

    /* renamed from: g */
    public static int f339226g;

    /* renamed from: h */
    public static PendingIntent f339227h;

    /* renamed from: a */
    public final C111059i<String, TaskCompletionSource<Bundle>> f339228a = new C111059i<>();

    /* renamed from: b */
    public final Context f339229b;

    /* renamed from: c */
    public final C116817e f339230c;

    /* renamed from: d */
    public Messenger f339231d;

    /* renamed from: e */
    public Messenger f339232e;

    /* renamed from: f */
    public zzi f339233f;

    public C113382a(Context context, C116817e eVar) {
        this.f339229b = context;
        this.f339230c = eVar;
        this.f339231d = new Messenger(new C116831l(this, Looper.getMainLooper()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo169424a(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r0 = r2.f339228a
            monitor-enter(r0)
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r1 = r2.f339228a     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001e
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0023 }
            int r1 = r3.length()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001c
            r4.concat(r3)     // Catch:{ all -> 0x0023 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x001e:
            r1.setResult(r4)     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C113382a.mo169424a(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: b */
    public final Bundle mo169425b(Bundle bundle) {
        int i;
        C116822g0 g0Var;
        int i2;
        PackageInfo c;
        C116817e eVar = this.f339230c;
        synchronized (eVar) {
            if (eVar.f350168d == 0 && (c = eVar.mo180811c("com.google.android.gms")) != null) {
                eVar.f350168d = c.versionCode;
            }
            i = eVar.f350168d;
        }
        if (i >= 12000000) {
            Context context = this.f339229b;
            synchronized (C116822g0.class) {
                if (C116822g0.f350174e == null) {
                    C116822g0.f350174e = new C116822g0(context, Executors.newSingleThreadScheduledExecutor());
                }
                g0Var = C116822g0.f350174e;
            }
            synchronized (g0Var) {
                i2 = g0Var.f350178d;
                g0Var.f350178d = i2 + 1;
            }
            try {
                return (Bundle) Tasks.await(g0Var.mo180816a(new C116815d(i2, 1, bundle)));
            } catch (InterruptedException | ExecutionException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    new StringBuilder(String.valueOf(e).length() + 22);
                }
                if (!(e.getCause() instanceof C116813c) || ((C116813c) e.getCause()).f350164d != 4) {
                    return null;
                }
                Bundle c2 = mo169426c(bundle);
                if (c2 == null || !c2.containsKey("google.messenger")) {
                    return c2;
                }
                Bundle c3 = mo169426c(bundle);
                if (c3 == null || !c3.containsKey("google.messenger")) {
                    return c3;
                }
                return null;
            }
        } else {
            Bundle c4 = mo169426c(bundle);
            if (c4 == null || !c4.containsKey("google.messenger")) {
                return c4;
            }
            Bundle c5 = mo169426c(bundle);
            if (c5 == null || !c5.containsKey("google.messenger")) {
                return c5;
            }
            return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public final android.os.Bundle mo169426c(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.Class<com.google.firebase.iid.a> r0 = com.google.firebase.iid.C113382a.class
            monitor-enter(r0)
            int r1 = f339226g     // Catch:{ all -> 0x012c }
            int r2 = r1 + 1
            f339226g = r2     // Catch:{ all -> 0x012c }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x012c }
            monitor-exit(r0)
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r3 = r7.f339228a
            monitor-enter(r3)
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r4 = r7.f339228a     // Catch:{ all -> 0x0129 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0129 }
            monitor-exit(r3)     // Catch:{ all -> 0x0129 }
            f9.e r3 = r7.f339230c
            int r3 = r3.mo180812d()
            if (r3 == 0) goto L_0x0121
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)
            f9.e r4 = r7.f339230c
            int r4 = r4.mo180812d()
            r5 = 2
            if (r4 != r5) goto L_0x003a
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x003c
        L_0x003a:
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
        L_0x003c:
            r3.setAction(r4)
            r3.putExtras(r8)
            android.content.Context r8 = r7.f339229b
            monitor-enter(r0)
            android.app.PendingIntent r4 = f339227h     // Catch:{ all -> 0x011e }
            if (r4 != 0) goto L_0x005a
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x011e }
            r4.<init>()     // Catch:{ all -> 0x011e }
            java.lang.String r6 = "com.google.example.invalidpackage"
            r4.setPackage(r6)     // Catch:{ all -> 0x011e }
            r6 = 0
            android.app.PendingIntent r8 = android.app.PendingIntent.getBroadcast(r8, r6, r4, r6)     // Catch:{ all -> 0x011e }
            f339227h = r8     // Catch:{ all -> 0x011e }
        L_0x005a:
            java.lang.String r8 = "app"
            android.app.PendingIntent r4 = f339227h     // Catch:{ all -> 0x011e }
            r3.putExtra(r8, r4)     // Catch:{ all -> 0x011e }
            monitor-exit(r0)
            java.lang.String r8 = "kid"
            java.lang.String r0 = java.lang.String.valueOf(r1)
            int r0 = r0.length()
            int r0 = r0 + 5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.String r0 = "|ID|"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "|"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.putExtra(r8, r0)
            java.lang.String r8 = "FirebaseInstanceId"
            r0 = 3
            boolean r8 = android.util.Log.isLoggable(r8, r0)
            if (r8 == 0) goto L_0x00a5
            android.os.Bundle r8 = r3.getExtras()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r8 = r8.length()
            int r8 = r8 + 8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
        L_0x00a5:
            java.lang.String r8 = "google.messenger"
            android.os.Messenger r4 = r7.f339231d
            r3.putExtra(r8, r4)
            android.os.Messenger r8 = r7.f339232e
            if (r8 != 0) goto L_0x00b4
            com.google.firebase.iid.zzi r8 = r7.f339233f
            if (r8 == 0) goto L_0x00d2
        L_0x00b4:
            android.os.Message r8 = android.os.Message.obtain()
            r8.obj = r3
            android.os.Messenger r4 = r7.f339232e     // Catch:{ RemoteException -> 0x00cd }
            if (r4 == 0) goto L_0x00c2
            r4.send(r8)     // Catch:{ RemoteException -> 0x00cd }
            goto L_0x00e5
        L_0x00c2:
            com.google.firebase.iid.zzi r4 = r7.f339233f     // Catch:{ RemoteException -> 0x00cd }
            android.os.Messenger r4 = r4.f339239d     // Catch:{ RemoteException -> 0x00cd }
            r4.getClass()     // Catch:{ RemoteException -> 0x00cd }
            r4.send(r8)     // Catch:{ RemoteException -> 0x00cd }
            goto L_0x00e5
        L_0x00cd:
            java.lang.String r8 = "FirebaseInstanceId"
            android.util.Log.isLoggable(r8, r0)
        L_0x00d2:
            f9.e r8 = r7.f339230c
            int r8 = r8.mo180812d()
            if (r8 != r5) goto L_0x00e0
            android.content.Context r8 = r7.f339229b
            r8.sendBroadcast(r3)
            goto L_0x00e5
        L_0x00e0:
            android.content.Context r8 = r7.f339229b
            r8.startService(r3)
        L_0x00e5:
            com.google.android.gms.tasks.Task r8 = r2.getTask()     // Catch:{ InterruptedException | TimeoutException -> 0x0109, ExecutionException -> 0x0102 }
            r2 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0109, ExecutionException -> 0x0102 }
            java.lang.Object r8 = com.google.android.gms.tasks.Tasks.await(r8, r2, r0)     // Catch:{ InterruptedException | TimeoutException -> 0x0109, ExecutionException -> 0x0102 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x0109, ExecutionException -> 0x0102 }
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r0 = r7.f339228a
            monitor-enter(r0)
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r7.f339228a     // Catch:{ all -> 0x00fd }
            r2.remove(r1)     // Catch:{ all -> 0x00fd }
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            return r8
        L_0x00fd:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            throw r8
        L_0x0100:
            r8 = move-exception
            goto L_0x0111
        L_0x0102:
            r8 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0100 }
            r0.<init>(r8)     // Catch:{ all -> 0x0100 }
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0109:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = "TIMEOUT"
            r8.<init>(r0)     // Catch:{ all -> 0x0100 }
            throw r8     // Catch:{ all -> 0x0100 }
        L_0x0111:
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r2 = r7.f339228a
            monitor-enter(r2)
            u.i<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r0 = r7.f339228a     // Catch:{ all -> 0x011b }
            r0.remove(r1)     // Catch:{ all -> 0x011b }
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r8
        L_0x011b:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r8
        L_0x011e:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x0121:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0129:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0129 }
            throw r8
        L_0x012c:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C113382a.mo169426c(android.os.Bundle):android.os.Bundle");
    }
}
