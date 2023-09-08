package n61;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import qo3.C77407n;
import u61.C101961c;
import u61.C14122b;

/* renamed from: n61.c0 */
public final class C100083c0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293202d;

    public C100083c0(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f293202d = emojiStoreV3SingleProductAlbumUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f293202d;
        int i = emojiStoreV3SingleProductAlbumUI.f269030q;
        String str = emojiStoreV3SingleProductAlbumUI.f269024h;
        String str2 = emojiStoreV3SingleProductAlbumUI.f269025i;
        String str3 = emojiStoreV3SingleProductAlbumUI.f269026j;
        String str4 = emojiStoreV3SingleProductAlbumUI.f269027n;
        int i2 = emojiStoreV3SingleProductAlbumUI.f269028o;
        int i3 = emojiStoreV3SingleProductAlbumUI.f269038y;
        C87412m.m108594g(emojiStoreV3SingleProductAlbumUI, "context");
        C87412m.m108594g(str, "setTitle");
        C87412m.m108594g(str2, "setDesc");
        C87412m.m108594g(str3, "setIconURL");
        C87412m.m108594g(str4, "setAdURL");
        C77407n nVar = new C77407n((Context) emojiStoreV3SingleProductAlbumUI, 1, false);
        nVar.f225771i = new C14122b(1001, emojiStoreV3SingleProductAlbumUI, 1000);
        C101961c cVar = r1;
        C101961c cVar2 = new C101961c(1001, emojiStoreV3SingleProductAlbumUI, i3, i, 1000, str, str2, str3, str4, i2);
        nVar.f225782p = cVar;
        nVar.mo107573q();
        C115669n.INSTANCE.mo160131h(13224, 2, 0, "", Integer.valueOf(i));
        return false;
    }
}
