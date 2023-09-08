package n61;

import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: n61.y */
public final class C100105y extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293256d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100105y(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        super(1);
        this.f293256d = emojiStoreV3SingleProductAlbumUI;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f293256d.setMMTitle("");
        } else {
            EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f293256d;
            emojiStoreV3SingleProductAlbumUI.setMMTitle(emojiStoreV3SingleProductAlbumUI.f269024h);
        }
        return C13598b0.f38549a;
    }
}
