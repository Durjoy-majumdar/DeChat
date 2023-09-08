package com.tencent.p014mm.app;

import a70.C112760b;
import a70.C79471a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import bp3.C79757o;
import bp3.C79760s;
import com.tencent.p014mm.app.C80637z0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.entry.DefaultApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import dv3.C86407a;
import g40.C87133d;
import iv3.C87824b;
import j20.C117292a;
import j40.C87829b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;
import p206nj.C88957l;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import qg3.C89646b;
import qg3.C89648c;
import qg3.C89649d;
import qg3.C89650e;
import qg3.C89651f;
import qg3.C89655j;
import qg3.C89657l;
import r10.C36244b;
import r10.C89858a;
import r10.C89859c;

/* renamed from: com.tencent.mm.app.MMApplicationLike */
public class MMApplicationLike extends DefaultApplicationLike {
    private static final String TAG = "MicroMsg.MMApplicationLike";
    private static final MMApplicationLike[] sSafeguardInstance = {null};
    private byte _hellAccFlag_;
    private final C36244b[] mFuses = {new C89859c(), new C89858a()};
    private C89646b mStartupRoutine = null;

    public MMApplicationLike(Application application, int i, boolean z, long j, long j2, Intent intent) {
        super(application, i, z, j, j2, intent);
    }

    /* JADX INFO: finally extract failed */
    private int checkFusesBeforeStartup() {
        C36244b[] bVarArr = this.mFuses;
        if (bVarArr == null) {
            return 0;
        }
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            C36244b bVar = bVarArr[i];
            try {
                C79760s.m96908a("Fuse:" + bVar.getClass().getName());
                int a = bVar.mo60582a(this);
                if (a != 0) {
                    C79760s.m96909b();
                    return a;
                }
                C79760s.m96909b();
                i++;
            } catch (Throwable th) {
                C79760s.m96909b();
                throw th;
            }
        }
        return 0;
    }

    private C89646b createStartupRoutine() {
        Application application = getApplication();
        C80622u0 a = C80622u0.m98265a(application);
        if (a != null) {
            int ordinal = a.f235889g.ordinal();
            if (ordinal == 0) {
                return new C89655j();
            }
            if (ordinal == 1) {
                return new C89651f();
            }
            if (ordinal == 2) {
                return new C89657l();
            }
            throw new IllegalStateException("Should not be here.");
        } else if (!BuildInfo.DEBUG) {
            return new C89651f();
        } else {
            throw new IllegalStateException("Please add descriptor for " + C79757o.m96896a(application) + " in ProcessDescriptor class.");
        }
    }

    private String getPatchedNativeLibsPath(String str) {
        try {
            File patchDirectory = SharePatchFileUtil.getPatchDirectory(C80589e.f235760a.getApplication());
            File file = new File(patchDirectory.getAbsolutePath(), SharePatchFileUtil.getPatchVersionDirectory(C87824b.m109280b(C80589e.f235760a)));
            return new File(file.getAbsolutePath() + "/lib/lib/" + str).getAbsolutePath();
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "[-] Fail to get patched native libs path.", new Object[0]);
            return null;
        }
    }

    private void installPatchedSoPathOnDemand() {
        ApplicationLike applicationLike = C80589e.f235760a;
        if (applicationLike == null || applicationLike.getApplication() == null) {
            throw new TinkerRuntimeException("tinkerApplication is null");
        } else if (ShareTinkerInternals.isTinkerEnabledForNativeLib(applicationLike.getTinkerFlags()) && C87824b.m109281c(C80589e.f235760a)) {
            if (C79471a.f233022j) {
                String patchedNativeLibsPath = getPatchedNativeLibsPath(XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
                if (!TextUtils.isEmpty(patchedNativeLibsPath)) {
                    C88957l.m111067c(patchedNativeLibsPath);
                }
                C86407a.m107074a(C80589e.f235760a, XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
                return;
            }
            String patchedNativeLibsPath2 = getPatchedNativeLibsPath(XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
            if (!TextUtils.isEmpty(patchedNativeLibsPath2)) {
                C88957l.m111067c(patchedNativeLibsPath2);
            }
            String patchedNativeLibsPath3 = getPatchedNativeLibsPath("armeabi");
            if (!TextUtils.isEmpty(patchedNativeLibsPath3)) {
                C88957l.m111067c(patchedNativeLibsPath3);
            }
            C86407a.m107074a(C80589e.f235760a, XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
            C86407a.m107074a(C80589e.f235760a, "armeabi");
        }
    }

    private void setNewVersionMark() {
        PrintWriter printWriter;
        BufferedReader bufferedReader;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String d = C112760b.m154225d();
        File file = new File(d, "new_nowver_" + MMApplicationContext.getProcessName() + "_.rec");
        String str = "";
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                str = bufferedReader.readLine().trim();
                bufferedReader.close();
            } catch (Throwable th) {
                C80611s0.m98246d(TAG, th, "[-] Fail to read previous client version, regard as new version.", new Object[0]);
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        String str2 = BuildInfo.CLIENT_VERSION;
        if (!str2.equals(str)) {
            MMApplicationContext.setIsVersionChange(true);
            try {
                printWriter = new PrintWriter(new FileWriter(file));
                printWriter.print(str2);
                printWriter.close();
            } catch (Throwable th4) {
                C80611s0.m98246d(TAG, th4, "[-] Fail to store current client version.", new Object[0]);
            }
        }
        C80611s0.m98247e(TAG, "[+] setNewVersionMark called, load cost: %s, store cost: %s", Long.valueOf(elapsedRealtime2 - elapsedRealtime), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime2));
        return;
        throw th;
        throw th;
    }

    private void setPatchRev() {
        try {
            if (getApplication() != null) {
                Intent tinkerResultIntent = getTinkerResultIntent();
                HashMap<String, String> hashMap = null;
                if (tinkerResultIntent != null) {
                    if (ShareIntentUtil.getIntentReturnCode(tinkerResultIntent) == 0) {
                        hashMap = ShareIntentUtil.getIntentPackageConfig(tinkerResultIntent);
                    }
                }
                if (hashMap != null) {
                    C79471a.f233021i = hashMap.get("patch.rev");
                    C79471a.f233024l = hashMap.get(ShareConstants.NEW_TINKER_ID);
                    Log.m105929w(TAG, "application set patch rev:%s patch tinkerId:%s ", C79471a.f233021i, C79471a.f233024l);
                    return;
                }
                return;
            }
            throw new TinkerRuntimeException("tinkerApplication is null");
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to set patch rev.", new Object[0]);
        }
    }

    public Resources getResources(Resources resources) {
        return MMApplicationContext.getResources() == null ? resources : MMApplicationContext.getResources();
    }

    public int mzNightModeUseOf() {
        return 0;
    }

    public void onBaseContextAttached(Context context) {
        if (!safeguard()) {
            super.onBaseContextAttached(context);
            C80589e.f235760a = this;
            try {
                C80636y0.m98273a(getApplication());
                setPatchRev();
                C79760s.m96908a("MMApplicationLike.onBaseContextAttached");
                Log.setLevel(0, false);
                MMApplicationContext.setContext(getApplication());
                MMApplicationContext.setApplicationId(context.getPackageName());
                MMApplicationContext.setAppHasInitFlag(false);
                C80589e.f235761b = getApplicationStartMillisTime();
                C80589e.f235762c = C79757o.m96896a(getApplication());
                C80637z0 z0Var = C80637z0.INSTANCE;
                z0Var.mo112372b(this, C28677e0.INSTANCE);
                z0Var.mo112374e(C80637z0.C80646h.UNTIL_TINKER_LOADED);
                setNewVersionMark();
                installPatchedSoPathOnDemand();
                int checkFusesBeforeStartup = checkFusesBeforeStartup();
                if (checkFusesBeforeStartup != 1) {
                    if (checkFusesBeforeStartup == 2) {
                        int myPid = Process.myPid();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(myPid));
                        Object obj = new Object();
                        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/app/MMApplicationLike", "onBaseContextAttached", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(obj, "com/tencent/mm/app/MMApplicationLike", "onBaseContextAttached", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    }
                    C89646b createStartupRoutine = createStartupRoutine();
                    this.mStartupRoutine = createStartupRoutine;
                    createStartupRoutine.mo123978f(this);
                    z0Var.mo112374e(C80637z0.C80646h.UNTIL_ON_BASE_CONTEXT_ATTACHED_END);
                    return;
                }
                C79760s.m96909b();
            } finally {
                C79760s.m96909b();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m105918d(TAG, "configuration changed");
        super.onConfigurationChanged(configuration);
        C89646b bVar = this.mStartupRoutine;
        if (bVar != null) {
            C87829b bVar2 = bVar.f257875b;
            if (bVar2 != null) {
                bVar2.mo122283e(configuration);
            }
            C38166b.m41755b(C87133d.class, new C89648c(bVar, this, configuration));
        }
    }

    public void onCreate() {
        super.onCreate();
        C89646b bVar = this.mStartupRoutine;
        if (bVar != null) {
            bVar.mo123976d(this);
        }
        C80637z0.INSTANCE.mo112374e(C80637z0.C80646h.UNTIL_APPLICATION_ON_CREATE_END);
    }

    public void onLowMemory() {
        super.onLowMemory();
        C89646b bVar = this.mStartupRoutine;
        if (bVar != null) {
            bVar.getClass();
            C38166b.m41755b(C87133d.class, new C89649d(bVar, this));
        }
    }

    public void onTerminate() {
        super.onTerminate();
        C89646b bVar = this.mStartupRoutine;
        if (bVar != null) {
            C87829b bVar2 = bVar.f257875b;
            if (bVar2 != null) {
                bVar2.mo122286h();
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C87133d.class);
            C38166b.C38167a.C38169b bVar3 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar3.hasNext()) {
                C38174i iVar = (C38174i) bVar3.next();
                if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                    ((C87133d) ((C15510f) iVar.get())).mo62230zA(this);
                }
            }
        }
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C89646b bVar = this.mStartupRoutine;
        if (bVar != null) {
            bVar.getClass();
            C38166b.m41755b(C87133d.class, new C89650e(bVar, this, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean safeguard() {
        /*
            r3 = this;
            com.tencent.mm.app.MMApplicationLike[] r0 = sSafeguardInstance
            monitor-enter(r0)
            r1 = 0
            r2 = r0[r1]     // Catch:{ all -> 0x0012 }
            if (r2 == r3) goto L_0x0010
            if (r2 != 0) goto L_0x000d
            r0[r1] = r3     // Catch:{ all -> 0x0012 }
            goto L_0x0010
        L_0x000d:
            r1 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x0012:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.MMApplicationLike.safeguard():boolean");
    }
}
