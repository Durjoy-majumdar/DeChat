package fv3;

import com.tencent.tinker.loader.TinkerDexOptimizer;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.io.File;
import java.util.List;

/* renamed from: fv3.d */
public final class C87098d implements TinkerDexOptimizer.ResultCallback {

    /* renamed from: a */
    public long f252696a;

    /* renamed from: b */
    public final /* synthetic */ boolean[] f252697b;

    /* renamed from: c */
    public final /* synthetic */ List f252698c;

    /* renamed from: d */
    public final /* synthetic */ Throwable[] f252699d;

    public C87098d(boolean[] zArr, List list, Throwable[] thArr) {
        this.f252697b = zArr;
        this.f252698c = list;
        this.f252699d = thArr;
    }

    public void onFailed(File file, File file2, Throwable th) {
        ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "fail to parallel optimize dex %s use time %d", file.getPath(), Long.valueOf(System.currentTimeMillis() - this.f252696a));
        this.f252698c.add(file);
        this.f252699d[0] = th;
    }

    public void onStart(File file, File file2) {
        this.f252696a = System.currentTimeMillis();
        ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "start to parallel optimize dex %s, size: %d", file.getPath(), Long.valueOf(file.length()));
    }

    public void onSuccess(File file, File file2, File file3) {
        ShareTinkerLog.m106532i("Tinker.DexDiffPatchInternal", "success to parallel optimize dex %s, opt file:%s, opt file size: %d, use time %d", file.getPath(), file3.getPath(), Long.valueOf(file3.length()), Long.valueOf(System.currentTimeMillis() - this.f252696a));
        if (!file3.exists()) {
            synchronized (this.f252697b) {
                this.f252697b[0] = true;
            }
        }
    }
}
