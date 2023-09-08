package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f32.C75672b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.t4 */
public class C69692t4 implements C75672b.C75673a {

    /* renamed from: a */
    public final /* synthetic */ C77994sf2 f201091a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f201092b;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.t4$a */
    public class C69693a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f201093d;

        public C69693a(boolean z) {
            this.f201093d = z;
        }

        public void run() {
            C69692t4.this.f201092b.f200643p0.setVisibility(8);
            Dialog dialog = LuckyMoneyPickEnvelopeUI.this.f200517A;
            if (dialog != null && dialog.isShowing()) {
                LuckyMoneyPickEnvelopeUI.this.f200517A.dismiss();
            }
            C69692t4 t4Var = C69692t4.this;
            C77994sf2 sf22 = t4Var.f201091a;
            if (sf22.f228205i == 1 || sf22.f228209p == 1) {
                Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
                return;
            }
            LuckyMoneyPickEnvelopeUI.C69498r rVar = t4Var.f201092b;
            if (rVar.f200618A == 1) {
                View view = rVar.f200636T;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (!this.f201093d) {
                View view3 = rVar.f200636T;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C69692t4.this.f201092b.f200637U.setVisibility(0);
                C69692t4.this.f201092b.f200638V.setVisibility(8);
                C69692t4.this.f201092b.f200639W.setVisibility(0);
            } else {
                View view5 = rVar.f200636T;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public C69692t4(LuckyMoneyPickEnvelopeUI.C69498r rVar, C77994sf2 sf22) {
        this.f201092b = rVar;
        this.f201091a = sf22;
    }

    public void onComplete(boolean z) {
        C69693a aVar = new C69693a(z);
        if (MMHandlerThread.isMainThread()) {
            aVar.run();
        } else {
            this.f201092b.f200636T.post(aVar);
        }
    }
}
