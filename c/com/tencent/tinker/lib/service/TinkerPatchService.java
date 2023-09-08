package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import fv3.C87095a;
import hv3.C87598a;
import iv3.C87821a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public class TinkerPatchService extends IntentService {

    /* renamed from: d */
    public static C87095a f250525d;

    /* renamed from: e */
    public static Class<? extends AbstractResultService> f250526e;

    /* renamed from: f */
    public static AtomicBoolean f250527f = new AtomicBoolean(false);

    public static class InnerService extends Service {
        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onCreate() {
            super.onCreate();
            try {
                C87095a aVar = TinkerPatchService.f250525d;
                startForeground(ShareConstants.TINKER_PATCH_SERVICE_NOTIFICATION, new Notification());
            } catch (Throwable th) {
                ShareTinkerLog.m106531e("Tinker.TinkerPatchService", "InnerService set service for push exception:%s.", th);
            }
            stopSelf();
        }

        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }
    }

    public TinkerPatchService() {
        super("TinkerPatchService");
        setIntentRedelivery(true);
    }

    /* renamed from: a */
    public static void m106528a(Context context) {
        File file = new File(SharePatchFileUtil.getPatchDirectory(context), "patch_service_status/running_" + Process.myPid());
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
                ShareTinkerLog.printErrStackTrace("Tinker.TinkerPatchService", th, "Fail to create running marker file.", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static void m106529b(Context context) {
        File patchDirectory = SharePatchFileUtil.getPatchDirectory(context);
        File file = new File(patchDirectory, "patch_service_status/running_" + Process.myPid());
        if (file.exists()) {
            file.delete();
        }
    }

    public void onHandleIntent(Intent intent) {
        C87821a c;
        File file;
        Throwable th;
        boolean z;
        if (Build.VERSION.SDK_INT >= 26) {
            ShareTinkerLog.m106532i("Tinker.TinkerPatchService", "for system version >= Android O, we just ignore increasingPriority job to avoid crash or toasts.", new Object[0]);
        } else if ("ZUK".equals(Build.MANUFACTURER)) {
            ShareTinkerLog.m106532i("Tinker.TinkerPatchService", "for ZUK device, we just ignore increasingPriority job to avoid crash.", new Object[0]);
        } else {
            ShareTinkerLog.m106532i("Tinker.TinkerPatchService", "try to increase patch process priority", new Object[0]);
            try {
                startForeground(ShareConstants.TINKER_PATCH_SERVICE_NOTIFICATION, new Notification());
                startService(new Intent(this, InnerService.class));
            } catch (Throwable th4) {
                ShareTinkerLog.m106532i("Tinker.TinkerPatchService", "try to increase patch process priority error:" + th4, new Object[0]);
            }
        }
        if (!f250527f.compareAndSet(false, true)) {
            ShareTinkerLog.m106534w("Tinker.TinkerPatchService", "TinkerPatchService doApplyPatch is running by another runner.", new Object[0]);
            return;
        }
        try {
            m106528a(this);
            c = C87821a.m109275c(this);
            c.f254232e.mo109446h(intent);
            if (intent == null) {
                ShareTinkerLog.m106531e("Tinker.TinkerPatchService", "TinkerPatchService received a null intent, ignoring.", new Object[0]);
            } else {
                String stringExtra = ShareIntentUtil.getStringExtra(intent, "patch_path_extra");
                if (stringExtra == null) {
                    ShareTinkerLog.m106531e("Tinker.TinkerPatchService", "TinkerPatchService can't get the path extra, ignoring.", new Object[0]);
                } else {
                    file = new File(stringExtra);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    th = null;
                    C87598a aVar = new C87598a();
                    C87095a aVar2 = f250525d;
                    if (aVar2 != null) {
                        z = aVar2.mo121561a(this, stringExtra, aVar);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        c.f254232e.mo109441c(file, z, elapsedRealtime2);
                        aVar.f253683d = z;
                        aVar.f253684e = stringExtra;
                        aVar.f253685f = elapsedRealtime2;
                        aVar.f253688i = th;
                        m106529b(this);
                        f250527f.set(false);
                        AbstractResultService.m106523b(this, aVar, ShareIntentUtil.getStringExtra(intent, "patch_result_class"));
                    } else {
                        throw new TinkerRuntimeException("upgradePatchProcessor is null.");
                    }
                }
            }
        } catch (Throwable th5) {
            m106529b(this);
            throw th5;
        }
        m106529b(this);
    }
}
