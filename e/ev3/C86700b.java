package ev3;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.text.TextUtils;
import com.tencent.tinker.lib.service.TinkerPatchForeService;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import fv3.C87095a;
import iv3.C87821a;
import iv3.C87826d;
import java.io.File;
import jv3.C88033a;
import jv3.C88034b;

/* renamed from: ev3.b */
public class C86700b implements C86701c {

    /* renamed from: a */
    public final Context f251710a;

    /* renamed from: b */
    public ServiceConnection f251711b;

    public C86700b(Context context) {
        this.f251710a = context;
    }

    /* renamed from: a */
    public int mo121088a(String str) {
        int b = mo109429b(str, SharePatchFileUtil.getMD5(new File(str)));
        if (b == 0) {
            try {
                this.f251711b = new C86699a(this);
                this.f251710a.bindService(new Intent(this.f251710a, TinkerPatchForeService.class), this.f251711b, 1);
            } catch (Throwable unused) {
            }
            Context context = this.f251710a;
            C87095a aVar = TinkerPatchService.f250525d;
            ShareTinkerLog.m106532i("Tinker.TinkerPatchService", "run patch service...", new Object[0]);
            Intent intent = new Intent(context, TinkerPatchService.class);
            intent.putExtra("patch_path_extra", str);
            intent.putExtra("patch_result_class", TinkerPatchService.f250526e.getName());
            try {
                context.startService(intent);
            } catch (Throwable th) {
                ShareTinkerLog.m106531e("Tinker.TinkerPatchService", "run patch service fail, exception:" + th, new Object[0]);
            }
        } else {
            C87821a.m109275c(this.f251710a).f254231d.mo109438i(new File(str), b);
        }
        return b;
    }

    /* renamed from: b */
    public int mo109429b(String str, String str2) {
        C87821a c = C87821a.m109275c(this.f251710a);
        if (!ShareTinkerInternals.isTinkerEnabled(c.f254237j) || !ShareTinkerInternals.isTinkerEnableWithSharedPreferences(this.f251710a)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2) || !SharePatchFileUtil.isLegalFile(new File(str))) {
            return -2;
        }
        if (c.f254236i) {
            return -4;
        }
        if (C88033a.m109601b(this.f251710a)) {
            return -3;
        }
        if (ShareTinkerInternals.isVmJit()) {
            return -5;
        }
        C87826d dVar = c.f254238k;
        if (!(c.f254235h && dVar != null && dVar.f254255d)) {
            String absolutePath = c.f254229b.getAbsolutePath();
            try {
                SharePatchInfo readAndCheckPropertyWithLock = SharePatchInfo.readAndCheckPropertyWithLock(SharePatchFileUtil.getPatchInfoFile(absolutePath), SharePatchFileUtil.getPatchInfoLockFile(absolutePath));
                if (readAndCheckPropertyWithLock != null && !ShareTinkerInternals.isNullOrNil(readAndCheckPropertyWithLock.newVersion) && !readAndCheckPropertyWithLock.newVersion.equals(readAndCheckPropertyWithLock.versionToRemove) && str2.equals(readAndCheckPropertyWithLock.newVersion)) {
                    return -6;
                }
            } catch (Throwable unused) {
            }
        }
        return !C88034b.m109603b(this.f251710a).mo122482c(str2) ? -7 : 0;
    }
}
