package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import d83.C97448g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.r */
public class C72821r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212217d;

    public C72821r(ChatFooter chatFooter) {
        this.f212217d = chatFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatFooter chatFooter = this.f212217d;
        C97448g gVar = ChatFooter.f211728C4;
        chatFooter.mo100369P0(false, true);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
