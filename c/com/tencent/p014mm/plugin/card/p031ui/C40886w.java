package com.tencent.p014mm.plugin.card.p031ui;

import com.tencent.p014mm.plugin.card.model.CardInfo;
import f40.C86709a0;
import hz0.C46156r;
import java.util.LinkedList;
import wz0.C53248d;

/* renamed from: com.tencent.mm.plugin.card.ui.w */
public class C40886w extends C53248d.C53257i {

    /* renamed from: a */
    public final /* synthetic */ CardInvalidCardUI f109956a;

    public C40886w(CardInvalidCardUI cardInvalidCardUI) {
        this.f109956a = cardInvalidCardUI;
    }

    /* renamed from: a */
    public void mo63829a() {
        CardInvalidCardUI cardInvalidCardUI = this.f109956a;
        int i = CardInvalidCardUI.f109788w;
        cardInvalidCardUI.f109705j = true;
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < cardInvalidCardUI.f109700e.getCount(); i2++) {
            CardInfo cardInfo = (CardInfo) cardInvalidCardUI.f109707o.getItem(i2);
            if (cardInfo != null) {
                linkedList.add(cardInfo.field_card_id);
            }
        }
        cardInvalidCardUI.mo63761W7(true);
        C86709a0.m107529k().f251779b.mo123460f(new C46156r(linkedList));
    }
}
