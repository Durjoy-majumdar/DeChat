package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.r */
public class C6809r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77407n f24366d;

    public C6809r(C74103m mVar, C77407n nVar) {
        this.f24366d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f24366d.mo107572p();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
