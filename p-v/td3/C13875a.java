package td3;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import j20.C117292a;
import k20.C9556a;

/* renamed from: td3.a */
public final class C13875a {
    /* renamed from: a */
    public static boolean m13189a(String str, Context context, boolean z) {
        if (Util.isNullOrNil(str) || context == null) {
            return false;
        }
        Intent addFlags = new Intent("android.intent.action.VIEW").addFlags(268435456);
        addFlags.putExtra("ChannelID", "com.tencent.mm");
        addFlags.putExtra("PosID", 3);
        C86009m1 m1Var = new C86009m1(str);
        if (z) {
            FileProviderHelper.setIntentDataAndType(context, addFlags, m1Var, "video/quicktime", false);
        } else {
            FileProviderHelper.setIntentDataAndType(context, addFlags, m1Var, "video/*", false);
        }
        if (!Util.isIntentAvailable(context, addFlags, true)) {
            return false;
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(addFlags);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/subapp/ui/video/VideoPlayerMgr", "startThridPlayerByPath", "(Ljava/lang/String;Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/pluginsdk/subapp/ui/video/VideoPlayerMgr", "startThridPlayerByPath", "(Ljava/lang/String;Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VideoPlayerMgr", e, "", new Object[0]);
            return false;
        }
    }
}
