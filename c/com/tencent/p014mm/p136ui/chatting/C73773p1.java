package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.p1 */
public class C73773p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79368l f216541d;

    public C73773p1(C73835q1 q1Var, C79368l lVar) {
        this.f216541d = lVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingExposeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f216541d.mo108183N0(((Long) view.getTag()).longValue());
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingExposeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
