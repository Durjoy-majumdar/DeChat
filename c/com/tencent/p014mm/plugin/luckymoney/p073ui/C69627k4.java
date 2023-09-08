package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69198d0;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.k4 */
public class C69627k4 implements C75142u0.C75149e {

    /* renamed from: a */
    public final /* synthetic */ long f200995a;

    /* renamed from: b */
    public final /* synthetic */ C77994sf2 f200996b;

    /* renamed from: c */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f200997c;

    public C69627k4(LuckyMoneyPickEnvelopeUI.C69498r rVar, long j, C77994sf2 sf22) {
        this.f200997c = rVar;
        this.f200995a = j;
        this.f200996b = sf22;
    }

    /* renamed from: a */
    public void mo95346a(C75142u0.C75143a aVar) {
        C75142u0.C75143a aVar2 = aVar;
        long currentTimeMillis = System.currentTimeMillis() - this.f200995a;
        if (aVar2 instanceof C75142u0.C75143a.C75145b) {
            String str = ((C75142u0.C75143a.C75145b) aVar2).f221112a;
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete success，file path: %s", str);
            LuckyMoneyPickEnvelopeUI.C69498r rVar = this.f200997c;
            if (rVar.f200618A == 1) {
                C69198d0.f199107a.mo95356f(1, str, rVar.f200628K, true);
            } else {
                C69198d0.f199107a.mo95356f(1, str, rVar.f200628K, rVar.f44854d.isSelected());
            }
            C115669n.INSTANCE.mo160131h(28153, this.f200996b.f228203g.f228260x, 1, 5, Long.valueOf(currentTimeMillis));
            return;
        }
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar2).f221111a));
        View view = this.f200997c.f200627J;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C115669n.INSTANCE.mo160131h(28153, this.f200996b.f228203g.f228260x, 2, 5, Long.valueOf(currentTimeMillis));
    }
}
