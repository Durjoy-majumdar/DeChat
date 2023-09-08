package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import m00.C10700d;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.b4 */
public class C69570b4 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f200872a;

    public C69570b4(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f200872a = luckyMoneyPickEnvelopeUI;
    }

    public void onClick(View view) {
        C77994sf2 sf22;
        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f200872a;
        int i = luckyMoneyPickEnvelopeUI.f200557u;
        if (i >= 0 && i < ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).size()) {
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = this.f200872a;
            LuckyMoneyPickEnvelopeUI.C69497p pVar = (LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI2.f200555s).get(luckyMoneyPickEnvelopeUI2.f200557u);
            if (pVar.f200614a && (sf22 = pVar.f200615b) != null) {
                String str = sf22.f228202f;
                HashMap hashMap = new HashMap();
                hashMap.put("key_red_packet_preview_material_id", str);
                hashMap.put("key_red_packet_preview_scene", "1");
                ((C10700d) C86312j.m106911c(C10700d.class)).mo10956l2(this.f200872a.getContext(), hashMap);
                C115669n nVar = C115669n.INSTANCE;
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI3 = this.f200872a;
                nVar.mo160131h(18892, 3, Integer.valueOf(this.f200872a.f200558v + 1), Integer.valueOf(this.f200872a.f200557u + 1), luckyMoneyPickEnvelopeUI3.f200527K, pVar.f200615b.f228202f, luckyMoneyPickEnvelopeUI3.f200526J, Integer.valueOf(luckyMoneyPickEnvelopeUI3.f200548j.getItemCount() - 1), Integer.valueOf(this.f200872a.mo95738N7()));
            }
        }
    }
}
