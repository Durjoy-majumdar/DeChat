package n61;

import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import p61.C100674s;
import p61.C100684y;
import sx3.C110818d0;

/* renamed from: n61.d0 */
public final class C100086d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293206d;

    public C100086d0(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f293206d = emojiStoreV3SingleProductAlbumUI;
    }

    public final void run() {
        C100674s sVar = this.f293206d.f269022f;
        if (sVar != null && (!sVar.f294957e.isEmpty()) && ((C100684y) C110818d0.m150923U(sVar.f294957e)).getType() != 8) {
            sVar.f294957e.add(sVar.f294964o);
            sVar.notifyItemChanged(sVar.getItemCount() - 1);
        }
    }
}
