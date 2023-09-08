package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b4$$b */
public class b4$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19781r3 f56197d;

    public b4$$b(C19762b4 b4Var, C19781r3 r3Var) {
        this.f56197d = r3Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f56197d.f56245a.performClick();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
