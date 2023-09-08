package gv3;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import iv3.C87821a;
import iv3.C87825c;
import java.io.File;
import jv3.C88034b;

/* renamed from: gv3.a */
public class C87400a implements C87402c {

    /* renamed from: a */
    public final Context f253289a;

    public C87400a(Context context) {
        this.f253289a = context;
    }

    /* renamed from: a */
    public void mo109430a(File file, int i) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPackageCheckFail: load patch package check fail file path: %s, errorCode: %d", file.getAbsolutePath(), Integer.valueOf(i));
        mo121822j();
    }

    /* renamed from: b */
    public void mo109431b(File file, int i, long j) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadResult: patch load result, path:%s, code: %d, cost: %dms", file.getAbsolutePath(), Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: c */
    public void mo109432c(File file, int i, boolean z) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType: %d, isDirectory: %b", file.getAbsolutePath(), Integer.valueOf(i), Boolean.valueOf(z));
        if (i == 4) {
            mo121823k();
        } else {
            mo121822j();
        }
    }

    /* renamed from: d */
    public void mo109433d(String str, String str2, File file) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchInfoCorrupted: patch info file damage: %s, from version: %s to version: %s", file.getAbsolutePath(), str, str2);
        mo121822j();
    }

    /* renamed from: e */
    public void mo109434e(String str, String str2, File file, String str3) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchVersionChanged: patch version change from " + str + " to " + str2, new Object[0]);
        if (str != null && str2 != null && !str.equals(str2) && C87821a.m109275c(this.f253289a).f254235h) {
            C88034b.m109603b(this.f253289a).mo122483d(str2);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    String name = file2.getName();
                    if (file2.isDirectory() && !name.equals(str3)) {
                        SharePatchFileUtil.deleteDir(file2);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public void mo109435f(int i, Throwable th) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", Integer.valueOf(i), th);
        if (i == 0) {
            ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret ok", new Object[0]);
        } else if (i == 1) {
            ShareTinkerLog.m106531e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file", new Object[0]);
        } else if (i == 2) {
            ShareTinkerLog.m106531e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error", new Object[0]);
        }
        mo121823k();
    }

    /* renamed from: g */
    public void mo109436g(File file, int i) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch load Reporter onLoadFileMd5Mismatch: patch file md5 mismatch file: %s, fileType: %d", file.getAbsolutePath(), Integer.valueOf(i));
        mo121822j();
    }

    /* renamed from: h */
    public void mo109437h(Throwable th, int i) {
        if (i == -4) {
            ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load unCatch exception: %s", th);
            ShareTinkerInternals.setTinkerDisableWithSharedPreferences(this.f253289a);
            ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "unCaught exception disable tinker forever with sp", new Object[0]);
            String checkTinkerLastUncaughtCrash = SharePatchFileUtil.checkTinkerLastUncaughtCrash(this.f253289a);
            if (!ShareTinkerInternals.isNullOrNil(checkTinkerLastUncaughtCrash)) {
                SharePatchFileUtil.safeDeleteFile(SharePatchFileUtil.getPatchLastCrashFile(this.f253289a));
                ShareTinkerLog.m106531e("Tinker.DefaultLoadReporter", "tinker uncaught real exception:" + checkTinkerLastUncaughtCrash, new Object[0]);
            }
        } else if (i == -3) {
            if (th.getMessage().contains(ShareConstants.CHECK_RES_INSTALL_FAIL)) {
                ShareTinkerLog.m106531e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: tinker res check fail:" + th.getMessage(), new Object[0]);
            } else {
                ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load resource exception: %s", th);
            }
            ShareTinkerInternals.setTinkerDisableWithSharedPreferences(this.f253289a);
            ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "res exception disable tinker forever with sp", new Object[0]);
        } else if (i == -2) {
            if (th.getMessage().contains(ShareConstants.CHECK_DEX_INSTALL_FAIL)) {
                ShareTinkerLog.m106531e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: tinker dex check fail:" + th.getMessage(), new Object[0]);
            } else {
                ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load dex exception: %s", th);
            }
            ShareTinkerInternals.setTinkerDisableWithSharedPreferences(this.f253289a);
            ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "dex exception disable tinker forever with sp", new Object[0]);
        } else if (i == -1) {
            ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load unknown exception: %s", th);
        }
        ShareTinkerLog.m106531e("Tinker.DefaultLoadReporter", "tinker load exception, welcome to submit issue to us: https://github.com/Tencent/tinker/issues", new Object[0]);
        ShareTinkerLog.printErrStackTrace("Tinker.DefaultLoadReporter", th, "tinker load exception", new Object[0]);
        C87821a.m109275c(this.f253289a).f254237j = 0;
        mo121822j();
    }

    /* renamed from: i */
    public void mo109438i(File file, int i) {
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchListenerReceiveFail: patch receive fail: %s, code: %d", file.getAbsolutePath(), Integer.valueOf(i));
    }

    /* renamed from: j */
    public void mo121822j() {
        C87821a.m109275c(this.f253289a).mo122277a();
    }

    /* renamed from: k */
    public boolean mo121823k() {
        File file;
        C87821a c = C87821a.m109275c(this.f253289a);
        if (!c.f254235h || (file = c.f254238k.f254258g) == null || !C88034b.m109603b(this.f253289a).mo122482c(SharePatchFileUtil.getMD5(file))) {
            return false;
        }
        ShareTinkerLog.m106532i("Tinker.DefaultLoadReporter", "try to repair oat file on patch process", new Object[0]);
        C87825c.m109282a(this.f253289a, file.getAbsolutePath());
        return true;
    }
}
