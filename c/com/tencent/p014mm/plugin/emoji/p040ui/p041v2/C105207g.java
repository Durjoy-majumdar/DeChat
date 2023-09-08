package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import com.tencent.p014mm.storage.C72996z1;
import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.g */
public final class C105207g extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV2DesignerUI f312486d;

    /* renamed from: e */
    public final /* synthetic */ C72996z1 f312487e;

    /* renamed from: f */
    public final /* synthetic */ int f312488f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105207g(EmojiStoreV2DesignerUI emojiStoreV2DesignerUI, C72996z1 z1Var, int i) {
        super(2);
        this.f312486d = emojiStoreV2DesignerUI;
        this.f312487e = z1Var;
        this.f312488f = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        EmojiStoreV2DesignerUI.m141274J7(this.f312486d, this.f312487e, (C108504h) obj, this.f312488f | 1);
        return C13598b0.f38549a;
    }
}
