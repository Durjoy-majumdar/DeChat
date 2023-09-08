package c51;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40934k;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import ji3.C9457a;
import k20.C9556a;
import ld2.C46848g;
import nd3.C47223a;
import nd3.C88929c;
import ol0.C117818k0;
import p763ym.C79138l;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: c51.a */
public class C39890a {

    /* renamed from: c51.a$a */
    public class C39891a implements C39893c {

        /* renamed from: a */
        public final /* synthetic */ C53736a f106957a;

        /* renamed from: b */
        public final /* synthetic */ boolean f106958b;

        /* renamed from: c */
        public final /* synthetic */ C47223a f106959c;

        public C39891a(C53736a aVar, boolean z, C47223a aVar2) {
            this.f106957a = aVar;
            this.f106958b = z;
            this.f106959c = aVar2;
        }

        /* renamed from: a */
        public void mo62502a(boolean z) {
            C53736a aVar = this.f106957a;
            boolean z2 = this.f106958b;
            C47223a aVar2 = this.f106959c;
            if (z) {
                C53493b bVar = new C53493b();
                bVar.mo74165a(aVar);
                String str = aVar.field_packageName;
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("install_begin_time", 0);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(str, System.currentTimeMillis()).apply();
                }
                C53491a.m60012b(aVar.field_appId, aVar.field_scene, 4, aVar.field_md5, aVar.field_downloadUrl, (String) null, aVar.field_extInfo);
                bVar.f150424j = (System.currentTimeMillis() - aVar.field_startTime) / 1000;
                C53491a.m60013c(4, bVar);
                if (z2) {
                    C53491a.m60013c(15, bVar);
                } else {
                    C53491a.m60013c(16, bVar);
                }
            }
            if (aVar2 != null) {
                aVar2.mo6947a(z);
            }
        }
    }

    /* renamed from: c51.a$b */
    public class C39892b implements C44580q1 {

        /* renamed from: a */
        public final /* synthetic */ C44580q1 f106960a;

        public C39892b(C44580q1 q1Var) {
            this.f106960a = q1Var;
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            C44580q1 q1Var = this.f106960a;
            if (q1Var != null) {
                q1Var.mo1579a(z, z2);
            }
        }
    }

    /* renamed from: c51.a$c */
    public interface C39893c {
    }

    /* renamed from: a */
    public static void m42668a(long j, boolean z, C47223a aVar) {
        Intent intent;
        C47223a aVar2 = aVar;
        C53736a c = C40933j.m44314c(j);
        if (c == null || c.field_status != 3 || !C86013q1.m106450k(c.field_filePath)) {
            if (aVar2 != null) {
                aVar2.mo6947a(false);
            }
        } else if (!C40934k.m44325b(c)) {
            Log.m105924i("MicroMsg.DownloadAppUtil", "install, md5 check fail");
            C86013q1.m106447h(c.field_filePath);
            C40933j.m44319h(j);
            C115669n.INSTANCE.mo175911u(C117818k0.CTRL_INDEX, 35);
        } else {
            if (Util.isNullOrNil(c.field_packageName)) {
                String h = C40935l.m44327h(c.field_filePath);
                if (!Util.isNullOrNil(h)) {
                    c.field_packageName = h;
                    Log.m105925i("MicroMsg.DownloadAppUtil", "get package name from file : %s, %s", c.field_filePath, h);
                    C40933j.m44322k(c);
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && !MMApplicationContext.getContext().getPackageManager().canRequestPackageInstalls()) {
                C53493b bVar = new C53493b();
                bVar.mo74165a(c);
                C53491a.m60013c(21, bVar);
            }
            C39891a aVar3 = new C39891a(c, z, aVar2);
            String str = c.field_filePath;
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.DownloadAppUtil", "installApk, path is null");
                C53493b bVar2 = new C53493b();
                bVar2.mo74165a(c);
                bVar2.f150421g = 805;
                C53491a.m60013c(8, bVar2);
                aVar3.mo62502a(false);
                return;
            }
            Log.m105924i("MicroMsg.DownloadAppUtil", "installApk, path = " + str);
            if (!C86013q1.m106450k(str)) {
                C53493b bVar3 = new C53493b();
                bVar3.mo74165a(c);
                bVar3.f150421g = 805;
                C53491a.m60013c(8, bVar3);
                Log.m105920e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
                aVar3.mo62502a(false);
                return;
            }
            Context context = MMApplicationContext.getContext();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(context, intent2, new C86009m1(str), "application/vnd.android.package-archive", false);
            intent2.addFlags(268435456);
            Log.m105924i("MicroMsg.DownloadAppUtil", "installApp");
            if (Build.BRAND.equals("vivo")) {
                intent2.putExtra("installDir", true);
                Log.m105924i("MicroMsg.DownloadAppUtil", "is vivo, try to prevent the interception");
            }
            if (i >= 26) {
                try {
                    if (!context.getPackageManager().canRequestPackageInstalls()) {
                        Log.m105924i("MicroMsg.DownloadAppUtil", "request install apk permission");
                        C88929c.m111025i(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())), MMApplicationContext.getContext().getString(C0966R.string.hif), MMApplicationContext.getContext().getString(C0966R.string.fre), new C39894b(context, intent2, aVar3));
                        return;
                    }
                } catch (Exception e) {
                    e = e;
                    intent = intent2;
                    Log.printErrStackTrace("MicroMsg.DownloadAppUtil", e, "install app failed! %s", intent);
                    aVar3.mo62502a(false);
                    aVar3.mo62502a(true);
                }
            }
            Log.m105924i("MicroMsg.DownloadAppUtil", "install directly");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent2);
            intent = intent2;
            try {
                C117292a.m165358d(context, aVar4.mo10232b(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader/util/DownloadAppUtil$InstallApkPermissionListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil", "installApp", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/plugin/downloader/util/DownloadAppUtil$InstallApkPermissionListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e2) {
                e = e2;
            }
            aVar3.mo62502a(true);
        }
    }

    /* renamed from: b */
    public static void m42669b(Context context, int i, String str, String str2) {
        if (i != 4) {
            m42670c(context, str, (C44580q1) null);
            return;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
        if (launchIntentForPackage != null) {
            Bundle bundle = new Bundle();
            C72688j0.m85023i(bundle, "");
            launchIntentForPackage.putExtras(bundle);
            launchIntentForPackage.addFlags(268435456);
            boolean Dm0 = ((C79138l) C86312j.m106911c(C79138l.class)).Dm0(context, launchIntentForPackage, (String) null, (C44580q1) null, (Bundle) null);
            Log.m105924i("MicroMsg.DownloadAppUtil", "gamelog.launchGame, launchGameApp, success = " + Dm0);
        }
    }

    /* renamed from: c */
    public static void m42670c(Context context, String str, C44580q1 q1Var) {
        C39892b bVar = new C39892b(q1Var);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.DownloadAppUtil", "null or nil appid");
            bVar.mo1579a(false, false);
        }
        C44561j g = C44565l.m48987g(str);
        if (g == null || Util.isNullOrNil(g.field_appId)) {
            Log.m105920e("MicroMsg.DownloadAppUtil", "appinfo is null or appid is null");
            bVar.mo1579a(false, false);
            return;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage(new WXAppExtendObject());
        wXMediaMessage.sdkVer = com.tencent.p014mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageAction = null;
        wXMediaMessage.messageExt = "WX_GameCenter";
        Log.m105919d("MicroMsg.DownloadAppUtil", "launch game app from wx: appid: [%s], appname:[%s], openid:[%s]", g.field_appId, g.field_appName, g.field_openId);
        if (Util.isNullOrNil(g.field_openId)) {
            Log.m105925i("MicroMsg.DownloadAppUtil", "open id is null or nil, try to get from server:[%s]", g.field_appName);
            C46848g.Cx0().mo69340a(g.field_appId);
        }
        C9457a.m9137a(new C39895c(context, g, wXMediaMessage, bVar));
    }
}
