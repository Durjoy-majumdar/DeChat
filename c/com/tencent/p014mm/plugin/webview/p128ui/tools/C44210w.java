package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44392x;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.w */
public class C44210w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f119777d;

    /* renamed from: e */
    public final /* synthetic */ C44392x.C44393a f119778e;

    public C44210w(C44392x.C44393a aVar, int i) {
        this.f119778e = aVar;
        this.f119777d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C44392x.this.f120331h.setValue(Integer.valueOf(this.f119777d));
        this.f119778e.notifyDataSetChanged();
        C44392x.this.f120324a.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
