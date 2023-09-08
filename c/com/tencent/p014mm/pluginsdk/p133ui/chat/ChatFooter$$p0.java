package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.pluginsdk.p133ui.chat.ChattingScrollLayout;
import java.util.LinkedList;
import vd3.C78405p;
import zp3.C103055g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$p0 */
public class ChatFooter$$p0 implements ChattingScrollLayout.C72760b {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212034d;

    public ChatFooter$$p0(ChatFooter chatFooter) {
        this.f212034d = chatFooter;
    }

    /* renamed from: m */
    public void mo100547m(float f, boolean z) {
        if (z) {
            C103055g gVar = (C103055g) this.f212034d.f211883i;
            if (!gVar.f304055j.isFinished()) {
                gVar.f304055j.forceFinished(true);
            }
            if (gVar.f304064s != 0) {
                gVar.mo142758c(0);
                C78405p.C78406a aVar = gVar.f304050e;
                if (aVar != null) {
                    ((ChatFooter$$e) aVar).mo100517a(false);
                }
            }
            ChatFooter chatFooter = this.f212034d;
            chatFooter.mo100505y0(chatFooter.getKeyBordHeightPX());
            ChattingScrollLayout chattingScrollLayout = this.f212034d.f211893k1;
            if (chattingScrollLayout != null) {
                ((LinkedList) chattingScrollLayout.f212087q).remove(this);
            }
        }
    }
}
