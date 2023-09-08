package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import p585kl.C76595c;
import p585kl.C99150i;
import vd3.C78405p;
import zp3.C103055g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$e */
public class ChatFooter$$e implements C78405p.C78406a {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f211989a;

    public ChatFooter$$e(ChatFooter chatFooter) {
        this.f211989a = chatFooter;
    }

    /* renamed from: a */
    public void mo100517a(boolean z) {
        Log.m105924i("MicroMsg.ChatFooter", "finished sliding emoji panel");
        ChatFooter chatFooter = this.f211989a;
        chatFooter.mo100505y0(chatFooter.getKeyBordHeightPX());
        int i = 1;
        C99150i.m129154a().f290718k = z ? 1 : 2;
        C76595c a = C76595c.m92188a();
        if (!z) {
            i = 2;
        }
        a.f224193f = i;
    }

    /* renamed from: b */
    public void mo100518b(int i) {
        ChatFooter chatFooter = this.f211989a;
        if (chatFooter.f211893k1 == null) {
            chatFooter.mo100391b0();
        }
        ChatFooter chatFooter2 = this.f211989a;
        int i2 = chatFooter2.f211969z1;
        chatFooter2.f211911o1 = i2 + i;
        ChattingScrollLayout chattingScrollLayout = chatFooter2.f211893k1;
        if (chattingScrollLayout != null) {
            int i3 = i2 + i;
            chattingScrollLayout.f212079f = i3;
            for (int i4 = 0; i4 < chattingScrollLayout.getChildCount(); i4++) {
                View childAt = chattingScrollLayout.getChildAt(i4);
                if (childAt != chattingScrollLayout.f212085o) {
                    childAt.setTranslationY((float) (-i3));
                }
            }
            chattingScrollLayout.mo100587b(false, false);
        }
    }

    /* renamed from: c */
    public void mo100519c(boolean z) {
        Log.m105924i("MicroMsg.ChatFooter", "start sliding emoji panel");
        ChatFooter chatFooter = this.f211989a;
        chatFooter.mo100505y0(chatFooter.getKeyBordHeightPX());
    }

    /* renamed from: d */
    public void mo100520d() {
        ChattingScrollLayout chattingScrollLayout;
        ChatFooter chatFooter = this.f211989a;
        C78405p pVar = chatFooter.f211883i;
        if (pVar != null && (chattingScrollLayout = chatFooter.f211893k1) != null && chatFooter.f211739B != null) {
            int height = chattingScrollLayout.getHeight();
            ChatFooter chatFooter2 = this.f211989a;
            ((C103055g) pVar).mo142757b(height, chatFooter2.f211958x1, chatFooter2.f211739B.getMeasuredHeight());
        }
    }
}
