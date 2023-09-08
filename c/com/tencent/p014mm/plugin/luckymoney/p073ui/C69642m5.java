package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.m5 */
public class C69642m5 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyWishFooter f201015d;

    public C69642m5(LuckyMoneyWishFooter luckyMoneyWishFooter) {
        this.f201015d = luckyMoneyWishFooter;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyWishFooter$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        LuckyMoneyWishFooter luckyMoneyWishFooter = this.f201015d;
        luckyMoneyWishFooter.f200841u = false;
        luckyMoneyWishFooter.f200838r.setVisibility(8);
        this.f201015d.f200838r.mo100196h();
        this.f201015d.f200835o.setImageResource(C0966R.raw.icons_outlined_emoji);
        this.f201015d.getClass();
        this.f201015d.f200839s = 0;
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyWishFooter$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
