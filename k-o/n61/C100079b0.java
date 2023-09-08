package n61;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;

/* renamed from: n61.b0 */
public final class C100079b0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293191d;

    public C100079b0(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f293191d = emojiStoreV3SingleProductAlbumUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f293191d.finish();
        return false;
    }
}
