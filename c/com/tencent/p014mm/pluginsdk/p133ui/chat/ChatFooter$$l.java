package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$l */
public class ChatFooter$$l implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212013d;

    public ChatFooter$$l(ChatFooter chatFooter) {
        this.f212013d = chatFooter;
    }

    public void afterTextChanged(Editable editable) {
        if (editable != null) {
            int width = this.f212013d.f211793O2.getWidth();
            int lineCount = this.f212013d.f211797P2.getLineCount();
            ChatFooter chatFooter = this.f212013d;
            int i = lineCount - chatFooter.f211751D3;
            if (i != 0 && chatFooter.f211914o4 == ChatFooter$$l1.MODE_TRANS && width == chatFooter.f211791N3) {
                int a = C74942w4.m89784a(chatFooter.getContext(), 5);
                int lineHeight = this.f212013d.f211797P2.getLineHeight() * i;
                if (i <= 0) {
                    a = -a;
                }
                int height = this.f212013d.f211793O2.getHeight();
                ChatFooter chatFooter2 = this.f212013d;
                if (chatFooter2.f211917p1) {
                    chatFooter2.f211813S3 = Math.min(Math.max(chatFooter2.f211787M3, height + lineHeight + a), this.f212013d.f211823U3);
                } else {
                    chatFooter2.f211813S3 = Math.min(Math.max(chatFooter2.f211787M3, height + lineHeight + a), this.f212013d.f211818T3);
                }
                Log.m105919d("MicroMsg.ChatFooter", "afterTextChanged transHeight:%s, nowLineCount:%s, lastLineCount:%s", Integer.valueOf(this.f212013d.f211813S3), Integer.valueOf(lineCount), Integer.valueOf(this.f212013d.f211751D3));
                ChatFooter chatFooter3 = this.f212013d;
                ValueAnimator duration = ValueAnimator.ofInt(new int[]{chatFooter3.f211793O2.getHeight(), chatFooter3.f211813S3}).setDuration(200);
                duration.addUpdateListener(new C72812n0(chatFooter3));
                duration.start();
                this.f212013d.f211751D3 = lineCount;
            }
            C71562c cVar = this.f212013d.f211750D2;
            if (1 == cVar.f207386u) {
                cVar.f207385t = 1;
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
