package n61;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import p61.C100657j;
import p61.C100659j0;
import p61.C100684y;
import p61.C100685z;
import q61.C101037a;
import r61.C101358h;
import te3.C101800k70;
import u61.C101962d;
import u61.C101964h;

/* renamed from: n61.z */
public final class C100106z implements C100685z {

    /* renamed from: a */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293257a;

    public C100106z(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f293257a = emojiStoreV3SingleProductAlbumUI;
    }

    /* renamed from: b */
    public void mo127715b(C100657j<?> jVar, int i, C100684y yVar) {
        C100684y yVar2 = yVar;
        C87412m.m108594g(jVar, "holder");
        if (yVar2 != null && yVar.getType() == 4) {
            C101800k70 k702 = null;
            C100659j0 j0Var = yVar2 instanceof C100659j0 ? (C100659j0) yVar2 : null;
            if (j0Var != null) {
                k702 = j0Var.f294877a;
            }
            C101800k70 k703 = k702;
            if (k703 != null) {
                this.f293257a.f269037x = true;
                EmojiInfo h = C101964h.m134226h(k703);
                C101962d dVar = C101962d.f300168a;
                AppCompatActivity context = this.f293257a.getContext();
                C87412m.m108593f(context, "context");
                C101358h f = C101962d.m134210f(dVar, context, h, true, (C32224a) null, (C32224a) null, (String) null, 0, 0, 0, 0, 1016, (Object) null);
                if (!Util.isNullOrNil(k703.f298601v)) {
                    String str = k703.f298601v;
                    C87412m.m108593f(str, "emojiInfo.StoreMeaning");
                    f.mo140841b(str);
                }
            }
            C101037a.m132406d(k703, 0, 3, 0, 29);
        }
    }
}
