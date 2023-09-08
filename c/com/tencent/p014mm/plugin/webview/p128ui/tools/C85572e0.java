package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.widget.AdapterView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.e0 */
public class C85572e0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SDKOAuthUI f249453d;

    public C85572e0(SDKOAuthUI sDKOAuthUI) {
        this.f249453d = sDKOAuthUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        SDKOAuthUI$$f sDKOAuthUI$$f = this.f249453d.f249417j;
        sDKOAuthUI$$f.f249441h = sDKOAuthUI$$f.getItem(i).f259829d;
        this.f249453d.f249417j.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
