package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.account.ui.j */
public class C1479j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f10824d;

    /* renamed from: e */
    public final /* synthetic */ BaseLoginVoiceUI f10825e;

    public C1479j(BaseLoginVoiceUI baseLoginVoiceUI, C77407n nVar) {
        this.f10825e = baseLoginVoiceUI;
        this.f10824d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f10825e.hideVKB();
        this.f10824d.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
