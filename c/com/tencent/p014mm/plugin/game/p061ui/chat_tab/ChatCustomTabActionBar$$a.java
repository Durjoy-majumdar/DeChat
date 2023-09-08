package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.app.Activity;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar$$a */
public final /* synthetic */ class ChatCustomTabActionBar$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatCustomTabActionBar f114182d;

    public /* synthetic */ ChatCustomTabActionBar$$a(ChatCustomTabActionBar chatCustomTabActionBar) {
        this.f114182d = chatCustomTabActionBar;
    }

    public final void onClick(View view) {
        ChatCustomTabActionBar chatCustomTabActionBar = this.f114182d;
        int i = ChatCustomTabActionBar.f114178g;
        chatCustomTabActionBar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chatCustomTabActionBar, array);
        ((Activity) chatCustomTabActionBar.f114179d).finish();
        C117292a.m165361g(chatCustomTabActionBar, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
