package com.tencent.p014mm.plugin.game.chatroom.channel;

import android.view.View;
import bx1.C39854i;
import com.tencent.p014mm.game.report.C40308d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.game.chatroom.channel.b */
public class C41685b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatChannelPage f112165d;

    public C41685b(ChatChannelPage chatChannelPage) {
        this.f112165d = chatChannelPage;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/channel/ChatChannelPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C40308d.C40309a aVar = C40308d.f108375a;
        ChatChannelPage chatChannelPage = this.f112165d;
        aVar.mo62997g(20, 2, chatChannelPage.f112144f, chatChannelPage.f112143e, 0, "", 0, 0);
        ChatChannelPage chatChannelPage2 = this.f112165d;
        if (!chatChannelPage2.f112155t) {
            chatChannelPage2.f112155t = true;
            C86709a0.m107524d().mo123460f(new C39854i((List<String>) null, "", "", 2, 19527));
            ChatChannelPage chatChannelPage3 = this.f112165d;
            chatChannelPage3.f112154s = new C101218e0(chatChannelPage3.f112142d, 0, 0, true, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/channel/ChatChannelPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
