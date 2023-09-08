package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.pluginsdk.model.C6653c1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import p179jw.C9531b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$d */
public class EmojiStoreDetailUI$$d implements C9531b.C9532a {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268645d;

    public EmojiStoreDetailUI$$d(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268645d = emojiStoreDetailUI;
    }

    /* renamed from: g2 */
    public void mo5537g2(ArrayList<C6653c1> arrayList) {
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(arrayList == null ? 0 : arrayList.size());
        Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "[onQueryFinish] %s", objArr);
        this.f268645d.f268602g1 = 12;
        if (arrayList != null && arrayList.size() > 0) {
            C6653c1 c1Var = arrayList.get(0);
            Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "onQueryFinish: %s", c1Var);
            int i = c1Var.f23974f;
            if (i == 10232) {
                EmojiStoreDetailUI emojiStoreDetailUI = this.f268645d;
                emojiStoreDetailUI.f268616p = 4;
                emojiStoreDetailUI.f268606i1 = c1Var.f23971c;
                emojiStoreDetailUI.f268608j1 = c1Var.f23972d;
                this.f268645d.f268609k1 = new BigDecimal(c1Var.f23973e).divide(new BigDecimal(1000000)).toString();
            } else {
                EmojiStoreDetailUI emojiStoreDetailUI2 = this.f268645d;
                emojiStoreDetailUI2.f268616p = 10;
                emojiStoreDetailUI2.f268604h1 = i;
            }
            this.f268645d.mo127743O7(1002);
        }
    }
}
