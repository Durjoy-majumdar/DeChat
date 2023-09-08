package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.i0 */
public class C93191i0 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ EmojiPaidUI f268746a;

    public C93191i0(EmojiPaidUI emojiPaidUI) {
        this.f268746a = emojiPaidUI;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            Intent intent = new Intent();
            intent.putExtra("key_action_type", 200002);
            C88144b.m109795m(this.f268746a, "wallet_index", ".ui.WalletIapUI", intent, 2001);
            Log.m105924i("MicroMsg.emoji.EmojiPaidUI", "[showMenuDialog] startActivityForResult ui.WalletIapUI");
            this.f268746a.mo127661d8();
        }
    }
}
