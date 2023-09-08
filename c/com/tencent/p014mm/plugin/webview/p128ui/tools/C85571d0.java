package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.C90407dx3;
import te3.C90442v43;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.d0 */
public class C85571d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C90442v43 f249450d;

    /* renamed from: e */
    public final /* synthetic */ C90407dx3 f249451e;

    /* renamed from: f */
    public final /* synthetic */ SDKOAuthUI f249452f;

    public C85571d0(SDKOAuthUI sDKOAuthUI, C90442v43 v432, C90407dx3 dx32) {
        this.f249452f = sDKOAuthUI;
        this.f249450d = v432;
        this.f249451e = dx32;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.SdkOAuthUI", "fillNewOauthPage click disagreeBtn");
        SDKOAuthUI.m105586H7(this.f249452f, this.f249450d, this.f249451e, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
