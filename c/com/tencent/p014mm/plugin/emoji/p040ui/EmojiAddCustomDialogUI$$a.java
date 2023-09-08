package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$a */
public final /* synthetic */ class EmojiAddCustomDialogUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiAddCustomDialogUI f268398d;

    /* renamed from: e */
    public final /* synthetic */ String f268399e;

    public /* synthetic */ EmojiAddCustomDialogUI$$a(EmojiAddCustomDialogUI emojiAddCustomDialogUI, String str) {
        this.f268398d = emojiAddCustomDialogUI;
        this.f268399e = str;
    }

    public final void run() {
        EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f268398d;
        String str = this.f268399e;
        C76912y0.m92768g(emojiAddCustomDialogUI.f268393o, emojiAddCustomDialogUI.getString(C0966R.string.f7568jx));
        Intent intent = new Intent();
        intent.putExtra("extra_id", str);
        intent.putExtra("activityId", emojiAddCustomDialogUI.f268390i.field_activityid);
        emojiAddCustomDialogUI.setResult(-1, intent);
        emojiAddCustomDialogUI.finish();
    }
}
