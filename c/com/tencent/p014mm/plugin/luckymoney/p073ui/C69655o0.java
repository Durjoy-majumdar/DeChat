package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import zo3.C79405a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.o0 */
public class C69655o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyDetailUI f201039d;

    public C69655o0(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f201039d = luckyMoneyDetailUI;
    }

    public void run() {
        int f = C75044y4.m89994f(this.f201039d.getContext()) + ((C75044y4.m89989a(this.f201039d.getContext()) - this.f201039d.f199839V.getHeight()) / 2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f201039d.f199839V.getLayoutParams();
        marginLayoutParams.topMargin = f;
        this.f201039d.f199839V.setLayoutParams(marginLayoutParams);
        if (this.f201039d.f199839V.getHeight() != 0) {
            LinearLayout linearLayout = this.f201039d.f199839V;
            float height = (float) (linearLayout.getHeight() / 2);
            if (linearLayout != null) {
                linearLayout.setOutlineProvider(new C79405a(true, true, height));
            }
            if (linearLayout != null) {
                linearLayout.setClipToOutline(true);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f201039d.f199839V;
        float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 14);
        if (linearLayout2 != null) {
            linearLayout2.setOutlineProvider(new C79405a(true, true, b));
        }
        if (linearLayout2 != null) {
            linearLayout2.setClipToOutline(true);
        }
    }
}
