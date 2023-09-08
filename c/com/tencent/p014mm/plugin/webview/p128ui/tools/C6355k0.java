package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.k0 */
public final class C6355k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthWechatUI f23267d;

    public C6355k0(SDKOAuthWechatUI sDKOAuthWechatUI) {
        this.f23267d = sDKOAuthWechatUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Bundle extras = this.f23267d.getIntent().getExtras();
        Intent putExtras = extras != null ? new Intent().putExtras(extras) : null;
        Log.m105924i("MicroMsg.SDKOAuthWechatUI", "click agree!");
        C88144b.m109791i(this.f23267d, "webview", ".ui.tools.SDKOAuthUI", putExtras, (Bundle) null);
        this.f23267d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
