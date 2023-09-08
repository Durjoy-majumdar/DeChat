package n61;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.mmdata.rpt.DesignerEmojiEntranceStruct;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import q61.C101037a;
import q61.C101047d;
import rx3.C13598b0;

/* renamed from: n61.a0 */
public final class C100077a0 extends C87413o implements C32226l<C101047d, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3SingleProductAlbumUI f293187d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100077a0(EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        super(1);
        this.f293187d = emojiStoreV3SingleProductAlbumUI;
    }

    public Object invoke(Object obj) {
        C101047d dVar = (C101047d) obj;
        C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
        DesignerEmojiEntranceStruct designerEmojiEntranceStruct = new DesignerEmojiEntranceStruct();
        EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f293187d;
        designerEmojiEntranceStruct.f265383d = 3;
        designerEmojiEntranceStruct.f265384e = (long) emojiStoreV3SingleProductAlbumUI.f269030q;
        designerEmojiEntranceStruct.f265385f = designerEmojiEntranceStruct.mo86045b("SetName", emojiStoreV3SingleProductAlbumUI.f269024h, true);
        designerEmojiEntranceStruct.f265386g = (long) emojiStoreV3SingleProductAlbumUI.f269034u;
        designerEmojiEntranceStruct.f265387h = designerEmojiEntranceStruct.mo86045b("sessionid", String.valueOf(C101037a.f295825a), true);
        designerEmojiEntranceStruct.f265388i = designerEmojiEntranceStruct.mo86045b("md5", dVar.f295839c.toString(), true);
        designerEmojiEntranceStruct.f265389j = designerEmojiEntranceStruct.mo86045b(FirebaseAnalytics.C113379b.INDEX, dVar.f295840d.toString(), true);
        designerEmojiEntranceStruct.f265390k = 1;
        designerEmojiEntranceStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
