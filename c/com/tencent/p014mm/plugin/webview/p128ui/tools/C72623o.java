package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.KeyEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.o */
public final class C72623o implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ OpenSdkFaceDetectInfoLayout f211265d;

    public C72623o(OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f211265d = openSdkFaceDetectInfoLayout;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (66 == i && keyEvent.getAction() == 0) {
            OpenSdkFaceDetectInfoLayout.m84959a(this.f211265d);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
