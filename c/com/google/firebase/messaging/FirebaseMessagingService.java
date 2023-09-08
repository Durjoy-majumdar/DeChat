package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.zzb;
import java.util.ArrayDeque;
import java.util.Queue;
import p1175c9.C113253a;
import p516f9.C116833m;
import p545h9.C117072d;

public class FirebaseMessagingService extends zzb {

    /* renamed from: i */
    public static final Queue<String> f339240i = new ArrayDeque(10);

    /* renamed from: h */
    public static boolean m155228h(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: b */
    public final Intent mo169422b(Intent intent) {
        return (Intent) ((ArrayDeque) C116833m.m164816a().f350199d).poll();
    }

    /* renamed from: c */
    public final boolean mo169428c(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        if (!m155228h(intent.getExtras())) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            C113253a aVar = (C113253a) FirebaseApp.m155197a().get(C113253a.class);
            Log.isLoggable("FirebaseMessaging", 3);
            if (aVar != null) {
                String stringExtra = intent.getStringExtra("google.c.a.c_id");
                aVar.setUserProperty(AppMeasurement.FCM_ORIGIN, AppMeasurement.UserProperty.FIREBASE_LAST_NOTIFICATION, stringExtra);
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.C113379b.SOURCE, "Firebase");
                bundle.putString(FirebaseAnalytics.C113379b.MEDIUM, "notification");
                bundle.putString(FirebaseAnalytics.C113379b.CAMPAIGN, stringExtra);
                aVar.logEvent(AppMeasurement.FCM_ORIGIN, "_cmp", bundle);
            }
        } else {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        C117072d.m165097a(this, "_no", intent);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo169423d(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            if (r0 != 0) goto L_0x0008
            java.lang.String r0 = ""
        L_0x0008:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x01b3
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r10 = r10.getAction()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r1 = r10.length()
            if (r1 == 0) goto L_0x01c2
            r0.concat(r10)
            goto L_0x01c2
        L_0x002d:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 2
            if (r1 == 0) goto L_0x0040
            r1 = 0
            com.google.android.gms.tasks.Task r1 = com.google.android.gms.tasks.Tasks.forResult(r1)
            goto L_0x0070
        L_0x0040:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "google.message_id"
            r1.putString(r3, r0)
            java.lang.Class<f9.g0> r3 = p516f9.C116822g0.class
            monitor-enter(r3)
            f9.g0 r4 = p516f9.C116822g0.f350174e     // Catch:{ all -> 0x01b0 }
            if (r4 != 0) goto L_0x005c
            f9.g0 r4 = new f9.g0     // Catch:{ all -> 0x01b0 }
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch:{ all -> 0x01b0 }
            r4.<init>(r9, r5)     // Catch:{ all -> 0x01b0 }
            p516f9.C116822g0.f350174e = r4     // Catch:{ all -> 0x01b0 }
        L_0x005c:
            f9.g0 r4 = p516f9.C116822g0.f350174e     // Catch:{ all -> 0x01b0 }
            monitor-exit(r3)
            f9.a r3 = new f9.a
            monitor-enter(r4)
            int r5 = r4.f350178d     // Catch:{ all -> 0x01ad }
            int r6 = r5 + 1
            r4.f350178d = r6     // Catch:{ all -> 0x01ad }
            monitor-exit(r4)
            r3.<init>(r5, r2, r1)
            com.google.android.gms.tasks.Task r1 = r4.mo180816a(r3)
        L_0x0070:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            r5 = 3
            r6 = 1
            if (r3 == 0) goto L_0x007a
            goto L_0x00ab
        L_0x007a:
            java.util.Queue<java.lang.String> r3 = f339240i
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r7 = r3.contains(r0)
            if (r7 == 0) goto L_0x009d
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x009b
            java.lang.String r3 = "Received duplicate message: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r7 = r0.length()
            if (r7 == 0) goto L_0x009b
            r3.concat(r0)
        L_0x009b:
            r0 = 1
            goto L_0x00ac
        L_0x009d:
            int r7 = r3.size()
            r8 = 10
            if (r7 < r8) goto L_0x00a8
            r3.remove()
        L_0x00a8:
            r3.add(r0)
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            if (r0 != 0) goto L_0x0190
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "gcm"
        L_0x00b8:
            int r3 = r0.hashCode()
            switch(r3) {
                case -2062414158: goto L_0x00e1;
                case 102161: goto L_0x00d6;
                case 814694033: goto L_0x00cb;
                case 814800675: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            goto L_0x00ec
        L_0x00c0:
            java.lang.String r3 = "send_event"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00c9
            goto L_0x00ec
        L_0x00c9:
            r3 = 3
            goto L_0x00ed
        L_0x00cb:
            java.lang.String r3 = "send_error"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00d4
            goto L_0x00ec
        L_0x00d4:
            r3 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r3 = "gcm"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00df
            goto L_0x00ec
        L_0x00df:
            r3 = 1
            goto L_0x00ed
        L_0x00e1:
            java.lang.String r3 = "deleted_messages"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r3 = 0
            goto L_0x00ed
        L_0x00ec:
            r3 = -1
        L_0x00ed:
            if (r3 == 0) goto L_0x018d
            if (r3 == r6) goto L_0x0126
            if (r3 == r2) goto L_0x0109
            if (r3 == r5) goto L_0x0102
            java.lang.String r10 = "Received message with unknown type: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0190
            r10.concat(r0)
            goto L_0x0190
        L_0x0102:
            java.lang.String r0 = "google.message_id"
            r10.getStringExtra(r0)
            goto L_0x0190
        L_0x0109:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
        L_0x0117:
            h9.b r2 = new h9.b
            java.lang.String r3 = "error"
            java.lang.String r10 = r10.getStringExtra(r3)
            r2.<init>(r10)
            r9.mo118229g(r0, r2)
            goto L_0x0190
        L_0x0126:
            android.os.Bundle r0 = r10.getExtras()
            boolean r0 = m155228h(r0)
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "_nr"
            p545h9.C117072d.m165097a(r9, r0, r10)
        L_0x0135:
            android.os.Bundle r0 = r10.getExtras()
            if (r0 != 0) goto L_0x0140
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0140:
            java.lang.String r2 = "androidx.contentpager.content.wakelockid"
            r0.remove(r2)
            java.lang.String r2 = "gcm.n.e"
            java.lang.String r2 = p545h9.C117071c.m165091a(r0, r2)
            java.lang.String r3 = "1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x015b
            java.lang.String r2 = "gcm.n.icon"
            java.lang.String r2 = p545h9.C117071c.m165091a(r0, r2)
            if (r2 == 0) goto L_0x015c
        L_0x015b:
            r4 = 1
        L_0x015c:
            if (r4 == 0) goto L_0x0184
            java.lang.Class<h9.c> r2 = p545h9.C117071c.class
            monitor-enter(r2)
            h9.c r3 = p545h9.C117071c.f350815f     // Catch:{ all -> 0x0181 }
            if (r3 != 0) goto L_0x016c
            h9.c r3 = new h9.c     // Catch:{ all -> 0x0181 }
            r3.<init>(r9)     // Catch:{ all -> 0x0181 }
            p545h9.C117071c.f350815f = r3     // Catch:{ all -> 0x0181 }
        L_0x016c:
            h9.c r3 = p545h9.C117071c.f350815f     // Catch:{ all -> 0x0181 }
            monitor-exit(r2)
            boolean r2 = r3.mo181028f(r0)
            if (r2 != 0) goto L_0x0190
            boolean r2 = m155228h(r0)
            if (r2 == 0) goto L_0x0184
            java.lang.String r2 = "_nf"
            p545h9.C117072d.m165097a(r9, r2, r10)
            goto L_0x0184
        L_0x0181:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0184:
            com.google.firebase.messaging.RemoteMessage r10 = new com.google.firebase.messaging.RemoteMessage
            r10.<init>(r0)
            r9.mo118228f(r10)
            goto L_0x0190
        L_0x018d:
            r9.mo118227e()
        L_0x0190:
            r2 = 1
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x019c, InterruptedException -> 0x019a, TimeoutException -> 0x0198 }
            com.google.android.gms.tasks.Tasks.await(r1, r2, r10)     // Catch:{ ExecutionException -> 0x019c, InterruptedException -> 0x019a, TimeoutException -> 0x0198 }
            return
        L_0x0198:
            r10 = move-exception
            goto L_0x019d
        L_0x019a:
            r10 = move-exception
            goto L_0x019d
        L_0x019c:
            r10 = move-exception
        L_0x019d:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r10 = r10.length()
            int r10 = r10 + 20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            return
        L_0x01ad:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x01b0:
            r10 = move-exception
            monitor-exit(r3)
            throw r10
        L_0x01b3:
            android.os.Bundle r0 = r10.getExtras()
            boolean r0 = m155228h(r0)
            if (r0 == 0) goto L_0x01c2
            java.lang.String r0 = "_nd"
            p545h9.C117072d.m165097a(r9, r0, r10)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.mo169423d(android.content.Intent):void");
    }

    /* renamed from: e */
    public void mo118227e() {
    }

    /* renamed from: f */
    public void mo118228f(RemoteMessage remoteMessage) {
    }

    /* renamed from: g */
    public void mo118229g(String str, Exception exc) {
    }
}
