package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.LabelContainerView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.y */
public class C93256y implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2SingleProductUI f268971d;

    public C93256y(EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f268971d = emojiStoreV2SingleProductUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        LabelContainerView labelContainerView = this.f268971d.f268894I;
        if (labelContainerView != null) {
            labelContainerView.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f268971d.f268893H);
            EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f268971d;
            emojiStoreV2SingleProductUI.f268895J.mo95190q(arrayList, emojiStoreV2SingleProductUI.f268897L);
            this.f268971d.setMMTitle((int) C0966R.string.c9w);
            this.f268971d.showOptionMenu(1001, false);
            C115669n.INSTANCE.kvStat(12788, "1");
        }
        return false;
    }
}
