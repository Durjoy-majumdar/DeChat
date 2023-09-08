package fj2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import nj3.C76912y0;

/* renamed from: fj2.a */
public final class C45798a {

    /* renamed from: a */
    public static final C45798a f123705a = new C45798a();

    /* renamed from: a */
    public final void mo71265a(Context context, String str, byte[] bArr) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(bArr, "fileContent");
        if (!C86013q1.m106450k(str)) {
            C76912y0.makeText(context, (CharSequence) "文件不存在", 0).show();
            return;
        }
        Log.m105924i("MicroMsg.Repairer.RepairerInnerLogic", "sendFile " + str);
        WXMediaMessage wXMediaMessage = new WXMediaMessage(new WXFileObject(str));
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        wXMediaMessage.title = path2;
        wXMediaMessage.description = Util.getSizeKB(C86013q1.m106451l(str));
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = null;
        req.message = wXMediaMessage;
        Bundle bundle = new Bundle();
        req.toBundle(bundle);
        bundle.putInt(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
        bundle.putString(ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        Intent intent = new Intent();
        intent.setClassName(context, "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI");
        Intent intent2 = new Intent();
        if (!(context instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        intent2.setClassName(context, "com.tencent.mm.ui.transmit.SelectConversationUI");
        intent2.putExtra("Select_Conv_NextStep", intent.putExtras(bundle).putExtra("animation_pop_in", true));
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/repairer/ui/model/RepairerInnerLogic", "sendFile", "(Landroid/content/Context;Ljava/lang/String;[B)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/repairer/ui/model/RepairerInnerLogic", "sendFile", "(Landroid/content/Context;Ljava/lang/String;[B)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
