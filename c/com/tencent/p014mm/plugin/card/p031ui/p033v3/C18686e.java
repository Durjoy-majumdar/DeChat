package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import te3.C22514mn;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: com.tencent.mm.plugin.card.ui.v3.e */
public final class C18686e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CouponCardListUI f52250d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f52251e;

    public C18686e(CouponCardListUI couponCardListUI, C60905o oVar) {
        this.f52250d = couponCardListUI;
        this.f52251e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$onBindViewHolder$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f52250d.f52135i;
        Log.m105924i(str, "click header view: " + this.f52251e.mo17363j());
        C22514mn a = ((CouponCardListUI.C18653b) this.f52251e.f173503E).mo23479a();
        CouponCardListUI couponCardListUI = this.f52250d;
        int i = a.f64251i;
        if (i == 1) {
            couponCardListUI.f52147x = true;
            String str2 = a.f64246d;
            C87412m.m108593f(str2, "card_pack_merchant_id");
            couponCardListUI.f52148y = str2;
            couponCardListUI.f52149z = a.f64263x;
            AppCompatActivity context = couponCardListUI.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C53246b.m59678j((MMActivity) context, a.f64252j, 0);
        } else if (i == 2) {
            couponCardListUI.f52147x = true;
            String str3 = a.f64246d;
            C87412m.m108593f(str3, "card_pack_merchant_id");
            couponCardListUI.f52148y = str3;
            couponCardListUI.f52149z = a.f64263x;
            C51997xn xnVar = a.f64253n;
            C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$onBindViewHolder$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
