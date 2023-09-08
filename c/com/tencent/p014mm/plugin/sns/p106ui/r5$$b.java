package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.r5$$s;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$b */
public final /* synthetic */ class r5$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96198r5 f281065d;

    /* renamed from: e */
    public final /* synthetic */ r5$$s.C96207i f281066e;

    public /* synthetic */ r5$$b(C96198r5 r5Var, r5$$s.C96207i iVar) {
        this.f281065d = r5Var;
        this.f281066e = iVar;
    }

    public final void onClick(View view) {
        C96198r5 r5Var = this.f281065d;
        r5$$s.C96207i iVar = this.f281066e;
        r5Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(iVar);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", r5Var, array);
        SnsMethodCalculate.markStartTimeMs("lambda$setImgInfo$1", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        r5Var.f281053q.mo133119a(iVar.f281142b, iVar.f281141a);
        SnsMethodCalculate.markEndTimeMs("lambda$setImgInfo$1", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        C117292a.m165361g(r5Var, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
