package ix1;

import android.view.View;
import bx1.C39862p;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class n$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124886d;

    /* renamed from: e */
    public final /* synthetic */ long f124887e;

    public /* synthetic */ n$$f(C46337n nVar, long j) {
        this.f124886d = nVar;
        this.f124887e = j;
    }

    public final void onClick(View view) {
        C46337n nVar = this.f124886d;
        long j = this.f124887e;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", nVar, array);
        C86709a0.m107524d().mo123460f(new C39862p(nVar.f124869Z0, j));
        C40308d.C40309a aVar = C40308d.f108375a;
        long j2 = nVar.f124840F;
        long j3 = nVar.f124839E;
        ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
        aVar.mo62997g(22, 2, j2, j3, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, nVar.f124874e1);
        C117292a.m165361g(nVar, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
