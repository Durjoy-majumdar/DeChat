package p516f9;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import j20.C117292a;
import java.io.IOException;

/* renamed from: f9.p */
public final class C116837p implements Runnable {

    /* renamed from: d */
    public final long f350208d;

    /* renamed from: e */
    public final PowerManager.WakeLock f350209e;

    /* renamed from: f */
    public final FirebaseInstanceId f350210f;

    /* renamed from: g */
    public final C116817e f350211g;

    public C116837p(FirebaseInstanceId firebaseInstanceId, C116817e eVar, long j) {
        this.f350210f = firebaseInstanceId;
        this.f350211g = eVar;
        this.f350208d = j;
        FirebaseApp firebaseApp = firebaseInstanceId.f339218a;
        firebaseApp.mo169379d();
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseApp.f339194a.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f350209e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public final boolean mo180830a() {
        C31961o j = this.f350210f.mo169417j();
        if (j != null && !j.mo58437b(this.f350211g.mo180813e())) {
            return true;
        }
        try {
            String k = this.f350210f.mo169418k();
            if (k == null) {
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            if (j == null || !k.equals(j.f85111a)) {
                FirebaseApp firebaseApp = this.f350210f.f339218a;
                firebaseApp.mo169379d();
                Context context = firebaseApp.f339194a;
                Intent intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
                Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
                intent2.setClass(context, FirebaseInstanceIdReceiver.class);
                intent2.putExtra("wrapped_intent", intent);
                context.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Token retrieval failed: ".concat(valueOf);
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r3 = r0[0];
        r0 = r0[1];
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r6 == 83) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r6 == 85) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r3.equals("U") == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r3.equals(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r4 == 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r4 == 1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        r8.f350210f.mo169415g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        r8.f350210f.mo169414f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        com.google.firebase.iid.FirebaseInstanceId.m155206l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r0.length() != 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        "Topic sync failed: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = r1.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0.length != 2) goto L_0x0068;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo180831b() {
        /*
            r8 = this;
        L_0x0000:
            com.google.firebase.iid.FirebaseInstanceId r0 = r8.f350210f
            monitor-enter(r0)
            f9.n r1 = com.google.firebase.iid.FirebaseInstanceId.f339216h     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r1.mo180828b()     // Catch:{ all -> 0x00c0 }
            r2 = 1
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            return r2
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "!"
            java.lang.String[] r0 = r1.split(r0)
            int r3 = r0.length
            r4 = 2
            r5 = 0
            if (r3 != r4) goto L_0x0068
            r3 = r0[r5]
            r0 = r0[r2]
            r4 = -1
            int r6 = r3.hashCode()     // Catch:{ IOException -> 0x0053 }
            r7 = 83
            if (r6 == r7) goto L_0x0036
            r7 = 85
            if (r6 == r7) goto L_0x002c
            goto L_0x003f
        L_0x002c:
            java.lang.String r6 = "U"
            boolean r3 = r3.equals(r6)     // Catch:{ IOException -> 0x0053 }
            if (r3 == 0) goto L_0x003f
            r4 = 1
            goto L_0x003f
        L_0x0036:
            java.lang.String r6 = "S"
            boolean r3 = r3.equals(r6)     // Catch:{ IOException -> 0x0053 }
            if (r3 == 0) goto L_0x003f
            r4 = 0
        L_0x003f:
            if (r4 == 0) goto L_0x004a
            if (r4 == r2) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            com.google.firebase.iid.FirebaseInstanceId r3 = r8.f350210f     // Catch:{ IOException -> 0x0053 }
            r3.mo169415g(r0)     // Catch:{ IOException -> 0x0053 }
            goto L_0x004f
        L_0x004a:
            com.google.firebase.iid.FirebaseInstanceId r3 = r8.f350210f     // Catch:{ IOException -> 0x0053 }
            r3.mo169414f(r0)     // Catch:{ IOException -> 0x0053 }
        L_0x004f:
            com.google.firebase.iid.FirebaseInstanceId.m155206l()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0068
        L_0x0053:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0067
            java.lang.String r2 = "Topic sync failed: "
            r2.concat(r0)
        L_0x0067:
            r2 = 0
        L_0x0068:
            if (r2 != 0) goto L_0x006b
            return r5
        L_0x006b:
            f9.n r0 = com.google.firebase.iid.FirebaseInstanceId.f339216h
            monitor-enter(r0)
            android.content.SharedPreferences r2 = r0.f350202a     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "topic_operaion_queue"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = ","
            int r4 = r1.length()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0085
            java.lang.String r3 = r3.concat(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x008b
        L_0x0085:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00bd }
            r4.<init>(r3)     // Catch:{ all -> 0x00bd }
            r3 = r4
        L_0x008b:
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x00ba
            java.lang.String r3 = ","
            int r4 = r1.length()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x009e
            java.lang.String r1 = r3.concat(r1)     // Catch:{ all -> 0x00bd }
            goto L_0x00a3
        L_0x009e:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00bd }
            r1.<init>(r3)     // Catch:{ all -> 0x00bd }
        L_0x00a3:
            int r1 = r1.length()     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r2.substring(r1)     // Catch:{ all -> 0x00bd }
            android.content.SharedPreferences r2 = r0.f350202a     // Catch:{ all -> 0x00bd }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "topic_operaion_queue"
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)     // Catch:{ all -> 0x00bd }
            r1.apply()     // Catch:{ all -> 0x00bd }
        L_0x00ba:
            monitor-exit(r0)
            goto L_0x0000
        L_0x00bd:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00c0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116837p.mo180831b():boolean");
    }

    /* renamed from: c */
    public final boolean mo180832c() {
        FirebaseApp firebaseApp = this.f350210f.f339218a;
        firebaseApp.mo169379d();
        ConnectivityManager connectivityManager = (ConnectivityManager) firebaseApp.f339194a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        FirebaseInstanceId firebaseInstanceId;
        PowerManager.WakeLock wakeLock = this.f350209e;
        PowerManager.WakeLock wakeLock2 = wakeLock;
        C117292a.m165357c(wakeLock2, "com/google/firebase/iid/zzaq", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        C117292a.m165359e(wakeLock2, "com/google/firebase/iid/zzaq", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        try {
            boolean z = true;
            this.f350210f.mo169413e(true);
            if (this.f350211g.mo180812d() == 0) {
                z = false;
            }
            if (!z) {
                firebaseInstanceId = this.f350210f;
            } else {
                if (!mo180832c()) {
                    C116838q qVar = new C116838q(this);
                    FirebaseInstanceId.m155206l();
                    IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                    FirebaseApp firebaseApp = qVar.f350212a.f350210f.f339218a;
                    firebaseApp.mo169379d();
                    firebaseApp.f339194a.registerReceiver(qVar, intentFilter);
                } else if (!mo180830a() || !mo180831b()) {
                    this.f350210f.mo169412d(this.f350208d);
                } else {
                    firebaseInstanceId = this.f350210f;
                }
            }
            firebaseInstanceId.mo169413e(false);
        } finally {
            PowerManager.WakeLock wakeLock3 = this.f350209e;
            str = "com/google/firebase/iid/zzaq";
            str2 = "run";
            str3 = "()V";
            str4 = "android/os/PowerManager$WakeLock_EXEC_";
            str5 = "release";
            str6 = "()V";
            PowerManager.WakeLock wakeLock4 = wakeLock3;
            C117292a.m165357c(wakeLock4, str, str2, str3, str4, str5, str6);
            wakeLock3.release();
            str7 = "com/google/firebase/iid/zzaq";
            str8 = "run";
            str9 = "()V";
            str10 = "android/os/PowerManager$WakeLock_EXEC_";
            str11 = "release";
            str12 = "()V";
            C117292a.m165359e(wakeLock4, str7, str8, str9, str10, str11, str12);
        }
    }
}
