package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.account.ui.k */
public class C40424k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ List f108645d;

    /* renamed from: e */
    public final /* synthetic */ BaseLoginVoiceUI f108646e;

    public C40424k(BaseLoginVoiceUI baseLoginVoiceUI, List list) {
        this.f108646e = baseLoginVoiceUI;
        this.f108645d = list;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BaseLoginVoiceUI.m161811H7(this.f108646e, ((C76875f0) this.f108645d.get(0)).f224715g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
