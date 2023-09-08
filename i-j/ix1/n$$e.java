package ix1;

import android.view.View;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TopicInfo;
import com.tencent.p014mm.plugin.game.commlib.util.C41874g;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class n$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124884d;

    /* renamed from: e */
    public final /* synthetic */ TopicInfo f124885e;

    public /* synthetic */ n$$e(C46337n nVar, TopicInfo topicInfo) {
        this.f124884d = nVar;
        this.f124885e = topicInfo;
    }

    public final void onClick(View view) {
        C46337n nVar = this.f124884d;
        TopicInfo topicInfo = this.f124885e;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(topicInfo);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", nVar, array);
        if (!Util.isNullOrNil(topicInfo.content_url)) {
            C41874g.m45398b(nVar.f124838D, topicInfo.content_url, -1, false, "");
            C40308d.C40309a aVar = C40308d.f108375a;
            long j = nVar.f124840F;
            long j2 = nVar.f124839E;
            ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
            aVar.mo62997g(22, 2, j, j2, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, nVar.f124874e1);
        }
        C117292a.m165361g(nVar, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
