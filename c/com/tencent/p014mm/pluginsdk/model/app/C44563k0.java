package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.pluginsdk.model.app.IPCInstallApp;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import j20.C117292a;
import k20.C9556a;
import nd3.C47223a;
import nd3.C88929c;
import nd3.C88931f;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.pluginsdk.model.app.k0 */
public class C44563k0 {

    /* renamed from: com.tencent.mm.pluginsdk.model.app.k0$a */
    public class C44564a implements C88931f {

        /* renamed from: a */
        public final /* synthetic */ Context f120848a;

        /* renamed from: b */
        public final /* synthetic */ Intent f120849b;

        /* renamed from: c */
        public final /* synthetic */ C47223a f120850c;

        public C44564a(Context context, Intent intent, C47223a aVar) {
            this.f120848a = context;
            this.f120849b = intent;
            this.f120850c = aVar;
        }

        /* renamed from: a */
        public void mo62503a(int i, int i2, Intent intent) {
            Log.m105925i("MicroMsg.ApplicationUtil", "onRequestPermissionsResult, resultCode = %d", Integer.valueOf(i2));
            if (i2 == -1) {
                try {
                    Context context = this.f120848a;
                    Intent intent2 = this.f120849b;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil$1", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil$1", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ApplicationUtil", e, "install app failed! %s", this.f120849b);
                }
                C47223a aVar2 = this.f120850c;
                if (aVar2 != null) {
                    aVar2.mo6947a(true);
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.ApplicationUtil", "no get!!!");
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.h9q, 1).show();
            C47223a aVar3 = this.f120850c;
            if (aVar3 != null) {
                aVar3.mo6947a(false);
            }
        }
    }

    /* renamed from: a */
    public static String m48976a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            PackageInfo packageArchiveInfo = MMApplicationContext.getContext().getPackageManager().getPackageArchiveInfo(str, 0);
            if (packageArchiveInfo != null) {
                Log.m105925i("MicroMsg.ApplicationUtil", "get package name from archive filepath  :%s, package name is : %s", str, packageArchiveInfo.packageName);
                return packageArchiveInfo.packageName;
            }
            throw new RuntimeException("info is null; " + str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ApplicationUtil", "get package name from archive file path, failed : %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static int m48977b(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        try {
            PackageInfo packageArchiveInfo = MMApplicationContext.getContext().getPackageManager().getPackageArchiveInfo(str, 0);
            if (packageArchiveInfo != null) {
                Log.m105925i("MicroMsg.ApplicationUtil", "get package version code from archive filepath  :%s, package version code is : %d", str, Integer.valueOf(packageArchiveInfo.versionCode));
                return packageArchiveInfo.versionCode;
            }
            throw new RuntimeException("info is null; " + str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ApplicationUtil", "get package version code from archive file path, failed : %s", e.getMessage());
            return 0;
        }
    }

    /* renamed from: c */
    public static void m48978c(Context context, Intent intent, C47223a aVar, boolean z) {
        Log.m105924i("MicroMsg.ApplicationUtil", "installApp");
        if (z && Build.BRAND.equals("vivo")) {
            intent.putExtra("installDir", true);
            Log.m105924i("MicroMsg.ApplicationUtil", "is vivo, try to prevent the interception");
        }
        try {
            if (Build.VERSION.SDK_INT < 26 || context.getPackageManager().canRequestPackageInstalls()) {
                Log.m105924i("MicroMsg.ApplicationUtil", "install directly");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/pluginsdk/permission/InstallApkListener;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/pluginsdk/permission/InstallApkListener;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                if (aVar != null) {
                    aVar.mo6947a(true);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.ApplicationUtil", "request install apk permission");
            C88929c.m111025i(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())), MMApplicationContext.getContext().getString(C0966R.string.hif), MMApplicationContext.getContext().getString(C0966R.string.fre), new C44564a(context, intent, aVar));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ApplicationUtil", e, "install app failed! %s", intent);
            if (aVar != null) {
                aVar.mo6947a(false);
            }
        }
    }

    /* renamed from: d */
    public static void m48979d(Context context, String str, C47223a aVar, boolean z) {
        if (MMApplicationContext.isMainProcess()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(context, intent, new C86009m1(str), "application/vnd.android.package-archive", false);
            intent.addFlags(268435456);
            m48978c(context, intent, aVar, z);
            return;
        }
        C80907o.m98781d(MainProcessIPCService.f108404e, new IPCInstallApp.IPCInstallAppParam(1, str, (Uri) null, z), IPCInstallApp.class, new C44572l0(aVar));
    }
}
