package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C44392x;
import com.tencent.p014mm.plugin.webview.p128ui.tools.SDKOAuthAppDataUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.z */
public class C44401z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f120345d;

    /* renamed from: e */
    public final /* synthetic */ SDKOAuthAppDataUI.C43803d f120346e;

    public C44401z(SDKOAuthAppDataUI.C43803d dVar, int i) {
        this.f120346e = dVar;
        this.f120345d = i;
    }

    public void onClick(View view) {
        View view2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$AppDataAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C44392x xVar = SDKOAuthAppDataUI.this.f118359r;
        xVar.f120332i = this.f120345d;
        C44392x.C44393a aVar = xVar.f120326c;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        if (!(xVar.f120325b == null || (view2 = xVar.f120328e) == null)) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(xVar.f120328e);
            }
            xVar.f120324a = new C101218e0(xVar.f120325b, 0, 3);
            xVar.mo69168a(xVar.f120325b);
            xVar.f120324a.mo140673s(xVar.f120328e);
        }
        xVar.f120324a.mo140655A();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$AppDataAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
