package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.pluginsdk.p133ui.tools.tips.TipsPopupWindow;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.s$$a */
public final /* synthetic */ class s$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72824s f212223d;

    public /* synthetic */ s$$a(C72824s sVar) {
        this.f212223d = sVar;
    }

    public final void run() {
        ChatFooter chatFooter = this.f212223d.f212222a;
        TipsPopupWindow tipsPopupWindow = chatFooter.f211855c2;
        if (tipsPopupWindow != null && tipsPopupWindow.isShowing()) {
            chatFooter.f211855c2.dismiss();
        }
    }
}
