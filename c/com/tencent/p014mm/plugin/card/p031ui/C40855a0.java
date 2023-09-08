package com.tencent.p014mm.plugin.card.p031ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import hz0.C46153l0;
import j20.C117292a;
import java.util.ArrayList;
import wz0.C53246b;

/* renamed from: com.tencent.mm.plugin.card.ui.a0 */
public class C40855a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C40858b0 f109853d;

    public C40855a0(C40858b0 b0Var) {
        this.f109853d = b0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardMsgEntranceController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53246b.m59670b(this.f109853d.f109856e, false);
        C46153l0.Bx0().mo71405d();
        this.f109853d.mo63822a();
        C115669n.INSTANCE.mo160131h(11324, "CardMsgCenterView", 0, "", "", 1, 0, "", 0, "");
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
