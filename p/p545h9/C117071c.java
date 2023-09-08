package p545h9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h9.c */
public final class C117071c {

    /* renamed from: f */
    public static C117071c f350815f;

    /* renamed from: a */
    public final Context f350816a;

    /* renamed from: b */
    public Bundle f350817b;

    /* renamed from: c */
    public Method f350818c;

    /* renamed from: d */
    public Method f350819d;

    /* renamed from: e */
    public final AtomicInteger f350820e = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public C117071c(Context context) {
        this.f350816a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static String m165091a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: b */
    public static void m165092b(Intent intent, Bundle bundle) {
        for (String next : bundle.keySet()) {
            if (next.startsWith("google.c.a.") || next.equals("from")) {
                intent.putExtra(next, bundle.getString(next));
            }
        }
    }

    /* renamed from: c */
    public final Bundle mo181025c() {
        Bundle bundle;
        Bundle bundle2 = this.f350817b;
        if (bundle2 != null) {
            return bundle2;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.f350816a.getPackageManager().getApplicationInfo(this.f350816a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return Bundle.EMPTY;
        }
        this.f350817b = bundle;
        return bundle;
    }

    /* renamed from: d */
    public final boolean mo181026d(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(this.f350816a.getResources().getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1 A[SYNTHETIC, Splitter:B:27:0x00c1] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo181027e(android.os.Bundle r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = m165091a(r12, r13)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r1 = "_loc_key"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r0 = m165091a(r12, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0021
            return r3
        L_0x0021:
            android.content.Context r2 = r11.f350816a
            android.content.res.Resources r2 = r2.getResources()
            android.content.Context r4 = r11.f350816a
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "string"
            int r4 = r2.getIdentifier(r0, r5, r4)
            r5 = 6
            if (r4 != 0) goto L_0x0068
            java.lang.String r12 = java.lang.String.valueOf(r13)
            int r13 = r1.length()
            if (r13 == 0) goto L_0x0045
            java.lang.String r12 = r12.concat(r1)
            goto L_0x004b
        L_0x0045:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r12)
            r12 = r13
        L_0x004b:
            java.lang.String r12 = r12.substring(r5)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = r12.length()
            int r12 = r12 + 49
            java.lang.String r13 = java.lang.String.valueOf(r0)
            int r13 = r13.length()
            int r12 = r12 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            return r3
        L_0x0068:
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r6 = "_loc_args"
            java.lang.String r1 = r1.concat(r6)
            java.lang.String r12 = m165091a(r12, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L_0x007e
        L_0x007c:
            r8 = r3
            goto L_0x00ba
        L_0x007e:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0095 }
            r1.<init>(r12)     // Catch:{ JSONException -> 0x0095 }
            int r7 = r1.length()     // Catch:{ JSONException -> 0x0095 }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ JSONException -> 0x0095 }
            r9 = 0
        L_0x008a:
            if (r9 >= r7) goto L_0x00ba
            java.lang.Object r10 = r1.opt(r9)     // Catch:{ JSONException -> 0x0095 }
            r8[r9] = r10     // Catch:{ JSONException -> 0x0095 }
            int r9 = r9 + 1
            goto L_0x008a
        L_0x0095:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r13.concat(r6)
            java.lang.String r13 = r13.substring(r5)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r13 = r13.length()
            int r13 = r13 + 41
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = r12.length()
            int r13 = r13 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r13)
            goto L_0x007c
        L_0x00ba:
            if (r8 != 0) goto L_0x00c1
            java.lang.String r12 = r2.getString(r4)
            return r12
        L_0x00c1:
            java.lang.String r12 = r2.getString(r4, r8)     // Catch:{ MissingFormatArgumentException -> 0x00c6 }
            return r12
        L_0x00c6:
            java.lang.String r12 = java.util.Arrays.toString(r8)
            java.lang.String r13 = java.lang.String.valueOf(r0)
            int r13 = r13.length()
            int r13 = r13 + 58
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r12 = r12.length()
            int r13 = r13 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p545h9.C117071c.mo181027e(android.os.Bundle, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105 A[SYNTHETIC, Splitter:B:47:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129 A[SYNTHETIC, Splitter:B:53:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0212  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo181028f(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "gcm.n.noui"
            java.lang.String r3 = m165091a(r1, r3)
            java.lang.String r4 = "1"
            boolean r3 = r4.equals(r3)
            r4 = 1
            if (r3 == 0) goto L_0x0016
            return r4
        L_0x0016:
            android.content.Context r3 = r0.f350816a
            java.lang.String r5 = "keyguard"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            boolean r3 = r3.inKeyguardRestrictedInputMode()
            r5 = 0
            if (r3 != 0) goto L_0x0062
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r3 != 0) goto L_0x0032
            r6 = 10
            android.os.SystemClock.sleep(r6)
        L_0x0032:
            int r3 = android.os.Process.myPid()
            android.content.Context r6 = r0.f350816a
            java.lang.String r7 = "activity"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L_0x0062
            java.util.Iterator r6 = r6.iterator()
        L_0x004a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0062
            java.lang.Object r7 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7
            int r8 = r7.pid
            if (r8 != r3) goto L_0x004a
            int r3 = r7.importance
            r6 = 100
            if (r3 != r6) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r3 == 0) goto L_0x0066
            return r5
        L_0x0066:
            java.lang.String r3 = "gcm.n.title"
            java.lang.String r3 = r0.mo181027e(r1, r3)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x0082
            android.content.Context r3 = r0.f350816a
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            android.content.Context r6 = r0.f350816a
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.CharSequence r3 = r3.loadLabel(r6)
        L_0x0082:
            java.lang.String r6 = "gcm.n.body"
            java.lang.String r6 = r0.mo181027e(r1, r6)
            java.lang.String r7 = "gcm.n.icon"
            java.lang.String r7 = m165091a(r1, r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00d3
            android.content.Context r8 = r0.f350816a
            android.content.res.Resources r8 = r8.getResources()
            android.content.Context r9 = r0.f350816a
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r10 = "drawable"
            int r9 = r8.getIdentifier(r7, r10, r9)
            if (r9 == 0) goto L_0x00af
            boolean r10 = r0.mo181026d(r9)
            if (r10 == 0) goto L_0x00af
            goto L_0x00f9
        L_0x00af:
            android.content.Context r9 = r0.f350816a
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r10 = "mipmap"
            int r9 = r8.getIdentifier(r7, r10, r9)
            if (r9 == 0) goto L_0x00c4
            boolean r8 = r0.mo181026d(r9)
            if (r8 == 0) goto L_0x00c4
            goto L_0x00f9
        L_0x00c4:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r7 = r7.length()
            int r7 = r7 + 61
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
        L_0x00d3:
            android.os.Bundle r7 = r18.mo181025c()
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_icon"
            int r7 = r7.getInt(r8, r5)
            if (r7 == 0) goto L_0x00e5
            boolean r8 = r0.mo181026d(r7)
            if (r8 != 0) goto L_0x00ed
        L_0x00e5:
            android.content.Context r7 = r0.f350816a
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            int r7 = r7.icon
        L_0x00ed:
            r9 = r7
            if (r9 == 0) goto L_0x00f6
            boolean r7 = r0.mo181026d(r9)
            if (r7 != 0) goto L_0x00f9
        L_0x00f6:
            r9 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x00f9:
            java.lang.String r7 = "gcm.n.color"
            java.lang.String r7 = m165091a(r1, r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x011d
            int r8 = android.graphics.Color.parseColor(r7)     // Catch:{ IllegalArgumentException -> 0x010e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalArgumentException -> 0x010e }
            goto L_0x0136
        L_0x010e:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r7 = r7.length()
            int r7 = r7 + 54
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
        L_0x011d:
            android.os.Bundle r7 = r18.mo181025c()
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_color"
            int r7 = r7.getInt(r8, r5)
            if (r7 == 0) goto L_0x0135
            android.content.Context r8 = r0.f350816a     // Catch:{ NotFoundException -> 0x0134 }
            int r7 = p385u2.C111105a.m151500b(r8, r7)     // Catch:{ NotFoundException -> 0x0134 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NotFoundException -> 0x0134 }
            goto L_0x0136
        L_0x0134:
        L_0x0135:
            r7 = 0
        L_0x0136:
            java.lang.String r8 = "gcm.n.sound2"
            java.lang.String r8 = m165091a(r1, r8)
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 == 0) goto L_0x0148
            java.lang.String r8 = "gcm.n.sound"
            java.lang.String r8 = m165091a(r1, r8)
        L_0x0148:
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            r12 = 2
            if (r11 == 0) goto L_0x0151
            r8 = 0
            goto L_0x01a8
        L_0x0151:
            java.lang.String r11 = "default"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01a4
            android.content.Context r11 = r0.f350816a
            android.content.res.Resources r11 = r11.getResources()
            android.content.Context r13 = r0.f350816a
            java.lang.String r13 = r13.getPackageName()
            java.lang.String r14 = "raw"
            int r11 = r11.getIdentifier(r8, r14, r13)
            if (r11 == 0) goto L_0x01a4
            android.content.Context r11 = r0.f350816a
            java.lang.String r11 = r11.getPackageName()
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r13 = r13.length()
            int r13 = r13 + 24
            java.lang.String r14 = java.lang.String.valueOf(r8)
            int r14 = r14.length()
            int r13 = r13 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            java.lang.String r13 = "android.resource://"
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = "/raw/"
            r14.append(r11)
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x01a8
        L_0x01a4:
            android.net.Uri r8 = android.media.RingtoneManager.getDefaultUri(r12)
        L_0x01a8:
            java.lang.String r11 = "gcm.n.click_action"
            java.lang.String r11 = m165091a(r1, r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L_0x01c8
            android.content.Intent r13 = new android.content.Intent
            r13.<init>(r11)
            android.content.Context r11 = r0.f350816a
            java.lang.String r11 = r11.getPackageName()
            r13.setPackage(r11)
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            r13.setFlags(r11)
            goto L_0x020c
        L_0x01c8:
            java.lang.String r11 = "gcm.n.link_android"
            java.lang.String r11 = m165091a(r1, r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 == 0) goto L_0x01da
            java.lang.String r11 = "gcm.n.link"
            java.lang.String r11 = m165091a(r1, r11)
        L_0x01da:
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L_0x01e5
            android.net.Uri r11 = android.net.Uri.parse(r11)
            goto L_0x01e6
        L_0x01e5:
            r11 = 0
        L_0x01e6:
            if (r11 == 0) goto L_0x01fc
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r14 = "android.intent.action.VIEW"
            r13.<init>(r14)
            android.content.Context r14 = r0.f350816a
            java.lang.String r14 = r14.getPackageName()
            r13.setPackage(r14)
            r13.setData(r11)
            goto L_0x020c
        L_0x01fc:
            android.content.Context r11 = r0.f350816a
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            android.content.Context r13 = r0.f350816a
            java.lang.String r13 = r13.getPackageName()
            android.content.Intent r13 = r11.getLaunchIntentForPackage(r13)
        L_0x020c:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r13 != 0) goto L_0x0212
            r10 = 0
            goto L_0x027a
        L_0x0212:
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            r13.addFlags(r14)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r1)
            java.util.Queue<java.lang.String> r15 = com.google.firebase.messaging.FirebaseMessagingService.f339240i
            java.util.Set r15 = r14.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0226:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0243
            java.lang.Object r16 = r15.next()
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0226
            java.lang.String r12 = "google.c."
            boolean r10 = r10.startsWith(r12)
            if (r10 == 0) goto L_0x0241
            r15.remove()
        L_0x0241:
            r12 = 2
            goto L_0x0226
        L_0x0243:
            r13.putExtras(r14)
            java.util.Set r10 = r14.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x024e:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x026e
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r14 = "gcm.n."
            boolean r14 = r12.startsWith(r14)
            if (r14 != 0) goto L_0x026a
            java.lang.String r14 = "gcm.notification."
            boolean r14 = r12.startsWith(r14)
            if (r14 == 0) goto L_0x024e
        L_0x026a:
            r13.removeExtra(r12)
            goto L_0x024e
        L_0x026e:
            android.content.Context r10 = r0.f350816a
            java.util.concurrent.atomic.AtomicInteger r12 = r0.f350820e
            int r12 = r12.incrementAndGet()
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r10, r12, r13, r11)
        L_0x027a:
            boolean r12 = com.google.firebase.messaging.FirebaseMessagingService.m155228h(r19)
            if (r12 == 0) goto L_0x02d2
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r12.<init>(r13)
            m165092b(r12, r1)
            java.lang.String r13 = "pending_intent"
            r12.putExtra(r13, r10)
            android.content.Context r10 = r0.f350816a
            java.util.concurrent.atomic.AtomicInteger r13 = r0.f350820e
            int r13 = r13.incrementAndGet()
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r15 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            r14.<init>(r10, r15)
            java.lang.String r15 = "com.google.firebase.MESSAGING_EVENT"
            r14.setAction(r15)
            java.lang.String r5 = "wrapped_intent"
            r14.putExtra(r5, r12)
            android.app.PendingIntent r10 = android.app.PendingIntent.getBroadcast(r10, r13, r14, r11)
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r12.<init>(r13)
            m165092b(r12, r1)
            android.content.Context r13 = r0.f350816a
            java.util.concurrent.atomic.AtomicInteger r14 = r0.f350820e
            int r14 = r14.incrementAndGet()
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r11 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            r4.<init>(r13, r11)
            r4.setAction(r15)
            r4.putExtra(r5, r12)
            r5 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r13, r14, r4, r5)
            goto L_0x02d3
        L_0x02d2:
            r4 = 0
        L_0x02d3:
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r5 == 0) goto L_0x0448
            android.content.Context r5 = r0.f350816a
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.targetSdkVersion
            r12 = 25
            if (r5 <= r12) goto L_0x0448
            java.lang.String r5 = "gcm.n.android_channel_id"
            java.lang.String r5 = m165091a(r1, r5)
            java.lang.String r12 = "fcm_fallback_notification_channel"
            boolean r13 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r13 != 0) goto L_0x02f5
            goto L_0x03c0
        L_0x02f5:
            android.content.Context r13 = r0.f350816a
            java.lang.Class<android.app.NotificationManager> r14 = android.app.NotificationManager.class
            java.lang.Object r13 = r13.getSystemService(r14)
            android.app.NotificationManager r13 = (android.app.NotificationManager) r13
            java.lang.reflect.Method r14 = r0.f350819d     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            if (r14 != 0) goto L_0x0315
            java.lang.Class r14 = r13.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.String r15 = "getNotificationChannel"
            r11 = 1
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 0
            r1[r11] = r2     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.reflect.Method r1 = r14.getMethod(r15, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r0.f350819d = r1     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
        L_0x0315:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            if (r1 != 0) goto L_0x033a
            java.lang.reflect.Method r1 = r0.f350819d     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 1
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 0
            r14[r11] = r5     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Object r1 = r1.invoke(r13, r14)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            if (r1 == 0) goto L_0x032b
            goto L_0x03c1
        L_0x032b:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            int r1 = r1.length()     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            int r1 = r1 + 122
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r5.<init>(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
        L_0x033a:
            android.os.Bundle r1 = r18.mo181025c()     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.String r5 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            if (r1 != 0) goto L_0x0359
            java.lang.reflect.Method r1 = r0.f350819d     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 1
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 0
            r14[r11] = r5     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Object r1 = r1.invoke(r13, r14)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            if (r1 == 0) goto L_0x0359
            goto L_0x03c1
        L_0x0359:
            java.lang.reflect.Method r1 = r0.f350819d     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r5 = 1
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r5 = 0
            r11[r5] = r12     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Object r1 = r1.invoke(r13, r11)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            if (r1 != 0) goto L_0x03ba
            java.lang.String r1 = "android.app.NotificationChannel"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r5 = 3
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r5 = 0
            r11[r5] = r2     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Class<java.lang.CharSequence> r5 = java.lang.CharSequence.class
            r14 = 1
            r11[r14] = r5     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r14 = 2
            r11[r14] = r5     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.reflect.Constructor r5 = r1.getConstructor(r11)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 3
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r15 = 0
            r14[r15] = r12     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            android.content.Context r15 = r0.f350816a     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 2131825829(0x7f1114a5, float:1.9284525E38)
            java.lang.String r11 = r15.getString(r11)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r15 = 1
            r14[r15] = r11     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11 = 2
            r14[r11] = r15     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Object r5 = r5.newInstance(r14)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Class r11 = r13.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.String r14 = "createNotificationChannel"
            r16 = r12
            r15 = 1
            java.lang.Class[] r12 = new java.lang.Class[r15]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r17 = 0
            r12[r17] = r1     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.reflect.Method r1 = r11.getMethod(r14, r12)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r11[r17] = r5     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            r1.invoke(r13, r11)     // Catch:{ ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException -> 0x03bf }
            goto L_0x03bc
        L_0x03ba:
            r16 = r12
        L_0x03bc:
            r5 = r16
            goto L_0x03c1
        L_0x03bf:
        L_0x03c0:
            r5 = 0
        L_0x03c1:
            android.app.Notification$Builder r1 = new android.app.Notification$Builder
            android.content.Context r11 = r0.f350816a
            r1.<init>(r11)
            r11 = 1
            android.app.Notification$Builder r1 = r1.setAutoCancel(r11)
            android.app.Notification$Builder r1 = r1.setSmallIcon(r9)
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 != 0) goto L_0x03da
            r1.setContentTitle(r3)
        L_0x03da:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x03ef
            r1.setContentText(r6)
            android.app.Notification$BigTextStyle r3 = new android.app.Notification$BigTextStyle
            r3.<init>()
            android.app.Notification$BigTextStyle r3 = r3.bigText(r6)
            r1.setStyle(r3)
        L_0x03ef:
            if (r7 == 0) goto L_0x03f8
            int r3 = r7.intValue()
            r1.setColor(r3)
        L_0x03f8:
            if (r8 == 0) goto L_0x03fd
            r1.setSound(r8)
        L_0x03fd:
            if (r10 == 0) goto L_0x0402
            r1.setContentIntent(r10)
        L_0x0402:
            if (r4 == 0) goto L_0x0407
            r1.setDeleteIntent(r4)
        L_0x0407:
            if (r5 == 0) goto L_0x0443
            java.lang.reflect.Method r3 = r0.f350818c
            if (r3 != 0) goto L_0x041f
            java.lang.String r3 = "setChannelId"
            java.lang.Class<android.app.Notification$Builder> r4 = android.app.Notification.Builder.class
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException | SecurityException -> 0x041c }
            r6 = 0
            r7[r6] = r2     // Catch:{ NoSuchMethodException | SecurityException -> 0x041c }
            java.lang.reflect.Method r3 = r4.getMethod(r3, r7)     // Catch:{ NoSuchMethodException | SecurityException -> 0x041c }
            goto L_0x041d
        L_0x041c:
            r3 = 0
        L_0x041d:
            r0.f350818c = r3
        L_0x041f:
            java.lang.reflect.Method r3 = r0.f350818c
            if (r3 != 0) goto L_0x0435
            java.lang.String r3 = "setChannel"
            java.lang.Class<android.app.Notification$Builder> r4 = android.app.Notification.Builder.class
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException | SecurityException -> 0x0432 }
            r6 = 0
            r7[r6] = r2     // Catch:{ NoSuchMethodException | SecurityException -> 0x0432 }
            java.lang.reflect.Method r10 = r4.getMethod(r3, r7)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0432 }
            goto L_0x0433
        L_0x0432:
            r10 = 0
        L_0x0433:
            r0.f350818c = r10
        L_0x0435:
            java.lang.reflect.Method r2 = r0.f350818c
            if (r2 != 0) goto L_0x043a
            goto L_0x0443
        L_0x043a:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException -> 0x0443 }
            r3 = 0
            r4[r3] = r5     // Catch:{ IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException -> 0x0443 }
            r2.invoke(r1, r4)     // Catch:{ IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException -> 0x0443 }
        L_0x0443:
            android.app.Notification r1 = r1.build()
            goto L_0x0495
        L_0x0448:
            s2.e$c r1 = new s2.e$c
            android.content.Context r2 = r0.f350816a
            r5 = 0
            r1.<init>(r2, r5)
            r2 = 16
            r5 = 1
            r1.mo124384i(r2, r5)
            android.app.Notification r2 = r1.f258814z
            r2.icon = r9
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0463
            r1.mo124383h(r3)
        L_0x0463:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x047a
            r1.mo124382g(r6)
            s2.e$b r2 = new s2.e$b
            r2.<init>()
            java.lang.CharSequence r3 = p918s2.C90116e.C90121c.m112748d(r6)
            r2.f258770b = r3
            r1.mo124389n(r2)
        L_0x047a:
            if (r7 == 0) goto L_0x0482
            int r2 = r7.intValue()
            r1.f258808t = r2
        L_0x0482:
            if (r8 == 0) goto L_0x0487
            r1.mo124388m(r8)
        L_0x0487:
            if (r10 == 0) goto L_0x048b
            r1.f258795g = r10
        L_0x048b:
            if (r4 == 0) goto L_0x0491
            android.app.Notification r2 = r1.f258814z
            r2.deleteIntent = r4
        L_0x0491:
            android.app.Notification r1 = r1.mo124378b()
        L_0x0495:
            java.lang.String r2 = "gcm.n.tag"
            r3 = r19
            java.lang.String r2 = m165091a(r3, r2)
            java.lang.String r3 = "FirebaseMessaging"
            r4 = 3
            android.util.Log.isLoggable(r3, r4)
            android.content.Context r3 = r0.f350816a
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x04ca
            long r4 = android.os.SystemClock.uptimeMillis()
            r2 = 37
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            java.lang.String r2 = "FCM-Notification:"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
        L_0x04ca:
            r4 = 0
            r3.notify(r2, r4, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p545h9.C117071c.mo181028f(android.os.Bundle):boolean");
    }
}
