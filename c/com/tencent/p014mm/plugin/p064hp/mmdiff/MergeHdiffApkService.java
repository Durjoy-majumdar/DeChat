package com.tencent.p014mm.plugin.p064hp.mmdiff;

import android.app.IntentService;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import b12.C79645d;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import p213oh.C11412b;
import v02.C90734a;
import w02.C90878b;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService */
public class MergeHdiffApkService extends IntentService {

    /* renamed from: d */
    public static AtomicBoolean f248326d = new AtomicBoolean(false);

    /* renamed from: com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService$InnerService */
    public static class InnerService extends Service {
        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onCreate() {
            super.onCreate();
            try {
                AtomicBoolean atomicBoolean = MergeHdiffApkService.f248326d;
                startForeground(ShareConstants.TINKER_PATCH_SERVICE_NOTIFICATION, new Notification());
            } catch (Throwable th) {
                ShareTinkerLog.m106531e("Tinker.MergeHdiffApkService.HdiffApk", "InnerService set service for push exception:%s.", th);
            }
            stopSelf();
        }

        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }
    }

    public MergeHdiffApkService() {
        super("MergeHdiffApkService");
        setIntentRedelivery(true);
    }

    /* renamed from: a */
    public static String m105115a(Intent intent) {
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("result_bundle_extra");
            return bundleExtra == null ? "" : bundleExtra.getString("patch_path_extra", "");
        }
        throw new TinkerRuntimeException("getPatchPathExtra, but intent is null");
    }

    /* renamed from: b */
    public static void m105116b(Context context) {
        File file = new File(SharePatchFileUtil.getPatchDirectory(context), "mmdiff_patch_service_status/running_" + Process.myPid());
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.exists()) {
                File[] listFiles = parentFile.listFiles();
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            } else {
                parentFile.mkdirs();
            }
            try {
                if (!file.createNewFile()) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                ShareTinkerLog.printErrStackTrace("Tinker.MergeHdiffApkService.HdiffApk", th, "Fail to create running marker file.", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public static void m105117c(Context context) {
        File patchDirectory = SharePatchFileUtil.getPatchDirectory(context);
        File file = new File(patchDirectory, "mmdiff_patch_service_status/running_" + Process.myPid());
        if (file.exists()) {
            file.delete();
        }
    }

    public void onHandleIntent(Intent intent) {
        int i;
        if (intent == null) {
            int i2 = C11412b.f33577a;
            Log.m105921e("Tinker.MergeHdiffApkService.HdiffApk", "MergeHdiffApkService received null result!!!!", (Object[]) null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ShareTinkerLog.m106532i("Tinker.MergeHdiffApkService.HdiffApk", "for system version >= Android O, we just ignore increasingPriority job to avoid crash or toasts.", new Object[0]);
        } else if ("ZUK".equals(Build.MANUFACTURER)) {
            ShareTinkerLog.m106532i("Tinker.MergeHdiffApkService.HdiffApk", "for ZUK device, we just ignore increasingPriority job to avoid crash.", new Object[0]);
        } else {
            ShareTinkerLog.m106532i("Tinker.MergeHdiffApkService.HdiffApk", "try to increase patch process priority", new Object[0]);
            try {
                startForeground(ShareConstants.TINKER_PATCH_SERVICE_NOTIFICATION, new Notification());
                startService(new Intent(this, InnerService.class));
            } catch (Throwable th) {
                ShareTinkerLog.m106532i("Tinker.MergeHdiffApkService.HdiffApk", "try to increase patch process priority error:" + th, new Object[0]);
            }
        }
        if (intent.getBooleanExtra("is_preload_patch_process", false)) {
            int i3 = C11412b.f33577a;
            Log.m105919d("Tinker.MergeHdiffApkService.HdiffApk", "do nothing just start patch process.", (Object[]) null);
            return;
        }
        int i4 = C11412b.f33577a;
        Log.m105919d("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch.", (Object[]) null);
        try {
            Bundle bundleExtra = intent.getBundleExtra("result_bundle_extra");
            if (bundleExtra == null) {
                Log.m105921e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch, bundle is null.", (Object[]) null);
            } else if (!(bundleExtra.getParcelable("patch_syncresponse_extra") instanceof TinkerSyncResponse)) {
                Log.m105921e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch, respone is null.", (Object[]) null);
            } else if (!f248326d.compareAndSet(false, true)) {
                ShareTinkerLog.m106534w("Tinker.MergeHdiffApkService.HdiffApk", "MergeHdiffApkService doApplyPatch is running by another runner.", new Object[0]);
            } else {
                try {
                    m105116b(this);
                    String a = m105115a(intent);
                    if (a == null) {
                        ShareTinkerLog.m106531e("Tinker.MergeHdiffApkService.HdiffApk", "MergeHdiffApkService can't get the path extra, ignoring.", new Object[0]);
                        m105117c(this);
                        f248326d.set(false);
                        Log.m105925i("Tinker.MergeHdiffApkService.HdiffApk", "sIsPatchApplying = %s.", f248326d);
                        return;
                    }
                    File file = new File(a);
                    TinkerSyncResponse tinkerSyncResponse = (TinkerSyncResponse) intent.getBundleExtra("result_bundle_extra").getParcelable("patch_syncresponse_extra");
                    if (tinkerSyncResponse.f248353v) {
                        C79645d.f233535f = 1;
                        i = C90734a.m113786c(this, file.getAbsolutePath(), tinkerSyncResponse);
                    } else {
                        C79645d.f233535f = 2;
                        i = C90734a.m113789f(file.getAbsolutePath(), tinkerSyncResponse);
                    }
                    Log.m105925i("Tinker.MergeHdiffApkService.HdiffApk", "code = %s, syncResponse = %s", Integer.valueOf(i), tinkerSyncResponse);
                    C90878b bVar = new C90878b();
                    bVar.f260855d = i == 0;
                    bVar.f260856e = i;
                    bVar.f260857f = tinkerSyncResponse.f248353v;
                    m105117c(this);
                    f248326d.set(false);
                    MMDiffPatchResultService.m105113b(this, bVar, true);
                    m105117c(this);
                    f248326d.set(false);
                    Log.m105925i("Tinker.MergeHdiffApkService.HdiffApk", "sIsPatchApplying = %s.", f248326d);
                } catch (Exception e) {
                    Object[] objArr = {e};
                    int i5 = C11412b.f33577a;
                    Log.m105921e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch, e2 = %s", objArr);
                    m105117c(this);
                    f248326d.set(false);
                    Log.m105925i("Tinker.MergeHdiffApkService.HdiffApk", "sIsPatchApplying = %s.", f248326d);
                } catch (Throwable th4) {
                    m105117c(this);
                    f248326d.set(false);
                    Object[] objArr2 = {f248326d};
                    int i6 = C11412b.f33577a;
                    Log.m105925i("Tinker.MergeHdiffApkService.HdiffApk", "sIsPatchApplying = %s.", objArr2);
                    throw th4;
                }
            }
        } catch (Exception e2) {
            Object[] objArr3 = {e2};
            int i7 = C11412b.f33577a;
            Log.m105921e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch e = %s", objArr3);
        }
    }
}
