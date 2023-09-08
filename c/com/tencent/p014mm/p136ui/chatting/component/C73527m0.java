package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import zj3.C79368l;
import zj3.C79384u0;

/* renamed from: com.tencent.mm.ui.chatting.component.m0 */
public class C73527m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73655y0 f215982d;

    public C73527m0(C73655y0 y0Var) {
        this.f215982d = y0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79368l lVar = (C79368l) this.f215982d.f215752d.f193278b.mo102812a(C79368l.class);
        if (lVar.mo108183N0(((Long) view.getTag()).longValue())) {
            int M5 = lVar.mo108181M5();
            ((C79384u0) this.f215982d.f215752d.f193278b.mo102812a(C79384u0.class)).mo102503H2();
            this.f215982d.f216261f.mo153850b();
            this.f215982d.f216260e.setVisibility(0);
            this.f215982d.f216260e.mo102072c(M5);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
