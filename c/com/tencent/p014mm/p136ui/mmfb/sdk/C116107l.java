package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.l */
public class C116107l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C116108m f348448d;

    public C116107l(C116108m mVar) {
        this.f348448d = mVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/mmfb/sdk/FbDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f348448d.f348451e.onCancel();
        this.f348448d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/ui/mmfb/sdk/FbDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
