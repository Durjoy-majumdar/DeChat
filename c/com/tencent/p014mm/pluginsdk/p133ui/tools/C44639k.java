package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.tools.AppChooserUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.k */
public class C44639k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppChooserUI.C19509p f121041d;

    /* renamed from: e */
    public final /* synthetic */ AppChooserUI.C19514l f121042e;

    public C44639k(AppChooserUI.C19514l lVar, AppChooserUI.C19509p pVar) {
        this.f121042e = lVar;
        this.f121041d = pVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppChooserUI appChooserUI = AppChooserUI.this;
        appChooserUI.f55158q = this.f121041d;
        appChooserUI.f55155o.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
