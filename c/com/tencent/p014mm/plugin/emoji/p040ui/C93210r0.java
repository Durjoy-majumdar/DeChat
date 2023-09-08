package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.emoji.ui.r0 */
public class C93210r0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268771d;

    public C93210r0(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268771d = emojiStoreDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Log.m105918d("MicroMsg.emoji.EmojiStoreDetailUI", "on shard click.");
        EmojiStoreDetailUI emojiStoreDetailUI = this.f268771d;
        C77407n nVar = new C77407n(emojiStoreDetailUI.f268595d, 1, false);
        nVar.f225771i = new C2223w0(emojiStoreDetailUI);
        nVar.f225782p = new C93274x0(emojiStoreDetailUI);
        nVar.mo107573q();
        C115669n.INSTANCE.mo160131h(13224, 0, 0, emojiStoreDetailUI.f268597e, "", "", Integer.valueOf(EmojiLogic.m117482m(emojiStoreDetailUI.mo127738J7())), Integer.valueOf(EmojiLogic.m117484o(emojiStoreDetailUI.mo127738J7())), EmojiLogic.m117483n(emojiStoreDetailUI.mo127738J7()));
        return true;
    }
}
