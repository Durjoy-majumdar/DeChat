package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q */
public class ChatFooter$$q implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212038d;

    public ChatFooter$$q(ChatFooter chatFooter) {
        this.f212038d = chatFooter;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (4 != i && 66 != keyEvent.getAction()) {
            return false;
        }
        String obj = this.f212038d.f211797P2.getText().toString();
        if (this.f212038d.f211780L == null) {
            return true;
        }
        if (!Util.isNullOrNil(obj)) {
            this.f212038d.f211780L.mo100658t(obj);
        }
        this.f212038d.f211780L.mo100662x();
        return true;
    }
}
