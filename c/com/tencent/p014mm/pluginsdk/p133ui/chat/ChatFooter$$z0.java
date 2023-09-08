package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$z0 */
public class ChatFooter$$z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212074d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$z0$a */
    public class C72758a implements Runnable {
        public C72758a() {
        }

        public void run() {
            ChatFooter$$r1 chatFooter$$r1 = ChatFooter$$r1.MODE_CANCEL;
            ChatFooter chatFooter = ChatFooter$$z0.this.f212074d;
            if (chatFooter$$r1 == chatFooter.f211762G2) {
                chatFooter.f211912o2.setText(chatFooter.getResources().getText(C0966R.string.kcc));
                ChatFooter.m85260n(ChatFooter$$z0.this.f212074d);
            } else {
                chatFooter.f211912o2.setText(chatFooter.getResources().getText(C0966R.string.kcg));
                ChatFooter.m85259m(ChatFooter$$z0.this.f212074d);
            }
            ChatFooter$$z0.this.f212074d.f211770I2 = true;
        }
    }

    public ChatFooter$$z0(ChatFooter chatFooter) {
        this.f212074d = chatFooter;
    }

    public void run() {
        this.f212074d.postDelayed(new C72758a(), 100);
    }
}
