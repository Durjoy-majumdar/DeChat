package ix1;

import android.view.View;
import com.tencent.p014mm.autogen.events.ChatRoomAtFunctionEvent;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import j20.C117292a;
import java.util.ArrayList;
import yw1.C53601h;

/* renamed from: ix1.a0 */
public class C46303a0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124758d;

    public C46303a0(C46337n nVar) {
        this.f124758d = nVar;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C46337n nVar = this.f124758d;
        if (nVar.f124859U0 != null && !nVar.mo71734I() && !C53601h.m60126e(this.f124758d.f124869Z0).f150605b) {
            ChatRoomAtFunctionEvent chatRoomAtFunctionEvent = new ChatRoomAtFunctionEvent();
            ChatRoomAtFunctionEvent.C40049a aVar = chatRoomAtFunctionEvent.f107397d;
            C46337n nVar2 = this.f124758d;
            aVar.f107398a = nVar2.f124841G.from_username;
            aVar.f107399b = nVar2.f124859U0.getNickName();
            chatRoomAtFunctionEvent.publish();
            C40308d.C40309a aVar2 = C40308d.f108375a;
            C46337n nVar3 = this.f124758d;
            long j = nVar3.f124840F;
            long j2 = nVar3.f124839E;
            ChatroomMsgPack chatroomMsgPack = nVar3.f124841G;
            aVar2.mo62997g(4, 27, j, j2, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, nVar3.f124874e1);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
