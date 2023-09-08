package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p004b0.C54372f0;
import p415q0.C110261c;
import rx3.C13598b0;
import te3.C101787i40;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.k */
public final class C55631k extends C87413o implements C32226l<C54372f0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C101787i40> f158336d;

    /* renamed from: e */
    public final /* synthetic */ EmojiStoreV2DesignerUI f158337e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55631k(List<? extends C101787i40> list, EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
        super(1);
        this.f158336d = list;
        this.f158337e = emojiStoreV2DesignerUI;
    }

    public Object invoke(Object obj) {
        C54372f0 f0Var = (C54372f0) obj;
        C87412m.m108594g(f0Var, "$this$LazyRow");
        List<C101787i40> list = this.f158336d;
        f0Var.mo75141d(list.size(), (C32226l<? super Integer, ? extends Object>) null, new C2220i(list), C110261c.m149879c(-1091073711, true, new C55630j(list, this.f158337e)));
        return C13598b0.f38549a;
    }
}
