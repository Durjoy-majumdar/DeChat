package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.m */
public final class C72621m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenSdkFaceDetectInfoLayout f211263d;

    public C72621m(OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f211263d = openSdkFaceDetectInfoLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        OpenSdkFaceDetectInfoLayout.m84959a(this.f211263d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
