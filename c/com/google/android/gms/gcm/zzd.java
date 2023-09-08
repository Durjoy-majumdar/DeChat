package com.google.android.gms.gcm;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class zzd {
    public static zzd zzj;
    private final Context zzk;
    private String zzl;
    private final AtomicInteger zzm = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private zzd(Context context) {
        this.zzk = context.getApplicationContext();
    }

    public static synchronized zzd zzd(Context context) {
        zzd zzd;
        synchronized (zzd.class) {
            if (zzj == null) {
                zzj = new zzd(context);
            }
            zzd = zzj;
        }
        return zzd;
    }

    public static String zzd(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r0 = r0.metaData;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle zze() {
        /*
            r3 = this;
            android.content.Context r0 = r3.zzk     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0013 }
            android.content.Context r1 = r3.zzk     // Catch:{ NameNotFoundException -> 0x0013 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0013 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x001b
            android.os.Bundle r0 = r0.metaData
            if (r0 == 0) goto L_0x001b
            return r0
        L_0x001b:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.zzd.zze():android.os.Bundle");
    }

    private final String zze(Bundle bundle, String str) {
        String zzd = zzd(bundle, str);
        if (!TextUtils.isEmpty(zzd)) {
            return zzd;
        }
        String valueOf = String.valueOf(str);
        String zzd2 = zzd(bundle, "_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
        if (TextUtils.isEmpty(zzd2)) {
            return null;
        }
        Resources resources = this.zzk.getResources();
        int identifier = resources.getIdentifier(zzd2, "string", this.zzk.getPackageName());
        if (identifier == 0) {
            String valueOf2 = String.valueOf(str);
            new StringBuilder(String.valueOf(("_loc_key".length() != 0 ? valueOf2.concat("_loc_key") : new String(valueOf2)).substring(6)).length() + 49 + String.valueOf(zzd2).length());
            return null;
        }
        String valueOf3 = String.valueOf(str);
        String zzd3 = zzd(bundle, "_loc_args".length() != 0 ? valueOf3.concat("_loc_args") : new String(valueOf3));
        if (TextUtils.isEmpty(zzd3)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(zzd3);
            int length = jSONArray.length();
            Object[] objArr = new String[length];
            for (int i = 0; i < length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return resources.getString(identifier, objArr);
        } catch (JSONException unused) {
            String valueOf4 = String.valueOf(str);
            new StringBuilder(String.valueOf(("_loc_args".length() != 0 ? valueOf4.concat("_loc_args") : new String(valueOf4)).substring(6)).length() + 41 + String.valueOf(zzd3).length());
            return null;
        } catch (MissingFormatArgumentException unused2) {
            new StringBuilder(String.valueOf(zzd2).length() + 58 + String.valueOf(zzd3).length());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zze(android.os.Bundle r14) {
        /*
            r13 = this;
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r13.zze(r14, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x001c
            android.content.Context r0 = r13.zzk
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            android.content.Context r1 = r13.zzk
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.CharSequence r0 = r0.loadLabel(r1)
        L_0x001c:
            java.lang.String r1 = "gcm.n.body"
            java.lang.String r1 = r13.zze(r14, r1)
            java.lang.String r2 = "gcm.n.icon"
            java.lang.String r2 = zzd(r14, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0061
            android.content.Context r3 = r13.zzk
            android.content.res.Resources r3 = r3.getResources()
            android.content.Context r4 = r13.zzk
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "drawable"
            int r4 = r3.getIdentifier(r2, r5, r4)
            if (r4 == 0) goto L_0x0043
            goto L_0x0073
        L_0x0043:
            android.content.Context r4 = r13.zzk
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "mipmap"
            int r4 = r3.getIdentifier(r2, r5, r4)
            if (r4 == 0) goto L_0x0052
            goto L_0x0073
        L_0x0052:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            int r2 = r2 + 57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L_0x0061:
            android.content.Context r2 = r13.zzk
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.icon
            if (r2 != 0) goto L_0x0072
            r2 = 17301651(0x1080093, float:2.4979667E-38)
            r4 = 17301651(0x1080093, float:2.4979667E-38)
            goto L_0x0073
        L_0x0072:
            r4 = r2
        L_0x0073:
            java.lang.String r2 = "gcm.n.color"
            java.lang.String r2 = zzd(r14, r2)
            java.lang.String r3 = "gcm.n.sound2"
            java.lang.String r3 = zzd(r14, r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            r6 = 0
            if (r5 == 0) goto L_0x0088
            r3 = r6
            goto L_0x00e0
        L_0x0088:
            java.lang.String r5 = "default"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x00db
            android.content.Context r5 = r13.zzk
            android.content.res.Resources r5 = r5.getResources()
            android.content.Context r7 = r13.zzk
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r8 = "raw"
            int r5 = r5.getIdentifier(r3, r8, r7)
            if (r5 == 0) goto L_0x00db
            android.content.Context r5 = r13.zzk
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r7 = r7 + 24
            java.lang.String r8 = java.lang.String.valueOf(r3)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "android.resource://"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = "/raw/"
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            goto L_0x00e0
        L_0x00db:
            r3 = 2
            android.net.Uri r3 = android.media.RingtoneManager.getDefaultUri(r3)
        L_0x00e0:
            java.lang.String r5 = "gcm.n.click_action"
            java.lang.String r5 = zzd(r14, r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x0100
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r5)
            android.content.Context r5 = r13.zzk
            java.lang.String r5 = r5.getPackageName()
            r7.setPackage(r5)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r5)
            goto L_0x0114
        L_0x0100:
            android.content.Context r5 = r13.zzk
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.Context r7 = r13.zzk
            java.lang.String r7 = r7.getPackageName()
            android.content.Intent r7 = r5.getLaunchIntentForPackage(r7)
            if (r7 != 0) goto L_0x0114
            r5 = r6
            goto L_0x0155
        L_0x0114:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>(r14)
            com.google.android.gms.gcm.GcmListenerService.zzd(r5)
            r7.putExtras(r5)
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0127:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0147
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "gcm.n."
            boolean r9 = r8.startsWith(r9)
            if (r9 != 0) goto L_0x0143
            java.lang.String r9 = "gcm.notification."
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0127
        L_0x0143:
            r7.removeExtra(r8)
            goto L_0x0127
        L_0x0147:
            android.content.Context r5 = r13.zzk
            java.util.concurrent.atomic.AtomicInteger r8 = r13.zzm
            int r8 = r8.getAndIncrement()
            r9 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r5, r8, r7, r9)
        L_0x0155:
            boolean r7 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            r8 = 3
            r9 = 1
            if (r7 == 0) goto L_0x0228
            android.content.Context r7 = r13.zzk
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            int r7 = r7.targetSdkVersion
            r10 = 26
            if (r7 < r10) goto L_0x0228
            java.lang.String r7 = "gcm.n.android_channel_id"
            java.lang.String r7 = zzd(r14, r7)
            boolean r10 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            java.lang.String r11 = "fcm_fallback_notification_channel"
            if (r10 != 0) goto L_0x0178
            goto L_0x01da
        L_0x0178:
            android.content.Context r6 = r13.zzk
            java.lang.Class<android.app.NotificationManager> r10 = android.app.NotificationManager.class
            java.lang.Object r6 = r6.getSystemService(r10)
            android.app.NotificationManager r6 = (android.app.NotificationManager) r6
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L_0x019e
            android.app.NotificationChannel r10 = r6.getNotificationChannel(r7)
            if (r10 == 0) goto L_0x018f
            goto L_0x01a2
        L_0x018f:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r7 = r7.length()
            int r7 = r7 + 122
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r7)
        L_0x019e:
            java.lang.String r7 = r13.zzl
            if (r7 == 0) goto L_0x01a4
        L_0x01a2:
            r6 = r7
            goto L_0x01da
        L_0x01a4:
            android.os.Bundle r7 = r13.zze()
            java.lang.String r10 = "com.google.android.gms.gcm.default_notification_channel_id"
            java.lang.String r7 = r7.getString(r10)
            r13.zzl = r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x01c1
            java.lang.String r7 = r13.zzl
            android.app.NotificationChannel r7 = r6.getNotificationChannel(r7)
            if (r7 == 0) goto L_0x01c1
            java.lang.String r6 = r13.zzl
            goto L_0x01da
        L_0x01c1:
            android.app.NotificationChannel r7 = r6.getNotificationChannel(r11)
            if (r7 != 0) goto L_0x01d7
            android.app.NotificationChannel r7 = new android.app.NotificationChannel
            android.content.Context r10 = r13.zzk
            int r12 = com.google.android.gms.gcm.C113375R.string.fd9
            java.lang.String r10 = r10.getString(r12)
            r7.<init>(r11, r10, r8)
            r6.createNotificationChannel(r7)
        L_0x01d7:
            r13.zzl = r11
            r6 = r11
        L_0x01da:
            android.app.Notification$Builder r7 = new android.app.Notification$Builder
            android.content.Context r10 = r13.zzk
            r7.<init>(r10)
            android.app.Notification$Builder r7 = r7.setAutoCancel(r9)
            android.app.Notification$Builder r4 = r7.setSmallIcon(r4)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L_0x01f2
            r4.setContentTitle(r0)
        L_0x01f2:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0207
            r4.setContentText(r1)
            android.app.Notification$BigTextStyle r0 = new android.app.Notification$BigTextStyle
            r0.<init>()
            android.app.Notification$BigTextStyle r0 = r0.bigText(r1)
            r4.setStyle(r0)
        L_0x0207:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0214
            int r0 = android.graphics.Color.parseColor(r2)
            r4.setColor(r0)
        L_0x0214:
            if (r3 == 0) goto L_0x0219
            r4.setSound(r3)
        L_0x0219:
            if (r5 == 0) goto L_0x021e
            r4.setContentIntent(r5)
        L_0x021e:
            if (r6 == 0) goto L_0x0223
            r4.setChannelId(r6)
        L_0x0223:
            android.app.Notification r0 = r4.build()
            goto L_0x0263
        L_0x0228:
            s2.e$c r7 = new s2.e$c
            android.content.Context r10 = r13.zzk
            r7.<init>(r10, r6)
            r6 = 16
            r7.mo124384i(r6, r9)
            android.app.Notification r6 = r7.f258814z
            r6.icon = r4
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0241
            r7.mo124383h(r0)
        L_0x0241:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x024a
            r7.mo124382g(r1)
        L_0x024a:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0256
            int r0 = android.graphics.Color.parseColor(r2)
            r7.f258808t = r0
        L_0x0256:
            if (r3 == 0) goto L_0x025b
            r7.mo124388m(r3)
        L_0x025b:
            if (r5 == 0) goto L_0x025f
            r7.f258795g = r5
        L_0x025f:
            android.app.Notification r0 = r7.mo124378b()
        L_0x0263:
            java.lang.String r1 = "gcm.n.tag"
            java.lang.String r14 = zzd(r14, r1)
            java.lang.String r1 = "GcmNotification"
            android.util.Log.isLoggable(r1, r8)
            android.content.Context r1 = r13.zzk
            java.lang.String r2 = "notification"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 == 0) goto L_0x0295
            long r2 = android.os.SystemClock.uptimeMillis()
            r14 = 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            java.lang.String r14 = "GCM-Notification:"
            r4.append(r14)
            r4.append(r2)
            java.lang.String r14 = r4.toString()
        L_0x0295:
            r2 = 0
            r1.notify(r14, r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.zzd.zze(android.os.Bundle):boolean");
    }
}
