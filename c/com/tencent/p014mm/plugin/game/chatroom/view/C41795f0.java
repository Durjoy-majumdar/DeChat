package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.f0 */
public class C41795f0 implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ GameChatCommentFooter f112646a;

    public C41795f0(GameChatCommentFooter gameChatCommentFooter) {
        this.f112646a = gameChatCommentFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        if (C45078p0.m49926e(this.f112646a.f112473j.getText().toString() + str, C45078p0.C45079a.MODE_CHINESE_AS_2) <= 1000) {
            this.f112646a.f112473j.mo98046o(str);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        MMEditText mMEditText = this.f112646a.f112473j;
        if (mMEditText != null && mMEditText.getInputConnection() != null) {
            this.f112646a.f112473j.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
            this.f112646a.f112473j.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
