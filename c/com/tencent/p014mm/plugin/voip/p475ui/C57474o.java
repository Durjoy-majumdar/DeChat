package com.tencent.p014mm.plugin.voip.p475ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: com.tencent.mm.plugin.voip.ui.o */
public final class C57474o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C57475p f164671d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f164672e;

    /* renamed from: f */
    public final /* synthetic */ C30540n f164673f;

    public C57474o(C57475p pVar, C60905o oVar, C30540n nVar) {
        this.f164671d = pVar;
        this.f164672e = oVar;
        this.f164673f = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/QosParamsConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f164671d.f164674e.invoke(Integer.valueOf(this.f164672e.mo17363j()), this.f164673f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/QosParamsConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
