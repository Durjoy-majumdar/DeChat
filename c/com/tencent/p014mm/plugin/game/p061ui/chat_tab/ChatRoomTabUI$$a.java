package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI$$a */
public final /* synthetic */ class ChatRoomTabUI$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomTabUI f114191d;

    public /* synthetic */ ChatRoomTabUI$$a(ChatRoomTabUI chatRoomTabUI) {
        this.f114191d = chatRoomTabUI;
    }

    public final void onClick(View view) {
        ChatRoomTabUI chatRoomTabUI = this.f114191d;
        int i = ChatRoomTabUI.f114183q;
        chatRoomTabUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chatRoomTabUI, array);
        ChatTabPresenter chatTabPresenter = chatRoomTabUI.f114184g;
        if (chatTabPresenter != null) {
            Log.m105924i("MicroMsg.ChatTabPresenter", "finishPage");
            C42298k.m45997b(chatTabPresenter.f114194a);
        } else {
            chatRoomTabUI.finish();
        }
        C117292a.m165361g(chatRoomTabUI, "com/tencent/mm/plugin/game/ui/chat_tab/ChatRoomTabUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
