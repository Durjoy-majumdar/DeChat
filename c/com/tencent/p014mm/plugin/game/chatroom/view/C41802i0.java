package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import com.tencent.p014mm.game.report.C40308d;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.i0 */
public class C41802i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatListView f112655d;

    public C41802i0(GameChatListView gameChatListView) {
        this.f112655d = gameChatListView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f112655d.f112525V1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f112655d.f112525V1.getTag() instanceof Long) {
            long longValue = ((Long) this.f112655d.f112525V1.getTag()).longValue();
            C40308d.C40309a aVar2 = C40308d.f108375a;
            GameChatListView gameChatListView = this.f112655d;
            aVar2.mo62997g(2, 2, gameChatListView.f112509F1, gameChatListView.f112508E1, longValue, "", 0, gameChatListView.f112513J1);
            this.f112655d.mo65532H1(longValue, false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
