package com.tencent.p014mm.plugin.luckymoney.p073ui;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyAutoScrollView;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.j2 */
public class C69617j2 implements LuckyMoneyAutoScrollView.C69337a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200976a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.j2$a */
    public class C69618a implements Runnable {
        public C69618a() {
        }

        public void run() {
            C69617j2.this.f200976a.f200366z.setFocusable(true);
            C69617j2.this.f200976a.f200366z.setClickable(true);
            C69617j2.this.f200976a.f200363y.setFocusable(true);
            C69617j2.this.f200976a.f200363y.setClickable(true);
            C69617j2.this.f200976a.f200272D.setFocusable(true);
            C69617j2.this.f200976a.f200272D.setClickable(true);
        }
    }

    public C69617j2(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200976a = luckyMoneyNewYearSendUIV2;
    }

    /* renamed from: a */
    public void mo95516a() {
        LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200976a;
        if (luckyMoneyNewYearSendUIV2.f200322a1) {
            AppCompatActivity context = luckyMoneyNewYearSendUIV2.getContext();
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200976a;
            C69242l1.m81616v(context, luckyMoneyNewYearSendUIV22.f200278G, luckyMoneyNewYearSendUIV22.f200319Y0);
            C69218g1.m81561h(this.f200976a.f200272D, 0);
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f200976a;
            if (!luckyMoneyNewYearSendUIV23.f200359w1) {
                C69218g1.m81561h(luckyMoneyNewYearSendUIV23.f200280H, 0);
            } else {
                C69218g1.m81561h(luckyMoneyNewYearSendUIV23.f200282I, 0);
            }
            this.f200976a.f200322a1 = false;
        } else {
            C69218g1.m81561h(luckyMoneyNewYearSendUIV2.f200272D, 0);
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f200976a;
            if (!luckyMoneyNewYearSendUIV24.f200359w1) {
                luckyMoneyNewYearSendUIV24.f200280H.setVisibility(0);
            } else {
                luckyMoneyNewYearSendUIV24.f200282I.setVisibility(0);
            }
            AppCompatActivity context2 = this.f200976a.getContext();
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV25 = this.f200976a;
            C69242l1.m81616v(context2, luckyMoneyNewYearSendUIV25.f200278G, luckyMoneyNewYearSendUIV25.f200319Y0);
            this.f200976a.f200272D.invalidate();
        }
        this.f200976a.mo95680c8(true);
        this.f200976a.f200276F.setFocusable(true);
        C119179t tVar = C119157j.f356862d;
        C69618a aVar = new C69618a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 300, false);
        LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f200976a.f200276F;
        luckyMoneyAutoScrollView.setContentDescription("" + (((double) this.f200976a.f200321Z0) / 100.0d));
    }
}
