package n61;

import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import p61.C100674s;

/* renamed from: n61.w */
public final class C100103w extends GridLayoutManager.C0127b {

    /* renamed from: b */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293253b;

    /* renamed from: c */
    public final /* synthetic */ GridLayoutManager f293254c;

    public C100103w(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI, GridLayoutManager gridLayoutManager) {
        this.f293253b = emojiStoreV3SingleProductAlbumUI;
        this.f293254c = gridLayoutManager;
    }

    /* renamed from: c */
    public int mo118c(int i) {
        C100674s sVar = this.f293253b.f269022f;
        Integer valueOf = sVar != null ? Integer.valueOf(sVar.getItemViewType(i)) : null;
        if (valueOf != null && valueOf.intValue() == 7) {
            return this.f293254c.f44669w;
        }
        if (valueOf != null && valueOf.intValue() == 8) {
            return this.f293254c.f44669w;
        }
        return 1;
    }
}
