package w02;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.tencent.p014mm.plugin.p064hp.mmdiff.MergeHdiffApkService;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.lib.service.TinkerPatchForeService;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jv3.C88033a;
import p213oh.C11412b;
import tw0.C90585h;

/* renamed from: w02.e */
public class C90882e implements C90883f {

    /* renamed from: a */
    public final Context f260862a;

    /* renamed from: b */
    public ServiceConnection f260863b;

    public C90882e(Context context) {
        this.f260862a = context;
    }

    /* renamed from: a */
    public int mo124981a(String str, C90585h hVar, boolean z) {
        boolean z2;
        int i;
        try {
            this.f260863b = new C90881d(this);
            this.f260862a.bindService(new Intent(this.f260862a, TinkerPatchForeService.class), this.f260863b, 1);
        } catch (Throwable unused) {
        }
        if (z) {
            Context context = this.f260862a;
            AtomicBoolean atomicBoolean = MergeHdiffApkService.f248326d;
            ShareTinkerLog.m106532i("Tinker.MergeHdiffApkService.HdiffApk", "preLoadPatchProcess...", new Object[0]);
            Intent intent = new Intent(context, MergeHdiffApkService.class);
            intent.putExtra("is_preload_patch_process", true);
            try {
                context.startService(intent);
            } catch (Throwable th) {
                ShareTinkerLog.m106531e("Tinker.MergeHdiffApkService.HdiffApk", "run patch service fail, exception:" + th, new Object[0]);
            }
        } else {
            Context context2 = this.f260862a;
            TinkerSyncResponse tinkerSyncResponse = (TinkerSyncResponse) hVar;
            AtomicBoolean atomicBoolean2 = MergeHdiffApkService.f248326d;
            ShareTinkerLog.m106532i("Tinker.MergeHdiffApkService.HdiffApk", "run patch service...", new Object[0]);
            try {
                String a = C88033a.m109600a(context2);
                if (a != null) {
                    ActivityManager activityManager = (ActivityManager) context2.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    if (activityManager != null) {
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            if (runningAppProcesses.size() != 0) {
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i = 0;
                                        break;
                                    }
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (next.processName.equals(a)) {
                                        i = next.pid;
                                        break;
                                    }
                                }
                                if (i != 0) {
                                    File patchDirectory = SharePatchFileUtil.getPatchDirectory(context2);
                                    z2 = new File(patchDirectory, "mmdiff_patch_service_status/running_" + i).exists();
                                    Object[] objArr = {str, Boolean.valueOf(z2), tinkerSyncResponse};
                                    int i2 = C11412b.f33577a;
                                    Log.m105919d("Tinker.MergeHdiffApkService.HdiffApk", "path = %s, isRunning = %s,syncResponse = %s.", objArr);
                                    Bundle bundle = new Bundle();
                                    Intent intent2 = new Intent(context2, MergeHdiffApkService.class);
                                    bundle.putString("patch_path_extra", str);
                                    bundle.putParcelable("patch_syncresponse_extra", tinkerSyncResponse);
                                    intent2.putExtra("result_bundle_extra", bundle);
                                    context2.startService(intent2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            z2 = false;
            Object[] objArr2 = {str, Boolean.valueOf(z2), tinkerSyncResponse};
            int i25 = C11412b.f33577a;
            Log.m105919d("Tinker.MergeHdiffApkService.HdiffApk", "path = %s, isRunning = %s,syncResponse = %s.", objArr2);
            Bundle bundle2 = new Bundle();
            Intent intent22 = new Intent(context2, MergeHdiffApkService.class);
            bundle2.putString("patch_path_extra", str);
            bundle2.putParcelable("patch_syncresponse_extra", tinkerSyncResponse);
            intent22.putExtra("result_bundle_extra", bundle2);
            try {
                context2.startService(intent22);
            } catch (Throwable th4) {
                ShareTinkerLog.m106531e("Tinker.MergeHdiffApkService.HdiffApk", "run patch service fail, exception:" + th4, new Object[0]);
            }
        }
        return 0;
    }
}
