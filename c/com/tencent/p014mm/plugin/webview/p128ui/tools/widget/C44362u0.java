package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.u0 */
public class C44362u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MPSmileyFooter f120231d;

    public C44362u0(MPSmileyFooter mPSmileyFooter) {
        this.f120231d = mPSmileyFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MPSmileyFooter.m48508b(this.f120231d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
