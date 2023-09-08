package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.HashMap;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$w */
public class ChatFooter$$w implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212066d;

    public ChatFooter$$w(ChatFooter chatFooter) {
        this.f212066d = chatFooter;
    }

    public boolean onTimerExpired() {
        ChatFooter chatFooter = this.f212066d;
        int i = chatFooter.f211955w4;
        int i2 = i % 3;
        chatFooter.f211955w4 = i + 1;
        if (i2 == 0) {
            chatFooter.f211950v4 = "·";
        } else if (i2 == 1) {
            chatFooter.f211950v4 = "··";
        } else if (i2 == 2) {
            chatFooter.f211950v4 = "···";
        }
        if (chatFooter.f211914o4 == ChatFooter$$l1.MODE_TRANS) {
            Log.m105918d("MicroMsg.ChatFooter", "updateCurTxt!!!");
            String str = (String) ((HashMap) chatFooter.f211925q4).get(Integer.valueOf(chatFooter.f211738A4));
            if (str == null) {
                str = "";
            }
            int i3 = 0;
            if (str.length() > 3) {
                i3 = str.length() - 3;
            }
            String str2 = str + chatFooter.f211950v4;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#4D000000")), i3, str2.length(), 18);
            chatFooter.f211797P2.setText(spannableString);
            chatFooter.f211797P2.setSelection(spannableString.length());
        }
        return true;
    }
}
