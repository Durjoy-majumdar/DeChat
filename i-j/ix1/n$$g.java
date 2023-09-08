package ix1;

import android.view.View;
import bx1.C39870v;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteInfo;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;

public class n$$g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124888d;

    public n$$g(C46337n nVar) {
        this.f124888d = nVar;
    }

    public void onClick(View view) {
        C39870v vVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if ((view.getTag() instanceof VoteInfo) && ((VoteInfo) view.getTag()).can_vote) {
            if (((VoteInfo) view.getTag()).voted_by_me) {
                C46337n nVar = this.f124888d;
                String str = nVar.f124869Z0;
                ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
                vVar = new C39870v(str, chatroomMsgPack.seq, false, chatroomMsgPack.from_username, 16);
            } else {
                C46337n nVar2 = this.f124888d;
                String str2 = nVar2.f124869Z0;
                ChatroomMsgPack chatroomMsgPack2 = nVar2.f124841G;
                vVar = new C39870v(str2, chatroomMsgPack2.seq, true, chatroomMsgPack2.from_username, 16);
            }
            C86709a0.m107524d().mo123460f(vVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
