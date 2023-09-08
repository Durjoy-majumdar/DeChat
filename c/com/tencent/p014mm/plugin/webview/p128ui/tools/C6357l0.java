package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.l0 */
public final class C6357l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthWechatUI f23269d;

    public C6357l0(SDKOAuthWechatUI sDKOAuthWechatUI) {
        this.f23269d = sDKOAuthWechatUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f23269d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
