package qg3;

import a70.C79471a;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import bp3.C79757o;
import bp3.C79760s;
import com.tencent.matrix.lifecycle.C80504z;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.matrix.C40336d;
import com.tencent.p014mm.matrix.C80980b;
import com.tencent.p014mm.matrix.C80981c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import di3.C86312j;
import iv3.C87824b;
import j40.C87829b;
import java.io.File;
import p235sm.C90236m0;
import p70.C89315a;
import p723vf.C118672d;
import r40.C47925e;
import s70.C90134a;
import zt3.C119157j;

/* renamed from: qg3.b */
public abstract class C89646b {

    /* renamed from: a */
    public final long f257874a = System.currentTimeMillis();

    /* renamed from: b */
    public C87829b f257875b = null;

    /* renamed from: qg3.b$a */
    public class C89647a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ File f257876d;

        public C89647a(C89646b bVar, File file) {
            this.f257876d = file;
        }

        public void run() {
            C86013q1.m106446g(this.f257876d.getAbsolutePath(), true);
        }
    }

    /* renamed from: a */
    public final void mo123973a(ApplicationLike applicationLike) {
        if (MMApplicationContext.isMainProcess() && MMApplicationContext.isVersionChange()) {
            Application application = applicationLike.getApplication();
            mo123974b(application.getDir("lib", 0));
            mo123974b(application.getDir("dex", 0));
            mo123974b(application.getDir(XWalkPlugin.PRIVATE_CACHE_DIR_NAME, 0));
            mo123974b(application.getDir("recover_lib", 0));
            if (!C87824b.m109281c(applicationLike) && C79471a.f233015c.equals(BuildInfo.CLIENT_VERSION)) {
                C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "[tomys] clean patch since base apk is upgraded.", new Object[0]);
                C87824b.m109279a(applicationLike);
            }
        }
    }

    /* renamed from: b */
    public final void mo123974b(File file) {
        if (file.exists()) {
            File file2 = new File("." + file.getAbsolutePath());
            file.renameTo(file2);
            ((C119157j) C119157j.f356862d).mo183884o(new C89647a(this, file2));
        }
    }

    /* renamed from: c */
    public final void mo123975c(ApplicationLike applicationLike) {
        if (C80622u0.m98265a(applicationLike.getApplication()) == C80622u0.MM) {
            C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "** Hit main process condition.", new Object[0]);
            try {
                if (C87824b.m109281c(applicationLike)) {
                    String a = C79757o.m96896a(applicationLike.getApplication());
                    Context baseContext = applicationLike.getApplication().getBaseContext();
                    File patchDirectory = SharePatchFileUtil.getPatchDirectory(baseContext);
                    File patchInfoFile = SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath());
                    File patchInfoLockFile = SharePatchFileUtil.getPatchInfoLockFile(patchDirectory.getAbsolutePath());
                    SharePatchInfo readAndCheckPropertyWithLock = SharePatchInfo.readAndCheckPropertyWithLock(patchInfoFile, patchInfoLockFile);
                    if (ShareConstants.CHANING_DEX_OPTIMIZE_PATH.equals(readAndCheckPropertyWithLock.oatDir)) {
                        C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "** Before fixing: oldver: %s, newver: %s, oatdir: %s, fingerpint: %s", readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint);
                        TinkerStatusReport.reportKVStringValue(a, 257, String.format("BEFORE_FIXED##%s##%s##%s##%s", new Object[]{readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint}));
                        File file = new File(patchDirectory, SharePatchFileUtil.getPatchVersionDirectory(readAndCheckPropertyWithLock.newVersion));
                        File file2 = new File(file, "odex");
                        File file3 = new File(file, ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH);
                        File file4 = new File(file2, "tinker_classN.dex");
                        File file5 = new File(file3, "tinker_classN.dex");
                        if (file4.exists() && file4.canRead()) {
                            readAndCheckPropertyWithLock.oatDir = "odex";
                        } else if (file5.exists() && file5.canRead()) {
                            readAndCheckPropertyWithLock.oatDir = ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH;
                        }
                        TinkerStatusReport.reportKVStringValue(a, 257, String.format("FIXED##%s##%s##%s##%s", new Object[]{readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint}));
                        C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "** After fixing: oldver: %s, newver: %s, oatdir: %s, fingerpint: %s", readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint);
                        SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, readAndCheckPropertyWithLock, patchInfoLockFile);
                        C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "** Killing other processes.", new Object[0]);
                        ShareTinkerInternals.killProcessExceptMain(baseContext);
                        C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "** Other processes were killed.", new Object[0]);
                        return;
                    }
                    C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "** Status is ok, do not needs to do fix.", new Object[0]);
                    return;
                }
                C80611s0.m98247e("MicroMsg.BaseStartupRoutine", "** Patch is not loaded, do not needs to do fix.", new Object[0]);
            } catch (Throwable th) {
                C80611s0.m98246d("MicroMsg.BaseStartupRoutine", th, "** Exception occurred.", new Object[0]);
            }
        }
    }

    /* renamed from: d */
    public void mo123976d(ApplicationLike applicationLike) {
        Application application = applicationLike.getApplication();
        if (C80622u0.m98265a(application).f235888f && Build.MANUFACTURER.equals("samsung") && Build.VERSION.SDK_INT <= 24) {
            application.registerActivityLifecycleCallbacks(new C47925e(application));
        }
        boolean z = C80980b.f237843a;
        C79760s.m96908a("MatrixBoot.onAppCreate");
        Log.m105924i("MicroMsg.MatrixDelegate", "onEarlyBoot");
        try {
            if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                C90134a.f258830a.mo124397a();
            }
            C80981c cVar = C80981c.INSTANCE;
            cVar.getClass();
            C118672d.f355106a = new C40336d(cVar);
            C80504z.m98067a(application, C89315a.f257273a);
        } catch (Throwable th) {
            C79760s.m96909b();
            throw th;
        }
        C79760s.m96909b();
    }

    /* renamed from: e */
    public final void mo123977e(ApplicationLike applicationLike) {
        if (!MMApplicationContext.isMainProcess()) {
            return;
        }
        if (applicationLike == null || applicationLike.getApplication() == null) {
            throw new TinkerRuntimeException("tinkerApplication is null");
        } else if (ShareTinkerInternals.isTinkerEnabledAll(applicationLike.getTinkerFlags()) && ShareTinkerInternals.isTinkerEnableWithSharedPreferences(applicationLike.getApplication()) && ShareIntentUtil.getIntentReturnCode(applicationLike.getTinkerResultIntent()) == -11) {
            C80611s0.m98248f("MicroMsg.BaseStartupRoutine", "[tomys] clean patch since main process fallbacks to base version.", new Object[0]);
            ShareTinkerInternals.setTinkerDisableWithSharedPreferences(applicationLike.getApplication());
            File patchDirectory = SharePatchFileUtil.getPatchDirectory(applicationLike.getApplication());
            SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath()).delete();
            ((C90236m0) C86312j.m106911c(C90236m0.class)).Rc0("Tinker");
            ShareTinkerInternals.killProcessExceptMain(applicationLike.getApplication());
            SharePatchFileUtil.safeDeleteFile(patchDirectory);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0197, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0198, code lost:
        bp3.C79760s.m96909b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019b, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo123978f(com.tencent.tinker.entry.ApplicationLike r7) {
        /*
            r6 = this;
            java.lang.String r0 = "doEarlyCriticalInitializations"
            bp3.C79760s.m96908a(r0)     // Catch:{ all -> 0x0197 }
            r7.getApplicationStartMillisTime()     // Catch:{ all -> 0x0197 }
            long r0 = r7.getApplicationStartElapsedTime()     // Catch:{ all -> 0x0197 }
            int[] r2 = p787ai.C79546a.f233229a     // Catch:{ all -> 0x0197 }
            f40.C86739i0.f251798a = r0     // Catch:{ all -> 0x0197 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0197 }
            h40.C87422a.f253331b = r0     // Catch:{ all -> 0x0197 }
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0197 }
            android.app.Application r0 = r7.getApplication()     // Catch:{ all -> 0x0197 }
            wl.j r1 = p261wl.C38175j.INSTANCE     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.a r2 = com.tencent.p014mm.app.C28674a.INSTANCE     // Catch:{ all -> 0x0197 }
            wl.c[] r3 = p261wl.C38166b.f100834a     // Catch:{ all -> 0x0197 }
            r4 = 0
            r5 = r3[r4]     // Catch:{ all -> 0x0197 }
            if (r5 != 0) goto L_0x0038
            monitor-enter(r3)     // Catch:{ all -> 0x0197 }
            r5 = r3[r4]     // Catch:{ all -> 0x0035 }
            if (r5 != 0) goto L_0x0033
            p261wl.C38166b.f100836c = r0     // Catch:{ all -> 0x0035 }
            r3[r4] = r1     // Catch:{ all -> 0x0035 }
            p261wl.C38166b.f100835b = r2     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r7     // Catch:{ all -> 0x0197 }
        L_0x0038:
            android.app.Application r0 = r7.getApplication()     // Catch:{ all -> 0x0197 }
            bp3.q<com.tencent.mm.app.l> r1 = com.tencent.p014mm.app.C28680l.f78663e     // Catch:{ all -> 0x0197 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0197 }
            di3.h r1 = (di3.C31195h) r1     // Catch:{ all -> 0x0197 }
            di3.C86312j.m106912d(r0, r1, r2)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.sdk.platformtools.GlobalLogger r0 = com.tencent.p014mm.sdk.platformtools.GlobalLogger.getInstance()     // Catch:{ all -> 0x0197 }
            com.tencent.stubs.logger.Log.setLogger(r0)     // Catch:{ all -> 0x0197 }
            android.app.Application r0 = r7.getApplication()     // Catch:{ all -> 0x0197 }
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()     // Catch:{ all -> 0x0197 }
            com.tencent.p014mm.sdk.platformtools.AndroidOSafety.replaceTargetVersion(r1)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.u0 r1 = com.tencent.p014mm.app.C80622u0.m98265a(r0)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.u0 r2 = com.tencent.p014mm.app.C80622u0.CUPLOADER     // Catch:{ all -> 0x0197 }
            if (r1 == r2) goto L_0x0071
            com.tencent.mm.app.v r1 = new com.tencent.mm.app.v     // Catch:{ all -> 0x0197 }
            r1.<init>(r0)     // Catch:{ all -> 0x0197 }
            com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler.setReporter(r1)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.w r1 = new com.tencent.mm.app.w     // Catch:{ all -> 0x0197 }
            r1.<init>()     // Catch:{ all -> 0x0197 }
            com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler.setAfterReport(r1)     // Catch:{ all -> 0x0197 }
        L_0x0071:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsIsolatedProcess()     // Catch:{ all -> 0x0197 }
            if (r1 != 0) goto L_0x0084
            com.tencent.mm.app.e1 r1 = com.tencent.p014mm.app.C80590e1.C28678b.f78659a     // Catch:{ all -> 0x0197 }
            r1.mo112298b(r7)     // Catch:{ all -> 0x0197 }
            monitor-enter(r1)     // Catch:{ all -> 0x0197 }
            r1.f235765c = r4     // Catch:{ all -> 0x0081 }
            monitor-exit(r1)     // Catch:{ all -> 0x0197 }
            goto L_0x0084
        L_0x0081:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0197 }
            throw r7     // Catch:{ all -> 0x0197 }
        L_0x0084:
            r6.mo123977e(r7)     // Catch:{ all -> 0x0197 }
            android.app.Application r1 = r7.getApplication()     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.u0 r2 = com.tencent.p014mm.app.C80622u0.m98265a(r1)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.u0 r3 = com.tencent.p014mm.app.C80622u0.PUSH     // Catch:{ all -> 0x0197 }
            if (r2 == r3) goto L_0x00bd
            com.tencent.mm.app.u0 r3 = com.tencent.p014mm.app.C80622u0.SANDBOX     // Catch:{ all -> 0x0197 }
            if (r2 == r3) goto L_0x00bd
            com.tencent.mm.app.u0 r3 = com.tencent.p014mm.app.C80622u0.BACKTRACE__     // Catch:{ all -> 0x0197 }
            if (r2 == r3) goto L_0x00bd
            com.tencent.mm.app.u0 r3 = com.tencent.p014mm.app.C80622u0.HOTPOT_DOTDOT     // Catch:{ all -> 0x0197 }
            if (r2 == r3) goto L_0x00bd
            com.tencent.mm.app.u0 r3 = com.tencent.p014mm.app.C80622u0.RECOVERY     // Catch:{ all -> 0x0197 }
            if (r2 == r3) goto L_0x00bd
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64     // Catch:{ all -> 0x0197 }
            if (r2 != 0) goto L_0x00ba
            com.tencent.p014mm.sdk.platformtools.ThreadStackShinkerWrapper.tryToInstall(r1)     // Catch:{ all -> 0x0197 }
            com.tencent.p014mm.sdk.platformtools.WVReservedSpaceShinkerWrapper.tryToInstall(r1)     // Catch:{ all -> 0x0197 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0197 }
            r3 = 26
            if (r2 < r3) goto L_0x00b7
            com.tencent.p014mm.sdk.platformtools.PatronsWrapper.tryToInstall(r1)     // Catch:{ all -> 0x0197 }
            goto L_0x00ba
        L_0x00b7:
            com.tencent.p014mm.sdk.platformtools.GCSemiSpaceTrimWrapper.tryToInstall(r1)     // Catch:{ all -> 0x0197 }
        L_0x00ba:
            com.tencent.p014mm.sdk.platformtools.RuntimeVerifyMuteWrapper.tryToInstall(r1)     // Catch:{ all -> 0x0197 }
        L_0x00bd:
            r6.mo123975c(r7)     // Catch:{ all -> 0x0197 }
            j40.b r1 = new j40.b     // Catch:{ all -> 0x0197 }
            java.lang.String r2 = bp3.C79757o.m96896a(r0)     // Catch:{ all -> 0x0197 }
            r1.<init>(r2, r0, r7)     // Catch:{ all -> 0x0197 }
            r6.f257875b = r1     // Catch:{ all -> 0x0197 }
            j40.a$a r1 = r1.f124992e     // Catch:{ all -> 0x0197 }
            r1.getClass()     // Catch:{ all -> 0x0197 }
            j40.b r1 = r6.f257875b     // Catch:{ all -> 0x0197 }
            j40.a$a r1 = r1.f124992e     // Catch:{ all -> 0x0197 }
            long r2 = r6.f257874a     // Catch:{ all -> 0x0197 }
            r1.f124993a = r2     // Catch:{ all -> 0x0197 }
            be.b r1 = p933be.C113159b.f338581i     // Catch:{ all -> 0x0197 }
            if (r1 != 0) goto L_0x00ef
            java.lang.String r1 = "Matrix.battery.LifeCycle"
            monitor-enter(r1)     // Catch:{ all -> 0x0197 }
            be.b r2 = p933be.C113159b.f338581i     // Catch:{ all -> 0x00ec }
            if (r2 != 0) goto L_0x00ea
            be.b r2 = new be.b     // Catch:{ all -> 0x00ec }
            r2.<init>(r0)     // Catch:{ all -> 0x00ec }
            p933be.C113159b.f338581i = r2     // Catch:{ all -> 0x00ec }
        L_0x00ea:
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
            goto L_0x00ef
        L_0x00ec:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
            throw r7     // Catch:{ all -> 0x0197 }
        L_0x00ef:
            com.tencent.mm.app.t0 r1 = com.tencent.p014mm.app.C80617t0.f235846c     // Catch:{ all -> 0x0197 }
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = "MicroMsg.ProcForegroundDelegate"
            monitor-enter(r1)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.t0 r2 = com.tencent.p014mm.app.C80617t0.f235846c     // Catch:{ all -> 0x0103 }
            if (r2 != 0) goto L_0x0101
            com.tencent.mm.app.t0 r2 = new com.tencent.mm.app.t0     // Catch:{ all -> 0x0103 }
            r2.<init>(r0)     // Catch:{ all -> 0x0103 }
            com.tencent.p014mm.app.C80617t0.f235846c = r2     // Catch:{ all -> 0x0103 }
        L_0x0101:
            monitor-exit(r1)     // Catch:{ all -> 0x0103 }
            goto L_0x0106
        L_0x0103:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0103 }
            throw r7     // Catch:{ all -> 0x0197 }
        L_0x0106:
            com.tencent.mm.app.AppForegroundDelegate r1 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE     // Catch:{ all -> 0x0197 }
            r1.mo174213i(r0)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.u0 r1 = com.tencent.p014mm.app.C80622u0.m98265a(r0)     // Catch:{ all -> 0x0197 }
            boolean r1 = r1.f235888f     // Catch:{ all -> 0x0197 }
            if (r1 == 0) goto L_0x013a
            android.app.Application$ActivityLifecycleCallbacks r1 = com.tencent.p014mm.app.C80586c1.f235759a     // Catch:{ all -> 0x0197 }
            r0.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0197 }
            android.content.BroadcastReceiver r1 = com.tencent.p014mm.p136ui.chatting.half.HalfScreenChattingStarter.f82854a     // Catch:{ all -> 0x0197 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0197 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x0197 }
            r1[r4] = r2     // Catch:{ all -> 0x0197 }
            java.lang.String r2 = "HalfScreenChattingStarter"
            java.lang.String r3 = "init() called:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r1)     // Catch:{ all -> 0x0197 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x0197 }
            java.lang.String r2 = "com.tencent.mm.Intent.ACTION_HALF_SCREEN_CHATTING"
            r1.<init>(r2)     // Catch:{ all -> 0x0197 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0197 }
            android.content.BroadcastReceiver r3 = com.tencent.p014mm.p136ui.chatting.half.HalfScreenChattingStarter.f82854a     // Catch:{ all -> 0x0197 }
            r2.registerReceiver(r3, r1)     // Catch:{ all -> 0x0197 }
        L_0x013a:
            jk.a$a r1 = lg3.C76695c.f224393a     // Catch:{ all -> 0x0197 }
            p573jk.C76417a.f223735a = r1     // Catch:{ all -> 0x0197 }
            j40.b r1 = r6.f257875b     // Catch:{ all -> 0x0197 }
            com.tencent.p014mm.vfs.VFSStrategy.m163774b(r1)     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = "stlport_shared"
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ all -> 0x0197 }
            p206nj.C88957l.m111079o(r1, r2)     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = "c++_shared"
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ all -> 0x0197 }
            p206nj.C88957l.m111079o(r1, r2)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.booter.k0 r1 = new com.tencent.mm.booter.k0     // Catch:{ all -> 0x0197 }
            r1.<init>()     // Catch:{ all -> 0x0197 }
            zt3.C119154h.m168040a(r0, r1)     // Catch:{ all -> 0x0197 }
            java.lang.String r1 = "initXLogAndDebugger"
            bp3.C79760s.m96908a(r1)     // Catch:{ all -> 0x0197 }
            com.tencent.mm.booter.d r1 = com.tencent.p014mm.booter.C80814d.m98665b(r0)     // Catch:{ all -> 0x0197 }
            j40.b r2 = r6.f257875b     // Catch:{ all -> 0x0197 }
            r2.f254268g = r1     // Catch:{ all -> 0x0197 }
            com.tencent.mm.app.u0 r0 = com.tencent.p014mm.app.C80622u0.m98265a(r0)     // Catch:{ all -> 0x0197 }
            java.lang.String r2 = r0.f235887e     // Catch:{ all -> 0x0197 }
            boolean r2 = sf0.C77702q0.m93719b(r2)     // Catch:{ all -> 0x0197 }
            if (r2 != 0) goto L_0x017c
            java.lang.String r0 = r0.f235887e     // Catch:{ all -> 0x0197 }
            r1.mo112570e(r0)     // Catch:{ all -> 0x0197 }
        L_0x017c:
            bp3.C79760s.m96909b()     // Catch:{ all -> 0x0197 }
            com.tencent.mm.plugin.sandbox.SubCoreSandBox r0 = new com.tencent.mm.plugin.sandbox.SubCoreSandBox     // Catch:{ all -> 0x0197 }
            r0.<init>()     // Catch:{ all -> 0x0197 }
            qg3.a r1 = new qg3.a     // Catch:{ all -> 0x0197 }
            r1.<init>(r6)     // Catch:{ all -> 0x0197 }
            j40.b r2 = r6.f257875b     // Catch:{ all -> 0x0197 }
            java.lang.String r2 = r2.f124988a     // Catch:{ all -> 0x0197 }
            com.tencent.p014mm.app.C80600i0.m98224l(r0, r1, r2)     // Catch:{ all -> 0x0197 }
            r6.mo123973a(r7)     // Catch:{ all -> 0x0197 }
            bp3.C79760s.m96909b()
            return
        L_0x0197:
            r7 = move-exception
            bp3.C79760s.m96909b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qg3.C89646b.mo123978f(com.tencent.tinker.entry.ApplicationLike):void");
    }
}
