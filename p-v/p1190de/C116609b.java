package p1190de;

import android.app.Notification;
import android.app.NotificationChannel;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import p1177ce.C113310f;
import p723vf.C118672d;
import p981ie.C117165n;

/* renamed from: de.b */
public final class C116609b extends C116608a {

    /* renamed from: b */
    public C117165n.C117167b f349669b;

    /* renamed from: c */
    public String f349670c;

    /* renamed from: d */
    public long f349671d = -1;

    /* renamed from: de.b$a */
    public class C116610a implements C117165n.C117167b {
        public C116610a() {
        }

        /* renamed from: a */
        public void mo180593a(Object obj) {
            if (Build.VERSION.SDK_INT >= 26 && (obj instanceof NotificationChannel)) {
                StringBuilder sb = new StringBuilder();
                sb.append("#onCreateNotificationChannel, id = ");
                NotificationChannel notificationChannel = (NotificationChannel) obj;
                sb.append(notificationChannel.getId());
                sb.append(", name = ");
                sb.append(notificationChannel.getName());
                C118672d.m167353c("Matrix.battery.NotificationMonitorFeature", sb.toString(), new Object[0]);
            }
        }

        /* renamed from: b */
        public void mo180594b(int i, Notification notification) {
            if (notification != null) {
                String string = notification.extras.getString("android.title", (String) null);
                String string2 = notification.extras.getString("android.text", (String) null);
                C118672d.m167353c("Matrix.battery.NotificationMonitorFeature", "#onCreateNotification, id = " + i + ", title = " + string + ", text = " + string2, new Object[0]);
                if (TextUtils.isEmpty(string2)) {
                    C118672d.m167356f("Matrix.battery.NotificationMonitorFeature", "notify with empty text!", new Object[0]);
                    C116609b.this.mo180592i(string, "");
                } else if (string2.equals(C116609b.this.f349670c)) {
                    C118672d.m167356f("Matrix.battery.NotificationMonitorFeature", "notify with appRunningText: " + string2, new Object[0]);
                    C116609b.this.mo180592i(string, string2);
                }
            }
        }
    }

    /* renamed from: de.b$b */
    public class C116611b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f349673d;

        /* renamed from: e */
        public final /* synthetic */ String f349674e;

        /* renamed from: f */
        public final /* synthetic */ String f349675f;

        /* renamed from: g */
        public final /* synthetic */ long f349676g;

        public C116611b(String str, String str2, String str3, long j) {
            this.f349673d = str;
            this.f349674e = str2;
            this.f349675f = str3;
            this.f349676g = j;
        }

        public void run() {
            C116612c cVar = new C116612c();
            cVar.f349678a = this.f349673d;
            cVar.f349679b = this.f349674e;
            cVar.f349680c = this.f349675f;
            cVar.f349681d = this.f349676g;
            C116609b.this.f349668a.mo165853h(cVar);
        }
    }

    /* renamed from: de.b$c */
    public static final class C116612c {

        /* renamed from: a */
        public String f349678a;

        /* renamed from: b */
        public String f349679b;

        /* renamed from: c */
        public String f349680c;

        /* renamed from: d */
        public long f349681d;

        public String toString() {
            return "BadNotification{title='" + this.f349678a + '\'' + ", content='" + this.f349679b + '\'' + ", stack='" + this.f349680c + '\'' + ", bgMillis=" + this.f349681d + '}';
        }
    }

    /* renamed from: de.b$d */
    public interface C116613d {
        /* renamed from: h */
        void mo165853h(C116612c cVar);
    }

    /* renamed from: a */
    public void mo173597a(boolean z) {
        super.mo173597a(z);
        this.f349671d = z ? -1 : SystemClock.uptimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r0.getIdentifier("app_running_notification_text", "string", com.eclipsesource.mmv8.Platform.ANDROID);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111817b() {
        /*
            r5 = this;
            super.mo111817b()
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "app_running_notification_text"
            java.lang.String r2 = "string"
            java.lang.String r3 = "android"
            int r1 = r0.getIdentifier(r1, r2, r3)
            if (r1 <= 0) goto L_0x001a
            java.lang.String r0 = r0.getString(r1)
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r5.f349670c = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "Matrix.battery.NotificationMonitorFeature"
            java.lang.String r2 = "can not get app_running_notification_text, abort notification monitor"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            p723vf.C118672d.m167356f(r0, r2, r1)
            goto L_0x0090
        L_0x002e:
            java.lang.String r0 = "Matrix.battery.NotificationMonitorFeature"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get app_running_notification_text: "
            r2.append(r3)
            java.lang.String r3 = r5.f349670c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            p723vf.C118672d.m167353c(r0, r2, r3)
            de.b$a r0 = new de.b$a
            r0.<init>()
            r5.f349669b = r0
            java.util.List<ie.n$b> r2 = p981ie.C117165n.f351014a
            java.lang.Class<ie.n> r2 = p981ie.C117165n.class
            monitor-enter(r2)
            java.util.List<ie.n$b> r3 = p981ie.C117165n.f351014a     // Catch:{ all -> 0x0091 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0091 }
            boolean r3 = r3.contains(r0)     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x0060
            monitor-exit(r2)
            goto L_0x0090
        L_0x0060:
            java.util.List<ie.n$b> r3 = p981ie.C117165n.f351014a     // Catch:{ all -> 0x0091 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0091 }
            r3.add(r0)     // Catch:{ all -> 0x0091 }
            boolean r0 = p981ie.C117165n.f351015b     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            java.util.List<ie.n$b> r0 = p981ie.C117165n.f351014a     // Catch:{ all -> 0x0091 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0091 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0077
            goto L_0x008f
        L_0x0077:
            ie.u r0 = p981ie.C117165n.f351016c     // Catch:{ all -> 0x0091 }
            boolean r0 = r0.mo122132a()     // Catch:{ all -> 0x0091 }
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0091 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0091 }
            r4[r1] = r0     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "Matrix.battery.NotificationHooker"
            java.lang.String r1 = "checkHook hookRet:%b"
            p723vf.C118672d.m167353c(r0, r1, r4)     // Catch:{ all -> 0x0091 }
            p981ie.C117165n.f351015b = r3     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r2)
        L_0x0090:
            return
        L_0x0091:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1190de.C116609b.mo111817b():void");
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111819f() {
        /*
            r5 = this;
            super.mo111819f()
            ie.n$b r0 = r5.f349669b
            java.util.List<ie.n$b> r1 = p981ie.C117165n.f351014a
            java.lang.Class<ie.n> r1 = p981ie.C117165n.class
            monitor-enter(r1)
            if (r0 != 0) goto L_0x000e
            monitor-exit(r1)
            goto L_0x003f
        L_0x000e:
            java.util.List<ie.n$b> r2 = p981ie.C117165n.f351014a     // Catch:{ all -> 0x0040 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0040 }
            r2.remove(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = p981ie.C117165n.f351015b     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x001a
            goto L_0x003e
        L_0x001a:
            java.util.List<ie.n$b> r0 = p981ie.C117165n.f351014a     // Catch:{ all -> 0x0040 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0025
            goto L_0x003e
        L_0x0025:
            ie.u r0 = p981ie.C117165n.f351016c     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.mo122133b()     // Catch:{ all -> 0x0040 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0040 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0040 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "Matrix.battery.NotificationHooker"
            java.lang.String r4 = "checkUnHook unHookRet:%b"
            p723vf.C118672d.m167353c(r0, r4, r2)     // Catch:{ all -> 0x0040 }
            p981ie.C117165n.f351015b = r3     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r1)
        L_0x003f:
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1190de.C116609b.mo111819f():void");
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.NotificationMonitorFeature";
    }

    /* renamed from: i */
    public void mo180592i(String str, String str2) {
        long j = 0;
        if (this.f349671d > 0) {
            j = SystemClock.uptimeMillis() - this.f349671d;
        }
        long j2 = j;
        C113310f fVar = this.f349668a.f339057d;
        this.f349668a.f339059f.post(new C116611b(str, str2, fVar.f339048s ? fVar.f339026A.mo122130b() : "", j2));
    }
}
