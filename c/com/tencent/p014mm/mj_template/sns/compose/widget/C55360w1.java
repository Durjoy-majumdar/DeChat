package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.w1 */
public final /* synthetic */ class C55360w1 extends C24565l implements C32226l<C55319n1, C13598b0> {
    public C55360w1(Object obj) {
        super(1, obj, C55366y1.class, "onTemplateSelected", "onTemplateSelected(Lcom/tencent/mm/mj_template/sns/compose/widget/SnsTemplateListData;)V", 0);
    }

    public Object invoke(Object obj) {
        C55319n1 n1Var = (C55319n1) obj;
        C87412m.m108594g(n1Var, "p0");
        C55366y1 y1Var = (C55366y1) this.receiver;
        y1Var.getClass();
        if (C87412m.m108589b(n1Var, C55319n1.C55322c.f157560e)) {
            Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "open more panel");
            y1Var.f157670f.invoke();
        } else if (!n1Var.f157557c) {
            Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "click unselectable item");
        } else if (C87412m.m108589b(n1Var.f157555a, y1Var.mo76618a())) {
            Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "no need to select " + n1Var.f157555a);
        } else {
            C55366y1.C55367a aVar = y1Var.f157678n;
            if (aVar != null) {
                aVar.mo76625b(n1Var.f157555a, y1Var.mo76619b().indexOf(n1Var));
            }
            C53895h.m60466d(y1Var.f157665a, (C66212f) null, (C53934p0) null, new C55372z1(n1Var, y1Var, (C15601d<? super C55372z1>) null), 3, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
