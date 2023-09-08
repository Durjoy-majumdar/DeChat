package com.tencent.p014mm.plugin.game.chatroom.channel;

import android.view.ViewGroup;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.MMActivity;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.channel.d */
public class C41687d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatChannelPage f112167d;

    public C41687d(ChatChannelPage chatChannelPage) {
        this.f112167d = chatChannelPage;
    }

    public void run() {
        int i = 0;
        boolean z = C53601h.m60127f((MMActivity) this.f112167d.f112142d) && C53601h.m60128g();
        ViewGroup viewGroup = this.f112167d.f112147i;
        if (!z) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        if (z && this.f112167d.f112147i.getTag() == null) {
            this.f112167d.f112147i.setTag(1);
            C40308d.C40309a aVar = C40308d.f108375a;
            ChatChannelPage chatChannelPage = this.f112167d;
            aVar.mo62997g(20, 1, chatChannelPage.f112144f, chatChannelPage.f112143e, 0, "", 0, 0);
        }
    }
}
