package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import android.widget.AdapterView;
import te3.C101824o80;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$a */
public final /* synthetic */ class EmojiPaidUI$$a implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPaidUI f268520d;

    public /* synthetic */ EmojiPaidUI$$a(EmojiPaidUI emojiPaidUI) {
        this.f268520d = emojiPaidUI;
    }

    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        EmojiPaidUI emojiPaidUI = this.f268520d;
        int i2 = EmojiPaidUI.f268517K;
        if (i < 0) {
            emojiPaidUI.getClass();
        } else if (i < emojiPaidUI.f268288j.getCount()) {
            C101824o80 o802 = emojiPaidUI.f268288j.getItem(i).f301983b;
            view.getLocationInWindow(new int[2]);
            new C78253a(emojiPaidUI).mo108273h(view, new EmojiPaidUI$$b(emojiPaidUI), new EmojiPaidUI$$c(emojiPaidUI, i, o802), (int) emojiPaidUI.f268518I, (int) emojiPaidUI.f268519J);
            return true;
        }
        return false;
    }
}
