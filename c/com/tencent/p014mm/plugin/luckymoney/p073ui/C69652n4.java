package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import s24.C77613a;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.n4 */
public class C69652n4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69497p f201035d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f201036e;

    public C69652n4(LuckyMoneyPickEnvelopeUI.C69498r rVar, LuckyMoneyPickEnvelopeUI.C69497p pVar) {
        this.f201036e = rVar;
        this.f201035d = pVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(LuckyMoneyPickEnvelopeUI.this.getContext(), LuckyMoneyPickEnvelopeItemDetailUINew.class);
        int k = this.f201036e.mo17364k();
        LuckyMoneyPickEnvelopeUI.m81900I7(LuckyMoneyPickEnvelopeUI.this, k);
        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click normalVh thumb item , realPos : %s ， mSelectPos：%s", Integer.valueOf(k), Integer.valueOf(LuckyMoneyPickEnvelopeUI.this.f200557u));
        intent.putExtra("key_source_click_thumb_detail_need_close_dynamic", LuckyMoneyPickEnvelopeUI.this.f200543e);
        intent.putExtra("key_source_click_thumb_detail_resp", false);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_CLICK_THUNB_ITEM_SNAPSHOT_STRING_SYNC;
        i.mo119677K(aVar, "");
        C77994sf2 sf22 = this.f201035d.f200615b;
        if (sf22 != null) {
            try {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, new String(sf22.toByteArray(), C77613a.f226275a));
                intent.putExtra("key_source_click_thumb_detail_resp", true);
            } catch (IOException e) {
                Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "itemView parse error: %s", e.toString());
            }
            intent.putExtra("key_source_is_illegal", LuckyMoneyPickEnvelopeUI.this.mo95740P7(this.f201035d.f200615b.f228202f));
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
            int i2 = luckyMoneyPickEnvelopeUI.f200557u;
            if (i2 >= 0 && i2 < ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).size()) {
                intent.putExtra("key_source_select_pos", LuckyMoneyPickEnvelopeUI.this.f200557u);
            }
            intent.putExtra("key_source_is_select_create_Envelope", LuckyMoneyPickEnvelopeUI.this.mo95742R7());
            intent.putExtra("key_source_is_select_biz_Envelope", LuckyMoneyPickEnvelopeUI.this.mo95741Q7());
        }
        intent.putExtra("key_source_original_pos", LuckyMoneyPickEnvelopeUI.this.f200558v);
        intent.putExtra("key_source_original_coverid", LuckyMoneyPickEnvelopeUI.this.f200527K);
        intent.putExtra("key_source_sessionid", LuckyMoneyPickEnvelopeUI.this.f200526J);
        intent.putExtra("key_source_cover_count", LuckyMoneyPickEnvelopeUI.this.f200548j.getItemCount() - 1);
        LuckyMoneyPickEnvelopeUI.this.startActivityForResult(intent, 2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
