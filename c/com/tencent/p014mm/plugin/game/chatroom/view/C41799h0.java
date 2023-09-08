package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import com.tencent.p014mm.autogen.events.ChatRoomLocateInfoEvent;
import com.tencent.p014mm.autogen.events.NewUserNoticeEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.h0 */
public class C41799h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatListView f112652d;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.h0$a */
    public class C41800a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f112653d;

        public C41800a(C41799h0 h0Var, String str) {
            this.f112653d = str;
        }

        public void run() {
            NewUserNoticeEvent newUserNoticeEvent = new NewUserNoticeEvent();
            NewUserNoticeEvent.C40145a aVar = newUserNoticeEvent.f107660d;
            aVar.f107661a = 3;
            aVar.f107663c = this.f112653d;
            newUserNoticeEvent.publish();
        }
    }

    public C41799h0(GameChatListView gameChatListView) {
        this.f112652d = gameChatListView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("GameChatRoom.GameChatListView", "click new msg tag, cache list size:%d", Integer.valueOf(this.f112652d.f112532c2.size()));
        View view2 = this.f112652d.f112522S1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f112652d.f112522S1.getTag() != null) {
            String str = this.f112652d.f112522S1.getTag() instanceof String ? (String) this.f112652d.f112522S1.getTag() : "";
            this.f112652d.f112522S1.setTag((Object) null);
            C119179t tVar = C119157j.f356862d;
            C41800a aVar2 = new C41800a(this, str);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar2, 200, false);
        } else {
            GameChatListView gameChatListView = this.f112652d;
            if (!(gameChatListView.f112513J1 == 0)) {
                ChatRoomLocateInfoEvent chatRoomLocateInfoEvent = new ChatRoomLocateInfoEvent();
                chatRoomLocateInfoEvent.f107403d.f107404a = 0;
                chatRoomLocateInfoEvent.publish();
                C40308d.C40309a aVar3 = C40308d.f108375a;
                GameChatListView gameChatListView2 = this.f112652d;
                aVar3.mo62997g(14, 2, gameChatListView2.f112509F1, gameChatListView2.f112508E1, 0, "", 0, gameChatListView2.f112513J1);
            } else if (gameChatListView.f112532c2.size() > 0) {
                GameChatListView gameChatListView3 = this.f112652d;
                gameChatListView3.mo65529E1(gameChatListView3.f112532c2, 7, (List<ChatroomMsgPack>) null);
            } else {
                GameChatListView gameChatListView4 = this.f112652d;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(Integer.valueOf(gameChatListView4.f112506C1.getItemCount() - 1));
                GameChatListView gameChatListView5 = gameChatListView4;
                C117292a.m165358d(gameChatListView5, aVar4.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                gameChatListView4.mo17115r1(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(gameChatListView5, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
