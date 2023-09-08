package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.s */
public class C2221s implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f12273d;

    public C2221s(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f12273d = emojiStoreV2SingleProductUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2SingleProductUI", "on shard click.");
        EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f12273d;
        int i = EmojiStoreV2SingleProductUI.f268885U;
        C77407n nVar = new C77407n((Context) emojiStoreV2SingleProductUI.getContext(), 1, false);
        nVar.f225771i = new C2222t(emojiStoreV2SingleProductUI);
        nVar.f225782p = new C93252u(emojiStoreV2SingleProductUI);
        nVar.mo107573q();
        C115669n.INSTANCE.mo160131h(13224, 2, 0, "", Integer.valueOf(emojiStoreV2SingleProductUI.f268910i));
        return true;
    }
}
