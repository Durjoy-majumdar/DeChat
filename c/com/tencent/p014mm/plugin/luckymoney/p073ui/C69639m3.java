package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import m00.C10700d;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.m3 */
public final class C69639m3 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C69651n3 f201010a;

    /* renamed from: b */
    public final /* synthetic */ int f201011b;

    public C69639m3(C69651n3 n3Var, int i) {
        this.f201010a = n3Var;
        this.f201011b = i;
    }

    public final void onClick(View view) {
        HashMap hashMap = new HashMap();
        C77994sf2 sf22 = this.f201010a.f201027d;
        if (sf22 != null) {
            String str = sf22.f228202f;
            C87412m.m108593f(str, "hbEnvelopSource.materialId");
            hashMap.put("key_red_packet_preview_material_id", str);
            hashMap.put("key_red_packet_preview_scene", "1");
            StringBuilder sb = new StringBuilder();
            sb.append("click preview ： ");
            C77994sf2 sf23 = this.f201010a.f201027d;
            if (sf23 != null) {
                sb.append(sf23.f228202f);
                Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeItemDetailUI", sb.toString());
                int intExtra = this.f201010a.getIntent().getIntExtra("key_source_original_pos", -1);
                String stringExtra = this.f201010a.getIntent().getStringExtra("key_source_original_coverid");
                String stringExtra2 = this.f201010a.getIntent().getStringExtra("key_source_sessionid");
                int intExtra2 = this.f201010a.getIntent().getIntExtra("key_source_cover_count", 0);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[8];
                objArr[0] = 3;
                objArr[1] = Integer.valueOf(intExtra + 1);
                objArr[2] = Integer.valueOf(this.f201011b + 1);
                objArr[3] = stringExtra;
                C77994sf2 sf24 = this.f201010a.f201027d;
                if (sf24 != null) {
                    objArr[4] = sf24.f228202f;
                    objArr[5] = stringExtra2;
                    objArr[6] = Integer.valueOf(intExtra2);
                    objArr[7] = 2;
                    nVar.mo160131h(18892, objArr);
                    ((C10700d) C86312j.m106911c(C10700d.class)).mo10956l2(this.f201010a.getContext(), hashMap);
                    return;
                }
                C87412m.m108603p("hbEnvelopSource");
                throw null;
            }
            C87412m.m108603p("hbEnvelopSource");
            throw null;
        }
        C87412m.m108603p("hbEnvelopSource");
        throw null;
    }
}
