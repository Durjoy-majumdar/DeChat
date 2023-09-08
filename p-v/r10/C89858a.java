package r10;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.p136ui.NoRomSpaceDexUI;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.tinker.entry.ApplicationLike;
import j20.C117292a;
import k20.C9556a;
import p156gj.C87203t;

/* renamed from: r10.a */
public class C89858a extends C36244b {
    /* renamed from: b */
    public int mo60583b(ApplicationLike applicationLike) {
        if (C80622u0.m98265a(applicationLike.getApplication()) == C80622u0.NOSPACE || !BuildInfo.IS_ARM64 || C87203t.m108279o()) {
            return 0;
        }
        Application application = applicationLike.getApplication();
        Intent putExtra = new Intent(application, NoRomSpaceDexUI.class).addFlags(268435456).putExtra("titleRes", C0966R.string.a_c).putExtra("messageRes", C0966R.string.a_b).putExtra("buttonRes", C0966R.string.a_a);
        Intent putExtra2 = putExtra.putExtra("action", PendingIntent.getActivity(application, 0, new Intent("android.intent.action.VIEW", Uri.parse(HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmp) + "/")).addFlags(268435456), 0));
        C9556a aVar = new C9556a();
        aVar.mo10233c(putExtra2);
        Application application2 = application;
        C117292a.m165358d(application2, aVar.mo10232b(), "com/tencent/mm/fuse/AbiCompatFuse", "checkForFuseAction", "(Lcom/tencent/tinker/entry/ApplicationLike;)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        application.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(application2, "com/tencent/mm/fuse/AbiCompatFuse", "checkForFuseAction", "(Lcom/tencent/tinker/entry/ApplicationLike;)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return 2;
    }

    /* renamed from: c */
    public String mo60584c() {
        return "abi-compat";
    }
}
