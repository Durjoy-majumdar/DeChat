package com.tencent.p014mm.sdcard_migrate;

import a70.C112760b;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdcard_migrate.util.ExtStorageMigrateException;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import j20.C117292a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lg3.C88496e;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateRoutine */
public final class ExtStorageMigrateRoutine {
    public static final String AUXUI_ACTION_DO_MIGRATE_ROUTINE = "auxui_action_do_migrate_routine";
    public static final String AUXUI_PARAM_IS_MIGRAION_END = "auxui_param_is_migration_end";
    public static final ExtStorageMigrateConfig DEFAULT_CONFIG = ExtStorageMigrateConfig.f347831h;
    private static final boolean[] IS_ACCOUNT_INIT_CALLBACK_ADDED = {false};
    private static final String LAUNCHER_UI_CLASS_NAME = "com.tencent.mm.ui.LauncherUI";
    public static final int NOTIFICATION_TASK_ID = 1027;
    public static final int PENDING_INTENT_REQUEST_CANCEL_MIGRATION = 3843;
    public static final int PENDING_INTENT_REQUEST_LAUNCH_QUESTIONNAIRE = 3841;
    public static final int PENDING_INTENT_REQUEST_LAUNCH_WECHAT = 3842;
    public static final int RESULT_CANCEL_REASON_CANCEL_BEFORE_PROCESSING = 2;
    public static final int RESULT_CANCEL_REASON_CANCEL_ON_PROCESSING = 3;
    public static final int RESULT_CANCEL_REASON_UNNECESSARY = 1;
    public static final int RESULT_FAIL_REASON_DEST_PATH_UNAVAILABLE = 8;
    public static final int RESULT_FAIL_REASON_EXCEPTION_OCCURRED = 5;
    public static final int RESULT_FAIL_REASON_SERVICE_IS_BUSY = 4;
    public static final int RESULT_FAIL_REASON_SERVICE_IS_KILLED = 6;
    public static final int RESULT_FAIL_REASON_SRC_PATH_UNAVAILABLE = 7;
    public static final String SERVICE_ACTION_CANCEL_MIGRATE = "service_action_cancel_migrate";
    public static final String SERVICE_ACTION_STARTUP = "service_action_startup";
    private static final String SERVICE_CLASS_NAME = "com.tencent.mm.sdcard_migrate.ExtStorageMigrateService";
    private static final String SERVICE_PROCESS_SUFFIX = ":extmig";
    private static final String TAG = "MicroMsg.ExtStorageMigrateRoutine";
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateRoutine$a */
    public class C85726a implements MMApplicationContext.IResourceProvider {

        /* renamed from: a */
        public final /* synthetic */ Application f249784a;

        public C85726a(Application application) {
            this.f249784a = application;
        }

        public Resources getResources() {
            return C88496e.m110361d(this.f249784a.getResources(), this.f249784a, false);
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateRoutine$b */
    public class C85727b implements ServiceConnection {

        /* renamed from: d */
        public IBinder f249785d = null;

        /* renamed from: e */
        public IBinder.DeathRecipient f249786e = new C85728a();

        /* renamed from: f */
        public final /* synthetic */ MigrateResultCallback f249787f;

        /* renamed from: g */
        public final /* synthetic */ ExtStorageMigrateConfig f249788g;

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateRoutine$b$a */
        public class C85728a implements IBinder.DeathRecipient {
            public C85728a() {
            }

            public void binderDied() {
                IBinder iBinder = C85727b.this.f249785d;
                if (iBinder != null) {
                    iBinder.unlinkToDeath(this, 0);
                    try {
                        C85727b.this.f249787f.mo176532m(6, (ExtStorageMigrateException) null);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public C85727b(MigrateResultCallback migrateResultCallback, ExtStorageMigrateConfig extStorageMigrateConfig) {
            this.f249787f = migrateResultCallback;
            this.f249788g = extStorageMigrateConfig;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(1:2)(2:3|(1:8)(1:7))|9|10|11|16|17|25) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
            ((com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.C85724a) com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.f249775e).mo119342d(com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine.TAG, r8, "[-] Exception occurred.", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r6.f249787f.mo176532m(5, new com.tencent.p014mm.sdcard_migrate.util.ExtStorageMigrateException(r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0038 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
            /*
                r6 = this;
                java.lang.String r7 = "[-] Exception occurred."
                java.lang.String r0 = "MicroMsg.ExtStorageMigrateRoutine"
                r6.f249785d = r8
                int r1 = com.tencent.p014mm.sdcard_migrate.C115961h.C115962a.f347893d
                r1 = 0
                if (r8 != 0) goto L_0x000d
                r2 = r1
                goto L_0x0021
            L_0x000d:
                java.lang.String r2 = "com.tencent.mm.sdcard_migrate.IMigrateServiceController"
                android.os.IInterface r2 = r8.queryLocalInterface(r2)
                if (r2 == 0) goto L_0x001c
                boolean r3 = r2 instanceof com.tencent.p014mm.sdcard_migrate.C115961h
                if (r3 == 0) goto L_0x001c
                com.tencent.mm.sdcard_migrate.h r2 = (com.tencent.p014mm.sdcard_migrate.C115961h) r2
                goto L_0x0021
            L_0x001c:
                com.tencent.mm.sdcard_migrate.h$a$a r2 = new com.tencent.mm.sdcard_migrate.h$a$a
                r2.<init>(r8)
            L_0x0021:
                r3 = 0
                android.os.IBinder$DeathRecipient r4 = r6.f249786e     // Catch:{ RemoteException -> 0x0028 }
                r8.linkToDeath(r4, r3)     // Catch:{ RemoteException -> 0x0028 }
                goto L_0x0038
            L_0x0028:
                r8 = move-exception
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$b r4 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.f249775e
                java.lang.Object[] r5 = new java.lang.Object[r3]
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$a r4 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.C85724a) r4
                r4.mo119342d(r0, r8, r7, r5)
                com.tencent.mm.sdcard_migrate.MigrateResultCallback r8 = r6.f249787f     // Catch:{ RemoteException -> 0x0038 }
                r4 = 6
                r8.mo176532m(r4, r1)     // Catch:{ RemoteException -> 0x0038 }
            L_0x0038:
                com.tencent.mm.sdcard_migrate.MigrateResultCallback r8 = r6.f249787f     // Catch:{ RemoteException -> 0x0043 }
                r2.mo176511uR(r8)     // Catch:{ RemoteException -> 0x0043 }
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig r8 = r6.f249788g     // Catch:{ RemoteException -> 0x0043 }
                r2.mo176510dx(r8)     // Catch:{ RemoteException -> 0x0043 }
                goto L_0x0058
            L_0x0043:
                r8 = move-exception
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$b r1 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.f249775e
                java.lang.Object[] r2 = new java.lang.Object[r3]
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$a r1 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.C85724a) r1
                r1.mo119342d(r0, r8, r7, r2)
                com.tencent.mm.sdcard_migrate.MigrateResultCallback r7 = r6.f249787f     // Catch:{ RemoteException -> 0x0058 }
                r0 = 5
                com.tencent.mm.sdcard_migrate.util.ExtStorageMigrateException r1 = new com.tencent.mm.sdcard_migrate.util.ExtStorageMigrateException     // Catch:{ RemoteException -> 0x0058 }
                r1.<init>(r8)     // Catch:{ RemoteException -> 0x0058 }
                r7.mo176532m(r0, r1)     // Catch:{ RemoteException -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine.C85727b.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Object[] objArr = {componentName};
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e(ExtStorageMigrateRoutine.TAG, "[!] Service [%s] disconnected.", objArr);
        }
    }

    public static boolean bindMigrationService(Context context, ServiceConnection serviceConnection) {
        Intent intent = new Intent(SERVICE_ACTION_STARTUP);
        intent.setClassName(context, SERVICE_CLASS_NAME);
        return context.bindService(intent, serviceConnection, 0);
    }

    public static void cancelMigration(Context context) {
        if (isMigrateServiceRunning(context)) {
            Intent intent = new Intent();
            intent.setClassName(context, SERVICE_CLASS_NAME);
            intent.setAction(SERVICE_ACTION_CANCEL_MIGRATE);
            context.startService(intent);
        }
    }

    private static boolean isDeviceChangedUnexpectly() {
        String string = MultiProcessMMKV.getMMKV("extstg_migrate_preconditions").getString("last_fingerprint", "");
        if (string != null && string.equals(Build.FINGERPRINT)) {
            return false;
        }
        boolean[] zArr = IS_ACCOUNT_INIT_CALLBACK_ADDED;
        synchronized (zArr) {
            if (!zArr[0]) {
                zArr[0] = true;
            }
        }
        return true;
    }

    private static boolean isMainProcess(String str) {
        return str.indexOf(58) < 0;
    }

    private static boolean isMigrateServiceProcess(String str) {
        return str.endsWith(SERVICE_PROCESS_SUFFIX);
    }

    private static boolean isMigrateServiceRunning(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo next : runningServices) {
            if (next.uid == Process.myUid() && next.service.getClassName().equals(SERVICE_CLASS_NAME)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isStartWithActivity(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(Integer.MAX_VALUE);
        if (runningTasks == null) {
            return false;
        }
        for (ActivityManager.RunningTaskInfo next : runningTasks) {
            if (next.numActivities > 0) {
                String packageName = context.getPackageName();
                ComponentName componentName = next.topActivity;
                if (componentName != null && packageName.equals(componentName.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean needsToDoMigrate(Context context) {
        ExtStorageMigrateMonitor.m105904c(1315, 102, 1);
        if (MultiProcessMMKV.getMMKV("extmig_status_memo_storage").getBoolean("key_is_olddata_ignored_v2", false)) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Newly installed, existed old data is ignored, do not need to migrate.", new Object[0]);
            ExtStorageMigrateMonitor.m105904c(1315, 190, 1);
            return false;
        }
        ExtStorageMigrateConfig extStorageMigrateConfig = DEFAULT_CONFIG;
        if (C85730f.m105911a(extStorageMigrateConfig.f347832d)) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Already migrated, do not need to migrate", new Object[0]);
            return false;
        } else if (!new File(extStorageMigrateConfig.f347832d).exists()) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Old external storage directory does not exist, do not need to migrate.", new Object[0]);
            return false;
        } else {
            ExtStorageMigrateMonitor.m105904c(1315, 100, 1);
            return true;
        }
    }

    private static void startMigrateQuestionnaire(Context context) {
        Intent intent = new Intent(context, ExtStorageMigrateAuxActivity.class);
        intent.setAction(AUXUI_ACTION_DO_MIGRATE_ROUTINE);
        intent.addFlags(268435456);
        try {
            PendingIntent.getActivity(context, PENDING_INTENT_REQUEST_LAUNCH_QUESTIONNAIRE, intent, 268435456).send();
        } catch (Throwable th) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d(TAG, th, "[-] startMigrateQuestionnaire failed, just do normal startup next.", new Object[0]);
            startWeChat(context);
        }
    }

    public static void startMigration(Context context, ExtStorageMigrateConfig extStorageMigrateConfig, MigrateResultCallback migrateResultCallback) {
        startupMigrationService(context);
        bindMigrationService(context, new C85727b(migrateResultCallback, extStorageMigrateConfig));
    }

    public static void startWeChat(Context context) {
        MultiProcessMMKV.getMMKV("extmig_status_memo_storage").encode("key_indicate_goon_by_migrate_routine", true);
        Intent launchIntentForPackage = context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Class<LauncherUI> cls = LauncherUI.class;
            try {
                ArrayList<LauncherUI> arrayList = LauncherUI.f214332A;
                Intent intent = new Intent(context, cls);
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.addCategory("android.intent.category.DEFAULT");
                launchIntentForPackage = intent;
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Should not be here.");
            }
        }
        launchIntentForPackage.addFlags(268435456);
        try {
            PendingIntent.getActivity(context, PENDING_INTENT_REQUEST_LAUNCH_WECHAT, launchIntentForPackage, 268435456).send();
        } catch (Throwable th) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d(TAG, th, "[-] startWeChat failed, retry with normal way.", new Object[0]);
            if (context instanceof Activity) {
                launchIntentForPackage.removeFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(launchIntentForPackage);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/sdcard_migrate/ExtStorageMigrateRoutine", "startWeChat", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/sdcard_migrate/ExtStorageMigrateRoutine", "startWeChat", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public static void startupMigrationService(Context context) {
        Intent intent = new Intent(SERVICE_ACTION_STARTUP);
        intent.setClassName(context, SERVICE_CLASS_NAME);
        context.startService(intent);
        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] startupMigrationService called.", new Object[0]);
    }

    private static void suicide() {
        int myPid = Process.myPid();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(myPid));
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/sdcard_migrate/ExtStorageMigrateRoutine", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/mm/sdcard_migrate/ExtStorageMigrateRoutine", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public static void triggerMediaRescanOnDemand() {
        Application application = C80589e.f235760a.getApplication();
        if (application.getPackageName().equals(C80589e.f235762c) && MultiProcessMMKV.getMMKV("extmig_status_memo_storage").getBoolean("key_indicate_rescan_needed_by_migrate_routine", false)) {
            AndroidMediaUtil.refreshMediaScannerWithoutVFSRemapAsync(C112760b.m154221b(), application);
            AndroidMediaUtil.refreshMediaScannerWithoutVFSRemapAsync(C112760b.m154220a0(), application);
            MultiProcessMMKV.getMMKV("extmig_status_memo_storage").encode("key_indicate_rescan_needed_by_migrate_routine", false);
        }
    }

    public static boolean triggerOnDemand(Application application) {
        if (!new File(C112760b.m154225d(), "version_history.cfg").exists()) {
            ExtStorageMigrateMonitor.C85725b bVar = ExtStorageMigrateMonitor.f249775e;
            ((ExtStorageMigrateMonitor.C85724a) bVar).mo119341c("MicroMsg.ExtStorageMigrateStatus", "[+] Mark newly installed in process: %s", C80589e.f235762c);
            MultiProcessMMKV.getMMKV("extmig_status_memo_storage").encode("key_is_olddata_ignored_v2", true);
        }
        String str = C80589e.f235762c;
        if (isMigrateServiceProcess(str)) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Migrate Service Process, skip rest logic in appLike.", new Object[0]);
            LocaleUtil.initLanguage(application);
            MMApplicationContext.setResourcesProvider(new C85726a(application));
            return true;
        } else if (!isMainProcess(str)) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Not in main process, startup normally.", new Object[0]);
            return false;
        } else if (MultiProcessMMKV.getMMKV("extmig_status_memo_storage").getBoolean("key_indicate_goon_by_migrate_routine", false)) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Last migrate routine indicates that we should startup normally this time.", new Object[0]);
            MultiProcessMMKV.getMMKV("extmig_status_memo_storage").encode("key_indicate_goon_by_migrate_routine", false);
            return false;
        } else {
            if (!isMigrateServiceRunning(application)) {
                ExtStorageMigrateMonitor.C85724a aVar = (ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e;
                aVar.mo119341c(TAG, "[+] Migrate service is not running, check if we have READ_EXTERNAL_STORAGE next.", new Object[0]);
                boolean Gd0 = ((C103918d) C86312j.m106911c(C103918d.class)).Gd0(application, "android.permission.READ_EXTERNAL_STORAGE");
                if (!Gd0) {
                    aVar.mo119343e(TAG, "[!] No READ_EXTERNAL_STORAGE permission, check if old sdcard path can read next.", new Object[0]);
                    Gd0 = new File(C112760b.m154223c()).canRead();
                }
                if (Gd0) {
                    aVar.mo119341c(TAG, "[+] We have external storage permission, do not need to migrate.", new Object[0]);
                    return false;
                }
                aVar.mo119341c(TAG, "[+] We have no external storage permission, do further check next.", new Object[0]);
            } else {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Migrate service is running, check if we are doing migrating next.", new Object[0]);
            }
            if (!isStartWithActivity(application)) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] Start up without any activities, let it continue normally.", new Object[0]);
                return false;
            } else if (isDeviceChangedUnexpectly()) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c(TAG, "[+] External tools may move us into a new device or OTA happened, skip migrate this time.", new Object[0]);
                return false;
            } else if (!needsToDoMigrate(application)) {
                return false;
            } else {
                startMigrateQuestionnaire(application);
                ExtStorageMigrateMonitor.m105903b();
                suicide();
                return true;
            }
        }
    }
}
