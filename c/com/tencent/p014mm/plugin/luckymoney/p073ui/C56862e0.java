package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.luckymoney.model.C56846h;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import de3.C75355a0;
import java.util.Iterator;
import kg3.C76577a;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.e0 */
public class C56862e0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ LuckyMoneyDetailUI f162907g;

    public C56862e0(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f162907g = luckyMoneyDetailUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        int indexOf;
        Log.m105918d("MicroMsg.LuckyMoneyDetailUI", "click tips icon");
        LuckyMoneyDetailUI luckyMoneyDetailUI = this.f162907g;
        C69158a0 a0Var = luckyMoneyDetailUI.f199859c2;
        if (a0Var != null && a0Var.f198960W != null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(luckyMoneyDetailUI.getContext()).inflate(C0966R.C0971layout.b9w, (ViewGroup) null);
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.gfg);
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.gff);
            textView.setText(luckyMoneyDetailUI.f199859c2.f198960W.f162880d);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.topMargin = C76577a.m92151b(luckyMoneyDetailUI.getContext(), 16);
            Iterator<C56846h> it = luckyMoneyDetailUI.f199859c2.f198960W.f162881e.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C56846h next = it.next();
                if (!Util.isNullOrNil(next.f162877d)) {
                    TextView textView2 = new TextView(luckyMoneyDetailUI.getContext());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(next.f162877d);
                    if (!Util.isNullOrNil(next.f162878e) && (indexOf = next.f162877d.indexOf(next.f162878e)) > 0) {
                        spannableStringBuilder.setSpan(new C72476y0(2, (C72476y0.C72477a) new C56870w(luckyMoneyDetailUI, next)), indexOf, next.f162878e.length() + indexOf, 18);
                        textView2.setClickable(true);
                        textView2.setOnTouchListener(new C75355a0(luckyMoneyDetailUI.getContext()));
                    }
                    textView2.setText(spannableStringBuilder);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(luckyMoneyDetailUI.getResources().getColor(C0966R.color.f3552xi));
                    if (!z) {
                        linearLayout.addView(textView2, marginLayoutParams);
                    } else {
                        linearLayout.addView(textView2);
                    }
                    if (z) {
                        z = false;
                    }
                }
            }
            C101218e0 e0Var = new C101218e0(luckyMoneyDetailUI.getContext(), 2, 0);
            e0Var.mo140677w(luckyMoneyDetailUI.getResources().getString(C0966R.string.f8028zq));
            e0Var.mo140676v(1);
            e0Var.f296375F = new C56871x(luckyMoneyDetailUI, e0Var);
            e0Var.mo140663j(viewGroup);
            e0Var.mo140655A();
        }
    }
}
