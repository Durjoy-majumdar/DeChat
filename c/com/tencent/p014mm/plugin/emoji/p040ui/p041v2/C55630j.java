package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p004b0.C103941f;
import p175j0.C108504h;
import rx3.C13598b0;
import te3.C101787i40;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.j */
public final class C55630j extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List f158334d;

    /* renamed from: e */
    public final /* synthetic */ EmojiStoreV2DesignerUI f158335e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55630j(List list, EmojiStoreV2DesignerUI emojiStoreV2DesignerUI) {
        super(4);
        this.f158334d = list;
        this.f158335e = emojiStoreV2DesignerUI;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C103941f fVar = (C103941f) obj;
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g(fVar, "$this$items");
        if ((intValue2 & 14) == 0) {
            i = (hVar.mo51619x(fVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((i & 731) != 146 || !hVar.mo51575a()) {
            this.f158335e.mo149518N7((C101787i40) this.f158334d.get(intValue), hVar, 72);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
