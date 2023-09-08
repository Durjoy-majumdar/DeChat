package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.plugin.transvoice.p324ui.LanguageChoiceLayout;
import i13.C76257d;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$o */
public class ChatFooter$$o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212024d;

    public ChatFooter$$o(ChatFooter chatFooter) {
        this.f212024d = chatFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatFooter chatFooter = this.f212024d;
        if (chatFooter.f211917p1) {
            chatFooter.f211834X0.hideSoftInputFromWindow(chatFooter.f211797P2.getWindowToken(), 0);
        }
        ChatFooter chatFooter2 = this.f212024d;
        LanguageChoiceLayout languageChoiceLayout = chatFooter2.f211822U2;
        int i = chatFooter2.f211738A4;
        languageChoiceLayout.setVisibility(0);
        languageChoiceLayout.f207391g.post(new C76257d(languageChoiceLayout, i));
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$49", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
