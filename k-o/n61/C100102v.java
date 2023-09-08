package n61;

import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductRecyclerView;
import p61.C100674s;

/* renamed from: n61.v */
public final class C100102v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293252d;

    public C100102v(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f293252d = emojiStoreV3SingleProductAlbumUI;
    }

    public final void run() {
        EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f293252d;
        C100674s sVar = emojiStoreV3SingleProductAlbumUI.f269022f;
        if (sVar != null) {
            EmojiStoreV3SingleProductRecyclerView emojiStoreV3SingleProductRecyclerView = emojiStoreV3SingleProductAlbumUI.f269021e;
            sVar.mo140112F4(emojiStoreV3SingleProductRecyclerView != null ? emojiStoreV3SingleProductRecyclerView.getLayoutManager() : null);
        }
    }
}
