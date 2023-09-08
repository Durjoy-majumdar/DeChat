package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.f3 */
public final class C4870f3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C69597g3 f19955d;

    public C4870f3(C69597g3 g3Var) {
        this.f19955d = g3Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$updateConfirmBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeItemDetailUI", "click confirmbtn");
        Intent intent = new Intent();
        AppCompatActivity activity = this.f19955d.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        intent.putExtra("key_source_materialId", ((LuckyMoneyPickEnvelopeItemDetailUINew) activity).f200507e);
        AppCompatActivity activity2 = this.f19955d.getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        intent.putExtra("key_source_material_flag", ((LuckyMoneyPickEnvelopeItemDetailUINew) activity2).f200508f);
        AppCompatActivity activity3 = this.f19955d.getActivity();
        C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        intent.putExtra("key_source_timelimit_promo_signature", ((LuckyMoneyPickEnvelopeItemDetailUINew) activity3).f200509g);
        this.f19955d.getActivity().setResult(-1, intent);
        this.f19955d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$updateConfirmBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
