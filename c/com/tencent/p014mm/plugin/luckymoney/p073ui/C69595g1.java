package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.plugin.luckymoney.model.C69198d0;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyHistoryEnvelopeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.g1 */
public class C69595g1 implements C75142u0.C75149e {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyHistoryEnvelopeUI.C69407i f200913a;

    /* renamed from: b */
    public final /* synthetic */ ListScrollPAGView f200914b;

    /* renamed from: c */
    public final /* synthetic */ C77994sf2 f200915c;

    /* renamed from: d */
    public final /* synthetic */ View f200916d;

    public C69595g1(LuckyMoneyHistoryEnvelopeUI.C69408j jVar, LuckyMoneyHistoryEnvelopeUI.C69407i iVar, ListScrollPAGView listScrollPAGView, C77994sf2 sf22, View view) {
        this.f200913a = iVar;
        this.f200914b = listScrollPAGView;
        this.f200915c = sf22;
        this.f200916d = view;
    }

    /* renamed from: a */
    public void mo95346a(C75142u0.C75143a aVar) {
        C75142u0.C75143a aVar2 = aVar;
        if (aVar2 instanceof C75142u0.C75143a.C75145b) {
            String str = ((C75142u0.C75143a.C75145b) aVar2).f221112a;
            Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "downloadComplete success，file path: %s", str);
            this.f200913a.f200001e = false;
            C69198d0.f199107a.mo95355e(1, str, this.f200914b);
            C115669n.INSTANCE.mo160131h(28153, this.f200915c.f228203g.f228260x, 1, 6);
            return;
        }
        Log.m105925i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar2).f221111a));
        View view = this.f200916d;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$5", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$5", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C115669n.INSTANCE.mo160131h(28153, this.f200915c.f228203g.f228260x, 2, 6);
    }
}
