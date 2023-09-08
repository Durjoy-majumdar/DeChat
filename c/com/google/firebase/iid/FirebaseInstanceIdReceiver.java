package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import p516f9.C116844w;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: d */
    public static C116844w f339224d;

    /* renamed from: e */
    public static C116844w f339225e;

    /* JADX WARNING: Removed duplicated region for block: B:103:0x019f A[Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b6 A[Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01bb A[Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo169420a(android.content.Context r9, android.content.Intent r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 0
            r10.setComponent(r0)
            java.lang.String r1 = r9.getPackageName()
            r10.setPackage(r1)
            java.lang.String r1 = "gcm.rawData64"
            java.lang.String r1 = r10.getStringExtra(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.String r3 = "rawData"
            byte[] r1 = android.util.Base64.decode(r1, r2)
            r10.putExtra(r3, r1)
            java.lang.String r1 = "gcm.rawData64"
            r10.removeExtra(r1)
        L_0x0022:
            java.lang.String r1 = "from"
            java.lang.String r1 = r10.getStringExtra(r1)
            java.lang.String r3 = "google.com/iid"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = "com.google.firebase.INSTANCE_ID_EVENT"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0039
            goto L_0x004f
        L_0x0039:
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "com.google.firebase.MESSAGING_EVENT"
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r11 = r0
            goto L_0x0051
        L_0x004c:
            java.lang.String r11 = "com.google.firebase.MESSAGING_EVENT"
            goto L_0x0051
        L_0x004f:
            java.lang.String r11 = "com.google.firebase.INSTANCE_ID_EVENT"
        L_0x0051:
            r1 = -1
            if (r11 == 0) goto L_0x01df
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            r4 = 1
            if (r3 == 0) goto L_0x0067
            android.content.pm.ApplicationInfo r3 = r9.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r5 = 26
            if (r3 < r5) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            r5 = 3
            if (r3 == 0) goto L_0x00bf
            boolean r0 = r8.isOrderedBroadcast()
            if (r0 == 0) goto L_0x0074
            r8.setResultCode(r1)
        L_0x0074:
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            monitor-enter(r0)
            java.lang.String r2 = "com.google.firebase.MESSAGING_EVENT"
            boolean r2 = r2.equals(r11)     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x008d
            f9.w r2 = f339225e     // Catch:{ all -> 0x00bc }
            if (r2 != 0) goto L_0x008a
            f9.w r2 = new f9.w     // Catch:{ all -> 0x00bc }
            r2.<init>(r9, r11)     // Catch:{ all -> 0x00bc }
            f339225e = r2     // Catch:{ all -> 0x00bc }
        L_0x008a:
            f9.w r9 = f339225e     // Catch:{ all -> 0x00bc }
            goto L_0x009a
        L_0x008d:
            f9.w r2 = f339224d     // Catch:{ all -> 0x00bc }
            if (r2 != 0) goto L_0x0098
            f9.w r2 = new f9.w     // Catch:{ all -> 0x00bc }
            r2.<init>(r9, r11)     // Catch:{ all -> 0x00bc }
            f339224d = r2     // Catch:{ all -> 0x00bc }
        L_0x0098:
            f9.w r9 = f339224d     // Catch:{ all -> 0x00bc }
        L_0x009a:
            monitor-exit(r0)
            android.content.BroadcastReceiver$PendingResult r11 = r8.goAsync()
            monitor-enter(r9)
            java.lang.String r0 = "EnhancedIntentService"
            android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x00b9 }
            java.util.Queue<f9.s> r0 = r9.f350228g     // Catch:{ all -> 0x00b9 }
            f9.s r2 = new f9.s     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.ScheduledExecutorService r3 = r9.f350227f     // Catch:{ all -> 0x00b9 }
            r2.<init>(r10, r11, r3)     // Catch:{ all -> 0x00b9 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x00b9 }
            r0.add(r2)     // Catch:{ all -> 0x00b9 }
            r9.mo180840a()     // Catch:{ all -> 0x00b9 }
            monitor-exit(r9)
            goto L_0x01df
        L_0x00b9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x00bc:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L_0x00bf:
            f9.m r3 = p516f9.C116833m.m164816a()
            r3.getClass()
            java.lang.String r6 = "com.google.firebase.INSTANCE_ID_EVENT"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L_0x00e8
            java.lang.String r6 = "com.google.firebase.MESSAGING_EVENT"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L_0x00e5
            java.lang.String r9 = "Unknown service action: "
            int r10 = r11.length()
            if (r10 == 0) goto L_0x00e1
            r9.concat(r11)
        L_0x00e1:
            r9 = 500(0x1f4, float:7.0E-43)
            goto L_0x01da
        L_0x00e5:
            java.util.Queue<android.content.Intent> r6 = r3.f350199d
            goto L_0x00ea
        L_0x00e8:
            java.util.Queue<android.content.Intent> r6 = r3.f350198c
        L_0x00ea:
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6
            r6.offer(r10)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r11)
            java.lang.String r11 = r9.getPackageName()
            r10.setPackage(r11)
            u.i<java.lang.String, java.lang.String> r11 = r3.f350196a
            monitor-enter(r11)
            u.i<java.lang.String, java.lang.String> r6 = r3.f350196a     // Catch:{ all -> 0x01dc }
            java.lang.String r7 = r10.getAction()     // Catch:{ all -> 0x01dc }
            java.lang.Object r0 = r6.getOrDefault(r7, r0)     // Catch:{ all -> 0x01dc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01dc }
            monitor-exit(r11)     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x017d
            android.content.pm.PackageManager r11 = r9.getPackageManager()
            android.content.pm.ResolveInfo r11 = r11.resolveService(r10, r2)
            if (r11 == 0) goto L_0x019b
            android.content.pm.ServiceInfo r11 = r11.serviceInfo
            if (r11 != 0) goto L_0x011d
            goto L_0x019b
        L_0x011d:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r6 = r11.packageName
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r11.name
            if (r0 != 0) goto L_0x012e
            goto L_0x0160
        L_0x012e:
            java.lang.String r11 = "."
            boolean r11 = r0.startsWith(r11)
            if (r11 == 0) goto L_0x014f
            java.lang.String r11 = r9.getPackageName()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r6 = r0.length()
            if (r6 == 0) goto L_0x014a
            java.lang.String r11 = r11.concat(r0)
            r0 = r11
            goto L_0x014f
        L_0x014a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r11)
        L_0x014f:
            u.i<java.lang.String, java.lang.String> r6 = r3.f350196a
            monitor-enter(r6)
            u.i<java.lang.String, java.lang.String> r11 = r3.f350196a     // Catch:{ all -> 0x015d }
            java.lang.String r7 = r10.getAction()     // Catch:{ all -> 0x015d }
            r11.put(r7, r0)     // Catch:{ all -> 0x015d }
            monitor-exit(r6)     // Catch:{ all -> 0x015d }
            goto L_0x017d
        L_0x015d:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x015d }
            throw r9
        L_0x0160:
            java.lang.String r0 = r11.packageName
            java.lang.String r11 = r11.name
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            int r0 = r0 + 94
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r11 = r11.length()
            int r0 = r0 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            goto L_0x019b
        L_0x017d:
            java.lang.String r11 = "FirebaseInstanceId"
            boolean r11 = android.util.Log.isLoggable(r11, r5)
            if (r11 == 0) goto L_0x0194
            java.lang.String r11 = "Restricting intent to a specific service: "
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0194
            r11.concat(r5)
        L_0x0194:
            java.lang.String r11 = r9.getPackageName()
            r10.setClassName(r11, r0)
        L_0x019b:
            java.lang.Boolean r11 = r3.f350197b     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
            if (r11 != 0) goto L_0x01ae
            java.lang.String r11 = "android.permission.WAKE_LOCK"
            int r11 = r9.checkCallingOrSelfPermission(r11)     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
            if (r11 != 0) goto L_0x01a8
            r2 = 1
        L_0x01a8:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
            r3.f350197b = r11     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
        L_0x01ae:
            java.lang.Boolean r11 = r3.f350197b     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
            boolean r11 = r11.booleanValue()     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
            if (r11 == 0) goto L_0x01bb
            android.content.ComponentName r9 = androidx.legacy.content.WakefulBroadcastReceiver.startWakefulService(r9, r10)     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
            goto L_0x01bf
        L_0x01bb:
            android.content.ComponentName r9 = r9.startService(r10)     // Catch:{ SecurityException -> 0x01d7, IllegalStateException -> 0x01c4 }
        L_0x01bf:
            if (r9 != 0) goto L_0x01d9
            r1 = 404(0x194, float:5.66E-43)
            goto L_0x01d9
        L_0x01c4:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r9 = r9.length()
            int r9 = r9 + 45
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r1 = 402(0x192, float:5.63E-43)
            goto L_0x01d9
        L_0x01d7:
            r1 = 401(0x191, float:5.62E-43)
        L_0x01d9:
            r9 = r1
        L_0x01da:
            r1 = r9
            goto L_0x01df
        L_0x01dc:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01dc }
            throw r9
        L_0x01df:
            boolean r9 = r8.isOrderedBroadcast()
            if (r9 == 0) goto L_0x01e8
            r8.setResultCode(r1)
        L_0x01e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.mo169420a(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                mo169420a(context, (Intent) parcelableExtra, intent.getAction());
            } else {
                mo169420a(context, intent, intent.getAction());
            }
        }
    }
}
