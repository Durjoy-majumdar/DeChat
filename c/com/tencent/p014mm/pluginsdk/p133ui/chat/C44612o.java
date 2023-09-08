package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.tools.tips.TipsPopupWindow;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.o */
public class C44612o implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f120965d;

    public C44612o(ChatFooter chatFooter) {
        this.f120965d = chatFooter;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$16", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        ChatFooter chatFooter = this.f120965d;
        TipsPopupWindow tipsPopupWindow = chatFooter.f211855c2;
        if (tipsPopupWindow != null && tipsPopupWindow.isShowing()) {
            chatFooter.f211855c2.dismiss();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$16", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
