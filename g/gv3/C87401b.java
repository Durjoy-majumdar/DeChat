package gv3;

import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import fv3.C87095a;
import iv3.C87821a;
import java.io.File;
import java.util.List;
import jv3.C88034b;

/* renamed from: gv3.b */
public class C87401b implements C87403d {

    /* renamed from: b */
    public static boolean f253290b;

    /* renamed from: a */
    public final Context f253291a;

    public C87401b(Context context) {
        this.f253291a = context;
    }

    /* renamed from: a */
    public void mo109439a(File file, SharePatchInfo sharePatchInfo, String str) {
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchVersionCheckFail: patch version exist. path: %s, version: %s", file.getAbsolutePath(), str);
    }

    /* renamed from: b */
    public void mo109440b(File file, int i) {
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchPackageCheckFail: package check failed. path: %s, code: %d", file.getAbsolutePath(), Integer.valueOf(i));
        if (i == -3 || i == -4 || i == -8) {
            C87821a.m109275c(this.f253291a).mo122278b(file);
        }
    }

    /* renamed from: c */
    public void mo109441c(File file, boolean z, long j) {
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchResult: patch all result path: %s, success: %b, cost: %d", file.getAbsolutePath(), Boolean.valueOf(z), Long.valueOf(j));
        if (!f253290b) {
            C88034b b = C88034b.m109603b(this.f253291a);
            if (b.f254656b.exists()) {
                SharePatchFileUtil.safeDeleteFile(b.f254656b);
            }
        }
    }

    /* renamed from: d */
    public void mo109442d(File file, File file2, String str, int i) {
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchTypeExtractFail: file extract fail type: %s, path: %s, extractTo: %s, filename: %s", ShareTinkerInternals.getTypeString(i), file.getPath(), file2.getPath(), str);
        C87821a.m109275c(this.f253291a).mo122278b(file);
    }

    /* renamed from: e */
    public void mo109443e(File file, List<File> list, Throwable th) {
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchDexOptFail: dex opt fail path: %s, dex size: %d", file.getAbsolutePath(), Integer.valueOf(list.size()));
        ShareTinkerLog.printErrStackTrace("Tinker.DefaultPatchReporter", th, "onPatchDexOptFail:", new Object[0]);
        if (th.getMessage().contains(ShareConstants.CHECK_DEX_OAT_EXIST_FAIL) || th.getMessage().contains(ShareConstants.CHECK_DEX_OAT_FORMAT_FAIL)) {
            f253290b = true;
            for (File safeDeleteFile : list) {
                SharePatchFileUtil.safeDeleteFile(safeDeleteFile);
            }
            return;
        }
        C87821a.m109275c(this.f253291a).mo122278b(file);
    }

    /* renamed from: f */
    public void mo109444f(File file, String str, String str2) {
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchInfoCorrupted: patch info is corrupted. old: %s, new: %s", str, str2);
        C87821a.m109275c(this.f253291a).mo122277a();
    }

    /* renamed from: g */
    public void mo109445g(File file, Throwable th) {
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchException: patch exception path: %s, throwable: %s", file.getAbsolutePath(), th.getMessage());
        ShareTinkerLog.m106531e("Tinker.DefaultPatchReporter", "tinker patch exception, welcome to submit issue to us: https://github.com/Tencent/tinker/issues", new Object[0]);
        ShareTinkerLog.printErrStackTrace("Tinker.DefaultPatchReporter", th, "tinker patch exception", new Object[0]);
        C87821a.m109275c(this.f253291a).f254237j = 0;
        C87821a.m109275c(this.f253291a).mo122278b(file);
    }

    /* renamed from: h */
    public void mo109446h(Intent intent) {
        C88034b.C88035a aVar;
        ShareTinkerLog.m106532i("Tinker.DefaultPatchReporter", "patchReporter onPatchServiceStart: patch service start", new Object[0]);
        f253290b = false;
        C88034b b = C88034b.m109603b(this.f253291a);
        b.getClass();
        if (intent == null) {
            ShareTinkerLog.m106531e("Tinker.UpgradePatchRetry", "onPatchServiceStart intent is null, just return", new Object[0]);
            return;
        }
        C87095a aVar2 = TinkerPatchService.f250525d;
        String stringExtra = ShareIntentUtil.getStringExtra(intent, "patch_path_extra");
        if (stringExtra == null) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch path is null, just return", new Object[0]);
            return;
        }
        File file = new File(stringExtra);
        String md5 = SharePatchFileUtil.getMD5(file);
        if (md5 == null) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch md5 is null, just return", new Object[0]);
            return;
        }
        if (b.f254655a.exists()) {
            aVar = C88034b.C88035a.m109608a(b.f254655a);
            String str = aVar.f254658a;
            if (str == null || aVar.f254659b == null || !md5.equals(str)) {
                b.mo122481a(file);
                aVar.f254658a = md5;
                aVar.f254659b = "1";
            } else {
                int parseInt = Integer.parseInt(aVar.f254659b);
                if (parseInt >= 20) {
                    SharePatchFileUtil.safeDeleteFile(b.f254656b);
                    ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchServiceStart retry more than max count, delete retry info file!", new Object[0]);
                    return;
                }
                aVar.f254659b = String.valueOf(parseInt + 1);
            }
        } else {
            b.mo122481a(file);
            aVar = new C88034b.C88035a(md5, "1");
        }
        C88034b.C88035a.m109609b(b.f254655a, aVar);
    }
}
