package com.tencent.p014mm.plugin.card.p031ui;

import gz0.C45995o;
import hz0.C46146f;
import hz0.C46153l0;
import java.util.ArrayList;
import wz0.C53248d;

/* renamed from: com.tencent.mm.plugin.card.ui.d0 */
public class C40862d0 extends C53248d.C53257i {

    /* renamed from: a */
    public final /* synthetic */ CardNewMsgUI f109870a;

    public C40862d0(CardNewMsgUI cardNewMsgUI) {
        this.f109870a = cardNewMsgUI;
    }

    /* renamed from: a */
    public void mo63829a() {
        C45995o Bx0 = C46153l0.Bx0();
        if (((ArrayList) Bx0.f124033b).size() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Bx0.f124033b);
            for (int i = 0; i < arrayList.size(); i++) {
                C46146f fVar = (C46146f) arrayList.get(i);
                if (fVar != null) {
                    ((ArrayList) Bx0.f124033b).remove(fVar);
                    Bx0.mo71404c(fVar);
                }
            }
            arrayList.clear();
        }
        CardNewMsgUI cardNewMsgUI = this.f109870a;
        int i2 = CardNewMsgUI.f109790n;
        cardNewMsgUI.mo63788H7();
        this.f109870a.f109792e.mo7991f();
    }
}
