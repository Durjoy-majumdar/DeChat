package com.tencent.p014mm.app;

import a70.C79471a;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import com.tencent.tinker.entry.ApplicationLike;
import iv3.C87824b;

/* renamed from: com.tencent.mm.app.e1 */
public final class C80590e1 {

    /* renamed from: a */
    public ApplicationLike f235763a = null;

    /* renamed from: b */
    public volatile boolean f235764b = false;

    /* renamed from: c */
    public volatile boolean f235765c = false;

    /* renamed from: d */
    public boolean f235766d = false;

    /* renamed from: e */
    public MMUncaughtExceptionHandler.IOnUncaughtExceptionListener f235767e = new C80591a();

    /* renamed from: com.tencent.mm.app.e1$b */
    public static final class C28678b {

        /* renamed from: a */
        public static final C80590e1 f78659a = new C80590e1();
    }

    /* renamed from: com.tencent.mm.app.e1$a */
    public class C80591a implements MMUncaughtExceptionHandler.IOnUncaughtExceptionListener {
        public C80591a() {
        }

        public void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th) {
            if (C87824b.m109281c(C80590e1.this.f235763a)) {
                if ((th instanceof NoClassDefFoundError) || (th instanceof VerifyError) || (th instanceof IncompatibleClassChangeError) || (th instanceof InternalError)) {
                    C80590e1 e1Var = C80590e1.this;
                    if (e1Var.f235766d) {
                        try {
                            SharedPreferences sharedPreferences = e1Var.f235763a.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
                            synchronized (C80590e1.this) {
                                if (!C80590e1.this.f235765c) {
                                    int i = sharedPreferences.getInt("tinker_crash_count", 0);
                                    if (i > 3) {
                                        String str2 = C79471a.f233015c + "_clean_patch_count";
                                        sharedPreferences.edit().putInt(str2, sharedPreferences.getInt(str2, 0) + 1).putInt("tinker_crash_count", 0).commit();
                                        C87824b.m109279a(C80590e1.this.f235763a);
                                        Log.m105928w("MicroMsg.TinkerEnsuranceOnFault", "[tomys] clean patch by ensurance logic!!");
                                        Log.appenderFlushSync();
                                    } else {
                                        sharedPreferences.edit().putInt("tinker_crash_count", i + 1).commit();
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            Log.printErrStackTrace("MicroMsg.TinkerEnsuranceOnFault", th4, "[-] Exception occurred.", new Object[0]);
                            Log.appenderFlushSync();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo112297a() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f235764b     // Catch:{ all -> 0x0073 }
            r1 = 1
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r2 = "[!] Uninitialized or install failed, canApplyPatch will return true."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x0073 }
            monitor-exit(r6)
            return r1
        L_0x000f:
            com.tencent.tinker.entry.ApplicationLike r0 = r6.f235763a     // Catch:{ all -> 0x0073 }
            android.app.Application r0 = r0.getApplication()     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "tinker_ensurance_info"
            r3 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x0073 }
            com.tencent.tinker.entry.ApplicationLike r2 = com.tencent.p014mm.app.C80589e.f235760a     // Catch:{ all -> 0x0073 }
            int r2 = r2.getTinkerFlags()     // Catch:{ all -> 0x0073 }
            boolean r2 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnabled(r2)     // Catch:{ all -> 0x0073 }
            r3 = 0
            if (r2 == 0) goto L_0x0036
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0073 }
            boolean r2 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnableWithSharedPreferences(r2)     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r4.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = a70.C79471a.f233015c     // Catch:{ all -> 0x0073 }
            r4.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = "_clean_patch_count"
            r4.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0073 }
            int r0 = r0.getInt(r4, r3)     // Catch:{ all -> 0x0073 }
            r4 = 3
            if (r0 > r4) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r2 == 0) goto L_0x005f
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r2 = "[tomys] ensurance logic says: we can apply patch."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0071
        L_0x005f:
            if (r2 != 0) goto L_0x0068
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r2 = "[tomys] ensurance logic says: patch was disabled by compile options or fuse logic, we CANNOT apply patch !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x0073 }
        L_0x0068:
            if (r1 != 0) goto L_0x0071
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r2 = "[tomys] ensurance logic says: mm ensurance logic blocked patch function, we CANNOT apply patch !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r6)
            return r1
        L_0x0073:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80590e1.mo112297a():boolean");
    }

    /* renamed from: b */
    public synchronized void mo112298b(ApplicationLike applicationLike) {
        try {
            if (!this.f235764b) {
                this.f235763a = applicationLike;
                this.f235766d = applicationLike.getApplication().getPackageName().equals(this.f235763a.getApplication().getApplicationInfo().processName);
                SharedPreferences sharedPreferences = this.f235763a.getApplication().getSharedPreferences("tinker_ensurance_info", 4);
                String string = sharedPreferences.getString("tinker_last_clientversion", (String) null);
                if (string == null) {
                    sharedPreferences.edit().putString("tinker_last_clientversion", C79471a.f233015c).commit();
                } else if (!C79471a.f233015c.equals(string)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove(string + "_clean_patch_count").putString("tinker_last_clientversion", C79471a.f233015c).commit();
                }
                MMUncaughtExceptionHandler.addOnUncaughtExceptionListener(this.f235767e);
                this.f235764b = true;
            } else {
                return;
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TinkerEnsuranceOnFault", th, "[-] Exception occurred.", new Object[0]);
            this.f235764b = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo112299c() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f235764b     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r2 = "[!] Uninitialized or install failed, isBlockApplyPatchReported will return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)
            return r1
        L_0x000f:
            com.tencent.tinker.entry.ApplicationLike r0 = r4.f235763a     // Catch:{ all -> 0x0039 }
            android.app.Application r0 = r0.getApplication()     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "tinker_ensurance_info"
            r3 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r2.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = a70.C79471a.f233015c     // Catch:{ all -> 0x0039 }
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "_block_apply_patch_reported"
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0039 }
            int r0 = r0.getInt(r2, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            r1 = 1
        L_0x0037:
            monitor-exit(r4)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80590e1.mo112299c():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo112300d() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f235764b     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r2 = "[!] Uninitialized or install failed, isCleanPatchReported will return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)
            return r1
        L_0x000f:
            com.tencent.tinker.entry.ApplicationLike r0 = r4.f235763a     // Catch:{ all -> 0x0039 }
            android.app.Application r0 = r0.getApplication()     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "tinker_ensurance_info"
            r3 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r2.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = a70.C79471a.f233015c     // Catch:{ all -> 0x0039 }
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "_clean_patch_reported"
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0039 }
            int r0 = r0.getInt(r2, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            r1 = 1
        L_0x0037:
            monitor-exit(r4)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80590e1.mo112300d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        return r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo112301e() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f235764b     // Catch:{ all -> 0x0055 }
            r1 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r2 = "[!] Uninitialized or install failed, isCleanPatchTriggered will return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            return r1
        L_0x000f:
            com.tencent.tinker.entry.ApplicationLike r0 = r6.f235763a     // Catch:{ all -> 0x0055 }
            android.app.Application r0 = r0.getApplication()     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "tinker_ensurance_info"
            r3 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r2.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = a70.C79471a.f233015c     // Catch:{ all -> 0x0055 }
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            java.lang.String r3 = "_clean_patch_count"
            r2.append(r3)     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0055 }
            int r0 = r0.getInt(r2, r1)     // Catch:{ all -> 0x0055 }
            r2 = 1
            if (r0 <= 0) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x004c
            java.lang.String r4 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r5 = "[tomys] ensurance logic says: we have cleaned patch by %s times !!"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0055 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r2[r1] = r0     // Catch:{ all -> 0x0055 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        L_0x004c:
            java.lang.String r0 = "MicroMsg.TinkerEnsuranceOnFault"
            java.lang.String r1 = "[tomys] ensurance logic says: clean patch logic is not being triggered."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r6)
            return r3
        L_0x0055:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80590e1.mo112301e():boolean");
    }
}
