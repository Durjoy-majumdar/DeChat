package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.o */
public final class C105209o extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2DesignerUI f312493d;

    /* renamed from: e */
    public final /* synthetic */ int f312494e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105209o(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, int i) {
        super(2);
        this.f312493d = emojiStoreV2DesignerUI;
        this.f312494e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        EmojiStoreV2DesignerUI.m141275K7(this.f312493d, (C108504h) obj, this.f312494e | 1);
        return C13598b0.f38549a;
    }
}
