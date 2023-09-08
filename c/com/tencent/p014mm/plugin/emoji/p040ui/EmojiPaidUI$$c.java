package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import nj3.C11184p0;
import nj3.C76879j;
import te3.C101824o80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiPaidUI$$c */
public final /* synthetic */ class EmojiPaidUI$$c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ EmojiPaidUI f110574d;

    /* renamed from: e */
    public final /* synthetic */ int f110575e;

    /* renamed from: f */
    public final /* synthetic */ C101824o80 f110576f;

    public /* synthetic */ EmojiPaidUI$$c(EmojiPaidUI emojiPaidUI, int i, C101824o80 o802) {
        this.f110574d = emojiPaidUI;
        this.f110575e = i;
        this.f110576f = o802;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        EmojiPaidUI emojiPaidUI = this.f110574d;
        int i2 = this.f110575e;
        C101824o80 o802 = this.f110576f;
        int i3 = EmojiPaidUI.f268517K;
        emojiPaidUI.getClass();
        if (menuItem.getItemId() == 1) {
            C76879j.m92708B(emojiPaidUI, emojiPaidUI.getString(C0966R.string.f7946x3), "", emojiPaidUI.getString(C0966R.string.f7944x1), emojiPaidUI.getString(C0966R.string.f7926wf), new EmojiPaidUI$$d(emojiPaidUI, i2, o802), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
        }
    }
}
