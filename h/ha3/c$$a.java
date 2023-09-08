package ha3;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;
import p148ei.C7660a;
import qo3.C47883u;

public final /* synthetic */ class c$$a implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C7660a f27524a;

    public /* synthetic */ c$$a(C7660a aVar) {
        this.f27524a = aVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        C7660a aVar = this.f27524a;
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", aVar.f26004e.f26009a);
            intent.setFlags(268435456);
            intent.setClass(MMApplicationContext.getContext(), WebViewUI.class);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/webwx/model/listener/ScanQrcodeExtDeviceLoginListener$1", "lambda$onSceneEnd$0", "(Lcom/tencent/mm/broadcast/Broadcast;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/webwx/model/listener/ScanQrcodeExtDeviceLoginListener$1", "lambda$onSceneEnd$0", "(Lcom/tencent/mm/broadcast/Broadcast;ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
