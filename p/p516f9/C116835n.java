package p516f9;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.Map;
import p1042u.C111055b;
import p1042u.C111059i;
import p385u2.C111105a;

/* renamed from: f9.n */
public final class C116835n {

    /* renamed from: a */
    public final SharedPreferences f350202a;

    /* renamed from: b */
    public final Context f350203b;

    /* renamed from: c */
    public final C116816d0 f350204c;

    /* renamed from: d */
    public final Map<String, C116818e0> f350205d = new C111055b();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r4 = java.lang.String.valueOf(r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r4.length() != 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        "Error creating file in no backup dir: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116835n(android.content.Context r4) {
        /*
            r3 = this;
            f9.d0 r0 = new f9.d0
            r0.<init>()
            r3.<init>()
            u.b r1 = new u.b
            r1.<init>()
            r3.f350205d = r1
            r3.f350203b = r4
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r2)
            r3.f350202a = r1
            r3.f350204c = r0
            java.lang.String r0 = "com.google.android.gms.appid-no-backup"
            java.lang.Object r2 = p385u2.C111105a.f332697a
            java.io.File r4 = p385u2.C111105a.C111110c.m151512c(r4)
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r0)
            boolean r4 = r2.exists()
            if (r4 != 0) goto L_0x006c
            boolean r4 = r2.createNewFile()     // Catch:{ IOException -> 0x004f }
            if (r4 == 0) goto L_0x006c
            monitor-enter(r3)     // Catch:{ IOException -> 0x004f }
            java.util.Map r4 = r1.getAll()     // Catch:{ all -> 0x004c }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x004c }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004f }
            if (r4 != 0) goto L_0x006c
            r3.mo180829c()     // Catch:{ IOException -> 0x004f }
            com.google.firebase.iid.FirebaseInstanceId r4 = com.google.firebase.iid.FirebaseInstanceId.m155204a()     // Catch:{ IOException -> 0x004f }
            r4.mo169419m()     // Catch:{ IOException -> 0x004f }
            goto L_0x006c
        L_0x004c:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004f }
            throw r4     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r4 = move-exception
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "Error creating file in no backup dir: "
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x006c
            r0.concat(r4)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116835n.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static String m164817a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: d */
    public static String m164818d(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo180828b() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.f350202a     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "topic_operaion_queue"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x0024 }
            int r1 = r0.length     // Catch:{ all -> 0x0024 }
            r3 = 1
            if (r1 <= r3) goto L_0x0022
            r1 = r0[r3]     // Catch:{ all -> 0x0024 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0022
            r0 = r0[r3]     // Catch:{ all -> 0x0024 }
            monitor-exit(r4)
            return r0
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116835n.mo180828b():java.lang.String");
    }

    /* renamed from: c */
    public final synchronized void mo180829c() {
        ((C111059i) this.f350205d).clear();
        Context context = this.f350203b;
        Object obj = C111105a.f332697a;
        File c = C111105a.C111110c.m151512c(context);
        if (c == null || !c.isDirectory()) {
            c = context.getFilesDir();
        }
        for (File file : c.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.f350202a.edit().clear().commit();
    }
}
