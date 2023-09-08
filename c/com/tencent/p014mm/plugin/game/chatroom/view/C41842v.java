package com.tencent.p014mm.plugin.game.chatroom.view;

import android.text.Spanned;
import com.tencent.p014mm.p136ui.tools.C45078p0;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.v */
public class C41842v extends C45078p0 {
    public C41842v(GameChatCommentFooter gameChatCommentFooter, int i, C45078p0.C45079a aVar) {
        super(i, aVar);
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_2;
        int i6 = 0;
        int e = spanned.length() > i3 ? C45078p0.m49926e(spanned.subSequence(0, i3).toString(), aVar) : C45078p0.m49926e(spanned.toString(), aVar);
        int e2 = spanned.length() > i4 ? C45078p0.m49926e(spanned.subSequence(i4, spanned.length()).toString(), aVar) : 0;
        int e3 = C45078p0.m49926e(charSequence.toString(), aVar);
        int i7 = (1000 - e) - e2;
        int a = C45078p0.m49922a(charSequence.toString());
        if (e + e3 + e2 <= 1000) {
            return charSequence;
        }
        int i8 = i7 - a;
        if (i8 >= 0) {
            i6 = i8;
        }
        return (i < 0 || charSequence.length() < (i5 = i6 + i)) ? "" : charSequence.subSequence(i, i5);
    }
}
