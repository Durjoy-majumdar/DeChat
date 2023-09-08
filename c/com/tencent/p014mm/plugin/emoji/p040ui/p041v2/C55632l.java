package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p175j0.C108504h;
import rx3.C13598b0;
import te3.C101787i40;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.l */
public final class C55632l extends C87413o implements C32230s<C103941f, Integer, C101787i40, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2DesignerUI f158338d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55632l(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
        super(5);
        this.f158338d = emojiStoreV2DesignerUI;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj2).intValue();
        C101787i40 i402 = (C101787i40) obj3;
        C108504h hVar = (C108504h) obj4;
        ((Number) obj5).intValue();
        C87412m.m108594g((C103941f) obj, "$this$itemsIndexed");
        if (i402 != null) {
            EmojiStoreV2DesignerUI emojiStoreV2DesignerUI = this.f158338d;
            int i = EmojiStoreV2DesignerUI.f312432w;
            emojiStoreV2DesignerUI.mo149516L7().f154995f = Math.max(intValue + 1, this.f158338d.mo149516L7().f154995f);
            this.f158338d.mo149518N7(i402, hVar, 72);
        }
        return C13598b0.f38549a;
    }
}
