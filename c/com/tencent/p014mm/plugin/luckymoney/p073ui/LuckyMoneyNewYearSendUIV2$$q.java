package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import p008bq.C67304c1;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$q */
public class LuckyMoneyNewYearSendUIV2$$q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200393d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$q$a */
    public class C69453a implements Runnable {
        public C69453a() {
        }

        public void run() {
            if (LuckyMoneyNewYearSendUIV2$$q.this.f200393d.f200281H1) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "wait upload out of time");
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = LuckyMoneyNewYearSendUIV2$$q.this.f200393d;
                luckyMoneyNewYearSendUIV2.f200281H1 = false;
                Dialog dialog = luckyMoneyNewYearSendUIV2.f200307T0;
                if (dialog != null && dialog.isShowing()) {
                    luckyMoneyNewYearSendUIV2.f200307T0.dismiss();
                }
                C76912y0.m92773l(LuckyMoneyNewYearSendUIV2$$q.this.f200393d.getContext(), LuckyMoneyNewYearSendUIV2$$q.this.f200393d.getContext().getResources().getString(C0966R.string.f361004nf3));
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = LuckyMoneyNewYearSendUIV2$$q.this.f200393d;
                luckyMoneyNewYearSendUIV22.f200273D1 = 1;
                luckyMoneyNewYearSendUIV22.f200285J1 = 1;
                luckyMoneyNewYearSendUIV22.mo95681d8();
            }
        }
    }

    public LuckyMoneyNewYearSendUIV2$$q(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200393d = luckyMoneyNewYearSendUIV2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.f358686gh0 || view.getId() == C0966R.C0970id.ogs) {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f200393d;
            int i = LuckyMoneyNewYearSendUIV2.f200265V1;
            luckyMoneyNewYearSendUIV2.mo95672U7(5);
            if (this.f200393d.f200273D1 == 2) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "mSendBtn click, but need wait upload voice result");
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f200393d;
                luckyMoneyNewYearSendUIV22.f200281H1 = true;
                luckyMoneyNewYearSendUIV22.mo95678a8();
                View view2 = this.f200393d.f200330h;
                if (view2 != null) {
                    view2.postDelayed(new C69453a(), 10000);
                }
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "mSendBtn click!");
                this.f200393d.mo95665N7(0);
            }
        } else if (view.getId() == C0966R.C0970id.f358688gh2) {
            this.f200393d.finish();
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f200393d;
            int i2 = LuckyMoneyNewYearSendUIV2.f200265V1;
            luckyMoneyNewYearSendUIV23.mo95672U7(6);
            this.f200393d.f200337l1 = new HBReportNewStruct();
            HBReportNewStruct hBReportNewStruct = this.f200393d.f200337l1;
            hBReportNewStruct.f194229d = 11;
            hBReportNewStruct.mo86054n();
            this.f200393d.mo95674W7(2);
        } else if (view.getId() == C0966R.C0970id.ggo || view.getId() == C0966R.C0970id.ggt || view.getId() == C0966R.C0970id.m46) {
            this.f200393d.f200337l1 = new HBReportNewStruct();
            HBReportNewStruct hBReportNewStruct2 = this.f200393d.f200337l1;
            hBReportNewStruct2.f194229d = 3;
            hBReportNewStruct2.mo86054n();
            LuckyMoneyNewYearSendUIV2.m81843J7(this.f200393d);
        } else if (view.getId() == C0966R.C0970id.ggq || view.getId() == C0966R.C0970id.f358685m43) {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f200393d;
            luckyMoneyNewYearSendUIV24.f200335j1 = null;
            luckyMoneyNewYearSendUIV24.f200336k1 = null;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_NEW_STRING, "");
            this.f200393d.mo95667P7();
            this.f200393d.mo95672U7(3);
            this.f200393d.f200337l1 = new HBReportNewStruct();
            HBReportNewStruct hBReportNewStruct3 = this.f200393d.f200337l1;
            hBReportNewStruct3.f194229d = 5;
            hBReportNewStruct3.mo86054n();
        } else if (view.getId() == C0966R.C0970id.ggx || view.getId() == C0966R.C0970id.m3y || view.getId() == C0966R.C0970id.ogt) {
            this.f200393d.f200276F.mo95513b();
            this.f200393d.mo95666O7();
            this.f200393d.mo95667P7();
            this.f200393d.mo95672U7(4);
            this.f200393d.f200337l1 = new HBReportNewStruct();
            HBReportNewStruct hBReportNewStruct4 = this.f200393d.f200337l1;
            hBReportNewStruct4.f194229d = 2;
            hBReportNewStruct4.mo86054n();
        } else if (view.getId() == C0966R.C0970id.ggy) {
            ((C67304c1) C86312j.m106911c(C67304c1.class)).mo55780KT(this.f200393d.f200355u1);
            this.f200393d.mo95680c8(false);
            this.f200393d.mo95668Q7(3);
        } else if (view.getId() == C0966R.C0970id.ggn) {
            LuckyMoneyNewYearSendUIV2.m81843J7(this.f200393d);
        } else if (view.getId() == C0966R.C0970id.ogv) {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV25 = this.f200393d;
            if (luckyMoneyNewYearSendUIV25.f200365y1) {
                luckyMoneyNewYearSendUIV25.mo95679b8(true);
            }
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV26 = this.f200393d;
            luckyMoneyNewYearSendUIV26.getClass();
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "showVoiceOperateSheet");
            C77407n nVar = new C77407n((Context) luckyMoneyNewYearSendUIV26, 1, false);
            nVar.f225771i = new C69591f2(luckyMoneyNewYearSendUIV26);
            nVar.f225782p = new C69596g2(luckyMoneyNewYearSendUIV26);
            nVar.mo107573q();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
