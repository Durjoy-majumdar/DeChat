package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.p014mm.autogen.mmdata.rpt.AndroidChatInputStruct;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$p1 */
public class ChatFooter$$p1 implements TextWatcher {

    /* renamed from: d */
    public TextWatcher f212035d;

    /* renamed from: e */
    public boolean f212036e = false;

    /* renamed from: f */
    public final /* synthetic */ ChatFooter f212037f;

    public ChatFooter$$p1(ChatFooter chatFooter, TextWatcher textWatcher) {
        this.f212037f = chatFooter;
        this.f212035d = textWatcher;
    }

    public void afterTextChanged(Editable editable) {
        ChatFooter chatFooter = this.f212037f;
        if (chatFooter.f211870f2 || !chatFooter.f211854c1 || !this.f212036e || editable.length() <= 0) {
            this.f212035d.afterTextChanged(editable);
            ChatFooter chatFooter2 = this.f212037f;
            if (chatFooter2.f211910o != null) {
                if (chatFooter2.f211888j.getLineCount() > 1) {
                    this.f212037f.f211910o.setVisibility(0);
                    TextView textView = this.f212037f.f211910o;
                    textView.setText("" + editable.length() + "/140");
                } else {
                    this.f212037f.f211910o.setVisibility(8);
                }
            }
            boolean i = ChatFooter.m85255i(this.f212037f, editable);
            if (!ChatFooter.m85256j(this.f212037f, i)) {
                this.f212037f.mo100502x(i);
            }
            ChatFooterPanel chatFooterPanel = this.f212037f.f211868f;
            if (chatFooterPanel != null) {
                chatFooterPanel.setSendButtonEnable(i);
            }
            Log.m105918d("VOICEDEBUG", "Last Text Time = " + System.currentTimeMillis());
            return;
        }
        this.f212036e = false;
        this.f212037f.f211888j.setText(editable.subSequence(0, editable.length() - 1));
        if (this.f212037f.f211888j.length() > 0) {
            this.f212037f.f211905n.performClick();
            Log.m105924i("MicroMsg.ChatFooter", "enter button, do send");
        }
        Log.m105918d("VOICEDEBUG", "Last Text Time = " + System.currentTimeMillis());
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f212035d.beforeTextChanged(charSequence, i, i2, i3);
        Log.m105918d("VOICEDEBUG", "First Text Time = " + System.currentTimeMillis());
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ChatFooter chatFooter = this.f212037f;
        if (!chatFooter.f211870f2 && chatFooter.f211854c1 && i2 == 0 && i == charSequence.length() - 1 && i3 == 1 && charSequence.charAt(charSequence.length() - 1) == 10) {
            Log.m105924i("MicroMsg.ChatFooter", "text changed, enter button");
            this.f212036e = true;
            return;
        }
        this.f212035d.onTextChanged(charSequence, i, i2, i3);
        AndroidChatInputStruct androidChatInputStruct = this.f212037f.f211785M1;
        androidChatInputStruct.f194125g++;
        long nowMilliSecond = Util.nowMilliSecond();
        androidChatInputStruct.f194123e = nowMilliSecond;
        androidChatInputStruct.mo86048e("LastInputTimeStampMs", nowMilliSecond);
        AndroidChatInputStruct androidChatInputStruct2 = this.f212037f.f211785M1;
        if (androidChatInputStruct2.f194122d == 0) {
            long nowMilliSecond2 = Util.nowMilliSecond();
            androidChatInputStruct2.f194122d = nowMilliSecond2;
            androidChatInputStruct2.mo86048e("FirstInputTimeStampMs", nowMilliSecond2);
        }
        ChatFooter chatFooter2 = this.f212037f;
        ChatFooterPanel chatFooterPanel = chatFooter2.f211868f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setToSendText(chatFooter2.f211888j.getText().toString());
        }
    }
}
