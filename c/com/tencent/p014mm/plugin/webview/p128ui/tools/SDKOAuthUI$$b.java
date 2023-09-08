package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea3.C7608b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$b */
public final /* synthetic */ class SDKOAuthUI$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthUI f249432d;

    public /* synthetic */ SDKOAuthUI$$b(SDKOAuthUI sDKOAuthUI) {
        this.f249432d = sDKOAuthUI;
    }

    public final void onClick(View view) {
        SDKOAuthUI sDKOAuthUI = this.f249432d;
        int i = SDKOAuthUI.f249402I;
        sDKOAuthUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", sDKOAuthUI, array);
        Log.m105924i("MicroMsg.SdkOAuthUI", "BackBtn click");
        C7608b.INSTANCE.mo8744a(sDKOAuthUI.f249411d, sDKOAuthUI.f249424t, 0, sDKOAuthUI.f249429y, sDKOAuthUI.mo118961N7(), 1, 0);
        sDKOAuthUI.mo118956I7(-2);
        sDKOAuthUI.finish();
        C117292a.m165361g(sDKOAuthUI, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
