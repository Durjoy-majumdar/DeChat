package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85590k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import qo3.C77390c0;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.g1 */
public class C85586g1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f249491d;

    /* renamed from: e */
    public final /* synthetic */ C85590k1.C85591a f249492e;

    /* renamed from: f */
    public final /* synthetic */ C77390c0 f249493f;

    public C85586g1(C85590k1 k1Var, LinkedList linkedList, C85590k1.C85591a aVar, C77390c0 c0Var) {
        this.f249491d = linkedList;
        this.f249492e = aVar;
        this.f249493f = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f249491d.size(); i++) {
            if (((C90437rw3) this.f249491d.get(i)).f259824f == 2 || ((C90437rw3) this.f249491d.get(i)).f259824f == 3) {
                arrayList2.add(((C90437rw3) this.f249491d.get(i)).f259822d);
            }
        }
        Log.m105918d("MicroMsg.AppBrandAuthorizeDialog", "stev acceptButton click!");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_scope", arrayList2);
        this.f249492e.mo67901a(1, bundle);
        this.f249493f.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
