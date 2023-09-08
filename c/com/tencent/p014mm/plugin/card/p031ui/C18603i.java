package com.tencent.p014mm.plugin.card.p031ui;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C75592q0;
import f40.C86709a0;
import hz0.C46145e0;
import nj3.C76879j;
import te3.g44;
import wd3.C65953v0;
import wz0.C22945n;

/* renamed from: com.tencent.mm.plugin.card.ui.i */
public class C18603i implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ int f51944a;

    /* renamed from: b */
    public final /* synthetic */ String f51945b;

    /* renamed from: c */
    public final /* synthetic */ CardDetailUIContoller f51946c;

    public C18603i(CardDetailUIContoller cardDetailUIContoller, int i, String str) {
        this.f51946c = cardDetailUIContoller;
        this.f51944a = i;
        this.f51945b = str;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            CardDetailUIContoller cardDetailUIContoller = this.f51946c;
            cardDetailUIContoller.f51781J = str;
            int i2 = this.f51944a;
            if (i2 == 0) {
                CardDetailUIContoller.C18581j jVar = cardDetailUIContoller.f51790T;
                if (jVar != null) {
                    String str2 = this.f51945b;
                    CardDetailUI cardDetailUI = CardDetailUI.this;
                    int i3 = CardDetailUI.f51728S;
                    cardDetailUI.mo23351Q7(true);
                    C86709a0.m107529k().f251779b.mo123460f(new C46145e0(cardDetailUI.f51748f.getCardId(), str2, 18));
                }
                C115669n.INSTANCE.mo160131h(11582, "OperGift", 1, Integer.valueOf(this.f51946c.f51776E.mo23264L0().f64141i), this.f51946c.f51776E.mo23270R0(), this.f51946c.f51776E.getCardId(), this.f51946c.f51780I);
                MMActivity mMActivity = this.f51946c.f51797e;
                C76879j.m92726T(mMActivity, mMActivity.getResources().getString(C0966R.string.f360220ay1));
            } else if (i2 == 1) {
                g44 u0 = cardDetailUIContoller.f51776E.mo23293u0();
                u0.f133848d = cardDetailUIContoller.mo23369j(C0966R.string.b1f) + cardDetailUIContoller.f51779H.mo32579d();
                C22945n.m26994G(cardDetailUIContoller.f51776E, cardDetailUIContoller.f51780I, cardDetailUIContoller.f51791U.f51827f, 2, true, false);
                C22945n.m26995H(cardDetailUIContoller.f51781J, cardDetailUIContoller.f51780I);
                MMActivity mMActivity2 = this.f51946c.f51797e;
                C76879j.m92726T(mMActivity2, mMActivity2.getResources().getString(C0966R.string.f360220ay1));
            } else if (i2 == 4) {
                if (TextUtils.isEmpty(cardDetailUIContoller.f51776E.mo23280e())) {
                    cardDetailUIContoller.f51776E.mo23281f2(C75592q0.m90789s());
                }
                g44 u05 = cardDetailUIContoller.f51776E.mo23293u0();
                u05.f133848d = cardDetailUIContoller.mo23369j(C0966R.string.b0d) + cardDetailUIContoller.f51779H.mo32579d();
                C22945n.m26994G(cardDetailUIContoller.f51776E, cardDetailUIContoller.f51780I, cardDetailUIContoller.f51791U.f51827f, 23, true, false);
                C22945n.m26995H(cardDetailUIContoller.f51781J, cardDetailUIContoller.f51780I);
                C115669n.INSTANCE.mo160131h(11582, "OpeRecommendCard", Integer.valueOf(this.f51946c.f51791U.f51822a), Integer.valueOf(this.f51946c.f51776E.mo23264L0().f64141i), this.f51946c.f51776E.mo23270R0(), this.f51946c.f51776E.getCardId(), this.f51946c.f51780I);
                MMActivity mMActivity3 = this.f51946c.f51797e;
                C76879j.m92726T(mMActivity3, mMActivity3.getResources().getString(C0966R.string.f360220ay1));
            }
        }
    }
}
