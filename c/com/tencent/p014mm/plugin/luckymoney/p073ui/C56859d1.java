package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyHistoryEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f32.C75672b;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.d1 */
public class C56859d1 implements C75672b.C75673a {

    /* renamed from: a */
    public final /* synthetic */ C60905o f162903a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.d1$a */
    public class C56860a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f162904d;

        public C56860a(boolean z) {
            this.f162904d = z;
        }

        public void run() {
            View D = C56859d1.this.f162903a.mo85812D(C0966R.C0970id.g2d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!this.f162904d) {
                View D2 = C56859d1.this.f162903a.mo85812D(C0966R.C0970id.g2i);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(D2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View D3 = C56859d1.this.f162903a.mo85812D(C0966R.C0970id.g2e);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                C117292a.m165358d(D3, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(D3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View D4 = C56859d1.this.f162903a.mo85812D(C0966R.C0970id.g1o);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                C117292a.m165358d(D4, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(D4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View D5 = C56859d1.this.f162903a.mo85812D(C0966R.C0970id.g2g);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                C117292a.m165358d(D5, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(D5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View D6 = C56859d1.this.f162903a.mo85812D(C0966R.C0970id.g2i);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            C117292a.m165358d(D6, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(D6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public C56859d1(LuckyMoneyHistoryEnvelopeUI.C69408j jVar, C60905o oVar) {
        this.f162903a = oVar;
    }

    public void onComplete(boolean z) {
        Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "load ok: %s", Boolean.valueOf(z));
        C56860a aVar = new C56860a(z);
        if (MMHandlerThread.isMainThread()) {
            aVar.run();
        } else {
            this.f162903a.mo85812D(C0966R.C0970id.g2i).post(aVar);
        }
    }
}
