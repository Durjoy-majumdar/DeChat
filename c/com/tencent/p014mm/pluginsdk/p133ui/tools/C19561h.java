package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p407zo.C23547h;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.h */
public class C19561h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppChooserUI f55371d;

    public C19561h(AppChooserUI appChooserUI) {
        this.f55371d = appChooserUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f55371d.f55153j.mo5085n();
        AppChooserUI appChooserUI = this.f55371d;
        ((C23547h) C86312j.m106911c(C23547h.class)).mo36794Mf(5, appChooserUI.f55167z, "", appChooserUI.f55128G);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
