package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$f */
public class ChatFooter$$f implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f211992a;

    public ChatFooter$$f(ChatFooter chatFooter) {
        this.f211992a = chatFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
        ChatFooter chatFooter = this.f211992a;
        chatFooter.f211838Y0 = 1;
        chatFooter.f211739B.setVisibility(0);
        this.f211992a.f211962y.setVisibility(0);
        this.f211992a.f211915p.setVisibility(8);
        this.f211992a.mo100501w0(true);
        this.f211992a.mo100394c1(C0966R.C0969drawable.f4804nd);
        Button button = this.f211992a.f211905n;
        if (button != null) {
            button.performClick();
        }
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        ChatFooter chatFooter = this.f211992a;
        chatFooter.f211838Y0 = 1;
        chatFooter.mo100375S0(true);
        this.f211992a.f211915p.setVisibility(8);
        this.f211992a.mo100501w0(true);
        this.f211992a.mo100394c1(C0966R.C0969drawable.f4804nd);
        try {
            this.f211992a.f211888j.mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChatFooter", e, "", new Object[0]);
        }
        this.f211992a.f211785M1.f194127i++;
    }

    /* renamed from: c */
    public void mo64628c() {
        ChatFooter chatFooter = this.f211992a;
        chatFooter.f211838Y0 = 1;
        chatFooter.mo100375S0(true);
        this.f211992a.f211915p.setVisibility(8);
        this.f211992a.mo100501w0(true);
        this.f211992a.mo100394c1(C0966R.C0969drawable.f4804nd);
        InputConnection inputConnection = this.f211992a.f211888j.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new KeyEvent(0, 67));
            inputConnection.sendKeyEvent(new KeyEvent(1, 67));
        }
        this.f211992a.f211785M1.f194127i--;
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
        Log.m105925i("MicroMsg.ChatFooter", "onToSendTextEnable: %s", Boolean.valueOf(z));
        ChatFooter chatFooter = this.f211992a;
        if (chatFooter.f211884i1 == 2) {
            chatFooter.f211838Y0 = 1;
            chatFooter.mo100375S0(true);
            this.f211992a.f211915p.setVisibility(8);
            this.f211992a.mo100394c1(C0966R.C0969drawable.f4804nd);
            ChatFooter chatFooter2 = this.f211992a;
            if (chatFooter2.f211888j != null) {
                chatFooter2.setToSendTextColor(z);
            }
        }
    }
}
