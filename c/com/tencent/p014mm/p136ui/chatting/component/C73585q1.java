package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.chatting.component.q1 */
public class C73585q1 implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f216097d;

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f216098e;

    /* renamed from: f */
    public final /* synthetic */ int f216099f;

    public C73585q1(EmojiComponent emojiComponent, boolean z, ChatFooter chatFooter, int i) {
        this.f216097d = z;
        this.f216098e = chatFooter;
        this.f216099f = i;
    }

    public Object invoke() {
        if (this.f216097d) {
            ChatFooter chatFooter = this.f216098e;
            Boolean bool = Boolean.FALSE;
            chatFooter.setKeyboardShow(bool);
            this.f216098e.setIgnoreScroll(bool);
            this.f216098e.mo100377T0();
            return null;
        }
        this.f216098e.mo100350F0(this.f216099f, true, 0, 0);
        return null;
    }
}
