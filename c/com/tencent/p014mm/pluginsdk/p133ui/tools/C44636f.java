package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.f */
public class C44636f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppChooserUI f121035d;

    public C44636f(AppChooserUI appChooserUI) {
        this.f121035d = appChooserUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f121035d.finish();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
