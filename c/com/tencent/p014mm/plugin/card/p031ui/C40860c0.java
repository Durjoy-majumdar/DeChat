package com.tencent.p014mm.plugin.card.p031ui;

import hz0.C46146f;
import hz0.C46153l0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.card.ui.c0 */
public class C40860c0 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ int f109867a;

    /* renamed from: b */
    public final /* synthetic */ CardNewMsgUI f109868b;

    public C40860c0(CardNewMsgUI cardNewMsgUI, int i) {
        this.f109868b = cardNewMsgUI;
        this.f109867a = i;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        C46146f fVar;
        if (i == 0 && (fVar = (C46146f) this.f109868b.f109792e.getItem(this.f109867a)) != null) {
            C46153l0.Bx0().mo71403b(fVar.field_msg_id);
            this.f109868b.mo63788H7();
            this.f109868b.f109792e.mo7991f();
        }
    }
}
