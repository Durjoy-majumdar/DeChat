package com.tencent.p014mm.recovery;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.p014mm.recovery.p952ui.RecoveryUI;
import com.tencent.p014mm.recoveryv2.C85662a;
import com.tencent.p014mm.recoveryv2.C85671c;
import com.tencent.p014mm.recoveryv2.RecoveryCrash;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.recovery.p477wx.service.WXRecoveryUploadService;
import df3.C86273b;
import java.lang.Thread;
import lg3.C88496e;

/* renamed from: com.tencent.mm.recovery.RecoveryInitializer */
public class RecoveryInitializer {
    private static final int RECOVERY_SETTING_DEBUG = 30000;
    private static final String TAG = "MicroMsg.recovery.initializer";

    /* renamed from: com.tencent.mm.recovery.RecoveryInitializer$a */
    public class C85656a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Context f249618a;

        public C85656a(Context context) {
            this.f249618a = context;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            C85671c.m105785c(RecoveryInitializer.TAG, "recovery process crash, thread = " + thread.getName(), th);
            C85671c.m105783a(this.f249618a);
        }
    }

    /* renamed from: com.tencent.mm.recovery.RecoveryInitializer$b */
    public class C85657b implements MMApplicationContext.IResourceProvider {

        /* renamed from: a */
        public final /* synthetic */ Context f249619a;

        public C85657b(Context context) {
            this.f249619a = context;
        }

        public Resources getResources() {
            return C88496e.m110361d(this.f249619a.getResources(), this.f249619a, true);
        }
    }

    /* renamed from: com.tencent.mm.recovery.RecoveryInitializer$c */
    public class C85658c implements C86273b {
        /* renamed from: a */
        public void mo119225a(Context context, RecoveryCrash recoveryCrash, int i) {
            Log.m105920e(RecoveryInitializer.TAG, "onRecovery, level = " + i);
        }
    }

    /* renamed from: com.tencent.mm.recovery.RecoveryInitializer$d */
    public class C85659d implements C86273b {
        /* renamed from: a */
        public void mo119225a(Context context, RecoveryCrash recoveryCrash, int i) {
            Log.m105920e(RecoveryInitializer.TAG, "onRecovery, level = " + i);
        }
    }

    /* renamed from: com.tencent.mm.recovery.RecoveryInitializer$e */
    public class C85660e extends C85662a.C85665c {
        /* renamed from: d */
        public Class<? extends Activity> mo119226d() {
            return RecoveryUI.class;
        }

        /* renamed from: e */
        public Class<? extends Service> mo119227e() {
            return WXRecoveryUploadService.class;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x017d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017e A[SYNTHETIC, Splitter:B:48:0x017e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean init(android.content.Context r10) {
        /*
            java.lang.String r0 = "MicroMsg.recovery"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "getRemoteService"
            java.lang.String r3 = "(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V"
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.add(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "com/google/android/gms/common/internal/BaseGmsClient"
            r2.put(r3, r1)
            i20.a r1 = i20.C21043a.m23197h()
            af3.d$a r3 = new af3.d$a
            r3.<init>(r10)
            r1.mo32757k(r2, r3)
            java.lang.String r1 = ":recovery"
            boolean r2 = com.tencent.p014mm.recoveryv2.C85689j.m105830d(r10, r1)
            r3 = 0
            java.lang.String r4 = "MicroMsg.recovery.initializer"
            if (r2 == 0) goto L_0x00b7
            com.tencent.mm.recovery.RecoveryInitializer$a r0 = new com.tencent.mm.recovery.RecoveryInitializer$a
            r0.<init>(r10)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.setContext(r10)     // Catch:{ all -> 0x00ac }
            com.tencent.mm.recovery.RecoveryInitializer$b r0 = new com.tencent.mm.recovery.RecoveryInitializer$b     // Catch:{ all -> 0x004a }
            r0.<init>(r10)     // Catch:{ all -> 0x004a }
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.setResourcesProvider(r0)     // Catch:{ all -> 0x004a }
            com.tencent.p014mm.sdk.platformtools.LocaleUtil.initLanguage(r10)     // Catch:{ all -> 0x004a }
            goto L_0x0050
        L_0x004a:
            r0 = move-exception
            java.lang.String r2 = "init MMResources fail"
            com.tencent.p014mm.recoveryv2.C85671c.m105785c(r4, r2, r0)     // Catch:{ all -> 0x00ac }
        L_0x0050:
            j40.b r0 = new j40.b     // Catch:{ all -> 0x00ac }
            com.tencent.tinker.entry.ApplicationLike r2 = com.tencent.p014mm.app.C80589e.f235760a     // Catch:{ all -> 0x00ac }
            android.app.Application r2 = r2.getApplication()     // Catch:{ all -> 0x00ac }
            com.tencent.tinker.entry.ApplicationLike r5 = com.tencent.p014mm.app.C80589e.f235760a     // Catch:{ all -> 0x00ac }
            r0.<init>(r1, r2, r5)     // Catch:{ all -> 0x00ac }
            android.app.Application r1 = r0.f124990c     // Catch:{ all -> 0x00ac }
            com.tencent.mm.booter.k0 r2 = new com.tencent.mm.booter.k0     // Catch:{ all -> 0x00ac }
            r2.<init>()     // Catch:{ all -> 0x00ac }
            zt3.C119154h.m168040a(r1, r2)     // Catch:{ all -> 0x00ac }
            android.app.Application r1 = r0.f124990c     // Catch:{ all -> 0x00ac }
            com.tencent.mm.booter.d r1 = com.tencent.p014mm.booter.C80814d.m98665b(r1)     // Catch:{ all -> 0x00ac }
            r0.f254268g = r1     // Catch:{ all -> 0x00ac }
            f40.C86709a0.m107527g(r0)     // Catch:{ all -> 0x00ac }
            com.tencent.p014mm.vfs.C116281f0.m163819m(r10)     // Catch:{ all -> 0x00ac }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00ac }
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler     // Catch:{ all -> 0x00ac }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00ac }
            r1.<init>((android.os.Looper) r2)     // Catch:{ all -> 0x00ac }
            com.tencent.mars.comm.PlatformComm.init(r0, r1)     // Catch:{ all -> 0x00ac }
            eb0.C116734h6.m164652h()     // Catch:{ all -> 0x00ac }
            af3.C79525e.m96549d(r10)     // Catch:{ all -> 0x00ac }
            com.tencent.mm.recoveryv2.l r0 = com.tencent.p014mm.recoveryv2.C85695l.m105842a()     // Catch:{ all -> 0x00ac }
            af3.a r1 = new af3.a     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "diagnostic_storage"
            r1.<init>(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "diagnostic_mmkv_reset"
            r0.mo119283d(r2, r1)     // Catch:{ all -> 0x00ac }
            com.tencent.mm.recoveryv2.l r0 = com.tencent.p014mm.recoveryv2.C85695l.m105842a()     // Catch:{ all -> 0x00ac }
            af3.b r1 = new af3.b     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "jectl_config"
            r1.<init>(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "jectl_mmkv_reset"
            r0.mo119283d(r2, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x00b6
        L_0x00ac:
            r0 = move-exception
            java.lang.String r1 = "recovery process init error"
            com.tencent.p014mm.recoveryv2.C85671c.m105785c(r4, r1, r0)
            com.tencent.p014mm.recoveryv2.C85671c.m105783a(r10)
        L_0x00b6:
            return r3
        L_0x00b7:
            java.lang.String r1 = ""
            boolean r2 = com.tencent.p014mm.recoveryv2.C85689j.m105830d(r10, r1)
            r5 = 1
            if (r2 != 0) goto L_0x00c1
            return r5
        L_0x00c1:
            com.tencent.mm.recoveryv2.e r2 = new com.tencent.mm.recoveryv2.e
            r2.<init>(r10)
            r6 = 0
            r2.f249650e = r6
            r2.mo119259a()
            com.tencent.mm.recoveryv2.l r2 = com.tencent.p014mm.recoveryv2.C85695l.m105842a()
            if (r10 == 0) goto L_0x00d6
            r2.f249697a = r10
            goto L_0x00d9
        L_0x00d6:
            r2.getClass()
        L_0x00d9:
            com.tencent.mm.recovery.RecoveryInitializer$e r6 = new com.tencent.mm.recovery.RecoveryInitializer$e
            r6.<init>()
            com.tencent.mm.recoveryv2.f r7 = r2.f249698b
            if (r7 != 0) goto L_0x00ed
            com.tencent.mm.recoveryv2.f$b r7 = new com.tencent.mm.recoveryv2.f$b
            android.content.Context r8 = r2.mo119281b()
            r7.<init>(r8)
            r2.f249698b = r7
        L_0x00ed:
            com.tencent.mm.recoveryv2.f r7 = r2.f249698b
            com.tencent.mm.recoveryv2.f$a r7 = (com.tencent.p014mm.recoveryv2.C85678f.C85679a) r7
            java.util.concurrent.atomic.AtomicReference<com.tencent.mm.recoveryv2.a> r8 = r7.f249664c
            com.tencent.mm.recoveryv2.e r7 = r7.f249671j
            r6.f249633a = r7
            r8.set(r6)
            com.tencent.mm.recovery.RecoveryInitializer$d r6 = new com.tencent.mm.recovery.RecoveryInitializer$d
            r6.<init>()
            com.tencent.mm.recoveryv2.f r7 = r2.f249698b
            if (r7 != 0) goto L_0x010e
            com.tencent.mm.recoveryv2.f$b r7 = new com.tencent.mm.recoveryv2.f$b
            android.content.Context r8 = r2.mo119281b()
            r7.<init>(r8)
            r2.f249698b = r7
        L_0x010e:
            com.tencent.mm.recoveryv2.f r7 = r2.f249698b
            com.tencent.mm.recoveryv2.f$a r7 = (com.tencent.p014mm.recoveryv2.C85678f.C85679a) r7
            android.util.SparseArray<java.util.List<df3.b>> r7 = r7.f249665d
            java.lang.Object r7 = r7.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x011f
            r7.add(r6)
        L_0x011f:
            r6 = 2
            com.tencent.mm.recovery.RecoveryInitializer$c r7 = new com.tencent.mm.recovery.RecoveryInitializer$c
            r7.<init>()
            com.tencent.mm.recoveryv2.f r8 = r2.f249698b
            if (r8 != 0) goto L_0x0134
            com.tencent.mm.recoveryv2.f$b r8 = new com.tencent.mm.recoveryv2.f$b
            android.content.Context r9 = r2.mo119281b()
            r8.<init>(r9)
            r2.f249698b = r8
        L_0x0134:
            com.tencent.mm.recoveryv2.f r2 = r2.f249698b
            com.tencent.mm.recoveryv2.f$a r2 = (com.tencent.p014mm.recoveryv2.C85678f.C85679a) r2
            android.util.SparseArray<java.util.List<df3.b>> r2 = r2.f249665d
            java.lang.Object r2 = r2.get(r6)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0145
            r2.add(r7)
        L_0x0145:
            r2 = 5
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0161 }
            java.lang.String r7 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Exception -> 0x0161 }
            java.io.File r7 = android.os.Environment.getExternalStoragePublicDirectory(r7)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r8 = "Weixin/recovery_quit"
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0161 }
            boolean r6 = r6.exists()     // Catch:{ Exception -> 0x0161 }
            if (r6 == 0) goto L_0x017a
            java.lang.String r6 = "skip recovery for quit flag"
            com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r2, r0, r6)     // Catch:{ Exception -> 0x0161 }
            r2 = 1
            goto L_0x017b
        L_0x0161:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "check recovery quit flag err: "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r2, r0, r6)
        L_0x017a:
            r2 = 0
        L_0x017b:
            if (r2 == 0) goto L_0x017e
            return r5
        L_0x017e:
            boolean r3 = isStartWithActivity(r10)     // Catch:{ all -> 0x0183 }
            goto L_0x0189
        L_0x0183:
            r10 = move-exception
            java.lang.String r2 = "check isStartWithActivity error"
            com.tencent.p014mm.recoveryv2.C85671c.m105785c(r4, r2, r10)
        L_0x0189:
            if (r3 != 0) goto L_0x0191
            java.lang.String r10 = "isStartWithActivity = false, skip recovery detect"
            com.tencent.p014mm.recoveryv2.C85671c.m105784b(r4, r10)
            return r5
        L_0x0191:
            com.tencent.mm.recoveryv2.l r10 = com.tencent.p014mm.recoveryv2.C85695l.m105842a()
            android.content.Context r2 = r10.mo119281b()
            boolean r1 = com.tencent.p014mm.recoveryv2.C85689j.m105830d(r2, r1)
            r2 = 4
            if (r1 != 0) goto L_0x01a6
            java.lang.String r10 = "not main proc, skip"
            com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r2, r0, r10)
            goto L_0x01e7
        L_0x01a6:
            android.content.Context r1 = r10.mo119281b()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "recovery_enable"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r4, r2)
            java.lang.String r4 = "enable"
            if (r1 == 0) goto L_0x01e8
            boolean r6 = r3.containsKey(r4)
            if (r6 == 0) goto L_0x01c5
            boolean r1 = r3.getBoolean(r4)
            goto L_0x01c9
        L_0x01c5:
            boolean r1 = r1.getBoolean(r4, r5)
        L_0x01c9:
            if (r1 != 0) goto L_0x01d1
            java.lang.String r10 = "Recovery is disabled, skip"
            com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r2, r0, r10)
            goto L_0x01e7
        L_0x01d1:
            com.tencent.mm.recoveryv2.f r0 = r10.f249698b
            if (r0 != 0) goto L_0x01e0
            com.tencent.mm.recoveryv2.f$b r0 = new com.tencent.mm.recoveryv2.f$b
            android.content.Context r1 = r10.mo119281b()
            r0.<init>(r1)
            r10.f249698b = r0
        L_0x01e0:
            com.tencent.mm.recoveryv2.f r10 = r10.f249698b
            com.tencent.mm.recoveryv2.f$b r10 = (com.tencent.p014mm.recoveryv2.C85678f.C85680b) r10
            r10.mo119272j()
        L_0x01e7:
            return r5
        L_0x01e8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Persis#load() has not yet been called"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.recovery.RecoveryInitializer.init(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        throw r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054 A[SYNTHETIC, Splitter:B:12:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x007c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isStartWithActivity(android.content.Context r8) {
        /*
            boolean r0 = com.tencent.p014mm.recoveryv2.C85689j.m105831e(r8)
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r2 = 5
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0051
            java.util.List r1 = r1.getRunningAppProcesses()
            java.util.Iterator r1 = r1.iterator()
        L_0x0019:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r1.next()
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5
            java.lang.String r6 = r5.processName
            java.lang.String r7 = r8.getPackageName()
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L_0x0019
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "app importance = "
            r6.append(r7)
            int r7 = r5.importance
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.recovery.utils"
            com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r2, r7, r6)
            int r5 = r5.importance
            r6 = 100
            if (r5 > r6) goto L_0x0019
            r8 = 1
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            if (r8 != 0) goto L_0x00a5
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x00a2 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a2 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = "/proc/self/cgroup"
            r6.<init>(r7)     // Catch:{ all -> 0x00a2 }
            r5.<init>(r6)     // Catch:{ all -> 0x00a2 }
            r1.<init>(r5)     // Catch:{ all -> 0x00a2 }
        L_0x0065:
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0092
            java.lang.String r6 = "top-app"
            boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x0096 }
            if (r6 != 0) goto L_0x0092
            java.lang.String r6 = "foreground"
            boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x0096 }
            if (r6 == 0) goto L_0x007d
            goto L_0x0092
        L_0x007d:
            java.lang.String r6 = "background"
            boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x0096 }
            if (r6 != 0) goto L_0x008e
            java.lang.String r6 = "restricted"
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0065
        L_0x008e:
            r1.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a5
        L_0x0092:
            r1.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00a3
        L_0x0096:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r6     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
        L_0x00a3:
            r1 = 1
            goto L_0x00a6
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "isTopActivity = "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", appImportanceForeground = "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = ", cgroupForeground = "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.recovery"
            com.tencent.p014mm.recoveryv2.C85692k.C85693a.m105840a(r2, r6, r5)
            if (r0 == 0) goto L_0x00d3
            if (r8 != 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00d3
        L_0x00d2:
            r3 = 1
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.recovery.RecoveryInitializer.isStartWithActivity(android.content.Context):boolean");
    }
}
