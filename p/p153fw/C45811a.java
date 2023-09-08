package p153fw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.pluginsdk.model.app.C44563k0;
import com.tencent.p014mm.pluginsdk.model.app.C44575m0;
import com.tencent.p014mm.pluginsdk.model.app.IPCInstallApp;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import k20.C9556a;
import nd3.C47223a;
import p159gw.C45962f;

@C86522b
/* renamed from: fw.a */
public class C45811a extends C86301e implements C45962f {
    public boolean Qt0(Context context, String str) {
        Context context2 = context;
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.addFlags(268435456);
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.m105928w("MicroMsg.ApplicationUtil", "app not installed, packageName = com.android.vending");
        }
        if (packageInfo != null) {
            Log.m105927v("MicroMsg.ApplicationUtil", "installAppWithGP, gp is installed, url = %s", str);
            intent.setPackage("com.android.vending");
        } else {
            Log.m105927v("MicroMsg.ApplicationUtil", "installAppWithGP, gp is not installed, url = %s", str);
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ApplicationUtil", "installAppWithGP first, ex = %s", e.getMessage());
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                intent2.addFlags(268435456);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.ApplicationUtil", "installAppWithGP second, ex = %s", e2.getMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: UC */
    public void mo71272UC(Context context, String str, C47223a aVar) {
        C44563k0.m48979d(context, str, aVar, false);
    }

    /* renamed from: X9 */
    public void mo71273X9(Context context, Uri uri, C47223a aVar, boolean z) {
        if (MMApplicationContext.isMainProcess()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(context, intent, uri, "application/vnd.android.package-archive", false);
            intent.addFlags(268435456);
            C44563k0.m48978c(context, intent, aVar, z);
            return;
        }
        C80907o.m98781d(MainProcessIPCService.f108404e, new IPCInstallApp.IPCInstallAppParam(2, "", uri, z), IPCInstallApp.class, new C44575m0(aVar));
    }

    public void go0(Context context, String str, C47223a aVar, boolean z) {
        C44563k0.m48979d(context, str, aVar, z);
    }
}
